package numberSeries;

public class primeNoGIvenRange {
   
    public static void main(String[] args) {
    int start = 1;
    int end = 100;
    for(int num = start; num<=end; num++){
        int count = 0;
        for(int i = 2; i<+num/2;i++){
            if(num%i ==0){
                count ++;
                break;
            }
        }
        if(count==0){
            System.out.println(num+" is a Prime Number");
        }
    }
}  }