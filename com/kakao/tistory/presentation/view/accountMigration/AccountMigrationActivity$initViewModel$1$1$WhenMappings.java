package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.presentation.viewmodel.MigrationViewModel.MigrationState;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class AccountMigrationActivity.initViewModel.1.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[MigrationState.values().length];
        try {
            arr_v[MigrationState.LOGIN.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MigrationState.MIGRATION.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[MigrationState.USED_ACCOUNT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        AccountMigrationActivity.initViewModel.1.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

