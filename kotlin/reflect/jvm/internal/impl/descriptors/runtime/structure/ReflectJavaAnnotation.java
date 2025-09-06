package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaAnnotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n11335#2:44\n11670#2,3:45\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotation.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotation\n*L\n26#1:44\n26#1:45,3\n*E\n"})
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {
    public final Annotation a;

    public ReflectJavaAnnotation(@NotNull Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "annotation");
        super();
        this.a = annotation0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectJavaAnnotation && this.a == ((ReflectJavaAnnotation)object0).a;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    public Collection getArguments() {
        Annotation annotation0 = this.a;
        Method[] arr_method = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation0)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(arr_method, "annotation.annotationClass.java.declaredMethods");
        Collection collection0 = new ArrayList(arr_method.length);
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Object object0 = method0.invoke(annotation0, null);
            Intrinsics.checkNotNullExpressionValue(object0, "method.invoke(annotation)");
            Name name0 = Name.identifier(method0.getName());
            collection0.add(ReflectJavaAnnotationArgument.Factory.create(object0, name0));
        }
        return collection0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(this.a)));
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isFreshlySupportedTypeUseAnnotation() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return false;
    }

    @NotNull
    public ReflectJavaClass resolve() {
        return new ReflectJavaClass(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(this.a)));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public JavaClass resolve() {
        return this.resolve();
    }

    // 去混淆评级： 低(40)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation: " + this.a;
    }
}

