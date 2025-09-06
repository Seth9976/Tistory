package p2;

import androidx.compose.ui.tooling.data.Group;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public static final b x;
    public static final b y;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Group group0 = (Group)object0;
            return true;
        }
        Group group1 = (Group)object0;
        return true;
    }
}

