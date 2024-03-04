package Book5.Listing

public class LaunchEventNew implements Runnable
{
    private String message;
    public LaunchEventNew(String message)
    {
        this.message = message;
    }
    public void run()
    {
        System.out.println(message);
    }
}
