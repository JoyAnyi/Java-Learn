class Counting{
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for ( int numbers : number){
            if(numbers % 2 ==0){
                sum+=numbers;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
        
        String[] names = {"Jane", "Alice", "John Doe", "Johnny", "Matthew", "Solomon"};
        String nameLongerThan5="";
        for(String name : names){
            if(name.length() > 5){
                System.out.println(name);
           if(name.length() > nameLongerThan5.length()){
               nameLongerThan5 = name;
           }
            }
        }
       }
}

