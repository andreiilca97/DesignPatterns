import java.util.concurrent.TimeUnit;

public class imageProxy implements Element {
    Image Name;
    String name;
    imageProxy(String name) {
        this.name=name;
    }
    @Override
    public void print() {
        if (Name==null)
            Name=new Image(name);
        Name.print();
    }


}