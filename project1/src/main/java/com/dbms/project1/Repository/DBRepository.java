/*
 * @Author: Jin X
 * @Date: 2020-02-17 14:22:07
 * @LastEditTime: 2020-02-17 18:10:37
 */
package com.dbms.project1.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DBRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getaisles() {
        List<Map<String,Object>> mylist = jdbcTemplate.queryForList("select * from aisles");
        String json = JSON.toJSONString(mylist);
        return json;
    }

    public String getdata(String sql) {
        List<Map<String,Object>> mylist = jdbcTemplate.queryForList(sql);
        String json = JSON.toJSONString(mylist);
        return json;
    }

}