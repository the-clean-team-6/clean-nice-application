package se.jensen.cleanteam.cleanniceapp.auth.controller;
// Endpoint: POST /api/auth/register
// Endpoint: POST /api/auth/forgot-password
// Endpoint: POST /api/auth/reset-password

public class AuthController {
    /*
            *
            * NÄR en registreringsförfrågan kommer in:
            *     TA EMOT kundens e-postadress och lösenord.

            *     LÅT valideringen kontrollera uppgifterna.
            *
            *     OM uppgifterna är ogiltiga:
            *         RETURNERA status 400 med valideringsfel.
            *         AVBRYT.

            *     ANROPA servicens registreringsmetod.

            *     OM registreringen lyckas:
            *         RETURNERA status 201 med en bekräftelse.
              SKICKA INTE tillbaka lösenordet.
            *
            *     ANNARS:
            *         LÅT felhanteringen skapa ett lämpligt felsvar.
            *
            *
            * SIMULERADE TESTFALL –> FÖRVÄNTAT RESULTAT:
            *
            * Giltiga uppgifter och lyckad registrering:
            *     Servicen anropas och svaret blir 201.
            *
            * Ogiltiga uppgifter:
            *     Svaret blir 400 och servicen anropas inte.
            *
            * ---------------------------------------------------
            *
            * NÄR en förfrågan om glömt lösenord kommer in:
            *     TA EMOT användarens e-postadress.
            *
            *     SÖK efter e-postadressen i databasen.
            *
            *     OM uppgifterna är ogiltiga:
            *     RETURNERA status 400 med valideringsfel.
            *     AVBRYT.
            *
            *     OM e-postadressen finns:
            *         SKAPA en unik och tidsbegränsad återställnings-token.
            *         SKICKA ett mejl med länken till användaren.
            *         RETURNERA status 200 OK med bekräftelse.
            *
            *    ANNARS:
            *        RETURNERA status 200 OK utan att avslöja om e-postadressen finns.
            *
            * ---------------------------------------------------
            *
            * NÄR en förfrågan om att återställa lösenord med token kommer in:
            *     TA EMOT token och det nya lösenordet.
            *
            *     KONTROLLERA om token är giltig och inte har gått ut.
            *
            *     OM token är ogiltig eller utgången:
            *       RETURNERA status 400 Bad Request.
            *       AVBRYT.
            *
            *     HASHA det nya lösenordet med PasswordEncoder.
            *     SPARA det nya lösenordet påkopplat på rätt användare.
            *     MARKERA token som använd (eller ta bort den).
            *
            *     RETURNERA status 200 OK när lösenordet har ändrats.
            */

}
