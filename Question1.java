//How to create a class, object, method and its signature
//Creation Of Class

public class Question1 {
    //Method Creation
    int sum( int a, int b){
        int Sum = a + b;
        return Sum;
    }

    public static void main(String[] args) {
        //Object Creation
        Question1 cla = new Question1  ();
        System.out.println(cla.sum(4,6));
    }
}
