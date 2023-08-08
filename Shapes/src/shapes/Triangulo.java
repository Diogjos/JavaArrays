
package shapes;


public class Triangulo extends TwoD {    
    
    Triangulo(double B, double A) {
    	super(B, A);
    }
	//super() só para subclasses que chaman superclasses
    void AreaTriangulo () {
        System.out.println("Área é:  " + (getBase() * getAltura())  / 2);
      
    }

    
}
