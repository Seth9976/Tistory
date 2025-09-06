package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import te.a;

@SourceDebugExtension({"SMAP\nJavaTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1#2:322\n19#3:323\n1549#4:324\n1620#4,3:325\n1549#4:328\n1620#4,3:329\n1549#4:332\n1620#4,3:333\n*S KotlinDebug\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n*L\n144#1:323\n205#1:324\n205#1:325,3\n263#1:328\n263#1:329,3\n267#1:332\n267#1:333,3\n*E\n"})
public final class JavaTypeResolver {
    public final LazyJavaResolverContext a;
    public final TypeParameterResolver b;
    public final RawProjectionComputer c;
    public final TypeParameterUpperBoundEraser d;

    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull TypeParameterResolver typeParameterResolver0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver0, "typeParameterResolver");
        super();
        this.a = lazyJavaResolverContext0;
        this.b = typeParameterResolver0;
        RawProjectionComputer rawProjectionComputer0 = new RawProjectionComputer();
        this.c = rawProjectionComputer0;
        this.d = new TypeParameterUpperBoundEraser(rawProjectionComputer0, null, 2, null);
    }

    public final SimpleType a(JavaClassifierType javaClassifierType0, JavaTypeAttributes javaTypeAttributes0, SimpleType simpleType0) {
        TypeProjection typeProjection1;
        Iterator iterator1;
        boolean z2;
        TypeProjection typeProjection0;
        ClassDescriptor classDescriptor0;
        TypeConstructor typeConstructor0;
        TypeAttributes typeAttributes0;
        if(simpleType0 == null) {
            typeAttributes0 = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.a, javaClassifierType0, false, 4, null));
        }
        else {
            typeAttributes0 = simpleType0.getAttributes();
            if(typeAttributes0 == null) {
                typeAttributes0 = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.a, javaClassifierType0, false, 4, null));
            }
        }
        JavaClassifier javaClassifier0 = javaClassifierType0.getClassifier();
        LazyJavaResolverContext lazyJavaResolverContext0 = this.a;
        if(javaClassifier0 == null) {
            typeConstructor0 = this.b(javaClassifierType0);
        }
        else {
            if(javaClassifier0 instanceof JavaClass) {
                FqName fqName0 = ((JavaClass)javaClassifier0).getFqName();
                if(fqName0 == null) {
                    throw new AssertionError("Class type should have a FQ name: " + javaClassifier0);
                }
                if(!javaTypeAttributes0.isForAnnotationParameter() || !Intrinsics.areEqual(fqName0, JavaTypeResolverKt.a)) {
                    JavaToKotlinClassMapper javaToKotlinClassMapper0 = JavaToKotlinClassMapper.INSTANCE;
                    ClassDescriptor classDescriptor1 = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper0, fqName0, lazyJavaResolverContext0.getModule().getBuiltIns(), null, 4, null);
                    if(classDescriptor1 == null) {
                        classDescriptor0 = null;
                    }
                    else if(!javaToKotlinClassMapper0.isReadOnly(classDescriptor1)) {
                        classDescriptor0 = classDescriptor1;
                    }
                    else if(javaTypeAttributes0.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes0.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
                        classDescriptor0 = javaToKotlinClassMapper0.convertReadOnlyToMutable(classDescriptor1);
                    }
                    else if(JavaTypesKt.isSuperWildcard(((JavaType)CollectionsKt___CollectionsKt.lastOrNull(javaClassifierType0.getTypeArguments())))) {
                        List list0 = javaToKotlinClassMapper0.convertReadOnlyToMutable(classDescriptor1).getTypeConstructor().getParameters();
                        Intrinsics.checkNotNullExpressionValue(list0, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                        TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)CollectionsKt___CollectionsKt.lastOrNull(list0);
                        if(typeParameterDescriptor0 == null) {
                            classDescriptor0 = classDescriptor1;
                        }
                        else {
                            Variance variance0 = typeParameterDescriptor0.getVariance();
                            classDescriptor0 = variance0 == null || variance0 == Variance.OUT_VARIANCE ? classDescriptor1 : javaToKotlinClassMapper0.convertReadOnlyToMutable(classDescriptor1);
                        }
                    }
                    else {
                        classDescriptor0 = classDescriptor1;
                    }
                }
                else {
                    classDescriptor0 = lazyJavaResolverContext0.getComponents().getReflectionTypes().getKClass();
                }
                if(classDescriptor0 == null) {
                    classDescriptor0 = lazyJavaResolverContext0.getComponents().getModuleClassResolver().resolveClass(((JavaClass)javaClassifier0));
                }
                if(classDescriptor0 != null) {
                    typeConstructor0 = classDescriptor0.getTypeConstructor();
                    if(typeConstructor0 == null) {
                        typeConstructor0 = this.b(javaClassifierType0);
                    }
                    goto label_53;
                }
                typeConstructor0 = this.b(javaClassifierType0);
                goto label_53;
            }
            if(!(javaClassifier0 instanceof JavaTypeParameter)) {
                throw new IllegalStateException("Unknown classifier kind: " + javaClassifier0);
            }
            TypeParameterDescriptor typeParameterDescriptor1 = this.b.resolveTypeParameter(((JavaTypeParameter)javaClassifier0));
            typeConstructor0 = typeParameterDescriptor1 == null ? null : typeParameterDescriptor1.getTypeConstructor();
        }
    label_53:
        boolean z = false;
        if(typeConstructor0 == null) {
            return null;
        }
        boolean z1 = javaTypeAttributes0.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND ? false : !javaTypeAttributes0.isForAnnotationParameter() && javaTypeAttributes0.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE;
        if(Intrinsics.areEqual((simpleType0 == null ? null : simpleType0.getConstructor()), typeConstructor0) && !javaClassifierType0.isRaw() && z1) {
            return simpleType0.makeNullableAsSpecified(true);
        }
        if(javaClassifierType0.isRaw()) {
            z = true;
        }
        else if(javaClassifierType0.getTypeArguments().isEmpty()) {
            List list1 = typeConstructor0.getParameters();
            Intrinsics.checkNotNullExpressionValue(list1, "constructor.parameters");
            if(!list1.isEmpty()) {
                z = true;
            }
        }
        List list2 = typeConstructor0.getParameters();
        Intrinsics.checkNotNullExpressionValue(list2, "constructor.parameters");
        if(z) {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
            Iterator iterator0 = list2.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor)object0;
                if(TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor2, null, javaTypeAttributes0.getVisitedTypeParameters())) {
                    typeProjection0 = TypeUtils.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes0);
                    z2 = z1;
                    iterator1 = iterator0;
                }
                else {
                    iterator1 = iterator0;
                    z2 = z1;
                    LazyWrappedType lazyWrappedType0 = new LazyWrappedType(lazyJavaResolverContext0.getStorageManager(), new a(this, typeParameterDescriptor2, javaTypeAttributes0, typeConstructor0, javaClassifierType0, 0));
                    JavaTypeAttributes javaTypeAttributes1 = javaTypeAttributes0.markIsRaw(javaClassifierType0.isRaw());
                    typeProjection0 = this.c.computeProjection(typeParameterDescriptor2, javaTypeAttributes1, this.d, lazyWrappedType0);
                }
                arrayList0.add(typeProjection0);
                iterator0 = iterator1;
                z1 = z2;
            }
            return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, arrayList0, z1, null, 16, null);
        }
        if(list2.size() != javaClassifierType0.getTypeArguments().size()) {
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
            for(Object object1: list2) {
                String s = ((TypeParameterDescriptor)object1).getName().asString();
                Intrinsics.checkNotNullExpressionValue(s, "p.name.asString()");
                arrayList1.add(new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, new String[]{s})));
            }
            return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, CollectionsKt___CollectionsKt.toList(arrayList1), z1, null, 16, null);
        }
        Iterable iterable0 = CollectionsKt___CollectionsKt.withIndex(javaClassifierType0.getTypeArguments());
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object2: iterable0) {
            int v = ((IndexedValue)object2).component1();
            JavaType javaType0 = (JavaType)((IndexedValue)object2).component2();
            TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor)list2.get(v);
            TypeUsage typeUsage0 = TypeUsage.COMMON;
            JavaTypeAttributes javaTypeAttributes2 = JavaTypeAttributesKt.toAttributes$default(typeUsage0, false, false, null, 7, null);
            Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor3, "parameter");
            if(javaType0 instanceof JavaWildcardType) {
                JavaType javaType1 = ((JavaWildcardType)javaType0).getBound();
                Variance variance1 = ((JavaWildcardType)javaType0).isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
                if(javaType1 == null || typeParameterDescriptor3.getVariance() != Variance.INVARIANT && variance1 != typeParameterDescriptor3.getVariance()) {
                    typeProjection1 = TypeUtils.makeStarProjection(typeParameterDescriptor3, javaTypeAttributes2);
                }
                else {
                    AnnotationDescriptor annotationDescriptor0 = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(lazyJavaResolverContext0, ((JavaWildcardType)javaType0));
                    KotlinType kotlinType0 = this.transformJavaType(javaType1, JavaTypeAttributesKt.toAttributes$default(typeUsage0, false, false, null, 7, null));
                    if(annotationDescriptor0 != null) {
                        List list3 = CollectionsKt___CollectionsKt.plus(kotlinType0.getAnnotations(), annotationDescriptor0);
                        kotlinType0 = TypeUtilsKt.replaceAnnotations(kotlinType0, Annotations.Companion.create(list3));
                    }
                    typeProjection1 = TypeUtilsKt.createProjection(kotlinType0, variance1, typeParameterDescriptor3);
                }
                Intrinsics.checkNotNullExpressionValue(typeProjection1, "{\n                val bo…          }\n            }");
            }
            else {
                KotlinType kotlinType1 = this.transformJavaType(javaType0, javaTypeAttributes2);
                typeProjection1 = new TypeProjectionImpl(Variance.INVARIANT, kotlinType1);
            }
            arrayList2.add(typeProjection1);
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, CollectionsKt___CollectionsKt.toList(arrayList2), z1, null, 16, null);
    }

    public final TypeConstructor b(JavaClassifierType javaClassifierType0) {
        ClassId classId0 = ClassId.topLevel(new FqName(javaClassifierType0.getClassifierQualifiedName()));
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(FqName(javaType.classifierQualifiedName))");
        TypeConstructor typeConstructor0 = this.a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId0, k.listOf(0)).getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "c.components.deserialize…istOf(0)).typeConstructor");
        return typeConstructor0;
    }

    @NotNull
    public final KotlinType transformArrayType(@NotNull JavaArrayType javaArrayType0, @NotNull JavaTypeAttributes javaTypeAttributes0, boolean z) {
        Intrinsics.checkNotNullParameter(javaArrayType0, "arrayType");
        Intrinsics.checkNotNullParameter(javaTypeAttributes0, "attr");
        JavaType javaType0 = javaArrayType0.getComponentType();
        PrimitiveType primitiveType0 = null;
        JavaPrimitiveType javaPrimitiveType0 = javaType0 instanceof JavaPrimitiveType ? ((JavaPrimitiveType)javaType0) : null;
        if(javaPrimitiveType0 != null) {
            primitiveType0 = javaPrimitiveType0.getType();
        }
        LazyJavaResolverContext lazyJavaResolverContext0 = this.a;
        LazyJavaAnnotations lazyJavaAnnotations0 = new LazyJavaAnnotations(lazyJavaResolverContext0, javaArrayType0, true);
        if(primitiveType0 != null) {
            SimpleType simpleType0 = lazyJavaResolverContext0.getModule().getBuiltIns().getPrimitiveArrayKotlinType(primitiveType0);
            Intrinsics.checkNotNullExpressionValue(simpleType0, "it");
            KotlinType kotlinType0 = TypeUtilsKt.replaceAnnotations(simpleType0, new CompositeAnnotations(new Annotations[]{simpleType0.getAnnotations(), lazyJavaAnnotations0}));
            Intrinsics.checkNotNull(kotlinType0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            return !javaTypeAttributes0.isForAnnotationParameter() ? KotlinTypeFactory.flexibleType(((SimpleType)kotlinType0), ((SimpleType)kotlinType0).makeNullableAsSpecified(true)) : ((SimpleType)kotlinType0);
        }
        KotlinType kotlinType1 = this.transformJavaType(javaType0, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes0.isForAnnotationParameter(), false, null, 6, null));
        if(javaTypeAttributes0.isForAnnotationParameter()) {
            KotlinType kotlinType2 = lazyJavaResolverContext0.getModule().getBuiltIns().getArrayType((z ? Variance.OUT_VARIANCE : Variance.INVARIANT), kotlinType1, lazyJavaAnnotations0);
            Intrinsics.checkNotNullExpressionValue(kotlinType2, "c.module.builtIns.getArr…mponentType, annotations)");
            return kotlinType2;
        }
        SimpleType simpleType1 = lazyJavaResolverContext0.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinType1, lazyJavaAnnotations0);
        Intrinsics.checkNotNullExpressionValue(simpleType1, "c.module.builtIns.getArr…mponentType, annotations)");
        return KotlinTypeFactory.flexibleType(simpleType1, lazyJavaResolverContext0.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinType1, lazyJavaAnnotations0).makeNullableAsSpecified(true));
    }

    public static KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver0, JavaArrayType javaArrayType0, JavaTypeAttributes javaTypeAttributes0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return javaTypeResolver0.transformArrayType(javaArrayType0, javaTypeAttributes0, z);
    }

    @NotNull
    public final KotlinType transformJavaType(@Nullable JavaType javaType0, @NotNull JavaTypeAttributes javaTypeAttributes0) {
        KotlinType kotlinType0;
        Intrinsics.checkNotNullParameter(javaTypeAttributes0, "attr");
        LazyJavaResolverContext lazyJavaResolverContext0 = this.a;
        if(javaType0 instanceof JavaPrimitiveType) {
            PrimitiveType primitiveType0 = ((JavaPrimitiveType)javaType0).getType();
            kotlinType0 = primitiveType0 == null ? lazyJavaResolverContext0.getModule().getBuiltIns().getUnitType() : lazyJavaResolverContext0.getModule().getBuiltIns().getPrimitiveKotlinType(primitiveType0);
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "{\n                val pr…ns.unitType\n            }");
            return kotlinType0;
        }
        if(javaType0 instanceof JavaClassifierType) {
            boolean z = ((JavaClassifierType)javaType0).isRaw();
            if(!z && (javaTypeAttributes0.isForAnnotationParameter() || javaTypeAttributes0.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE)) {
                SimpleType simpleType0 = this.a(((JavaClassifierType)javaType0), javaTypeAttributes0, null);
                if(simpleType0 == null) {
                    String[] arr_s = {((JavaClassifierType)javaType0).getPresentableText()};
                    return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, arr_s);
                }
                return simpleType0;
            }
            SimpleType simpleType1 = this.a(((JavaClassifierType)javaType0), javaTypeAttributes0.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if(simpleType1 == null) {
                String[] arr_s1 = {((JavaClassifierType)javaType0).getPresentableText()};
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, arr_s1);
            }
            SimpleType simpleType2 = this.a(((JavaClassifierType)javaType0), javaTypeAttributes0.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleType1);
            if(simpleType2 == null) {
                String[] arr_s2 = {((JavaClassifierType)javaType0).getPresentableText()};
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, arr_s2);
            }
            return z ? new RawTypeImpl(simpleType1, simpleType2) : KotlinTypeFactory.flexibleType(simpleType1, simpleType2);
        }
        if(javaType0 instanceof JavaArrayType) {
            return JavaTypeResolver.transformArrayType$default(this, ((JavaArrayType)javaType0), javaTypeAttributes0, false, 4, null);
        }
        if(javaType0 instanceof JavaWildcardType) {
            JavaType javaType1 = ((JavaWildcardType)javaType0).getBound();
            if(javaType1 != null) {
                kotlinType0 = this.transformJavaType(javaType1, javaTypeAttributes0);
                if(kotlinType0 == null) {
                    kotlinType0 = lazyJavaResolverContext0.getModule().getBuiltIns().getDefaultBound();
                    Intrinsics.checkNotNullExpressionValue(kotlinType0, "c.module.builtIns.defaultBound");
                    return kotlinType0;
                }
                return kotlinType0;
            }
            kotlinType0 = lazyJavaResolverContext0.getModule().getBuiltIns().getDefaultBound();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "c.module.builtIns.defaultBound");
            return kotlinType0;
        }
        if(javaType0 != null) {
            throw new UnsupportedOperationException("Unsupported type: " + javaType0);
        }
        kotlinType0 = lazyJavaResolverContext0.getModule().getBuiltIns().getDefaultBound();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "c.module.builtIns.defaultBound");
        return kotlinType0;
    }
}

