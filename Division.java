public class Division extends Operation{

    //constructeur
    public Division(){
        super();
    }

    public Division(Nombre Operande1, Nombre Operande2){
        super(Operande1,Operande2);
    }

    public Division(Division division){
        super(division);
    }

    //adition le string des deux operande
    public int valeur(){
        try{
            return this.getOperande1().valeur() / this.getOperande2().valeur();
        }

        catch(ArithmeticException e){
           System.out.println("erreure changement du dénominateur de 0 à 1");
           return this.getOperande1().valeur() / 1;
        }
    }

    
    public String toString() {
        return "Oprande1:"+getOperande1()+" / Operande2:"+getOperande2();
    }
    
}