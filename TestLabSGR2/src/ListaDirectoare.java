import java.util.ArrayList;

public class ListaDirectoare implements Director{
    ArrayList<Director> content= new ArrayList();


    @Override
    public void addDirector(Director director) {
        content.add(director);

    }

    @Override
    public void addMP3(FisierMP3 mp3) {
        content.add(mp3);
        mp3.counterMP3++;
    }

    @Override
    public void addSVG(FisierSVG svg) {
        content.add(svg);
        svg.counterSVG++;
    }

    @Override
    public void addTXT(FisierTXT txt) {
        content.add(txt);
        txt.counterTXT++;
    }

    @Override
    public void print() {
        System.out.println("Lista Directoare: " + content);


    }
    public void dimTotal(FisierMP3 mp3, FisierTXT txt, FisierSVG svg){
        System.out.println("Dimensiunea totala a fisierelor in Kbs = " + mp3.counterMP3 * 3 * 1024 +
                txt.counterTXT * 5 + svg.counterSVG * 45);
    }
}
