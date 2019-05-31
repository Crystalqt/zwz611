package com.crystal.gitgithub.config;

import com.crystal.gitgithub.entity.News;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName;NewsList
 * @Author;qutao
 * @Date;2019/5/31 6:09 PM
 * @Discription; TODO
 */
//@Bean @Service @Controller @Configuration @Repository
@Repository  //持久层bean注解
public class NewsList {

    private List<News> list;

    public List<News> getList() {
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }

    public NewsList(){
        News news1=new News(1,"aaa","ccccc");
        News news2=new News(2,"aaa11","ccccc11");
        News news3=new News(3,"aaa22","cccc112c");

        news1.setInputDate(new Date());

        List<News> list =new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);

        this.setList(list);
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "list=" + list +
                '}';
    }
}
