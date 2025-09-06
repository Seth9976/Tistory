package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.domain.entity.common.EmptyModel;
import com.kakao.tistory.presentation.common.ActivityCommand.ShowDialogCommand;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public j(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EmptyModel)object0), "it");
        ShowDialogCommand activityCommand$ShowDialogCommand0 = new ShowDialogCommand(((EmptyModel)object0).getTitle(), ((EmptyModel)object0).getMessage());
        NavigatorExtensionKt.goToMain$default(this.a, null, activityCommand$ShowDialogCommand0, null, 5, null);
        this.a.finish();
        return Unit.INSTANCE;
    }
}

