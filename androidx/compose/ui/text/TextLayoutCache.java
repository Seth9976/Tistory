package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\f\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000E\u0010\n¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/TextLayoutInput;", "key", "Landroidx/compose/ui/text/TextLayoutResult;", "get", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "value", "put", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "remove", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextLayoutCache {
    public static final int $stable = 8;
    public final LruCache a;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public TextLayoutCache(int v) {
        this.a = new LruCache(v);
    }

    public TextLayoutCache(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 8;
        }
        this(v);
    }

    @Nullable
    public final TextLayoutResult get(@NotNull TextLayoutInput textLayoutInput0) {
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.a.get(cacheTextLayoutInput0);
        if(textLayoutResult0 == null) {
            return null;
        }
        return textLayoutResult0.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() ? null : textLayoutResult0;
    }

    @Nullable
    public final TextLayoutResult put(@NotNull TextLayoutInput textLayoutInput0, @NotNull TextLayoutResult textLayoutResult0) {
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        return (TextLayoutResult)this.a.put(cacheTextLayoutInput0, textLayoutResult0);
    }

    @Nullable
    public final TextLayoutResult remove(@NotNull TextLayoutInput textLayoutInput0) {
        CacheTextLayoutInput cacheTextLayoutInput0 = new CacheTextLayoutInput(textLayoutInput0);
        return (TextLayoutResult)this.a.remove(cacheTextLayoutInput0);
    }
}

