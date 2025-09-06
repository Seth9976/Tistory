package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TypeAttribute {
    @NotNull
    public abstract TypeAttribute add(@Nullable TypeAttribute arg1);

    @NotNull
    public abstract KClass getKey();

    @Nullable
    public abstract TypeAttribute intersect(@Nullable TypeAttribute arg1);
}

