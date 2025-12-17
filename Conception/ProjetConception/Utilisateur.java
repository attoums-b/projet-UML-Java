package ProjetConception;

abstract class Utilisateur {
	protected String cin;
	protected String nom;
	protected String prenom;
	protected String 	adresse;
	protected String telephone;
	
	  public Utilisateur(String cni, String nom, String prenom, String adresse, String telephone) {
	        this.cin= cni;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.adresse = adresse;
	        this.telephone = telephone;
	        }
	public void  creerDeclaration() {};
	public  void editerDeclaration() {};
	
}

