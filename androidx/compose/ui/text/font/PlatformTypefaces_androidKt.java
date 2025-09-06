package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.util.ListUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001A\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0001\u001A \u0010\u0007\u001A\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0001¨\u0006\r"}, d2 = {"PlatformTypefaces", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getWeightSuffixForFallbackFamilyName", "", "name", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformTypefaces_androidKt {
    @NotNull
    public static final PlatformTypefaces PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new i() : new j();  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
    }

    @VisibleForTesting
    @NotNull
    public static final String getWeightSuffixForFallbackFamilyName(@NotNull String s, @NotNull FontWeight fontWeight0) {
        int v = fontWeight0.getWeight();
        if(v / 100 >= 0 && v / 100 < 2) {
            return s + "-thin";
        }
        if(2 <= v / 100 && v / 100 < 4) {
            return s + "-light";
        }
        switch(v / 100) {
            case 4: {
                return s;
            }
            case 5: {
                return s + "-medium";
            }
            default: {
                return 6 <= v / 100 && v / 100 < 8 || 8 > v / 100 || v / 100 >= 11 ? s : s + "-black";
            }
        }
    }

    @ExperimentalTextApi
    @Nullable
    public static final Typeface setFontVariationSettings(@Nullable Typeface typeface0, @NotNull Settings fontVariation$Settings0, @NotNull Context context0) {
        if(typeface0 == null) {
            return null;
        }
        if(!fontVariation$Settings0.getSettings().isEmpty()) {
            ThreadLocal threadLocal0 = m.a;
            Paint paint0 = (Paint)threadLocal0.get();
            if(paint0 == null) {
                paint0 = new Paint();
                threadLocal0.set(paint0);
            }
            paint0.setTypeface(typeface0);
            paint0.setFontVariationSettings(ListUtilsKt.fastJoinToString$default(fontVariation$Settings0.getSettings(), null, null, null, 0, null, new l(AndroidDensity_androidKt.Density(context0)), 0x1F, null));
            return paint0.getTypeface();
        }
        return typeface0;
    }
}

