package Methods;

public class Task {

    public int sum(int [] numbers){
       int sum=0;
       for (int i=0; i<numbers.length; i++) {
           if (numbers[i] > 3 && numbers[i] < 7) {
               sum = sum + numbers[i];
           }
       }
        return sum;
    }

    public static void main(String[] args) {
        Task result=new Task();
        int [] numbers={3,4,1,10,6,5,4,9,5};
        System.out.println(result.sum(numbers));
    }


}
