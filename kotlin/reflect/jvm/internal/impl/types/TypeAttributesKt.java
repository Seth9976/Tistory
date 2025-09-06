package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class TypeAttributesKt {
    @NotNull
    public static final TypeAttributes replaceAnnotations(@NotNull TypeAttributes typeAttributes0, @NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(typeAttributes0, "<this>");
        Intrinsics.checkNotNullParameter(annotations0, "newAnnotations");
        if(AnnotationsTypeAttributeKt.getAnnotations(typeAttributes0) == annotations0) {
            return typeAttributes0;
        }
        AnnotationsTypeAttribute annotationsTypeAttribute0 = AnnotationsTypeAttributeKt.getAnnotationsAttribute(typeAttributes0);
        if(annotationsTypeAttribute0 != null) {
            TypeAttributes typeAttributes1 = typeAttributes0.remove(annotationsTypeAttribute0);
            if(typeAttributes1 != null) {
                typeAttributes0 = typeAttributes1;
            }
        }
        return annotations0.iterator().hasNext() || !annotations0.isEmpty() ? typeAttributes0.plus(new AnnotationsTypeAttribute(annotations0)) : typeAttributes0;
    }

    @NotNull
    public static final TypeAttributes toDefaultAttributes(@NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(annotations0, "<this>");
        return DefaultImpls.toAttributes$default(DefaultTypeAttributeTranslator.INSTANCE, annotations0, null, null, 6, null);
    }
}

