package ca;

import androidx.compose.foundation.ScrollState;
import com.google.accompanist.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public final int w;
    public final int x;

    public x0(int v, int v1) {
        this.w = v1;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return this.x;
            }
            case 1: {
                return new PagerState(this.x);
            }
            default: {
                return new ScrollState(this.x);
            }
        }
    }
}

