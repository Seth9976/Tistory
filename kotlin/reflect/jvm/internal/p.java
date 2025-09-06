package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class p extends Lambda implements Function0 {
    public final KClassImpl w;

    public p(KClassImpl kClassImpl0) {
        this.w = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClassImpl kClassImpl0 = this.w;
        if(!kClassImpl0.getJClass().isAnonymousClass()) {
            ClassId classId0 = KClassImpl.access$getClassId(kClassImpl0);
            return classId0.isLocal() ? null : classId0.asSingleFqName().asString();
        }
        return null;
    }
}

