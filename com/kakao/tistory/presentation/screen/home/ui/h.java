package com.kakao.tistory.presentation.screen.home.ui;

import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.LastSlotInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

public final class h implements FlowCollector {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.invoke(((LastSlotInfo)object0));
        return Unit.INSTANCE;
    }
}

