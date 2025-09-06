package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class LazyJavaStaticScope extends LazyJavaScope {
    public LazyJavaStaticScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        super(lazyJavaResolverContext0, null, 2, null);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(collection0, "result");
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod0, @NotNull List list0, @NotNull KotlinType kotlinType0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(javaMethod0, "method");
        Intrinsics.checkNotNullParameter(list0, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(kotlinType0, "returnType");
        Intrinsics.checkNotNullParameter(list1, "valueParameters");
        return new MethodSignatureData(kotlinType0, null, list1, list0, false, CollectionsKt__CollectionsKt.emptyList());
    }
}

