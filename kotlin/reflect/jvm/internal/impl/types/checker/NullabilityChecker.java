package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class NullabilityChecker {
    @NotNull
    public static final NullabilityChecker INSTANCE;

    static {
        NullabilityChecker.INSTANCE = new NullabilityChecker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isSubtypeOfAny(@NotNull UnwrappedType unwrappedType0) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "type");
        TypeCheckerState typeCheckerState0 = SimpleClassicTypeSystemContext.INSTANCE.newTypeCheckerState(false, true);
        SimpleType simpleType0 = FlexibleTypesKt.lowerIfFlexible(unwrappedType0);
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(typeCheckerState0, simpleType0, LowerIfFlexible.INSTANCE);
    }
}

