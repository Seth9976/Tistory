package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.BaseKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.model.Account;
import com.kakao.sdk.user.model.User;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l2 extends Lambda implements Function2 {
    public final KakaoLoginViewModel a;
    public final OAuthToken b;

    public l2(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0) {
        this.a = kakaoLoginViewModel0;
        this.b = oAuthToken0;
        super(2);
    }

    public final void a(User user0, Throwable throwable0) {
        if(throwable0 != null) {
            Logger.INSTANCE.log("UserApiClient get me failed: " + throwable0);
            ErrorModel errorModel0 = new ErrorModel();
            String s = BaseKt.getAppContext().getString(string.label_login_fail_get_email_info_title);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            errorModel0.setTitle(s);
            errorModel0.setMessage(BaseKt.getAppContext().getString(string.label_login_fail_get_email_info_message));
            this.a.showErrorDialog(errorModel0);
            return;
        }
        if(user0 != null) {
            Account account0 = user0.getKakaoAccount();
            KakaoLoginViewModel.access$checkSignUpEnable(this.a, this.b, (account0 == null ? null : account0.getEmail()));
        }
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        this.a(((User)object0), ((Throwable)object1));
        return Unit.INSTANCE;
    }
}

