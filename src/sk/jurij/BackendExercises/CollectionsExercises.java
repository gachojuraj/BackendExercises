package sk.jurij.BackendExercises;

import sk.jurij.BackendExercises.classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CollectionsExercises {
    public static void printNumbers(ArrayList<Integer> list){
        if (list.isEmpty()) System.out.println("List je prázdny");
        list.forEach(System.out::println);
        // or you can use lambda expressions:
        //list.forEach(e -> System.out.println(e));
    }

    public static void addIfNotExists(Object element, ArrayList<Object> list){
        if (!list.contains(element)) list.add(element);
    }

    public static void removeEven(ArrayList<Integer> list){
        list.stream().filter(num -> num%2 == 0).forEach(list::remove);
    }

    public static ArrayList<Integer> getEven(ArrayList<Integer> list){
        return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> multiplyByLength(ArrayList<Integer> list){
        return list.stream().map(e -> e*list.size()).collect(Collectors.toCollection(ArrayList::new));
    }

    public static int getBudget(Person[] arr){
        return Arrays.stream(arr).mapToInt(Person::getBudget).sum();
    }

    public static boolean hasA(Person[] arr){
        return Arrays.stream(arr).map(Person::getName).anyMatch(e-> e.contains("a"));
    }

    public static void testMap(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        map.forEach((key,number) -> System.out.printf("%s: %d\n", key, number));
    }

    public static void addIfKeyNotExist(Object key, Object value, HashMap<Object, Object> map){
        map.putIfAbsent(key, value);
    }
    /*
        Aký je rozdiel medzi obyčajným poľom (napr. String []) a ArrayListom?
            arraylist je dynamický, čo znamená že jeho veľkosť sa mení môžme do neho pridávať elementy,
            pole má fixnú veľkosť a nedajú sa doňho jednoducho pridávať elementy

        Prečo má niekedy zmysel pri inicializácii ArrayListu písať počiatočnú kapacitu? new ArrayList(10)?
            keď máme zadanú počiatočnú hodnotu, v pamäti sa vyhradí priestor pre určený počet elementov
             a pri pridávaní nových sa jeho veľkosť v pamäti nemení ažkým nepresiahneme danú kapacitu

        Vidíš rozdiel medzi Listom a Setom?
            keď pouźivame set, predpokladáme že pridávané elementy sa neopakujú a takisto nám hodnoty usporiadá
         */
}
