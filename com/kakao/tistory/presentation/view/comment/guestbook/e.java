package com.kakao.tistory.presentation.view.comment.guestbook;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public GuestbookViewModel a;
    public Object b;
    public final GuestbookViewModel c;
    public int d;

    public e(GuestbookViewModel guestbookViewModel0, Continuation continuation0) {
        this.c = guestbookViewModel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return GuestbookViewModel.a(this.c, null, this);
    }
}

