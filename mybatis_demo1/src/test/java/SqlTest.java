import com.ztt.mapper.EmpMapper;
import com.ztt.pojo.Emp;
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
        SqlSession session=SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        Emp emp=new Emp();
        emp.setEname("11");
        System.out.println(emp.getEname());
        emp.setEsex("女");
        empMapper.insertEmp(emp);
    }
    @Test
    public void deleteEmpById(){
        SqlSession session=SqlSessionUtil.getSqlSession();
        EmpMapper empMapper=session.getMapper(EmpMapper.class);
        empMapper.deleteEmpById(21);
    }
}
