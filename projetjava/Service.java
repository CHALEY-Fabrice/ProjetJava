public class Service extends Local{

    private final int TAILLE = 10;
    private int nombreLocalReel;
    private int nombreAppartementReel;

    Local[] tableauLocal = new Local[TAILLE];
    Appartement[] tableauAppartement = new Appartement[TAILLE];
//@Override
    public void createLocal(Local local) 
    {
        if (nombreLocalReel < TAILLE) {
            tableauLocal[nombreLocalReel] = local;
            nombreLocalReel++;
        } else {
            System.out.println("Table de local plein ");
        }    
    }
//@Override
    public void createAppartement(Appartement appartement){
        if (nombreAppartementReel < TAILLE) {
            tableauAppartement[nombreAppartementReel] = appartement;
            nombreAppartementReel++;
        } else {
            System.out.println("Table d'appartement plein ");
        }
    }

    public Object searchAppartement(int nbrePiece){
        for (Appartement appartement : tableauAppartement) {
            if (appartement != null) {
                if (appartement.getNbrePiece() == nbrePiece) {
                    return nbrePiece;
                }
            }
        }
        return null;
    }

    public Local searchLocal(String refLocal){
        for (Local local : tableauLocal) {
            if ( local != null) {
                if (local.getRef().compareTo(refLocal) == 0) {
                    return local;
                }
            
            }  
        }
        return null;
    }

    public void listerLocal(Local []tableauLocals) {
        for(Local local:tableauLocals){
            if (local != null) {
                System.out.println(local.afficher());
            }
        }
    }
}