/*
 * @Author: Jin X
 * @Date: 2020-02-17 14:14:28
 * @LastEditTime: 2020-02-18 14:54:45
 */
package com.dbms.project1.controller;

import java.util.List;

import com.dbms.project1.Repository.DBRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sql")
public class SqlController {

    @Autowired
    DBRepository dbRepository;
    
    @GetMapping
    public String check() {
        return "Hello Spring";
    }

    @GetMapping(path="/getaisles")
    public String getaisles() {
        return dbRepository.getaisles();
    }

    @PostMapping(path="/e")
    public String jgetdata(@RequestParam("type") String type, @RequestParam("sql") String sql) {
        System.out.println(type+"  :  "+sql);
        return dbRepository.getdata(sql);
    }
}