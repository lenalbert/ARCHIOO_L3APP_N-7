package calculatrice;

public class Application {

    public static void main(String[] args) {
        CalculatorConf.init();
        IHM ihm = new LigneCommande();
        ihm.lancer();
    }
    
}


