import java.util.ArrayList;

public class Printer {
    public <T> void print(ArrayList<T> items){
        for(T item: items){
            System.out.println(item);
        }
    }


}


