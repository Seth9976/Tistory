package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;

public final class ContextKt {
    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull TypeParameterResolver typeParameterResolver0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver0, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext0.getComponents(), typeParameterResolver0, lazyJavaResolverContext0.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor0, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner0, int v) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(classOrPackageFragmentDescriptor0, "containingDeclaration");
        a a0 = new a(3, lazyJavaResolverContext0, classOrPackageFragmentDescriptor0);
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, a0);
        JavaResolverComponents javaResolverComponents0 = lazyJavaResolverContext0.getComponents();
        return javaTypeParameterListOwner0 == null ? new LazyJavaResolverContext(javaResolverComponents0, lazyJavaResolverContext0.getTypeParameterResolver(), lazy0) : new LazyJavaResolverContext(javaResolverComponents0, new LazyJavaTypeParameterResolver(lazyJavaResolverContext0, classOrPackageFragmentDescriptor0, javaTypeParameterListOwner0, v), lazy0);
    }

    public static LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext0, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor0, JavaTypeParameterListOwner javaTypeParameterListOwner0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            javaTypeParameterListOwner0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return ContextKt.childForClassOrPackage(lazyJavaResolverContext0, classOrPackageFragmentDescriptor0, javaTypeParameterListOwner0, v);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner0, int v) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(javaTypeParameterListOwner0, "typeParameterOwner");
        Lazy lazy0 = lazyJavaResolverContext0.getDelegateForDefaultTypeQualifiers$descriptors_jvm();
        JavaResolverComponents javaResolverComponents0 = lazyJavaResolverContext0.getComponents();
        return javaTypeParameterListOwner0 == null ? new LazyJavaResolverContext(javaResolverComponents0, lazyJavaResolverContext0.getTypeParameterResolver(), lazy0) : new LazyJavaResolverContext(javaResolverComponents0, new LazyJavaTypeParameterResolver(lazyJavaResolverContext0, declarationDescriptor0, javaTypeParameterListOwner0, v), lazy0);
    }

    public static LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext0, DeclarationDescriptor declarationDescriptor0, JavaTypeParameterListOwner javaTypeParameterListOwner0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return ContextKt.childForMethod(lazyJavaResolverContext0, declarationDescriptor0, javaTypeParameterListOwner0, v);
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(annotations0, "additionalAnnotations");
        return lazyJavaResolverContext0.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext0.getDefaultTypeQualifiers(), annotations0);
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(annotations0, "additionalAnnotations");
        if(!annotations0.isEmpty()) {
            a a0 = new a(4, lazyJavaResolverContext0, annotations0);
            return new LazyJavaResolverContext(lazyJavaResolverContext0.getComponents(), lazyJavaResolverContext0.getTypeParameterResolver(), c.lazy(LazyThreadSafetyMode.NONE, a0));
        }
        return lazyJavaResolverContext0;
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaResolverComponents javaResolverComponents0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(javaResolverComponents0, "components");
        return new LazyJavaResolverContext(javaResolverComponents0, lazyJavaResolverContext0.getTypeParameterResolver(), lazyJavaResolverContext0.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }
}

