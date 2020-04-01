import java.util.ArrayList;
import java.util.Arrays;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /*
        Cat[] cats = new Cat[10];
        cats[0] = new Cat("Tom");
        cats[1] = new Cat("Vasya");
        cats[2] = new Cat("Petya");
        cats[3] = new Cat("Volodya");
        cats[4] = new Cat("Bazilio");
        cats[5] = new Cat("Vsapogah");
        cats[5] = new Cat("Mur");
        cats[6] = new Cat("Myau");
        cats[7] = new Cat("Obgora");
        cats[8] = new Cat("Mur");
        cats[9] = new Cat("Dodo");

        cats[1] = null;
    System.out.println(Arrays.toString(cats));

    }
    */

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");
        Cat dodo = new Cat ("Dodo");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        int thomasIndex = cats.indexOf(thomas);
        System.out.println(thomasIndex);
        int pushokIndex = cats.indexOf(pushok);
        System.out.println(pushokIndex);

        Cat getValue = cats.get(3);
        System.out.println(getValue);

        cats.remove(pushok);
        System.out.println(cats.contains(pushok));
        System.out.println(cats.toString());

        cats.set(2,dodo); //заменяет значение в ячейке
        System.out.println(cats.toString());
        cats.add(0,pushok); // сдвигает все значения вправо
        System.out.println(cats.toString());

        System.out.println(cats.size());

        cats.clear();
        System.out.println(cats.toString());


    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
