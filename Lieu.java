public class Lieu {
    private String numeroRue;
    private String rue;
    private String ville;
    private String codePostal;

    public Lieu(String numeroRue, String rue, String ville, String codePostal) {
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    // getters
    public String getNumeroRue() { return numeroRue; }
    public String getRue() { return rue; }
    public String getVille() { return ville; }
    public String getCodePostal() { return codePostal; }

    // setters
    public void setNumeroRue(String numeroRue) { this.numeroRue = numeroRue; }
    public void setRue(String rue) { this.rue = rue; }
    public void setVille(String ville) { this.ville = ville; } // ✅ manquant
    public void setCodePostal(String codePostal) { this.codePostal = codePostal; }

    @Override
    public String toString() { // ✅ override
        return numeroRue + " " + rue + ", " + codePostal + " " + ville;
    }
}
