import java.util.*;

public class Shop  extends Client
{
    private Scanner input= new Scanner(System.in);
    private ArrayList<Client> base = new ArrayList<>(255);

    public Shop(String inn, String name, String surname, String patronymic) {
        super(inn, name, surname, patronymic);
    }

    public Shop(){super();}



    public void addClient(Client obj)
    {
        base.add(obj);
    }

    public boolean Order(String inn)
    {
        for(int i = 0; i < base.size(); i++)
        {
            if(base.get(i).inn.equals(inn)) return true;
        }
        throw new UncorrectINN("Uncorrect INN: "+ inn);
    }
}
