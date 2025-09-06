package n0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public static final f A;
    public static final f B;
    public static final f C;
    public final int w;
    public static final f x;
    public static final f y;
    public static final f z;

    static {
        f.x = new f(0, 0);
        f.y = new f(0, 1);
        f.z = new f(0, 2);
        f.A = new f(0, 3);
        f.B = new f(0, 4);
        f.C = new f(0, 5);
    }

    public f(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return "Mouse.onDragDone";
            }
            case 1: {
                return "Mouse.onExtend";
            }
            case 2: {
                return "Mouse.onExtendDrag";
            }
            case 3: {
                return "Mouse.onStart";
            }
            case 4: {
                return "Touch.onDragStop";
            }
            default: {
                return "onTapTextField";
            }
        }
    }
}

