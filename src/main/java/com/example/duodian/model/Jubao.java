package com.example.duodian.model;

import java.io.Serializable;

public class Jubao implements Serializable {
    private Integer id;

    private String dept;

    private String reason;

    private String remark;

    private Integer entrust;

    private Integer lawer;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEntrust() {
        return entrust;
    }

    public void setEntrust(Integer entrust) {
        this.entrust = entrust;
    }

    public Integer getLawer() {
        return lawer;
    }

    public void setLawer(Integer lawer) {
        this.lawer = lawer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dept=").append(dept);
        sb.append(", reason=").append(reason);
        sb.append(", remark=").append(remark);
        sb.append(", entrust=").append(entrust);
        sb.append(", lawer=").append(lawer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}