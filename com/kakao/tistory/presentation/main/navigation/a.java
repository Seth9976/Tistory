package com.kakao.tistory.presentation.main.navigation;

import android.content.Context;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Context a;

    public a(Context context0) {
        this.a = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getString(string.link_tistory_useage_tip);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        NavigatorExtensionKt.goToRedirect$default(this.a, s, false, 2, null);
        return Unit.INSTANCE;
    }
}

