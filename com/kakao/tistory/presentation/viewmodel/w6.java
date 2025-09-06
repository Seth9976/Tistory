package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class w6 implements FlowCollector {
    public static final w6 a;

    static {
        w6.a = new w6();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Throwable throwable0 = (Throwable)((Pair)object0).component2();
        String s = ((ErrorModel)((Pair)object0).component1()).getMessage();
        if(s != null) {
            CrashlyticsUtils.INSTANCE.logMessage(s);
        }
        CrashlyticsUtils.INSTANCE.logException(throwable0);
        return Unit.INSTANCE;
    }
}

