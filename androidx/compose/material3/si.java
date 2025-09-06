package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class si {
    public final ScrollState a;
    public final CoroutineScope b;
    public Integer c;

    public si(ScrollState scrollState0, CoroutineScope coroutineScope0) {
        this.a = scrollState0;
        this.b = coroutineScope0;
    }

    public final void a(Density density0, int v, ArrayList arrayList0, int v1) {
        if(this.c == null || ((int)this.c) != v1) {
            this.c = v1;
            TabPosition tabPosition0 = (TabPosition)CollectionsKt___CollectionsKt.getOrNull(arrayList0, v1);
            if(tabPosition0 != null) {
                int v2 = density0.roundToPx-0680j_4(((TabPosition)CollectionsKt___CollectionsKt.last(arrayList0)).getRight-D9Ej5fM()) + v;
                int v3 = v2 - this.a.getMaxValue();
                int v4 = c.coerceIn(density0.roundToPx-0680j_4(tabPosition0.getLeft-D9Ej5fM()) - (v3 / 2 - density0.roundToPx-0680j_4(tabPosition0.getWidth-D9Ej5fM()) / 2), 0, c.coerceAtLeast(v2 - v3, 0));
                if(this.a.getValue() != v4) {
                    ri ri0 = new ri(this, v4, null);
                    BuildersKt.launch$default(this.b, null, null, ri0, 3, null);
                }
            }
        }
    }
}

