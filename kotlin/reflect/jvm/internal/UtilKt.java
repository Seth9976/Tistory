package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0019\u0010\u0002\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u001B\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005\u001A\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007*\u00020\u0006H\u0000\u00A2\u0006\u0004\b\b\u0010\t\u001A\u0019\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B*\u00020\nH\u0000\u00A2\u0006\u0004\b\r\u0010\u000E\u001A\u0017\u0010\u0011\u001A\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u000FH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u001B\u0010\u0014\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0004\u0018\u00010\u000FH\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A\u001B\u0010\u0017\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u0004\u0018\u00010\u000FH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u0019\u0010\u001B\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u001A\u001A\u00020\u0019H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001An\u0010-\u001A\u00028\u0001\"\b\b\u0000\u0010\u001E*\u00020\u001D\"\b\b\u0001\u0010 *\u00020\u001F2\n\u0010!\u001A\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\"\u001A\u00028\u00002\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'2\u001D\u0010,\u001A\u0019\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)\u00A2\u0006\u0002\b+H\u0000\u00A2\u0006\u0004\b-\u0010.\u001A\'\u00102\u001A\u00028\u0000\"\u0004\b\u0000\u0010/2\f\u00101\u001A\b\u0012\u0004\u0012\u00028\u000000H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103\"\u0018\u00106\u001A\u000205*\u0002048@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u00107\"\u001A\u0010;\u001A\u0004\u0018\u000108*\u00020\u001F8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006<"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "toJavaClass", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "createArrayType", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "toKVisibility", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "computeAnnotations", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", "", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKFunctionImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "asKPropertyImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKCallableImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "defaultPrimitiveValue", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "", "isInlineClassType", "(Lkotlin/reflect/KType;)Z", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1603#2,9:312\n1855#2:321\n1856#2:323\n1612#2:324\n1747#2,3:325\n1360#2:328\n1446#2,5:329\n1603#2,9:334\n1855#2:343\n1856#2:346\n1612#2:347\n1549#2:348\n1620#2,3:349\n1#3:322\n1#3:344\n1#3:345\n1#3:352\n*S KotlinDebug\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n*L\n131#1:312,9\n131#1:321\n131#1:323\n131#1:324\n140#1:325,3\n141#1:328\n141#1:329,5\n161#1:334,9\n161#1:343\n161#1:346\n161#1:347\n191#1:348\n191#1:349,3\n131#1:322\n161#1:345\n*E\n"})
public final class UtilKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[PrimitiveType.values().length];
            try {
                arr_v[PrimitiveType.BOOLEAN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.CHAR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.BYTE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.SHORT.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.INT.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.FLOAT.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.LONG.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PrimitiveType.DOUBLE.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final FqName a;

    static {
        UtilKt.a = new FqName("kotlin.jvm.JvmStatic");
    }

    public static final Class a(ClassLoader classLoader0, ClassId classId0, int v) {
        FqNameUnsafe fqNameUnsafe0 = classId0.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "kotlinClassId.asSingleFqName().toUnsafe()");
        ClassId classId1 = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe0);
        if(classId1 != null) {
            classId0 = classId1;
        }
        String s = classId0.getPackageFqName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "javaClassId.packageFqName.asString()");
        String s1 = classId0.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(s1, "javaClassId.relativeClassName.asString()");
        if(Intrinsics.areEqual(s, "kotlin")) {
            switch(s1) {
                case "Array": {
                    return Object[].class;
                }
                case "BooleanArray": {
                    return boolean[].class;
                }
                case "ByteArray": {
                    return byte[].class;
                }
                case "CharArray": {
                    return char[].class;
                }
                case "DoubleArray": {
                    return double[].class;
                }
                case "FloatArray": {
                    return float[].class;
                }
                case "IntArray": {
                    return int[].class;
                }
                case "LongArray": {
                    return long[].class;
                }
                case "ShortArray": {
                    return short[].class;
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append("[");
            }
            stringBuilder0.append("L");
        }
        if(s.length() > 0) {
            stringBuilder0.append(s + ".");
        }
        stringBuilder0.append(p.replace$default(s1, '.', '$', false, 4, null));
        if(v > 0) {
            stringBuilder0.append(";");
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader0, s2);
    }

    @Nullable
    public static final KCallableImpl asKCallableImpl(@Nullable Object object0) {
        KCallableImpl kCallableImpl0 = object0 instanceof KCallableImpl ? ((KCallableImpl)object0) : null;
        if(kCallableImpl0 == null) {
            kCallableImpl0 = UtilKt.asKFunctionImpl(object0);
            if(kCallableImpl0 == null) {
                return UtilKt.asKPropertyImpl(object0);
            }
        }
        return kCallableImpl0;
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object object0) {
        KFunctionImpl kFunctionImpl0 = object0 instanceof KFunctionImpl ? ((KFunctionImpl)object0) : null;
        if(kFunctionImpl0 == null) {
            FunctionReference functionReference0 = object0 instanceof FunctionReference ? ((FunctionReference)object0) : null;
            KCallable kCallable0 = functionReference0 == null ? null : functionReference0.compute();
            return kCallable0 instanceof KFunctionImpl ? ((KFunctionImpl)kCallable0) : null;
        }
        return kFunctionImpl0;
    }

    @Nullable
    public static final KPropertyImpl asKPropertyImpl(@Nullable Object object0) {
        KPropertyImpl kPropertyImpl0 = object0 instanceof KPropertyImpl ? ((KPropertyImpl)object0) : null;
        if(kPropertyImpl0 == null) {
            PropertyReference propertyReference0 = object0 instanceof PropertyReference ? ((PropertyReference)object0) : null;
            KCallable kCallable0 = propertyReference0 == null ? null : propertyReference0.compute();
            return kCallable0 instanceof KPropertyImpl ? ((KPropertyImpl)kCallable0) : null;
        }
        return kPropertyImpl0;
    }

    public static final Annotation b(AnnotationDescriptor annotationDescriptor0) {
        ClassDescriptor classDescriptor0 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor0);
        Class class0 = classDescriptor0 == null ? null : UtilKt.toJavaClass(classDescriptor0);
        if(class0 == null) {
            class0 = null;
        }
        if(class0 == null) {
            return null;
        }
        Iterable iterable0 = annotationDescriptor0.getAllValueArguments().entrySet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Name name0 = (Name)((Map.Entry)object0).getKey();
            ConstantValue constantValue0 = (ConstantValue)((Map.Entry)object0).getValue();
            ClassLoader classLoader0 = class0.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader0, "annotationClass.classLoader");
            Object object1 = UtilKt.c(constantValue0, classLoader0);
            Pair pair0 = object1 == null ? null : TuplesKt.to(name0.asString(), object1);
            if(pair0 != null) {
                arrayList0.add(pair0);
            }
        }
        return (Annotation)AnnotationConstructorCallerKt.createAnnotationInstance$default(class0, x.toMap(arrayList0), null, 4, null);
    }

    public static final Object c(ConstantValue constantValue0, ClassLoader classLoader0) {
        boolean[] arr_z;
        ClassDescriptor classDescriptor0;
        if(constantValue0 instanceof AnnotationValue) {
            return UtilKt.b(((AnnotationDescriptor)((AnnotationValue)constantValue0).getValue()));
        }
        if(constantValue0 instanceof ArrayValue) {
            TypedArrayValue typedArrayValue0 = ((ArrayValue)constantValue0) instanceof TypedArrayValue ? ((TypedArrayValue)(((ArrayValue)constantValue0))) : null;
            if(typedArrayValue0 != null) {
                KotlinType kotlinType0 = typedArrayValue0.getType();
                if(kotlinType0 != null) {
                    Iterable iterable0 = (Iterable)((ArrayValue)constantValue0).getValue();
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                    for(Object object0: iterable0) {
                        arrayList0.add(UtilKt.c(((ConstantValue)object0), classLoader0));
                    }
                    PrimitiveType primitiveType0 = KotlinBuiltIns.getPrimitiveArrayElementType(kotlinType0);
                    int v = 0;
                    switch((primitiveType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveType0.ordinal()])) {
                        case -1: {
                            if(!KotlinBuiltIns.isArray(kotlinType0)) {
                                throw new IllegalStateException(("Not an array type: " + kotlinType0).toString());
                            }
                            KotlinType kotlinType1 = ((TypeProjection)CollectionsKt___CollectionsKt.single(kotlinType0.getArguments())).getType();
                            Intrinsics.checkNotNullExpressionValue(kotlinType1, "type.arguments.single().type");
                            ClassifierDescriptor classifierDescriptor0 = kotlinType1.getConstructor().getDeclarationDescriptor();
                            classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
                            if(classDescriptor0 == null) {
                                throw new IllegalStateException(("Not a class type: " + kotlinType1).toString());
                            }
                            if(KotlinBuiltIns.isString(kotlinType1)) {
                                int v9 = ((List)((ArrayValue)constantValue0).getValue()).size();
                                arr_z = new String[v9];
                                while(v < v9) {
                                    Object object9 = arrayList0.get(v);
                                    Intrinsics.checkNotNull(object9, "null cannot be cast to non-null type kotlin.String");
                                    arr_z[v] = object9;
                                    ++v;
                                }
                                return arr_z;
                            }
                            if(KotlinBuiltIns.isKClass(classDescriptor0)) {
                                int v10 = ((List)((ArrayValue)constantValue0).getValue()).size();
                                arr_z = new Class[v10];
                                while(v < v10) {
                                    Object object10 = arrayList0.get(v);
                                    Intrinsics.checkNotNull(object10, "null cannot be cast to non-null type java.lang.Class<*>");
                                    arr_z[v] = object10;
                                    ++v;
                                }
                                return arr_z;
                            }
                            break;
                        }
                        case 1: {
                            int v1 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new boolean[v1];
                            while(v < v1) {
                                Object object1 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Boolean");
                                arr_z[v] = ((Boolean)object1).booleanValue();
                                ++v;
                            }
                            return arr_z;
                        }
                        case 2: {
                            int v2 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new char[v2];
                            while(v < v2) {
                                Object object2 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Char");
                                arr_z[v] = ((Character)object2).charValue();
                                ++v;
                            }
                            return arr_z;
                        }
                        case 3: {
                            int v3 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new byte[v3];
                            while(v < v3) {
                                Object object3 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Byte");
                                arr_z[v] = (byte)(((Byte)object3));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 4: {
                            int v4 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new short[v4];
                            while(v < v4) {
                                Object object4 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Short");
                                arr_z[v] = (short)(((Short)object4));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 5: {
                            int v5 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new int[v5];
                            while(v < v5) {
                                Object object5 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Int");
                                arr_z[v] = (int)(((Integer)object5));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 6: {
                            int v6 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new float[v6];
                            while(v < v6) {
                                Object object6 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type kotlin.Float");
                                arr_z[v] = (float)(((Float)object6));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 7: {
                            int v7 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new long[v7];
                            while(v < v7) {
                                Object object7 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type kotlin.Long");
                                arr_z[v] = (long)(((Long)object7));
                                ++v;
                            }
                            return arr_z;
                        }
                        case 8: {
                            int v8 = ((List)((ArrayValue)constantValue0).getValue()).size();
                            arr_z = new double[v8];
                            while(v < v8) {
                                Object object8 = arrayList0.get(v);
                                Intrinsics.checkNotNull(object8, "null cannot be cast to non-null type kotlin.Double");
                                arr_z[v] = (double)(((Double)object8));
                                ++v;
                            }
                            return arr_z;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    ClassId classId0 = DescriptorUtilsKt.getClassId(classDescriptor0);
                    if(classId0 != null) {
                        Class class0 = UtilKt.a(classLoader0, classId0, 0);
                        if(class0 != null) {
                            Object object11 = Array.newInstance(class0, ((List)((ArrayValue)constantValue0).getValue()).size());
                            Intrinsics.checkNotNull(object11, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            int v11 = arrayList0.size();
                            while(v < v11) {
                                ((Object[])object11)[v] = arrayList0.get(v);
                                ++v;
                            }
                            return (Object[])object11;
                        }
                    }
                }
            }
        }
        else if(constantValue0 instanceof EnumValue) {
            Pair pair0 = (Pair)((EnumValue)constantValue0).getValue();
            Name name0 = (Name)pair0.component2();
            Class class1 = UtilKt.a(classLoader0, ((ClassId)pair0.component1()), 0);
            if(class1 != null) {
                return Enum.valueOf(class1, name0.asString());
            }
        }
        else if(constantValue0 instanceof KClassValue) {
            Value kClassValue$Value0 = (Value)((KClassValue)constantValue0).getValue();
            if(kClassValue$Value0 instanceof NormalClass) {
                return UtilKt.a(classLoader0, ((NormalClass)kClassValue$Value0).getClassId(), ((NormalClass)kClassValue$Value0).getArrayDimensions());
            }
            if(!(kClassValue$Value0 instanceof LocalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassifierDescriptor classifierDescriptor1 = ((LocalClass)kClassValue$Value0).getType().getConstructor().getDeclarationDescriptor();
            ClassDescriptor classDescriptor1 = classifierDescriptor1 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor1) : null;
            if(classDescriptor1 != null) {
                return UtilKt.toJavaClass(classDescriptor1);
            }
        }
        else if(!(constantValue0 instanceof ErrorValue ? true : constantValue0 instanceof NullValue)) {
            return constantValue0.getValue();
        }
        return null;
    }

    @NotNull
    public static final List computeAnnotations(@NotNull Annotated annotated0) {
        List list1;
        Intrinsics.checkNotNullParameter(annotated0, "<this>");
        Annotations annotations0 = annotated0.getAnnotations();
        List list0 = new ArrayList();
        Iterator iterator0 = annotations0.iterator();
        while(true) {
            Annotation annotation0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            AnnotationDescriptor annotationDescriptor0 = (AnnotationDescriptor)object0;
            SourceElement sourceElement0 = annotationDescriptor0.getSource();
            if(sourceElement0 instanceof ReflectAnnotationSource) {
                annotation0 = ((ReflectAnnotationSource)sourceElement0).getAnnotation();
            }
            else if(sourceElement0 instanceof RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElement0 = ((RuntimeSourceElement)sourceElement0).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation0 = reflectJavaElement0 instanceof ReflectJavaAnnotation ? ((ReflectJavaAnnotation)reflectJavaElement0) : null;
                if(reflectJavaAnnotation0 != null) {
                    annotation0 = reflectJavaAnnotation0.getAnnotation();
                }
            }
            else {
                annotation0 = UtilKt.b(annotationDescriptor0);
            }
            if(annotation0 != null) {
                list0.add(annotation0);
            }
        }
        if(!list0.isEmpty()) {
            for(Object object1: list0) {
                if(Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(((Annotation)object1))).getSimpleName(), "Container")) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: list0) {
                        Annotation annotation1 = (Annotation)object2;
                        Class class0 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation1));
                        if(!Intrinsics.areEqual(class0.getSimpleName(), "Container") || class0.getAnnotation(RepeatableContainer.class) == null) {
                            list1 = k.listOf(annotation1);
                        }
                        else {
                            Object object3 = class0.getDeclaredMethod("value", null).invoke(annotation1, null);
                            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            list1 = ArraysKt___ArraysJvmKt.asList(((Annotation[])object3));
                        }
                        o.addAll(arrayList0, list1);
                    }
                    return arrayList0;
                }
                if(false) {
                    break;
                }
            }
        }
        return list0;
    }

    @NotNull
    public static final Class createArrayType(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        return Array.newInstance(class0, 0).getClass();
    }

    @Nullable
    public static final Object defaultPrimitiveValue(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        if(type0 instanceof Class && ((Class)type0).isPrimitive()) {
            if(Intrinsics.areEqual(type0, Boolean.TYPE)) {
                return false;
            }
            if(Intrinsics.areEqual(type0, Character.TYPE)) {
                return Character.valueOf('\u0000');
            }
            if(Intrinsics.areEqual(type0, Byte.TYPE)) {
                return (byte)0;
            }
            if(Intrinsics.areEqual(type0, Short.TYPE)) {
                return (short)0;
            }
            if(Intrinsics.areEqual(type0, Integer.TYPE)) {
                return 0;
            }
            if(Intrinsics.areEqual(type0, Float.TYPE)) {
                return 0.0f;
            }
            if(Intrinsics.areEqual(type0, Long.TYPE)) {
                return 0L;
            }
            if(Intrinsics.areEqual(type0, Double.TYPE)) {
                return 0.0;
            }
            if(Intrinsics.areEqual(type0, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type0);
        }
        return null;
    }

    @NotNull
    public static final CallableDescriptor deserializeToDescriptor(@NotNull Class class0, @NotNull MessageLite messageLite0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, @NotNull BinaryVersion binaryVersion0, @NotNull Function2 function20) {
        List list0;
        Intrinsics.checkNotNullParameter(class0, "moduleAnchor");
        Intrinsics.checkNotNullParameter(messageLite0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullParameter(binaryVersion0, "metadataVersion");
        Intrinsics.checkNotNullParameter(function20, "createDescriptor");
        RuntimeModuleData runtimeModuleData0 = ModuleByClassLoaderKt.getOrCreateModule(class0);
        if(messageLite0 instanceof Function) {
            list0 = ((Function)messageLite0).getTypeParameterList();
        }
        else if(messageLite0 instanceof Property) {
            list0 = ((Property)messageLite0).getTypeParameterList();
        }
        else {
            throw new IllegalStateException(("Unsupported message: " + messageLite0).toString());
        }
        ModuleDescriptor moduleDescriptor0 = runtimeModuleData0.getModule();
        VersionRequirementTable versionRequirementTable0 = VersionRequirementTable.Companion.getEMPTY();
        Intrinsics.checkNotNullExpressionValue(list0, "typeParameters");
        return (CallableDescriptor)function20.invoke(new MemberDeserializer(new DeserializationContext(runtimeModuleData0.getDeserialization(), nameResolver0, moduleDescriptor0, typeTable0, versionRequirementTable0, binaryVersion0, null, null, list0)), messageLite0);
    }

    @Nullable
    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(@NotNull CallableDescriptor callableDescriptor0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "<this>");
        if(callableDescriptor0.getDispatchReceiverParameter() != null) {
            DeclarationDescriptor declarationDescriptor0 = callableDescriptor0.getContainingDeclaration();
            Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((ClassDescriptor)declarationDescriptor0).getThisAsReceiverParameter();
        }
        return null;
    }

    @NotNull
    public static final FqName getJVM_STATIC() {
        return UtilKt.a;
    }

    public static final boolean isInlineClassType(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "<this>");
        KTypeImpl kTypeImpl0 = kType0 instanceof KTypeImpl ? ((KTypeImpl)kType0) : null;
        if(kTypeImpl0 != null) {
            KotlinType kotlinType0 = kTypeImpl0.getType();
            return kotlinType0 != null && InlineClassesUtilsKt.isInlineClassType(kotlinType0);
        }
        return false;
    }

    @Nullable
    public static final Class toJavaClass(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
        SourceElement sourceElement0 = classDescriptor0.getSource();
        Intrinsics.checkNotNullExpressionValue(sourceElement0, "source");
        if(sourceElement0 instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass kotlinJvmBinaryClass0 = ((KotlinJvmBinarySourceElement)sourceElement0).getBinaryClass();
            Intrinsics.checkNotNull(kotlinJvmBinaryClass0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass)kotlinJvmBinaryClass0).getKlass();
        }
        if(sourceElement0 instanceof RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElement0 = ((RuntimeSourceElement)sourceElement0).getJavaElement();
            Intrinsics.checkNotNull(reflectJavaElement0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass)reflectJavaElement0).getElement();
        }
        ClassId classId0 = DescriptorUtilsKt.getClassId(classDescriptor0);
        return classId0 == null ? null : UtilKt.a(ReflectClassUtilKt.getSafeClassLoader(classDescriptor0.getClass()), classId0, 0);
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "<this>");
        if(Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if(Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if(Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        return (Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.PRIVATE) ? true : Intrinsics.areEqual(descriptorVisibility0, DescriptorVisibilities.PRIVATE_TO_THIS)) ? KVisibility.PRIVATE : null;
    }
}

