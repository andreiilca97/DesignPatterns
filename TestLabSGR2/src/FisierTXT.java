public class FisierTXT implements Director, AlignStrategy {
    public String nume;
    public AlignCenter centru = new AlignCenter();
    public AlignLeft stanga = new AlignLeft();
    public AlignRight dreapta = new AlignRight();
    //private String dimensiune = "5 Kbs";
    int counterTXT =0;

    public FisierTXT(String nume){
        this.nume = nume;
    }

    @Override
    public void addDirector(Director director) {

    }

    @Override
    public void addMP3(FisierMP3 mp3) {

    }

    @Override
    public void addSVG(FisierSVG svg) {

    }

    @Override
    public void addTXT(FisierTXT txt) {

    }

    @Override
    public void print() {
        System.out.println("Nume fisier TXT: " + nume);
        System.out.println("Dimensiune fisiere txt: " + counterTXT * 5 + "Kb");
    }

    @Override
    public void render(FisierTXT txt) {
        stanga.render(this);
        centru.render(this);
        dreapta.render(this);
    }
}
