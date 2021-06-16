public class Bankkonto {
    public static void main(String[] args) {
        // settings
        String myKontoNumber = "007";
        int myDispoLimit = 100;
        System.out.println(String.format("init Konto K.Nr: %s with Dispolimit: %d", myKontoNumber, myDispoLimit));
        
        // create Testkonto
        Konto testKonto = new Konto(myKontoNumber);
        testKonto.setDispoLimit(myDispoLimit);

        // check if Balance is Empty
        System.out.println("KontoStand: " + testKonto.getKontoStand() + "€");
        System.out.println("Konto ist " + (testKonto.kontoIstLeer() ? "leer" : "nicht leer")); 
        
        float value = 20.50f; 
        einzahlen(value, testKonto);

        value = 10;
        abheben(value, testKonto);
        
        value = 50.90f;
        abheben(value, testKonto);

        value = 70.90f;
        abheben(value, testKonto);
        
        value = -5.50f;
        einzahlen(value, testKonto);

        value = 42f;
        einzahlen(value, testKonto);
    }

    /** helper mehtod for Konto.einzahlen() */
    private static void einzahlen(float value, Konto konto){
        try {
            System.out.println(String.format("Zahle %s€ in das Konto ein...", value));

            boolean result = konto.einzahlen(value);
            String resultString = result ? "erfolgreich" : "nicht erfolgreich";

            System.out.println(String.format("Dieser Vorgang war %s", resultString));
            System.out.println("Neuer Kontostand: " + konto.getKontoStand() + "€");
        } catch (Exception e) {
            // handle konto exception
        }
    }

    /** helper method for Konto.auszahlung() */
    private static void abheben(float value, Konto konto){
        try {
            System.out.println(String.format("Hebe %s€ vom Konto ab...", value));
            
            boolean result = konto.auszahlung(value);
            String resultString = result ? "erfolgreich" : "nicht erfolgreich";

            System.out.println(String.format("Dieser Vorgang war %s", resultString));
            System.out.println("Neuer Kontostand: " + konto.getKontoStand() + "€");
        } catch (Exception e) {
            // handle konto exception
        }
    }
}