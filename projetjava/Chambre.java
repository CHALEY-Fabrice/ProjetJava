public class Chambre extends Local{

    private String dimension;

    public Chambre() {
        type = "chambre";
    }

    public Chambre(String dimension) {
        type = "chambre";
        this.setDimension(dimension);
    }

    public Chambre(String localisation, int prix, int tauxLoc, String dimension) {
        super(localisation, prix, tauxLoc);
        type = "chambre";
        this.setDimension(dimension);
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Chambre dimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    public void montant(int cout) {
        
            cout = prix += tauxLoc*prix;
        
    }

    @Override
    public String afficher()
    {
        return super.detail() + "\n dimension : " + getDimension();
    }

    
}