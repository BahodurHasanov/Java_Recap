package OOP.OOP_Encapcilation;

public class Encapsulation_Test {

    public static void main(String[] args) {

        Encapsulation_DataStore obj =new Encapsulation_DataStore();

        String str= obj.getName();
              System.out.println(str);


        int str1=obj.getID();
               System.out.println(str1);
        System.out.println("    ");



        String info=obj.getCity();
        System.out.println(info);
        System.out.println("  ");

        String info1=obj.getCapitals();
        System.out.println(info1);
        System.out.println("  ");

        String info2=obj.getCountry();
        System.out.println(info2);
        System.out.println("  ");




               // modify

        obj.setName("John-Ha");
        System.out.println(obj.getName());

        obj.setID(236);
        System.out.println(obj.getID());






    }

}
