package com.dfire.common.entity.vo;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午4:51 2018/4/17
 * @desc
 */
@Builder
@Data
public class HeraGroupVo {

    private int id;
    private String name;
    private String owner;
    private String description;


    private Map<String, String> properties;
    private List<Map<String,String>> resources;
}
