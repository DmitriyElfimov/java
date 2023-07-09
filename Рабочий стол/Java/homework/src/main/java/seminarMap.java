import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class seminarMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> myHashMap = getNewMap(10);
        System.out.println(myHashMap);
    }

//    public static HashMap<Integer, String> getNewMap(int size){
//        HashMap<Integer, String> newMap = new HashMap<>();
//
//        for (int i = 0; i < size; i++){
//            int temp = new Random().nextInt(1001);
//            newMap.put(temp, Character.getName(temp));
//        }
//        return newMap;
//    }
    public static LinkedHashMap<Integer, String> getNewMap(int size){
        LinkedHashMap<Integer, String> newMap = new LinkedHashMap<>();

        for (int i = 0; i < size; i++){
            int temp = new Random().nextInt(1001);
            newMap.put(temp, Character.getName(temp));
        }
        return newMap;
    }
}
