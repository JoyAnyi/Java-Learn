public class Main {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        int score[] = {90,10,20,30,50,60,70,80,100,40};
        for(int i=0; i<score.length; i++){
             System.out.println("Score: " + i + ":" + score[i]);
        }
        for(int grade : score){
            System.out.println("Scores: " + grade);
        }
        
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        for(int i=0; i<numbers.length; i++){
        System.out.println("Numbers: " + i+ ": " +numbers[i]);
        }
        for(int num : numbers){
            System.out.println("Numbers: " + num);
        }
        int sum = 0;
        for(int num : numbers){
            sum+=num;
        }
        System.out.println("Total: " + sum);
    }
}

