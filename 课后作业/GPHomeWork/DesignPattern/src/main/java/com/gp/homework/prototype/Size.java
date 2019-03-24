package com.gp.homework.prototype;

import java.io.Serializable;

/**
 * @ProjectName: GPHomeWork
 * @Package: com.gp.homework.prototype
 * @ClassName: Size
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2019/3/17 19:44
 * @Version: 1.0
 */
public class Size implements Serializable{
    private int length;
    private int width;

    public Size(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
