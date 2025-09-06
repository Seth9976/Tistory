package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

public final class b extends i {
    public final Object d;

    public b(LockBasedStorageManager lockBasedStorageManager0, Function0 function00, Object object0) {
        this.d = object0;
        super(lockBasedStorageManager0, function00);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.h
    public final m c(boolean z) {
        return new m(this.d, false);
    }
}

