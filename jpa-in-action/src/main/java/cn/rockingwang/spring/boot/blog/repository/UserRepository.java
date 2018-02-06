package cn.rockingwang.spring.boot.blog.repository;

import cn.rockingwang.spring.boot.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User Repository 接口
 *
 * @author 王鹏
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
