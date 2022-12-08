package Practice28;

import java.util.*;

public class Map
{
    private HashMap<String, String> hashMap;

    public HashMap createMap() {
        hashMap = new HashMap<String, String>();

        hashMap.put("Thomas", "Williams");
        hashMap.put("Kianna", "Harris");
        hashMap.put("Alisa", "Robinson");
        hashMap.put("Blanca", "Robinson");
        hashMap.put("Bethany", "Stanley");
        hashMap.put("John", "Warburton");
        hashMap.put("Robyn", "Perry");
        hashMap.put("Kianna", "Howard");
        hashMap.put("Kianna", "Cooper");
        hashMap.put("Kianna", "Walker");

        return hashMap;
    }

    public int getSameLastNameCount() {
        ArrayList<String> surnames = new ArrayList<String>();
        int sum = 0;

        for (String value1 : hashMap.values()) {
            sum = 0;
            String surname = "";
            boolean isMoreThanOne = false;

            for (String value2 : hashMap.values()) {
                if (value1 == value2) {
                    ++sum;

                    if (sum > 1) {
                        surname = value2;
                        isMoreThanOne = true;
                    }
                }
            }
            if (isMoreThanOne && !surnames.contains(surname)) {
                System.out.println("Surname: " + surname + ", amount: " + sum);
                surnames.add(surname);
            }
        }
        return 0;
    }

    public void print() {
        for (String key : hashMap.keySet()) {
            System.out.println("Name: " + key + ", Surname: " + hashMap.get(key));
        }
    }
}
