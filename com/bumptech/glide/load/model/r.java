package com.bumptech.glide.load.model;

import com.bumptech.glide.util.Util;
import java.util.Queue;

public final class r {
    public int a;
    public int b;
    public Object c;
    public static final Queue d;

    static {
        r.d = Util.createQueue(0);
    }

    public static r a(int v, int v1, Object object0) {
        r r0;
        synchronized(r.d) {
            r0 = (r)r.d.poll();
        }
        if(r0 == null) {
            r0 = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        r0.c = object0;
        r0.b = v;
        r0.a = v1;
        return r0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof r && this.b == ((r)object0).b && this.a == ((r)object0).a && this.c.equals(((r)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a * 0x1F + this.b) * 0x1F;
    }
}

