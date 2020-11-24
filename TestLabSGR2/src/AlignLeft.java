public class AlignLeft implements AlignStrategy {

    @Override
    public void render(FisierTXT txt) {
        System.out.println("<<<<<" + txt);
    }
}
