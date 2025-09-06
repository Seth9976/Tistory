package pe;

import he.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

public final class a extends NonReportingOverrideStrategy {
    public final ErrorReporter a;
    public final LinkedHashSet b;
    public final boolean c;

    public a(ErrorReporter errorReporter0, LinkedHashSet linkedHashSet0, boolean z) {
        this.a = errorReporter0;
        this.b = linkedHashSet0;
        this.c = z;
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
            case 3: {
                arr_object[0] = "member";
                break;
            }
            case 4: {
                arr_object[0] = "overridden";
                break;
            }
            default: {
                arr_object[0] = "fakeOverride";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "conflict";
                break;
            }
            case 3: 
            case 4: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            default: {
                arr_object[2] = "addFakeOverride";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor0, new b(this, 1));
            this.b.add(callableMemberDescriptor0);
            return;
        }
        a.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public final void conflict(CallableMemberDescriptor callableMemberDescriptor0, CallableMemberDescriptor callableMemberDescriptor1) {
        if(callableMemberDescriptor0 != null) {
            if(callableMemberDescriptor1 != null) {
                return;
            }
            a.a(2);
            throw null;
        }
        a.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void setOverriddenDescriptors(CallableMemberDescriptor callableMemberDescriptor0, Collection collection0) {
        if(callableMemberDescriptor0 != null) {
            if(collection0 != null) {
                if(this.c && callableMemberDescriptor0.getKind() != Kind.FAKE_OVERRIDE) {
                    return;
                }
                super.setOverriddenDescriptors(callableMemberDescriptor0, collection0);
                return;
            }
            a.a(4);
            throw null;
        }
        a.a(3);
        throw null;
    }
}

