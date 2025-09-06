package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class r extends Lambda implements Function0 {
    public final KClassImpl w;
    public final Data x;

    public r(Data kClassImpl$Data0, KClassImpl kClassImpl0) {
        this.w = kClassImpl0;
        this.x = kClassImpl$Data0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClassImpl kClassImpl0 = this.w;
        if(kClassImpl0.getJClass().isAnonymousClass()) {
            return null;
        }
        ClassId classId0 = KClassImpl.access$getClassId(kClassImpl0);
        if(classId0.isLocal()) {
            return Data.access$calculateLocalClassName(this.x, kClassImpl0.getJClass());
        }
        String s = classId0.getShortClassName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "classId.shortClassName.asString()");
        return s;
    }
}

