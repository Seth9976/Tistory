package kotlin.reflect.jvm.internal.impl.load.java.components;

import j7.d;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaResolverCache {
    public static final JavaResolverCache EMPTY;

    static {
        JavaResolverCache.EMPTY = new d(10);
    }

    @Nullable
    ClassDescriptor getClassResolvedFromSource(@NotNull FqName arg1);

    void recordClass(@NotNull JavaClass arg1, @NotNull ClassDescriptor arg2);

    void recordConstructor(@NotNull JavaElement arg1, @NotNull ConstructorDescriptor arg2);

    void recordField(@NotNull JavaField arg1, @NotNull PropertyDescriptor arg2);

    void recordMethod(@NotNull JavaMember arg1, @NotNull SimpleFunctionDescriptor arg2);
}

