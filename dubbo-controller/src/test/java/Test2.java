import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ly.dubbo.domain.User;
import com.ly.dubbo.service.IUserService;
import com.ly.dubbo.service.TestService;


/**
 * Created by jieliyu on 2017/2/9.
 */
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext-dubbo.xml" });
        context.start();
//        TestService demoService = (TestService) context.getBean("testService"); 
        IUserService userService = (IUserService) context.getBean("userService");
        // service
        // invocation
        // proxy
        String message = "";
        try {
//            message = demoService.build("2017-10-20");
//            String say = demoService.say("liyang");
//            String testSayDubbo = demoService.testSayDubbo();
//            
//            System.out.println(say);
//            System.out.println(testSayDubbo);
            
//            System.out.println(" the message from server is:" + message);
            
            for (int i = 0 ;i<10 ;i++){
            	List<User> listUser = userService.getListUser();
            	for (User user : listUser) {
            		System.out.println(user.getUserName()+"------"+i);
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}