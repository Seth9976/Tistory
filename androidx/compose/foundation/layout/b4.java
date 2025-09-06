package androidx.compose.foundation.layout;

import androidx.compose.ui.ModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.concurrent.CancellationException;

public final class b4 extends CancellationException {
    public final int a;

    public b4(int v) {
        this.a = v;
        if(v != 5) {
            super("Window insets animation cancelled");
            return;
        }
        super("The coroutine scope left the composition");
    }

    public b4(String s, int v) {
        this.a = v;
        super(s);
    }

    @Override
    public final Throwable fillInStackTrace() {
        switch(this.a) {
            case 0: {
                this.setStackTrace(new StackTraceElement[0]);
                return this;
            }
            case 1: {
                this.setStackTrace(ModifierKt.a);
                return this;
            }
            case 2: {
                this.setStackTrace(new StackTraceElement[0]);
                return this;
            }
            case 3: {
                this.setStackTrace(new StackTraceElement[0]);
                return this;
            }
            case 4: {
                this.setStackTrace(SuspendingPointerInputFilterKt.b);
                return this;
            }
            default: {
                this.setStackTrace(new StackTraceElement[0]);
                return this;
            }
        }
    }
}

