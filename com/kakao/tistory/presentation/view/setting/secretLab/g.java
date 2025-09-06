package com.kakao.tistory.presentation.view.setting.secretLab;

import com.kakao.tistory.presentation.viewmodel.SecretLabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class g extends FunctionReferenceImpl implements Function1 {
    public g(SecretLabViewModel secretLabViewModel0) {
        super(1, secretLabViewModel0, SecretLabViewModel.class, "onClickServerHost", "onClickServerHost(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((SecretLabViewModel)this.receiver).onClickServerHost(((String)object0));
        return Unit.INSTANCE;
    }
}

