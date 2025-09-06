package com.kakao.tistory.presentation.view.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;

public final class i extends Lambda implements Function2 {
    public final SignUpActivity a;
    public final Flow b;
    public final int c;

    public i(SignUpActivity signUpActivity0, Flow flow0, int v) {
        this.a = signUpActivity0;
        this.b = flow0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignUpActivity.access$EventHandler(this.a, this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

