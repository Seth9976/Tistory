package com.kakao.tistory.presentation.screen.feed;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.screen.feed.contract.FeedEntryKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class c0 extends SuspendLambda implements Function2 {
    public Object a;
    public final FeedViewModel b;

    public c0(FeedViewModel feedViewModel0, Continuation continuation0) {
        this.b = feedViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        c0 c00 = new c0(this.b, ((Continuation)object1));
        c00.a = (EntryItem)object0;
        return c00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        EntryItem entryItem0 = (EntryItem)this.a;
        return FeedEntryKt.toEntryItem(entryItem0, new a0(this.b, entryItem0), new b0(this.b, entryItem0));
    }
}

