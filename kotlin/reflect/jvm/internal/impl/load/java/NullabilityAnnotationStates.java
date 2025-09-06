package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.x;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NullabilityAnnotationStates {
    public static final class Companion {
        public static final Companion a;
        public static final NullabilityAnnotationStatesImpl b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new NullabilityAnnotationStatesImpl(x.emptyMap());
        }

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        NullabilityAnnotationStates.Companion = Companion.a;
    }

    @Nullable
    Object get(@NotNull FqName arg1);
}

