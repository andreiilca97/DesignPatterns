import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
    FisierSVG svg = new FisierSVG("SVG.1");
    FisierMP3 mp3 = new FisierMP3("MP3.1");
    FisierTXT txt = new FisierTXT("TXT.1");
    ListaDirectoare lista = new ListaDirectoare();


    System.out.println(svg);
    System.out.println(mp3);
    System.out.println(txt);
    lista.dimTotal(mp3,txt,svg);
    System.out.println(lista.content);






    }
}



