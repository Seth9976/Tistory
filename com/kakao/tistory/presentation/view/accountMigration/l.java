package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public l(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        NavigatorExtensionKt.goToKakaoLogin$default(this.a, null, 1, null);
        this.a.finishAffinity();
        return Unit.INSTANCE;
    }
}

