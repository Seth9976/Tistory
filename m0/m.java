package m0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.DoNotInline;
import androidx.compose.foundation.text.input.internal.TextInputSession;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class m {
    public static final m a;

    static {
        m.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull TextInputSession textInputSession0, @NotNull HandwritingGesture handwritingGesture0, @Nullable Executor executor0, @Nullable IntConsumer intConsumer0) {
        int v = textInputSession0.performHandwritingGesture(handwritingGesture0);
        if(intConsumer0 == null) {
            return;
        }
        if(executor0 != null) {
            executor0.execute(new k(intConsumer0, v, 1));
            return;
        }
        intConsumer0.accept(v);
    }

    @DoNotInline
    public final boolean b(@NotNull TextInputSession textInputSession0, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable CancellationSignal cancellationSignal0) {
        return textInputSession0.previewHandwritingGesture(previewableHandwritingGesture0, cancellationSignal0);
    }
}

