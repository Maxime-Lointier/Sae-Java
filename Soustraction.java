public class Soustraction extends Operation{
    
    /**
     * fait appelle au constreuctere par paramétre de oppecation
     * @param Operande1 le premier nombre
     * @param Operande2 le deuximeme nombre
     */
    public Soustraction(Nombre a, Nombre b){
        super(a,b);
    }

    /**
     * @return retourne la valeur attendu de l'opperation
     */
    public int valeur(){
        return (getOperande1().valeur() - getOperande2().valeur());
    }
    
    /**
     * @return les opperende de l'opperation
     */
    public String toString(){
        return "Soustraction Oprande1:"+getOperande1()+" - Operande2:"+getOperande2();
    }
}