package com.kakao.tistory.presentation.main;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.main.tiara.MainTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final State a;

    public k(State state0) {
        this.a = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MainTiara.INSTANCE.trackClickBottom(MainDestination.EDITOR);
        MainAppKt.access$MainApp$lambda$0(this.a).getOnNavigateToEditor().invoke();
        return Unit.INSTANCE;
    }
}

