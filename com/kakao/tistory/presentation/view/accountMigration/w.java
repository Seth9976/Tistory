package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class w extends FunctionReferenceImpl implements Function0 {
    public w(MigrationViewModel migrationViewModel0) {
        super(0, migrationViewModel0, MigrationViewModel.class, "onClickConfirmDetailLink", "onClickConfirmDetailLink()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((MigrationViewModel)this.receiver).onClickConfirmDetailLink();
        return Unit.INSTANCE;
    }
}

