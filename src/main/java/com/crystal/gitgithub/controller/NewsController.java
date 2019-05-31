package com.crystal.gitgithub.controller;

import com.crystal.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class NewsController {

    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aa","ccc");
        News news2 = new News(2,"aa","ccc");
        News news3 = new News(3,"aa","ccc");

        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
