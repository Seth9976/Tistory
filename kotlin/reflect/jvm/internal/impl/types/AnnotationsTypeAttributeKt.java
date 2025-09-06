package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAnnotationsTypeAttribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n+ 2 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n*L\n1#1,40:1\n42#2:41\n*S KotlinDebug\n*F\n+ 1 AnnotationsTypeAttribute.kt\norg/jetbrains/kotlin/types/AnnotationsTypeAttributeKt\n*L\n37#1:41\n*E\n"})
public final class AnnotationsTypeAttributeKt {
    public static final KProperty[] a;
    public static final NullableArrayMapAccessor b;

    static {
        AnnotationsTypeAttributeKt.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(AnnotationsTypeAttributeKt.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        KClass kClass0 = Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
        NullableArrayMapAccessor nullableArrayMapAccessor0 = TypeAttributes.Companion.generateNullableAccessor(kClass0);
        Intrinsics.checkNotNull(nullableArrayMapAccessor0, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        AnnotationsTypeAttributeKt.b = nullableArrayMapAccessor0;
    }

    @NotNull
    public static final Annotations getAnnotations(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "<this>");
        AnnotationsTypeAttribute annotationsTypeAttribute0 = AnnotationsTypeAttributeKt.getAnnotationsAttribute(typeAttributes0);
        if(annotationsTypeAttribute0 != null) {
            Annotations annotations0 = annotationsTypeAttribute0.getAnnotations();
            return annotations0 == null ? Annotations.Companion.getEMPTY() : annotations0;
        }
        return Annotations.Companion.getEMPTY();
    }

    @Nullable
    public static final AnnotationsTypeAttribute getAnnotationsAttribute(@NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "<this>");
        return (AnnotationsTypeAttribute)AnnotationsTypeAttributeKt.b.getValue(typeAttributes0, AnnotationsTypeAttributeKt.a[0]);
    }
}

