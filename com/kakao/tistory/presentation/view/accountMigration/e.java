package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectData;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public e(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.link_kakao_account_change_guide);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        RedirectData redirectData0 = new RedirectData(s, null, null, null, null, null, Type.WEB, 62, null);
        NavigatorExtensionKt.goToRedirect(this.a, redirectData0);
        return Unit.INSTANCE;
    }
}

