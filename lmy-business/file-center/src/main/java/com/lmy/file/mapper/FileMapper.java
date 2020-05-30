package com.lmy.file.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lmy.file.model.FileInfo;
import com.lmy.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 上传存储db
 *
 * @author lmy
 */
@Mapper
public interface FileMapper extends SuperMapper<FileInfo> {
    List<FileInfo> findList(Page<FileInfo> page, @Param("f") Map<String, Object> params);
}
