import java.util.Scanner;

public class Samochod {
    protected String typ;
    protected static int liczbaMiejsc;
    protected double pojemnoscSilnika;
    protected static int rokProdukcji;

    public Samochod(String typ, double pojemnoscSilnika) {
        this.typ = typ;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public Samochod() {

    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public static void setLiczbaMiejsc(int liczbaMiejsc) {
        Samochod.liczbaMiejsc = liczbaMiejsc;
    }


    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public static void setRokProdukcji(int rokProdukcji) {
        Samochod.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "typ='" + typ + '\'' +
                ", liczbaMiejsc=" + liczbaMiejsc +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

    public void wczytaj(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj typ auta:");
        String typ = scan.nextLine();
        System.out.println("Podaj liczbe miejsc:");
        int liczbaMiejsc = scan.nextInt();
        System.out.println("Podaj pojemnosc silnika(po przecinku):");
        double pojemnoscSilnika = scan.nextDouble();
        System.out.println("Podaj rok produkcji:");
        int rokProdukcji = scan.nextInt();


        System.out.println("Typ auta:"+typ + " "+"Liczba miejsc: "+liczbaMiejsc+" "+ "Pojemnosc silnika:" +pojemnoscSilnika+" "+ "Rok produkcji:" +rokProdukcji);
    Samochod.liczbaMiejsc=liczbaMiejsc;
    Samochod.rokProdukcji=rokProdukcji;
    }
    public void czyRodzinny(){
        if(Samochod.liczbaMiejsc>3) {
            System.out.println("Auto jest rodzinne ponieważ " +
                    "posiada więcej niż trzy miejsca!");}
        else if(Samochod.liczbaMiejsc<3){
                System.out.println("Auto nie jest rodzinne " +
                        "ponieważ posiada mniej niż trzy miejsca");
            }
        }

        public void czyKlasyk(){
        if(rokProdukcji<1994){
            System.out.println("Auto może być klasykiem ponieważ ma więcej niż 25 lat");
        }
        else if(rokProdukcji>=1994){
                System.out.println("Auto nie może być klasykiem ponieważ ma mniej niż 25 lat");
            }

    }

    }



