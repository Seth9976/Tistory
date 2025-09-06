package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class StrictEqualityTypeChecker {
    @NotNull
    public static final StrictEqualityTypeChecker INSTANCE;

    static {
        StrictEqualityTypeChecker.INSTANCE = new StrictEqualityTypeChecker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean strictEqualTypes(@NotNull UnwrappedType unwrappedType0, @NotNull UnwrappedType unwrappedType1) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "a");
        Intrinsics.checkNotNullParameter(unwrappedType1, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, unwrappedType0, unwrappedType1);
    }
}

