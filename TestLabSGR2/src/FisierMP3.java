public class FisierMP3 implements Director{
    public String nume;
     int counterMP3 =0;
   // private String dimensiune = 3 *        //"3 Mbs";


    public FisierMP3(String nume){
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
        System.out.println("Nume fisier MP3: " + nume);
        System.out.println("Dimensiune fisiere MP3: " + counterMP3 * 3 + " Mb");
    }
}
