package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class d0 extends Lambda implements Function0 {
    public final KPackageImpl w;
    public final e0 x;

    public d0(KPackageImpl kPackageImpl0, e0 e00) {
        this.w = kPackageImpl0;
        this.x = e00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.x.getClass();
        Object object0 = this.x.d.getValue(this.x, e0.h[1]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-scope>(...)");
        return this.w.getMembers(((MemberScope)object0), MemberBelonginess.DECLARED);
    }
}

