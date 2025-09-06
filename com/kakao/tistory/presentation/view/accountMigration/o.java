package com.kakao.tistory.presentation.view.accountMigration;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class o implements OnContextAvailableListener {
    public final Hilt_AccountMigrationActivity a;

    public o(Hilt_AccountMigrationActivity hilt_AccountMigrationActivity0) {
        this.a = hilt_AccountMigrationActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

