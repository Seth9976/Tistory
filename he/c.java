package he;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

public final class c implements Function0 {
    public final ModuleDescriptorImpl a;
    public final KotlinBuiltIns b;

    public c(KotlinBuiltIns kotlinBuiltIns0, ModuleDescriptorImpl moduleDescriptorImpl0) {
        this.b = kotlinBuiltIns0;
        this.a = moduleDescriptorImpl0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KotlinBuiltIns kotlinBuiltIns0 = this.b;
        ModuleDescriptorImpl moduleDescriptorImpl0 = this.a;
        if(kotlinBuiltIns0.a != null) {
            throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns0.a + " (attempting to reset to " + moduleDescriptorImpl0 + ")");
        }
        kotlinBuiltIns0.a = moduleDescriptorImpl0;
        return null;
    }
}

