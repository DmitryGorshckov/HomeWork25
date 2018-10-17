import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        boolean bool = isUnique(map);
        System.out.println(bool);


    }

    private static HashMap<String, String>  createMap () {
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Гоша", "Сидоров");
        map.put("Леша", "Грачев");
        //map.put("Миша", "Грачев");
        return (HashMap<String, String>) map;

        }


      private static boolean isUnique(Map<String, String> map){

           boolean n = map.isEmpty();
            if(n){
                System.out.println("Map пустая");
                return true;
            } else {
          System.out.println(String.format("%s%s","Исходная Map = ",map.entrySet()));
            }

          System.out.println("===========");

          List<String> lists = new ArrayList<>();

          for(Map.Entry<String, String> entry: map.entrySet()) {

              String key = entry.getKey(); //получить ключ

              String value = entry.getValue(); //получить значение

              boolean b = lists.contains(value);
              if (!b) {
                  lists.add(entry.getValue());
              }
                  else {
                  System.out.println("есть одинаковые значения");
                  return false;
                 }

          }
          System.out.println("нет одинаковых значений");
          return true;
    }
}


