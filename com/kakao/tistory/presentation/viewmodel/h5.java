package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogName;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h5 extends Lambda implements Function2 {
    public final SignUpViewModel a;

    public h5(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((TextFieldValue)object0), "textFieldValue");
        Intrinsics.checkNotNullParameter(((String)object1), "recommendBy");
        ChangeBlogName signUpIntent$ChangeBlogName0 = new ChangeBlogName(((TextFieldValue)object0), ((String)object1));
        this.a.sendIntent(signUpIntent$ChangeBlogName0);
        return Unit.INSTANCE;
    }
}

