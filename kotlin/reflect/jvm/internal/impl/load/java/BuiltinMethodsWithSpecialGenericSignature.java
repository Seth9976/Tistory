package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import oe.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/BuiltinMethodsWithSpecialGenericSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {
    @NotNull
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE;

    static {
        BuiltinMethodsWithSpecialGenericSignature.INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/load/java/SpecialGenericSignatures;-><init>()V
    }

    public static final boolean access$getHasErasedValueParametersInJava(BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature0, CallableMemberDescriptor callableMemberDescriptor0) {
        builtinMethodsWithSpecialGenericSignature0.getClass();
        return CollectionsKt___CollectionsKt.contains(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor0));
    }

    @JvmStatic
    @Nullable
    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(@NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "functionDescriptor");
        Name name0 = functionDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "functionDescriptor.name");
        return BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name0) ? ((FunctionDescriptor)DescriptorUtilsKt.firstOverridden$default(functionDescriptor0, false, b.w, 1, null)) : null;
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "<this>");
        return SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(name0);
    }

    @JvmStatic
    @Nullable
    public static final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        Companion specialGenericSignatures$Companion0 = SpecialGenericSignatures.Companion;
        if(!specialGenericSignatures$Companion0.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(callableMemberDescriptor0.getName())) {
            return null;
        }
        CallableMemberDescriptor callableMemberDescriptor1 = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor0, false, kotlin.reflect.jvm.internal.impl.load.java.b.w, 1, null);
        if(callableMemberDescriptor1 != null) {
            String s = MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor1);
            return s == null ? null : specialGenericSignatures$Companion0.getSpecialSignatureInfo(s);
        }
        return null;
    }
}

