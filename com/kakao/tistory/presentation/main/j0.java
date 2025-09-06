package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.contract.MainIntent.NavigateToEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function0 {
    public final MainAppViewModel a;

    public j0(MainAppViewModel mainAppViewModel0) {
        this.a = mainAppViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendIntent(NavigateToEditor.INSTANCE);
        return Unit.INSTANCE;
    }
}

