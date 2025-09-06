package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i5 extends Lambda implements Function0 {
    public final SignUpViewModel a;

    public i5(SignUpViewModel signUpViewModel0) {
        this.a = signUpViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "delete", null, null, null, null, null, null, null, null, null, 0x3FE, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_SIGN_UP_DELETE_INPUT, null, click0, null, null, null, 0xE8, null);
        ChangeBlogName signUpIntent$ChangeBlogName0 = new ChangeBlogName(new TextFieldValue(null, 0L, null, 7, null), null, 2, null);
        this.a.sendIntent(signUpIntent$ChangeBlogName0);
        return Unit.INSTANCE;
    }
}

