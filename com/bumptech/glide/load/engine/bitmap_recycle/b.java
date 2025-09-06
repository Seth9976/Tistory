package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;

public final class b {
    public final a a;
    public final HashMap b;

    public b() {
        this.a = new a(null);
        this.b = new HashMap();
    }

    public final Object a(Poolable poolable0) {
        HashMap hashMap0 = this.b;
        a a0 = (a)hashMap0.get(poolable0);
        if(a0 == null) {
            a0 = new a(poolable0);
            hashMap0.put(poolable0, a0);
        }
        else {
            poolable0.offer();
        }
        a0.d.c = a0.c;
        a0.c.d = a0.d;
        a0.d = this.a;
        a a1 = this.a.c;
        a0.c = a1;
        a1.d = a0;
        a0.d.c = a0;
        int v = a0.b == null ? 0 : a0.b.size();
        return v <= 0 ? null : a0.b.remove(v - 1);
    }

    public final void b(Poolable poolable0, Object object0) {
        HashMap hashMap0 = this.b;
        a a0 = (a)hashMap0.get(poolable0);
        if(a0 == null) {
            a0 = new a(poolable0);
            a0.d = this.a.d;
            a0.c = this.a;
            this.a.d = a0;
            a0.d.c = a0;
            hashMap0.put(poolable0, a0);
        }
        else {
            poolable0.offer();
        }
        if(a0.b == null) {
            a0.b = new ArrayList();
        }
        a0.b.add(object0);
    }

    public final Object c() {
        a a0 = this.a;
        for(a a1 = a0.d; true; a1 = a1.d) {
            Object object0 = null;
            if(a1.equals(a0)) {
                break;
            }
            int v = a1.b == null ? 0 : a1.b.size();
            if(v > 0) {
                object0 = a1.b.remove(v - 1);
            }
            if(object0 != null) {
                return object0;
            }
            a1.d.c = a1.c;
            a1.c.d = a1.d;
            this.b.remove(a1.a);
            ((Poolable)a1.a).offer();
        }
        return null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GroupedLinkedMap( ");
        a a0 = this.a;
        a a1 = a0.c;
        boolean z;
        for(z = false; !a1.equals(a0); z = true) {
            stringBuilder0.append('{');
            stringBuilder0.append(a1.a);
            stringBuilder0.append(':');
            stringBuilder0.append((a1.b == null ? 0 : a1.b.size()));
            stringBuilder0.append("}, ");
            a1 = a1.c;
        }
        if(z) {
            stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
        }
        stringBuilder0.append(" )");
        return stringBuilder0.toString();
    }
}

