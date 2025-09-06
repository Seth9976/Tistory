package m0;

import androidx.compose.foundation.text.input.internal.EditCommandKt;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final int y;

    public d0(int v, int v1, int v2) {
        this.w = v2;
        this.x = v;
        this.y = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                EditCommandKt.deleteSurroundingText(((EditingBuffer)object0), this.x, this.y);
                return Unit.INSTANCE;
            }
            case 1: {
                EditCommandKt.deleteSurroundingTextInCodePoints(((EditingBuffer)object0), this.x, this.y);
                return Unit.INSTANCE;
            }
            case 2: {
                EditCommandKt.setComposingRegion(((EditingBuffer)object0), this.x, this.y);
                return Unit.INSTANCE;
            }
            default: {
                ((EditingBuffer)object0).setSelection(this.x, this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

