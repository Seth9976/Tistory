package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.domain.entity.appinfo.Extra;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeImageMaxSize;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class j extends SuspendLambda implements Function2 {
    public Object a;
    public final BlogSettingViewModel b;

    public j(BlogSettingViewModel blogSettingViewModel0, Continuation continuation0) {
        this.b = blogSettingViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        j j0 = new j(this.b, ((Continuation)object1));
        j0.a = (AppInfo)object0;
        return j0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Extra extra0 = ((AppInfo)this.a).getExtra();
        this.b.sendIntent(new ChangeImageMaxSize((extra0 == null ? 0x1400000L : extra0.getImageMaxSize())));
        return Unit.INSTANCE;
    }
}

