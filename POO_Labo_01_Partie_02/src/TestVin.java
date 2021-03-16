import javax.swing.*;

public class TestVin {

	public static void main(String[] args) {
		
		JTextArea sortie = new JTextArea();
		
		String resultats = "";
		
		Vin MiamMiam = new Vin("MiamMiam", Vin.Blanc, "Espagne", 8.95);
		Vin Delicieux = new Vin("Délicieux", "France", 14.50);
		Vin Mystere = new Vin("Mystère", Vin.Rose, "Californie", 10);
		
		resultats = MiamMiam.toString() + Delicieux.toString() + Mystere.toString();
		
		sortie.append("Voici les " + Vin.getNbVins() + " vins" +
						"\nLe prix total des vins est de " + Vin.getTotalPrix() + "$" + resultats);
		
		
		MiamMiam.setPrix(MiamMiam.getPrix() + 2);
		Delicieux.setPrix(23);
		Delicieux.setOrigin("Italie");
		Mystere.setNomVin("Vino Verde");
		Mystere.setType(Vin.Blanc);
		Mystere.setOrigin(MiamMiam.getOrigin());
		
		Vin Erablier = new Vin("L'érablière", Vin.Rouge, "Québec", 15);
		
		resultats = MiamMiam.toString() + Delicieux.toString() + Mystere.toString() + Erablier.toString();
		
		sortie.append("\nVoici les " + Vin.getNbVins() + " vins" +
				"\nLe prix total des vins est de " + Vin.getTotalPrix() + "$" + resultats);
		
		JOptionPane.showMessageDialog(null, sortie, "Résultats obtenus", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}