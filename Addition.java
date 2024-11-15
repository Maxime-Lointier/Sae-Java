public class Addition extends Operation{

    /**
     * fait appel au constructeur par défaut de opperation
     */
    //constructeur
    public Addition(){
        super();
    }

    /**
     * fait appelle au constreuctere par paramétre de oppecation
     * @param Operande1 le premier nombre
     * @param Operande2 le deuximeme nombre
     */
    public Addition(Nombre Operande1, Nombre Operande2){
        super(Operande1,Operande2);
    }

    /**
     * fait appel au constructeur par copie de opperation
     * @param addition l'opperation a copier
     */
    public Addition(Addition addition){
        super(addition);
    }

    /**
     * @return retourne la valeur attendu de l'opperation
     */
    //adition le string des deux operande
    public int valeur(){
        return this.getOperande1().valeur() + this.getOperande2().valeur();
    }

    /**
     * @return les opperende de l'opperation
     */
    public String toString() {
        return "Addition Oprande1:"+getOperande1()+" + Operande2:"+getOperande2();
    }
}
