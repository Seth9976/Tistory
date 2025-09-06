package fe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;

public final class h extends Lambda implements Function0 {
    public final KPackageImpl w;

    public h(KPackageImpl kPackageImpl0) {
        this.w = kPackageImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class class0 = this.w.getJClass();
        return ReflectKotlinClass.Factory.create(class0);
    }
}

