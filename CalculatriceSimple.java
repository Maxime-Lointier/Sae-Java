public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre six = new Nombre(6) ;  
        Nombre dix = new Nombre(10) ;  
        Operation s = new Soustraction(dix,six) ;  
        System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4 
        Operation a = new Adition(dix,six);
        System.out.println(a + " = " + a.valeur()) ; //doit afficher (10 + 6) = 16
        Operation m = new Multiplication(dix,six);
        System.out.println(m + " = " + m.valeur()) ; //doit afficher (10 * 6) = 60
        Operation d = new Division(dix,six);
        System.out.println(d + " = " + d.valeur()) ; //doit afficher (10/6) = 1.66 




    }
}
