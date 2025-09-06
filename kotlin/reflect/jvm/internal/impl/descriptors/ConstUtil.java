package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class ConstUtil {
    @NotNull
    public static final ConstUtil INSTANCE;

    static {
        ConstUtil.INSTANCE = new ConstUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        return ConstUtilKt.canBeUsedForConstVal(kotlinType0);
    }
}

