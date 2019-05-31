package com.crystal.gitgithub.controller;

import com.crystal.gitgithub.entity.News;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName;NewsController
 * @Author;qutao
 * @Date;2019/5/31 9:04 AM
 * @Discription; TODO
 */

@RestController
@RequestMapping(value = "news")
@Api(tags = "新闻系统-新闻管理模块API")
public class NewsController {

    //@GetMapping @PostMapping @PutMapping @DeleteMapping
    //@RequestMapping(value = "getAll")
    @GetMapping(value = "getAll")
    @ApiOperation(value = "获取新闻列表")
    public List<News> getAll(){
        News news1 = new News(1,"aa","ccc");
        News news2 = new News(2,"aa2","ccc2");
        News news3 = new News(3,"aa3","ccc3");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
