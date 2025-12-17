public class ProprieteVolee {
    private String typePropriete; // "Vélo" ou "Véhicule à moteur"
    private String marque;
    private String description;

    public ProprieteVolee(String typePropriete, String marque, String description) {
        this.typePropriete = typePropriete;
        this.marque = marque;
        this.description = description;
    }

    // getters
    public String getTypePropriete() { return typePropriete; }
    public String getMarque() { return marque; }
    public String getDescription() { return description; }

    // setters
    public void setTypePropriete(String typePropriete) { this.typePropriete = typePropriete; }
    public void setMarque(String marque) { this.marque = marque; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return typePropriete + " " + marque + " - " + description;
    }
}
