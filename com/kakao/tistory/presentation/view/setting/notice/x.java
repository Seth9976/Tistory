package com.kakao.tistory.presentation.view.setting.notice;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class x extends FunctionReferenceImpl implements Function3 {
    public x(Object object0) {
        super(3, object0, SettingNoticeListViewModel.class, "onClickNoticeEntry", "onClickNoticeEntry(Ljava/lang/String;JLjava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        Intrinsics.checkNotNullParameter(((String)object2), "p2");
        SettingNoticeListViewModel.access$onClickNoticeEntry(((SettingNoticeListViewModel)this.receiver), ((String)object0), ((Number)object1).longValue(), ((String)object2));
        return Unit.INSTANCE;
    }
}

