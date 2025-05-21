public class Loop {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7};
        System.out.println("Using traditional for loop:");
        for(int i=0; i<number.length; i++){
        System.out.println("Numbers: "+ i + ":" + number[i]);
     }
     System.out.println("Using enhanced for loop:");
      int sum = 0;
     for(int num : number){
         System.out.println("Number 1-7: " + num);
         sum+=num;
     }
     double average = sum/number.length;
     System.out.println("Average: " +average);
     
     for(int num : number)
     if(num > average ){
         System.out.println("Number greater than average: " + num);
     }
    }
}

