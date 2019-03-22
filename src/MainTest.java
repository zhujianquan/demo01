/**
 * @ClassName MainTest
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/22 14:51
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println();
        System.err.println();

        for (int i=0;i<100;i++){
            final int index=i;
            new Thread(()->{
                    Singleton singleton =  Singleton.getSingleton(index);
                    System.out.println("第"+index+"次名称:"+singleton.getName()+"年龄:"+singleton.getAge()+"性别:"+singleton.getSex());
                }).start();

//            new Thread(() -> {
//                Singleton.getSingleton();
//            }).start();
        }
    }
}
