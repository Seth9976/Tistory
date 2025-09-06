package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

public interface ModuleVisibilityHelper {
    public static final class EMPTY implements ModuleVisibilityHelper {
        @NotNull
        public static final EMPTY INSTANCE;

        static {
            EMPTY.INSTANCE = new EMPTY();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull DeclarationDescriptor declarationDescriptor1) {
            Intrinsics.checkNotNullParameter(declarationDescriptor0, "what");
            Intrinsics.checkNotNullParameter(declarationDescriptor1, "from");
            return true;
        }
    }

    boolean isInFriendModule(@NotNull DeclarationDescriptor arg1, @NotNull DeclarationDescriptor arg2);
}

