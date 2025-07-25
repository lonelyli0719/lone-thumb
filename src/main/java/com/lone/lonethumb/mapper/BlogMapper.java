package com.lone.lonethumb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lone.lonethumb.model.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author lone
 */
public interface BlogMapper extends BaseMapper<Blog> {
    void batchUpdateThumbCount(@Param("countMap") Map<Long, Long> countMap);
}




