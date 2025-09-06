package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z9 extends Lambda implements Function0 {
    public final Function0 w;
    public final String x;
    public final SoftwareKeyboardController y;

    public z9(Function0 function00, String s, SoftwareKeyboardController softwareKeyboardController0) {
        this.w = function00;
        this.x = s;
        this.y = softwareKeyboardController0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.invoke();
        if(MenuAnchorType.equals-impl0(this.x, "PrimaryEditable")) {
            SoftwareKeyboardController softwareKeyboardController0 = this.y;
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.show();
            }
        }
        return true;
    }
}

