package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {
    public final Type a;
    public final ReflectJavaType b;
    public final Collection c;

    public ReflectJavaArrayType(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "reflectType");
        ReflectJavaType reflectJavaType0;
        super();
        this.a = type0;
        Type type1 = this.getReflectType();
        if(type1 instanceof GenericArrayType) {
            Type type2 = ((GenericArrayType)type1).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(type2, "genericComponentType");
            reflectJavaType0 = ReflectJavaType.Factory.create(type2);
        }
        else if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class0 = ((Class)type1).getComponentType();
            Intrinsics.checkNotNullExpressionValue(class0, "getComponentType()");
            reflectJavaType0 = ReflectJavaType.Factory.create(class0);
        }
        else {
            throw new IllegalArgumentException("Not an array type (" + this.getReflectType().getClass() + "): " + this.getReflectType());
        }
        this.b = reflectJavaType0;
        this.c = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection getAnnotations() {
        return this.c;
    }

    @NotNull
    public ReflectJavaType getComponentType() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public JavaType getComponentType() {
        return this.getComponentType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }
}

