public class Soustraction extends Operation{
    
    public Soustraction(Nombre a, Nombre b){
        super(a,b);
    }
    public int valeur(){
        return (getOperande1().valeur() - getOperande2().valeur());
}
}