package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils.Type;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoNotification;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel.DestinationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final SplashActivity a;

    public j(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DestinationType)object0), "it");
        switch(SplashActivity.initViewModel.1.3.WhenMappings.$EnumSwitchMapping$0[((DestinationType)object0).ordinal()]) {
            case 1: {
                NavigatorExtensionKt.goToKakaoLogin(this.a, this.a.m);
                this.a.finish();
                return Unit.INSTANCE;
            }
            case 2: {
                if(RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, (this.a.m == null ? "" : this.a.m), false, 2, null).getType() == Type.NOTIFICATION) {
                    NavigatorExtensionKt.goToMain$default(this.a, this.a.m, null, GoNotification.INSTANCE, 2, null);
                }
                else {
                    NavigatorExtensionKt.goToMain$default(this.a, this.a.m, null, null, 6, null);
                }
                this.a.finish();
                return Unit.INSTANCE;
            }
            case 3: {
                this.a.o = true;
                String s = this.a.getString(string.label_kakao_force_transfer_title);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                String s1 = this.a.getString(string.label_kakao_force_transfer_by_token_message);
                i i0 = new i(this.a);
                String s2 = this.a.getString(string.label_dialog_ok);
                Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
                o o0 = new o(i0);
                p p0 = new p(this.a);
                TistoryDialog.INSTANCE.showOk(this.a, s, s1, false, s2, o0, p0);
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

