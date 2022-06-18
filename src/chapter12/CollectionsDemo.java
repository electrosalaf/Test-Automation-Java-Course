package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // setDemo();
        listDemo();
        // queueDemo();
        // mapDemo();
    }


    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("lemon");
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(fruit.size());
        System.out.println(fruit);

        // These 3 are doing absolutely the same...
        // Approach 1
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Approach 2: Advanced for loop
        for (String item: fruit) {
            System.out.println(item);
        }

        // Approach 3: Using forEach
        fruit.forEach(x -> System.out.println(i));

        // Approach 4: Syntactic Sugar
        fruit.forEach(System.out::println);
    }

    private static void listDemo() {

        List<String> fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        System.out.println(fruit.get(2));

    }

    public static void queueDemo() {

        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");

        System.out.println(fruits.size());
        System.out.println(fruits);

        fruits.remove();
        System.out.println(fruits);

        System.out.println(fruits.peek());
    }

    public static void mapDemo() {

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 18);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("apple"));
        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);
    }

    public void print(Collection<String> collection) {
        var i = collection.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item : collection) {
            System.out.println(item);
        }

        collection.forEach(x -> System.out.println());

        // Syntactic sugar approach
        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map) {
        for (var entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k, v) -> System.out.println("Fruit: " + k + ", calories: " + v)
        );
    }

}
