package com.kakao.tistory.presentation.view.setting.notice;

import androidx.paging.Pager;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListIntent.LoadComplete;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z extends SuspendLambda implements Function2 {
    public int a;
    public final SettingNoticeListViewModel b;
    public final String c;

    public z(SettingNoticeListViewModel settingNoticeListViewModel0, String s, Continuation continuation0) {
        this.b = settingNoticeListViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.f.invoke(this.c, null, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        LoadComplete settingNoticeListIntent$LoadComplete0 = new LoadComplete(((Pager)object0));
        this.b.sendIntent(settingNoticeListIntent$LoadComplete0);
        return Unit.INSTANCE;
    }
}

