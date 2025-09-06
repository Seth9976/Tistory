package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class d implements Function0 {
    public final StorageManager a;
    public final SupertypeLoopChecker b;
    public final AbstractTypeParameterDescriptor c;

    public d(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor0, StorageManager storageManager0, SupertypeLoopChecker supertypeLoopChecker0) {
        this.c = abstractTypeParameterDescriptor0;
        this.a = storageManager0;
        this.b = supertypeLoopChecker0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new g(this.c, this.a, this.b);
    }
}

