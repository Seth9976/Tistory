package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface LookupTracker {
    public static final class DO_NOTHING implements LookupTracker {
        @NotNull
        public static final DO_NOTHING INSTANCE;

        static {
            DO_NOTHING.INSTANCE = new DO_NOTHING();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public boolean getRequiresPosition() {
            return false;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public void record(@NotNull String s, @NotNull Position position0, @NotNull String s1, @NotNull ScopeKind scopeKind0, @NotNull String s2) {
            Intrinsics.checkNotNullParameter(s, "filePath");
            Intrinsics.checkNotNullParameter(position0, "position");
            Intrinsics.checkNotNullParameter(s1, "scopeFqName");
            Intrinsics.checkNotNullParameter(scopeKind0, "scopeKind");
            Intrinsics.checkNotNullParameter(s2, "name");
        }
    }

    boolean getRequiresPosition();

    void record(@NotNull String arg1, @NotNull Position arg2, @NotNull String arg3, @NotNull ScopeKind arg4, @NotNull String arg5);
}

