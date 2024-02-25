package Lambda;

import java.util.ArrayList;
import java.util.List;

public class BehaviorPattern {

    public static void main(String[] args) {
        //Creating a list of apples
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("Red", 149));
        appleList.add(new Apple("Green", 100));
        appleList.add(new Apple("Red", 151));
        appleList.add(new Apple("Green", 150));

      //  System.out.println(filterAppleListByRedColorPredicate(appleList, new RedColorPredicate()));
        System.out.println(filterAppleListByAbstractPredicate(appleList, new Predicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.color.equals("Green");
            }
        }));
    }

    private static List filterAppleListByAbstractPredicate(List<Apple> appleList, Predicate predicate) {
        List temp=new ArrayList();
        for(int i=0;i<appleList.size();i++)
        {
            Apple apple=appleList.get(i);
            if(predicate.test(apple))
            {
                temp.add(apple);
            }
        }
        return temp;
    }

    private static List<Apple> filterAppleListByRedColorPredicate(List<Apple> appleList,
                                                                  Predicate redColorPredicate) {
        List<Apple> temp=new ArrayList<>();
        for (int i=0;i<appleList.size();i++)
        {
            if(redColorPredicate.test(appleList.get(i)))
            {
            temp.add(appleList.get(i));
            }
        }
        return temp;
    }
}

   /* In previous example, we usually filtered elements from collection.
   These filters returned a boolean values.
        We call this a predicate (that is, a function that returns a boolean)
        Therefore going one step back, lets define a predicate that returns a boolean value*/

interface Predicate {
    boolean test(Apple apple);
}

class RedColorPredicate implements Predicate {
    @Override
    public boolean test(Apple apple) {
        if (apple.color.equals("Red"))
            return true;
        else
            return false;
    }
}

