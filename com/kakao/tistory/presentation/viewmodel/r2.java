package com.kakao.tistory.presentation.viewmodel;

import android.webkit.CookieManager;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.glide.GlideApp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;
import rc.b;

public final class r2 extends SuspendLambda implements Function2 {
    public int a;
    public final LeaveViewModel b;

    public r2(LeaveViewModel leaveViewModel0, Continuation continuation0) {
        this.b = leaveViewModel0;
        super(2, continuation0);
    }

    public static final void a(Boolean boolean0) {
        Logger.INSTANCE.log("postLogout() : clear WebView cookie " + boolean0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r2(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new r2(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.invoke(this);
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
        LeaveViewModel leaveViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            CookieManager cookieManager0 = CookieManager.getInstance();
            cookieManager0.removeAllCookies(new b(1));
            cookieManager0.flush();
            GlideApp.get(BaseKt.getAppContext()).clearMemory();
            leaveViewModel0.i.setValue(new Event(Unit.INSTANCE));
        }
        this.b.isShowProgress().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

