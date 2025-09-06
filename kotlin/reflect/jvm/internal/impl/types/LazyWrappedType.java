package kotlin.reflect.jvm.internal.impl.types;

import aa.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class LazyWrappedType extends WrappedType {
    public final StorageManager b;
    public final Function0 c;
    public final NotNullLazyValue d;

    public LazyWrappedType(@NotNull StorageManager storageManager0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(function00, "computation");
        super();
        this.b = storageManager0;
        this.c = function00;
        this.d = storageManager0.createLazyValue(function00);
    }

    public static final Function0 access$getComputation$p(LazyWrappedType lazyWrappedType0) {
        return lazyWrappedType0.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return (KotlinType)this.d.invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.d.isComputed();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public KotlinType refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.refine(kotlinTypeRefiner0);
    }

    @NotNull
    public LazyWrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        m m0 = new m(22, kotlinTypeRefiner0, this);
        return new LazyWrappedType(this.b, m0);
    }
}

