package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    public abstract void conflict(@NotNull CallableMemberDescriptor arg1, @NotNull CallableMemberDescriptor arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @NotNull CallableMemberDescriptor callableMemberDescriptor1) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "first");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor1, "second");
        this.conflict(callableMemberDescriptor0, callableMemberDescriptor1);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @NotNull CallableMemberDescriptor callableMemberDescriptor1) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "fromSuper");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor1, "fromCurrent");
        this.conflict(callableMemberDescriptor0, callableMemberDescriptor1);
    }
}

