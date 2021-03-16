import javax.swing.JOptionPane;

public class Vin {
	
	//Constantes des classes
	public static final char Rouge = '1';
	public static final char Blanc = '2';
	public static final char Rose = '3';
	
	//Attribus des classes
	private static int nbVins = 0;
	private static double totalPrix = 0;
	
	//Attributs des objets
	private String nomVin;
	private char type;
	private String origin;
	private double prix;
	

	
	//Constructeurs
	Vin (String nomVin, char type, String origin, double prix){
	
		setNomVin(nomVin);
		setType(type);
		setOrigin(origin);
		setPrix(prix);
		
		nbVins++; 
		setTotalPrix(getTotalPrix() + prix);
	} 
	//Par default
	Vin(String nomVin, String origin, double prix){
		
		setNomVin(nomVin);
		type = Rouge;
		setOrigin(origin);
		setPrix(prix);
		
		nbVins++;
		setTotalPrix(getTotalPrix() + prix);
	}
	
	
	//méthodes d'accés
	public static int getNbVins() {
		return nbVins;
	}	
	
	public static double getTotalPrix() {
		return totalPrix;
	}
	public static void setTotalPrix(double totalPrix) {
		Vin.totalPrix = totalPrix;
	}
	
	public String getNomVin() {
		return nomVin;
}
	public char getType() {
		return type;
	}
	public String getOrigin() {
		return origin;
	}
	public double getPrix() {
		return prix;
	}

	//méthodes mutation
	public void setNomVin(String nomVin) {
		
		if (nomVin != null) {
		this.nomVin = nomVin;
		}else {
			JOptionPane.showMessageDialog(null, nomVin + "n'est pas un nom valide");
		}
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	private String type(char type) {
		
		String rep;
		
		switch (type) {
		
		case Rouge:
			rep = "Rouge";
			break;
		case Blanc:
			rep = "Blanc";
			break;
		case Rose:
			rep = "Rosé";
			break;
		default:
			rep = "Type de Vin inconnu";
			break;
		}
		return rep;
		
	}

	public String toString() {
		
		return "\n\t" + nomVin + " est un vin " + type + " de " + origin + " et son prix est de " + prix + " $";
	}
	
	
}	
