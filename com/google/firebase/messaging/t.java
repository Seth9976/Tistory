package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.compose.material3.e9;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

public final class t {
    public e9 a;
    public static WeakReference b;

    public final s a() {
        String s1;
        s s0;
        synchronized(this) {
            e9 e90 = this.a;
            synchronized(((ArrayDeque)e90.d)) {
                s0 = null;
                s1 = (String)((ArrayDeque)e90.d).peek();
            }
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s = s1.split("!", -1);
                if(arr_s.length == 2) {
                    s0 = new s(arr_s[0], arr_s[1]);
                }
            }
            return s0;
        }
    }
}

