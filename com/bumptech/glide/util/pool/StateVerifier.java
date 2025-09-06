package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;
import j6.a;

public abstract class StateVerifier {
    public abstract void a(boolean arg1);

    @NonNull
    public static StateVerifier newInstance() {
        return new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public abstract void throwIfRecycled();
}

