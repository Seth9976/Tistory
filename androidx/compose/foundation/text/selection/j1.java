package androidx.compose.foundation.text.selection;

import aa.a;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final Density w;
    public final MutableState x;

    public j1(Density density0, MutableState mutableState0) {
        this.w = density0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        a a0 = new a(((Function0)object0), 2);
        i1 i10 = new i1(this.w, this.x, 0);
        PlatformMagnifierFactory platformMagnifierFactory0 = PlatformMagnifierFactory.Companion.getForCurrentPlatform();
        return Magnifier_androidKt.magnifier-jPUL71Q$default(Modifier.Companion, a0, null, i10, 0.0f, true, 0L, 0.0f, 0.0f, false, platformMagnifierFactory0, 490, null);
    }
}

