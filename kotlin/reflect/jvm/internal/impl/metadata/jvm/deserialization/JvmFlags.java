package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField;
import org.jetbrains.annotations.NotNull;

public final class JvmFlags {
    @NotNull
    public static final JvmFlags INSTANCE;
    public static final BooleanFlagField a;

    static {
        JvmFlags.INSTANCE = new JvmFlags();  // 初始化器: Ljava/lang/Object;-><init>()V
        JvmFlags.a = FlagField.booleanFirst();
        FlagField.booleanAfter(FlagField.booleanFirst());
    }

    public final BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return JvmFlags.a;
    }
}

