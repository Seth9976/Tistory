package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class i0 extends FunctionReferenceImpl implements Function0 {
    public i0(MigrationViewModel migrationViewModel0) {
        super(0, migrationViewModel0, MigrationViewModel.class, "onClickUsedEmailDetailLink", "onClickUsedEmailDetailLink()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((MigrationViewModel)this.receiver).onClickUsedEmailDetailLink();
        return Unit.INSTANCE;
    }
}

