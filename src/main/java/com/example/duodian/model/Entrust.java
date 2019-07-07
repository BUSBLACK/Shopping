package com.example.duodian.model;

import java.io.Serializable;
import java.util.Date;

public class Entrust implements Serializable {
    private Integer id;

    private String content;

    private Date createdate;

    private String dbr;

    private String dbrtitle;

    private String title;

    private Integer user;

    private Integer money;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDbr() {
        return dbr;
    }

    public void setDbr(String dbr) {
        this.dbr = dbr;
    }

    public String getDbrtitle() {
        return dbrtitle;
    }

    public void setDbrtitle(String dbrtitle) {
        this.dbrtitle = dbrtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", createdate=").append(createdate);
        sb.append(", dbr=").append(dbr);
        sb.append(", dbrtitle=").append(dbrtitle);
        sb.append(", title=").append(title);
        sb.append(", user=").append(user);
        sb.append(", money=").append(money);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}