public class Client extends Reservation{

    private int nci;
    private String nomComplet;
    private int tel;
    private String adresse;
    private String email;

    public Client() {
    }

    public int getNci() {
        return this.nci;
    }

    public void setNci(int nci) {
        this.nci = nci;
    }

    public String getNomComplet() {
        return this.nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String afficher() {
        return "\n nci : " + getNci()
                +"\n nom complet : " + getNomComplet() 
                + "\n téléphone : " + getTel()
                + "\n adresse : " + getAdresse()
                + "\n email : " + getEmail();
    }
    
}