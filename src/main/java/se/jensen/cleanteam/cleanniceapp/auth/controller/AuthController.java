package se.jensen.cleanteam.cleanniceapp.auth.controller;
// Endpoint: POST /api/auth/register

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
            */

}
