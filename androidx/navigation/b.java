package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;

public final class b extends Lambda implements Function1 {
    public final Bundle A;
    public final BooleanRef w;
    public final ArrayList x;
    public final IntRef y;
    public final NavController z;

    public b(BooleanRef ref$BooleanRef0, ArrayList arrayList0, IntRef ref$IntRef0, NavController navController0, Bundle bundle0) {
        this.w = ref$BooleanRef0;
        this.x = arrayList0;
        this.y = ref$IntRef0;
        this.z = navController0;
        this.A = bundle0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        List list0;
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "entry");
        this.w.element = true;
        ArrayList arrayList0 = this.x;
        int v = arrayList0.indexOf(((NavBackStackEntry)object0));
        if(v == -1) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list0 = arrayList0.subList(this.y.element, v + 1);
            this.y.element = v + 1;
        }
        this.z.a(((NavBackStackEntry)object0).getDestination(), this.A, ((NavBackStackEntry)object0), list0);
        return Unit.INSTANCE;
    }
}

