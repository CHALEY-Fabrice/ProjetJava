
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
        Service service = new Service();
        int choix;
        do{
            choix = menu();
            switch(choix)
            {
            case 1:
                    
                    System.out.print("Entrer la localisation : ");
                    String localisation = scanner.nextLine();

                    System.out.print("Entrer le prix : ");
                    String prix = scanner.nextLine();

                    System.out.print("Entrer le tauxLoc : ");
                    String tauxLoc = scanner.nextLine();

                String typeLocal ;
                int typeLocalInt ;
                do{
                    System.out.println("Quel type de local tu ajoutes : "
                            + "\n 1- Appartement" 
                            + "\n 2- Chambre");
                    typeLocal = scanner.nextLine();
                    typeLocalInt = Integer.parseInt(typeLocal);

                } while (typeLocalInt != 2 && typeLocalInt != 1);
                Local local;
                if(typeLocalInt == 1 ){
                    
                    System.out.print("Entrer le nombre de piece : ");
                    String nbrePiece = scanner.nextLine();
                    local = new Appartement(localisation, Integer.parseInt(prix), Integer.parseInt(tauxLoc), Integer.parseInt(nbrePiece));

                }else{

                    System.out.print("Entrer les dimensions : ");
                    String dimension = scanner.nextLine();
                    local = new Chambre(localisation, Integer.parseInt(prix), Integer.parseInt(tauxLoc),dimension);
                }
                
                service.createLocal(local);
                System.out.print("Le local a ete ajoute et sa reference est : " + local.getRef() + "\n" );

                break;

            case 2:

                String typeLoc;
                int typeLocInt;
                System.out.println("Quel type de local veux-tu afficher : "
                        + "\n 1- Appartement" 
                        + "\n 2- Chambre");
                        typeLoc = scanner.nextLine();
                        typeLocInt = Integer.parseInt(typeLoc);
                    Local lo;
                    if(typeLocInt == 1){

                        System.out.print("Entrer la reference de l'appartement : ");
                        String refLocal = scanner.nextLine();
                       
                        lo = service.searchLocal(refLocal);
                        if(lc != null){
                            System.out.print("Donnees du local : ");
                            System.out.println(lc.afficher());
                        }else{
                            System.out.print("Erreur de reference");          
                        }

                    }else{
                        System.out.print("Entrer la reference de la chambre : ");
                        String refLocal = scanner.nextLine();
                       
                        lo = service.searchLocal(refLocal);
                        if(lc != null){
                            System.out.print("Donnees du local : ");
                            System.out.println(lc.afficher());
                        }else{
                            System.out.print("Erreur de reference");          
                        }
                    }                
                break;
           
            case 3:
                System.out.println("Lister les locaux reserves par un client");
                break;

            case 4:
                System.out.print("Entrer la reference : ");
                String ref = scanner.nextLine();
                local = service.searchLocal(ref);
                if (local == null){
                    System.out.print("Refference introuvable " + "\n");
                }
                else {
                    System.out.print("DONNEE DU LOCAL");
                    System.out.println(local.afficher());
                }
                break;
            
            case 5:
                System.out.println("Faire une Reservation");
                break;
                
            case 6:
                System.out.println("Annuler une Reservation");
                break;
    
            case 7:
                System.out.println("Lister les locaux disponibles");
                break;
            
            case 8:
                System.out.println("Quitter");
                break;
                default:
                break;
            }

        }while (choix !=8);

    }

    public static int menu(){
        int choix;
        System.out.println
        ("Menu"
        + "\n 1-Ajouter un local"  
        + "\n 2-Lister les locaux par type"
        + "\n 3-Lister les locaux reserves par un client"
        + "\n 4-Voir les details d'un local"
        + "\n 5-Faire une reservation"
        + "\n 6-Annuler une reservation"
        + "\n 7-Lister les locaux disponibles"
        + "\n 8-Quitter");
        System.out.print("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }
}