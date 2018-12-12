package fp.daw.examen;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.util.Random;

public class Leinzo extends JPanel {
	private static Random r = new Random();
	private int [] vector = new int [900];
	private void llenarVector() {
		for (int i=0; i<vector.length; i++) {
			vector[i] = r.nextInt(600);
		}
		
	}
	public Leinzo() {
		setPreferredSize(new Dimension(900,600));
		setFocusable (true);
		addKeyListener(new KeyAdapter() {
			
		});
		
	}

	}

