package calculatrice.exeptions;
public class Exceptions {
    

    
    public static void main(String[] args){
        int var =0;
    }
    
    
    public static void methodeDeclenchement(double var) throws MonException{
        if (var==0)
            throw new MonException(1, MonEnumException.UTILISATION_DU_ZERO.getDefaultMessage());
    }
    
        public static void methodeDeclenchement(String var) throws MonException{
            if(!var.matches("[0-9]+\\.?[0-9]*"))
            throw new MonException(2, MonEnumException.OPERATEUR_NON_VALIDE.getDefaultMessage());
    }
}
