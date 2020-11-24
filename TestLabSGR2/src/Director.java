public interface Director {
    void addDirector(Director director);
    void addMP3(FisierMP3 mp3);
    void addSVG(FisierSVG svg);
    void addTXT(FisierTXT txt);
    void print();
}
