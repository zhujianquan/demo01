/**
 * @ClassName Singleton
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/22 14:34
 */
public class Singleton {

    private String name;
    private  int age;
    private  String sex;
    private static volatile Singleton singleton ;

    private Singleton(){}

    public static Singleton getSingleton(int index){
        if (singleton==null) synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
//                Object clone = singleton.clone();
                singleton.name = "zhangsan";
                singleton.age = 100;
                singleton.sex = "男";
                System.out.println(singleton.toString() + "---" + index);
            }
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
