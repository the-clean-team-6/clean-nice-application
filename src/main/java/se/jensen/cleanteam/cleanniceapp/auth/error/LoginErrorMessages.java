package se.jensen.cleanteam.cleanniceapp.auth.error;

public class LoginErrorMessages {
    /*
     * NÄR ett nytt inloggningsförsök börjar:
     *     TA BORT tidigare felmeddelande.
     *
     * NÄR svaret från backend kommer:
     *
     *     OM HTTP-status är 401:
     *         VISA följande fasta meddelande vid formuläret:
     *
     *         "Inloggningen misslyckades.
     *          Kontrollera dina uppgifter och försök igen."
     *
     *         ANVÄND exakt samma meddelande oavsett orsaken.
     *         AVSLÖJA inte om e-postadressen eller lösenordet är fel.
     *         AVSLÖJA inte om kontot finns.
     *         VISA ingen mer detaljerad feltext från backend.
     *         LÅT användaren stanna kvar och försöka igen.
     *
     *     ANNARS:
     *         LÅT det befintliga inloggningsflödet hantera svaret.
     *
     * SIMULERADE TESTFALL –> FÖRVÄNTAT RESULTAT:
     *
     * Fel lösenord och backend svarar 401:
     *     Det fasta, generella felmeddelandet visas.
     *
     * E-postadressen finns inte och backend svarar 401:
     *     Exakt samma felmeddelande visas.
     *
     * Backend skickar olika detaljerade feltexter med status 401:
     *     Gränssnittet visar alltid det fasta felmeddelandet.
     *
     * Användaren gör ett nytt inloggningsförsök:
     *     Det tidigare felmeddelandet tas bort.
     */
}
