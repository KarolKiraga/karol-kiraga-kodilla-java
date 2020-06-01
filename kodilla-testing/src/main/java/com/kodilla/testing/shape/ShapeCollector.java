package com.kodilla.testing.shape;

import java.util.*;
public class ShapeCollector {
    ArrayList<Shape> figureList = new ArrayList<>();

    public void addFigure(Shape shape){

        figureList.add(shape);
        System.out.println(figureList);

    }

    public boolean removeFigure(Shape shape){
        int variable_1 = figureList.size();
        figureList.remove(shape);
        if (variable_1 == figureList.size()){

            return false;
        }
        else{

        return true;
        }
    }

    public Shape getFigure(int n){

        if (n<0 ||n>figureList.size()) {
            return null;
        }
        else {

          return figureList.get(n);
        }



    }

    public void showFigures(Shape shape){
    System.out.println(shape);
    }

    public int getSize(){


        return figureList.size();


    }

}
