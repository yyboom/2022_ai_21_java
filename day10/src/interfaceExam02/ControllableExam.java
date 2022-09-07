package interfaceExam02;

public class ControllableExam {

	public static void main(String[] args) {
		Notebook note = new Notebook();
		note.turnOn();
		Controllable[] control = { new Tv(), new Computer(), new Notebook()};
		
		for(Controllable childControl : control) {
			childControl.turnOn();
			System.out.println();
			childControl.repair();
			System.out.println();
		}
		if(control[2] instanceof Notebook) {
			((Notebook) control[2]).showNote();
		}
		if(control[0] instanceof Tv) {
			((Tv) control[0]).remoteOn();
		}
	}

}
