package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import o0.e;
import org.jetbrains.annotations.NotNull;

public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {
    public final NotNullLazyValue g;
    public static final KProperty[] h;

    static {
        JavaTargetAnnotationDescriptor.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public JavaTargetAnnotationDescriptor(@NotNull JavaAnnotation javaAnnotation0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(javaAnnotation0, "annotation");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        super(lazyJavaResolverContext0, javaAnnotation0, FqNames.target);
        this.g = lazyJavaResolverContext0.getStorageManager().createLazyValue(new e(this, 10));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor
    @NotNull
    public Map getAllValueArguments() {
        return (Map)StorageKt.getValue(this.g, this, JavaTargetAnnotationDescriptor.h[0]);
    }
}

