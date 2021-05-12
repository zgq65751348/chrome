package com.google.chrome.tools.utils;

import lombok.Data;

@Data
public  class Page {

    private int pageIndex;
    private int pageSize;
    private  static  volatile  Page page;

    private Page(int pageIndex, int pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }


    public static Page builderPage(Page p){
        if(null == page){
            synchronized (Page.class){
                if(null == page){
                    page  = new Page((p.getPageIndex()-1)*p.getPageSize(), p.pageSize);
                }
            }
        }
        return page;
    }

    public static  Page builder(Page p){
        if(p.getPageIndex() == 0){
            throw new RuntimeException("参数错误：0");
        }
        page  = new Page((p.getPageIndex()-1)*p.getPageSize(), p.pageSize);
        return page;
    }
}


