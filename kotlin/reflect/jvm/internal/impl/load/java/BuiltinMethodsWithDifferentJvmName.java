package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {
    @NotNull
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE;

    static {
        BuiltinMethodsWithDifferentJvmName.INSTANCE = new BuiltinMethodsWithDifferentJvmName();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/load/java/SpecialGenericSignatures;-><init>()V
    }

    @Nullable
    public final Name getJvmName(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "functionDescriptor");
        Map map0 = SpecialGenericSignatures.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME();
        String s = MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor0);
        return s == null ? null : ((Name)map0.get(s));
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "functionDescriptor");
        return KotlinBuiltIns.isBuiltIn(simpleFunctionDescriptor0) && DescriptorUtilsKt.firstOverridden$default(simpleFunctionDescriptor0, false, new a(simpleFunctionDescriptor0), 1, null) != null;
    }

    public final boolean isRemoveAtByIndex(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor0, "<this>");
        return Intrinsics.areEqual(simpleFunctionDescriptor0.getName().asString(), "removeAt") && Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor0), SpecialGenericSignatures.Companion.getREMOVE_AT_NAME_AND_SIGNATURE().getSignature());
    }
}

