import java.util.*;

public class SystemeObjetTrouves {
    private List<Observeur> obs =  new ArrayList<>();
    private List<ObjetTrouve> nouvObj = new ArrayList<>();

    public void attacher(Observeur o){
        obs.add(o);
    }

    public void detacher(Observeur o){
        obs.remove(o);
    }

    public void notifierVictimes(ObjetTrouve obj){
        for(Observeur o: obs){
            o.actualiser(obj);
        }
    }
    public void enregistrerObjetTrouve(ObjetTrouve obj){
        //on ajoute l'objet trouvé
        nouvObj.add(obj);
        System.out.println("Nouvel objet enregistré!! \n"
        +obj.getType() + "\n"
        +obj.getCouleur()+ "\n"
        +obj.getDateTrouvee());
        // une fois l'objet trouvé , on notifie les victimes
        notifierVictimes(obj);

    }
}
