//package corretto
package it.marconicivitavecchia.as2018_19.c5Ainf.Verifica;

import javax.swing.*;

public class Verifica extends JFrame {
	
	public Verifica() {
		
		super("FORMULA1 PASSION");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>FORMULA1 PASSION</h1>");

		// Create div for table
		sb.append("<div style='display:table'>");

		// create the first row
		sb.append("<div style='display:table-row'>");

		// create the Pilota cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Hamiton.L");
		sb.append("</div>");
		// create the Punteggio cell
		sb.append("<div style='display:table-cell'>");
		sb.append("358");
		sb.append("</div>");

		// close first row
		sb.append("</div>");

		// create the second row
		sb.append("<div style='display:table-row'>");

		// create the Pilota cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Vettel.S");
		sb.append("</div>");
		// create the Punteggio cell
		sb.append("<div style='display:table-cell'>");
		sb.append("294");
		sb.append("</div>");

		// close third row
		sb.append("</div>");

		// create the second row
		sb.append("<div style='display:table-row'>");

		// create the Pilota cell
		sb.append("<div style='display:table-cell'>");
		sb.append("Raikkonen.K");
		sb.append("</div>");
		// create the Punteggio cell
		sb.append("<div style='display:table-cell'>");
		sb.append("236");
		sb.append("</div>");

		// close third row
		sb.append("</div>");

		// close div for table
		sb.append("</div>");

		sb.append("</html>");

		String str = sb.toString();

		super.add(new JLabel(str));

		super.setSize(800,400);
		super.setVisible(true);

		System.out.println("Monolithics application from 5Ainf, TEST");
	}

	public static void main(String[] args) {
		Verifica main = new Verifica();
	}
}


