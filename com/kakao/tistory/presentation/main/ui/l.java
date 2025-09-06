package com.kakao.tistory.presentation.main.ui;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final Placeable a;

    public l(Placeable placeable0) {
        this.a = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        PlacementScope.place$default(((PlacementScope)object0), this.a, this.a.getWidth() / 2, -this.a.getHeight() / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

