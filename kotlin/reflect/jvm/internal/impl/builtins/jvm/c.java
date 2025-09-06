package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

public final class c extends Lambda implements Function0 {
    public final ModuleDescriptor w;
    public final boolean x;

    public c(ModuleDescriptor moduleDescriptor0, boolean z) {
        this.w = moduleDescriptor0;
        this.x = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Settings(this.w, this.x);
    }
}

