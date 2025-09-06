package com.kakao.tistory.presentation.view.accountMigration;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final LoginFragment a;
    public final Context b;

    public s(LoginFragment loginFragment0, Context context0) {
        this.a = loginFragment0;
        this.b = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoginFragment.access$getMigrationViewModel(this.a).onClickKakaoLogin(this.b, false);
        return Unit.INSTANCE;
    }
}

