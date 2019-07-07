package com.example.duodian.model;

import java.io.Serializable;
import java.util.Date;

public class Orderbill implements Serializable {
    private Integer id;

    private Date createdate;

    private Integer status;

    private Integer lawer;

    private Integer user;

    private Integer entrust;

    private Integer money;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLawer() {
        return lawer;
    }

    public void setLawer(Integer lawer) {
        this.lawer = lawer;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getEntrust() {
        return entrust;
    }

    public void setEntrust(Integer entrust) {
        this.entrust = entrust;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdate=").append(createdate);
        sb.append(", status=").append(status);
        sb.append(", lawer=").append(lawer);
        sb.append(", user=").append(user);
        sb.append(", entrust=").append(entrust);
        sb.append(", money=").append(money);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}