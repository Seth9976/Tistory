package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaTypeParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n11335#2:51\n11670#2,3:52\n*S KotlinDebug\n*F\n+ 1 ReflectJavaTypeParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaTypeParameter\n*L\n29#1:51\n29#1:52,3\n*E\n"})
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {
    public final TypeVariable a;

    public ReflectJavaTypeParameter(@NotNull TypeVariable typeVariable0) {
        Intrinsics.checkNotNullParameter(typeVariable0, "typeVariable");
        super();
        this.a = typeVariable0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ReflectJavaTypeParameter && Intrinsics.areEqual(this.a, ((ReflectJavaTypeParameter)object0).a);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        AnnotatedElement annotatedElement0 = this.getElement();
        if(annotatedElement0 != null) {
            Annotation[] arr_annotation = annotatedElement0.getDeclaredAnnotations();
            return arr_annotation == null ? null : ReflectJavaAnnotationOwnerKt.findAnnotation(arr_annotation, fqName0);
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName0) {
        return this.findAnnotation(fqName0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return this.getAnnotations();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public List getAnnotations() {
        AnnotatedElement annotatedElement0 = this.getElement();
        if(annotatedElement0 != null) {
            Annotation[] arr_annotation = annotatedElement0.getDeclaredAnnotations();
            if(arr_annotation != null) {
                List list0 = ReflectJavaAnnotationOwnerKt.getAnnotations(arr_annotation);
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @Nullable
    public AnnotatedElement getElement() {
        return this.a instanceof AnnotatedElement ? ((AnnotatedElement)this.a) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Name name0 = Name.identifier(this.a.getName());
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(typeVariable.name)");
        return name0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public Collection getUpperBounds() {
        return this.getUpperBounds();
    }

    @NotNull
    public List getUpperBounds() {
        Type[] arr_type = this.a.getBounds();
        Intrinsics.checkNotNullExpressionValue(arr_type, "typeVariable.bounds");
        List list0 = new ArrayList(arr_type.length);
        for(int v = 0; v < arr_type.length; ++v) {
            list0.add(new ReflectJavaClassifierType(arr_type[v]));
        }
        ReflectJavaClassifierType reflectJavaClassifierType0 = (ReflectJavaClassifierType)CollectionsKt___CollectionsKt.singleOrNull(list0);
        return Intrinsics.areEqual((reflectJavaClassifierType0 == null ? null : reflectJavaClassifierType0.getReflectType()), Object.class) ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    // 去混淆评级： 低(40)
    @Override
    @NotNull
    public String toString() {
        return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter: " + this.a;
    }
}

