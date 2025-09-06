package com.kakao.tistory.presentation.screen.notification;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.extension.LiveDataKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class k extends SuspendLambda implements Function2 {
    public final NotificationViewModel a;
    public final LifecycleOwner b;
    public final Context c;
    public final MutableState d;

    public k(NotificationViewModel notificationViewModel0, LifecycleOwner lifecycleOwner0, Context context0, MutableState mutableState0, Continuation continuation0) {
        this.a = notificationViewModel0;
        this.b = lifecycleOwner0;
        this.c = context0;
        this.d = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.a, this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        LiveData liveData0 = this.a.getGoToDestination();
        d d0 = new d(this.c);
        LiveDataKt.observeEvent(liveData0, this.b, d0);
        LiveData liveData1 = this.a.getShowToastDeleteEvent();
        e e0 = new e(this.c);
        LiveDataKt.observeEvent(liveData1, this.b, e0);
        LiveData liveData2 = this.a.getShowToastBackupTypeEvent();
        f f0 = new f(this.c);
        LiveDataKt.observeEvent(liveData2, this.b, f0);
        LiveData liveData3 = this.a.getShowToastPcTypeEvent();
        g g0 = new g(this.c);
        LiveDataKt.observeEvent(liveData3, this.b, g0);
        MutableLiveData mutableLiveData0 = this.a.getShowBottomSortDialog();
        i i0 = new i(this.a, this.c);
        LiveDataKt.observeEvent(mutableLiveData0, this.b, i0);
        LiveData liveData4 = this.a.getShowDeleteBottomSheetEvent();
        j j0 = new j(this.d);
        LiveDataKt.observeEvent(liveData4, this.b, j0);
        return Unit.INSTANCE;
    }
}

