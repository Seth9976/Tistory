package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34StartStylusHandwriting;", "", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/view/View;", "view", "", "startStylusHandwriting", "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api34StartStylusHandwriting {
    public static final int $stable;
    @NotNull
    public static final Api34StartStylusHandwriting INSTANCE;

    static {
        Api34StartStylusHandwriting.INSTANCE = new Api34StartStylusHandwriting();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void startStylusHandwriting(@NotNull InputMethodManager inputMethodManager0, @NotNull View view0) {
        inputMethodManager0.startStylusHandwriting(view0);
    }
}

