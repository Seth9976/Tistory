package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaAnnotationsKt {
    @NotNull
    public static final Annotations resolveAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaAnnotationOwner javaAnnotationOwner0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "<this>");
        Intrinsics.checkNotNullParameter(javaAnnotationOwner0, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext0, javaAnnotationOwner0, false, 4, null);
    }
}

