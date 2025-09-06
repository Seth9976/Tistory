package com.kakao.tistory.presentation.main;

import android.content.Intent;
import android.os.Bundle;
import com.kakao.tistory.presentation.common.ActivityCommand;
import com.kakao.tistory.presentation.main.navigation.MainCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function1 {
    public final MainAppViewModel a;

    public h0(MainAppViewModel mainAppViewModel0) {
        this.a = mainAppViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Intent)object0), "intent");
        Bundle bundle0 = ((Intent)object0).getExtras();
        if(bundle0 != null) {
            String s = bundle0.getString("EXTRA_REDIRECT_URL");
            if(s != null) {
                MainAppViewModel.access$handleRedirectUrl(this.a, s);
            }
            ActivityCommand activityCommand0 = (ActivityCommand)bundle0.getParcelable("EXTRA_ACTIVITY_COMMAND");
            if(activityCommand0 != null) {
                this.a.a(activityCommand0);
            }
            MainCommand mainCommand0 = (MainCommand)bundle0.getParcelable("EXTRA_MAIN_COMMAND");
            if(mainCommand0 != null) {
                MainAppViewModel.access$handleMainCommand(this.a, mainCommand0);
            }
        }
        return Unit.INSTANCE;
    }
}

