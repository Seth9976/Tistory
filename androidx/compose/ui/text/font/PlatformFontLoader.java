package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001A\u00020\u0007H&R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontLoader;", "", "cacheKey", "getCacheKey", "()Ljava/lang/Object;", "awaitLoad", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PlatformFontLoader {
    @Nullable
    Object awaitLoad(@NotNull Font arg1, @NotNull Continuation arg2);

    @Nullable
    Object getCacheKey();

    @Nullable
    Object loadBlocking(@NotNull Font arg1);
}

