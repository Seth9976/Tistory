package androidx.fragment.app;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.arch.core.util.Function;

public final class x implements Function {
    public final int a;
    public final Object b;

    public x(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.arch.core.util.Function
    public final Object apply(Object object0) {
        if(this.a != 0) {
            Void void0 = (Void)object0;
            return (ActivityResultRegistry)this.b;
        }
        Void void1 = (Void)object0;
        FragmentHostCallback fragmentHostCallback0 = ((Fragment)this.b).mHost;
        return fragmentHostCallback0 instanceof ActivityResultRegistryOwner ? ((ActivityResultRegistryOwner)fragmentHostCallback0).getActivityResultRegistry() : ((Fragment)this.b).requireActivity().getActivityResultRegistry();
    }
}

