package com.kakao.tistory.presentation.view.signup;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final SignUpActivity a;

    public k(SignUpActivity signUpActivity0) {
        this.a = signUpActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, j.a, null, 88, null);
        return Unit.INSTANCE;
    }
}

