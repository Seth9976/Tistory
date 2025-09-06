package com.kakao.tistory.presentation.screen.blogswitch.navigation;

import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavArgumentBuilder)object0), "$this$navArgument");
        ((NavArgumentBuilder)object0).setType(NavType.StringType);
        return Unit.INSTANCE;
    }
}

