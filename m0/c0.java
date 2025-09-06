package m0;

import androidx.compose.foundation.text.input.internal.EditCommandKt;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final int w;
    public final CharSequence x;
    public final int y;

    public c0(CharSequence charSequence0, int v, int v1) {
        this.w = v1;
        this.x = charSequence0;
        this.y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            EditCommandKt.setComposingText(((EditingBuffer)object0), String.valueOf(this.x), this.y);
            return Unit.INSTANCE;
        }
        EditCommandKt.commitText(((EditingBuffer)object0), String.valueOf(this.x), this.y);
        return Unit.INSTANCE;
    }
}

