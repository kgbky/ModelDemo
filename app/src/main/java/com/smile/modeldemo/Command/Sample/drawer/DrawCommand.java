package com.smile.modeldemo.Command.Sample.drawer;

import android.graphics.Point;

import com.smile.modeldemo.Command.Sample.command.Command;

public class DrawCommand implements Command {
    // 绘制对象
    protected Drawable drawable;
    // 绘制位置
    protected Point position;

    // 构造函数
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    // 执行
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
