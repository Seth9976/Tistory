package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class j extends Lambda implements Function0 {
    public final KClassImpl w;

    public j(KClassImpl kClassImpl0) {
        this.w = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MemberScope memberScope0 = this.w.getStaticScope$kotlin_reflection();
        return this.w.getMembers(memberScope0, MemberBelonginess.DECLARED);
    }
}

