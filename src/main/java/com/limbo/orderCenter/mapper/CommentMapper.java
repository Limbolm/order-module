package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public interface CommentMapper {

    /**
     * 根据条件查询评论信息
     * @return
     */
    List<Comment> queryCommentByInfo(Comment comment);

    /**
     * 新增评论
     * @param comment
     * @return
     */
    int insertComment(@Param("comment") Comment comment);

    int updateComment(@Param("comment") Comment comment);
}
