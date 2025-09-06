package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaAnnotations implements Annotations {
    public final LazyJavaResolverContext a;
    public final JavaAnnotationOwner b;
    public final boolean c;
    public final MemoizedFunctionToNullable d;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaAnnotationOwner javaAnnotationOwner0, boolean z) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaAnnotationOwner0, "annotationOwner");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = javaAnnotationOwner0;
        this.c = z;
        this.d = lazyJavaResolverContext0.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new b0(this, 26));
    }

    public LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext0, JavaAnnotationOwner javaAnnotationOwner0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(lazyJavaResolverContext0, javaAnnotationOwner0, z);
    }

    public static final boolean access$getAreAnnotationsFreshlySupported$p(LazyJavaAnnotations lazyJavaAnnotations0) {
        return lazyJavaAnnotations0.c;
    }

    public static final LazyJavaResolverContext access$getC$p(LazyJavaAnnotations lazyJavaAnnotations0) {
        return lazyJavaAnnotations0.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        JavaAnnotationOwner javaAnnotationOwner0 = this.b;
        JavaAnnotation javaAnnotation0 = javaAnnotationOwner0.findAnnotation(fqName0);
        if(javaAnnotation0 != null) {
            AnnotationDescriptor annotationDescriptor0 = (AnnotationDescriptor)this.d.invoke(javaAnnotation0);
            return annotationDescriptor0 == null ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName0, javaAnnotationOwner0, this.a) : annotationDescriptor0;
        }
        return JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName0, javaAnnotationOwner0, this.a);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName0) {
        return DefaultImpls.hasAnnotation(this, fqName0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.b.getAnnotations().isEmpty() && !this.b.isDeprecatedInJavaDoc();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.b.getAnnotations()), this.d), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(FqNames.deprecated, this.b, this.a))).iterator();
    }
}

