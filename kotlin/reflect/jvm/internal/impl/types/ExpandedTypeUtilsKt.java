package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ExpandedTypeUtilsKt {
    public static final KotlinTypeMarker a(TypeSystemCommonBackendContext typeSystemCommonBackendContext0, KotlinTypeMarker kotlinTypeMarker0, HashSet hashSet0) {
        KotlinTypeMarker kotlinTypeMarker2;
        TypeConstructorMarker typeConstructorMarker0 = typeSystemCommonBackendContext0.typeConstructor(kotlinTypeMarker0);
        if(!hashSet0.add(typeConstructorMarker0)) {
            return null;
        }
        TypeParameterMarker typeParameterMarker0 = typeSystemCommonBackendContext0.getTypeParameterClassifier(typeConstructorMarker0);
        if(typeParameterMarker0 != null) {
            KotlinTypeMarker kotlinTypeMarker1 = typeSystemCommonBackendContext0.getRepresentativeUpperBound(typeParameterMarker0);
            kotlinTypeMarker2 = ExpandedTypeUtilsKt.a(typeSystemCommonBackendContext0, kotlinTypeMarker1, hashSet0);
            if(kotlinTypeMarker2 != null) {
                boolean z = typeSystemCommonBackendContext0.isInlineClass(typeSystemCommonBackendContext0.typeConstructor(kotlinTypeMarker1)) || kotlinTypeMarker1 instanceof SimpleTypeMarker && typeSystemCommonBackendContext0.isPrimitiveType(((SimpleTypeMarker)kotlinTypeMarker1));
                if(kotlinTypeMarker2 instanceof SimpleTypeMarker && typeSystemCommonBackendContext0.isPrimitiveType(((SimpleTypeMarker)kotlinTypeMarker2)) && typeSystemCommonBackendContext0.isNullableType(kotlinTypeMarker0) && z) {
                    return typeSystemCommonBackendContext0.makeNullable(kotlinTypeMarker1);
                }
                return typeSystemCommonBackendContext0.isNullableType(kotlinTypeMarker2) || !typeSystemCommonBackendContext0.isMarkedNullable(kotlinTypeMarker0) ? kotlinTypeMarker2 : typeSystemCommonBackendContext0.makeNullable(kotlinTypeMarker2);
            }
            return null;
        }
        if(typeSystemCommonBackendContext0.isInlineClass(typeConstructorMarker0)) {
            KotlinTypeMarker kotlinTypeMarker3 = typeSystemCommonBackendContext0.getUnsubstitutedUnderlyingType(kotlinTypeMarker0);
            if(kotlinTypeMarker3 == null) {
                return null;
            }
            kotlinTypeMarker2 = ExpandedTypeUtilsKt.a(typeSystemCommonBackendContext0, kotlinTypeMarker3, hashSet0);
            if(kotlinTypeMarker2 == null) {
                return null;
            }
            if(!typeSystemCommonBackendContext0.isNullableType(kotlinTypeMarker0)) {
                return kotlinTypeMarker2;
            }
            return typeSystemCommonBackendContext0.isNullableType(kotlinTypeMarker2) || kotlinTypeMarker2 instanceof SimpleTypeMarker && typeSystemCommonBackendContext0.isPrimitiveType(((SimpleTypeMarker)kotlinTypeMarker2)) ? kotlinTypeMarker0 : typeSystemCommonBackendContext0.makeNullable(kotlinTypeMarker2);
        }
        return kotlinTypeMarker0;
    }

    @Nullable
    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "inlineClassType");
        return ExpandedTypeUtilsKt.a(typeSystemCommonBackendContext0, kotlinTypeMarker0, new HashSet());
    }
}

