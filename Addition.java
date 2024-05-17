public class Addition extends Operation{

    //constructeur
    public Addition(){
        super();
    }

    public Addition(Nombre Operande1, Nombre Operande2){
        super(Operande1,Operande2);
    }

    public Addition(Addition addition){
        super(addition);
    }

    //adition le string des deux operande
    public int valeur(){
        return this.getOperande1().valeur() + this.getOperande2().valeur();
    }

    
    public String toString() {
        return "Oprande1:"+getOperande1()+" + Operande2:"+getOperande2();
    }
}
