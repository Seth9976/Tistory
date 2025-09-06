package com.kakao.tistory.presentation.theme;

import android.os.Build.VERSION;
import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001AD\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u0018\u0010\f\u001A\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u001A>\u0010\r\u001A\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u000E\u001A\u00020\u000F2\n\b\u0003\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001AF\u0010\u0015\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\b2\b\b\u0002\u0010\u0019\u001A\u00020\b2\b\b\u0002\u0010\u001A\u001A\u00020\b2\b\b\u0002\u0010\u001B\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001D\u001A&\u0010\u0015\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u001E\u001A\u00020\u001F2\b\b\u0002\u0010 \u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001A<\u0010\u001E\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u001E\u001A\u00020\u001F2\b\b\u0002\u0010\u000E\u001A\u00020\u00172\n\b\u0002\u0010#\u001A\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b&\u0010\'\u001A\u001C\u0010(\u001A\u00020\u0001*\u00020\u00012\u0006\u0010)\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006,"}, d2 = {"horizontalRoundedClickable", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "", "onClickLabel", "", "horizontalPadding", "Landroidx/compose/ui/unit/Dp;", "verticalPadding", "horizontalRoundedClickable-6PoWaU8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "noRippleClickable", "roundedBackground", "solidColor", "", "strokeColor", "strokeWidth", "radius", "roundedBackground-oZzcvok", "(Landroidx/compose/ui/Modifier;ILjava/lang/Integer;FF)Landroidx/compose/ui/Modifier;", "shadow", "shadowColor", "Landroidx/compose/ui/graphics/Color;", "offsetY", "offsetX", "borderRadius", "shadowRadius", "shadow-QgBizOU", "(Landroidx/compose/ui/Modifier;JFFFF)Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "elevation", "shadow-wH6b6FI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "shadowElevation", "shape-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "textWrapperHeight", "height", "textWrapperHeight-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\ncom/kakao/tistory/presentation/theme/ModifierKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,168:1\n158#2:169\n148#2:170\n148#2:171\n148#2:172\n148#2:173\n148#2:174\n148#2:195\n148#2:196\n148#2:197\n148#2:198\n148#2:199\n148#2:200\n77#3:175\n1#4:176\n1223#5,6:177\n1223#5,6:183\n1223#5,6:189\n50#6:201\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\ncom/kakao/tistory/presentation/theme/ModifierKt\n*L\n35#1:169\n36#1:170\n63#1:171\n61#1:172\n72#1:173\n73#1:174\n121#1:195\n122#1:196\n123#1:197\n124#1:198\n152#1:199\n168#1:200\n75#1:175\n83#1:177,6\n88#1:183,6\n104#1:189,6\n168#1:201\n*E\n"})
public final class ModifierKt {
    @Composable
    @NotNull
    public static final Modifier horizontalRoundedClickable-6PoWaU8(@NotNull Modifier modifier0, @NotNull Function0 function00, @Nullable String s, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$horizontalRoundedClickable");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        composer0.startReplaceGroup(0xF816BF08);
        String s1 = (v1 & 2) == 0 ? s : StringResources_androidKt.stringResource(string.content_desc_move, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF816BF08, v, -1, "com.kakao.tistory.presentation.theme.horizontalRoundedClickable (Modifier.kt:73)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        int v2 = density0.roundToPx-0680j_4(((v1 & 4) == 0 ? f : 0.0f));
        int v3 = density0.roundToPx-0680j_4(((v1 & 8) == 0 ? f1 : 0.0f));
        composer0.startReplaceGroup(0xD6C941E6);
        boolean z = composer0.changed(v2 * 2);
        e e0 = composer0.rememberedValue();
        if(z || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(v2 * 2);
            composer0.updateRememberedValue(e0);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0xD6C94F30);
        boolean z1 = composer0.changed(e0);
        boolean z2 = composer0.changed(v2 * 2);
        b b0 = composer0.rememberedValue();
        if(z1 || z2 || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(e0, v2 * 2);
            composer0.updateRememberedValue(b0);
        }
        composer0.endReplaceGroup();
        Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(ClipKt.clip(LayoutModifierKt.layout(modifier0, b0), RoundedCornerShapeKt.RoundedCornerShape(100)), false, s1, null, function00, 5, null);
        composer0.startReplaceGroup(0xD6C9A035);
        boolean z3 = composer0.changed(v2 * 2);
        boolean z4 = composer0.changed(v3 * 2);
        boolean z5 = composer0.changed(e0);
        boolean z6 = composer0.changed(v3);
        d d0 = composer0.rememberedValue();
        if((z3 | z4 | z5 | z6) != 0 || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(v2 * 2, v3 * 2, e0, v3);
            composer0.updateRememberedValue(d0);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = LayoutModifierKt.layout(modifier1, d0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier2;
    }

    @NotNull
    public static final Modifier noRippleClickable(@NotNull Modifier modifier0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        return ComposedModifierKt.composed$default(modifier0, null, new f(function00), 1, null);
    }

    @NotNull
    public static final Modifier roundedBackground-oZzcvok(@NotNull Modifier modifier0, @ColorRes int v, @ColorRes @Nullable Integer integer0, float f, float f1) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$roundedBackground");
        return ComposedModifierKt.composed$default(modifier0, null, new g(f1, v, integer0, f), 1, null);
    }

    public static Modifier roundedBackground-oZzcvok$default(Modifier modifier0, int v, Integer integer0, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = color.white;
        }
        if((v1 & 2) != 0) {
            integer0 = null;
        }
        if((v1 & 4) != 0) {
            f = 0.5f;
        }
        if((v1 & 8) != 0) {
            f1 = 6.0f;
        }
        return ModifierKt.roundedBackground-oZzcvok(modifier0, v, integer0, f, f1);
    }

    @NotNull
    public static final Modifier shadow-QgBizOU(@NotNull Modifier modifier0, long v, float f, float f1, float f2, float f3) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$shadow");
        return DrawModifierKt.drawBehind(modifier0, new h(v, f3, f1, f, f2));
    }

    public static Modifier shadow-QgBizOU$default(Modifier modifier0, long v, float f, float f1, float f2, float f3, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
        float f4 = (v1 & 2) == 0 ? f : 1.0f;
        float f5 = (v1 & 4) == 0 ? f1 : 1.0f;
        float f6 = (v1 & 8) == 0 ? f2 : 4.0f;
        return (v1 & 16) == 0 ? ModifierKt.shadow-QgBizOU(modifier0, v2, f4, f5, f6, f3) : ModifierKt.shadow-QgBizOU(modifier0, v2, f4, f5, f6, 1.0f);
    }

    @NotNull
    public static final Modifier shadow-wH6b6FI(@NotNull Modifier modifier0, @NotNull Shape shape0, float f) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        return Build.VERSION.SDK_INT < 28 ? ShadowKt.shadow-s4CzXII$default(modifier0, f, shape0, false, 0L, 0L, 24, null) : ShadowKt.shadow-s4CzXII(modifier0, f, shape0, false, 0L, 0L);
    }

    public static Modifier shadow-wH6b6FI$default(Modifier modifier0, Shape shape0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 10.0f;
        }
        return ModifierKt.shadow-wH6b6FI(modifier0, shape0, f);
    }

    @NotNull
    public static final Modifier shape-8ww4TTg(@NotNull Modifier modifier0, @NotNull Shape shape0, long v, @Nullable BorderStroke borderStroke0, float f) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$shape");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        Modifier modifier1 = Dp.compareTo-0680j_4(f, 0.0f) > 0 ? ModifierKt.shadow-wH6b6FI(Modifier.Companion, shape0, f) : Modifier.Companion;
        Modifier modifier2 = modifier0.then(modifier1);
        return borderStroke0 == null ? BackgroundKt.background-bw27NRU(ClipKt.clip(modifier2.then(Modifier.Companion), shape0), v, shape0) : BackgroundKt.background-bw27NRU(ClipKt.clip(modifier2.then(BorderKt.border(Modifier.Companion, borderStroke0, shape0)), shape0), v, shape0);
    }

    public static Modifier shape-8ww4TTg$default(Modifier modifier0, Shape shape0, long v, BorderStroke borderStroke0, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = Color.Companion.getTransparent-0d7_KjU();
        }
        if((v1 & 4) != 0) {
            borderStroke0 = null;
        }
        if((v1 & 8) != 0) {
            f = 0.0f;
        }
        return ModifierKt.shape-8ww4TTg(modifier0, shape0, v, borderStroke0, f);
    }

    @NotNull
    public static final Modifier textWrapperHeight-3ABfNKs(@NotNull Modifier modifier0, float f) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$textWrapperHeight");
        return SizeKt.height-3ABfNKs(modifier0, f + 1.0f);
    }
}

