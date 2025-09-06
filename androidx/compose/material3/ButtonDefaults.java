package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\f\u0010\u0004J:\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000BJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u0004J:\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u000BJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0004J:\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u000BJ\u000F\u0010\u0012\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0004J:\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u000BJD\u0010\u001D\u001A\u00020\u001A2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u00142\b\b\u0002\u0010\u0019\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJD\u0010\u001F\u001A\u00020\u001A2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u00142\b\b\u0002\u0010\u0019\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001CJD\u0010!\u001A\u00020\u001A2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u00142\b\b\u0002\u0010\u0019\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001CJ\u0019\u0010%\u001A\u00020$2\b\b\u0002\u0010#\u001A\u00020\"H\u0007\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010,\u001A\u00020\'8\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u0017\u0010/\u001A\u00020\'8\u0006\u00A2\u0006\f\n\u0004\b-\u0010)\u001A\u0004\b.\u0010+R\u0017\u00102\u001A\u00020\'8\u0006\u00A2\u0006\f\n\u0004\b0\u0010)\u001A\u0004\b1\u0010+R\u0017\u00105\u001A\u00020\'8\u0006\u00A2\u0006\f\n\u0004\b3\u0010)\u001A\u0004\b4\u0010+R\u001D\u0010:\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u001D\u0010=\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u00107\u001A\u0004\b<\u00109R\u001D\u0010@\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u00107\u001A\u0004\b?\u00109R\u001D\u0010C\u001A\u00020\u00148\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bA\u00107\u001A\u0004\bB\u00109R\u0011\u0010G\u001A\u00020D8G\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0011\u0010I\u001A\u00020D8G\u00A2\u0006\u0006\u001A\u0004\bH\u0010FR\u0011\u0010K\u001A\u00020D8G\u00A2\u0006\u0006\u001A\u0004\bJ\u0010FR\u0011\u0010M\u001A\u00020D8G\u00A2\u0006\u0006\u001A\u0004\bL\u0010FR\u0011\u0010O\u001A\u00020D8G\u00A2\u0006\u0006\u001A\u0004\bN\u0010FR\u0018\u0010S\u001A\u00020\u0002*\u00020P8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bQ\u0010RR\u0018\u0010U\u001A\u00020\u0002*\u00020P8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010RR\u0018\u0010W\u001A\u00020\u0002*\u00020P8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010RR\u0018\u0010Y\u001A\u00020\u0002*\u00020P8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010RR\u0018\u0010[\u001A\u00020\u0002*\u00020P8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010RR\u0011\u0010%\u001A\u00020$8G\u00A2\u0006\u0006\u001A\u0004\b\\\u0010]\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006^"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "Landroidx/compose/material3/ButtonColors;", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "buttonElevation", "elevatedButtonElevation-R_JCAzs", "elevatedButtonElevation", "filledTonalButtonElevation-R_JCAzs", "filledTonalButtonElevation", "", "enabled", "Landroidx/compose/foundation/BorderStroke;", "outlinedButtonBorder", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "b", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "c", "getTextButtonContentPadding", "TextButtonContentPadding", "d", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "e", "F", "getMinWidth-D9Ej5fM", "()F", "MinWidth", "f", "getMinHeight-D9Ej5fM", "MinHeight", "g", "getIconSize-D9Ej5fM", "IconSize", "h", "getIconSpacing-D9Ej5fM", "IconSpacing", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getElevatedShape", "elevatedShape", "getFilledTonalShape", "filledTonalShape", "getOutlinedShape", "outlinedShape", "getTextShape", "textShape", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultElevatedButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultTextButtonColors$material3_release", "defaultTextButtonColors", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1108:1\n1#2:1109\n148#3:1110\n148#3:1111\n148#3:1112\n148#3:1113\n148#3:1114\n148#3:1115\n148#3:1116\n148#3:1117\n148#3:1118\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n858#1:1110\n465#1:1111\n466#1:1112\n484#1:1113\n495#1:1114\n510#1:1115\n525#1:1116\n531#1:1117\n539#1:1118\n*E\n"})
public final class ButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final ButtonDefaults INSTANCE;
    public static final PaddingValues a;
    public static final PaddingValues b;
    public static final PaddingValues c;
    public static final PaddingValues d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;

    static {
        ButtonDefaults.INSTANCE = new ButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-a9UjIt4(24.0f, 8.0f, 24.0f, 8.0f);
        ButtonDefaults.a = paddingValues0;
        ButtonDefaults.b = PaddingKt.PaddingValues-a9UjIt4(16.0f, 8.0f, 24.0f, 8.0f);
        ButtonDefaults.c = PaddingKt.PaddingValues-a9UjIt4(12.0f, paddingValues0.calculateTopPadding-D9Ej5fM(), 12.0f, paddingValues0.calculateBottomPadding-D9Ej5fM());
        ButtonDefaults.d = PaddingKt.PaddingValues-a9UjIt4(12.0f, paddingValues0.calculateTopPadding-D9Ej5fM(), 16.0f, paddingValues0.calculateBottomPadding-D9Ej5fM());
        ButtonDefaults.e = 58.0f;
        ButtonDefaults.f = 40.0f;
        ButtonDefaults.g = FilledButtonTokens.INSTANCE.getIconSize-D9Ej5fM();
        ButtonDefaults.h = 8.0f;
    }

    @Composable
    @NotNull
    public final ButtonColors buttonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5661C77D, v, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        ButtonColors buttonColors0 = this.getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors buttonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, v4, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        ButtonColors buttonColors0 = this.getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonElevation buttonElevation-R_JCAzs(float f, float f1, float f2, float f3, float f4, @Nullable Composer composer0, int v, int v1) {
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
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6CF1E157, v, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        ButtonElevation buttonElevation0 = new ButtonElevation(f, f1, f2, f3, f4, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation0;
    }

    @Composable
    @NotNull
    public final ButtonColors elevatedButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, v, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:609)");
        }
        ButtonColors buttonColors0 = this.getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors elevatedButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x59E0DB1F, v4, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:627)");
        }
        ButtonColors buttonColors0 = this.getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonElevation elevatedButtonElevation-R_JCAzs(float f, float f1, float f2, float f3, float f4, @Nullable Composer composer0, int v, int v1) {
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
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F81F8CD, v, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:829)");
        }
        ButtonElevation buttonElevation0 = new ButtonElevation(f, f1, f2, f3, f4, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation0;
    }

    @Composable
    @NotNull
    public final ButtonColors filledTonalButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x312C50BD, v, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:655)");
        }
        ButtonColors buttonColors0 = this.getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors filledTonalButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, v4, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:674)");
        }
        ButtonColors buttonColors0 = this.getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonElevation filledTonalButtonElevation-R_JCAzs(float f, float f1, float f2, float f3, float f4, @Nullable Composer composer0, int v, int v1) {
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
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5B4A97, v, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:859)");
        }
        ButtonElevation buttonElevation0 = new ButtonElevation(f, f1, f2, f3, f4, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation0;
    }

    @NotNull
    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonDefaults.b;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ButtonDefaults.a;
    }

    @NotNull
    public final ButtonColors getDefaultButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ButtonColors buttonColors0 = colorScheme0.getDefaultButtonColorsCached$material3_release();
        if(buttonColors0 == null) {
            buttonColors0 = new ButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledButtonTokens.INSTANCE.getLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultButtonColorsCached$material3_release(buttonColors0);
        }
        return buttonColors0;
    }

    @NotNull
    public final ButtonColors getDefaultElevatedButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ButtonColors buttonColors0 = colorScheme0.getDefaultElevatedButtonColorsCached$material3_release();
        if(buttonColors0 == null) {
            buttonColors0 = new ButtonColors(ColorSchemeKt.fromToken(colorScheme0, ElevatedButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, ElevatedButtonTokens.INSTANCE.getLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultElevatedButtonColorsCached$material3_release(buttonColors0);
        }
        return buttonColors0;
    }

    @NotNull
    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ButtonColors buttonColors0 = colorScheme0.getDefaultFilledTonalButtonColorsCached$material3_release();
        if(buttonColors0 == null) {
            buttonColors0 = new ButtonColors(ColorSchemeKt.fromToken(colorScheme0, FilledTonalButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTonalButtonTokens.INSTANCE.getLabelTextColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors0);
        }
        return buttonColors0;
    }

    @NotNull
    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ButtonColors buttonColors0 = colorScheme0.getDefaultOutlinedButtonColorsCached$material3_release();
        if(buttonColors0 == null) {
            buttonColors0 = new ButtonColors(0L, ColorSchemeKt.fromToken(colorScheme0, OutlinedButtonTokens.INSTANCE.getLabelTextColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors0);
        }
        return buttonColors0;
    }

    @NotNull
    public final ButtonColors getDefaultTextButtonColors$material3_release(@NotNull ColorScheme colorScheme0) {
        ButtonColors buttonColors0 = colorScheme0.getDefaultTextButtonColorsCached$material3_release();
        if(buttonColors0 == null) {
            buttonColors0 = new ButtonColors(0L, ColorSchemeKt.fromToken(colorScheme0, TextButtonTokens.INSTANCE.getLabelTextColor()), 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, TextButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultTextButtonColorsCached$material3_release(buttonColors0);
        }
        return buttonColors0;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7FCA3707, v, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:546)");
        }
        Shape shape0 = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getFilledTonalShape")
    @NotNull
    public final Shape getFilledTonalShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCB27C965, v, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:550)");
        }
        Shape shape0 = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getIconSize-D9Ej5fM() {
        return ButtonDefaults.g;
    }

    public final float getIconSpacing-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @Deprecated(message = "Please use the version that takes an `enabled` param to get the `BorderStroke` with the correct opacity", replaceWith = @ReplaceWith(expression = "outlinedButtonBorder(enabled)", imports = {}))
    @JvmName(name = "getOutlinedButtonBorder")
    @NotNull
    public final BorderStroke getOutlinedButtonBorder(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDE62B058, v, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)");
        }
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(OutlinedButtonTokens.INSTANCE.getOutlineWidth-D9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, v, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        Shape shape0 = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
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
            ComposerKt.traceEventStart(0xB66491F3, v, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        Shape shape0 = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return ButtonDefaults.c;
    }

    @NotNull
    public final PaddingValues getTextButtonWithIconContentPadding() {
        return ButtonDefaults.d;
    }

    @Composable
    @JvmName(name = "getTextShape")
    @NotNull
    public final Shape getTextShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEB30D3CD, v, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        Shape shape0 = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final BorderStroke outlinedButtonBorder(boolean z, @Nullable Composer composer0, int v, int v1) {
        long v2;
        if((v1 & 1) != 0) {
            z = true;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDAA2F491, v, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        OutlinedButtonTokens outlinedButtonTokens0 = OutlinedButtonTokens.INSTANCE;
        float f = outlinedButtonTokens0.getOutlineWidth-D9Ej5fM();
        if(z) {
            composer0.startReplaceGroup(0xCCFC73AC);
            v2 = ColorSchemeKt.getValue(outlinedButtonTokens0.getOutlineColor(), composer0, 6);
        }
        else {
            composer0.startReplaceGroup(-855783004);
            v2 = Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(outlinedButtonTokens0.getOutlineColor(), composer0, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        composer0.endReplaceGroup();
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(f, v2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke0;
    }

    @Composable
    @NotNull
    public final ButtonColors outlinedButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAFD6A83B, v, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        ButtonColors buttonColors0 = this.getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors outlinedButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x95FDD7D7, v4, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        ButtonColors buttonColors0 = this.getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors textButtonColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7013BC50, v, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        ButtonColors buttonColors0 = this.getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors textButtonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAC6AFC22, v4, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        ButtonColors buttonColors0 = this.getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy-jRlVdoo(((v5 & 1) == 0 ? v : 0L), ((v5 & 2) == 0 ? v1 : 0L), ((v5 & 4) == 0 ? v2 : 0L), ((v5 & 8) == 0 ? v3 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColors0;
    }
}

