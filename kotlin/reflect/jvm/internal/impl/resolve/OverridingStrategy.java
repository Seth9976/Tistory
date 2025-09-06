package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

public abstract class OverridingStrategy {
    public abstract void addFakeOverride(@NotNull CallableMemberDescriptor arg1);

    public abstract void inheritanceConflict(@NotNull CallableMemberDescriptor arg1, @NotNull CallableMemberDescriptor arg2);

    public abstract void overrideConflict(@NotNull CallableMemberDescriptor arg1, @NotNull CallableMemberDescriptor arg2);

    public void setOverriddenDescriptors(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "member");
        Intrinsics.checkNotNullParameter(collection0, "overridden");
        callableMemberDescriptor0.setOverriddenDescriptors(collection0);
    }
}

