package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final KDeclarationContainerImpl w;

    public x(KDeclarationContainerImpl kDeclarationContainerImpl0) {
        this.w = kDeclarationContainerImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ModuleByClassLoaderKt.getOrCreateModule(this.w.getJClass());
    }
}

