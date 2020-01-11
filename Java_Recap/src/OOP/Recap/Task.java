package OOP.Recap;

public class Task {


    static int a;
    int b;

    public static void main(String[] args) {


        Task obj=new Task();
        obj.a=154;
        obj.b=1225;


        System.out.println(obj.a);
        System.out.println(obj.b);

        System.out.println("  ");

        Task obj2=new Task();
        obj2.a=254;
        obj2.b=123;

        System.out.println(obj2.a);
        System.out.println(obj2.b);

        System.out.println("  ");
        System.out.println(obj.a+" "+obj2.b);
        System.out.println(obj2.a+" "+obj.b);

    }

}
