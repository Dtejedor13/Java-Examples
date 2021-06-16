public class Konto {
    // attributes
    private float _kontoStand;
    private String _kontoNummer;
    private float _dispoLimit;

    // contructor
    public Konto(String kontoNummer) {
        _kontoNummer = kontoNummer;
        // start values
        _kontoStand = 0;
        _dispoLimit = 0;
    }

    /** return true or false if value > 0 exepts float */
    public boolean einzahlen(Number value){
    float einzahlung = 0;
    try {
        einzahlung = (float)value;
          // try to cast value to float
          // check if parameters type is from type float 
      } catch (Exception e) {
        throw new IllegalArgumentException("parameters type is from unsuported type or value is null");
      }

        if(einzahlung > 0) {
            _kontoStand = _kontoStand + einzahlung; 
            return true;
        }
        else
            return false; // return false if value is less or equal 0
        
    }

    /** return true or false if take off was successful */
    public Boolean auszahlung(Number value){
	// check if parameters type is from type float
        float auszahlung = 0;
        try {
            auszahlung = (float)value;
            // try to cast value to float
            // check if parameters type is from type float 
        } catch (Exception e) {
            throw new IllegalArgumentException("parameters type is from unsuported type or value is null");
        }
        
        if(_kontoStand + _dispoLimit >= auszahlung && auszahlung > 0){ // check dispolimit and kontostand if this transaktion is valid
            _kontoStand = _kontoStand - auszahlung;
            return true; // return successfull result
        }
        else
            return false; // else return false is transaktion is invalid     
    }

    // OOP object oriented programming

    /** OOP read _kontoStand var */
    public double getKontoStand(){
        return (Math.round(_kontoStand * 100.0) / 100.0); // round to 
    }

    /**OOP set _dispoLimit var and return if it was successful*/
    public Boolean setDispoLimit(float value){
        if(value < 0) return false;
        _dispoLimit = value;

        return true;
    }
    
    /** check if _kontoStand var > 0 */
    public Boolean kontoIstLeer(){
        return ( _kontoStand <= 0);
    }

    /**OOP read kontoNummer */
    public String getKontoNummer(){
        return _kontoNummer;
    }

}
