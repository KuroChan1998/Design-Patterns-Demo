package com.jzy.pattern.interceptingFilter;

/**
 * @author JinZhiyun
 * @version 1.0
 * @ClassName Demo
 * @description //TODO
 * @date 2019/12/16 9:13
 **/
public class Demo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
