package com.kakao.tistory.presentation.view.setting.notice;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListEvent.Finish;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListEvent.GoNotice;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeListEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class d extends SuspendLambda implements Function2 {
    public Object a;
    public final SettingNoticeListActivity b;

    public d(SettingNoticeListActivity settingNoticeListActivity0, Continuation continuation0) {
        this.b = settingNoticeListActivity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        d d0 = new d(this.b, ((Continuation)object1));
        d0.a = (SettingNoticeListEvent)object0;
        return d0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SettingNoticeListEvent settingNoticeListEvent0 = (SettingNoticeListEvent)this.a;
        if(Intrinsics.areEqual(settingNoticeListEvent0, Finish.INSTANCE)) {
            this.b.finish();
            return Unit.INSTANCE;
        }
        if(settingNoticeListEvent0 instanceof GoNotice) {
            String s = ((GoNotice)settingNoticeListEvent0).getNoticeBlogName();
            Long long0 = Boxing.boxLong(((GoNotice)settingNoticeListEvent0).getNoticeId());
            NavigatorExtensionKt.goToEntryView$default(this.b, s, long0, null, null, null, 28, null);
        }
        return Unit.INSTANCE;
    }
}

