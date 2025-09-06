package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {
    public final LazyJavaResolverContext a;
    public final DeclarationDescriptor b;
    public final int c;
    public final Map d;
    public final MemoizedFunctionToNullable e;

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner0, int v) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(javaTypeParameterListOwner0, "typeParameterOwner");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = declarationDescriptor0;
        this.c = v;
        this.d = CollectionsKt.mapToIndex(javaTypeParameterListOwner0.getTypeParameters());
        this.e = lazyJavaResolverContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new b0(this, 27));
    }

    public static final LazyJavaResolverContext access$getC$p(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver0) {
        return lazyJavaTypeParameterResolver0.a;
    }

    public static final DeclarationDescriptor access$getContainingDeclaration$p(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver0) {
        return lazyJavaTypeParameterResolver0.b;
    }

    public static final Map access$getTypeParameters$p(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver0) {
        return lazyJavaTypeParameterResolver0.d;
    }

    public static final int access$getTypeParametersIndexOffset$p(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver0) {
        return lazyJavaTypeParameterResolver0.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter0) {
        Intrinsics.checkNotNullParameter(javaTypeParameter0, "javaTypeParameter");
        TypeParameterDescriptor typeParameterDescriptor0 = (LazyJavaTypeParameterDescriptor)this.e.invoke(javaTypeParameter0);
        return typeParameterDescriptor0 == null ? this.a.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter0) : typeParameterDescriptor0;
    }
}

