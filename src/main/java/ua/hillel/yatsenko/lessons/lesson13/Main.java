package ua.hillel.yatsenko.lessons.lesson13;

public class Main
{
    public static void main(String[] args)
    {
        MusicStyles[] musicStyles =
                {
                        new PopMusic(),
                        new RockMusic(),
                        new PopMusic(),
                        new ClassicMusic(),
                        new RockMusic(),
                        new ClassicMusic()
                };

        for (MusicStyles musicStyle : musicStyles)
        {
            musicStyle.playMusic();
        }

    }

}
