package __OOP.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Playing Music based on your mood");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the music");

    }
}
