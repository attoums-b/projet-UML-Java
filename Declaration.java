import java.time.LocalDate;

public class Declaration {

    private String idDeclaration;
    private LocalDate dateVol;
    private String heureVol;

    private Lieu lieu;
    private ProprieteVolee proprieteVolee;

    private boolean etat;


    public Declaration(String idDeclaration, LocalDate dateVol, String heureVol,
                       Lieu lieu, ProprieteVolee proprieteVolee) {
        this.idDeclaration = idDeclaration;
        this.dateVol = dateVol;
        this.heureVol = heureVol;
        this.lieu = lieu;
        this.proprieteVolee = proprieteVolee;
        this.etat = true;//en cours
    }

    // getters
    public String getIdDeclaration() { return idDeclaration; }
    public LocalDate getDateVol() { return dateVol; }
    public String getHeureVol() { return heureVol; }
    public Lieu getLieu() { return lieu; }
    public ProprieteVolee getProprieteVolee() { return proprieteVolee; }
    public boolean getEtat() { return etat; }

    // setters (si tu veux permettre l'édition)
    public void setDateVol(LocalDate dateVol) { this.dateVol = dateVol; }
    public void setHeureVol(String heureVol) { this.heureVol = heureVol; }
    public void setLieu(Lieu lieu) { this.lieu = lieu; }
    public void setProprieteVolee(ProprieteVolee proprieteVolee) { this.proprieteVolee = proprieteVolee; }

    // actions simples
    public void marquerCommeResolue() {
        this.etat = false;
    }





    @Override
    public String toString() {
        return "Declaration " + idDeclaration +
                " | date=" + dateVol +
                " | heure=" + heureVol +
                " | lieu=" + lieu +
                " | propriete=" + proprieteVolee +
                " | etat=" + etat;
    }
}
