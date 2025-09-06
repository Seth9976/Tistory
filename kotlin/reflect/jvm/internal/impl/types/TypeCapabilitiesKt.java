package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeCapabilitiesKt {
    @Nullable
    public static final CustomTypeParameter getCustomTypeParameter(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        CustomTypeParameter customTypeParameter0 = unwrappedType0 instanceof CustomTypeParameter ? ((CustomTypeParameter)unwrappedType0) : null;
        return customTypeParameter0 == null || !customTypeParameter0.isTypeParameter() ? null : customTypeParameter0;
    }

    public static final boolean isCustomTypeParameter(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        CustomTypeParameter customTypeParameter0 = unwrappedType0 instanceof CustomTypeParameter ? ((CustomTypeParameter)unwrappedType0) : null;
        return customTypeParameter0 == null ? false : customTypeParameter0.isTypeParameter();
    }
}

