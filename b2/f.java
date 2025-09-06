package b2;

import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final int w;
    public static final f x;
    public static final f y;

    static {
        f.x = new f(0, 0);
        f.y = new f(0, 1);
    }

    public f(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? new LayoutNode(false, 0, 3, null) : new LinkedHashMap();
    }
}

