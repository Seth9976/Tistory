package com.kakao.tistory.presentation.view.accountMigration;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final AccountMigrationActivity a;

    public a(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AccountMigrationActivity.access$getMigrationViewModel(this.a).onBackPressed();
        return Unit.INSTANCE;
    }
}

