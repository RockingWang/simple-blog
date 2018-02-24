package cn.rockingwang.spring.boot.blog.repository;

import cn.rockingwang.spring.boot.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comment Repository 接口
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
