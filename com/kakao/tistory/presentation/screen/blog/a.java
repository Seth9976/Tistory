package com.kakao.tistory.presentation.screen.blog;

import android.content.Context;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class a extends SuspendLambda implements Function2 {
    public Object a;
    public final NavActions b;
    public final Context c;

    public a(NavActions navActions0, Context context0, Continuation continuation0) {
        this.b = navActions0;
        this.c = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.b, this.c, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((BlogEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogEvent blogEvent0 = (BlogEvent)this.a;
        if(Intrinsics.areEqual(blogEvent0, Finish.INSTANCE)) {
            this.b.getFinish().invoke();
            return Unit.INSTANCE;
        }
        if(blogEvent0 instanceof ShowToast) {
            ToastEventKt.showToast(this.c, ((ShowToastEvent)blogEvent0));
        }
        return Unit.INSTANCE;
    }
}

