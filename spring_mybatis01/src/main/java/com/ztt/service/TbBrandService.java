package com.ztt.service;
import com.ztt.pojo.TbBrand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TbBrand)表服务接口
 *
 * @author makejava
 * @since 2023-05-22 15:33:10
 */
public interface TbBrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbBrand queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tbBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TbBrand> queryByPage(TbBrand tbBrand, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    TbBrand insert(TbBrand tbBrand);

    /**
     * 修改数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    TbBrand update(TbBrand tbBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
