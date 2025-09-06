package n4;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class f extends Lambda implements Function1 {
    public final ArrayDeque A;
    public final BooleanRef w;
    public final BooleanRef x;
    public final NavController y;
    public final boolean z;

    public f(BooleanRef ref$BooleanRef0, BooleanRef ref$BooleanRef1, NavController navController0, boolean z, ArrayDeque arrayDeque0) {
        this.w = ref$BooleanRef0;
        this.x = ref$BooleanRef1;
        this.y = navController0;
        this.z = z;
        this.A = arrayDeque0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "entry");
        this.w.element = true;
        this.x.element = true;
        this.y.n(((NavBackStackEntry)object0), this.z, this.A);
        return Unit.INSTANCE;
    }
}

