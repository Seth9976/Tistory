package xf;

import kotlinx.coroutines.internal.SystemPropsKt;

public abstract class f1 {
    public static final int a;

    static {
        f1.a = SystemPropsKt.systemProp("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, 0x7FFFFFFF);
    }
}

