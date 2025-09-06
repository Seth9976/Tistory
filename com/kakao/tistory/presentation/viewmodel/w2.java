package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.model.OAuthToken;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w2 extends Lambda implements Function2 {
    public final MigrationViewModel a;

    public w2(MigrationViewModel migrationViewModel0) {
        this.a = migrationViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        MigrationViewModel.access$onFinishLogin(this.a, ((OAuthToken)object0), ((Throwable)object1));
        return Unit.INSTANCE;
    }
}

