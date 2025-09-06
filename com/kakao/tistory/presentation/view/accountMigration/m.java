package com.kakao.tistory.presentation.view.accountMigration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public m(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        this.a.finish();
        return Unit.INSTANCE;
    }
}

