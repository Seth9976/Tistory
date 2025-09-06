package s;

import androidx.compose.animation.EnterExitState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function2 {
    public final int w;
    public static final v x;
    public static final v y;

    static {
        v.x = new v(2, 0);
        v.y = new v(2, 1);
    }

    public v(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            LayoutDirection layoutDirection0 = (LayoutDirection)object0;
            Density density0 = (Density)object1;
            return null;
        }
        return ((EnterExitState)object0) != ((EnterExitState)object1) || ((EnterExitState)object1) != EnterExitState.PostExit ? false : true;
    }
}

