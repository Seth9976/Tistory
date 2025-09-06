package com.kakao.tistory.presentation.common.extension;

import android.content.Context;
import com.kakao.tistory.domain.entity.common.RegulationLink;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final Context a;
    public final RegulationLink b;

    public f(Context context0, RegulationLink regulationLink0) {
        this.a = context0;
        this.b = regulationLink0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getCsLink();
        NavigatorExtensionKt.goToWebView$default(this.a, s, false, false, false, false, 14, null);
        return Unit.INSTANCE;
    }
}

