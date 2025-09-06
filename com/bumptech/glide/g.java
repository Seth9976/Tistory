package com.bumptech.glide;

import com.bumptech.glide.util.Util;
import java.util.Queue;

public final class g {
    public final Queue a;

    public g() {
        this.a = Util.createQueue(0);
    }

    public g(int v) {
        this.a = Util.createQueue(v);
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
            this.a.offer(f0);
        }
    }
}

