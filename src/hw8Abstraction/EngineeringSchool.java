package hw8Abstraction;
/*Create another Abstract Class EngineeringSchool,
 * create 2 methods inside the Abstract Class 
 * - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. 
 * Print something inside the non abstract or implemented method .*/
public abstract class EngineeringSchool {
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("This is computerLab non abstrct void tipe method implemented");
		
	}

}
