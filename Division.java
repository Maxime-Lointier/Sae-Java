public class Division extends Operation{

    /**
     * fait appel au constructeur par défaut de opperation
     */
    //constructeur
    public Division(){
        super();
    }

    /**
     * fait appelle au constreuctere par paramétre de oppecation
     * @param Operande1 le premier nombre
     * @param Operande2 le deuximeme nombre
     */
    public Division(Nombre Operande1, Nombre Operande2){
        super(Operande1,Operande2);
    }

    /**
     * fait appel au constructeur par copie de opperation
     * @param addition l'opperation a copier
     */
    public Division(Division division){
        super(division);
    }

    /**
     * @return retourne la valeur attendu de l'opperation
     */
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

    /**
     * @return les opperende de l'opperation
     */
    public String toString() {
        return "Division Oprande1:"+getOperande1()+" / Operande2:"+getOperande2();
    }
    
}