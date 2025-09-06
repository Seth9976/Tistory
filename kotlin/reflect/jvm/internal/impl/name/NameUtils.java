package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class NameUtils {
    @NotNull
    public static final NameUtils INSTANCE;
    public static final Regex a;

    static {
        NameUtils.INSTANCE = new NameUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
        NameUtils.a = new Regex("[^\\p{L}\\p{Digit}]");
    }

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int v) {
        Name name0 = Name.identifier(("_context_receiver_" + v));
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"_context_receiver_$index\")");
        return name0;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return NameUtils.a.replace(s, "_");
    }
}

