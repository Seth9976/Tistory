package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {
    public final Class a;
    public final Collection b;

    public ReflectJavaPrimitiveType(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "reflectType");
        super();
        this.a = class0;
        this.b = CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection getAnnotations() {
        return this.b;
    }

    @NotNull
    public Class getReflectType() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.getReflectType();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        return Intrinsics.areEqual(this.getReflectType(), Void.TYPE) ? null : JvmPrimitiveType.get(this.getReflectType().getName()).getPrimitiveType();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }
}

