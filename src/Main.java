/**
 * Created by adavi on 27.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        BuildArray array = new BuildArray();

        int [] myArray = array.arrayBild(12);

        System.out.print(array.equalsArray(myArray));
    }
}
