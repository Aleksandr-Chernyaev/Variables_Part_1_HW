//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println ("Задача_1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 6.3;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

        System.out.println ("Задача_2");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println (paper);

        System.out.println ("Задача_3");
        dog = dog - 3.5;
        System.out.println (dog);
        cat = cat - 1.6;
        System.out.println (cat);
        paper = paper - 7639;
        System.out.println (paper);

        System.out.println ("Задача_4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        System.out.println ("Задача_5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println ("Задача_6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result = boxer1 + boxer2;
        System.out.println ("Общая масса " + result + " кг");
        var difference = boxer1 - boxer2;
        System.out.println ("Разница между массами бойцов " + difference + " кг");

        System.out.println ("Задача_7");
        var box1 = 132;
        var box2 = 15;
        var remainder = box1 % box2;
        System.out.println (remainder);

        System.out.println ("Задача_8");
        var hours = 640;
        var workingDay = 8;
        var employees = hours / workingDay;
        System.out.println ("Всего работников в компании - " + employees + " человек");
       employees = employees + 94;
       var newHours = employees * workingDay;
       System.out.println ("Если в компании работает " + employees + " человек, то всего " + newHours + " часов работы может быть поделено между сотрудниками.");

    }
}