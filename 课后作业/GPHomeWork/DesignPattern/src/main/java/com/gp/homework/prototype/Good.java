package com.gp.homework.prototype;

import java.util.Date;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.prototype
 * @ClassName: Good
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/17 18:02
 * @Version: 1.0
 */
public class Good extends DataBaseData {

    private String goodName ;
    private String goodProductAddr;
    private String goodCompany;
    private Size size;
    private Date goodProductDate;
    public Good(){
        this.goodProductDate = new Date();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodProductAddr() {
        return goodProductAddr;
    }

    public void setGoodProductAddr(String goodProductAddr) {
        this.goodProductAddr = goodProductAddr;
    }

    public String getGoodCompany() {
        return goodCompany;
    }

    public void setGoodCompany(String goodCompany) {
        this.goodCompany = goodCompany;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Date getGoodProductDate() {
        return goodProductDate;
    }

    public static void main(String[] args) throws InterruptedException {
        Good good = new Good();
        Size size = new Size(100,200);
        good.setSize(size);
        good.setGoodCompany("今日好");
        good.setGoodName("好开心");
        good.setGoodProductAddr("古你唔到");
//        Thread.sleep(2000);
        Good shanzaihuo = (Good)good.simpleClone();
//        Good shanzaihuo = (Good)good.deepClone();
        System.out.println(good.getSize()+"---------"+shanzaihuo.getSize());
        System.out.println(good.getGoodProductDate()+"----"+shanzaihuo.getGoodProductDate());
    }
}
