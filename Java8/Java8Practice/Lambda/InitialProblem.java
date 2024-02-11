package Lambda;

import java.util.ArrayList;
import java.util.List;

public class InitialProblem {
    public static void main(String[] args) {
        //Creating a list of apples
        List<Apple> appleList=new ArrayList<>();
        appleList.add(new Apple("Red",149));
        appleList.add(new Apple("Green",100));
        appleList.add(new Apple("Red",151));
        appleList.add(new Apple("Green",150));

        /*
        Problem 1: filtering a list of apples which are red
        */
        System.out.println(filterRedApples(appleList));
        /*
        Problem 2: filtering a list of apples which are green. We will add a param color
        */
        System.out.println(filterApples(appleList,"Green"));

       /* Problem 3:
        We will keep on adding new parameters.
                Notice how ugly client code looks.?
                this solution doesn't cope well with changing requirements.

        List<Apple> greenApples = filterApples(appleList, "green", 0, true);
        List<Apple> heavyApples = filterApples(appleList, "",150,false);
        */







    }

    private static List filterApples(List<Apple> appleList, String color) {
        List temp=new ArrayList();
        for(int i=0;i<appleList.size();i++)
        {
            if(appleList.get(i).color.equals(color))
            {
                temp.add(appleList.get(i).toString());
            }
        }
        return temp;
    }

    private static List filterApplesByLargeWeight(List<Apple> appleList, int weight) {
        List temp=new ArrayList();
        for(int i=0;i<appleList.size();i++)
        {
            if(appleList.get(i).weight>150)
            {
                temp.add(appleList.get(i).toString());
            }
        }
        return temp;
    }

    private static List filterRedApples(List<Apple> appleList) {
        List temp=new ArrayList();
        for(int i=0;i<appleList.size();i++)
        {
            if(appleList.get(i).color.equals("Red"))
            {
                temp.add(appleList.get(i).toString());
            }
        }
        return temp;
    }
}

