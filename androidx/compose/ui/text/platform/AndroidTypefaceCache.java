package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import k2.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Duplicate cache")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "getOrCreate", "(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "", "getKey", "(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public final class AndroidTypefaceCache {
    public static final int $stable;
    @NotNull
    public static final AndroidTypefaceCache INSTANCE;
    public static final LruCache a;

    static {
        AndroidTypefaceCache.INSTANCE = new AndroidTypefaceCache();  // 初始化器: Ljava/lang/Object;-><init>()V
        AndroidTypefaceCache.a = new LruCache(16);
        AndroidTypefaceCache.$stable = 8;
    }

    @Nullable
    public final String getKey(@NotNull Context context0, @NotNull Font font0) {
        if(font0 instanceof ResourceFont) {
            TypedValue typedValue0 = new TypedValue();
            context0.getResources().getValue(((ResourceFont)font0).getResId(), typedValue0, true);
            String s = typedValue0.string == null ? null : typedValue0.string.toString();
            Intrinsics.checkNotNull(s);
            return "res:" + s;
        }
        if(!(font0 instanceof AndroidPreloadedFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        return ((AndroidPreloadedFont)font0).getCacheKey();
    }

    @NotNull
    public final Typeface getOrCreate(@NotNull Context context0, @NotNull Font font0) {
        Typeface typeface1;
        String s = this.getKey(context0, font0);
        LruCache lruCache0 = AndroidTypefaceCache.a;
        if(s != null) {
            Typeface typeface0 = (Typeface)lruCache0.get(s);
            if(typeface0 != null) {
                return typeface0;
            }
        }
        if(font0 instanceof ResourceFont) {
            typeface1 = b.a.a(context0, ((ResourceFont)font0).getResId());
        }
        else if(font0 instanceof AndroidFont) {
            typeface1 = ((AndroidFont)font0).getTypefaceLoader().loadBlocking(context0, ((AndroidFont)font0));
        }
        else {
            throw new IllegalArgumentException("Unknown font type: " + font0);
        }
        if(typeface1 == null) {
            throw new IllegalArgumentException("Unable to load font " + font0);
        }
        if(s != null) {
            Typeface typeface2 = (Typeface)lruCache0.put(s, typeface1);
        }
        return typeface1;
    }
}

