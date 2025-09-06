package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Check {
    public static final class DefaultImpls {
        @Nullable
        public static String invoke(@NotNull Check check0, @NotNull FunctionDescriptor functionDescriptor0) {
            Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
            return check0.check(functionDescriptor0) ? null : check0.getDescription();
        }
    }

    boolean check(@NotNull FunctionDescriptor arg1);

    @NotNull
    String getDescription();

    @Nullable
    String invoke(@NotNull FunctionDescriptor arg1);
}

