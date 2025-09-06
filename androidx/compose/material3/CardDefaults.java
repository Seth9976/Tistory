package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u00C7\u0002\u0018\u00002\u00020\u0001JN\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJN\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000BJN\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u000BJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u001B\u0010\u0013J:\u0010\u001B\u001A\u00020\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001AJ\u000F\u0010\u001D\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u0013J:\u0010\u001D\u001A\u00020\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001AJ\u0019\u0010\"\u001A\u00020!2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00A2\u0006\u0004\b\"\u0010#R\u0011\u0010\'\u001A\u00020$8G\u00A2\u0006\u0006\u001A\u0004\b%\u0010&R\u0011\u0010)\u001A\u00020$8G\u00A2\u0006\u0006\u001A\u0004\b(\u0010&R\u0011\u0010+\u001A\u00020$8G\u00A2\u0006\u0006\u001A\u0004\b*\u0010&R\u0018\u0010/\u001A\u00020\u0011*\u00020,8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0018\u00101\u001A\u00020\u0011*\u00020,8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u0010.R\u0018\u00103\u001A\u00020\u0011*\u00020,8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u0010.\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00064"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/CardElevation;", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "cardElevation", "elevatedCardElevation-aqJV_2Y", "elevatedCardElevation", "outlinedCardElevation-aqJV_2Y", "outlinedCardElevation", "Landroidx/compose/material3/CardColors;", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "", "enabled", "Landroidx/compose/foundation/BorderStroke;", "outlinedCardBorder", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getElevatedShape", "elevatedShape", "getOutlinedShape", "outlinedShape", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultCardColors", "getDefaultElevatedCardColors$material3_release", "defaultElevatedCardColors", "getDefaultOutlinedCardColors$material3_release", "defaultOutlinedCardColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1#2:852\n1223#3,6:853\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n627#1:853,6\n*E\n"})
public final class CardDefaults {
    public static final int $stable;
    @NotNull
    public static final CardDefaults INSTANCE;

    static {
        CardDefaults.INSTANCE = new CardDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @NotNull
    public final CardColors cardColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x902DFD01, v, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors cardColors0 = this.getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardColors cardColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        long v8 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA140E6D5, v4, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColors0 = this.getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(v6, v7, ((v5 & 4) == 0 ? v2 : 0L), v8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardElevation cardElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if((v1 & 0x20) != 0) {
            f5 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDDBBBEC9, v, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        CardElevation cardElevation0 = new CardElevation(f, f1, f2, f3, f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation0;
    }

    @Composable
    @NotNull
    public final CardColors elevatedCardColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5FF8C177, v, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors cardColors0 = this.getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardColors elevatedCardColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        long v8 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(v7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8517D9F, v4, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:540)");
        }
        CardColors cardColors0 = this.getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(v6, v7, ((v5 & 4) == 0 ? v2 : 0L), v8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardElevation elevatedCardElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if((v1 & 0x20) != 0) {
            f5 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x44CC5593, v, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        CardElevation cardElevation0 = new CardElevation(f, f1, f2, f3, f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation0;
    }

    @NotNull
    public final CardColors getDefaultCardColors$material3_release(@NotNull ColorScheme colorScheme0) {
        CardColors cardColors0 = colorScheme0.getDefaultCardColorsCached$material3_release();
        if(cardColors0 == null) {
            cardColors0 = new CardColors(ColorSchemeKt.fromToken(colorScheme0, FilledCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledCardTokens.INSTANCE.getContainerColor())), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledCardTokens.INSTANCE.getDisabledContainerColor()), FilledCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledCardTokens.INSTANCE.getContainerColor())), Color.copy-wmQWz5c$default(ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, FilledCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultCardColorsCached$material3_release(cardColors0);
        }
        return cardColors0;
    }

    @NotNull
    public final CardColors getDefaultElevatedCardColors$material3_release(@NotNull ColorScheme colorScheme0) {
        CardColors cardColors0 = colorScheme0.getDefaultElevatedCardColorsCached$material3_release();
        if(cardColors0 == null) {
            cardColors0 = new CardColors(ColorSchemeKt.fromToken(colorScheme0, ElevatedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, ElevatedCardTokens.INSTANCE.getContainerColor())), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ElevatedCardTokens.INSTANCE.getDisabledContainerColor()), ElevatedCardTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, ElevatedCardTokens.INSTANCE.getDisabledContainerColor())), Color.copy-wmQWz5c$default(ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, ElevatedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultElevatedCardColorsCached$material3_release(cardColors0);
        }
        return cardColors0;
    }

    @NotNull
    public final CardColors getDefaultOutlinedCardColors$material3_release(@NotNull ColorScheme colorScheme0) {
        CardColors cardColors0 = colorScheme0.getDefaultOutlinedCardColorsCached$material3_release();
        if(cardColors0 == null) {
            cardColors0 = new CardColors(ColorSchemeKt.fromToken(colorScheme0, OutlinedCardTokens.INSTANCE.getContainerColor()), ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, OutlinedCardTokens.INSTANCE.getContainerColor())), ColorSchemeKt.fromToken(colorScheme0, OutlinedCardTokens.INSTANCE.getContainerColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.contentColorFor-4WTKRHQ(colorScheme0, ColorSchemeKt.fromToken(colorScheme0, OutlinedCardTokens.INSTANCE.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultOutlinedCardColorsCached$material3_release(cardColors0);
        }
        return cardColors0;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF80B0287, v, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape shape0 = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer0, 6);
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
            ComposerKt.traceEventStart(1095404023, v, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape shape0 = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4B7FB373, v, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape shape0 = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedCardBorder(boolean z, @Nullable Composer composer0, int v, int v1) {
        long v2;
        if((v1 & 1) != 0) {
            z = true;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE894436F, v, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if(z) {
            composer0.startReplaceGroup(-134409770);
            v2 = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer0, 6);
        }
        else {
            composer0.startReplaceGroup(0xF7FE47F5);
            v2 = ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getDisabledOutlineColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(ElevatedCardTokens.INSTANCE.getContainerColor(), composer0, 6));
        }
        composer0.endReplaceGroup();
        boolean z1 = composer0.changed(v2);
        BorderStroke borderStroke0 = composer0.rememberedValue();
        if(z1 || borderStroke0 == Composer.Companion.getEmpty()) {
            borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(OutlinedCardTokens.INSTANCE.getOutlineWidth-D9Ej5fM(), v2);
            composer0.updateRememberedValue(borderStroke0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final CardColors outlinedCardColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, v, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors cardColors0 = this.getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardColors outlinedCardColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        long v6 = (v5 & 1) == 0 ? v : 0L;
        long v7 = (v5 & 2) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        long v8 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, v4, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:589)");
        }
        CardColors cardColors0 = this.getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(v6, v7, ((v5 & 4) == 0 ? v2 : 0L), v8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardColors0;
    }

    @Composable
    @NotNull
    public final CardElevation outlinedCardElevation-aqJV_2Y(float f, float f1, float f2, float f3, float f4, float f5, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 0.0f;
        }
        if((v1 & 0x20) != 0) {
            f5 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFA2D8A4B, v, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        CardElevation cardElevation0 = new CardElevation(f, ((v1 & 2) == 0 ? f1 : f), ((v1 & 4) == 0 ? f2 : f), ((v1 & 8) == 0 ? f3 : f), f4, f5, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cardElevation0;
    }
}

