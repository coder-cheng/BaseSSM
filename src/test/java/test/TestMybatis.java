package test;

import com.edu.sys.dao.LocalDao;
import com.edu.sys.entity.Local;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/22 14:59
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMybatis {

    @Autowired
    private LocalDao localDao;
    @Test
    public void getone(){
        int id = 10000;
        Local locallist = localDao.selectLocal(id);
        System.out.println(locallist);
    }
    @Test
    public void selectAll(){
        List<Local> list = localDao.getAll();
        System.out.println(list);
    }
    @Test
    public void insertLocal(){
        Local local = new Local();
        local.setLocalid(11);
        local.setLocalname("test");
        local.setLocallevel("top");
        local.setLocalbelong("own");
        int rows = localDao.insertLocal(local);
        System.out.println(rows);
    }
    @Test
    public void updateLocal(){
        Local local = new Local();
        local.setLocalid(11);
        local.setLocalname("大哥");
        local.setLocallevel("日他哥");
        local.setLocalbelong("强无敌");
        int rows = localDao.updateLocalById(local);
        System.out.println(rows);
    }
    @Test
    public void deleteLocal(){
        int id=11;
        int rows = localDao.deleteLocalById(id);
        if (rows==1){
            System.out.println("删除成功！");
        }else {
            System.out.println("数据已经不存在。");
        }
    }
    


}
