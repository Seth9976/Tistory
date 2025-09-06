package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "", "interceptStartInputMethod", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "nextHandler", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Landroidx/compose/ui/platform/PlatformTextInputSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PlatformTextInputInterceptor {
    @Nullable
    Object interceptStartInputMethod(@NotNull PlatformTextInputMethodRequest arg1, @NotNull PlatformTextInputSession arg2, @NotNull Continuation arg3);
}

