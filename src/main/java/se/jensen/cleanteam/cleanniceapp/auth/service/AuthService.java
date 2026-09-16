package se.jensen.cleanteam.cleanniceapp.auth.service;

public class AuthService {
  /*

   *
   * NÄR registreringsmetoden tar emot e-post och lösenord:
   *
   *     KONTROLLERA att uppgifterna uppfyller valideringskraven.
   *     OM uppgifterna är ogiltiga:
   *         AVBRYT och lämna felet till felhanteringen.
   *
   *     KONTROLLERA via repository om e-postadressen redan finns.
   *     OM e-postadressen redan är registrerad:
   *         AVBRYT med ett fel för upptagen e-postadress.
   *
   *     HASHA lösenordet med säker lösenordshashning.
   *
   *     SKAPA ett nytt kundkonto med:
   *         - E-postadressen.
   *         - Det hashade lösenordet.
   *         - Rollen "Kund".
   *
   *     FÖRSÖK spara kontot via JPA-repository i en transaktion.
   *
   *     OM sparandet eller transaktionen misslyckas:
   *         LÄMNA felet till felhanteringen.
   *         RETURNERA ingen bekräftelse på lyckad registrering.
   *
   *     ANNARS:
   *         RETURNERA kundens ID och e-post till controllern.
   *         RETURNERA aldrig lösenordet eller lösenordshashen.
   *
   * SIMULERADE TESTFALL –> FÖRVÄNTAT RESULTAT:
   *
   * Giltiga uppgifter och en ledig e-postadress:
   *     Kontot sparas med rollen "Kund" och hashat lösenord.
   *
   * E-postadressen finns redan:
   *     Inget nytt konto skapas och ett fel lämnas vidare.
   *
   * Ogiltiga uppgifter:
   *     Registreringen avbryts innan något sparas.
   *
   * Databasfel:
   *     Ingen lyckad registrering bekräftas.
   */

  /*
   * En användare ska kunna byta lösenord som inloggad genom att
   * ta emot en Dto med formulär som innehåller
   * -  sitt nuvarande lösenord
   * - skriva det nya två gånger för att bekräfta
   *
   * backend ska verifiera det gamla, verifiera de nya lösenordet sedan hasha och spara i databasen */


}
