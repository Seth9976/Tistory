package o2;

import androidx.compose.ui.tooling.ViewInfo;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public static final j A;
    public static final j B;
    public final int w;
    public static final j x;
    public static final j y;
    public static final j z;

    static {
        j.x = new j(1, 0);
        j.y = new j(1, 1);
        j.z = new j(1, 2);
        j.A = new j(1, 3);
        j.B = new j(1, 4);
    }

    public j(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return (i)((Pair)object0).component2();
            }
            case 1: {
                ViewInfo viewInfo0 = (ViewInfo)object0;
                return true;
            }
            case 2: {
                return ((ViewInfo)object0).getFileName();
            }
            case 3: {
                return ((ViewInfo)object0).getLineNumber();
            }
            default: {
                return ((ViewInfo)object0).allChildren().size();
            }
        }
    }
}

