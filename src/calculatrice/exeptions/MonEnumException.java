package calculatrice.exeptions;


public enum MonEnumException {
    UTILISATION_DU_ZERO(1, "Utilisation d'un zero"),
    OPERATEUR_NON_VALIDE(2, "Opérateur non valide");
    
    
    private int code ;
    private String defaultMessage;

    MonEnumException(int code, String defaultMessage){
        this.code= code;
        this.defaultMessage = defaultMessage;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
    public String getDefaultMessage(){
        return defaultMessage;
    }

}
