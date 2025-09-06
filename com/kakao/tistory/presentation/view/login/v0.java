package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class v0 extends FunctionReferenceImpl implements Function1 {
    public v0(TistoryLoginViewModel tistoryLoginViewModel0) {
        super(1, tistoryLoginViewModel0, TistoryLoginViewModel.class, "onLoginIdChanged", "onLoginIdChanged(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((TistoryLoginViewModel)this.receiver).onLoginIdChanged(((String)object0));
        return Unit.INSTANCE;
    }
}

