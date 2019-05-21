package calculatrice.exeptions;

public class MonException extends Exception{
   
    int code ;
    private String defaultMessage;
    
    public MonException(){
        super();
    }
    public MonException(int code, String defaultMessage){
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
    
    public void setDefaultMessage(String defaultMessage){
        this.defaultMessage = defaultMessage;
    }
}
