import com.ztt.pojo.TbBrand;
import com.ztt.service.TbBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class test_mybatis_spring {
    @Autowired
    TbBrandService brandService;
    @Test
    public void test01(){
        TbBrand tbBrand=brandService.queryById(5);
        System.out.println(tbBrand);
        brandService.insert(new TbBrand(0,"555","wdwd",12,"ks",12,new Date()));
    }

}
