package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,5:222\n112#2,7:228\n1549#3:219\n1620#3,2:220\n1622#3:227\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,5\n214#1:228,7\n214#1:219\n214#1:220,2\n214#1:227\n*E\n"})
public final class SpecialTypesKt {
    public static final SimpleType a(UnwrappedType unwrappedType0) {
        TypeConstructor typeConstructor0 = unwrappedType0.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor0 = typeConstructor0 instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor)typeConstructor0) : null;
        if(intersectionTypeConstructor0 == null) {
            return null;
        }
        Iterable iterable0 = intersectionTypeConstructor0.getSupertypes();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        boolean z = false;
        for(Object object0: iterable0) {
            KotlinType kotlinType0 = (KotlinType)object0;
            if(TypeUtils.isNullableType(kotlinType0)) {
                kotlinType0 = SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(kotlinType0.unwrap(), false, 1, null);
                z = true;
            }
            arrayList0.add(kotlinType0);
        }
        if(!z) {
            throw new NullPointerException();
        }
        KotlinType kotlinType1 = intersectionTypeConstructor0.getAlternativeType();
        if(kotlinType1 == null) {
            kotlinType1 = null;
        }
        else if(TypeUtils.isNullableType(kotlinType1)) {
            kotlinType1 = SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(kotlinType1.unwrap(), false, 1, null);
        }
        IntersectionTypeConstructor intersectionTypeConstructor1 = new IntersectionTypeConstructor(arrayList0).setAlternative(kotlinType1);
        return intersectionTypeConstructor1 == null ? null : intersectionTypeConstructor1.createType();
    }

    @Nullable
    public static final AbbreviatedType getAbbreviatedType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        return unwrappedType0 instanceof AbbreviatedType ? ((AbbreviatedType)unwrappedType0) : null;
    }

    @Nullable
    public static final SimpleType getAbbreviation(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        AbbreviatedType abbreviatedType0 = SpecialTypesKt.getAbbreviatedType(kotlinType0);
        return abbreviatedType0 == null ? null : abbreviatedType0.getAbbreviation();
    }

    public static final boolean isDefinitelyNotNullType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return kotlinType0.unwrap() instanceof DefinitelyNotNullType;
    }

    @NotNull
    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(@NotNull UnwrappedType unwrappedType0, boolean z) {
        Intrinsics.checkNotNullParameter(unwrappedType0, "<this>");
        UnwrappedType unwrappedType1 = Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, unwrappedType0, z, false, 4, null);
        if(unwrappedType1 == null) {
            unwrappedType1 = SpecialTypesKt.a(unwrappedType0);
            return unwrappedType1 == null ? unwrappedType0.makeNullableAsSpecified(false) : unwrappedType1;
        }
        return unwrappedType1;
    }

    public static UnwrappedType makeDefinitelyNotNullOrNotNull$default(UnwrappedType unwrappedType0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(unwrappedType0, z);
    }

    @NotNull
    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(@NotNull SimpleType simpleType0, boolean z) {
        Intrinsics.checkNotNullParameter(simpleType0, "<this>");
        SimpleType simpleType1 = Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType0, z, false, 4, null);
        if(simpleType1 == null) {
            simpleType1 = SpecialTypesKt.a(simpleType0);
            return simpleType1 == null ? simpleType0.makeNullableAsSpecified(false) : simpleType1;
        }
        return simpleType1;
    }

    public static SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(SimpleType simpleType0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType0, z);
    }

    @NotNull
    public static final SimpleType withAbbreviation(@NotNull SimpleType simpleType0, @NotNull SimpleType simpleType1) {
        Intrinsics.checkNotNullParameter(simpleType0, "<this>");
        Intrinsics.checkNotNullParameter(simpleType1, "abbreviatedType");
        return KotlinTypeKt.isError(simpleType0) ? simpleType0 : new AbbreviatedType(simpleType0, simpleType1);
    }

    @NotNull
    public static final NewCapturedType withNotNullProjection(@NotNull NewCapturedType newCapturedType0) {
        Intrinsics.checkNotNullParameter(newCapturedType0, "<this>");
        return new NewCapturedType(newCapturedType0.getCaptureStatus(), newCapturedType0.getConstructor(), newCapturedType0.getLowerType(), newCapturedType0.getAttributes(), newCapturedType0.isMarkedNullable(), true);
    }
}

