package u;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public static final o A;
    public static final o B;
    public static final o C;
    public final int w;
    public static final o x;
    public static final o y;
    public static final o z;

    static {
        o.x = new o(1, 0);
        o.y = new o(1, 1);
        o.z = new o(1, 2);
        o.A = new o(1, 3);
        o.B = new o(1, 4);
        o.C = new o(1, 5);
    }

    public o(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                TextureView textureView0 = (TextureView)object0;
                return Unit.INSTANCE;
            }
            case 1: {
                SurfaceView surfaceView0 = (SurfaceView)object0;
                return Unit.INSTANCE;
            }
            case 2: {
                ((ContentDrawScope)object0).drawContent();
                return Unit.INSTANCE;
            }
            case 3: {
                ((FocusProperties)object0).setCanFocus(false);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            default: {
                return new ScrollState(((Number)object0).intValue());
            }
        }
    }
}

