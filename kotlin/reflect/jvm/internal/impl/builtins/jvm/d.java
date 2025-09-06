package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class d extends Lambda implements Function0 {
    public final JvmBuiltInsCustomizer w;
    public final StorageManager x;

    public d(JvmBuiltInsCustomizer jvmBuiltInsCustomizer0, StorageManager storageManager0) {
        this.w = jvmBuiltInsCustomizer0;
        this.x = storageManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ModuleDescriptor moduleDescriptor0 = this.w.b().getOwnerModuleDescriptor();
        ClassId classId0 = JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID();
        ModuleDescriptor moduleDescriptor1 = this.w.b().getOwnerModuleDescriptor();
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(moduleDescriptor0, classId0, new NotFoundClasses(this.x, moduleDescriptor1)).getDefaultType();
    }
}

