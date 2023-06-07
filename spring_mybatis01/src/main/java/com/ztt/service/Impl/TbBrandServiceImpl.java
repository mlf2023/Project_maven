package com.ztt.service.Impl;

import com.ztt.pojo.TbBrand;
import com.ztt.mapper.TbBrandMapper;
import com.ztt.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;


/**
 * (TbBrand)表服务实现类
 *
 * @author makejava
 * @since 2023-05-22 15:47:43
 */

@Service("tbBrandService")
@Transactional
public class TbBrandServiceImpl implements TbBrandService {
    @Autowired
    private TbBrandMapper tbBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbBrand queryById(Integer id) {
        return this.tbBrandDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tbBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TbBrand> queryByPage(TbBrand tbBrand, PageRequest pageRequest) {
        long total = this.tbBrandDao.count(tbBrand);
        return new PageImpl<>(this.tbBrandDao.queryAllByLimit(tbBrand, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbBrand insert(TbBrand tbBrand) {
        this.tbBrandDao.insert(tbBrand);
        int i=1/0;
        return tbBrand;
    }

    /**
     * 修改数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbBrand update(TbBrand tbBrand) {
        this.tbBrandDao.update(tbBrand);
        return this.queryById(tbBrand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbBrandDao.deleteById(id) > 0;
    }
}
