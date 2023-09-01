package employe;

public class EmployeTest {

	public static void main(String[] args) {

		
		Employe employe1 = new Employe("Diogo"," Jose",10);
		
		System.out.println(" Nome :" + employe1.nome + " " + employe1.sobrenome + " " + 
		employe1.salarioMensal * 1.1);
		
	}

}
