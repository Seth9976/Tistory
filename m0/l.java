package m0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.DoNotInline;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l {
    public static final l a;

    static {
        l.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@Nullable LegacyTextFieldState legacyTextFieldState0, @Nullable TextFieldSelectionManager textFieldSelectionManager0, @NotNull HandwritingGesture handwritingGesture0, @Nullable ViewConfiguration viewConfiguration0, @Nullable Executor executor0, @Nullable IntConsumer intConsumer0, @NotNull Function1 function10) {
        int v = legacyTextFieldState0 == null ? 3 : HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(legacyTextFieldState0, handwritingGesture0, textFieldSelectionManager0, viewConfiguration0, function10);
        if(intConsumer0 == null) {
            return;
        }
        if(executor0 != null) {
            executor0.execute(new k(intConsumer0, v, 0));
            return;
        }
        intConsumer0.accept(v);
    }

    @DoNotInline
    public final boolean b(@Nullable LegacyTextFieldState legacyTextFieldState0, @Nullable TextFieldSelectionManager textFieldSelectionManager0, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable CancellationSignal cancellationSignal0) {
        return legacyTextFieldState0 == null ? false : HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(legacyTextFieldState0, previewableHandwritingGesture0, textFieldSelectionManager0, cancellationSignal0);
    }
}

