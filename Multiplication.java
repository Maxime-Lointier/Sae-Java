public class Multiplication extends Operation{

public Multiplication(Nombre a, Nombre b){
    super(a,b);
}
public int valeur(){
    return (getOperande1().valeur() * getOperande2().valeur());
}
}