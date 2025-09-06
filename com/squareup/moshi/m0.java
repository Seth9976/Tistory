package com.squareup.moshi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public final class m0 {
    public final ArrayList a;
    public final ArrayDeque b;
    public boolean c;
    public final Moshi d;

    public m0(Moshi moshi0) {
        this.d = moshi0;
        this.a = new ArrayList();
        this.b = new ArrayDeque();
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException0) {
        if(this.c) {
            return illegalArgumentException0;
        }
        this.c = true;
        ArrayDeque arrayDeque0 = this.b;
        if(arrayDeque0.size() == 1 && ((l0)arrayDeque0.getFirst()).b == null) {
            return illegalArgumentException0;
        }
        StringBuilder stringBuilder0 = new StringBuilder(illegalArgumentException0.getMessage());
        Iterator iterator0 = arrayDeque0.descendingIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append("\nfor ");
            stringBuilder0.append(((l0)object0).a);
            String s = ((l0)object0).b;
            if(s != null) {
                stringBuilder0.append(' ');
                stringBuilder0.append(s);
            }
        }
        return new IllegalArgumentException(stringBuilder0.toString(), illegalArgumentException0);
    }

    public final void b(boolean z) {
        this.b.removeLast();
        if(!this.b.isEmpty()) {
            return;
        }
        this.d.c.remove();
        if(z) {
            synchronized(this.d.d) {
                int v1 = this.a.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    l0 l00 = (l0)this.a.get(v2);
                    JsonAdapter jsonAdapter0 = (JsonAdapter)this.d.d.put(l00.c, l00.d);
                    if(jsonAdapter0 != null) {
                        l00.d = jsonAdapter0;
                        this.d.d.put(l00.c, jsonAdapter0);
                    }
                }
            }
        }
    }
}

