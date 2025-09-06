package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

public final class DeserializedClassDescriptor.DeserializedClassMemberScope.generateFakeOverrides.1 extends NonReportingOverrideStrategy {
    public final List a;

    public DeserializedClassDescriptor.DeserializedClassMemberScope.generateFakeOverrides.1(List list0) {
        this.a = list0;
        super();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "fakeOverride");
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor0, null);
        this.a.add(callableMemberDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @NotNull CallableMemberDescriptor callableMemberDescriptor1) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "fromSuper");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor1, "fromCurrent");
        if(callableMemberDescriptor1 instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl)callableMemberDescriptor1).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, callableMemberDescriptor0);
        }
    }
}

