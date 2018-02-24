package cn.rockingwang.spring.boot.blog.service;

import cn.rockingwang.spring.boot.blog.domain.Authority;

public interface AuthorityService {

    /**
     * 根据 ID 查询 Authority
     *
     * @param id
     * @return
     */
    Authority getAuthorityById(Long id);

}
