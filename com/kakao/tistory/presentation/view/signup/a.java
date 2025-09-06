package com.kakao.tistory.presentation.view.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(844202520, v, -1, "com.kakao.tistory.presentation.view.signup.ComposableSingletons$SignUpUsedEmailScreenKt.lambda-1.<anonymous> (SignUpUsedEmailScreen.kt:39)");
        }
        SignUpUsedEmailScreenKt.SignUpUsedEmailScreen(new SignUpUiState(null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFF, null), ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

