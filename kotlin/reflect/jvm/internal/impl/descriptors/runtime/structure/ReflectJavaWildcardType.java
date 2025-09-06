package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaWildcardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaWildcardType.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaWildcardType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    public final WildcardType a;
    public final Collection b;

    public ReflectJavaWildcardType(@NotNull WildcardType wildcardType0) {
        Intrinsics.checkNotNullParameter(wildcardType0, "reflectType");
        super();
        this.a = wildcardType0;
        this.b = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection getAnnotations() {
        return this.b;
    }

    @Nullable
    public ReflectJavaType getBound() {
        Type[] arr_type = this.getReflectType().getUpperBounds();
        Type[] arr_type1 = this.getReflectType().getLowerBounds();
        if(arr_type.length > 1 || arr_type1.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + this.getReflectType());
        }
        if(arr_type1.length == 1) {
            Intrinsics.checkNotNullExpressionValue(arr_type1, "lowerBounds");
            Object object0 = ArraysKt___ArraysKt.single(arr_type1);
            Intrinsics.checkNotNullExpressionValue(object0, "lowerBounds.single()");
            return ReflectJavaType.Factory.create(((Type)object0));
        }
        if(arr_type.length == 1) {
            Intrinsics.checkNotNullExpressionValue(arr_type, "upperBounds");
            Type type0 = (Type)ArraysKt___ArraysKt.single(arr_type);
            if(!Intrinsics.areEqual(type0, Object.class)) {
                Intrinsics.checkNotNullExpressionValue(type0, "ub");
                return ReflectJavaType.Factory.create(type0);
            }
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public JavaType getBound() {
        return this.getBound();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.getReflectType();
    }

    @NotNull
    public WildcardType getReflectType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] arr_type = this.getReflectType().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(arr_type, "reflectType.upperBounds");
        return !Intrinsics.areEqual(ArraysKt___ArraysKt.firstOrNull(arr_type), Object.class);
    }
}

