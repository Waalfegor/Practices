package Practice4;

public class Practice4
{
    public enum Seasons
    {
        Summer,Autumn,Spring,Winter;
    }

    public static void attitudeToSeason(Seasons ob)
    {
        switch (ob)
        {
            case Summer: System.out.println("I love summer"); break;
            case Autumn: System.out.println("I love autumn, too."); break;
            case Spring: System.out.println("I don't like spring"); break;
            case Winter: System.out.println("I hate winter"); break;
        }
    }

    public static void  main(String[] args)
    {
        Seasons season = Seasons.Summer;
        attitudeToSeason(season);
    }
}
