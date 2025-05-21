public class Play {
    public static void main(String args[]){
    int action = 1;
    switch (action) {
        case 1:
            System.out.println("Play");
            break;
        case 2:
            System.out.println("Pause");
            break;
        case 3:
            System.out.println("Stop");
            break;
        default:
            System.out.println("Invalid command");
            break;
    }
}
}
