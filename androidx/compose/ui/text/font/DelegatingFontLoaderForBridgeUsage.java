package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\r\u001A\u0004\u0018\u00010\n2\u0006\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000ER\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0017\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "Landroid/content/Context;", "context", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "c", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    public final ResourceLoader a;
    public final Context b;
    public final Object c;

    public DelegatingFontLoaderForBridgeUsage(@NotNull ResourceLoader font$ResourceLoader0, @NotNull Context context0) {
        this.a = font$ResourceLoader0;
        this.b = context0;
        this.c = new Object();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font0, @NotNull Continuation continuation0) {
        return font0 instanceof AndroidFont ? ((AndroidFont)font0).getTypefaceLoader().awaitLoad(this.b, ((AndroidFont)font0), continuation0) : this.a.load(font0);
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @NotNull
    public Object getCacheKey() {
        return this.c;
    }

    @NotNull
    public final ResourceLoader getLoader$ui_text_release() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object loadBlocking(@NotNull Font font0) {
        return font0 instanceof AndroidFont ? ((AndroidFont)font0).getTypefaceLoader().loadBlocking(this.b, ((AndroidFont)font0)) : this.a.load(font0);
    }
}

