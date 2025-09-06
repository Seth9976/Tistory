package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final AccountMigrationActivity a;
    public final MigrationViewModel b;

    public g(AccountMigrationActivity accountMigrationActivity0, MigrationViewModel migrationViewModel0) {
        this.a = accountMigrationActivity0;
        this.b = migrationViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        AccountMigrationActivity.initViewModel.1.4.1 accountMigrationActivity$initViewModel$1$4$10 = new AccountMigrationActivity.initViewModel.1.4.1();
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, accountMigrationActivity$initViewModel$1$4$10, null, null, null, 14, null);
        String s = this.a.getString(string.label_kakao_migration_back_warning_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_kakao_migration_back_warning_description);
        f f0 = new f(this.b, this.a);
        TistoryDialog.INSTANCE.showOkCancel(this.a, s, s1, f0);
        return Unit.INSTANCE;
    }
}

