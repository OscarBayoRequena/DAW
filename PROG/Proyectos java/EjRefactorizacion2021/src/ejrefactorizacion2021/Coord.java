/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrefactorizacion2021;

/**
 *
 * @author JC Alfaro
 */
public class Coord {
        int coordX;
        int coordY;
        
        public Coord(int pCordX, int pCordY){
            this.coordX = pCordX;
            this.coordY = pCordY;
        }

        public int getCoordX() {
            return coordX;
        }

        public int getCoordY() {
            return coordY;
        }

        public void moveToRight(int stepX) {
            this.coordX = coordX + stepX;
        }

        public void moveToUp(int stepY) {
            this.coordY = coordY + stepY;
        }
        
        public void moveToLeft(int stepX) {
            this.coordX = coordX - stepX;
        }

        public void moveToDown(int stepY) {
            this.coordY = coordY - stepY;
        }
}
