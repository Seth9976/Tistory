package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h implements Iterator {
    public static final h a;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new IllegalStateException();
    }
}

