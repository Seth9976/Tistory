package b2;

import androidx.compose.ui.focus.FocusProperties;
import l1.a;

public final class e implements FocusProperties {
    public static final e a;
    public static Boolean b;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public final boolean getCanFocus() {
        Boolean boolean0 = e.b;
        if(boolean0 == null) {
            throw a.b("canFocus is read before it is written");
        }
        return boolean0.booleanValue();
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public final void setCanFocus(boolean z) {
        e.b = Boolean.valueOf(z);
    }
}

