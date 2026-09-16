package se.jensen.cleanteam.cleanniceapp.appuser;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Transactional
    public AppUserResponse create(CreateAppUserRequest request) {
        if (appUserRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("Email already in use");
        }

        AppUser appUser = new AppUser(
                request.firstname(),
                request.lastname(),
                request.email(),
                request.password(),
                request.role()
        );

        AppUser savedAppUser = appUserRepository.save(appUser);

        return AppUserResponse.from(savedAppUser);
    }
}
