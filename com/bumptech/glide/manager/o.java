package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.HashSet;

public final class o {
    public final n a;
    public final HashSet b;
    public boolean c;
    public static volatile o d;

    public o(Context context0) {
        this.b = new HashSet();
        this.a = new n(GlideSuppliers.memorize(new j(context0)), new k(this));
    }

    public static o a(Context context0) {
        if(o.d == null) {
            Class class0 = o.class;
            synchronized(class0) {
                if(o.d == null) {
                    o.d = new o(context0.getApplicationContext());
                }
            }
        }
        return o.d;
    }
}

