package cn.rockingwang.spring.boot.blog.repository;

import cn.rockingwang.spring.boot.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote Repository
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
