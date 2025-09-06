package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final JvmBuiltIns w;

    public a(JvmBuiltIns jvmBuiltIns0) {
        this.w = jvmBuiltIns0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        JvmBuiltIns jvmBuiltIns0 = this.w;
        Function0 function00 = jvmBuiltIns0.f;
        if(function00 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        Settings jvmBuiltIns$Settings0 = (Settings)function00.invoke();
        jvmBuiltIns0.f = null;
        return jvmBuiltIns$Settings0;
    }
}

