package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.jetbrains.annotations.NotNull;

public final class GivenFunctionsMemberScope.createFakeOverrides.4 extends NonReportingOverrideStrategy {
    public final ArrayList a;
    public final GivenFunctionsMemberScope b;

    public GivenFunctionsMemberScope.createFakeOverrides.4(ArrayList arrayList0, GivenFunctionsMemberScope givenFunctionsMemberScope0) {
        this.a = arrayList0;
        this.b = givenFunctionsMemberScope0;
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
        throw new IllegalStateException(("Conflict in scope of " + this.b.getContainingClass() + ": " + callableMemberDescriptor0 + " vs " + callableMemberDescriptor1).toString());
    }
}

