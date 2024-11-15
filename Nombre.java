/**
 * la classe qui definit les nombre
 */
public class Nombre{
    private int valeurNombre;

    /**
     * c'est le constructeur par défaut.
     * il ne néssecite aucun paramétre
     * il crée un nombre égale a 1
     */
    //Les constructeur
    public Nombre(){
        this.valeurNombre = 1;
    }

    /**
     * c'est le constructeur qui prend en parametre un nombre et crée un objet nombre de valeur égale au paramétre
     * @param nombre : la valeur que vous shouaiter
     */
    public Nombre(int nombre) {
        this.valeurNombre = nombre;
    }

    /**
     * c'est un constructeur par copie il pcopie l'objet passer en paramétre
     * @param nombre : l'objet déja construit
     */
    public Nombre(Nombre nombre) {
        this.valeurNombre = nombre.getValeurNombre();
    }

    /**
     * @return la valeur numerique de l'objet
     */
    //Les fonction principale
    public int valeur(){
        return this.valeurNombre;
    }

    /**
     * @return la même que valeur()
     */
    //Les get set et to string
    public int getValeurNombre() {
        return valeurNombre;
    }

    /**
     * permet de modifié la valeur de l'objet
     * @param nombre : la nouvelle valeur shouaither
     */
    public void setValeurNombre(int nombre) {
        this.valeurNombre = nombre;
    }

    /**
     * @return affiche toute les variable de l'objet
     */
    public String toString() {
        return "Nombre [valeurNombre=" + valeurNombre + "]";
    }
}