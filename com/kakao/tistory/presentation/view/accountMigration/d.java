package com.kakao.tistory.presentation.view.accountMigration;

import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.ExtensionsKt;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final AccountMigrationActivity a;

    public d(AccountMigrationActivity accountMigrationActivity0) {
        this.a = accountMigrationActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RegulationLink)object0), "it");
        CharSequence charSequence0 = ExtensionsKt.getRegulationClickableSpanMessage(((RegulationLink)object0), this.a);
        String s = this.a.getString(string.label_exception_regulation_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, charSequence0, false, null, c.a, null, 88, null);
        return Unit.INSTANCE;
    }
}

