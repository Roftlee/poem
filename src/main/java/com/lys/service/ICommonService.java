package com.lys.service;

/**
 * @author: AsiQue
 * @date :2018.06.11 14:43
 */
public interface ICommonService<T> {

    int deleteByPrimaryKey(Long id) throws Exception;

    int insert(T record) throws Exception;

    int insertSelective(T record) throws Exception;

    T selectByPrimaryKey(Long id) throws Exception;

    int updateByPrimaryKeySelective(T record) throws Exception;

    int updateByPrimaryKey(T record) throws Exception;
}
