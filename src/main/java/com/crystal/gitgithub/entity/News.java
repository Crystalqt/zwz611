package com.crystal.gitgithub.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @ClassName;News
 * @Author;qutao
 * @Date;2019/5/31 9:29 AM
 * @Discription; TODO
 */
@ApiModel(value = "News",description = "新闻实体")
public class News {
    private Integer id;
    @ApiModelProperty(value = "新闻标题",required = false)
    private String title;
    //    @JsonProperty("content1")  //后续Controller中所有使用News对象的位置
    //content字段的值都必须无条件更新成content1
    @JsonIgnore
    private String content;

    //timezone的值要与数据库连接字符串中的时区设置保持一致  GMT%2B8
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone="GMT+8")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date inputDate;

    public News() {
    }

    public News(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
