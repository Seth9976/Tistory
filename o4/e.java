package o4;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogHostKt.PopulateVisibleList.1.1.1.invoke..inlined.onDispose.1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final NavBackStackEntry w;
    public final boolean x;
    public final List y;

    public e(NavBackStackEntry navBackStackEntry0, List list0, boolean z) {
        this.w = navBackStackEntry0;
        this.x = z;
        this.y = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        d d0 = new d(this.w, this.y, this.x);
        this.w.getLifecycle().addObserver(d0);
        return new DialogHostKt.PopulateVisibleList.1.1.1.invoke..inlined.onDispose.1(this.w, d0);
    }
}

