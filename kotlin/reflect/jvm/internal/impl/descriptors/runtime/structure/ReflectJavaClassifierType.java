package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaClassifierType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1#2:65\n1549#3:66\n1620#3,3:67\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClassifierType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClassifierType\n*L\n50#1:66\n50#1:67,3\n*E\n"})
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {
    public final Type a;
    public final ReflectJavaElement b;

    public ReflectJavaClassifierType(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "reflectType");
        ReflectJavaClass reflectJavaClass0;
        super();
        this.a = type0;
        Type type1 = this.getReflectType();
        if(type1 instanceof Class) {
            reflectJavaClass0 = new ReflectJavaClass(((Class)type1));
        }
        else if(type1 instanceof TypeVariable) {
            reflectJavaClass0 = new ReflectJavaTypeParameter(((TypeVariable)type1));
        }
        else if(type1 instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType)type1).getRawType();
            Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass0 = new ReflectJavaClass(((Class)type2));
        }
        else {
            throw new IllegalStateException("Not a classifier type (" + type1.getClass() + "): " + type1);
        }
        this.b = reflectJavaClass0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public JavaAnnotation findAnnotation(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection getAnnotations() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public JavaClassifier getClassifier() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public String getClassifierQualifiedName() {
        throw new UnsupportedOperationException("Type not found: " + this.getReflectType());
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public String getPresentableText() {
        return this.getReflectType().toString();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    public List getTypeArguments() {
        Iterable iterable0 = ReflectClassUtilKt.getParameterizedTypeArguments(this.getReflectType());
        Factory reflectJavaType$Factory0 = ReflectJavaType.Factory;
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(reflectJavaType$Factory0.create(((Type)object0)));
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean isRaw() {
        Type type0 = this.getReflectType();
        if(type0 instanceof Class) {
            TypeVariable[] arr_typeVariable = ((Class)type0).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(arr_typeVariable, "getTypeParameters()");
            return arr_typeVariable.length != 0;
        }
        return false;
    }
}

