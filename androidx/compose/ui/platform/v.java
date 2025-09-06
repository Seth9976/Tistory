package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Pair;

public final class v implements Comparator {
    public final int a;
    public static final v b;
    public static final v c;
    public static final v d;

    static {
        v.b = new v(0);
        v.c = new v(1);
        v.d = new v(2);
    }

    public v(int v) {
        this.a = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.a) {
            case 0: {
                Rect rect0 = ((SemanticsNode)object0).getBoundsInWindow();
                Rect rect1 = ((SemanticsNode)object1).getBoundsInWindow();
                int v1 = Float.compare(rect0.getLeft(), rect1.getLeft());
                if(v1 == 0) {
                    v1 = Float.compare(rect0.getTop(), rect1.getTop());
                    if(v1 == 0) {
                        v1 = Float.compare(rect0.getBottom(), rect1.getBottom());
                        return v1 == 0 ? Float.compare(rect0.getRight(), rect1.getRight()) : v1;
                    }
                }
                return v1;
            }
            case 1: {
                Rect rect2 = ((SemanticsNode)object0).getBoundsInWindow();
                Rect rect3 = ((SemanticsNode)object1).getBoundsInWindow();
                int v2 = Float.compare(rect3.getRight(), rect2.getRight());
                if(v2 == 0) {
                    v2 = Float.compare(rect2.getTop(), rect3.getTop());
                    if(v2 == 0) {
                        v2 = Float.compare(rect2.getBottom(), rect3.getBottom());
                        return v2 == 0 ? Float.compare(rect3.getLeft(), rect2.getLeft()) : v2;
                    }
                }
                return v2;
            }
            default: {
                int v = Float.compare(((Rect)((Pair)object0).getFirst()).getTop(), ((Rect)((Pair)object1).getFirst()).getTop());
                return v == 0 ? Float.compare(((Rect)((Pair)object0).getFirst()).getBottom(), ((Rect)((Pair)object1).getFirst()).getBottom()) : v;
            }
        }
    }
}

