import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ztt.mapper.BrandMapper;
import com.ztt.mapper.ComputersMapper;
import com.ztt.pojo.Brand;
import com.ztt.utils.SqlSessionUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class mybatis3_test {
    @Test
    public void ForEach_test(){
        ComputersMapper m= SqlSessionUtil.getSqlSession().getMapper(ComputersMapper.class);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        m.selectComputerByForEach(list).forEach(System.out::println);

    }
    @Test
    public void PageInfo_test(){
        PageHelper.startPage(12,5);
        BrandMapper mapper=SqlSessionUtil.getSqlSession().getMapper(BrandMapper.class);
        List<Brand> brands = mapper.getBrandAll();
        PageInfo<Brand> pageInfo=new PageInfo<>(brands);
        System.out.println(pageInfo);
    }
}
