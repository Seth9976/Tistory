package androidx.navigation;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class d extends Lambda implements Function1 {
    public final BooleanRef w;
    public final NavController x;
    public final NavDestination y;
    public final Bundle z;

    public d(BooleanRef ref$BooleanRef0, NavController navController0, NavDestination navDestination0, Bundle bundle0) {
        this.w = ref$BooleanRef0;
        this.x = navController0;
        this.y = navDestination0;
        this.z = bundle0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "it");
        this.w.element = true;
        this.x.a(this.y, this.z, ((NavBackStackEntry)object0), CollectionsKt__CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }
}

