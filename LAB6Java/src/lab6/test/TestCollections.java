package lab6.test;

import lab6.model.Wood;

import java.util.*;

public class TestCollections {
    Random rnd = new Random();

    public void main()
    {
        test1();
        test2();
        test3();
        test4();
        test5();
    }
    public void test1 (){
        Collection<Integer> c1 = new Vector();
        for(int i=0;i<15;i++)
        {
            c1.add(rnd.nextInt(10));

        }
        // vector всі числа з колекції, treeset - унікальні числа
        System.out.println("Collection vector");
        for(Integer number :c1)
            System.out.printf("%d ", number);
        Collection<Integer> c2 = new TreeSet<>();
        c2.addAll(c1);
        System.out.println("\nCollection TreeSet");
        c2.forEach((x)->System.out.printf("%d ",x));
    }
    public void test2()
    {
        Collection<Integer>c1 = new ArrayList<>();
        Collection<Integer>c2 = new ArrayList<>();
        Collection<Integer>c3 = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
        c1.add(rnd.nextInt(10));
        c2.add(rnd.nextInt(10));
        }
        System.out.println();
        System.out.println("Числа які є в першій колекції, і нема в другій");

        c3.addAll(c1);c3.removeAll(c2);
        System.out.println(c1+"removeAll"+c2+" = "+ c3);

        System.out.println("Числа які є в другій колекції, і нема в першій");

        c3.clear();c3.addAll(c2);c3.removeAll(c1);
        System.out.println(c2+"removeAll"+c1+ " = " +c3);
        System.out.println("Числа які є в першій та другій коллекціях");

        c3.clear(); c3.addAll(c1); c3.retainAll(c2);
        System.out.println(c2+"retainAll"+c2+" = " +c3);
        System.out.println("Числа які є в першій та другій коллекціях");

        c3.clear(); c3.addAll(c2); c3.retainAll(c1);
        System.out.println(c2+"retainAll"+c1+ " = "+ c3);
        System.out.println();

    }
    public void test3()
    {
        System.out.println("TEST3");

        Collection<Integer> c1 = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            c1.add(rnd.nextInt(10));
        }
        Collection<Integer> c2 = new LinkedHashSet<>();
        c2.addAll(c1);
        boolean b1 = c1.containsAll(c1);
        System.out.println("Якщо всі числа з другої коллекції є в першій - true");
        System.out.println(c1+"containsAll"+c2+" = " + b1);
        Collection<Integer>c3 = new TreeSet<>();
        c3.addAll(c1);
        boolean b2 = c1.containsAll(c3);
        System.out.println("Якщо всі числа з другої коллекції є в першій - true");
        System.out.println(c1+"containtAll"+c3+ " = " +b2);
    }
    public void test4()
    {

        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i = 0; i <10; i++)
        {
            c1.add(rnd.nextInt(10));
        }
        System.out.println("До сортування");
        System.out.println(c1);
        c1.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b)
            {
                return a-b;
            }
        });
        System.out.println("Після сортування ");
        System.out.println(c1);
    }
    public void test5()
    {

        Collection<Integer> coll = new ArrayDeque<>();

        Collections.addAll(coll, 1, 3, 5, 3, 4, 2, 14);
        Collections.addAll(coll, new Integer[]{3,7,12});
        System.out.println("coll = " + coll);
        System.out.println("Collections.frequency = " + Collections.frequency(coll, 3));
        System.out.println("Collections.max = " + Collections.max(coll));
        System.out.println("Collections.min = " + Collections.min(coll));
        List<Integer> list = new ArrayList<>(coll);
        System.out.println("list = " + list);
        Collections.swap(list, 2, 6);
        System.out.println("Змінити місцями = " + list);

        Collections.sort(list);
        System.out.println("Сортування = " + list);

        System.out.println("Бінарний пошук = " + Collections.binarySearch(list, 3, (a,b)-> b - a));

        Collections.reverse(list);
        System.out.println("обернення = " + list);

        Collections.shuffle(list);
        System.out.println("перемішати = " + list);

        Collections.replaceAll(list, 3, 8);
        System.out.println("Замінити одне значення на інше = " + list);

        Collections.fill(list, 0);
        System.out.println("Заповнити = " + list);

        System.out.print("\n\n");
        HashSet<Wood> set = new HashSet<>();
        set.add(new Wood(1, "Кішкодуб", 1f));
        set.add(new Wood(1, "Кішкодуб", 1f));
        set.add(new Wood(1, "Кішкодуб", 1f));

        Wood a = new Wood(1, "Кішкодуб", 1f);
        Wood b = new Wood(1, "Кішкодуб", 1f);
        System.out.println(b.equals(a));
        System.out.println(a.hashCode() + " " + b.hashCode());
        set.forEach(System.out::println);
    }
    public void test6(){
        System.out.print("\n\n");
        Set<Wood> set = new HashSet<>();
        set.add(new Wood(1, "Кішкодуб", 1f));
        set.add(new Wood(1, "Кішкодуб", 1f));
        set.add(new Wood(1, "Кішкодуб", 1f));

        Wood a = new Wood(1, "Кішкодуб", 1f);
        Wood b = new Wood(1, "Кішкодуб", 1f);
        System.out.println(b.equals(a));
        System.out.println(a.hashCode() + " " + b.hashCode());
        set.forEach(System.out::println);
    }
}
