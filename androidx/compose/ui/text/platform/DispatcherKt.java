package androidx.compose.ui.text.platform;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001A\u0010\u0005\u001A\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getFontCacheManagementDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "FontCacheManagementDispatcher", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DispatcherKt {
    public static final MainCoroutineDispatcher a;

    static {
        DispatcherKt.a = Dispatchers.getMain();
    }

    @NotNull
    public static final CoroutineDispatcher getFontCacheManagementDispatcher() {
        return DispatcherKt.a;
    }
}

