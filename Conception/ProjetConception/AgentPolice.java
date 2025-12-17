package ProjetConception;

public class AgentPolice extends Utilisateur {

	    private String login;
	    private String motDePasse;

	    public AgentPolice(String cni, String nom, String prenom,
	                          String adresse, String telephone,
	                          String login, String motDePasse) {
	        super(cni, nom, prenom, adresse, telephone);
	        this.login = login;
	        this.motDePasse = motDePasse;
	    }

	    public boolean authentifier(String login, String mdp) {
	        return this.login.equals(login) && this.motDePasse.equals(mdp);
	        
	    }
	}

