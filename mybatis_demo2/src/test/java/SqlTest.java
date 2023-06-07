import com.ztt.mapper.*;
import com.ztt.pojo.Computers;
import com.ztt.pojo.Emp;
import com.ztt.pojo.Teacher;
import com.ztt.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SqlTest {
    @Test
    public void sql(){
        SqlSession session= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=empMapper.getEmpById(12);
        System.out.println(emp);
    }
    @Test
    public void insert(){
        SqlSession session= SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=new Emp();
        emp.setEname("11");
        emp.setEsex("女");
        empMapper.insertEmp(emp);
        System.out.println(emp);
    }
    @Test
    public void deleteEmpById(){
        SqlSession session=SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        empMapper.deleteEmpById(21);
    }
    @Test
    public void deleteEmpByAnn(){
        SqlSession session=SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        empMapper.selectEmpBySome("b",5000,6000).forEach(System.out::println);
    }
    @Test
    public void selectAllBrand(){
    SqlSession session=SqlSessionUtil.getSqlSession();
    BrandMapper brandMapper=session.getMapper(BrandMapper.class);
    brandMapper.getBrandAll().forEach(System.out::println);
   }
   @Test
    public void selectWifeAndHusInfo(){
       SqlSession session=SqlSessionUtil.getSqlSession();
       WifeMapper mapper=session.getMapper(WifeMapper.class);
       mapper.getHUsAndWifeInfo().forEach(System.out::println);
   }
   @Test
   public void selectAllUsersInfo(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        mapper.getAllUsers().forEach(System.out::println);
       Teacher t=new Teacher(12,"da");
       System.out.println(t);
   }
   @Test
   public void selectStudent(){
       StudentMapper mapper=SqlSessionUtil.getSqlSession().getMapper(StudentMapper.class);
       mapper.getAllStudenttwo().forEach(System.out::println);
   }
    @Test

    public void test13(){

    SqlSession sqlSession = SqlSessionUtil.getSqlSession( );

    ComputersMapper mapper = sqlSession. getMapper( ComputersMapper.class);
    Computers computers = new Computers( ) ;

    computers. setPrice(16000f);

    computers. setId(2L);

    int i = mapper.updateByConditionTrim (computers);

    System. out . println("i = " + i);

    sqlSession.close( );
    }

}
