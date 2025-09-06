package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class c0 implements Comparator {
    public static final c0 a;

    static {
        c0.a = new c0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = Intrinsics.compare(((LayoutNode)object1).getDepth$ui_release(), ((LayoutNode)object0).getDepth$ui_release());
        return v == 0 ? Intrinsics.compare(((LayoutNode)object0).hashCode(), ((LayoutNode)object1).hashCode()) : v;
    }
}

