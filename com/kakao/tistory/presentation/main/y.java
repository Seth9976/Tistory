package com.kakao.tistory.presentation.main;

import androidx.navigation.NavGraph;
import androidx.navigation.NavOptionsBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final MainAppState a;

    public y(MainAppState mainAppState0) {
        this.a = mainAppState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavOptionsBuilder)object0), "$this$navOptions");
        NavGraph navGraph0 = this.a.getNavController().getGraph();
        ((NavOptionsBuilder)object0).popUpTo(NavGraph.Companion.findStartDestination(navGraph0).getId(), x.a);
        ((NavOptionsBuilder)object0).setLaunchSingleTop(true);
        ((NavOptionsBuilder)object0).setRestoreState(true);
        return Unit.INSTANCE;
    }
}

