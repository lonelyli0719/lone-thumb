package com.lone.lonethumb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lone.lonethumb.model.entity.Blog;
import com.lone.lonethumb.model.vo.BlogVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * @author lone
 */
public interface BlogService extends IService<Blog> {

    BlogVO getBlogVOById(long blogId, HttpServletRequest request);

    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);

}
