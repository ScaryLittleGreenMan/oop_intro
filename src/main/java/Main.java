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

        //practice
        Staff[] staffArray= new Staff[6];
        staffArray[0]=new Staff("Vasya", "cleaner", "asd@dsa.uk", "89456987451", 25000, 54);
        staffArray[1]=new Staff("Petya", "engineer", "asd@dsa.uk", "89456987451", 30000, 40);
        staffArray[2]=new Staff("Petrucho", "student", "asd@dsa.uk", "89456987451", 35000, 27);
        staffArray[3]=new Staff("Ezhi", "engineer", "asd@dsa.uk", "89456987451", 40000, 65);
        staffArray[4]=new Staff("Vasisuali", "talisman", "asd@dsa.uk", "89456987451", 50000, 35);
        staffArray[5]=new Staff("Serafim", "SEO", "asd@dsa.uk", "89456987451", 55000, 21);
        //staffArray[5].staffInfo();

        for (int i = 0; i <staffArray.length ; i++) {
            if(staffArray[i].getAge()>=40 ){
                staffArray[i].staffInfo();
            }
        }
    }
}
