package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final class Companion {
        public static final Companion a;
        public static final NewKotlinTypeCheckerImpl b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new NewKotlinTypeCheckerImpl(Default.INSTANCE, null, 2, null);
        }

        @NotNull
        public final NewKotlinTypeCheckerImpl getDefault() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        NewKotlinTypeChecker.Companion = Companion.a;
    }

    @NotNull
    KotlinTypeRefiner getKotlinTypeRefiner();

    @NotNull
    OverridingUtil getOverridingUtil();
}

