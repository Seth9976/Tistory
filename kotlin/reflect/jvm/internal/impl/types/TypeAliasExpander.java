package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1620#3,3:280\n1559#3:283\n1590#3,4:284\n1559#3:288\n1590#3,4:289\n1864#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
public final class TypeAliasExpander {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final void access$assertRecursionDepth(Companion typeAliasExpander$Companion0, int v, TypeAliasDescriptor typeAliasDescriptor0) {
            typeAliasExpander$Companion0.getClass();
            if(v > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor0.getName());
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TypeAliasExpansionReportStrategy a;
    public final boolean b;

    static {
        TypeAliasExpander.Companion = new Companion(null);
        new TypeAliasExpander(DO_NOTHING.INSTANCE, false);
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy0, boolean z) {
        Intrinsics.checkNotNullParameter(typeAliasExpansionReportStrategy0, "reportStrategy");
        super();
        this.a = typeAliasExpansionReportStrategy0;
        this.b = z;
    }

    public final void a(Annotations annotations0, Annotations annotations1) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: annotations0) {
            hashSet0.add(((AnnotationDescriptor)object0).getFqName());
        }
        for(Object object1: annotations1) {
            AnnotationDescriptor annotationDescriptor0 = (AnnotationDescriptor)object1;
            if(hashSet0.contains(annotationDescriptor0.getFqName())) {
                this.a.repeatedAnnotation(annotationDescriptor0);
            }
        }
    }

    public final SimpleType b(TypeAliasExpansion typeAliasExpansion0, TypeAttributes typeAttributes0, boolean z, int v, boolean z1) {
        SimpleType simpleType0 = typeAliasExpansion0.getDescriptor().getUnderlyingType();
        TypeProjection typeProjection0 = this.c(new TypeProjectionImpl(Variance.INVARIANT, simpleType0), typeAliasExpansion0, null, v);
        KotlinType kotlinType0 = typeProjection0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "expandedProjection.type");
        SimpleType simpleType1 = TypeSubstitutionKt.asSimpleType(kotlinType0);
        if(KotlinTypeKt.isError(simpleType1)) {
            return simpleType1;
        }
        typeProjection0.getProjectionKind();
        this.a(simpleType1.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes0));
        if(!KotlinTypeKt.isError(simpleType1)) {
            simpleType1 = TypeSubstitutionKt.replace$default(simpleType1, null, (KotlinTypeKt.isError(simpleType1) ? simpleType1.getAttributes() : typeAttributes0.add(simpleType1.getAttributes())), 1, null);
        }
        SimpleType simpleType2 = TypeUtils.makeNullableIfNeeded(simpleType1, z);
        Intrinsics.checkNotNullExpressionValue(simpleType2, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if(z1) {
            TypeConstructor typeConstructor0 = typeAliasExpansion0.getDescriptor().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor0, "descriptor.typeConstructor");
            return SpecialTypesKt.withAbbreviation(simpleType2, KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes0, typeConstructor0, typeAliasExpansion0.getArguments(), z, Empty.INSTANCE));
        }
        return simpleType2;
    }

    public final TypeProjection c(TypeProjection typeProjection0, TypeAliasExpansion typeAliasExpansion0, TypeParameterDescriptor typeParameterDescriptor0, int v) {
        Variance variance3;
        Companion.access$assertRecursionDepth(TypeAliasExpander.Companion, v, typeAliasExpansion0.getDescriptor());
        if(typeProjection0.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor0);
            TypeProjection typeProjection1 = TypeUtils.makeStarProjection(typeParameterDescriptor0);
            Intrinsics.checkNotNullExpressionValue(typeProjection1, "makeStarProjection(typeParameterDescriptor!!)");
            return typeProjection1;
        }
        KotlinType kotlinType0 = typeProjection0.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "underlyingProjection.type");
        TypeProjection typeProjection2 = typeAliasExpansion0.getReplacement(kotlinType0.getConstructor());
        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy0 = this.a;
        if(typeProjection2 == null) {
            UnwrappedType unwrappedType0 = typeProjection0.getType().unwrap();
            if(!DynamicTypesKt.isDynamic(unwrappedType0)) {
                SimpleType simpleType0 = TypeSubstitutionKt.asSimpleType(unwrappedType0);
                if(!KotlinTypeKt.isError(simpleType0) && TypeUtilsKt.requiresTypeAliasExpansion(simpleType0)) {
                    int v1 = 0;
                    TypeConstructor typeConstructor0 = simpleType0.getConstructor();
                    ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
                    typeConstructor0.getParameters().size();
                    simpleType0.getArguments().size();
                    if(!(classifierDescriptor0 instanceof TypeParameterDescriptor)) {
                        if(classifierDescriptor0 instanceof TypeAliasDescriptor) {
                            if(typeAliasExpansion0.isRecursion(((TypeAliasDescriptor)classifierDescriptor0))) {
                                typeAliasExpansionReportStrategy0.recursiveTypeAlias(((TypeAliasDescriptor)classifierDescriptor0));
                                String s = ((TypeAliasDescriptor)classifierDescriptor0).getName().toString();
                                Intrinsics.checkNotNullExpressionValue(s, "typeDescriptor.name.toString()");
                                ErrorType errorType0 = ErrorUtils.createErrorType(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, new String[]{s});
                                return new TypeProjectionImpl(Variance.INVARIANT, errorType0);
                            }
                            Iterable iterable0 = simpleType0.getArguments();
                            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                            for(Object object0: iterable0) {
                                if(v1 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                arrayList0.add(this.c(((TypeProjection)object0), typeAliasExpansion0, ((TypeParameterDescriptor)typeConstructor0.getParameters().get(v1)), v + 1));
                                ++v1;
                            }
                            SimpleType simpleType1 = this.b(TypeAliasExpansion.Companion.create(typeAliasExpansion0, ((TypeAliasDescriptor)classifierDescriptor0), arrayList0), simpleType0.getAttributes(), simpleType0.isMarkedNullable(), v + 1, false);
                            SimpleType simpleType2 = this.d(simpleType0, typeAliasExpansion0, v);
                            if(!DynamicTypesKt.isDynamic(simpleType1)) {
                                simpleType1 = SpecialTypesKt.withAbbreviation(simpleType1, simpleType2);
                            }
                            return new TypeProjectionImpl(typeProjection0.getProjectionKind(), simpleType1);
                        }
                        SimpleType simpleType3 = this.d(simpleType0, typeAliasExpansion0, v);
                        TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(simpleType3);
                        Intrinsics.checkNotNullExpressionValue(typeSubstitutor0, "create(substitutedType)");
                        for(Object object1: simpleType3.getArguments()) {
                            if(v1 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            if(!((TypeProjection)object1).isStarProjection()) {
                                KotlinType kotlinType1 = ((TypeProjection)object1).getType();
                                Intrinsics.checkNotNullExpressionValue(kotlinType1, "substitutedArgument.type");
                                if(!TypeUtilsKt.containsTypeAliasParameters(kotlinType1)) {
                                    TypeProjection typeProjection3 = (TypeProjection)simpleType0.getArguments().get(v1);
                                    TypeParameterDescriptor typeParameterDescriptor1 = (TypeParameterDescriptor)simpleType0.getConstructor().getParameters().get(v1);
                                    if(this.b) {
                                        KotlinType kotlinType2 = typeProjection3.getType();
                                        Intrinsics.checkNotNullExpressionValue(kotlinType2, "unsubstitutedArgument.type");
                                        KotlinType kotlinType3 = ((TypeProjection)object1).getType();
                                        Intrinsics.checkNotNullExpressionValue(kotlinType3, "substitutedArgument.type");
                                        Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor1, "typeParameter");
                                        typeAliasExpansionReportStrategy0.boundsViolationInSubstitution(typeSubstitutor0, kotlinType2, kotlinType3, typeParameterDescriptor1);
                                    }
                                }
                            }
                            ++v1;
                        }
                        return new TypeProjectionImpl(typeProjection0.getProjectionKind(), simpleType3);
                    }
                }
            }
            return typeProjection0;
        }
        if(typeProjection2.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor0);
            TypeProjection typeProjection4 = TypeUtils.makeStarProjection(typeParameterDescriptor0);
            Intrinsics.checkNotNullExpressionValue(typeProjection4, "makeStarProjection(typeParameterDescriptor!!)");
            return typeProjection4;
        }
        UnwrappedType unwrappedType1 = typeProjection2.getType().unwrap();
        Variance variance0 = typeProjection2.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(variance0, "argument.projectionKind");
        Variance variance1 = typeProjection0.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(variance1, "underlyingProjection.projectionKind");
        if(variance1 != variance0) {
            Variance variance2 = Variance.INVARIANT;
            if(variance1 != variance2) {
                if(variance0 == variance2) {
                    variance0 = variance1;
                }
                else {
                    typeAliasExpansionReportStrategy0.conflictingProjection(typeAliasExpansion0.getDescriptor(), typeParameterDescriptor0, unwrappedType1);
                }
            }
        }
        if(typeParameterDescriptor0 == null) {
            variance3 = Variance.INVARIANT;
        }
        else {
            variance3 = typeParameterDescriptor0.getVariance();
            if(variance3 == null) {
                variance3 = Variance.INVARIANT;
            }
        }
        Intrinsics.checkNotNullExpressionValue(variance3, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if(variance3 != variance0) {
            Variance variance4 = Variance.INVARIANT;
            if(variance3 != variance4) {
                if(variance0 == variance4) {
                    variance0 = variance4;
                }
                else {
                    typeAliasExpansionReportStrategy0.conflictingProjection(typeAliasExpansion0.getDescriptor(), typeParameterDescriptor0, unwrappedType1);
                }
            }
        }
        this.a(kotlinType0.getAnnotations(), unwrappedType1.getAnnotations());
        if(unwrappedType1 instanceof DynamicType) {
            TypeAttributes typeAttributes0 = kotlinType0.getAttributes();
            return KotlinTypeKt.isError(((DynamicType)unwrappedType1)) ? new TypeProjectionImpl(variance0, ((DynamicType)unwrappedType1).replaceAttributes(((DynamicType)unwrappedType1).getAttributes())) : new TypeProjectionImpl(variance0, ((DynamicType)unwrappedType1).replaceAttributes(typeAttributes0.add(((DynamicType)unwrappedType1).getAttributes())));
        }
        SimpleType simpleType4 = TypeUtils.makeNullableIfNeeded(TypeSubstitutionKt.asSimpleType(unwrappedType1), kotlinType0.isMarkedNullable());
        Intrinsics.checkNotNullExpressionValue(simpleType4, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        TypeAttributes typeAttributes1 = kotlinType0.getAttributes();
        if(!KotlinTypeKt.isError(simpleType4)) {
            simpleType4 = TypeSubstitutionKt.replace$default(simpleType4, null, (KotlinTypeKt.isError(simpleType4) ? simpleType4.getAttributes() : typeAttributes1.add(simpleType4.getAttributes())), 1, null);
        }
        return new TypeProjectionImpl(variance0, simpleType4);
    }

    public final SimpleType d(SimpleType simpleType0, TypeAliasExpansion typeAliasExpansion0, int v) {
        TypeConstructor typeConstructor0 = simpleType0.getConstructor();
        Iterable iterable0 = simpleType0.getArguments();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        int v1 = 0;
        for(Object object0: iterable0) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection0 = this.c(((TypeProjection)object0), typeAliasExpansion0, ((TypeParameterDescriptor)typeConstructor0.getParameters().get(v1)), v + 1);
            if(!typeProjection0.isStarProjection()) {
                typeProjection0 = new TypeProjectionImpl(typeProjection0.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjection0.getType(), ((TypeProjection)object0).getType().isMarkedNullable()));
            }
            arrayList0.add(typeProjection0);
            ++v1;
        }
        return TypeSubstitutionKt.replace$default(simpleType0, arrayList0, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion0, @NotNull TypeAttributes typeAttributes0) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion0, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(typeAttributes0, "attributes");
        return this.b(typeAliasExpansion0, typeAttributes0, false, 0, true);
    }
}

