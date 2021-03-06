package com.lihuanyu.dao;

import com.lihuanyu.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Explorer on 2016/4/20.
 */
@Transactional
public interface CommentDao extends CrudRepository<Comment,Long> {
    public Comment findById(long id);
    public Iterable<Comment> findByCourseId(long id);
    public List<Comment> findByFromUserId(long id);
}
