package androidx.recyclerview.widget;

import androidx.core.util.Pools.SimplePool;

public final class i2 {
    public int a;
    public ItemHolderInfo b;
    public ItemHolderInfo c;
    public static final SimplePool d;

    static {
        i2.d = new SimplePool(20);
    }

    public static i2 a() {
        i2 i20 = (i2)i2.d.acquire();
        return i20 == null ? new i2() : i20;  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

