package main.java.List.ArrayList;

import java.util.*;

/* ArrayList Sorting example using Comparator */
public class CountrySort {

    int id;
    String countryName;

    public CountrySort(int id, String countryName) {

        this.id = id;
        this.countryName = countryName;
    }

    public static Comparator testComparator = new Comparator() {
        public int compare(Object o1, Object o2) {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }
    };

    public static void main(String[] args)
    {
    	CountrySort indiaCountry=new CountrySort(1, "India");
    	CountrySort chinaCountry=new CountrySort(4, "China");
    	CountrySort nepalCountry=new CountrySort(3, "Nepal");
    	CountrySort bhutanCountry=new CountrySort(2, "Bhutan");

        List<CountrySort> list = new ArrayList<CountrySort>();
        list.add(indiaCountry);
        list.add(chinaCountry);
        list.add(nepalCountry);
        list.add(bhutanCountry);

        Comparator idComparator = new Comparator<CountrySort>() {
            public int compare(CountrySort o1, CountrySort o2) {
                return o1.id - o2.id;
            }
        };

        /*Comparator nameComparator = new Comparator<CountrySort>() {
            public int compare(CountrySort o1, CountrySort o2) {
                return o2.countryName.compareTo(o1.countryName);
            }
        };

        
        Collections.sort(list, new Comparator<CountrySort>()
        {

            public int compare(CountrySort o1, CountrySort o2) {
                return o1.id - o2.id;
            }
        }
        );*/

        Collections.sort(list, idComparator);

        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
        	CountrySort country = (CountrySort) iter.next();
            System.out.println("Id :"+country.id+" Name :"+country.countryName);
        }

    }

   
}
