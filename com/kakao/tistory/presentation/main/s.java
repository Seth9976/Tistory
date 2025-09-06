package com.kakao.tistory.presentation.main;

import android.content.Intent;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final MainUiState a;

    public s(MainUiState mainUiState0) {
        this.a = mainUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Intent)object0), "intent");
        this.a.getOnNewIntent().invoke(((Intent)object0));
        return Unit.INSTANCE;
    }
}

