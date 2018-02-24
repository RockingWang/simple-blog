package cn.rockingwang.spring.boot.blog.service;

import cn.rockingwang.spring.boot.blog.domain.Vote;
import cn.rockingwang.spring.boot.blog.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Vote 服务实现
 */
@Service
public class VoteServiceImpl implements VoteService {


    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findOne(id);
    }

    @Override
    public void removeVote(Long id) {
        voteRepository.delete(id);
    }

}
