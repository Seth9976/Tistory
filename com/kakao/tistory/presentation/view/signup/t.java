package com.kakao.tistory.presentation.view.signup;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

public final class t extends Lambda implements Function1 {
    public final SignUpUiState a;

    public t(SignUpUiState signUpUiState0) {
        this.a = signUpUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "it");
        if(!StringsKt__StringsKt.contains$default(((TextFieldValue)object0).getText(), " ", false, 2, null)) {
            this.a.getOnChangeBlogName().invoke(((TextFieldValue)object0), "user");
        }
        return Unit.INSTANCE;
    }
}

