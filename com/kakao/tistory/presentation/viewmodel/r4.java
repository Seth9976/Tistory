package com.kakao.tistory.presentation.viewmodel;

import android.webkit.CookieManager;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.common.Result.Fail;
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

public final class r4 extends SuspendLambda implements Function2 {
    public int a;
    public final SettingViewModel b;

    public r4(SettingViewModel settingViewModel0, Continuation continuation0) {
        this.b = settingViewModel0;
        super(2, continuation0);
    }

    public static final void a(Boolean boolean0) {
        Logger.INSTANCE.log("postLogout() : clear WebView cookie " + boolean0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r4(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new r4(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                if(this.b.h.deletePushToken(this) == object1) {
                    return object1;
                }
                goto label_8;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_8:
                this.a = 2;
                object0 = this.b.j.invoke(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        SettingViewModel settingViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            CookieManager cookieManager0 = CookieManager.getInstance();
            cookieManager0.removeAllCookies(new b(2));
            cookieManager0.flush();
            GlideApp.get(BaseKt.getAppContext()).clearMemory();
            settingViewModel0.isShowProgress().setValue(Boxing.boxBoolean(false));
            settingViewModel0.x.setValue(new Event(Unit.INSTANCE));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            settingViewModel0.isShowProgress().setValue(Boxing.boxBoolean(false));
            settingViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

