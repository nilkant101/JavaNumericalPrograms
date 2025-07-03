 package numberSeries;

class GCD {


    public static void main(String[] args) {
    int a =16;
    int b=12;
    int gcd = 0;
    for(int i=1;i<+a;i++){
       if(a%i==0 && b%i==0){
          gcd=i;
       }
    }
    System.out.println("GCD is : " + gcd);
    }
}