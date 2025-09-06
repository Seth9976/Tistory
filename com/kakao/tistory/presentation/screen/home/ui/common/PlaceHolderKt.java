package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0013\u0010\u0003\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001A2\u0010\u0001\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A<\u0010\u0001\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u0013\u0010\u0011\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "placeholder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "roundedPlaceholder", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/unit/Dp;", "width", "", "lines", "placeholder-942rkJo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;FILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "textSize", "lineHeight", "placeholder-YV-b6Qo", "(Landroidx/compose/ui/Modifier;JJFILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "notVisibleWhenLoading", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlaceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceHolder.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/PlaceHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n77#2:103\n77#2:104\n77#2:105\n77#2:106\n77#2:114\n1223#3,6:107\n148#4:113\n*S KotlinDebug\n*F\n+ 1 PlaceHolder.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/PlaceHolderKt\n*L\n22#1:103\n32#1:104\n59#1:105\n61#1:106\n98#1:114\n69#1:107,6\n84#1:113\n*E\n"})
public final class PlaceHolderKt {
    public static void a(ContentDrawScope contentDrawScope0, long v, long v1, long v2, int v3) {
        long v4 = (v3 & 2) == 0 ? v : CornerRadiusKt.CornerRadius$default(contentDrawScope0.toPx-0680j_4(2.0f), 0.0f, 2, null);
        long v5 = (v3 & 4) == 0 ? v1 : 0L;
        DrawScope.drawRoundRect-u-Aw5IA$default(contentDrawScope0, 0L, v5, ((v3 & 8) == 0 ? v2 : SizeKt.Size(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) - Offset.getX-impl(v5), Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc()) - Offset.getY-impl(v5))), v4, null, 0.0f, null, 0, 0xF0, null);
    }

    @Composable
    @NotNull
    public static final Modifier notVisibleWhenLoading(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        composer0.startReplaceGroup(1604405422);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1604405422, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.notVisibleWhenLoading (PlaceHolder.kt:96)");
        }
        if(((Boolean)composer0.consume(SlotContainerKt.getLocalLoadingState())).booleanValue()) {
            modifier0 = modifier0.then(DrawModifierKt.drawWithContent(ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, m.a, 6, null), n.a));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }

    @Composable
    @NotNull
    public static final Modifier placeholder(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        composer0.startReplaceGroup(1112910206);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1112910206, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.placeholder (PlaceHolder.kt:20)");
        }
        Modifier modifier1 = ((Boolean)composer0.consume(SlotContainerKt.getLocalLoadingState())).booleanValue() ? DrawModifierKt.drawWithContent(Modifier.Companion, o.a) : Modifier.Companion;
        Modifier modifier2 = modifier0.then(modifier1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier2;
    }

    @Composable
    @NotNull
    public static final Modifier placeholder-942rkJo(@NotNull Modifier modifier0, @NotNull TextStyle textStyle0, float f, int v, @Nullable Composer composer0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$placeholder");
        Intrinsics.checkNotNullParameter(textStyle0, "textStyle");
        composer0.startReplaceGroup(-1099438251);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099438251, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.common.placeholder (PlaceHolder.kt:44)");
        }
        Modifier modifier1 = PlaceHolderKt.placeholder-YV-b6Qo(modifier0, textStyle0.getFontSize-XSAIIZE(), textStyle0.getLineHeight-XSAIIZE(), ((v2 & 2) == 0 ? f : NaNf), ((v2 & 4) == 0 ? v : 1), composer0, v1 << 3 & 0xE000 | (v1 & 14 | v1 << 3 & 0x1C00), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier1;
    }

    @Composable
    @NotNull
    public static final Modifier placeholder-YV-b6Qo(@NotNull Modifier modifier0, long v, long v1, float f, int v2, @Nullable Composer composer0, int v3, int v4) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$placeholder");
        composer0.startReplaceGroup(0x4E3B6B6D);
        float f1 = (v4 & 4) == 0 ? f : NaNf;
        int v5 = 1;
        int v6 = (v4 & 8) == 0 ? v2 : 1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4E3B6B6D, v3, -1, "com.kakao.tistory.presentation.screen.home.ui.common.placeholder (PlaceHolder.kt:57)");
        }
        if(!((Boolean)composer0.consume(SlotContainerKt.getLocalLoadingState())).booleanValue()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return modifier0;
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        Pair pair0 = TuplesKt.to(density0.toPx--R2X_6o(v), density0.toPx--R2X_6o(((v4 & 2) == 0 ? v1 : v)));
        float f2 = ((Number)pair0.component1()).floatValue();
        float f3 = ((Number)pair0.component2()).floatValue();
        float f4 = (f3 - f2) / 2.0f;
        Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, p.a, 6, null);
        composer0.startReplaceGroup(0x30924BA6);
        int v7 = ((v3 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(f1)) && (v3 & 0xC00) != 0x800 ? 0 : 1;
        if(((0xE000 & v3 ^ 0x6000) <= 0x4000 || !composer0.changed(v6)) && (v3 & 0x6000) != 0x4000) {
            v5 = 0;
        }
        boolean z = composer0.changed(f3);
        boolean z1 = composer0.changed(f4);
        boolean z2 = composer0.changed(f2);
        q q0 = composer0.rememberedValue();
        if((v7 | v5 | z | z1 | z2) != 0 || q0 == Composer.Companion.getEmpty()) {
            q0 = new q(f1, v6, f3, f4, f2);
            composer0.updateRememberedValue(q0);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = modifier0.then(DrawModifierKt.drawWithContent(modifier1, q0));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier2;
    }

    @Composable
    @NotNull
    public static final Modifier roundedPlaceholder(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        composer0.startReplaceGroup(0x4A4A22D9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4A4A22D9, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.roundedPlaceholder (PlaceHolder.kt:30)");
        }
        Modifier modifier1 = ((Boolean)composer0.consume(SlotContainerKt.getLocalLoadingState())).booleanValue() ? DrawModifierKt.drawWithContent(Modifier.Companion, r.a) : Modifier.Companion;
        Modifier modifier2 = modifier0.then(modifier1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier2;
    }
}

