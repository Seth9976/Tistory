package com.google.accompanist.navigation.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final NavBackStackEntry w;
    public final ColumnScope x;

    public a(NavBackStackEntry navBackStackEntry0, ColumnScope columnScope0) {
        this.w = navBackStackEntry0;
        this.x = columnScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1540712730, v, -1, "com.google.accompanist.navigation.material.SheetContentHost.<anonymous> (SheetContentHost.kt:72)");
        }
        NavDestination navDestination0 = this.w.getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type com.google.accompanist.navigation.material.BottomSheetNavigator.Destination");
        ((Destination)navDestination0).getContent$navigation_material_release().invoke(this.x, this.w, ((Composer)object0), 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

