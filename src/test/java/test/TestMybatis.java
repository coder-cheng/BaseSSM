package test;

import com.edu.sys.dao.BaseDao;
import com.edu.sys.dao.LocalDao;
import com.edu.sys.dao.RoleDao;
import com.edu.sys.dao.SchoolDao;
import com.edu.sys.entity.Base;
import com.edu.sys.entity.Local;
import com.edu.sys.entity.Role;
import com.edu.sys.entity.School;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

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
    @Autowired
    private BaseDao baseDao;
    @Autowired
    private SchoolDao schoolDao;
    @Autowired
    private RoleDao roleDao;

    @Test
    public void getone(){
        int id = 10000;
        Local locallist = localDao.selectLocalById(id);
        System.out.println(locallist);
    }
    @Test
    public void selectAll(){
        List<Map<String, Object>> list = localDao.getAllLocal();
        System.out.println(list);
    }
    @Test
    public void insert(){
        Role role = new Role();
        role.setUsername("aaa");
        role.setPassword("123");
        role.setRole("test");
        role.setRolelevel(1);
        int rows = roleDao.insertRole(role);
        System.out.println(rows);
    }
    @Test
    public void update(){
        Role role = new Role();
        role.setUsername("aaa");
        role.setPassword("123");
        role.setRole("test");
        role.setRolelevel(2);
        int rows = roleDao.updateRoleByName(role);
        System.out.println(rows);
    }
    @Test
    public void delete(){
        int id=11;
        int rows = schoolDao.deleteSchoolById(id);
        if (rows==1){
            System.out.println("删除成功！");
        }else {
            System.out.println("数据已经不存在。");
        }
    }
}
