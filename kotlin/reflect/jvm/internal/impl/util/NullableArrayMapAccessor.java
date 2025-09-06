package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NullableArrayMapAccessor extends AbstractArrayMapAccessor implements ReadOnlyProperty {
    public NullableArrayMapAccessor(@NotNull KClass kClass0, int v) {
        Intrinsics.checkNotNullParameter(kClass0, "key");
        super(kClass0, v);
    }

    @Override  // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object object0, KProperty kProperty0) {
        return this.getValue(((AbstractArrayMapOwner)object0), kProperty0);
    }

    @Nullable
    public Object getValue(@NotNull AbstractArrayMapOwner abstractArrayMapOwner0, @NotNull KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(abstractArrayMapOwner0, "thisRef");
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        return this.extractValue(abstractArrayMapOwner0);
    }
}

