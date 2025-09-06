package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeUtils {
    public static class SpecialType extends DelegatingSimpleType {
        public final String b;

        public SpecialType(String s) {
            this.b = s;
        }

        public static void a(int v) {
            Object[] arr_object = new Object[(v == 1 || v == 4 ? 2 : 3)];
            switch(v) {
                case 2: {
                    arr_object[0] = "delegate";
                    break;
                }
                case 3: {
                    arr_object[0] = "kotlinTypeRefiner";
                    break;
                }
                case 1: 
                case 4: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                    break;
                }
                default: {
                    arr_object[0] = "newAttributes";
                }
            }
            switch(v) {
                case 1: {
                    arr_object[1] = "toString";
                    break;
                }
                case 4: {
                    arr_object[1] = "refine";
                    break;
                }
                default: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                }
            }
            switch(v) {
                case 2: {
                    arr_object[2] = "replaceDelegate";
                    break;
                }
                case 3: {
                    arr_object[2] = "refine";
                    break;
                }
                case 1: 
                case 4: {
                    break;
                }
                default: {
                    arr_object[2] = "replaceAttributes";
                }
            }
            String s = String.format((v == 1 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
            IllegalStateException illegalStateException0 = v == 1 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
            throw illegalStateException0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        public SimpleType getDelegate() {
            throw new IllegalStateException(this.b);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public SimpleType makeNullableAsSpecified(boolean z) {
            throw new IllegalStateException(this.b);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public UnwrappedType makeNullableAsSpecified(boolean z) {
            return this.makeNullableAsSpecified(z);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        public KotlinType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            return this.refine(kotlinTypeRefiner0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        public SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            return this.refine(kotlinTypeRefiner0);
        }

        @NotNull
        public SpecialType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            if(kotlinTypeRefiner0 != null) {
                return this;
            }
            SpecialType.a(3);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        public UnwrappedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            return this.refine(kotlinTypeRefiner0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public SimpleType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
            if(typeAttributes0 != null) {
                throw new IllegalStateException(this.b);
            }
            SpecialType.a(0);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public UnwrappedType replaceAttributes(@NotNull TypeAttributes typeAttributes0) {
            return this.replaceAttributes(typeAttributes0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        public DelegatingSimpleType replaceDelegate(@NotNull SimpleType simpleType0) {
            if(simpleType0 != null) {
                throw new IllegalStateException(this.b);
            }
            SpecialType.a(2);
            throw null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public String toString() {
            String s = this.b;
            if(s != null) {
                return s;
            }
            SpecialType.a(1);
            throw null;
        }
    }

    public static final SimpleType CANNOT_INFER_FUNCTION_PARAM_TYPE;
    public static final SimpleType DONT_CARE;
    @NotNull
    public static final SimpleType NO_EXPECTED_TYPE;
    public static final SimpleType UNIT_EXPECTED_TYPE;

    static {
        TypeUtils.DONT_CARE = ErrorUtils.createErrorType(ErrorTypeKind.DONT_CARE, new String[0]);
        TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE = ErrorUtils.createErrorType(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
        TypeUtils.NO_EXPECTED_TYPE = new SpecialType("NO_EXPECTED_TYPE");
        TypeUtils.UNIT_EXPECTED_TYPE = new SpecialType("UNIT_EXPECTED_TYPE");
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 0x30: 
            case 53: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = v == 56 || v == 57 || v == 58 || v == 59 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 0x30: 
            case 53: {
                v1 = 2;
                break;
            }
            default: {
                v1 = v == 56 || v == 57 || v == 58 || v == 59 ? 2 : 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 12: {
                arr_object[0] = "typeConstructor";
                break;
            }
            case 13: {
                arr_object[0] = "unsubstitutedMemberScope";
                break;
            }
            case 14: {
                arr_object[0] = "refinedTypeFactory";
                break;
            }
            case 16: {
                arr_object[0] = "parameters";
                break;
            }
            case 20: {
                arr_object[0] = "subType";
                break;
            }
            case 21: {
                arr_object[0] = "superType";
                break;
            }
            case 22: {
                arr_object[0] = "substitutor";
                break;
            }
            case 24: {
                arr_object[0] = "result";
                break;
            }
            case 0x20: {
                arr_object[0] = "typeArguments";
                break;
            }
            case 0x1F: 
            case 33: {
                arr_object[0] = "clazz";
                break;
            }
            case 34: {
                arr_object[0] = "projections";
                break;
            }
            case 36: {
                arr_object[0] = "a";
                break;
            }
            case 37: {
                arr_object[0] = "b";
                break;
            }
            case 39: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 41: {
                arr_object[0] = "typeParameterConstructors";
                break;
            }
            case 42: {
                arr_object[0] = "specialType";
                break;
            }
            case 43: 
            case 44: {
                arr_object[0] = "isSpecialType";
                break;
            }
            case 45: 
            case 46: {
                arr_object[0] = "parameterDescriptor";
                break;
            }
            case 49: 
            case 50: {
                arr_object[0] = "supertypes";
                break;
            }
            case 0x2F: 
            case 51: {
                arr_object[0] = "numberValueTypeConstructor";
                break;
            }
            case 54: {
                arr_object[0] = "literalTypeConstructor";
                break;
            }
            case 52: 
            case 55: {
                arr_object[0] = "expectedType";
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 0x30: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            }
            default: {
                arr_object[0] = "type";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "makeNullableAsSpecified";
                break;
            }
            case 6: 
            case 7: 
            case 9: {
                arr_object[1] = "makeNullableIfNeeded";
                break;
            }
            case 11: 
            case 15: {
                arr_object[1] = "makeUnsubstitutedType";
                break;
            }
            case 17: {
                arr_object[1] = "getDefaultTypeProjections";
                break;
            }
            case 19: {
                arr_object[1] = "getImmediateSupertypes";
                break;
            }
            case 26: {
                arr_object[1] = "getAllSupertypes";
                break;
            }
            case 35: {
                arr_object[1] = "substituteProjectionsForParameters";
                break;
            }
            case 0x30: {
                arr_object[1] = "getDefaultPrimitiveNumberType";
                break;
            }
            case 53: {
                arr_object[1] = "getPrimitiveNumberType";
                break;
            }
            default: {
                arr_object[1] = v == 56 || v == 57 || v == 58 || v == 59 ? "getPrimitiveNumberType" : "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "makeNullable";
                break;
            }
            case 2: {
                arr_object[2] = "makeNotNullable";
                break;
            }
            case 3: {
                arr_object[2] = "makeNullableAsSpecified";
                break;
            }
            case 5: 
            case 8: {
                arr_object[2] = "makeNullableIfNeeded";
                break;
            }
            case 10: {
                arr_object[2] = "canHaveSubtypes";
                break;
            }
            case 12: 
            case 13: 
            case 14: {
                arr_object[2] = "makeUnsubstitutedType";
                break;
            }
            case 16: {
                arr_object[2] = "getDefaultTypeProjections";
                break;
            }
            case 18: {
                arr_object[2] = "getImmediateSupertypes";
                break;
            }
            case 20: 
            case 21: 
            case 22: {
                arr_object[2] = "createSubstitutedSupertype";
                break;
            }
            case 23: 
            case 24: {
                arr_object[2] = "collectAllSupertypes";
                break;
            }
            case 25: {
                arr_object[2] = "getAllSupertypes";
                break;
            }
            case 27: {
                arr_object[2] = "isNullableType";
                break;
            }
            case 28: {
                arr_object[2] = "acceptsNullable";
                break;
            }
            case 29: {
                arr_object[2] = "hasNullableSuperType";
                break;
            }
            case 30: {
                arr_object[2] = "getClassDescriptor";
                break;
            }
            case 0x1F: 
            case 0x20: {
                arr_object[2] = "substituteParameters";
                break;
            }
            case 33: 
            case 34: {
                arr_object[2] = "substituteProjectionsForParameters";
                break;
            }
            case 36: 
            case 37: {
                arr_object[2] = "equalTypes";
                break;
            }
            case 38: 
            case 39: {
                arr_object[2] = "dependsOnTypeParameters";
                break;
            }
            case 40: 
            case 41: {
                arr_object[2] = "dependsOnTypeConstructors";
                break;
            }
            case 42: 
            case 43: 
            case 44: {
                arr_object[2] = "contains";
                break;
            }
            case 45: 
            case 46: {
                arr_object[2] = "makeStarProjection";
                break;
            }
            case 0x2F: 
            case 49: {
                arr_object[2] = "getDefaultPrimitiveNumberType";
                break;
            }
            case 50: {
                arr_object[2] = "findByFqName";
                break;
            }
            case 51: 
            case 52: 
            case 54: 
            case 55: {
                arr_object[2] = "getPrimitiveNumberType";
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 0x30: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                break;
            }
            case 60: {
                arr_object[2] = "isTypeParameter";
                break;
            }
            case 61: {
                arr_object[2] = "isReifiedTypeParameter";
                break;
            }
            case 62: {
                arr_object[2] = "isNonReifiedTypeParameter";
                break;
            }
            case 0x3F: {
                arr_object[2] = "getTypeParameterDescriptorOrNull";
                break;
            }
            default: {
                arr_object[2] = "noExpectedType";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 0x30: 
            case 53: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = v == 56 || v == 57 || v == 58 || v == 59 ? new IllegalStateException(s1) : new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    public static boolean acceptsNullable(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return kotlinType0.isMarkedNullable() ? true : FlexibleTypesKt.isFlexible(kotlinType0) && TypeUtils.acceptsNullable(FlexibleTypesKt.asFlexibleType(kotlinType0).getUpperBound());
        }
        TypeUtils.a(28);
        throw null;
    }

    public static boolean b(KotlinType kotlinType0, Function1 function10, SmartSet smartSet0) {
        FlexibleType flexibleType0 = null;
        if(function10 != null) {
            if(kotlinType0 == null) {
                return false;
            }
            UnwrappedType unwrappedType0 = kotlinType0.unwrap();
            if(TypeUtils.noExpectedType(kotlinType0)) {
                return ((Boolean)function10.invoke(unwrappedType0)).booleanValue();
            }
            if(smartSet0 != null && smartSet0.contains(kotlinType0)) {
                return false;
            }
            if(((Boolean)function10.invoke(unwrappedType0)).booleanValue()) {
                return true;
            }
            if(smartSet0 == null) {
                smartSet0 = SmartSet.create();
            }
            smartSet0.add(kotlinType0);
            if(unwrappedType0 instanceof FlexibleType) {
                flexibleType0 = (FlexibleType)unwrappedType0;
            }
            if(flexibleType0 != null && (TypeUtils.b(flexibleType0.getLowerBound(), function10, smartSet0) || TypeUtils.b(flexibleType0.getUpperBound(), function10, smartSet0))) {
                return true;
            }
            if(unwrappedType0 instanceof DefinitelyNotNullType && TypeUtils.b(((DefinitelyNotNullType)unwrappedType0).getOriginal(), function10, smartSet0)) {
                return true;
            }
            TypeConstructor typeConstructor0 = kotlinType0.getConstructor();
            if(typeConstructor0 instanceof IntersectionTypeConstructor) {
                for(Object object0: ((IntersectionTypeConstructor)typeConstructor0).getSupertypes()) {
                    if(TypeUtils.b(((KotlinType)object0), function10, smartSet0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            for(Object object1: kotlinType0.getArguments()) {
                if(!((TypeProjection)object1).isStarProjection() && TypeUtils.b(((TypeProjection)object1).getType(), function10, smartSet0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        TypeUtils.a(44);
        throw null;
    }

    public static boolean contains(@Nullable KotlinType kotlinType0, @NotNull Function1 function10) {
        if(function10 != null) {
            return TypeUtils.b(kotlinType0, function10, null);
        }
        TypeUtils.a(43);
        throw null;
    }

    @Nullable
    public static KotlinType createSubstitutedSupertype(@NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1, @NotNull TypeSubstitutor typeSubstitutor0) {
        if(kotlinType0 != null) {
            if(kotlinType1 != null) {
                if(typeSubstitutor0 != null) {
                    KotlinType kotlinType2 = typeSubstitutor0.substitute(kotlinType1, Variance.INVARIANT);
                    return kotlinType2 == null ? null : TypeUtils.makeNullableIfNeeded(kotlinType2, kotlinType0.isMarkedNullable());
                }
                TypeUtils.a(22);
                throw null;
            }
            TypeUtils.a(21);
            throw null;
        }
        TypeUtils.a(20);
        throw null;
    }

    @Nullable
    public static ClassDescriptor getClassDescriptor(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        }
        TypeUtils.a(30);
        throw null;
    }

    @NotNull
    public static List getDefaultTypeProjections(@NotNull List list0) {
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(new TypeProjectionImpl(((TypeParameterDescriptor)object0).getDefaultType()));
            }
            List list1 = CollectionsKt___CollectionsKt.toList(arrayList0);
            if(list1 != null) {
                return list1;
            }
            TypeUtils.a(17);
            throw null;
        }
        TypeUtils.a(16);
        throw null;
    }

    @NotNull
    public static List getImmediateSupertypes(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(kotlinType0);
            Collection collection0 = kotlinType0.getConstructor().getSupertypes();
            List list0 = new ArrayList(collection0.size());
            for(Object object0: collection0) {
                KotlinType kotlinType1 = TypeUtils.createSubstitutedSupertype(kotlinType0, ((KotlinType)object0), typeSubstitutor0);
                if(kotlinType1 != null) {
                    ((ArrayList)list0).add(kotlinType1);
                }
            }
            return list0;
        }
        TypeUtils.a(18);
        throw null;
    }

    @Nullable
    public static TypeParameterDescriptor getTypeParameterDescriptorOrNull(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return kotlinType0.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor ? ((TypeParameterDescriptor)kotlinType0.getConstructor().getDeclarationDescriptor()) : null;
        }
        TypeUtils.a(0x3F);
        throw null;
    }

    public static boolean hasNullableSuperType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            if(kotlinType0.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
                return false;
            }
            for(Object object0: TypeUtils.getImmediateSupertypes(kotlinType0)) {
                if(TypeUtils.isNullableType(((KotlinType)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        TypeUtils.a(29);
        throw null;
    }

    public static boolean isDontCarePlaceholder(@Nullable KotlinType kotlinType0) {
        return kotlinType0 != null && kotlinType0.getConstructor() == TypeUtils.DONT_CARE.getConstructor();
    }

    public static boolean isNullableType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            if(kotlinType0.isMarkedNullable()) {
                return true;
            }
            if(FlexibleTypesKt.isFlexible(kotlinType0) && TypeUtils.isNullableType(FlexibleTypesKt.asFlexibleType(kotlinType0).getUpperBound())) {
                return true;
            }
            if(SpecialTypesKt.isDefinitelyNotNullType(kotlinType0)) {
                return false;
            }
            if(TypeUtils.isTypeParameter(kotlinType0)) {
                return TypeUtils.hasNullableSuperType(kotlinType0);
            }
            if(kotlinType0 instanceof AbstractStubType) {
                TypeParameterDescriptor typeParameterDescriptor0 = ((AbstractStubType)kotlinType0).getOriginalTypeVariable().getOriginalTypeParameter();
                return typeParameterDescriptor0 == null || TypeUtils.hasNullableSuperType(typeParameterDescriptor0.getDefaultType());
            }
            TypeConstructor typeConstructor0 = kotlinType0.getConstructor();
            if(typeConstructor0 instanceof IntersectionTypeConstructor) {
                for(Object object0: typeConstructor0.getSupertypes()) {
                    if(TypeUtils.isNullableType(((KotlinType)object0))) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }
        TypeUtils.a(27);
        throw null;
    }

    public static boolean isTypeParameter(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return TypeUtils.getTypeParameterDescriptorOrNull(kotlinType0) != null || kotlinType0.getConstructor() instanceof NewTypeVariableConstructor;
        }
        TypeUtils.a(60);
        throw null;
    }

    @NotNull
    public static KotlinType makeNotNullable(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return TypeUtils.makeNullableAsSpecified(kotlinType0, false);
        }
        TypeUtils.a(2);
        throw null;
    }

    @NotNull
    public static KotlinType makeNullable(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return TypeUtils.makeNullableAsSpecified(kotlinType0, true);
        }
        TypeUtils.a(1);
        throw null;
    }

    @NotNull
    public static KotlinType makeNullableAsSpecified(@NotNull KotlinType kotlinType0, boolean z) {
        if(kotlinType0 != null) {
            KotlinType kotlinType1 = kotlinType0.unwrap().makeNullableAsSpecified(z);
            if(kotlinType1 != null) {
                return kotlinType1;
            }
            TypeUtils.a(4);
            throw null;
        }
        TypeUtils.a(3);
        throw null;
    }

    @NotNull
    public static KotlinType makeNullableIfNeeded(@NotNull KotlinType kotlinType0, boolean z) {
        if(kotlinType0 != null) {
            if(z) {
                return TypeUtils.makeNullable(kotlinType0);
            }
            if(kotlinType0 != null) {
                return kotlinType0;
            }
            TypeUtils.a(9);
            throw null;
        }
        TypeUtils.a(8);
        throw null;
    }

    @NotNull
    public static SimpleType makeNullableIfNeeded(@NotNull SimpleType simpleType0, boolean z) {
        if(simpleType0 != null) {
            if(z) {
                SimpleType simpleType1 = simpleType0.makeNullableAsSpecified(true);
                if(simpleType1 != null) {
                    return simpleType1;
                }
                TypeUtils.a(6);
                throw null;
            }
            if(simpleType0 != null) {
                return simpleType0;
            }
            TypeUtils.a(7);
            throw null;
        }
        TypeUtils.a(5);
        throw null;
    }

    @NotNull
    public static TypeProjection makeStarProjection(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        if(typeParameterDescriptor0 != null) {
            return new StarProjectionImpl(typeParameterDescriptor0);
        }
        TypeUtils.a(45);
        throw null;
    }

    @NotNull
    public static TypeProjection makeStarProjection(@NotNull TypeParameterDescriptor typeParameterDescriptor0, ErasureTypeAttributes erasureTypeAttributes0) {
        if(typeParameterDescriptor0 != null) {
            return erasureTypeAttributes0.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE ? new TypeProjectionImpl(StarProjectionImplKt.starProjectionType(typeParameterDescriptor0)) : new StarProjectionImpl(typeParameterDescriptor0);
        }
        TypeUtils.a(46);
        throw null;
    }

    @NotNull
    public static SimpleType makeUnsubstitutedType(ClassifierDescriptor classifierDescriptor0, MemberScope memberScope0, Function1 function10) {
        if(ErrorUtils.isError(classifierDescriptor0)) {
            SimpleType simpleType0 = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, new String[]{classifierDescriptor0.toString()});
            if(simpleType0 != null) {
                return simpleType0;
            }
            TypeUtils.a(11);
            throw null;
        }
        return TypeUtils.makeUnsubstitutedType(classifierDescriptor0.getTypeConstructor(), memberScope0, function10);
    }

    @NotNull
    public static SimpleType makeUnsubstitutedType(@NotNull TypeConstructor typeConstructor0, @NotNull MemberScope memberScope0, @NotNull Function1 function10) {
        if(typeConstructor0 != null) {
            if(memberScope0 != null) {
                if(function10 != null) {
                    List list0 = TypeUtils.getDefaultTypeProjections(typeConstructor0.getParameters());
                    SimpleType simpleType0 = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), typeConstructor0, list0, false, memberScope0, function10);
                    if(simpleType0 != null) {
                        return simpleType0;
                    }
                    TypeUtils.a(15);
                    throw null;
                }
                TypeUtils.a(14);
                throw null;
            }
            TypeUtils.a(13);
            throw null;
        }
        TypeUtils.a(12);
        throw null;
    }

    public static boolean noExpectedType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return kotlinType0 == TypeUtils.NO_EXPECTED_TYPE || kotlinType0 == TypeUtils.UNIT_EXPECTED_TYPE;
        }
        TypeUtils.a(0);
        throw null;
    }
}

