import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jieliyu on 2017/2/9.
 */
public class Test1 {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        context.start();

        System.out.println(" app run ");

        System.in.read(); // 按任意键退出
    }
} 