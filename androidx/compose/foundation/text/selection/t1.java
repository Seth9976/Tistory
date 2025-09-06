package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function0 {
    public final int w;
    public final TextFieldSelectionManager x;

    public t1(TextFieldSelectionManager textFieldSelectionManager0, int v) {
        this.w = v;
        this.x = textFieldSelectionManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                TextFieldSelectionManager.copy$foundation_release$default(this.x, false, 1, null);
                this.x.hideSelectionToolbar$foundation_release();
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.cut$foundation_release();
                this.x.hideSelectionToolbar$foundation_release();
                return Unit.INSTANCE;
            }
            case 2: {
                this.x.paste$foundation_release();
                this.x.hideSelectionToolbar$foundation_release();
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.selectAll$foundation_release();
                return Unit.INSTANCE;
            }
            case 4: {
                this.x.paste$foundation_release();
                return true;
            }
            case 5: {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.x, false, 1, null);
                return true;
            }
            case 6: {
                TextFieldSelectionManager.copy$foundation_release$default(this.x, false, 1, null);
                return true;
            }
            default: {
                this.x.cut$foundation_release();
                return true;
            }
        }
    }
}

