package com.kakao.tistory.presentation.view.setting.notice;

import com.kakao.tistory.domain.blog.entity.Entry;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeEntryKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class y extends SuspendLambda implements Function2 {
    public Object a;
    public final SettingNoticeListViewModel b;

    public y(SettingNoticeListViewModel settingNoticeListViewModel0, Continuation continuation0) {
        this.b = settingNoticeListViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new y(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        y y0 = new y(this.b, ((Continuation)object1));
        y0.a = (Entry)object0;
        return y0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return SettingNoticeEntryKt.toSettingEntry(((Entry)this.a), new x(this.b));
    }
}

