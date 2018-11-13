package com.edu.sys.controller;

import com.edu.sys.common.vo.JsonResult;
import com.edu.sys.entity.*;
import com.edu.sys.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/25 10:45
 * @Description: 这是信息管理界面的控制类
 */
@Controller
@RequestMapping("/sys/")
public class MessManageController {

    /*这里是信息管理--区域信息页面【mess-local】的controller*/
    @RequestMapping("localMess")
    public String localMess() {
        return "sys/mess-local";
    }
    //自动注入业务层接口
    @Autowired
    private  LocalService localService;
    //获取所有区域信息的方法
    @RequestMapping("getAllLocal")
    @ResponseBody
    public JsonResult getAllLocal() {
        List<Map<String, Object>> list = localService.getAllLocal();
        JsonResult result = new JsonResult(list);
        return result;
    }
    //通过ID查询一个区域信息的方法
    @RequestMapping("selectLocalById")
    @ResponseBody
    public JsonResult selectLocalById(Integer localid){
        System.out.println("要查询的id为："+localid);
        Local oneLocal = localService.selectLocalById(localid);
        System.out.println(oneLocal);
        JsonResult result = new JsonResult(oneLocal);
        return result;
    }
    //删除区域信息的方法
    @RequestMapping("deleteLocal")
    @ResponseBody
    public JsonResult deleteLocal(Integer localid){
        System.out.println(localid);
        int row = localService.deleteLocalById(localid);
        System.out.println(row);
        JsonResult r = new JsonResult(row);
        r.setMessage("删除信息 "+row+" 条");
        return r;
    }
    /*这里是信息管理--区域信息编辑页面【mess-local-edit】的controller*/
    @RequestMapping("localEdit")
    public String localEdit() {
        return "sys/mess-local-edit";
    }
    //修改区域信息的方法
    @RequestMapping("updateLocal")
    @ResponseBody
    public JsonResult updateLocalById(Local local){
        int row = localService.updateLocalById(local);
        System.out.println("修改了"+row);
        JsonResult r = new JsonResult();
        r.setMessage("修改成功！");
        return r;
    }
    //插入区域信息的方法
    @RequestMapping("insertLocal")
    @ResponseBody
    public JsonResult insertLocal(Local local){
        int row = localService.insertLocal(local);
        System.out.println("添加了"+row);
        JsonResult r = new JsonResult(row);
        r.setMessage("添加 "+row+" 条信息");
        return r;
    }
    /*这里是信息管理--基地信息页面【mess-base】的controller*/
    @RequestMapping("baseMess")
    public String baseMess() {
        return "sys/mess-base";
    }
    //自动注入业务层接口
    @Autowired
    private BaseService baseService;
    //获取全部基地信息的方法
    @RequestMapping("getAllBase")
    @ResponseBody
    public JsonResult getAllBase() {
        List<Map<String, Object>> list = baseService.getAllBase();
        JsonResult result = new JsonResult(list);
        return result;
    }
    //通过ID查询一个基地信息的方法
    @RequestMapping("selectBaseById")
    @ResponseBody
    public JsonResult selectBaseById(Integer baseid){
        System.out.println("要查询的id为："+baseid);
        Base oneLocal = baseService.selectBaseById(baseid);
        System.out.println(oneLocal);
        JsonResult result = new JsonResult(oneLocal);
        return result;
    }
    //删除基地信息的方法
    @RequestMapping("deleteBase")
    @ResponseBody
    public JsonResult deleteBase(Integer baseid){
        System.out.println(baseid);
        int row = baseService.deleteBaseById(baseid);
        System.out.println(row);
        JsonResult r = new JsonResult(row);
        r.setMessage("删除信息 "+row+" 条");
        return r;
    }
    /*这里是信息管理--基地信息编辑页面【mess-base-edit】的controller*/
    @RequestMapping("baseEdit")
    public String baseEdit() {
        return "sys/mess-base-edit";
    }
    //修改基地信息的方法
    @RequestMapping("updateBase")
    @ResponseBody
    public JsonResult updateBaseById(Base base){
        int row = baseService.updateBaseById(base);
        System.out.println("修改了"+row);
        JsonResult r = new JsonResult();
        r.setMessage("修改成功！");
        return r;
    }
    //插入基地信息的方法
    @RequestMapping("insertBase")
    @ResponseBody
    public JsonResult insertBase(Base base){
        int row = baseService.insertBase(base);
        System.out.println("添加了"+row);
        JsonResult r = new JsonResult(row);
        r.setMessage("添加 "+row+" 条信息");
        return r;
    }
    /*这里是信息管理--学校信息页面【mess-school】的controller*/
    @RequestMapping("schoolMess")
    public String schoolMess() {
        return "sys/mess-school";
    }
    //自动注入业务层接口
    @Autowired
    private SchoolService schoolService;
    //获取全部学校信息的方法
    @RequestMapping("getAllSchool")
    @ResponseBody
    public JsonResult getAllSchool() {
        List<Map<String, Object>> list = schoolService.getAllSchool();
        JsonResult result = new JsonResult(list);
        return result;
    }
    //通过ID查询学校信息的方法
    @RequestMapping("selectSchoolById")
    @ResponseBody
    public JsonResult selectSchoolById(Integer schoolid){
        System.out.println("要查询的id为："+schoolid);
        School oneSchool = schoolService.selectSchoolById(schoolid);
        System.out.println(oneSchool);
        JsonResult result = new JsonResult(oneSchool);
        return result;
    }
    //删除学校信息的方法
    @RequestMapping("deleteSchool")
    @ResponseBody
    public JsonResult deleteSchool(Integer schoolid){
        System.out.println(schoolid);
        int row = schoolService.deleteSchoolById(schoolid);
        System.out.println(row);
        JsonResult r = new JsonResult(row);
        r.setMessage("删除信息 "+row+" 条");
        return r;
    }
    /*这里是信息管理--学校信息编辑页面【mess-school-edit】的controller*/
    @RequestMapping("schoolEdit")
    public String schoolEdit() {
        return "sys/mess-school-edit";
    }
    //修改学校信息的方法
    @RequestMapping("updateSchool")
    @ResponseBody
    public JsonResult updateSchoolById(School school){
        int row = schoolService.updateSchoolById(school);
        System.out.println("修改了"+row);
        JsonResult r = new JsonResult();
        r.setMessage("修改成功！");
        return r;
    }
    //插入学校信息的方法
    @RequestMapping("insertSchool")
    @ResponseBody
    public JsonResult insertSchool(School school){
        int row = schoolService.insertSchool(school);
        System.out.println("添加了"+row);
        JsonResult r = new JsonResult(row);
        r.setMessage("添加 "+row+" 条信息");
        return r;
    }
    /*这里是信息管理--专业信息页面【mess-school】的controller*/
    @RequestMapping("objMess")
    public String objMess() {
        return "sys/mess-obj";
    }
    //自动注入业务层接口
    @Autowired
    private ObjectsService objectsService;
    //获取全部专业信息的方法
    @RequestMapping("getAllObject")
    @ResponseBody
    public JsonResult getAllObject() {
        List<Map<String, Object>> list = objectsService.getAllObject();
        JsonResult result = new JsonResult(list);
        return result;
    }
    //通过ID查询专业信息的方法
    @RequestMapping("selectObjectById")
    @ResponseBody
    public JsonResult selectObjectById(Integer objectid){
        System.out.println("要查询的id为："+objectid);
        Objects oneObject = objectsService.selectObjectById(objectid);
        System.out.println(oneObject);
        JsonResult result = new JsonResult(oneObject);
        return result;
    }
    //删除专业信息的方法
    @RequestMapping("deleteObject")
    @ResponseBody
    public JsonResult deleteObject(Integer objectid){
        System.out.println(objectid);
        int row = objectsService.deleteObjectById(objectid);
        System.out.println(row);
        JsonResult r = new JsonResult(row);
        r.setMessage("删除信息 "+row+" 条");
        return r;
    }
    /*这里是信息管理--专业信息编辑页面【mess-school-edit】的controller*/
    @RequestMapping("objectEdit")
    public String objectEdit() {
        return "sys/mess-obj-edit";
    }
    //修改专业信息的方法
    @RequestMapping("updateObject")
    @ResponseBody
    public JsonResult updateObjectById(Objects objects){
        int row = objectsService.updateObjectById(objects);
        System.out.println("修改了"+row);
        JsonResult r = new JsonResult();
        r.setMessage("修改成功！");
        return r;
    }
    //插入专业信息的方法
    @RequestMapping("insertObject")
    @ResponseBody
    public JsonResult insertObject(Objects objects){
        int row = objectsService.insertObject(objects);
        System.out.println("添加了"+row);
        JsonResult r = new JsonResult(row);
        r.setMessage("添加 "+row+" 条信息");
        return r;
    }
    /*这里是信息管理--学生信息页面【mess-school】的controller*/
    @RequestMapping("stuMess")
    public String stuMess() {
        return "sys/mess-stu";
    }
    /*这里是信息管理--学生信息编辑页面【mess-school-edit】的controller*/
    @RequestMapping("stuEdit")
    public String stuEdit() {
        return "sys/mess-stu-edit";
    }
    /*这里是信息管理--角色信息页面【mess-school】的controller*/
    @RequestMapping("roleMess")
    public String roleMess() {
        return "sys/mess-role";
    }
    @Autowired
    private RoleService roleService;
    @RequestMapping("getAllRole")
    @ResponseBody
    public JsonResult getAllRole() {
        List<Map<String, Object>> list = roleService.getAllRole();
        JsonResult result = new JsonResult(list);
        return result;
    }
    @RequestMapping("selectRoleByName")
    @ResponseBody
    public JsonResult selectRoleByName(Role role){
        System.out.println("要查询的id为："+role);
        Role onedata = roleService.selectRoleByName(role);
        System.out.println(onedata);
        JsonResult result = new JsonResult(onedata);
        return result;
    }
    @RequestMapping("deleteRole")
    @ResponseBody
    public JsonResult deleteRole(Role role){
        System.out.println(role);
        int row = roleService.deleteRoleByName(role);
        System.out.println(row);
        JsonResult r = new JsonResult(row);
        r.setMessage("删除信息 "+row+" 条");
        return r;
    }
    /*这里是信息管理--角色信息编辑页面【mess-school-edit】的controller*/
    @RequestMapping("roleEdit")
    public String roleEdit() {
        return "sys/mess-role-edit";
    }
    @RequestMapping("updateRole")
    @ResponseBody
    public JsonResult updateRole(Role role){
        int row = roleService.updateRoleByName(role);
        System.out.println("修改了"+row);
        JsonResult r = new JsonResult();
        r.setMessage("修改成功！");
        return r;
    }
    @RequestMapping("insertRole")
    @ResponseBody
    public JsonResult insertRole(Role role){
        int row = roleService.insertRole(role);
        System.out.println("添加了"+row);
        JsonResult r = new JsonResult(row);
        r.setMessage("添加 "+row+" 条信息");
        return r;
    }
}
