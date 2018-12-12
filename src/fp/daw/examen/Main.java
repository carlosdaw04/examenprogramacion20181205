package fp.daw.examen;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	
	public Main() {
		setTitle("Metodos de ordenacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cunado el usuario pulse la x y se cierre la ventana que tambien finalce el programa
		getContentPane().add(new Leinzo());
		pack();
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
