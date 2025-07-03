package numberSeries;

// in a oder to check the check tech number the number of digits in given number should be even add the 1st half and 2nd half of the number and get a square of it and check the squared number is or not
public class TechNo {
    public static void main(String[] args) {
        int num = 21025;
        int num1 = num;
        int count= 0;
        while (num!=0) {
            count++;
            num=num/10;
        }
        if(count%2 == 0 ){
            int j=1;
            for(int i=1; i<=count/2;i++){
                j=j*10;
            }
            int fh = num1/j;
            int sh = num1%j;
            int sum = fh+sh;
            int sq = sum*sum;
       
        if(sq == num1){
            System.out.println(num1+"is a tech number");
        }else
           System.out.println(num1 + "Not a tech number");
    } else{
        System.out.println("not tech olreay odd number");
    }
        
}
}
