package c0;

import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;

public final class p implements LazyGridItemSpanScope {
    public static final p a;
    public static int b;
    public static int c;

    static {
        p.a = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
    public final int getMaxCurrentLineSpan() {
        return p.b;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
    public final int getMaxLineSpan() {
        return p.c;
    }
}

