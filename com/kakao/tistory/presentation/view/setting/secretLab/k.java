package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final String a;
    public final SecretLabActivity b;
    public final NavHostController c;

    public k(String s, SecretLabActivity secretLabActivity0, NavHostController navHostController0) {
        this.a = s;
        this.b = secretLabActivity0;
        this.c = navHostController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a;
        if(Intrinsics.areEqual(s, "Main")) {
            this.b.finish();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(s, "SeverType")) {
            this.c.popBackStack();
            return Unit.INSTANCE;
        }
        this.b.finish();
        return Unit.INSTANCE;
    }
}

