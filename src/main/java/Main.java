public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); //создается ссылка на экземпляр класса
        Cat cat2 = new Cat();
        cat1.color = "White ";
        cat1.name= "Vasya ";
        cat1.age = 11;
        cat2.color = "Brown ";
        cat2.name= "Murka ";
        cat2.age = 3;
        System.out.println(cat1.name+cat1.color+cat1.age);
        System.out.println(cat2.name+cat2.color+cat2.age);

        Cat cat3; //переменная объявляется как ссылка на объект типа Сat, сейчас null
        cat3=new Cat(); //выделяется память для объекта типа Сat и в cat3 сохраняется ссылка на него
        //труъ создавать в одну строку- Cat cat3 = new Cat()

        Cat cat4=new Cat("Izya", "Purple", 7);
    }
}
