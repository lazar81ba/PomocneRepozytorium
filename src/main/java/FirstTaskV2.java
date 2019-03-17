import java.util.Random;

public class FirstTaskV2 {
    public static void main(String[] args) {
        Random r= new Random();
        int a=1;
        int max=0;
        int min=0;
        double sumaParzystych=0;
        int licznik=0;
        int max2=0;

        while(a!=0){
            int generatedValue = r.nextInt(150)-49;
            if(a == 1) {
                max = generatedValue;
                min = generatedValue;
            }
            a = generatedValue;

            if(a>=max){
                max2=max;
                max=a;
            }
            if(a<=min){min=a;}
            System.out.println(a);

            if(a%2==0 && a>0){
                sumaParzystych=sumaParzystych+a;
                licznik++;
            }

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Średnia parzystych dodatnich: "+sumaParzystych/licznik);
        System.out.println("Druga co do wielkości liczba to:" + max2);
        System.out.println("Wartość bezwzgledna min*max2: "+(Math.abs(min)*Math.abs(max2)));

        int x = 0;
        int y = 1;
        int z = 0;
        String ciag="0, ";

        while(z+y<(Math.abs(min)*Math.abs(max2))){
            x=y;
            y=z;
            z=x+y;
            ciag=ciag+z+", ";
        }
        System.out.println("Ciag fib: "+ciag);
    }
}
