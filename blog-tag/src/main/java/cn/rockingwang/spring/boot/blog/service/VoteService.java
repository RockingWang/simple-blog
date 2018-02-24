package cn.rockingwang.spring.boot.blog.service;

import cn.rockingwang.spring.boot.blog.domain.Vote;

/**
 * Vote 服务接口
 */
public interface VoteService {

    /**
     * 根据ID获取Vote
     *
     * @param id
     * @return
     */
    Vote getVoteById(Long id);

    /**
     * 删除Vote
     *
     * @param id
     */
    void removeVote(Long id);

}
