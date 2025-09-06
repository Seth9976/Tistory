package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.Entry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEntryKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class d2 extends SuspendLambda implements Function2 {
    public Object a;
    public final BlogMainViewModel b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public d2(BlogMainViewModel blogMainViewModel0, boolean z, boolean z1, boolean z2, String s, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d2(this.b, this.c, this.d, this.e, this.f, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d2)this.create(((Entry)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Entry entry0 = (Entry)this.a;
        Long long0 = (Long)this.b.v.getValue();
        b2 b20 = new b2(this.f, this.b, this.d);
        c2 c20 = new c2(this.b, long0 != null && ((long)long0) == entry0.getOwner() || this.c);
        return BlogMainEntryKt.toBlogEntry(entry0, this.d, this.e, b20, c20);
    }
}

