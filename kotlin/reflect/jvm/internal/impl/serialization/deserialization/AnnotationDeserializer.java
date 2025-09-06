package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nAnnotationDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n121#1:147\n121#1:148\n121#1:149\n121#1:150\n1194#2,2:128\n1222#2,4:130\n1603#2,9:134\n1855#2:143\n1856#2:145\n1612#2:146\n1549#2:151\n1620#2,3:152\n1726#2,3:155\n1#3:144\n*S KotlinDebug\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n*L\n74#1:147\n76#1:148\n77#1:149\n78#1:150\n47#1:128,2\n47#1:130,4\n48#1:134,9\n48#1:143\n48#1:145\n48#1:146\n87#1:151\n87#1:152,3\n112#1:155,3\n48#1:144\n*E\n"})
public final class AnnotationDeserializer {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.BYTE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.CHAR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.SHORT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.INT.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.LONG.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.FLOAT.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.DOUBLE.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.BOOLEAN.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.STRING.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.CLASS.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ENUM.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ANNOTATION.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ARRAY.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final ModuleDescriptor a;
    public final NotFoundClasses b;

    public AnnotationDeserializer(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        super();
        this.a = moduleDescriptor0;
        this.b = notFoundClasses0;
    }

    public final boolean a(ConstantValue constantValue0, KotlinType kotlinType0, Value protoBuf$Annotation$Argument$Value0) {
        Type protoBuf$Annotation$Argument$Value$Type0 = protoBuf$Annotation$Argument$Value0.getType();
        int v = protoBuf$Annotation$Argument$Value$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[protoBuf$Annotation$Argument$Value$Type0.ordinal()];
        if(v != 10) {
            ModuleDescriptor moduleDescriptor0 = this.a;
            if(v != 13) {
                return Intrinsics.areEqual(constantValue0.getType(moduleDescriptor0), kotlinType0);
            }
            if(!(constantValue0 instanceof ArrayValue) || ((List)((ArrayValue)constantValue0).getValue()).size() != protoBuf$Annotation$Argument$Value0.getArrayElementList().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue0).toString());
            }
            KotlinType kotlinType1 = moduleDescriptor0.getBuiltIns().getArrayElementType(kotlinType0);
            Intrinsics.checkNotNullExpressionValue(kotlinType1, "builtIns.getArrayElementType(expectedType)");
            IntRange intRange0 = CollectionsKt__CollectionsKt.getIndices(((Collection)((ArrayValue)constantValue0).getValue()));
            if(!(intRange0 instanceof Collection) || !((Collection)intRange0).isEmpty()) {
                Iterator iterator0 = intRange0.iterator();
                while(iterator0.hasNext()) {
                    int v1 = ((IntIterator)iterator0).nextInt();
                    ConstantValue constantValue1 = (ConstantValue)((List)((ArrayValue)constantValue0).getValue()).get(v1);
                    Value protoBuf$Annotation$Argument$Value1 = protoBuf$Annotation$Argument$Value0.getArrayElement(v1);
                    Intrinsics.checkNotNullExpressionValue(protoBuf$Annotation$Argument$Value1, "value.getArrayElement(i)");
                    if(!this.a(constantValue1, kotlinType1, protoBuf$Annotation$Argument$Value1)) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        return classDescriptor0 == null || KotlinBuiltIns.isKClass(classDescriptor0);
    }

    @NotNull
    public final AnnotationDescriptor deserializeAnnotation(@NotNull Annotation protoBuf$Annotation0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$Annotation0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        ClassId classId0 = NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Annotation0.getId());
        ClassDescriptor classDescriptor0 = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.a, classId0, this.b);
        Map map0 = x.emptyMap();
        if(protoBuf$Annotation0.getArgumentCount() != 0 && !ErrorUtils.isError(classDescriptor0) && DescriptorUtils.isAnnotationClass(classDescriptor0)) {
            Collection collection0 = classDescriptor0.getConstructors();
            Intrinsics.checkNotNullExpressionValue(collection0, "annotationClass.constructors");
            ClassConstructorDescriptor classConstructorDescriptor0 = (ClassConstructorDescriptor)CollectionsKt___CollectionsKt.singleOrNull(collection0);
            if(classConstructorDescriptor0 != null) {
                List list0 = classConstructorDescriptor0.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "constructor.valueParameters");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(list0, 10)), 16));
                for(Object object0: list0) {
                    linkedHashMap0.put(((ValueParameterDescriptor)object0).getName(), object0);
                }
                List list1 = protoBuf$Annotation0.getArgumentList();
                Intrinsics.checkNotNullExpressionValue(list1, "proto.argumentList");
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list1) {
                    Argument protoBuf$Annotation$Argument0 = (Argument)object1;
                    Intrinsics.checkNotNullExpressionValue(protoBuf$Annotation$Argument0, "it");
                    ValueParameterDescriptor valueParameterDescriptor0 = (ValueParameterDescriptor)linkedHashMap0.get(NameResolverUtilKt.getName(nameResolver0, protoBuf$Annotation$Argument0.getNameId()));
                    ConstantValue constantValue0 = null;
                    if(valueParameterDescriptor0 != null) {
                        Name name0 = NameResolverUtilKt.getName(nameResolver0, protoBuf$Annotation$Argument0.getNameId());
                        KotlinType kotlinType0 = valueParameterDescriptor0.getType();
                        Intrinsics.checkNotNullExpressionValue(kotlinType0, "parameter.type");
                        Value protoBuf$Annotation$Argument$Value0 = protoBuf$Annotation$Argument0.getValue();
                        Intrinsics.checkNotNullExpressionValue(protoBuf$Annotation$Argument$Value0, "proto.value");
                        ConstantValue constantValue1 = this.resolveValue(kotlinType0, protoBuf$Annotation$Argument$Value0, nameResolver0);
                        if(this.a(constantValue1, kotlinType0, protoBuf$Annotation$Argument$Value0)) {
                            constantValue0 = constantValue1;
                        }
                        if(constantValue0 == null) {
                            constantValue0 = ErrorValue.Companion.create("Unexpected argument value: actual type " + protoBuf$Annotation$Argument$Value0.getType() + " != expected type " + kotlinType0);
                        }
                        constantValue0 = new Pair(name0, constantValue0);
                    }
                    if(constantValue0 != null) {
                        arrayList0.add(constantValue0);
                    }
                }
                map0 = x.toMap(arrayList0);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptor0.getDefaultType(), map0, SourceElement.NO_SOURCE);
    }

    @NotNull
    public final ConstantValue resolveValue(@NotNull KotlinType kotlinType0, @NotNull Value protoBuf$Annotation$Argument$Value0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "expectedType");
        Intrinsics.checkNotNullParameter(protoBuf$Annotation$Argument$Value0, "value");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Boolean boolean0 = Flags.IS_UNSIGNED.get(protoBuf$Annotation$Argument$Value0.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolean0, "IS_UNSIGNED.get(value.flags)");
        boolean z = boolean0.booleanValue();
        Type protoBuf$Annotation$Argument$Value$Type0 = protoBuf$Annotation$Argument$Value0.getType();
        switch((protoBuf$Annotation$Argument$Value$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[protoBuf$Annotation$Argument$Value$Type0.ordinal()])) {
            case 1: {
                int v = (byte)(((int)protoBuf$Annotation$Argument$Value0.getIntValue()));
                return z ? new UByteValue(((byte)v)) : new ByteValue(((byte)v));
            }
            case 2: {
                return new CharValue(((char)(((int)protoBuf$Annotation$Argument$Value0.getIntValue()))));
            }
            case 3: {
                int v1 = (short)(((int)protoBuf$Annotation$Argument$Value0.getIntValue()));
                return z ? new UShortValue(((short)v1)) : new ShortValue(((short)v1));
            }
            case 4: {
                int v2 = (int)protoBuf$Annotation$Argument$Value0.getIntValue();
                return z ? new UIntValue(v2) : new IntValue(v2);
            }
            case 5: {
                long v3 = protoBuf$Annotation$Argument$Value0.getIntValue();
                return z ? new ULongValue(v3) : new LongValue(v3);
            }
            case 6: {
                return new FloatValue(protoBuf$Annotation$Argument$Value0.getFloatValue());
            }
            case 7: {
                return new DoubleValue(protoBuf$Annotation$Argument$Value0.getDoubleValue());
            }
            case 8: {
                return protoBuf$Annotation$Argument$Value0.getIntValue() == 0L ? new BooleanValue(false) : new BooleanValue(true);
            }
            case 9: {
                return new StringValue(nameResolver0.getString(protoBuf$Annotation$Argument$Value0.getStringValue()));
            }
            case 10: {
                return new KClassValue(NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Annotation$Argument$Value0.getClassId()), protoBuf$Annotation$Argument$Value0.getArrayDimensionCount());
            }
            case 11: {
                return new EnumValue(NameResolverUtilKt.getClassId(nameResolver0, protoBuf$Annotation$Argument$Value0.getClassId()), NameResolverUtilKt.getName(nameResolver0, protoBuf$Annotation$Argument$Value0.getEnumValueId()));
            }
            case 12: {
                Annotation protoBuf$Annotation0 = protoBuf$Annotation$Argument$Value0.getAnnotation();
                Intrinsics.checkNotNullExpressionValue(protoBuf$Annotation0, "value.annotation");
                return new AnnotationValue(this.deserializeAnnotation(protoBuf$Annotation0, nameResolver0));
            }
            case 13: {
                ConstantValueFactory constantValueFactory0 = ConstantValueFactory.INSTANCE;
                List list0 = protoBuf$Annotation$Argument$Value0.getArrayElementList();
                Intrinsics.checkNotNullExpressionValue(list0, "value.arrayElementList");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    SimpleType simpleType0 = this.a.getBuiltIns().getAnyType();
                    Intrinsics.checkNotNullExpressionValue(simpleType0, "builtIns.anyType");
                    Intrinsics.checkNotNullExpressionValue(((Value)object0), "it");
                    arrayList0.add(this.resolveValue(simpleType0, ((Value)object0), nameResolver0));
                }
                return constantValueFactory0.createArrayValue(arrayList0, kotlinType0);
            }
            default: {
                throw new IllegalStateException(("Unsupported annotation argument type: " + protoBuf$Annotation$Argument$Value0.getType() + " (expected " + kotlinType0 + ')').toString());
            }
        }
    }
}

