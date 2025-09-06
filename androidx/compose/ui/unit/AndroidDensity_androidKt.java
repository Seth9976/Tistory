package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t2.b;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidDensity_androidKt {
    @NotNull
    public static final Density Density(@NotNull Context context0) {
        float f = context0.getResources().getConfiguration().fontScale;
        float f1 = context0.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverter0 = FontScaleConverterFactory.INSTANCE.forScale(f);
        if(fontScaleConverter0 == null) {
            fontScaleConverter0 = new b(f);
        }
        return new a(f1, f, fontScaleConverter0);
    }
}

