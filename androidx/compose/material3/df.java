package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class df extends Lambda implements Function1 {
    public final int w;
    public final String x;
    public final DrawerState y;
    public final CoroutineScope z;

    public df(String s, DrawerState drawerState0, CoroutineScope coroutineScope0, int v) {
        this.w = v;
        this.x = s;
        this.y = drawerState0;
        this.z = coroutineScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
            DrawerState drawerState0 = this.y;
            if(drawerState0.isOpen()) {
                SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new cf(drawerState0, this.z, 1), 1, null);
            }
            return Unit.INSTANCE;
        }
        SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
        DrawerState drawerState1 = this.y;
        if(drawerState1.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new cf(drawerState1, this.z, 0), 1, null);
        }
        return Unit.INSTANCE;
    }
}

