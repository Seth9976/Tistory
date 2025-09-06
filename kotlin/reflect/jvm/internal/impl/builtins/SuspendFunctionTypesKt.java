package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nsuspendFunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1#3:70\n*S KotlinDebug\n*F\n+ 1 suspendFunctionTypes.kt\norg/jetbrains/kotlin/builtins/SuspendFunctionTypesKt\n*L\n54#1:66\n54#1:67,3\n*E\n"})
public final class SuspendFunctionTypesKt {
    public static final MutableClassDescriptor a;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor0 = new EmptyPackageFragmentDescriptor(ErrorUtils.INSTANCE.getErrorModule(), StandardNames.COROUTINES_PACKAGE_FQ_NAME);
        Name name0 = StandardNames.CONTINUATION_INTERFACE_FQ_NAME.shortName();
        MutableClassDescriptor mutableClassDescriptor0 = new MutableClassDescriptor(emptyPackageFragmentDescriptor0, ClassKind.INTERFACE, false, false, name0, SourceElement.NO_SOURCE, LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor0.setModality(Modality.ABSTRACT);
        mutableClassDescriptor0.setVisibility(DescriptorVisibilities.PUBLIC);
        Name name1 = Name.identifier("T");
        mutableClassDescriptor0.setTypeParameterDescriptors(k.listOf(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor0, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, name1, 0, LockBasedStorageManager.NO_LOCKS)));
        mutableClassDescriptor0.createTypeConstructor();
        SuspendFunctionTypesKt.a = mutableClassDescriptor0;
    }

    @NotNull
    public static final SimpleType transformSuspendFunctionToRuntimeFunctionType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "suspendFunType");
        FunctionTypesKt.isSuspendFunctionType(kotlinType0);
        KotlinBuiltIns kotlinBuiltIns0 = TypeUtilsKt.getBuiltIns(kotlinType0);
        Annotations annotations0 = kotlinType0.getAnnotations();
        KotlinType kotlinType1 = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType0);
        List list0 = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType0);
        Iterable iterable0 = FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType0);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((TypeProjection)object0).getType());
        }
        TypeAttributes typeAttributes0 = TypeAttributes.Companion.getEmpty();
        TypeConstructor typeConstructor0 = SuspendFunctionTypesKt.a.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor0, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        List list1 = CollectionsKt___CollectionsKt.plus(arrayList0, KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, k.listOf(TypeUtilsKt.asTypeProjection(FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType0))), false, null, 16, null));
        SimpleType simpleType0 = TypeUtilsKt.getBuiltIns(kotlinType0).getNullableAnyType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "suspendFunType.builtIns.nullableAnyType");
        return FunctionTypesKt.createFunctionType$default(kotlinBuiltIns0, annotations0, kotlinType1, list0, list1, null, simpleType0, false, 0x80, null).makeNullableAsSpecified(kotlinType0.isMarkedNullable());
    }
}

