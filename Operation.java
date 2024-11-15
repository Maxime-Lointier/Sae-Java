abstract class  Operation{
//variables
private Nombre Operande1;
private Nombre Operande2;

    /**
     * c'est le constructeur par défaut.
     * il ne néssecite aucun paramétre
     * il crée une opperation entre un objet nombre 1 et un objet nombre 2
     */
    //Constructeur
    public Operation(){
        this.Operande1 = new Nombre(1);
        this.Operande2 = new Nombre(2);
    }

    /**
     * le constructeru par paramétre
     * @param Operande1 la premier oppérende
     * @param Operande2 la deuxieme oppérende
     */
    public Operation(Nombre Operande1, Nombre Operande2){
        this.Operande1 = Operande1;
        this.Operande2 = Operande2;
    }

    /**
     * le constructeru par copie
     * @param operation l'opperation que l'ont veut copié
     */
    public Operation(Operation operation){
        this.Operande1 = operation.getOperande1();
        this.Operande2 = operation.getOperande2();
    }
    //Méthodes

    /**
     * @return retourne la valeur de la premier oppérende
     */
    public Nombre getOperande1(){
         return Operande1;
    }

    /**
     * @return retourne la valeur de la deuxieme oppérende
     */
    public Nombre getOperande2(){
        return Operande2;
    }

    /**
     * @return retourne le résulta attendu de l'opperation
     */
    public abstract  int valeur();

    
}