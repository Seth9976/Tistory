package com.kakao.tistory.presentation.view.accountMigration;

import android.app.Dialog;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final MigrationViewModel a;
    public final AccountMigrationActivity b;

    public f(MigrationViewModel migrationViewModel0, AccountMigrationActivity accountMigrationActivity0) {
        this.a = migrationViewModel0;
        this.b = accountMigrationActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        if(((Number)object1).intValue() == 1) {
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.a.getSection(), "전환취소얼럿", TiaraActionType.CLICK_CANCEL, null, null, null, null, null, 0xF8, null);
            ((Dialog)object0).dismiss();
            return Unit.INSTANCE;
        }
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.a.getSection(), "전환취소얼럿", TiaraActionType.CLICK_OK, null, null, null, null, null, 0xF8, null);
        ((Dialog)object0).dismiss();
        AccountMigrationActivity.access$getMigrationViewModel(this.b).onClickGoHome();
        return Unit.INSTANCE;
    }
}

