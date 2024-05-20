public class Soustraction extends Operation{
    
    public Soustraction(Nombre a, Nombre b){
        super(a,b);
    }

    public int valeur(){
        return (getOperande1().valeur() - getOperande2().valeur());
    }
    
    public String toString(){
        return "Soustraction Oprande1:"+getOperande1()+" + Operande2:"+getOperande2();
    }
}