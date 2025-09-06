package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/TextMeasurer;", "rememberTextMeasurer", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n77#2:56\n77#2:57\n77#2:58\n1223#3,6:59\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n47#1:56\n48#1:57\n49#1:58\n51#1:59,6\n*E\n"})
public final class TextMeasurerHelperKt {
    @Composable
    @NotNull
    public static final TextMeasurer rememberTextMeasurer(int v, @Nullable Composer composer0, int v1, int v2) {
        int v3 = 1;
        if((v2 & 1) != 0) {
            v = 8;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5BAE9057, v1, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        Resolver fontFamily$Resolver0 = (Resolver)composer0.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean z = composer0.changed(fontFamily$Resolver0);
        boolean z1 = composer0.changed(density0);
        boolean z2 = composer0.changed(layoutDirection0);
        if(((v1 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v1 & 6) != 4) {
            v3 = 0;
        }
        TextMeasurer textMeasurer0 = composer0.rememberedValue();
        if((z | z1 | z2 | v3) != 0 || textMeasurer0 == Composer.Companion.getEmpty()) {
            textMeasurer0 = new TextMeasurer(fontFamily$Resolver0, density0, layoutDirection0, v);
            composer0.updateRememberedValue(textMeasurer0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textMeasurer0;
    }
}

