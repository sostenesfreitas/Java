/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author sostenes
 */
public class Triangulo {

    int ladoA;
    int ladoB;
    int ladoC;
boolean valida(){
   if (ladoA <= (ladoB + ladoC)){
        return false;
    }if (ladoB <= (ladoA + ladoC)){
        return false;
    }if (ladoC <= (ladoA+ladoB)){
        return false;
    }
    return true;
}
    String tipoTriangulo() {
        if ((ladoA == ladoB) && (ladoA == ladoC) && (ladoB == ladoC)) {
            return ("Equilatero");
        } else if ((ladoA == ladoB) && (ladoA != ladoC) && (ladoB != ladoC)
                || (ladoA != ladoB) && (ladoA != ladoC) && (ladoB == ladoC)
                || (ladoA != ladoB) && (ladoA == ladoC) && (ladoB != ladoC)) {
            return ("Isoceles !");
        } else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
            return ("Escaleno !");
        }
        return null;

    }
}
