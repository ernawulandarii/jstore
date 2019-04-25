package jstore;
import java.util.Random;

public class LetsGo
{
    public LetsGo()
    {

    }

    public int random(int min, int max)
    {
        if (min >= max)
        {
            throw new IllegalArgumentException("max harus lebih besar dari min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    //public static void main(String[] args)
  //  {
    //    System.out.println("====Lomba Lari====");


      //  LetsGo go = new LetsGo();
       // RunForYourLife Run1 = new RunForYourLife( "Lionel", go.random(1,20));
      //  RunForYourLife Run2 = new RunForYourLife( "Andres", go.random(20,80));
       // RunForYourLife Run3 = new RunForYourLife( "Messi", go.random(80,100));

        //Run1.start();
        //Run2.start();
        //Run3.start();
    //}
}