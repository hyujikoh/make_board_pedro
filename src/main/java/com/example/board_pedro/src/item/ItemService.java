package com.example.board_pedro.src.item;

import com.example.board_pedro.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemService {

    protected static final Logger logger = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private ItemMapper itemMapper;

    public Map<String, Object> getList(Map<String, Object> param) throws Exception {
        Map<String, Object> resultMap = new HashMap<>();
        List<Map<String,Object>> contents = itemMapper.getList(param);
        resultMap.put("contents",contents);
        return resultMap;
    }
}
