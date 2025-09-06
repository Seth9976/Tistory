package androidx.compose.ui.text.input;

import android.os.Build.VERSION;
import android.view.inputmethod.InputConnection;
import j2.e;
import j2.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001A$\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, d2 = {"NullableInputConnectionWrapper", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "delegate", "Landroid/view/inputmethod/InputConnection;", "onConnectionClosed", "Lkotlin/Function1;", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NullableInputConnectionWrapper_androidKt {
    @NotNull
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(@NotNull InputConnection inputConnection0, @NotNull Function1 function10) {
        return Build.VERSION.SDK_INT >= 34 ? new f(inputConnection0, function10) : new e(inputConnection0, function10);  // 初始化器: Lj2/e;-><init>(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V
    }
}

