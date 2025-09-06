package kotlin.reflect.jvm.internal.impl.types;

import ff.k;
import ff.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY;
    public final TypeSubstitution a;

    static {
        TypeSubstitutor.EMPTY = TypeSubstitutor.create(TypeSubstitution.EMPTY);
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution0) {
        if(typeSubstitution0 != null) {
            super();
            this.a = typeSubstitution0;
            return;
        }
        TypeSubstitutor.a(7);
        throw null;
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        if(v == 1 || v == 2 || v == 8 || v == 34 || v == 37 || (v == 11 || v == 12 || v == 13)) {
            s = "@NotNull method %s.%s must not return null";
        }
        else {
            switch(v) {
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: {
                    s = "@NotNull method %s.%s must not return null";
                    break;
                }
                default: {
                    s = v == 29 || v == 30 || v == 0x1F || v == 0x20 || (v == 40 || v == 41 || v == 42) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                }
            }
        }
        if(v == 1 || v == 2 || v == 8 || v == 34 || v == 37 || (v == 11 || v == 12 || v == 13)) {
            v1 = 2;
        }
        else {
            switch(v) {
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: {
                    v1 = 2;
                    break;
                }
                default: {
                    v1 = v == 29 || v == 30 || v == 0x1F || v == 0x20 || (v == 40 || v == 41 || v == 42) ? 2 : 3;
                }
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 3: {
                arr_object[0] = "first";
                break;
            }
            case 4: {
                arr_object[0] = "second";
                break;
            }
            case 5: {
                arr_object[0] = "substitutionContext";
                break;
            }
            case 6: {
                arr_object[0] = "context";
                break;
            }
            case 9: 
            case 14: {
                arr_object[0] = "type";
                break;
            }
            case 10: 
            case 15: {
                arr_object[0] = "howThisTypeIsUsed";
                break;
            }
            case 26: {
                arr_object[0] = "originalType";
                break;
            }
            case 27: {
                arr_object[0] = "substituted";
                break;
            }
            case 18: 
            case 28: {
                arr_object[0] = "originalProjection";
                break;
            }
            case 33: {
                arr_object[0] = "annotations";
                break;
            }
            case 16: 
            case 17: 
            case 36: {
                arr_object[0] = "typeProjection";
                break;
            }
            case 35: 
            case 38: {
                arr_object[0] = "typeParameterVariance";
                break;
            }
            case 39: {
                arr_object[0] = "projectionKind";
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            }
            default: {
                arr_object[0] = "substitution";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "replaceWithNonApproximatingSubstitution";
                break;
            }
            case 2: {
                arr_object[1] = "replaceWithContravariantApproximatingSubstitution";
                break;
            }
            case 8: {
                arr_object[1] = "getSubstitution";
                break;
            }
            case 34: {
                arr_object[1] = "filterOutUnsafeVariance";
                break;
            }
            case 37: {
                arr_object[1] = "combine";
                break;
            }
            default: {
                if(v == 11 || v == 12 || v == 13) {
                    arr_object[1] = "safeSubstitute";
                }
                else {
                    switch(v) {
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: 
                        case 24: 
                        case 25: {
                            arr_object[1] = "unsafeSubstitute";
                            break;
                        }
                        default: {
                            if(v == 29 || v == 30 || v == 0x1F || v == 0x20) {
                                arr_object[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                            }
                            else if(v != 40 && v != 41 && v != 42) {
                                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                            }
                            else {
                                arr_object[1] = "combine";
                            }
                        }
                    }
                }
            }
        }
        switch(v) {
            case 3: 
            case 4: {
                arr_object[2] = "createChainedSubstitutor";
                break;
            }
            case 7: {
                arr_object[2] = "<init>";
                break;
            }
            case 9: 
            case 10: {
                arr_object[2] = "safeSubstitute";
                break;
            }
            case 14: 
            case 15: 
            case 16: {
                arr_object[2] = "substitute";
                break;
            }
            case 17: {
                arr_object[2] = "substituteWithoutApproximation";
                break;
            }
            case 18: {
                arr_object[2] = "unsafeSubstitute";
                break;
            }
            case 26: 
            case 27: 
            case 28: {
                arr_object[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            }
            case 33: {
                arr_object[2] = "filterOutUnsafeVariance";
                break;
            }
            case 35: 
            case 36: 
            case 38: 
            case 39: {
                arr_object[2] = "combine";
                break;
            }
            case 1: 
            case 2: 
            case 8: 
            case 11: 
            case 12: 
            case 13: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 34: 
            case 37: 
            case 40: 
            case 41: 
            case 42: {
                break;
            }
            default: {
                arr_object[2] = "create";
            }
        }
        String s1 = String.format(s, arr_object);
        if(v == 1 || v == 2 || v == 8 || v == 34 || v == 37 || (v == 11 || v == 12 || v == 13)) {
            illegalStateException0 = new IllegalStateException(s1);
        }
        else {
            switch(v) {
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: {
                    illegalStateException0 = new IllegalStateException(s1);
                    break;
                }
                default: {
                    illegalStateException0 = v == 29 || v == 30 || v == 0x1F || v == 0x20 || (v == 40 || v == 41 || v == 42) ? new IllegalStateException(s1) : new IllegalArgumentException(s1);
                }
            }
        }
        throw illegalStateException0;
    }

    public static int b(Variance variance0, Variance variance1) {
        Variance variance2 = Variance.IN_VARIANCE;
        if(variance0 == variance2 && variance1 == Variance.OUT_VARIANCE) {
            return 3;
        }
        return variance0 != Variance.OUT_VARIANCE || variance1 != variance2 ? 1 : 2;
    }

    public static String c(Object object0) {
        try {
            return object0.toString();
        }
        catch(Throwable throwable0) {
            if(ExceptionUtilsKt.isProcessCanceledException(throwable0)) {
                throw (RuntimeException)throwable0;
            }
            return "[Exception while computing toString(): " + throwable0 + "]";
        }
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance0, @NotNull TypeProjection typeProjection0) {
        if(variance0 != null) {
            if(typeProjection0 != null) {
                if(typeProjection0.isStarProjection()) {
                    Variance variance1 = Variance.OUT_VARIANCE;
                    if(variance1 != null) {
                        return variance1;
                    }
                    TypeSubstitutor.a(37);
                    throw null;
                }
                return TypeSubstitutor.combine(variance0, typeProjection0.getProjectionKind());
            }
            TypeSubstitutor.a(36);
            throw null;
        }
        TypeSubstitutor.a(35);
        throw null;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance0, @NotNull Variance variance1) {
        if(variance0 != null) {
            if(variance1 != null) {
                Variance variance2 = Variance.INVARIANT;
                if(variance0 == variance2) {
                    if(variance1 != null) {
                        return variance1;
                    }
                    TypeSubstitutor.a(40);
                    throw null;
                }
                if(variance1 == variance2) {
                    if(variance0 != null) {
                        return variance0;
                    }
                    TypeSubstitutor.a(41);
                    throw null;
                }
                if(variance0 != variance1) {
                    throw new AssertionError("Variance conflict: type parameter variance \'" + variance0 + "\' and projection kind \'" + variance1 + "\' cannot be combined");
                }
                if(variance1 != null) {
                    return variance1;
                }
                TypeSubstitutor.a(42);
                throw null;
            }
            TypeSubstitutor.a(39);
            throw null;
        }
        TypeSubstitutor.a(38);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return TypeSubstitutor.create(TypeConstructorSubstitution.create(kotlinType0.getConstructor(), kotlinType0.getArguments()));
        }
        TypeSubstitutor.a(6);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution0) {
        if(typeSubstitution0 != null) {
            return new TypeSubstitutor(typeSubstitution0);
        }
        TypeSubstitutor.a(0);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution0, @NotNull TypeSubstitution typeSubstitution1) {
        if(typeSubstitution0 != null) {
            if(typeSubstitution1 != null) {
                return TypeSubstitutor.create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution0, typeSubstitution1));
            }
            TypeSubstitutor.a(4);
            throw null;
        }
        TypeSubstitutor.a(3);
        throw null;
    }

    public final TypeProjection d(TypeProjection typeProjection0, TypeParameterDescriptor typeParameterDescriptor0, int v) {
        KotlinType kotlinType0 = null;
        if(typeProjection0 != null) {
            TypeSubstitution typeSubstitution0 = this.a;
            if(v > 100) {
                throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + TypeSubstitutor.c(typeProjection0) + "; substitution: " + TypeSubstitutor.c(typeSubstitution0));
            }
            if(typeProjection0.isStarProjection()) {
                return typeProjection0;
            }
            KotlinType kotlinType1 = typeProjection0.getType();
            if(kotlinType1 instanceof TypeWithEnhancement) {
                UnwrappedType unwrappedType0 = ((TypeWithEnhancement)kotlinType1).getOrigin();
                KotlinType kotlinType2 = ((TypeWithEnhancement)kotlinType1).getEnhancement();
                TypeProjection typeProjection1 = this.d(new TypeProjectionImpl(typeProjection0.getProjectionKind(), unwrappedType0), typeParameterDescriptor0, v + 1);
                if(typeProjection1.isStarProjection()) {
                    return typeProjection1;
                }
                KotlinType kotlinType3 = this.substitute(kotlinType2, typeProjection0.getProjectionKind());
                UnwrappedType unwrappedType1 = TypeWithEnhancementKt.wrapEnhancement(typeProjection1.getType().unwrap(), kotlinType3);
                return new TypeProjectionImpl(typeProjection1.getProjectionKind(), unwrappedType1);
            }
            if(!DynamicTypesKt.isDynamic(kotlinType1) && !(kotlinType1.unwrap() instanceof RawType)) {
                TypeProjection typeProjection2 = typeSubstitution0.get(kotlinType1);
                if(typeProjection2 == null) {
                    typeProjection2 = null;
                }
                else if(kotlinType1.getAnnotations().hasAnnotation(FqNames.unsafeVariance)) {
                    TypeConstructor typeConstructor0 = typeProjection2.getType().getConstructor();
                    if(typeConstructor0 instanceof NewCapturedTypeConstructor) {
                        TypeProjection typeProjection3 = ((NewCapturedTypeConstructor)typeConstructor0).getProjection();
                        Variance variance0 = typeProjection3.getProjectionKind();
                        if(TypeSubstitutor.b(typeProjection0.getProjectionKind(), variance0) == 3) {
                            typeProjection2 = new TypeProjectionImpl(typeProjection3.getType());
                        }
                        else if(typeParameterDescriptor0 != null && TypeSubstitutor.b(typeParameterDescriptor0.getVariance(), variance0) == 3) {
                            typeProjection2 = new TypeProjectionImpl(typeProjection3.getType());
                        }
                    }
                }
                Variance variance1 = typeProjection0.getProjectionKind();
                if(typeProjection2 == null && FlexibleTypesKt.isFlexible(kotlinType1) && !TypeCapabilitiesKt.isCustomTypeParameter(kotlinType1)) {
                    FlexibleType flexibleType0 = FlexibleTypesKt.asFlexibleType(kotlinType1);
                    TypeProjection typeProjection4 = this.d(new TypeProjectionImpl(variance1, flexibleType0.getLowerBound()), typeParameterDescriptor0, v + 1);
                    TypeProjection typeProjection5 = this.d(new TypeProjectionImpl(variance1, flexibleType0.getUpperBound()), typeParameterDescriptor0, v + 1);
                    Variance variance2 = typeProjection4.getProjectionKind();
                    return typeProjection4.getType() == flexibleType0.getLowerBound() && typeProjection5.getType() == flexibleType0.getUpperBound() ? typeProjection0 : new TypeProjectionImpl(variance2, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjection4.getType()), TypeSubstitutionKt.asSimpleType(typeProjection5.getType())));
                }
                if(!KotlinBuiltIns.isNothing(kotlinType1) && !KotlinTypeKt.isError(kotlinType1)) {
                    if(typeProjection2 != null) {
                        int v2 = TypeSubstitutor.b(variance1, typeProjection2.getProjectionKind());
                        if(!CapturedTypeConstructorKt.isCaptured(kotlinType1)) {
                            switch(a.c(v2)) {
                                case 1: {
                                    SimpleType simpleType0 = kotlinType1.getConstructor().getBuiltIns().getNullableAnyType();
                                    return new TypeProjectionImpl(Variance.OUT_VARIANCE, simpleType0);
                                }
                                case 2: {
                                    throw new l("Out-projection in in-position");  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                                }
                            }
                        }
                        CustomTypeParameter customTypeParameter0 = TypeCapabilitiesKt.getCustomTypeParameter(kotlinType1);
                        if(typeProjection2.isStarProjection()) {
                            return typeProjection2;
                        }
                        KotlinType kotlinType4 = customTypeParameter0 == null ? TypeUtils.makeNullableIfNeeded(typeProjection2.getType(), kotlinType1.isMarkedNullable()) : customTypeParameter0.substitutionResult(typeProjection2.getType());
                        if(!kotlinType1.getAnnotations().isEmpty()) {
                            Annotations annotations0 = typeSubstitution0.filterAnnotations(kotlinType1.getAnnotations());
                            if(annotations0 != null) {
                                if(annotations0.hasAnnotation(FqNames.unsafeVariance)) {
                                    annotations0 = new FilteredAnnotations(annotations0, new k());  // 初始化器: Ljava/lang/Object;-><init>()V
                                }
                                kotlinType4 = TypeUtilsKt.replaceAnnotations(kotlinType4, new CompositeAnnotations(new Annotations[]{kotlinType4.getAnnotations(), annotations0}));
                                goto label_63;
                            }
                            TypeSubstitutor.a(33);
                            throw null;
                        }
                    label_63:
                        if(v2 == 1) {
                            variance1 = TypeSubstitutor.combine(variance1, typeProjection2.getProjectionKind());
                        }
                        return new TypeProjectionImpl(variance1, kotlinType4);
                    }
                    KotlinType kotlinType5 = typeProjection0.getType();
                    Variance variance3 = typeProjection0.getProjectionKind();
                    if(kotlinType5.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
                        return typeProjection0;
                    }
                    SimpleType simpleType1 = SpecialTypesKt.getAbbreviation(kotlinType5);
                    if(simpleType1 != null) {
                        kotlinType0 = this.replaceWithNonApproximatingSubstitution().substitute(simpleType1, Variance.INVARIANT);
                    }
                    List list0 = kotlinType5.getConstructor().getParameters();
                    List list1 = kotlinType5.getArguments();
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    boolean z = false;
                    for(int v1 = 0; v1 < list0.size(); ++v1) {
                        TypeParameterDescriptor typeParameterDescriptor1 = (TypeParameterDescriptor)list0.get(v1);
                        TypeProjection typeProjection6 = (TypeProjection)list1.get(v1);
                        TypeProjection typeProjection7 = this.d(typeProjection6, typeParameterDescriptor1, v + 1);
                        switch(a.c(TypeSubstitutor.b(typeParameterDescriptor1.getVariance(), typeProjection7.getProjectionKind()))) {
                            case 0: {
                                Variance variance4 = typeParameterDescriptor1.getVariance();
                                Variance variance5 = Variance.INVARIANT;
                                if(variance4 != variance5 && !typeProjection7.isStarProjection()) {
                                    typeProjection7 = new TypeProjectionImpl(variance5, typeProjection7.getType());
                                }
                                break;
                            }
                            case 1: 
                            case 2: {
                                typeProjection7 = TypeUtils.makeStarProjection(typeParameterDescriptor1);
                            }
                        }
                        if(typeProjection7 != typeProjection6) {
                            z = true;
                        }
                        arrayList0.add(typeProjection7);
                    }
                    if(z) {
                        list1 = arrayList0;
                    }
                    KotlinType kotlinType6 = TypeSubstitutionKt.replace(kotlinType5, list1, typeSubstitution0.filterAnnotations(kotlinType5.getAnnotations()));
                    if(kotlinType6 instanceof SimpleType && kotlinType0 instanceof SimpleType) {
                        kotlinType6 = SpecialTypesKt.withAbbreviation(((SimpleType)kotlinType6), ((SimpleType)kotlinType0));
                    }
                    return new TypeProjectionImpl(variance3, kotlinType6);
                }
            }
            return typeProjection0;
        }
        TypeSubstitutor.a(18);
        throw null;
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution0 = this.a;
        if(typeSubstitution0 != null) {
            return typeSubstitution0;
        }
        TypeSubstitutor.a(8);
        throw null;
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    // 去混淆评级： 低(20)
    @NotNull
    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        return !(this.a instanceof IndexedParametersSubstitution) || !this.a.approximateContravariantCapturedTypes() ? this : new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution)this.a).getParameters(), ((IndexedParametersSubstitution)this.a).getArguments(), false));
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType0, @NotNull Variance variance0) {
        KotlinType kotlinType1;
        if(kotlinType0 != null) {
            if(variance0 != null) {
                if(this.isEmpty()) {
                    if(kotlinType0 != null) {
                        return kotlinType0;
                    }
                    TypeSubstitutor.a(11);
                    throw null;
                }
                try {
                    kotlinType1 = this.d(new TypeProjectionImpl(variance0, kotlinType0), null, 0).getType();
                }
                catch(l l0) {
                    KotlinType kotlinType2 = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, new String[]{l0.getMessage()});
                    if(kotlinType2 != null) {
                        return kotlinType2;
                    }
                    TypeSubstitutor.a(13);
                    throw null;
                }
                if(kotlinType1 != null) {
                    return kotlinType1;
                }
                TypeSubstitutor.a(12);
                throw null;
            }
            TypeSubstitutor.a(10);
            throw null;
        }
        TypeSubstitutor.a(9);
        throw null;
    }

    @Nullable
    public KotlinType substitute(@NotNull KotlinType kotlinType0, @NotNull Variance variance0) {
        if(kotlinType0 != null) {
            if(variance0 != null) {
                TypeProjection typeProjection0 = this.substitute(new TypeProjectionImpl(variance0, this.getSubstitution().prepareTopLevelType(kotlinType0, variance0)));
                return typeProjection0 == null ? null : typeProjection0.getType();
            }
            TypeSubstitutor.a(15);
            throw null;
        }
        TypeSubstitutor.a(14);
        throw null;
    }

    @Nullable
    public TypeProjection substitute(@NotNull TypeProjection typeProjection0) {
        if(typeProjection0 != null) {
            TypeProjection typeProjection1 = this.substituteWithoutApproximation(typeProjection0);
            return this.a.approximateCapturedTypes() || this.a.approximateContravariantCapturedTypes() ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjection1, this.a.approximateContravariantCapturedTypes()) : typeProjection1;
        }
        TypeSubstitutor.a(16);
        throw null;
    }

    @Nullable
    public TypeProjection substituteWithoutApproximation(@NotNull TypeProjection typeProjection0) {
        if(typeProjection0 != null) {
            if(this.isEmpty()) {
                return typeProjection0;
            }
            try {
                return this.d(typeProjection0, null, 0);
            }
            catch(l unused_ex) {
                return null;
            }
        }
        TypeSubstitutor.a(17);
        throw null;
    }
}

