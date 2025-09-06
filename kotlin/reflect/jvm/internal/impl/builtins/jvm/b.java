package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class b extends Lambda implements Function0 {
    public final JvmBuiltIns w;
    public final StorageManager x;

    public b(JvmBuiltIns jvmBuiltIns0, StorageManager storageManager0) {
        this.w = jvmBuiltIns0;
        this.x = storageManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ModuleDescriptorImpl moduleDescriptorImpl0 = this.w.getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(moduleDescriptorImpl0, "builtInsModule");
        a a0 = new a(this.w);
        return new JvmBuiltInsCustomizer(moduleDescriptorImpl0, this.x, a0);
    }
}

