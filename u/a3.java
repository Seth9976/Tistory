package u;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a3 extends Lambda implements Function0 {
    public final int w;
    public final ScrollState x;

    public a3(ScrollState scrollState0, int v) {
        this.w = v;
        this.x = scrollState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            return this.x.getValue() >= this.x.getMaxValue() ? false : true;
        }
        return this.x.getValue() <= 0 ? false : true;
    }
}

