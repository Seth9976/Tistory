package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override  // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public Contract getContract() {
        return Contract.BOTH;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public Result isOverridable(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, @Nullable ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "superDescriptor");
        Intrinsics.checkNotNullParameter(callableDescriptor1, "subDescriptor");
        if(!(callableDescriptor1 instanceof PropertyDescriptor) || !(callableDescriptor0 instanceof PropertyDescriptor) || !Intrinsics.areEqual(((PropertyDescriptor)callableDescriptor1).getName(), ((PropertyDescriptor)callableDescriptor0).getName())) {
            return Result.UNKNOWN;
        }
        if(JavaDescriptorUtilKt.isJavaField(((PropertyDescriptor)callableDescriptor1)) && JavaDescriptorUtilKt.isJavaField(((PropertyDescriptor)callableDescriptor0))) {
            return Result.OVERRIDABLE;
        }
        return JavaDescriptorUtilKt.isJavaField(((PropertyDescriptor)callableDescriptor1)) || JavaDescriptorUtilKt.isJavaField(((PropertyDescriptor)callableDescriptor0)) ? Result.INCOMPATIBLE : Result.UNKNOWN;
    }
}

