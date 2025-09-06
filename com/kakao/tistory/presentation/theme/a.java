package com.kakao.tistory.presentation.theme;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final Placeable a;
    public final int b;

    public a(Placeable placeable0, int v) {
        this.a = placeable0;
        this.b = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.a, this.b, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

