package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\'\u0018\u00002\u00020\u0001:\u0001\u0017B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "typefaceLoader", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Landroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "I", "getLoadingStrategy-PKNRLFQ", "()I", "b", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "getTypefaceLoader", "()Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "c", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "TypefaceLoader", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AndroidFont implements Font {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u001A\u0010\t\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "", "awaitLoad", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/AndroidFont;", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface TypefaceLoader {
        @Nullable
        Object awaitLoad(@NotNull Context arg1, @NotNull AndroidFont arg2, @NotNull Continuation arg3);

        @Nullable
        Typeface loadBlocking(@NotNull Context arg1, @NotNull AndroidFont arg2);
    }

    public static final int $stable;
    public final int a;
    public final TypefaceLoader b;
    public final Settings c;

    public AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0, Settings fontVariation$Settings0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = androidFont$TypefaceLoader0;
        this.c = fontVariation$Settings0;
    }

    @Deprecated(message = "Replaced with fontVariation constructor", replaceWith = @ReplaceWith(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public AndroidFont(int v, TypefaceLoader androidFont$TypefaceLoader0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, androidFont$TypefaceLoader0, new Settings(new Setting[0]), null);
    }

    @Override  // androidx.compose.ui.text.font.Font
    public final int getLoadingStrategy-PKNRLFQ() {
        return this.a;
    }

    @NotNull
    public final TypefaceLoader getTypefaceLoader() {
        return this.b;
    }

    @NotNull
    public final Settings getVariationSettings() {
        return this.c;
    }
}

