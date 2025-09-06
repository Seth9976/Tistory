package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class k extends Lambda implements Function0 {
    public final KClassImpl w;

    public k(KClassImpl kClassImpl0) {
        this.w = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClassImpl kClassImpl0 = this.w;
        ClassId classId0 = KClassImpl.access$getClassId(kClassImpl0);
        RuntimeModuleData runtimeModuleData0 = ((Data)kClassImpl0.getData().invoke()).getModuleData();
        ClassDescriptor classDescriptor0 = classId0.isLocal() ? runtimeModuleData0.getDeserialization().deserializeClass(classId0) : FindClassInModuleKt.findClassAcrossModuleDependencies(runtimeModuleData0.getModule(), classId0);
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        KClassImpl.access$reportUnresolvedClass(kClassImpl0);
        throw null;
    }
}

