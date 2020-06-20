/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciontp100.operar;

/**
 *
 * @author dertu
 */
public class BinarioADecimal {

    public static int BinarioADecimal(String binario) {
        int decimal;
        decimal = Integer.parseInt(binario, 2);
        return decimal;
    }
}
