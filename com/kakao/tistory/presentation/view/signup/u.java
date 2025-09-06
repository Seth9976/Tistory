package com.kakao.tistory.presentation.view.signup;

import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class u extends Lambda implements Function0 {
    public final boolean a;
    public final SignUpUiState b;

    public u(boolean z, SignUpUiState signUpUiState0) {
        this.a = z;
        this.b = signUpUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(!this.a && !p.isBlank(this.b.getBlogName().getText().getText())) {
            this.b.getOnClickBlogNameClear().invoke();
        }
        return Unit.INSTANCE;
    }
}

