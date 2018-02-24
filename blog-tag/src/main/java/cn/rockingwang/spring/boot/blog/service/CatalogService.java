package cn.rockingwang.spring.boot.blog.service;

import cn.rockingwang.spring.boot.blog.domain.Catalog;
import cn.rockingwang.spring.boot.blog.domain.User;

import java.util.List;

/**
 * Catalog Service 接口
 */
public interface CatalogService {

    /**
     * 保存Catalog
     *
     * @param catalog
     * @return
     */
    Catalog saveCatalog(Catalog catalog);

    /**
     * 删除Catalog
     *
     * @param id
     */
    void removeCatalog(Long id);

    /**
     * 根据ID获取Catalog
     *
     * @param id
     * @return
     */
    Catalog getCatalogById(Long id);

    /**
     * 获取Catalog列表
     *
     * @param user
     * @return
     */
    List<Catalog> listCatalog(User user);
}
