package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NullabilityAnnotationStatesImpl implements NullabilityAnnotationStates {
    public final Map a;
    public final MemoizedFunctionToNullable b;

    public NullabilityAnnotationStatesImpl(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "states");
        super();
        this.a = map0;
        MemoizedFunctionToNullable memoizedFunctionToNullable0 = new LockBasedStorageManager("Java nullability annotation states").createMemoizedFunctionWithNullableValues(new b0(this, 16));
        Intrinsics.checkNotNullExpressionValue(memoizedFunctionToNullable0, "storageManager.createMem…cificFqname(states)\n    }");
        this.b = memoizedFunctionToNullable0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    public Object get(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return this.b.invoke(fqName0);
    }

    @NotNull
    public final Map getStates() {
        return this.a;
    }
}

