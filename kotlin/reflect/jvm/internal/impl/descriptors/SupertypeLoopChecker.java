package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

public interface SupertypeLoopChecker {
    public static final class EMPTY implements SupertypeLoopChecker {
        @NotNull
        public static final EMPTY INSTANCE;

        static {
            EMPTY.INSTANCE = new EMPTY();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        @NotNull
        public Collection findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor0, @NotNull Collection collection0, @NotNull Function1 function10, @NotNull Function1 function11) {
            Intrinsics.checkNotNullParameter(typeConstructor0, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(collection0, "superTypes");
            Intrinsics.checkNotNullParameter(function10, "neighbors");
            Intrinsics.checkNotNullParameter(function11, "reportLoop");
            return collection0;
        }
    }

    @NotNull
    Collection findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor arg1, @NotNull Collection arg2, @NotNull Function1 arg3, @NotNull Function1 arg4);
}

