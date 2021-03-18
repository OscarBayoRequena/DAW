/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modeloDatos;

import java.util.Comparator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class comparadorReferencias implements Comparator<Vivienda> {

    @Override
    public int compare(Vivienda viv1, Vivienda viv2) {
        return viv1.getReferencia().compareTo(viv2.getReferencia());
    }

}
