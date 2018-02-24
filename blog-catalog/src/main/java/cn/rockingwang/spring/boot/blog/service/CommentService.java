package cn.rockingwang.spring.boot.blog.service;

import cn.rockingwang.spring.boot.blog.domain.Comment;

/**
 * Comment Service 接口
 */
public interface CommentService {

    /**
     * 根据ID获取comment
     *
     * @param id
     * @return
     */
    Comment getCommentById(Long id);

    /**
     * 删除评论
     *
     * @param id
     */
    void removeComment(Long id);

}
