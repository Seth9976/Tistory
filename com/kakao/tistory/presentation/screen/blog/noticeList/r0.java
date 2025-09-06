package com.kakao.tistory.presentation.screen.blog.noticeList;

import com.kakao.tistory.domain.blog.entity.Notice;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.BlogNoticeKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class r0 extends SuspendLambda implements Function2 {
    public Object a;
    public final BlogNoticeListViewModel b;
    public final boolean c;
    public final boolean d;

    public r0(BlogNoticeListViewModel blogNoticeListViewModel0, boolean z, boolean z1, Continuation continuation0) {
        this.b = blogNoticeListViewModel0;
        this.c = z;
        this.d = z1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new r0(this.b, this.c, this.d, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r0)this.create(((Notice)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Notice notice0 = (Notice)this.a;
        Long long0 = (Long)this.b.i.getValue();
        p0 p00 = new p0(this.b, this.d);
        q0 q00 = new q0(this.b, long0 != null && ((long)long0) == notice0.getOwner() || this.c);
        return BlogNoticeKt.toBlogEntry(notice0, this.d, p00, q00);
    }
}

