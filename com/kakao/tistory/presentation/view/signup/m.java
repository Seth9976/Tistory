package com.kakao.tistory.presentation.view.signup;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.main.navigation.MainCommand.ShowWelcomDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final SignUpActivity a;

    public m(SignUpActivity signUpActivity0) {
        this.a = signUpActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        ShowWelcomDialog mainCommand$ShowWelcomDialog0 = new ShowWelcomDialog(((String)object0));
        NavigatorExtensionKt.goToMain$default(this.a, null, null, mainCommand$ShowWelcomDialog0, 3, null);
        return Unit.INSTANCE;
    }
}

