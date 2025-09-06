package fe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;

public final class j extends Lambda implements Function0 {
    public final e0 w;

    public j(e0 e00) {
        this.w = e00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e0 e00 = this.w;
        e00.getClass();
        ReflectKotlinClass reflectKotlinClass0 = (ReflectKotlinClass)e00.c.getValue(e00, e0.h[0]);
        return reflectKotlinClass0 != null ? e00.getModuleData().getPackagePartScopeCache().getPackagePartScope(reflectKotlinClass0) : Empty.INSTANCE;
    }
}

