import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    public String imageName;


    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }


}