package u1;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.PathComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }
            case 1: {
                return Unit.INSTANCE;
            }
            case 2: {
                return new GroupComponent();
            }
            default: {
                return new PathComponent();
            }
        }
    }
}

