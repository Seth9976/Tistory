package com.kakao.tistory.presentation.view.accountMigration;

import androidx.navigation.NavController;
import androidx.navigation.ViewKt;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.databinding.ActivityAccountMigrationBinding;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel.MigrationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public b(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ActivityAccountMigrationBinding activityAccountMigrationBinding0 = AccountMigrationActivity.access$getDataBinding(this.a);
        Intrinsics.checkNotNullExpressionValue(activityAccountMigrationBinding0.settingAccountFragmentContainer, "settingAccountFragmentContainer");
        NavController navController0 = ViewKt.findNavController(activityAccountMigrationBinding0.settingAccountFragmentContainer);
        switch((((MigrationState)object0) == null ? -1 : AccountMigrationActivity.initViewModel.1.1.WhenMappings.$EnumSwitchMapping$0[((MigrationState)object0).ordinal()])) {
            case 1: {
                navController0.navigate(id.kakaoLoginFragment);
                return Unit.INSTANCE;
            }
            case 2: {
                navController0.navigate(id.migrationFragment);
                return Unit.INSTANCE;
            }
            case 3: {
                navController0.navigate(id.usedAccountFragment);
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

