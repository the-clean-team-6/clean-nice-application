package se.jensen.cleanteam.cleanniceapp.auth.error;

public class RegistrationErrorMessages {
    /*

     * NÄR valideringen eller backend ger ett registreringsfel:
     *
     *     OM felet gäller saknad eller ogiltig e-post:
     *         VISA "Ange en giltig e-postadress."
     *
     *     ANNARS OM felet gäller saknat lösenord:
     *         VISA "Ange ett lösenord."
     *
     *     ANNARS OM felet gäller för kort lösenord:
     *         HÄMTA MINSTA_LANGD från projektets valideringsregler.
     *  VISA "Lösenordet måste innehålla minst "
     *              + MINSTA_LANGD + " tecken."
     *
     *     ANNARS OM backend anger att e-postadressen redan finns:
     *         VISA "E-postadressen är redan registrerad."
     *         Detta gäller även om backend upptäckte dubbletten
     *         genom databasens unikhetskrav för e-post.
     *
     *     ANNARS:
     *         VISA "Registreringen kunde inte genomföras.
     *               Försök igen senare."
     *
     *     VISA fältspecifika fel nära respektive fält.
     *     VISA allmänna fel vid formuläret.
     *     VISA aldrig SQL, stacktrace eller interna databasfel.
     *     RENSA tidigare felmeddelanden inför ett nytt försök.
     *
     * SIMULERADE TESTFALL –> FÖRVÄNTAT RESULTAT:
     *
     * Ogiltig e-post:
     *     Meddelandet "Ange en giltig e-postadress." visas.
     *
     * För kort lösenord:
     *     Meddelandet visar projektets minsta tillåtna längd.
     *
     * E-postadressen finns redan:
     *     Meddelandet "E-postadressen är redan registrerad." visas.
     *
     * Oväntat databasfel:
     *     Ett allmänt felmeddelande visas utan tekniska detaljer.
     */
}
