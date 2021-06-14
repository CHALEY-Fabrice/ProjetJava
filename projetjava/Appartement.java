public class Appartement extends Local{
    private int nbrePiece;

    private Local[] tableLocal = new Local[5];

    public Appartement(){
        type = "appartement";
    }

    public Appartement(int nbrePiece){
        this.setNbrePiece(nbrePiece);
    }

    public Appartement(String localisation, int prix, int tauxLoc, int nbrePiece) {
        super(localisation, prix, tauxLoc);
        type = "appartement";
        this.setNbrePiece(nbrePiece);
    }

    private int nombreDeLocal;

    public int getNombreDeLocal()
    {
        return nombreDeLocal;
    }

    
    public Local[] getTableLocal() {
        return tableLocal;
    }

    public void addLocal( Local local) {
        tableLocal[nombreDeLocal] = local;
        nombreDeLocal++;
    }


    public int getNbrePiece() {
        return nbrePiece;
    }

    public void setNbrePiece(int nbrePiece) {
        this.nbrePiece = nbrePiece;
    }

    public void montant(int cout) {
            
        cout = prix += tauxLoc*prix;
    }

    @Override
    public String afficher(){
        return "\n nombre de pièce : " + getNbrePiece();
    }
}