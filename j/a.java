package j;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public static final a A;
    public static final a B;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
        a.A = new a(0, 3);
        a.B = new a(0, 4);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return "15c33a13-81a3-47e4-b994-7b3db5e99016";
            }
            case 1: {
                return null;
            }
            case 2: {
                return null;
            }
            case 3: {
                return null;
            }
            default: {
                return true;
            }
        }
    }
}

