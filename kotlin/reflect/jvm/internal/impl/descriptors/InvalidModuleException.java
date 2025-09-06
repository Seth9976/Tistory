package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class InvalidModuleException extends IllegalStateException {
    public InvalidModuleException(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        super(s);
    }
}

