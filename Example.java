import java.util.ArrayList;

class Example{
    public static void main(String args[]){
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.println("Adding:");
        ls.add(20);
        ls.add(50);
        ls.add(40);
        System.out.println(ls);

        System.out.println("Reading");
        System.out.println(ls.get(1));

        System.out.println("Delete ");
        ls.remove(1); // To remove the value by using an index.
        System.out.println(ls);
        ls.remove(new Integer(20)); // giving the value which we need to remove instead of index.   these are two types used for  remove the values.
        System.out.println(ls);

        System.out.println("Updating");
        ls.set(1, 60);
        System.out.println(ls);

        System.out.println("Iteration");
        ls.add(1);
        ls.add(2);
        ls.add(3);
        for(int i : ls){
            System.out.println(i);
        }

    }
}