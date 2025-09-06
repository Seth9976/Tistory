package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.selection.g1;
import d0.s;
import ff.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1179#2,2:159\n1253#2,4:161\n1549#2:166\n1620#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
public final class TypeParameterUpperBoundEraser {
    @SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n261#2,14:159\n276#2:177\n1549#3:173\n1620#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KotlinType replaceArgumentsOfUpperBound(@NotNull KotlinType kotlinType0, @NotNull TypeSubstitutor typeSubstitutor0, @Nullable Set set0, boolean z) {
            UnwrappedType unwrappedType1;
            Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitutor0, "substitutor");
            UnwrappedType unwrappedType0 = kotlinType0.unwrap();
            if(unwrappedType0 instanceof FlexibleType) {
                SimpleType simpleType0 = ((FlexibleType)unwrappedType0).getLowerBound();
                if(!simpleType0.getConstructor().getParameters().isEmpty() && simpleType0.getConstructor().getDeclarationDescriptor() != null) {
                    List list0 = simpleType0.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(list0, "constructor.parameters");
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                    for(Object object0: list0) {
                        TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)object0;
                        TypeProjection typeProjection0 = (TypeProjection)CollectionsKt___CollectionsKt.getOrNull(kotlinType0.getArguments(), typeParameterDescriptor0.getIndex());
                        if(!z || typeProjection0 == null) {
                        label_19:
                            if(typeProjection0 == null || set0 != null && set0.contains(typeParameterDescriptor0)) {
                                typeProjection0 = new StarProjectionImpl(typeParameterDescriptor0);
                            }
                            else {
                                TypeSubstitution typeSubstitution0 = typeSubstitutor0.getSubstitution();
                                KotlinType kotlinType2 = typeProjection0.getType();
                                Intrinsics.checkNotNullExpressionValue(kotlinType2, "argument.type");
                                if(typeSubstitution0.get(kotlinType2) == null) {
                                    typeProjection0 = new StarProjectionImpl(typeParameterDescriptor0);
                                }
                            }
                        }
                        else {
                            KotlinType kotlinType1 = typeProjection0.getType();
                            if(kotlinType1 == null) {
                                goto label_19;
                            }
                            else {
                                Intrinsics.checkNotNullExpressionValue(kotlinType1, "type");
                                if(TypeUtilsKt.containsTypeParameter(kotlinType1)) {
                                    goto label_19;
                                }
                            }
                        }
                        arrayList0.add(typeProjection0);
                    }
                    simpleType0 = TypeSubstitutionKt.replace$default(simpleType0, arrayList0, null, 2, null);
                }
                SimpleType simpleType1 = ((FlexibleType)unwrappedType0).getUpperBound();
                if(!simpleType1.getConstructor().getParameters().isEmpty() && simpleType1.getConstructor().getDeclarationDescriptor() != null) {
                    List list1 = simpleType1.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(list1, "constructor.parameters");
                    ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                    for(Object object1: list1) {
                        TypeParameterDescriptor typeParameterDescriptor1 = (TypeParameterDescriptor)object1;
                        TypeProjection typeProjection1 = (TypeProjection)CollectionsKt___CollectionsKt.getOrNull(kotlinType0.getArguments(), typeParameterDescriptor1.getIndex());
                        if(!z || typeProjection1 == null) {
                        label_45:
                            if(typeProjection1 == null || set0 != null && set0.contains(typeParameterDescriptor1)) {
                                typeProjection1 = new StarProjectionImpl(typeParameterDescriptor1);
                            }
                            else {
                                TypeSubstitution typeSubstitution1 = typeSubstitutor0.getSubstitution();
                                KotlinType kotlinType4 = typeProjection1.getType();
                                Intrinsics.checkNotNullExpressionValue(kotlinType4, "argument.type");
                                if(typeSubstitution1.get(kotlinType4) == null) {
                                    typeProjection1 = new StarProjectionImpl(typeParameterDescriptor1);
                                }
                            }
                        }
                        else {
                            KotlinType kotlinType3 = typeProjection1.getType();
                            if(kotlinType3 == null) {
                                goto label_45;
                            }
                            else {
                                Intrinsics.checkNotNullExpressionValue(kotlinType3, "type");
                                if(TypeUtilsKt.containsTypeParameter(kotlinType3)) {
                                    goto label_45;
                                }
                            }
                        }
                        arrayList1.add(typeProjection1);
                    }
                    simpleType1 = TypeSubstitutionKt.replace$default(simpleType1, arrayList1, null, 2, null);
                }
                unwrappedType1 = KotlinTypeFactory.flexibleType(simpleType0, simpleType1);
            }
            else if(!(unwrappedType0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            else if(((SimpleType)unwrappedType0).getConstructor().getParameters().isEmpty() || ((SimpleType)unwrappedType0).getConstructor().getDeclarationDescriptor() == null) {
                unwrappedType1 = (SimpleType)unwrappedType0;
            }
            else {
                List list2 = ((SimpleType)unwrappedType0).getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(list2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
                for(Object object2: list2) {
                    TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor)object2;
                    TypeProjection typeProjection2 = (TypeProjection)CollectionsKt___CollectionsKt.getOrNull(kotlinType0.getArguments(), typeParameterDescriptor2.getIndex());
                    if(!z || typeProjection2 == null) {
                    label_73:
                        if(typeProjection2 == null || set0 != null && set0.contains(typeParameterDescriptor2)) {
                            typeProjection2 = new StarProjectionImpl(typeParameterDescriptor2);
                        }
                        else {
                            TypeSubstitution typeSubstitution2 = typeSubstitutor0.getSubstitution();
                            KotlinType kotlinType6 = typeProjection2.getType();
                            Intrinsics.checkNotNullExpressionValue(kotlinType6, "argument.type");
                            if(typeSubstitution2.get(kotlinType6) == null) {
                                typeProjection2 = new StarProjectionImpl(typeParameterDescriptor2);
                            }
                        }
                    }
                    else {
                        KotlinType kotlinType5 = typeProjection2.getType();
                        if(kotlinType5 == null) {
                            goto label_73;
                        }
                        else {
                            Intrinsics.checkNotNullExpressionValue(kotlinType5, "type");
                            if(TypeUtilsKt.containsTypeParameter(kotlinType5)) {
                                goto label_73;
                            }
                        }
                    }
                    arrayList2.add(typeProjection2);
                }
                unwrappedType1 = TypeSubstitutionKt.replace$default(((SimpleType)unwrappedType0), arrayList2, null, 2, null);
            }
            KotlinType kotlinType7 = typeSubstitutor0.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedType1, unwrappedType0), Variance.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(kotlinType7, "substitutor.safeSubstitu…s, Variance.OUT_VARIANCE)");
            return kotlinType7;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ErasureProjectionComputer a;
    public final TypeParameterErasureOptions b;
    public final Lazy c;
    public final MemoizedFunctionToNotNull d;

    static {
        TypeParameterUpperBoundEraser.Companion = new Companion(null);
    }

    public TypeParameterUpperBoundEraser(@NotNull ErasureProjectionComputer erasureProjectionComputer0, @NotNull TypeParameterErasureOptions typeParameterErasureOptions0) {
        Intrinsics.checkNotNullParameter(erasureProjectionComputer0, "projectionComputer");
        Intrinsics.checkNotNullParameter(typeParameterErasureOptions0, "options");
        super();
        this.a = erasureProjectionComputer0;
        this.b = typeParameterErasureOptions0;
        LockBasedStorageManager lockBasedStorageManager0 = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.c = c.lazy(new s(this, 14));
        MemoizedFunctionToNotNull memoizedFunctionToNotNull0 = lockBasedStorageManager0.createMemoizedFunction(new g1(this, 28));
        Intrinsics.checkNotNullExpressionValue(memoizedFunctionToNotNull0, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.d = memoizedFunctionToNotNull0;
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer0, TypeParameterErasureOptions typeParameterErasureOptions0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            typeParameterErasureOptions0 = new TypeParameterErasureOptions(false, false);
        }
        this(erasureProjectionComputer0, typeParameterErasureOptions0);
    }

    public final KotlinType a(ErasureTypeAttributes erasureTypeAttributes0) {
        SimpleType simpleType0 = erasureTypeAttributes0.getDefaultType();
        if(simpleType0 != null) {
            KotlinType kotlinType0 = TypeUtilsKt.replaceArgumentsWithStarProjections(simpleType0);
            if(kotlinType0 != null) {
                return kotlinType0;
            }
        }
        return (ErrorType)this.c.getValue();
    }

    public static final KotlinType access$getErasedUpperBoundInternal(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser0, TypeParameterDescriptor typeParameterDescriptor0, ErasureTypeAttributes erasureTypeAttributes0) {
        TypeProjection typeProjection0;
        typeParameterUpperBoundEraser0.getClass();
        Set set0 = erasureTypeAttributes0.getVisitedTypeParameters();
        if(set0 != null && set0.contains(typeParameterDescriptor0.getOriginal())) {
            return typeParameterUpperBoundEraser0.a(erasureTypeAttributes0);
        }
        SimpleType simpleType0 = typeParameterDescriptor0.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "typeParameter.defaultType");
        Iterable iterable0 = TypeUtilsKt.extractTypeParametersFromUpperBounds(simpleType0, set0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            TypeParameterDescriptor typeParameterDescriptor1 = (TypeParameterDescriptor)object0;
            if(set0 == null || !set0.contains(typeParameterDescriptor1)) {
                KotlinType kotlinType0 = typeParameterUpperBoundEraser0.getErasedUpperBound(typeParameterDescriptor1, erasureTypeAttributes0.withNewVisitedTypeParameter(typeParameterDescriptor0));
                typeProjection0 = typeParameterUpperBoundEraser0.a.computeProjection(typeParameterDescriptor1, erasureTypeAttributes0, typeParameterUpperBoundEraser0, kotlinType0);
            }
            else {
                typeProjection0 = TypeUtils.makeStarProjection(typeParameterDescriptor1, erasureTypeAttributes0);
                Intrinsics.checkNotNullExpressionValue(typeProjection0, "makeStarProjection(it, typeAttr)");
            }
            Pair pair0 = TuplesKt.to(typeParameterDescriptor1.getTypeConstructor(), typeProjection0);
            linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
        }
        TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap0, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(typeSubstitutor0, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List list0 = typeParameterDescriptor0.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(list0, "typeParameter.upperBounds");
        Set set1 = typeParameterUpperBoundEraser0.b(typeSubstitutor0, list0, erasureTypeAttributes0);
        if(!set1.isEmpty()) {
            if(!typeParameterUpperBoundEraser0.b.getIntersectUpperBounds()) {
                if(set1.size() != 1) {
                    throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
                }
                return (KotlinType)CollectionsKt___CollectionsKt.single(set1);
            }
            Iterable iterable1 = CollectionsKt___CollectionsKt.toList(set1);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
            for(Object object1: iterable1) {
                arrayList0.add(((KotlinType)object1).unwrap());
            }
            return IntersectionTypeKt.intersectTypes(arrayList0);
        }
        return typeParameterUpperBoundEraser0.a(erasureTypeAttributes0);
    }

    public final Set b(TypeSubstitutor typeSubstitutor0, List list0, ErasureTypeAttributes erasureTypeAttributes0) {
        Set set0 = e0.createSetBuilder();
        for(Object object0: list0) {
            KotlinType kotlinType0 = (KotlinType)object0;
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            TypeParameterErasureOptions typeParameterErasureOptions0 = this.b;
            if(classifierDescriptor0 instanceof ClassDescriptor) {
                Set set1 = erasureTypeAttributes0.getVisitedTypeParameters();
                set0.add(TypeParameterUpperBoundEraser.Companion.replaceArgumentsOfUpperBound(kotlinType0, typeSubstitutor0, set1, typeParameterErasureOptions0.getLeaveNonTypeParameterTypes()));
            }
            else if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
                Set set2 = erasureTypeAttributes0.getVisitedTypeParameters();
                if(set2 == null || !set2.contains(classifierDescriptor0)) {
                    List list1 = ((TypeParameterDescriptor)classifierDescriptor0).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(list1, "declaration.upperBounds");
                    set0.addAll(this.b(typeSubstitutor0, list1, erasureTypeAttributes0));
                }
                else {
                    set0.add(this.a(erasureTypeAttributes0));
                }
            }
            if(!typeParameterErasureOptions0.getIntersectUpperBounds()) {
                break;
            }
        }
        return e0.build(set0);
    }

    @NotNull
    public final KotlinType getErasedUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor0, @NotNull ErasureTypeAttributes erasureTypeAttributes0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        Intrinsics.checkNotNullParameter(erasureTypeAttributes0, "typeAttr");
        j j0 = new j(typeParameterDescriptor0, erasureTypeAttributes0);
        Object object0 = this.d.invoke(j0);
        Intrinsics.checkNotNullExpressionValue(object0, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (KotlinType)object0;
    }
}

