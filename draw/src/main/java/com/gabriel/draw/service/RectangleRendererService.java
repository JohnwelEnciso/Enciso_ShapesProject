package com.gabriel.draw.service;

import com.gabriel.draw.model.Rectangle;
import com.gabriel.drawfx.service.RendererService;
import com.gabriel.drawfx.model.Shape;

import java.awt.*;


public class RectangleRendererService implements RendererService {

    @Override
    public void render(Graphics g, Shape shape, boolean xor) {
        Rectangle rectangle = (Rectangle) shape;
        //  g.setColor(shape.getColor());
        g.setXORMode(shape.getColor());
        g.drawRect(rectangle.getLocation().x, rectangle.getLocation().y, rectangle.getEnd().x, rectangle.getEnd().y);
    }
}