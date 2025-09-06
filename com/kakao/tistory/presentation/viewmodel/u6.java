package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class u6 implements FlowCollector {
    public final ThrowableViewModel a;

    public u6(ThrowableViewModel throwableViewModel0) {
        this.a = throwableViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        this.a.showInspectionDialog(((ErrorModel)object0));
        return Unit.INSTANCE;
    }
}

