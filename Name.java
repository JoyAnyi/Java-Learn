public class Name {
    public static void main(String[] args) {
        String name[] = {"Alice", "Bob", "Angela", "David", "Annabelle", "Tom"};
        System.out.println("All names:");
        for(String names : name){
            System.out.println(name);
        }
        int countStartsWithA = 0;
        for(String names : name){
        if(name.startsWith("A")){
            countStartsWithA++;
        }
        }
        System.out.println("Number of names starting with 'A': " + countStartsWithA);
        
        String longest = names[0];
        for(String names : names){
            if(name.length() > longest.length()){
                longest= name;
            }
        }
        System.out.println("Longest name: " + longest);
      }
}
