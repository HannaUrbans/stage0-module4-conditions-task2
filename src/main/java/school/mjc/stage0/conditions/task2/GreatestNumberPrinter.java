package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        if (first<second){
            System.out.println(second);
        }
        else if(first==second){System.out.println(first);}
        else{System.out.println(first);};
    }
    public static void main (String [] arg){
        int first=10;
        int second=10;
        printGreatest (first,second);    }
}
