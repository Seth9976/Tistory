package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A/\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", "(Landroid/view/View;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Lkotlin/Function1;", "factory", "overrideComposeInputMethodManagerFactoryForTests", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeInputMethodManager_androidKt {
    public static Function1 a;

    static {
        ComposeInputMethodManager_androidKt.a = a.z;
    }

    @NotNull
    public static final ComposeInputMethodManager ComposeInputMethodManager(@NotNull View view0) {
        return (ComposeInputMethodManager)ComposeInputMethodManager_androidKt.a.invoke(view0);
    }

    @VisibleForTesting
    @NotNull
    @TestOnly
    public static final Function1 overrideComposeInputMethodManagerFactoryForTests(@NotNull Function1 function10) {
        Function1 function11 = ComposeInputMethodManager_androidKt.a;
        ComposeInputMethodManager_androidKt.a = function10;
        return function11;
    }
}

