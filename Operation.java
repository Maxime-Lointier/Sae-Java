abstract class  Operation{
//variables
private Nombre Operande1;
private Nombre Operande2;

    //Constructeur
    public Operation(){
        this.Operande1 = new Nombre(1);
        this.Operande2 = new Nombre(2);
    }
    public Operation(Nombre Operande1, Nombre Operande2){
        this.Operande1 = Operande1;
        this.Operande2 = Operande2;
    }
    public Operation(Operation operation){
        this.Operande1 = operation.getOperande1();
        this.Operande2 = operation.getOperande2();
    }
    //Méthodes

    public Nombre getOperande1(){
         return Operande1;
    }

    public Nombre getOperande2(){
        return Operande2;
    }

    public abstract  int valeur();

    
}