package se.jensen.cleanteam.cleanniceapp.auth;

public class RegistrationErrorHandler {

    /*
     * NÄR registreringsendpointen får en förfrågan:
     *
     *     KONTROLLERA och räkna anrop per klient/IP
     *     inom projektets bestämda tidsfönster.
     *     RÄKNA även försök som senare underkänns.
     *
     *     OM gränsen för antal anrop överskrids:
     *         RETURNERA 429 med information om väntetid.
     *         AVBRYT innan registreringsservicen anropas.
     *
     *     OM förfrågans innehåll överskrider storleksgränsen:
     *         RETURNERA 413 och avbryt.
     *
     *     OM innehållet saknas eller inte kan läsas som en DTO:
     *         RETURNERA 400 med ett begripligt felmeddelande.
     *         AVBRYT.
     *
     *     VALIDERA DTO:n på servern:
     *         Kontrollera obligatoriska fält.
     *         Kontrollera e-postadressens format.
     *         Kontrollera lösenordet enligt projektets regler.
     *         Kontrollera tillåtna fältlängder och datatyper.
     *
     *     OM valideringen misslyckas:
     *         RETURNERA 400 med fel för berörda fält.
     *         AVBRYT innan registreringsservicen anropas.
     *
     *     FÖRSÖK genomföra registreringen via servicen.
     *
     *     VID upptagen e-postadress:
     *         RETURNERA 409 med ett fel för upptagen e-post.
     *         Detta omfattar även brott mot databasens
     *         unikhetskrav för just e-postadressen.
     *
     *     VID oväntat fel:
     *         LOGGA felet internt utan lösenord eller tokens.
     *         RETURNERA 500 med ett allmänt felmeddelande.
     *
     *     VID lyckad registrering:
     *         LÅT controllern returnera sitt vanliga lyckade svar.
     *
     *     SKICKA aldrig SQL, stacktrace eller lösenord i felsvar.
     *
     * SIMULERADE TESTFALL –> FÖRVÄNTAT RESULTAT:
     *
     * Ogiltig DTO: 400 och registreringsservicen anropas inte.
     * För många försök: 429 innan registreringen genomförs.
     * För stort innehåll: 413 innan DTO:n behandlas.
     * Upptagen e-post: 409 med ett begripligt fel.
     * Oväntat fel: 500 utan interna tekniska detaljer.
     */
}
