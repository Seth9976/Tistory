package com.kakao.tistory.presentation.view.accountMigration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public k(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(((Boolean)object0));
        if(((Boolean)object0).booleanValue()) {
            this.a.getLoadingDialog().show();
            return Unit.INSTANCE;
        }
        this.a.getLoadingDialog().dismiss();
        return Unit.INSTANCE;
    }
}

