package com.example.board_pedro.src.item;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ItemMapper {
    public List<Map<String, Object>> getList(Map<String, Object> param) throws Exception;
}
