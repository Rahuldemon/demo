import java.util.LinkedList;
class linked {
    public static void main (String[]args)
    {
    LinkedList <String> animals = new LinkedList<>();
    animals.add("dog");
    animals.add("cow");
    animals.add("cat");
    animals.add("bat");
    System.out.println(""+animals);
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
    String str = animals.get(0);
    System.out.print("Element at index 1: " + str);
    animals.set(3, "Jaiprasanth");
    System.out.println("Updated LinkedList: " + animals);
    String qwerty = animals.remove(1);
    System.out.println("Removed Element: " + qwerty);

    System.out.println("Updated LinkedList: " + animals);
  }
}
