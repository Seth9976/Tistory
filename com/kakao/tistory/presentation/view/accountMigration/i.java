package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public i(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "it");
        h h0 = new h(this.a);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, h0, null, 88, null);
        return Unit.INSTANCE;
    }
}

