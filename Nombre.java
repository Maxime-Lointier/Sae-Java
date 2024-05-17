public class Nombre{
    private int valeurNombre;

    //Les constructeur
    public Nombre(){
        this.valeurNombre = 1;
    }

    public Nombre(int nombre) {
        this.valeurNombre = nombre;
    }

    public Nombre(Nombre nombre) {
        this.valeurNombre = nombre.getValeurNombre();
    }

    //Les fonction principale
    public int valeur(){
        return this.valeurNombre;
    }

    //Les get set et to string
    public int getValeurNombre() {
        return valeurNombre;
    }

    public void setValeurNombre(int nombre) {
        this.valeurNombre = nombre;
    }

    public String toString() {
        return "Nombre [valeurNombre=" + valeurNombre + "]";
    }
}