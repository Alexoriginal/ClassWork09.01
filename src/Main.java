/**
 * Created by java on 09.01.2018.
 */
public class Main {
    public static void main(String[] args) {


        String catik=new String("Cat");
        Cat cat=new Cat();
        cat.setAge(4);
        cat.setNameOfCat("Vasia");
        System.out.println(cat.getAge());
        System.out.println();

        String sharic=new String("Dogs");
        Dogs mydogs=new Dogs();//создаем  класс mydogs
        mydogs.getLeg();
        System.out.println(mydogs.getLeg());


        System.out.println(mydogs.nameOfDog);



    }
}
