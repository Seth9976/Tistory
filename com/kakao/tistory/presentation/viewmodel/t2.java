package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.user.model.Account;
import com.kakao.sdk.user.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t2 extends Lambda implements Function2 {
    public final MigrationViewModel a;

    public t2(MigrationViewModel migrationViewModel0) {
        this.a = migrationViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        if(((User)object0) != null) {
            Account account0 = ((User)object0).getKakaoAccount();
            if(account0 != null) {
                String s = account0.getEmail();
                if(s != null) {
                    this.a.r.postValue(s);
                    MigrationViewModel.access$moveState(this.a, MigrationState.MIGRATION);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

