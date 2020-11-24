public class FisierSVG implements Director {
    public String nume;
    int counterSVG = 0;

    FisierSVG(String nume){
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
        System.out.println("Nume fisier SVG: " + nume);
        System.out.println("Dimensiune fisiere svg: " + counterSVG * 45 + "Kb");
    }
}
