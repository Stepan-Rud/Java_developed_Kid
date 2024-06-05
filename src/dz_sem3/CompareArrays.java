package dz_sem3;

import java.lang.reflect.Type;

public class CompareArrays <T, V>{
    public static <T> boolean compareArrays(T[] a, T[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        if (a.getClass() != b.getClass()) {
            return false;
        }
        return true;
    }
}
