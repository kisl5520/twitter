package com.kisl.twitter.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TXtyhxx implements Serializable {
    @ApiModelProperty(value = "主键 主键")
    private String gid;

    @ApiModelProperty(value = "用户代码 用户代码")
    private Integer yhdm;

    @ApiModelProperty(value = "用户名称 用户名称")
    private String yhmc;

    @ApiModelProperty(value = "显示名称 显示名称")
    private String xsmc;

    @ApiModelProperty(value = "用户密码 用户密码")
    private String yhmm;

    @ApiModelProperty(value = "密码密文 密码密文")
    private String javamm;

    @ApiModelProperty(value = "用户操作类型 用户操作类型:0-普通用户、1-管理用户、2-审批用户、3-审计用户")
    private Integer czlx;

    @ApiModelProperty(value = "停用标志 停用标志。0或null：未被停用；1：已停用。")
    private Integer stoped;

    private static final long serialVersionUID = 1L;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Integer getYhdm() {
        return yhdm;
    }

    public void setYhdm(Integer yhdm) {
        this.yhdm = yhdm;
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    public String getXsmc() {
        return xsmc;
    }

    public void setXsmc(String xsmc) {
        this.xsmc = xsmc;
    }

    public String getYhmm() {
        return yhmm;
    }

    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }

    public String getJavamm() {
        return javamm;
    }

    public void setJavamm(String javamm) {
        this.javamm = javamm;
    }

    public Integer getCzlx() {
        return czlx;
    }

    public void setCzlx(Integer czlx) {
        this.czlx = czlx;
    }

    public Integer getStoped() {
        return stoped;
    }

    public void setStoped(Integer stoped) {
        this.stoped = stoped;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gid=").append(gid);
        sb.append(", yhdm=").append(yhdm);
        sb.append(", yhmc=").append(yhmc);
        sb.append(", xsmc=").append(xsmc);
        sb.append(", yhmm=").append(yhmm);
        sb.append(", javamm=").append(javamm);
        sb.append(", czlx=").append(czlx);
        sb.append(", stoped=").append(stoped);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}