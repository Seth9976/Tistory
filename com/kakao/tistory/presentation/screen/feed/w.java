package com.kakao.tistory.presentation.screen.feed;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kakao.android.base.extension.LiveDataKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class w extends SuspendLambda implements Function2 {
    public final FeedViewModel a;
    public final LifecycleOwner b;
    public final Context c;

    public w(FeedViewModel feedViewModel0, LifecycleOwner lifecycleOwner0, Context context0, Continuation continuation0) {
        this.a = feedViewModel0;
        this.b = lifecycleOwner0;
        this.c = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        LiveData liveData0 = this.a.getCurrentBlogName();
        y y0 = new y(new o(this.a));
        liveData0.observe(this.b, y0);
        LiveData liveData1 = this.a.getGoToBlogFollowing();
        p p0 = new p(this.c);
        LiveDataKt.observeEvent(liveData1, this.b, p0);
        LiveData liveData2 = this.a.getGoToBlogFollower();
        q q0 = new q(this.c);
        LiveDataKt.observeEvent(liveData2, this.b, q0);
        LiveData liveData3 = this.a.getGoToEntry();
        r r0 = new r(this.c);
        LiveDataKt.observeEvent(liveData3, this.b, r0);
        LiveData liveData4 = this.a.getGoToBlog();
        s s0 = new s(this.c);
        LiveDataKt.observeEvent(liveData4, this.b, s0);
        LiveData liveData5 = this.a.getShowAlertDialog();
        v v0 = new v(this.c);
        LiveDataKt.observeEvent(liveData5, this.b, v0);
        return Unit.INSTANCE;
    }
}

