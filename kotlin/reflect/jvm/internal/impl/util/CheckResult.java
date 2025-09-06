package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class CheckResult {
    public static final class IllegalFunctionName extends CheckResult {
        @NotNull
        public static final IllegalFunctionName INSTANCE;

        static {
            IllegalFunctionName.INSTANCE = new IllegalFunctionName(false, null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/CheckResult;-><init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public static final class IllegalSignature extends CheckResult {
        public IllegalSignature(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "error");
            super(false, null);
        }
    }

    public static final class SuccessCheck extends CheckResult {
        @NotNull
        public static final SuccessCheck INSTANCE;

        static {
            SuccessCheck.INSTANCE = new SuccessCheck(true, null);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/util/CheckResult;-><init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
        }
    }

    public final boolean a;

    public CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
    }

    public final boolean isSuccess() {
        return this.a;
    }
}

