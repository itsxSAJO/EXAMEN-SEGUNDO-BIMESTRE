package Utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Utility {
    
    public static int[] eaGetLstOrdenada(int[] slListaInt) {
        Set<Integer> slSetInt = new HashSet<Integer>();
        int[] slListaOrdenada;
        Iterator<Integer> it;
        
        for (int i = 0; i < slListaInt.length; i++) {
            slSetInt.add(slListaInt[i]);
        }

        slListaOrdenada = new int[slSetInt.size()];
        it = slSetInt.iterator();
        for (int i = 0; i < slSetInt.size(); i++) {
            slListaOrdenada[i] = it.next();
        }
        return slListaOrdenada;
    }
}
