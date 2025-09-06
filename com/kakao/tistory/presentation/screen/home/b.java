package com.kakao.tistory.presentation.screen.home;

import android.content.Context;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.common.event.ToastEventKt;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectData;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.GoToBlog;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.GoToEntry;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.GoToUrl;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent.ShowToast;
import com.kakao.tistory.presentation.screen.home.contract.HomeEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class b extends SuspendLambda implements Function2 {
    public Object a;
    public final Context b;

    public b(Context context0, Continuation continuation0) {
        this.b = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        b b0 = new b(this.b, ((Continuation)object1));
        b0.a = (HomeEvent)object0;
        return b0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        HomeEvent homeEvent0 = (HomeEvent)this.a;
        if(homeEvent0 instanceof GoToBlog) {
            String s = ((GoToBlog)homeEvent0).getBlogName();
            NavigatorExtensionKt.goToBlogTop(this.b, s);
            return Unit.INSTANCE;
        }
        if(homeEvent0 instanceof GoToEntry) {
            String s1 = ((GoToEntry)homeEvent0).getBlogName();
            Long long0 = Boxing.boxLong(((GoToEntry)homeEvent0).getEntryId());
            NavigatorExtensionKt.goToEntryView$default(this.b, s1, long0, null, null, null, 28, null);
            return Unit.INSTANCE;
        }
        if(homeEvent0 instanceof GoToUrl) {
            String s2 = ((GoToUrl)homeEvent0).getUrl();
            RedirectData redirectData0 = RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, s2, false, 2, null);
            NavigatorExtensionKt.goToRedirect(this.b, redirectData0);
            return Unit.INSTANCE;
        }
        if(homeEvent0 instanceof ShowToast) {
            ToastEventKt.showToast(this.b, ((ShowToastEvent)homeEvent0));
        }
        return Unit.INSTANCE;
    }
}

