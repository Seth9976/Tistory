package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

public final class i extends NonReportingOverrideStrategy {
    public final LinkedHashSet a;

    public i(LinkedHashSet linkedHashSet0) {
        this.a = linkedHashSet0;
        super();
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "fromSuper";
                break;
            }
            case 2: {
                arr_object[0] = "fromCurrent";
                break;
            }
            default: {
                arr_object[0] = "fakeOverride";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        arr_object[2] = v == 1 || v == 2 ? "conflict" : "addFakeOverride";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor0, null);
            this.a.add(callableMemberDescriptor0);
            return;
        }
        i.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public final void conflict(CallableMemberDescriptor callableMemberDescriptor0, CallableMemberDescriptor callableMemberDescriptor1) {
        if(callableMemberDescriptor0 != null) {
            if(callableMemberDescriptor1 != null) {
                return;
            }
            i.a(2);
            throw null;
        }
        i.a(1);
        throw null;
    }
}

