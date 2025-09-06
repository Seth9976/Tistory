package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaValueParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaValueParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaValueParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {
    public final ReflectJavaType a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public ReflectJavaValueParameter(@NotNull ReflectJavaType reflectJavaType0, @NotNull Annotation[] arr_annotation, @Nullable String s, boolean z) {
        Intrinsics.checkNotNullParameter(reflectJavaType0, "type");
        Intrinsics.checkNotNullParameter(arr_annotation, "reflectAnnotations");
        super();
        this.a = reflectJavaType0;
        this.b = arr_annotation;
        this.c = s;
        this.d = z;
    }

    @Nullable
    public ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.b, fqName0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName0) {
        return this.findAnnotation(fqName0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return this.getAnnotations();
    }

    @NotNull
    public List getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.b);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @Nullable
    public Name getName() {
        return this.c == null ? null : Name.guessByFirstCharacter(this.c);
    }

    @NotNull
    public ReflectJavaType getType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public JavaType getType() {
        return this.getType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean isVararg() {
        return this.d;
    }

    // 去混淆评级： 中等(60)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaValueParameter: " + (this.isVararg() ? "vararg " : "") + this.getName() + ": " + this.getType();
    }
}

