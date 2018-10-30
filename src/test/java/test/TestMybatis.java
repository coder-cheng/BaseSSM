package test;

import com.edu.sys.dao.UserDao;
import com.edu.sys.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/22 14:59
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMybatis {

    @Autowired
    private UserDao userDao;
    @Test
    public void testSelectUser(){
        long id = 1;
        User user = userDao.selectUser(id);
        System.out.println("姓名|"+user.getUsername()
                +"|邮箱|"+ user.getEmail()
                +"|权限|"+user.getRole()
                +"|注册地址|"+user.getRegIp()
                +"|注册时间|"+user.getRegTime());
    }

}
