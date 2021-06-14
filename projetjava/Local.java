public class Local implements IAffiche {
    private static int nombreLocal;
    private final int FORMAT = 4;
    private String ref; 
    protected String localisation;
    protected int prix;
    protected int tauxLoc;
    protected String type;

    static Appartement appartement = new Appartement();

    public Appartement getAppartement() {
        return appartement;
    }

    public void setAppartement(Appartement appartement) {
        Local.appartement = appartement;
        appartement.addLocal(this);
    }

    private String generateRef(){
        String nombreZero = "";
        String nombreLocalString = String.valueOf(++nombreLocal);
        for(int i=1; i<=(FORMAT - nombreLocalString.length()); i++)
        {
            nombreZero += "0";
        }
        return nombreZero + nombreLocalString;
    }

    public String getRef(){
        return ref;
    }

    public void setRef(String ref){
        this.ref = ref;
    }
    
    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getTauxLoc() {
        return tauxLoc;
    }

    public void setTauxLoc(int tauxLoc) {
        this.tauxLoc = tauxLoc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public Local() {
        ref = generateRef();
    }

    public Local(String localisation, int prix, int tauxLoc) {
        ref = generateRef();
        this.setLocalisation(localisation);
        this.setPrix(prix);
        this.setTauxLoc(tauxLoc);
    }

    public String detail(){
        return "\n type : " + getType()
            +"\n reference du local : " + getRef() 
            + "\n localisation : " + getLocalisation()
            + "\n prix : " + getPrix()
            + "\n tauxLoc : " + getTauxLoc();
    }

    @Override
    public String afficher(){
        return  detail();
    }
}