package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1#2:294\n1549#3:295\n1620#3,3:296\n223#3,2:299\n1549#3:301\n1620#3,3:302\n1549#3:305\n1620#3,3:306\n1590#3,4:309\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n152#1:295\n152#1:296,3\n187#1:299,2\n192#1:301\n192#1:302,3\n214#1:305\n214#1:306,3\n217#1:309,4\n*E\n"})
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        AnnotationDescriptor annotationDescriptor0 = kotlinType0.getAnnotations().findAnnotation(FqNames.contextFunctionTypeParams);
        if(annotationDescriptor0 == null) {
            return 0;
        }
        ConstantValue constantValue0 = (ConstantValue)x.getValue(annotationDescriptor0.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        Intrinsics.checkNotNull(constantValue0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number)((IntValue)constantValue0).getValue()).intValue();
    }

    @JvmOverloads
    @NotNull
    public static final SimpleType createFunctionType(@NotNull KotlinBuiltIns kotlinBuiltIns0, @NotNull Annotations annotations0, @Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull List list1, @Nullable List list2, @NotNull KotlinType kotlinType1, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(list0, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(list1, "parameterTypes");
        Intrinsics.checkNotNullParameter(kotlinType1, "returnType");
        List list3 = FunctionTypesKt.getFunctionTypeArgumentProjections(kotlinType0, list0, list1, list2, kotlinType1, kotlinBuiltIns0);
        ClassDescriptor classDescriptor0 = FunctionTypesKt.getFunctionDescriptor(kotlinBuiltIns0, list0.size() + list1.size() + (kotlinType0 == null ? 0 : 1), z);
        if(kotlinType0 != null) {
            annotations0 = FunctionTypesKt.withExtensionFunctionAnnotation(annotations0, kotlinBuiltIns0);
        }
        if(!list0.isEmpty()) {
            annotations0 = FunctionTypesKt.withContextReceiversFunctionAnnotation(annotations0, kotlinBuiltIns0, list0.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations0), classDescriptor0, list3);
    }

    public static SimpleType createFunctionType$default(KotlinBuiltIns kotlinBuiltIns0, Annotations annotations0, KotlinType kotlinType0, List list0, List list1, List list2, KotlinType kotlinType1, boolean z, int v, Object object0) {
        return (v & 0x80) == 0 ? FunctionTypesKt.createFunctionType(kotlinBuiltIns0, annotations0, kotlinType0, list0, list1, list2, kotlinType1, z) : FunctionTypesKt.createFunctionType(kotlinBuiltIns0, annotations0, kotlinType0, list0, list1, list2, kotlinType1, false);
    }

    @Nullable
    public static final Name extractParameterNameFromFunctionTypeArgument(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        AnnotationDescriptor annotationDescriptor0 = kotlinType0.getAnnotations().findAnnotation(FqNames.parameterName);
        if(annotationDescriptor0 == null) {
            return null;
        }
        Object object0 = CollectionsKt___CollectionsKt.singleOrNull(annotationDescriptor0.getAllValueArguments().values());
        StringValue stringValue0 = object0 instanceof StringValue ? ((StringValue)object0) : null;
        if(stringValue0 != null) {
            String s = (String)stringValue0.getValue();
            if(s != null) {
                if(!Name.isValidIdentifier(s)) {
                    s = null;
                }
                return s == null ? null : Name.identifier(s);
            }
        }
        return null;
    }

    @NotNull
    public static final List getContextReceiverTypesFromFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        FunctionTypesKt.isBuiltinFunctionalType(kotlinType0);
        int v = FunctionTypesKt.contextFunctionTypeParamsCount(kotlinType0);
        if(v == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterable iterable0 = kotlinType0.getArguments().subList(0, v);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            KotlinType kotlinType1 = ((TypeProjection)object0).getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType1, "it.type");
            arrayList0.add(kotlinType1);
        }
        return arrayList0;
    }

    @NotNull
    public static final ClassDescriptor getFunctionDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        ClassDescriptor classDescriptor0 = z ? kotlinBuiltIns0.getSuspendFunction(v) : kotlinBuiltIns0.getFunction(v);
        Intrinsics.checkNotNullExpressionValue(classDescriptor0, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return classDescriptor0;
    }

    @NotNull
    public static final List getFunctionTypeArgumentProjections(@Nullable KotlinType kotlinType0, @NotNull List list0, @NotNull List list1, @Nullable List list2, @NotNull KotlinType kotlinType1, @NotNull KotlinBuiltIns kotlinBuiltIns0) {
        Name name1;
        Intrinsics.checkNotNullParameter(list0, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(list1, "parameterTypes");
        Intrinsics.checkNotNullParameter(kotlinType1, "returnType");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        int v = 0;
        List list3 = new ArrayList(list0.size() + list1.size() + (kotlinType0 == null ? 0 : 1) + 1);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(TypeUtilsKt.asTypeProjection(((KotlinType)object0)));
        }
        ((ArrayList)list3).addAll(arrayList0);
        CollectionsKt.addIfNotNull(list3, (kotlinType0 == null ? null : TypeUtilsKt.asTypeProjection(kotlinType0)));
        for(Object object1: list1) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            KotlinType kotlinType2 = (KotlinType)object1;
            if(list2 == null) {
                name1 = null;
            }
            else {
                Name name0 = (Name)list2.get(v);
                if(name0 != null && !name0.isSpecial()) {
                    name1 = name0;
                }
            }
            if(name1 != null) {
                Name name2 = Name.identifier("name");
                String s = name1.asString();
                Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
                Map map0 = w.mapOf(TuplesKt.to(name2, new StringValue(s)));
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor0 = new BuiltInAnnotationDescriptor(kotlinBuiltIns0, FqNames.parameterName, map0);
                List list4 = CollectionsKt___CollectionsKt.plus(kotlinType2.getAnnotations(), builtInAnnotationDescriptor0);
                kotlinType2 = TypeUtilsKt.replaceAnnotations(kotlinType2, Annotations.Companion.create(list4));
            }
            list3.add(TypeUtilsKt.asTypeProjection(kotlinType2));
            ++v;
        }
        ((ArrayList)list3).add(TypeUtilsKt.asTypeProjection(kotlinType1));
        return list3;
    }

    @Nullable
    public static final FunctionClassKind getFunctionalClassKind(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        if(!(declarationDescriptor0 instanceof ClassDescriptor)) {
            return null;
        }
        if(!KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor0)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor0);
        if(fqNameUnsafe0.isSafe() && !fqNameUnsafe0.isRoot()) {
            String s = fqNameUnsafe0.shortName().asString();
            Intrinsics.checkNotNullExpressionValue(s, "shortName().asString()");
            FqName fqName0 = fqNameUnsafe0.toSafe().parent();
            Intrinsics.checkNotNullExpressionValue(fqName0, "toSafe().parent()");
            return FunctionClassKind.Companion.getFunctionalClassKind(s, fqName0);
        }
        return null;
    }

    @Nullable
    public static final KotlinType getReceiverTypeFromFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        FunctionTypesKt.isBuiltinFunctionalType(kotlinType0);
        if(kotlinType0.getAnnotations().findAnnotation(FqNames.extensionFunctionType) != null) {
            int v = FunctionTypesKt.contextFunctionTypeParamsCount(kotlinType0);
            return ((TypeProjection)kotlinType0.getArguments().get(v)).getType();
        }
        return null;
    }

    @NotNull
    public static final KotlinType getReturnTypeFromFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        FunctionTypesKt.isBuiltinFunctionalType(kotlinType0);
        KotlinType kotlinType1 = ((TypeProjection)CollectionsKt___CollectionsKt.last(kotlinType0.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "arguments.last().type");
        return kotlinType1;
    }

    @NotNull
    public static final List getValueParameterTypesFromFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        FunctionTypesKt.isBuiltinFunctionalType(kotlinType0);
        List list0 = kotlinType0.getArguments();
        int v = FunctionTypesKt.contextFunctionTypeParamsCount(kotlinType0);
        return list0.subList(FunctionTypesKt.isBuiltinExtensionFunctionalType(kotlinType0) + v, list0.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return FunctionTypesKt.isBuiltinFunctionalType(kotlinType0) && kotlinType0.getAnnotations().findAnnotation(FqNames.extensionFunctionType) != null;
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        FunctionClassKind functionClassKind0 = FunctionTypesKt.getFunctionalClassKind(declarationDescriptor0);
        return functionClassKind0 == FunctionClassKind.Function || functionClassKind0 == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 != null && FunctionTypesKt.isBuiltinFunctionalClassDescriptor(classifierDescriptor0);
    }

    public static final boolean isFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return (classifierDescriptor0 == null ? null : FunctionTypesKt.getFunctionalClassKind(classifierDescriptor0)) == FunctionClassKind.Function;
    }

    public static final boolean isSuspendFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return (classifierDescriptor0 == null ? null : FunctionTypesKt.getFunctionalClassKind(classifierDescriptor0)) == FunctionClassKind.SuspendFunction;
    }

    @NotNull
    public static final Annotations withContextReceiversFunctionAnnotation(@NotNull Annotations annotations0, @NotNull KotlinBuiltIns kotlinBuiltIns0, int v) {
        Intrinsics.checkNotNullParameter(annotations0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        FqName fqName0 = FqNames.contextFunctionTypeParams;
        if(!annotations0.hasAnnotation(fqName0)) {
            IntValue intValue0 = new IntValue(v);
            List list0 = CollectionsKt___CollectionsKt.plus(annotations0, new BuiltInAnnotationDescriptor(kotlinBuiltIns0, fqName0, w.mapOf(TuplesKt.to(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, intValue0))));
            return Annotations.Companion.create(list0);
        }
        return annotations0;
    }

    @NotNull
    public static final Annotations withExtensionFunctionAnnotation(@NotNull Annotations annotations0, @NotNull KotlinBuiltIns kotlinBuiltIns0) {
        Intrinsics.checkNotNullParameter(annotations0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        FqName fqName0 = FqNames.extensionFunctionType;
        if(!annotations0.hasAnnotation(fqName0)) {
            List list0 = CollectionsKt___CollectionsKt.plus(annotations0, new BuiltInAnnotationDescriptor(kotlinBuiltIns0, fqName0, x.emptyMap()));
            return Annotations.Companion.create(list0);
        }
        return annotations0;
    }
}

