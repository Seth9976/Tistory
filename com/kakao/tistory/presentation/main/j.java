package com.kakao.tistory.presentation.main;

import com.kakao.tistory.presentation.main.navigation.MainDestination;
import com.kakao.tistory.presentation.main.tiara.MainTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final MainAppState a;

    public j(MainAppState mainAppState0) {
        this.a = mainAppState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((MainDestination)object0), "it");
        MainTiara.INSTANCE.trackClickBottom(((MainDestination)object0));
        this.a.navigateToMainDestination(((MainDestination)object0));
        return Unit.INSTANCE;
    }
}

