package g2;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(1, 0);
        b.y = new b(1, 1);
        b.z = new b(1, 2);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsConfiguration semanticsConfiguration0 = ((LayoutNode)object0).getCollapsedSemantics$ui_release();
                return Boolean.valueOf(semanticsConfiguration0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants());
            }
            case 1: {
                SemanticsConfiguration semanticsConfiguration1 = ((LayoutNode)object0).getCollapsedSemantics$ui_release();
                return Boolean.valueOf(semanticsConfiguration1 != null && semanticsConfiguration1.isMergingSemanticsOfDescendants());
            }
            default: {
                return Boolean.valueOf(((LayoutNode)object0).getNodes$ui_release().has-H91voCI$ui_release(8));
            }
        }
    }
}

