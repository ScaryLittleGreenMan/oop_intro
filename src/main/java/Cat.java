public class Cat {
    String name;
    String color;
    int age;

    public Cat() { //создает клоны)
        System.out.println("Это конструктор для класса Cat");
        name = "Kot";
        color = "White";
        age = 1;
    }

/*    но так почти не юзают, есть волшебный this
    public Cat(String _name, String _color, int _age) { //параметризированный конструктор
        name = _name;
        color = _color;
        age = _age;
    }*/

    //метод ссылается на вызвавший его объект
    public Cat(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    //public Cat(){}  пустой конструктор

    public void setAge(int age){
        if(age>=0){
            this.age=age;
        }else{
            System.out.println("Cat no born");
        }
    }

    public int getAge (){
        return age;
    }
}
