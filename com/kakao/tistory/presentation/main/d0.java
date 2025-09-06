package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.contract.MainIntent.UpdateNotificationCount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class d0 implements FlowCollector {
    public final MainAppViewModel a;

    public d0(MainAppViewModel mainAppViewModel0) {
        this.a = mainAppViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        UpdateNotificationCount mainIntent$UpdateNotificationCount0 = new UpdateNotificationCount(((Number)object0).longValue());
        this.a.sendIntent(mainIntent$UpdateNotificationCount0);
        return Unit.INSTANCE;
    }
}

