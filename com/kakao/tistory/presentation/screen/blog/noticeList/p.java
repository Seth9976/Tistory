package com.kakao.tistory.presentation.screen.blog.noticeList;

import android.app.Activity;
import android.content.Context;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class p extends SuspendLambda implements Function2 {
    public int a;
    public final BlogNoticeListViewModel b;
    public final NavActions c;
    public final Context d;
    public final Activity e;

    public p(BlogNoticeListViewModel blogNoticeListViewModel0, NavActions navActions0, Context context0, Activity activity0, Continuation continuation0) {
        this.b = blogNoticeListViewModel0;
        this.c = navActions0;
        this.d = context0;
        this.e = activity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o o0 = new o(this.c, this.d, this.e, null);
                this.a = 1;
                return FlowKt.collectLatest(this.b.getEvent(), o0, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

