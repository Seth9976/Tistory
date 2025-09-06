package com.kakao.tistory.presentation.view.home;

import com.kakao.tistory.presentation.viewmodel.RefererLogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class m extends FunctionReferenceImpl implements Function1 {
    public m(RefererLogViewModel refererLogViewModel0) {
        super(1, refererLogViewModel0, RefererLogViewModel.class, "onClickRefererLog", "onClickRefererLog(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((RefererLogViewModel)this.receiver).onClickRefererLog(((String)object0));
        return Unit.INSTANCE;
    }
}

