package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

public interface NameResolver {
    @NotNull
    String getQualifiedClassName(int arg1);

    @NotNull
    String getString(int arg1);

    boolean isLocalClassName(int arg1);
}

