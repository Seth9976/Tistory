package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1549#2:306\n1620#2,3:307\n1559#2:310\n1590#2,4:311\n1549#2:316\n1620#2,3:317\n1#3:315\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:306\n76#1:307,3\n105#1:310\n105#1:311,4\n251#1:316\n251#1:317,3\n*E\n"})
public final class TypeDeserializer {
    public final DeserializationContext a;
    public final TypeDeserializer b;
    public final String c;
    public final String d;
    public final MemoizedFunctionToNullable e;
    public final MemoizedFunctionToNullable f;
    public final Map g;

    public TypeDeserializer(@NotNull DeserializationContext deserializationContext0, @Nullable TypeDeserializer typeDeserializer0, @NotNull List list0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(deserializationContext0, "c");
        Map map0;
        Intrinsics.checkNotNullParameter(list0, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(s, "debugName");
        Intrinsics.checkNotNullParameter(s1, "containerPresentableName");
        super();
        this.a = deserializationContext0;
        this.b = typeDeserializer0;
        this.c = s;
        this.d = s1;
        this.e = deserializationContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new k(this, 0));
        this.f = deserializationContext0.getStorageManager().createMemoizedFunctionWithNullableValues(new k(this, 1));
        if(list0.isEmpty()) {
            map0 = x.emptyMap();
        }
        else {
            map0 = new LinkedHashMap();
            int v = 0;
            for(Object object0: list0) {
                map0.put(((TypeParameter)object0).getId(), new DeserializedTypeParameterDescriptor(this.a, ((TypeParameter)object0), v));
                ++v;
            }
        }
        this.g = map0;
    }

    public static SimpleType a(SimpleType simpleType0, KotlinType kotlinType0) {
        KotlinBuiltIns kotlinBuiltIns0 = TypeUtilsKt.getBuiltIns(simpleType0);
        Annotations annotations0 = simpleType0.getAnnotations();
        KotlinType kotlinType1 = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType0);
        List list0 = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType0);
        Iterable iterable0 = CollectionsKt___CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType0), 1);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((TypeProjection)object0).getType());
        }
        return FunctionTypesKt.createFunctionType(kotlinBuiltIns0, annotations0, kotlinType1, list0, arrayList0, null, kotlinType0, true).makeNullableAsSpecified(simpleType0.isMarkedNullable());
    }

    public static final ClassifierDescriptor access$computeClassifierDescriptor(TypeDeserializer typeDeserializer0, int v) {
        DeserializationContext deserializationContext0 = typeDeserializer0.a;
        ClassId classId0 = NameResolverUtilKt.getClassId(deserializationContext0.getNameResolver(), v);
        return classId0.isLocal() ? deserializationContext0.getComponents().deserializeClass(classId0) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(deserializationContext0.getComponents().getModuleDescriptor(), classId0);
    }

    public static final ClassifierDescriptor access$computeTypeAliasDescriptor(TypeDeserializer typeDeserializer0, int v) {
        DeserializationContext deserializationContext0 = typeDeserializer0.a;
        ClassId classId0 = NameResolverUtilKt.getClassId(deserializationContext0.getNameResolver(), v);
        return classId0.isLocal() ? null : FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(deserializationContext0.getComponents().getModuleDescriptor(), classId0);
    }

    public final TypeParameterDescriptor b(int v) {
        TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)this.g.get(v);
        if(typeParameterDescriptor0 == null) {
            return this.b == null ? null : this.b.b(v);
        }
        return typeParameterDescriptor0;
    }

    public static final List c(Type protoBuf$Type0, TypeDeserializer typeDeserializer0) {
        List list0 = protoBuf$Type0.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(list0, "argumentList");
        Type protoBuf$Type1 = ProtoTypeTableUtilKt.outerType(protoBuf$Type0, typeDeserializer0.a.getTypeTable());
        List list1 = protoBuf$Type1 == null ? null : TypeDeserializer.c(protoBuf$Type1, typeDeserializer0);
        if(list1 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt___CollectionsKt.plus(list0, list1);
    }

    public static TypeAttributes d(List list0, Annotations annotations0, TypeConstructor typeConstructor0, DeclarationDescriptor declarationDescriptor0) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(((TypeAttributeTranslator)object0).toAttributes(annotations0, typeConstructor0, declarationDescriptor0));
        }
        List list1 = l.flatten(arrayList0);
        return TypeAttributes.Companion.create(list1);
    }

    public static final ClassDescriptor e(TypeDeserializer typeDeserializer0, Type protoBuf$Type0, int v) {
        ClassId classId0 = NameResolverUtilKt.getClassId(typeDeserializer0.a.getNameResolver(), v);
        List list0 = SequencesKt___SequencesKt.toMutableList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(protoBuf$Type0, new n(typeDeserializer0)), o.w));
        int v1 = SequencesKt___SequencesKt.count(SequencesKt__SequencesKt.generateSequence(classId0, m.a));
        while(list0.size() < v1) {
            list0.add(0);
        }
        return typeDeserializer0.a.getComponents().getNotFoundClasses().getClass(classId0, list0);
    }

    @NotNull
    public final List getOwnTypeParameters() {
        return CollectionsKt___CollectionsKt.toList(this.g.values());
    }

    @NotNull
    public final SimpleType simpleType(@NotNull Type protoBuf$Type0, boolean z) {
        SimpleType simpleType3;
        List list3;
        StarProjectionImpl starProjectionImpl0;
        StarProjectionForAbsentTypeParameter starProjectionForAbsentTypeParameter0;
        TypeConstructor typeConstructor0;
        ClassifierDescriptor classifierDescriptor0;
        SimpleType simpleType1;
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "proto");
        DeserializationContext deserializationContext0 = this.a;
        SimpleType simpleType0 = null;
        if(!protoBuf$Type0.hasClassName()) {
            simpleType1 = !protoBuf$Type0.hasTypeAliasName() || !NameResolverUtilKt.getClassId(deserializationContext0.getNameResolver(), protoBuf$Type0.getTypeAliasName()).isLocal() ? null : deserializationContext0.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        else if(NameResolverUtilKt.getClassId(deserializationContext0.getNameResolver(), protoBuf$Type0.getClassName()).isLocal()) {
            simpleType1 = deserializationContext0.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        else {
            simpleType1 = null;
        }
        if(simpleType1 != null) {
            return simpleType1;
        }
        if(protoBuf$Type0.hasClassName()) {
            classifierDescriptor0 = (ClassifierDescriptor)this.e.invoke(protoBuf$Type0.getClassName());
            if(classifierDescriptor0 == null) {
                classifierDescriptor0 = TypeDeserializer.e(this, protoBuf$Type0, protoBuf$Type0.getClassName());
            }
            typeConstructor0 = classifierDescriptor0.getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classifier.typeConstructor");
        }
        else if(protoBuf$Type0.hasTypeParameter()) {
            classifierDescriptor0 = this.b(protoBuf$Type0.getTypeParameter());
            if(classifierDescriptor0 == null) {
                typeConstructor0 = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, new String[]{String.valueOf(protoBuf$Type0.getTypeParameter()), this.d});
            }
            else {
                typeConstructor0 = classifierDescriptor0.getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classifier.typeConstructor");
            }
        }
        else if(protoBuf$Type0.hasTypeParameterName()) {
            Object object0 = null;
            String s = deserializationContext0.getNameResolver().getString(protoBuf$Type0.getTypeParameterName());
            for(Object object1: this.getOwnTypeParameters()) {
                if(Intrinsics.areEqual(((TypeParameterDescriptor)object1).getName().asString(), s)) {
                    object0 = object1;
                    break;
                }
            }
            if(((TypeParameterDescriptor)object0) == null) {
                typeConstructor0 = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, new String[]{s, deserializationContext0.getContainingDeclaration().toString()});
            }
            else {
                typeConstructor0 = ((TypeParameterDescriptor)object0).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classifier.typeConstructor");
            }
        }
        else if(protoBuf$Type0.hasTypeAliasName()) {
            classifierDescriptor0 = (ClassifierDescriptor)this.f.invoke(protoBuf$Type0.getTypeAliasName());
            if(classifierDescriptor0 == null) {
                classifierDescriptor0 = TypeDeserializer.e(this, protoBuf$Type0, protoBuf$Type0.getTypeAliasName());
            }
            typeConstructor0 = classifierDescriptor0.getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor0, "classifier.typeConstructor");
        }
        else {
            typeConstructor0 = ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
        }
        if(ErrorUtils.isError(typeConstructor0.getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor0, new String[]{typeConstructor0.toString()});
        }
        DeserializedAnnotations deserializedAnnotations0 = new DeserializedAnnotations(deserializationContext0.getStorageManager(), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.l(protoBuf$Type0, this));
        TypeAttributes typeAttributes0 = TypeDeserializer.d(deserializationContext0.getComponents().getTypeAttributeTranslators(), deserializedAnnotations0, typeConstructor0, deserializationContext0.getContainingDeclaration());
        Iterable iterable0 = TypeDeserializer.c(protoBuf$Type0, this);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        int v = 0;
        for(Object object2: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List list0 = typeConstructor0.getParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "constructor.parameters");
            TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)CollectionsKt___CollectionsKt.getOrNull(list0, v);
            if(((Argument)object2).getProjection() == Projection.STAR) {
                if(typeParameterDescriptor0 == null) {
                    starProjectionForAbsentTypeParameter0 = new StarProjectionForAbsentTypeParameter(deserializationContext0.getComponents().getModuleDescriptor().getBuiltIns());
                    goto label_79;
                }
                else {
                    starProjectionImpl0 = new StarProjectionImpl(typeParameterDescriptor0);
                    goto label_78;
                }
                goto label_70;
            }
            else {
            label_70:
                Projection protoBuf$Type$Argument$Projection0 = ((Argument)object2).getProjection();
                Intrinsics.checkNotNullExpressionValue(protoBuf$Type$Argument$Projection0, "typeArgumentProto.projection");
                Variance variance0 = ProtoEnumFlags.INSTANCE.variance(protoBuf$Type$Argument$Projection0);
                Type protoBuf$Type1 = ProtoTypeTableUtilKt.type(((Argument)object2), deserializationContext0.getTypeTable());
                if(protoBuf$Type1 == null) {
                    starProjectionForAbsentTypeParameter0 = new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, new String[]{((Argument)object2).toString()}));
                    goto label_79;
                }
                else {
                    starProjectionImpl0 = new TypeProjectionImpl(variance0, this.type(protoBuf$Type1));
                }
            }
        label_78:
            starProjectionForAbsentTypeParameter0 = starProjectionImpl0;
        label_79:
            arrayList0.add(starProjectionForAbsentTypeParameter0);
            ++v;
        }
        List list1 = CollectionsKt___CollectionsKt.toList(arrayList0);
        ClassifierDescriptor classifierDescriptor1 = typeConstructor0.getDeclarationDescriptor();
        boolean z1 = true;
        if(!z || !(classifierDescriptor1 instanceof TypeAliasDescriptor)) {
            Boolean boolean0 = Flags.SUSPEND_TYPE.get(protoBuf$Type0.getFlags());
            Intrinsics.checkNotNullExpressionValue(boolean0, "SUSPEND_TYPE.get(proto.flags)");
            if(boolean0.booleanValue()) {
                boolean z2 = protoBuf$Type0.getNullable();
                switch(typeConstructor0.getParameters().size() - list1.size()) {
                    case 0: {
                        list3 = list1;
                        SimpleType simpleType4 = KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, list1, z2, null, 16, null);
                        if(FunctionTypesKt.isFunctionType(simpleType4)) {
                            TypeProjection typeProjection0 = (TypeProjection)CollectionsKt___CollectionsKt.lastOrNull(FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType4));
                            if(typeProjection0 != null) {
                                KotlinType kotlinType0 = typeProjection0.getType();
                                if(kotlinType0 != null) {
                                    ClassifierDescriptor classifierDescriptor2 = kotlinType0.getConstructor().getDeclarationDescriptor();
                                    FqName fqName0 = classifierDescriptor2 == null ? null : DescriptorUtilsKt.getFqNameSafe(classifierDescriptor2);
                                    if(kotlinType0.getArguments().size() != 1 || !Intrinsics.areEqual(fqName0, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) && !Intrinsics.areEqual(fqName0, TypeDeserializerKt.a)) {
                                        simpleType0 = simpleType4;
                                    }
                                    else {
                                        KotlinType kotlinType1 = ((TypeProjection)CollectionsKt___CollectionsKt.single(kotlinType0.getArguments())).getType();
                                        Intrinsics.checkNotNullExpressionValue(kotlinType1, "continuationArgumentType.arguments.single().type");
                                        DeclarationDescriptor declarationDescriptor0 = deserializationContext0.getContainingDeclaration();
                                        CallableDescriptor callableDescriptor0 = declarationDescriptor0 instanceof CallableDescriptor ? ((CallableDescriptor)declarationDescriptor0) : null;
                                        if(callableDescriptor0 != null) {
                                            simpleType0 = DescriptorUtilsKt.fqNameOrNull(callableDescriptor0);
                                        }
                                        if(!Intrinsics.areEqual(simpleType0, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
                                        }
                                        simpleType0 = TypeDeserializer.a(simpleType4, kotlinType1);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case 1: {
                        int v1 = list1.size();
                        if(v1 - 1 >= 0) {
                            TypeConstructor typeConstructor1 = typeConstructor0.getBuiltIns().getSuspendFunction(v1 - 1).getTypeConstructor();
                            Intrinsics.checkNotNullExpressionValue(typeConstructor1, "functionTypeConstructor.…on(arity).typeConstructor");
                            simpleType0 = KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor1, list1, z2, null, 16, null);
                        }
                        list3 = list1;
                        break;
                    }
                    default: {
                        list3 = list1;
                    }
                }
                simpleType3 = simpleType0 == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list3, typeConstructor0, new String[0]) : simpleType0;
            }
            else {
                simpleType3 = KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, list1, protoBuf$Type0.getNullable(), null, 16, null);
                Boolean boolean1 = Flags.DEFINITELY_NOT_NULL_TYPE.get(protoBuf$Type0.getFlags());
                Intrinsics.checkNotNullExpressionValue(boolean1, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if(boolean1.booleanValue()) {
                    simpleType0 = Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType3, true, false, 4, null);
                    if(simpleType0 == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for \'" + simpleType3 + '\'').toString());
                    }
                    simpleType3 = simpleType0;
                }
            }
        }
        else {
            SimpleType simpleType2 = KotlinTypeFactory.computeExpandedType(((TypeAliasDescriptor)classifierDescriptor1), list1);
            List list2 = CollectionsKt___CollectionsKt.plus(deserializedAnnotations0, simpleType2.getAnnotations());
            TypeAttributes typeAttributes1 = TypeDeserializer.d(deserializationContext0.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(list2), typeConstructor0, deserializationContext0.getContainingDeclaration());
            if(!KotlinTypeKt.isNullable(simpleType2) && !protoBuf$Type0.getNullable()) {
                z1 = false;
            }
            simpleType3 = simpleType2.makeNullableAsSpecified(z1).replaceAttributes(typeAttributes1);
        }
        Type protoBuf$Type2 = ProtoTypeTableUtilKt.abbreviatedType(protoBuf$Type0, deserializationContext0.getTypeTable());
        if(protoBuf$Type2 != null) {
            SimpleType simpleType5 = SpecialTypesKt.withAbbreviation(simpleType3, this.simpleType(protoBuf$Type2, false));
            if(simpleType5 != null) {
                simpleType3 = simpleType5;
            }
        }
        return protoBuf$Type0.hasClassName() ? deserializationContext0.getComponents().getPlatformDependentTypeTransformer().transformPlatformType(NameResolverUtilKt.getClassId(deserializationContext0.getNameResolver(), protoBuf$Type0.getClassName()), simpleType3) : simpleType3;
    }

    public static SimpleType simpleType$default(TypeDeserializer typeDeserializer0, Type protoBuf$Type0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return typeDeserializer0.simpleType(protoBuf$Type0, z);
    }

    @Override
    @NotNull
    public String toString() {
        return this.c + (this.b == null ? "" : ". Child of " + this.b.c);
    }

    @NotNull
    public final KotlinType type(@NotNull Type protoBuf$Type0) {
        Intrinsics.checkNotNullParameter(protoBuf$Type0, "proto");
        if(protoBuf$Type0.hasFlexibleTypeCapabilitiesId()) {
            String s = this.a.getNameResolver().getString(protoBuf$Type0.getFlexibleTypeCapabilitiesId());
            SimpleType simpleType0 = TypeDeserializer.simpleType$default(this, protoBuf$Type0, false, 2, null);
            Type protoBuf$Type1 = ProtoTypeTableUtilKt.flexibleUpperBound(protoBuf$Type0, this.a.getTypeTable());
            Intrinsics.checkNotNull(protoBuf$Type1);
            SimpleType simpleType1 = TypeDeserializer.simpleType$default(this, protoBuf$Type1, false, 2, null);
            return this.a.getComponents().getFlexibleTypeDeserializer().create(protoBuf$Type0, s, simpleType0, simpleType1);
        }
        return this.simpleType(protoBuf$Type0, true);
    }
}

