
package shapes;


public class Retangulo extends TwoD {
    
	Retangulo(double B, double A) {
    	super(B, A);
    }
	
    void AreaRetangulo () {
        System.out.println("Area do Retangulo:  "  + getBase() * getAltura());
    }   
}
