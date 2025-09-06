package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaClassFinderKt {
    @Nullable
    public static final Class tryLoadClass(@NotNull ClassLoader classLoader0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(classLoader0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fqName");
        try {
            return Class.forName(s, false, classLoader0);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }
}

