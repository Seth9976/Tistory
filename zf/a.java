package zf;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.ClassValueCtorCache.cache.1;
import kotlinx.coroutines.internal.CtorCache;

public final class a extends CtorCache {
    public static final a a;
    public static final ClassValueCtorCache.cache.1 b;

    static {
        a.a = new a();  // 初始化器: Lkotlinx/coroutines/internal/CtorCache;-><init>()V
        a.b = new ClassValueCtorCache.cache.1();
    }

    @Override  // kotlinx.coroutines.internal.CtorCache
    public final Function1 get(Class class0) {
        return (Function1)a.b.get(class0);
    }
}

