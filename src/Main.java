
public class Main {

    public static void main(String[] args){
        Coach dick = new Coach();
        dick.setName("Dick Advocaat");
        Coach erik = new Coach();
        erik.setName("Erik ten Hag");
        Coach mark = new Coach();
        mark.setName("Mark van Bommel");
        Team ajax = new Team("Ajax", "Amsterdam", erik);
        Team feyenoord = new Team("Feyenoord", "Rotterdam", dick);
        Team psv = new Team("PSV", "Eindhoven", mark);
        Match match1 = new Match(ajax, psv, true);
        Match match2 = new Match(psv, feyenoord, false);
        System.out.println("De winnaar van 'match1' was: " + match1.nameWinner());
        System.out.println("Deze wedstrijd werd gespeeld in: " + match1.heldInCity());
        System.out.println("De winnaar van 'match2' was: " + match2.nameWinner());
        System.out.println("Deze wedstrijd werd gespeeld in: " + match2.heldInCity());
        System.out.println(match1.getHome().getName());
        System.out.println(feyenoord.getCoachedBy().getName());
    }
}


class Match
{
    private final Boolean homeHasWon;
    private final Team home;
    private final Team visiting;


    public Match(Team home, Team visiting, Boolean homeHasWon)
    {
        this.home = home;
        this.visiting = visiting;
        this.homeHasWon = homeHasWon;
    }

    public Team getHome()
    {
        return this.home;
    }

    public Team getVisiting()
    {
        return this.visiting;
    }

    public Boolean getHomeHasWon()
    {
        return this.homeHasWon;
    }

    public String heldInCity ()
    {
        return this.home.getCity();
    }

    public String nameWinner()
    {
        if (homeHasWon)
        {
            return this.home.getName();
        }
        else
        {
            return this.visiting.getName();
        }
    }
}

class Team
{

    private final String name;
    private final String city;
    private final Coach coachedBy;

    public Team(String name, String city, Coach coachedBy)
    {
        this.name = name;
        this.city = city;
        this.coachedBy = coachedBy;
    }

    public String getName()
    {
        return this.name;
    }

    public String getCity()
    {
        return this.city;
    }

    public Coach getCoachedBy()
    {
        return this.coachedBy;
    }
}

class Coach
{

    private String name;

    public Coach()
    {

    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
