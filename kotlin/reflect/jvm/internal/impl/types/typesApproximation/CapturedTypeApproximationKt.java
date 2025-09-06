package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import if.a;
import if.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1747#2,3:179\n1549#2:183\n1620#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
public final class CapturedTypeApproximationKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Variance.values().length];
            try {
                arr_v[Variance.INVARIANT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Variance.IN_VARIANCE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Variance.OUT_VARIANCE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final KotlinType a(KotlinType kotlinType0, ArrayList arrayList0) {
        TypeProjectionImpl typeProjectionImpl0;
        kotlinType0.getArguments().size();
        arrayList0.size();
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object0: arrayList0) {
            b b0 = (b)object0;
            b0.getClass();
            KotlinType kotlinType1 = b0.b;
            KotlinType kotlinType2 = b0.c;
            KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType1, kotlinType2);
            if(Intrinsics.areEqual(kotlinType1, kotlinType2)) {
                typeProjectionImpl0 = new TypeProjectionImpl(kotlinType1);
            }
            else {
                TypeParameterDescriptor typeParameterDescriptor0 = b0.a;
                Variance variance0 = typeParameterDescriptor0.getVariance();
                Variance variance1 = Variance.IN_VARIANCE;
                if(variance0 != variance1) {
                    if(KotlinBuiltIns.isNothing(kotlinType1) && typeParameterDescriptor0.getVariance() != variance1) {
                        typeProjectionImpl0 = new TypeProjectionImpl((Variance.OUT_VARIANCE == typeParameterDescriptor0.getVariance() ? Variance.INVARIANT : Variance.OUT_VARIANCE), kotlinType2);
                    }
                    else if(KotlinBuiltIns.isNullableAny(kotlinType2)) {
                        if(variance1 == typeParameterDescriptor0.getVariance()) {
                            variance1 = Variance.INVARIANT;
                        }
                        typeProjectionImpl0 = new TypeProjectionImpl(variance1, kotlinType1);
                    }
                    else {
                        typeProjectionImpl0 = new TypeProjectionImpl((Variance.OUT_VARIANCE == typeParameterDescriptor0.getVariance() ? Variance.INVARIANT : Variance.OUT_VARIANCE), kotlinType2);
                    }
                }
            }
            arrayList1.add(typeProjectionImpl0);
        }
        return TypeSubstitutionKt.replace$default(kotlinType0, arrayList1, null, null, 6, null);
    }

    @NotNull
    public static final ApproximationBounds approximateCapturedTypes(@NotNull KotlinType kotlinType0) {
        b b0;
        boolean z;
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        if(FlexibleTypesKt.isFlexible(kotlinType0)) {
            ApproximationBounds approximationBounds0 = CapturedTypeApproximationKt.approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType0));
            ApproximationBounds approximationBounds1 = CapturedTypeApproximationKt.approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType0));
            return new ApproximationBounds(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(((KotlinType)approximationBounds0.getLower())), FlexibleTypesKt.upperIfFlexible(((KotlinType)approximationBounds1.getLower()))), kotlinType0), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(((KotlinType)approximationBounds0.getUpper())), FlexibleTypesKt.upperIfFlexible(((KotlinType)approximationBounds1.getUpper()))), kotlinType0));
        }
        TypeConstructor typeConstructor0 = kotlinType0.getConstructor();
        if(CapturedTypeConstructorKt.isCaptured(kotlinType0)) {
            Intrinsics.checkNotNull(typeConstructor0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection typeProjection0 = ((CapturedTypeConstructor)typeConstructor0).getProjection();
            KotlinType kotlinType1 = typeProjection0.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType1, "typeProjection.type");
            KotlinType kotlinType2 = TypeUtils.makeNullableIfNeeded(kotlinType1, kotlinType0.isMarkedNullable());
            Intrinsics.checkNotNullExpressionValue(kotlinType2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            switch(WhenMappings.$EnumSwitchMapping$0[typeProjection0.getProjectionKind().ordinal()]) {
                case 2: {
                    SimpleType simpleType0 = TypeUtilsKt.getBuiltIns(kotlinType0).getNullableAnyType();
                    Intrinsics.checkNotNullExpressionValue(simpleType0, "type.builtIns.nullableAnyType");
                    return new ApproximationBounds(kotlinType2, simpleType0);
                }
                case 3: {
                    SimpleType simpleType1 = TypeUtilsKt.getBuiltIns(kotlinType0).getNothingType();
                    Intrinsics.checkNotNullExpressionValue(simpleType1, "type.builtIns.nothingType");
                    KotlinType kotlinType3 = TypeUtils.makeNullableIfNeeded(simpleType1, kotlinType0.isMarkedNullable());
                    Intrinsics.checkNotNullExpressionValue(kotlinType3, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                    return new ApproximationBounds(kotlinType3, kotlinType2);
                }
                default: {
                    throw new AssertionError("Only nontrivial projections should have been captured, not: " + typeProjection0);
                }
            }
        }
        if(!kotlinType0.getArguments().isEmpty() && kotlinType0.getArguments().size() == typeConstructor0.getParameters().size()) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            Iterable iterable0 = kotlinType0.getArguments();
            List list0 = typeConstructor0.getParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "typeConstructor.parameters");
            Iterator iterator0 = CollectionsKt___CollectionsKt.zip(iterable0, list0).iterator();
            while(true) {
                z = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                TypeProjection typeProjection1 = (TypeProjection)((Pair)object0).component1();
                TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)((Pair)object0).component2();
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor0, "typeParameter");
                switch(WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor0.getVariance(), typeProjection1).ordinal()]) {
                    case 1: {
                        KotlinType kotlinType4 = typeProjection1.getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType4, "type");
                        KotlinType kotlinType5 = typeProjection1.getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType5, "type");
                        b0 = new b(typeParameterDescriptor0, kotlinType4, kotlinType5);
                        break;
                    }
                    case 2: {
                        KotlinType kotlinType6 = typeProjection1.getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType6, "type");
                        SimpleType simpleType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor0).getNullableAnyType();
                        Intrinsics.checkNotNullExpressionValue(simpleType2, "typeParameter.builtIns.nullableAnyType");
                        b0 = new b(typeParameterDescriptor0, kotlinType6, simpleType2);
                        break;
                    }
                    case 3: {
                        SimpleType simpleType3 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor0).getNothingType();
                        Intrinsics.checkNotNullExpressionValue(simpleType3, "typeParameter.builtIns.nothingType");
                        KotlinType kotlinType7 = typeProjection1.getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType7, "type");
                        b0 = new b(typeParameterDescriptor0, simpleType3, kotlinType7);
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if(typeProjection1.isStarProjection()) {
                    arrayList0.add(b0);
                    arrayList1.add(b0);
                }
                else {
                    ApproximationBounds approximationBounds2 = CapturedTypeApproximationKt.approximateCapturedTypes(b0.b);
                    ApproximationBounds approximationBounds3 = CapturedTypeApproximationKt.approximateCapturedTypes(b0.c);
                    ApproximationBounds approximationBounds4 = new ApproximationBounds(new b(b0.a, ((KotlinType)approximationBounds2.component2()), ((KotlinType)approximationBounds3.component1())), new b(b0.a, ((KotlinType)approximationBounds2.component1()), ((KotlinType)approximationBounds3.component2())));
                    arrayList0.add(((b)approximationBounds4.component1()));
                    arrayList1.add(((b)approximationBounds4.component2()));
                }
            }
            if(!arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    ((b)object1).getClass();
                    if(KotlinTypeChecker.DEFAULT.isSubtypeOf(((b)object1).b, ((b)object1).c)) {
                        continue;
                    }
                    goto label_73;
                }
            }
            z = false;
        label_73:
            if(z) {
                KotlinType kotlinType8 = TypeUtilsKt.getBuiltIns(kotlinType0).getNothingType();
                Intrinsics.checkNotNullExpressionValue(kotlinType8, "type.builtIns.nothingType");
                return new ApproximationBounds(kotlinType8, CapturedTypeApproximationKt.a(kotlinType0, arrayList1));
            }
            return new ApproximationBounds(CapturedTypeApproximationKt.a(kotlinType0, arrayList0), CapturedTypeApproximationKt.a(kotlinType0, arrayList1));
        }
        return new ApproximationBounds(kotlinType0, kotlinType0);
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection0, boolean z) {
        if(typeProjection0 == null) {
            return null;
        }
        if(typeProjection0.isStarProjection()) {
            return typeProjection0;
        }
        KotlinType kotlinType0 = typeProjection0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "typeProjection.type");
        if(!TypeUtils.contains(kotlinType0, a.w)) {
            return typeProjection0;
        }
        Variance variance0 = typeProjection0.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(variance0, "typeProjection.projectionKind");
        if(variance0 == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(variance0, ((KotlinType)CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType0).getUpper()));
        }
        if(z) {
            return new TypeProjectionImpl(variance0, ((KotlinType)CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType0).getLower()));
        }
        TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(new CapturedTypeApproximationKt.substituteCapturedTypesWithProjections.typeSubstitutor.1());  // 初始化器: Lkotlin/reflect/jvm/internal/impl/types/TypeConstructorSubstitution;-><init>()V
        Intrinsics.checkNotNullExpressionValue(typeSubstitutor0, "create(object : TypeCons…ojection\n        }\n    })");
        return typeSubstitutor0.substituteWithoutApproximation(typeProjection0);
    }
}

