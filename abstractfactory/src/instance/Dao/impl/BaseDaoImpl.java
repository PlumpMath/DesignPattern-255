package instance.Dao.impl;

import instance.Dao.BaseDao;

/**
 * @author zmz
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
    @Override
    public void add(T t) {
        System.out.println("添加"+t.getClass().toString());
    }

    @Override
    public void delete(T t) {
        System.out.println("删除"+t.getClass().toString());
    }

    @Override
    public void update(T t) {
        System.out.println("更新"+t.getClass().toString());
    }

    @Override
    public void select(T t) {
        System.out.println("查询"+ t.getClass().toString());
    }
}
