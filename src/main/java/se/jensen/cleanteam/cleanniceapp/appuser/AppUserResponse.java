package se.jensen.cleanteam.cleanniceapp.appuser;

public record AppUserResponse(
        Long id,
        String firstname,
        String lastname,
        String email,
        AppUserRole role
) {

    public static AppUserResponse from(AppUser appUser) {
        return new AppUserResponse(
                appUser.getId(),
                appUser.getFirstname(),
                appUser.getLastname(),
                appUser.getEmail(),
                appUser.getRole()

        );
    }
}
