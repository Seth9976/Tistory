package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class af extends Lambda implements Function0 {
    public final int w;
    public final DrawerState x;
    public final Density y;

    public af(DrawerState drawerState0, Density density0, int v) {
        this.w = v;
        this.x = drawerState0;
        this.y = density0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.setDensity$material3_release(this.y);
            return Unit.INSTANCE;
        }
        this.x.setDensity$material3_release(this.y);
        return Unit.INSTANCE;
    }
}

