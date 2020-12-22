package com.kisl.twitter.enums;

/**
 * Created by Administrator on 2020/12/22.
 */
public enum LogEnum {
    BUSSINESS("bussiness"),
    PLATFORM("platform"),
    DB("db"),
    EXCEPTION("exception"),
    ;

    private String category;

    LogEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
