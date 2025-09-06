package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n77#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
public final class FontResources_androidKt {
    public static final Object a;
    public static final LinkedHashMap b;

    static {
        FontResources_androidKt.a = new Object();
        FontResources_androidKt.b = new LinkedHashMap();
    }

    @Composable
    @ReadOnlyComposable
    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @NotNull
    public static final Typeface fontResource(@NotNull FontFamily fontFamily0, @Nullable Composer composer0, int v) {
        Typeface typeface0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF4A02609, v, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if(fontFamily0 instanceof SystemFontFamily || fontFamily0 instanceof LoadedFontFamily) {
            synchronized(FontResources_androidKt.a) {
                LinkedHashMap linkedHashMap0 = FontResources_androidKt.b;
                Typeface typeface1 = linkedHashMap0.get(fontFamily0);
                if(typeface1 == null) {
                    typeface1 = AndroidTypeface_androidKt.Typeface$default(context0, fontFamily0, null, 4, null);
                    linkedHashMap0.put(fontFamily0, typeface1);
                }
                typeface0 = typeface1;
            }
        }
        else {
            typeface0 = AndroidTypeface_androidKt.Typeface$default(context0, fontFamily0, null, 4, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typeface0;
    }
}

