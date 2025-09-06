package com.kakao.tistory.presentation.screen.blog.noticeList;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class a0 extends SuspendLambda implements Function2 {
    public Object a;
    public final BlogNoticeListViewModel b;

    public a0(BlogNoticeListViewModel blogNoticeListViewModel0, Continuation continuation0) {
        this.b = blogNoticeListViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        a0 a00 = new a0(this.b, ((Continuation)object1));
        a00.a = (CoroutineScope)object0;
        return a00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.a;
        BuildersKt.launch$default(coroutineScope0, null, null, new t(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new v(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new x(this.b, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new z(this.b, null), 3, null);
        return Unit.INSTANCE;
    }
}

