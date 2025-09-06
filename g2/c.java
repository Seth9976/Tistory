package g2;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.semantics.Role;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public final int w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c.x = new c(2, 0);
        c.y = new c(2, 1);
        c.z = new c(2, 2);
        c.A = new c(2, 3);
        c.B = new c(2, 4);
        c.C = new c(2, 5);
        c.D = new c(2, 6);
        c.E = new c(2, 7);
        c.F = new c(2, 8);
        c.G = new c(2, 9);
        c.H = new c(2, 10);
        c.I = new c(2, 11);
        c.J = new c(2, 12);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                return (ContentDataType)object0;
            }
            case 1: {
                if(((List)object0) != null) {
                    List list0 = CollectionsKt___CollectionsKt.toMutableList(((List)object0));
                    if(list0 != null) {
                        list0.addAll(((List)object1));
                        return list0;
                    }
                }
                return (List)object1;
            }
            case 2: {
                ContentType contentType0 = (ContentType)object1;
                return (ContentType)object0;
            }
            case 3: {
                Unit unit0 = (Unit)object1;
                return (Unit)object0;
            }
            case 4: {
                Unit unit1 = (Unit)object0;
                Unit unit2 = (Unit)object1;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            }
            case 5: {
                Unit unit3 = (Unit)object0;
                Unit unit4 = (Unit)object1;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            }
            case 6: {
                String s = (String)object0;
                String s1 = (String)object1;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            }
            case 7: {
                return (Role)object0;
            }
            case 8: {
                String s2 = (String)object1;
                return (String)object0;
            }
            case 9: {
                if(((List)object0) != null) {
                    List list1 = CollectionsKt___CollectionsKt.toMutableList(((List)object0));
                    if(list1 != null) {
                        list1.addAll(((List)object1));
                        return list1;
                    }
                }
                return (List)object1;
            }
            case 10: {
                ((Number)object1).floatValue();
                return (Float)object0;
            }
            case 11: {
                ((Boolean)object1).booleanValue();
                return (Boolean)object0;
            }
            default: {
                return object0 == null ? object1 : object0;
            }
        }
    }
}

