package com.kakao.tistory.presentation.theme;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Placeable a;
    public final int b;
    public final int c;

    public c(Placeable placeable0, int v, int v1) {
        this.a = placeable0;
        this.b = v;
        this.c = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.a, this.b / 2, this.c, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

