package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001E\u0010\u0010\u001A\u00020\u0002*\u00020\f2\u0006\u0010\r\u001A\u00020\u0005H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001E\u0010\u001A\u001A\u00020\u0011*\u00020\f2\u0006\u0010\r\u001A\u00020\u0005H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u001B\u0010\u0004J:\u0010\u001B\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u000BJ\u000F\u0010\u001D\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u0013JN\u0010\u001D\u001A\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0017J\u000F\u0010\u001F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u001F\u0010\u0004J:\u0010\u001F\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u000BJ\u000F\u0010!\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b!\u0010\u0013JN\u0010!\u001A\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u0017J\u000F\u0010#\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b#\u0010\u0004J:\u0010#\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010\u000BJ\u001E\u0010&\u001A\u00020\u0002*\u00020\f2\u0006\u0010\r\u001A\u00020\u0005H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010\u000FJ\u000F\u0010\'\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\'\u0010\u0013JN\u0010\'\u001A\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\u0017J\u001E\u0010*\u001A\u00020\u0011*\u00020\f2\u0006\u0010\r\u001A\u00020\u0005H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010\u0019J!\u0010/\u001A\u0004\u0018\u00010.2\u0006\u0010,\u001A\u00020+2\u0006\u0010-\u001A\u00020+H\u0007\u00A2\u0006\u0004\b/\u00100J\u0017\u00101\u001A\u00020.2\u0006\u0010,\u001A\u00020+H\u0007\u00A2\u0006\u0004\b1\u00102R\u0011\u00106\u001A\u0002038G\u00A2\u0006\u0006\u001A\u0004\b4\u00105R\u0011\u00108\u001A\u0002038G\u00A2\u0006\u0006\u001A\u0004\b7\u00105R\u0018\u0010;\u001A\u00020\u0002*\u00020\f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u0018\u0010>\u001A\u00020\u0011*\u00020\f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010=R\u0018\u0010@\u001A\u00020\u0002*\u00020\f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u0010:R\u0018\u0010B\u001A\u00020\u0011*\u00020\f8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010=\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006C"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "Landroidx/compose/material3/IconButtonColors;", "iconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "iconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "localContentColor", "defaultIconButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "iconToggleButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "iconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "defaultIconToggleButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconToggleButtonColors;", "defaultIconToggleButtonColors", "filledIconButtonColors", "filledIconButtonColors-ro_MJ88", "filledIconToggleButtonColors", "filledIconToggleButtonColors-5tl4gsc", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "defaultOutlinedIconButtonColors-4WTKRHQ$material3_release", "defaultOutlinedIconButtonColors", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release", "defaultOutlinedIconToggleButtonColors", "", "enabled", "checked", "Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonBorder", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonBorder", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledShape", "getOutlinedShape", "outlinedShape", "getDefaultFilledIconButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconButtonColors;", "defaultFilledIconButtonColors", "getDefaultFilledIconToggleButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconToggleButtonColors;", "defaultFilledIconToggleButtonColors", "getDefaultFilledTonalIconButtonColors$material3_release", "defaultFilledTonalIconButtonColors", "getDefaultFilledTonalIconToggleButtonColors$material3_release", "defaultFilledTonalIconToggleButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1292:1\n77#2:1293\n77#2:1294\n77#2:1295\n77#2:1297\n77#2:1298\n77#2:1299\n77#2:1300\n77#2:1301\n77#2:1302\n77#2:1303\n77#2:1304\n77#2:1305\n77#2:1306\n77#2:1307\n77#2:1308\n1#3:1296\n1223#4,6:1309\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n594#1:1293\n618#1:1294\n624#1:1295\n652#1:1297\n679#1:1298\n687#1:1299\n941#1:1300\n942#1:1301\n966#1:1302\n972#1:1303\n1002#1:1304\n1029#1:1305\n1037#1:1306\n1095#1:1307\n1097#1:1308\n1101#1:1309,6\n*E\n"})
public final class IconButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final IconButtonDefaults INSTANCE;

    static {
        IconButtonDefaults.INSTANCE = new IconButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final IconButtonColors defaultIconButtonColors-4WTKRHQ$material3_release(@NotNull ColorScheme colorScheme0, long v) {
        IconButtonColors iconButtonColors0 = colorScheme0.getDefaultIconButtonColorsCached$material3_release();
        if(iconButtonColors0 == null) {
            iconButtonColors0 = new IconButtonColors(0L, v, 0L, Color.copy-wmQWz5c$default(v, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultIconButtonColorsCached$material3_release(iconButtonColors0);
        }
        return iconButtonColors0;
    }

    @NotNull
    public final IconToggleButtonColors defaultIconToggleButtonColors-4WTKRHQ$material3_release(@NotNull ColorScheme colorScheme0, long v) {
        IconToggleButtonColors iconToggleButtonColors0 = colorScheme0.getDefaultIconToggleButtonColorsCached$material3_release();
        if(iconToggleButtonColors0 == null) {
            iconToggleButtonColors0 = new IconToggleButtonColors(0L, v, 0L, Color.copy-wmQWz5c$default(v, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, ColorSchemeKt.fromToken(colorScheme0, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
            colorScheme0.setDefaultIconToggleButtonColorsCached$material3_release(iconToggleButtonColors0);
        }
        return iconToggleButtonColors0;
    }

    @NotNull
    public final IconButtonColors defaultOutlinedIconButtonColors-4WTKRHQ$material3_release(@NotNull ColorScheme colorScheme0, long v) {
        IconButtonColors iconButtonColors0 = colorScheme0.getDefaultOutlinedIconButtonColorsCached$material3_release();
        if(iconButtonColors0 == null) {
            iconButtonColors0 = new IconButtonColors(0L, v, 0L, Color.copy-wmQWz5c$default(v, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultOutlinedIconButtonColorsCached$material3_release(iconButtonColors0);
        }
        return iconButtonColors0;
    }

    @NotNull
    public final IconToggleButtonColors defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release(@NotNull ColorScheme colorScheme0, long v) {
        IconToggleButtonColors iconToggleButtonColors0 = colorScheme0.getDefaultIconToggleButtonColorsCached$material3_release();
        if(iconToggleButtonColors0 == null) {
            iconToggleButtonColors0 = new IconToggleButtonColors(0L, v, 0L, Color.copy-wmQWz5c$default(v, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
            colorScheme0.setDefaultOutlinedIconToggleButtonColorsCached$material3_release(iconToggleButtonColors0);
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @NotNull
    public final IconButtonColors filledIconButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x914A65A9, v, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        IconButtonColors iconButtonColors0 = this.getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @NotNull
    public final IconButtonColors filledIconButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD812C557, v4, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
        }
        IconButtonColors iconButtonColors0 = this.getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(v6, v7, ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors filledIconToggleButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA3551041, v, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors filledIconToggleButtonColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        long v8 = (v7 & 16) == 0 ? v4 : 0L;
        long v9 = (v7 & 0x20) == 0 ? v5 : ColorSchemeKt.contentColorFor-ek8zF_U(v8, composer0, v6 >> 12 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x707BFC45, v6, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-tNS2XkQ(((v7 & 1) == 0 ? v : 0L), ((v7 & 2) == 0 ? v1 : 0L), ((v7 & 4) == 0 ? v2 : 0L), ((v7 & 8) == 0 ? v3 : 0L), v8, v9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @NotNull
    public final IconButtonColors filledTonalIconButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099140437, v, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
        }
        IconButtonColors iconButtonColors0 = this.getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @NotNull
    public final IconButtonColors filledTonalIconButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFEE53615, v4, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
        }
        IconButtonColors iconButtonColors0 = this.getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(v6, v7, ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors filledTonalIconToggleButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x19E1AA43, v, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors filledTonalIconToggleButtonColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        long v8 = (v7 & 1) == 0 ? v : 0L;
        long v9 = (v7 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v8, composer0, v6 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFED79303, v6, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-tNS2XkQ(v8, v9, ((v7 & 4) == 0 ? v2 : 0L), ((v7 & 8) == 0 ? v3 : 0L), ((v7 & 16) == 0 ? v4 : 0L), ((v7 & 0x20) == 0 ? v5 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }

    @NotNull
    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        IconButtonColors iconButtonColors0 = colorScheme0.getDefaultFilledIconButtonColorsCached$material3_release();
        if(iconButtonColors0 == null) {
            iconButtonColors0 = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getContainerColor())), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getDisabledColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultFilledIconButtonColorsCached$material3_release(iconButtonColors0);
        }
        return iconButtonColors0;
    }

    @NotNull
    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        IconToggleButtonColors iconToggleButtonColors0 = colorScheme0.getDefaultFilledIconToggleButtonColorsCached$material3_release();
        if(iconToggleButtonColors0 == null) {
            iconToggleButtonColors0 = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getDisabledColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
            colorScheme0.setDefaultFilledIconToggleButtonColorsCached$material3_release(iconToggleButtonColors0);
        }
        return iconToggleButtonColors0;
    }

    @NotNull
    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        IconButtonColors iconButtonColors0 = colorScheme0.getDefaultFilledTonalIconButtonColorsCached$material3_release();
        if(iconButtonColors0 == null) {
            iconButtonColors0 = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getContainerColor())), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultFilledTonalIconButtonColorsCached$material3_release(iconButtonColors0);
        }
        return iconButtonColors0;
    }

    @NotNull
    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        IconToggleButtonColors iconToggleButtonColors0 = colorScheme0.getDefaultFilledTonalIconToggleButtonColorsCached$material3_release();
        if(iconToggleButtonColors0 == null) {
            iconToggleButtonColors0 = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor())), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor()), null);
            colorScheme0.setDefaultFilledTonalIconToggleButtonColorsCached$material3_release(iconToggleButtonColors0);
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4B7336D7, v, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        Shape shape0 = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F1A5417, v, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
        }
        Shape shape0 = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final IconButtonColors iconButtonColors(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xA56C696B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA56C696B, v, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        IconButtonColors iconButtonColors0 = this.defaultIconButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), v1);
        if(Color.equals-impl0(iconButtonColors0.getContentColor-0d7_KjU(), v1)) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return iconButtonColors0;
        }
        IconButtonColors iconButtonColors1 = IconButtonColors.copy-jRlVdoo$default(iconButtonColors0, 0L, v1, 0L, Color.copy-wmQWz5c$default(v1, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return iconButtonColors1;
    }

    @Composable
    @NotNull
    public final IconButtonColors iconButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 2) == 0 ? v1 : ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        long v7 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v6, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, v4, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        IconButtonColors iconButtonColors0 = this.defaultIconButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl()).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), v6, ((v5 & 4) == 0 ? v2 : 0L), v7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors iconToggleButtonColors(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xDCD58103);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDCD58103, v, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        IconToggleButtonColors iconToggleButtonColors0 = this.defaultIconToggleButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), v1);
        if(Color.equals-impl0(iconToggleButtonColors0.getContentColor-0d7_KjU(), v1)) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return iconToggleButtonColors0;
        }
        IconToggleButtonColors iconToggleButtonColors1 = IconToggleButtonColors.copy-tNS2XkQ$default(iconToggleButtonColors0, 0L, v1, 0L, Color.copy-wmQWz5c$default(v1, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return iconToggleButtonColors1;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors iconToggleButtonColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        long v8 = (v7 & 2) == 0 ? v1 : ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        long v9 = (v7 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v8, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, v6, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.defaultIconToggleButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl()).copy-tNS2XkQ(((v7 & 1) == 0 ? v : 0L), v8, ((v7 & 4) == 0 ? v2 : 0L), v9, ((v7 & 16) == 0 ? v4 : 0L), ((v7 & 0x20) == 0 ? v5 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedIconButtonBorder(boolean z, @Nullable Composer composer0, int v) {
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE183B74A, v, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if(z) {
            composer0.startReplaceGroup(1186104514);
            v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        }
        else {
            composer0.startReplaceGroup(1186170420);
            v1 = Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        composer0.endReplaceGroup();
        boolean z1 = composer0.changed(v1);
        BorderStroke borderStroke0 = composer0.rememberedValue();
        if(z1 || borderStroke0 == Composer.Companion.getEmpty()) {
            borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.0f, v1);
            composer0.updateRememberedValue(borderStroke0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final IconButtonColors outlinedIconButtonColors(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x17340E29);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x17340E29, v, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
        }
        IconButtonColors iconButtonColors0 = this.defaultOutlinedIconButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl());
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        if(Color.equals-impl0(iconButtonColors0.getContentColor-0d7_KjU(), v1)) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return iconButtonColors0;
        }
        IconButtonColors iconButtonColors1 = IconButtonColors.copy-jRlVdoo$default(iconButtonColors0, 0L, v1, 0L, Color.copy-wmQWz5c$default(v1, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return iconButtonColors1;
    }

    @Composable
    @NotNull
    public final IconButtonColors outlinedIconButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 2) == 0 ? v1 : ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        long v7 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v6, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, v4, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
        }
        IconButtonColors iconButtonColors0 = this.defaultOutlinedIconButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl()).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), v6, ((v5 & 4) == 0 ? v2 : 0L), v7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColors0;
    }

    @Composable
    @Nullable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(1244729690);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, v, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if(z1) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return null;
        }
        BorderStroke borderStroke0 = this.outlinedIconButtonBorder(z, composer0, v & 14 | v >> 3 & 0x70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors outlinedIconToggleButtonColors(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0xD185F8C1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD185F8C1, v, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
        }
        long v1 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        IconToggleButtonColors iconToggleButtonColors0 = this.defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), v1);
        if(Color.equals-impl0(iconToggleButtonColors0.getContentColor-0d7_KjU(), v1)) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return iconToggleButtonColors0;
        }
        IconToggleButtonColors iconToggleButtonColors1 = IconToggleButtonColors.copy-tNS2XkQ$default(iconToggleButtonColors0, 0L, v1, 0L, Color.copy-wmQWz5c$default(v1, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return iconToggleButtonColors1;
    }

    @Composable
    @NotNull
    public final IconToggleButtonColors outlinedIconToggleButtonColors-5tl4gsc(long v, long v1, long v2, long v3, long v4, long v5, @Nullable Composer composer0, int v6, int v7) {
        long v8 = (v7 & 2) == 0 ? v1 : ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        long v9 = (v7 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v8, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long v10 = (v7 & 16) == 0 ? v4 : 0L;
        long v11 = (v7 & 0x20) == 0 ? v5 : ColorSchemeKt.contentColorFor-ek8zF_U(v10, composer0, v6 >> 12 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, v6, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
        }
        IconToggleButtonColors iconToggleButtonColors0 = this.defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl()).copy-tNS2XkQ(((v7 & 1) == 0 ? v : 0L), v8, ((v7 & 4) == 0 ? v2 : 0L), v9, v10, v11);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColors0;
    }
}

