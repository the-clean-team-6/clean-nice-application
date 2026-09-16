package se.jensen.cleanteam.cleanniceapp.appuser;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUserController {
    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/Appuser")
    @ResponseStatus(HttpStatus.CREATED)
    public AppUserResponse create(CreateAppUserRequest request) {
        return appUserService.create(request);
    }
}
