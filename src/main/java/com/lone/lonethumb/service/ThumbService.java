package com.lone.lonethumb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lone.lonethumb.model.dto.DoThumbRequest;
import com.lone.lonethumb.model.entity.Thumb;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author lone
 */
public interface ThumbService extends IService<Thumb> {

    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

    Boolean hasThumb(Long blogId, Long userId);

}
