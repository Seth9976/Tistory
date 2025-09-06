package com.google.android.gms.internal.common;

import a5.b;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class zzy {
    public static String zza(@CheckForNull String s, @CheckForNull Object[] arr_object) {
        String s1;
        int v = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 == null) {
                s1 = "null";
            }
            else {
                try {
                    s1 = object0.toString();
                }
                catch(Exception exception0) {
                    String s2 = object0.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(object0));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for " + s2, exception0);
                    StringBuilder stringBuilder0 = b.v("<", s2, " threw ");
                    stringBuilder0.append(exception0.getClass().getName());
                    stringBuilder0.append(">");
                    s1 = stringBuilder0.toString();
                }
            }
            arr_object[v1] = s1;
        }
        StringBuilder stringBuilder1 = new StringBuilder(arr_object.length * 16 + s.length());
        int v2 = 0;
        while(v < arr_object.length) {
            int v3 = s.indexOf("%s", v2);
            if(v3 == -1) {
                break;
            }
            stringBuilder1.append(s, v2, v3);
            stringBuilder1.append(arr_object[v]);
            v2 = v3 + 2;
            ++v;
        }
        stringBuilder1.append(s, v2, s.length());
        if(v < arr_object.length) {
            stringBuilder1.append(" [");
            int v4 = v + 1;
            stringBuilder1.append(arr_object[v]);
            while(v4 < arr_object.length) {
                stringBuilder1.append(", ");
                stringBuilder1.append(arr_object[v4]);
                ++v4;
            }
            stringBuilder1.append(']');
        }
        return stringBuilder1.toString();
    }
}

