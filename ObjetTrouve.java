public class ObjetTrouve {
    private String type;
    private String couleur;
    private String dateTrouvee;
    private String description;


    public ObjetTrouve(String type, String couleur , String dateTrouve,String description){
        this.type = type ;
        this.couleur = couleur ;
        this.dateTrouvee = dateTrouve;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getDateTrouvee() {
        return dateTrouvee;
    }

}
