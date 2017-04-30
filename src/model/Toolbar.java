package model;

import java.awt.Color;
import java.util.ArrayList;

public class Toolbar extends ShapeRectangle{
	public ArrayList<IShape> listShapes;
	private double WIDTH = 70, HEIGHT = 215;
	private double WIDTH_ORIGIN = 50, HEIGHT_ORIGIN = 40, RAY_ORIGIN = 30;
	private int EDGES_ORIGIN = 6;
	private double POS_X_POLY = 60, POS_Y_POLY = 10;
	
	public Toolbar(){
		
		this.setPosition(5, 20);
		this.setWidth(70);
		this.setHeight(515);
		this.setArcHeight(20);
		this.setArcWidth(20);
		this.setFill(Color.WHITE);
		this.setStroke(Color.BLACK);
		this.listShapes = new ArrayList<IShape>();
		
		ShapeRectangle rectOrg = new ShapeRectangle(WIDTH_ORIGIN, HEIGHT_ORIGIN);
		rectOrg.setPosition(rectOrg.getPosition().getX() + 10, rectOrg.getPosition().getY() + 10);
		this.listShapes.add(rectOrg);
		
		
		ShapeRegularPolygon polyOrg = new ShapeRegularPolygon(EDGES_ORIGIN, RAY_ORIGIN);
		System.out.println(polyOrg.getPosition().getX());
		polyOrg.setPosition(polyOrg.getPosition().getX() + 20 , polyOrg.getPosition().getY() + 55);
		this.listShapes.add(polyOrg);
		
//		this.listShapes.add(new ShapeRegularPolygon(edgeLength, nbEdges, rotat, rotatCenterX, rotatCenterY, translateX, translateY, color, size, position))
	}
	
	public IShape getShape(int index){
		if(index < this.listShapes.size()){
			return this.listShapes.get(index);
		}
		else{
			return null;
		}
	}
}