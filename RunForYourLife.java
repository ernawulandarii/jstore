package jstore;
public class RunForYourLife implements Runnable
{
    private Thread thread;
    private String name;
    private int speed;

    RunForYourLife(String name, int speed)
    {
        this.name = name;
        this.speed = speed;
    }

    public void start()
    {

        System.out.println(name + ", ready");
        System.out.println(name + ", set ...");
        if (thread == null)
        {
            thread = new Thread (this, name);
            thread.start();
        }
    }

    public void run()
    {
        System.out.println(name + ", go!");
        try
        {
            for(int checkpoint = 1; checkpoint <= 20; checkpoint++)
            {
                System.out.println(name + " has passed checkpoint (" + checkpoint + ")");
                Thread.sleep(100500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(name + " was interrupted.");
        }
        System.out.println("\n" + name + " has finish \n");
    }


}
