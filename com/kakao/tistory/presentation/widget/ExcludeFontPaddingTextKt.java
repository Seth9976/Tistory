package com.kakao.tistory.presentation.widget;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u00F0\u0001\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001F2\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010#2\b\b\u0002\u0010%\u001A\u00020&H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(\u001A\u00DA\u0001\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020 2\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\u0014\b\u0002\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010#2\b\b\u0002\u0010%\u001A\u00020&H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006+\u00B2\u0006\n\u0010,\u001A\u00020\u0019X\u008A\u008E\u0002"}, d2 = {"Text", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "includeFontPadding", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Landroidx/compose/ui/text/TextStyle;", "Text-edWjEy0", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-IbK3jfQ", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "presentation_prodRelease", "isOverflow"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExcludeFontPaddingText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcludeFontPaddingText.kt\ncom/kakao/tistory/presentation/widget/ExcludeFontPaddingTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n77#2:111\n77#2:118\n1223#3,6:112\n81#4:119\n107#4,2:120\n*S KotlinDebug\n*F\n+ 1 ExcludeFontPaddingText.kt\ncom/kakao/tistory/presentation/widget/ExcludeFontPaddingTextKt\n*L\n41#1:111\n86#1:118\n43#1:112,6\n43#1:119\n43#1:120,2\n*E\n"})
public final class ExcludeFontPaddingTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Text-IbK3jfQ(@NotNull String s, @Nullable Modifier modifier0, long v, long v1, @Nullable FontStyle fontStyle0, @Nullable FontWeight fontWeight0, @Nullable FontFamily fontFamily0, long v2, @Nullable TextDecoration textDecoration0, @Nullable TextAlign textAlign0, long v3, int v4, boolean z, boolean z1, int v5, int v6, @Nullable Function1 function10, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v7, int v8, int v9) {
        TextStyle textStyle1;
        Function1 function11;
        int v22;
        int v21;
        boolean z3;
        boolean z2;
        int v20;
        long v19;
        TextAlign textAlign1;
        TextDecoration textDecoration1;
        long v18;
        FontFamily fontFamily1;
        FontWeight fontWeight1;
        FontStyle fontStyle1;
        long v17;
        long v16;
        Modifier modifier1;
        long v29;
        int v28;
        TextStyle textStyle2;
        Function1 function12;
        int v27;
        int v26;
        boolean z5;
        boolean z4;
        int v25;
        long v24;
        TextAlign textAlign2;
        long v23;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        Modifier modifier2;
        int v15;
        int v13;
        int v10;
        Intrinsics.checkNotNullParameter(s, "text");
        Composer composer1 = composer0.startRestartGroup(0x13EA60ED);
        if((v9 & 1) == 0) {
            v10 = (v7 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v7 : v7;
        }
        else {
            v10 = v7 | 6;
        }
        if((v9 & 2) != 0) {
            v10 |= 0x30;
        }
        else if((v7 & 0x70) == 0) {
            v10 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v9 & 4) != 0) {
            v10 |= 0x180;
        }
        else if((v7 & 0x380) == 0) {
            v10 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        int v11 = 0x400;
        if((v9 & 8) != 0) {
            v10 |= 0xC00;
        }
        else if((v7 & 0x1C00) == 0) {
            v10 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        int v12 = 0x2000;
        if((v9 & 16) != 0) {
            v10 |= 0x6000;
        }
        else if((v7 & 0xE000) == 0) {
            v10 |= (composer1.changed(fontStyle0) ? 0x4000 : 0x2000);
        }
        if((v9 & 0x20) != 0) {
            v10 |= 0x30000;
        }
        else if((v7 & 0x70000) == 0) {
            v10 |= (composer1.changed(fontWeight0) ? 0x20000 : 0x10000);
        }
        if((v9 & 0x40) != 0) {
            v10 |= 0x180000;
        }
        else if((v7 & 0x380000) == 0) {
            v10 |= (composer1.changed(fontFamily0) ? 0x100000 : 0x80000);
        }
        if((v9 & 0x80) != 0) {
            v10 |= 0xC00000;
        }
        else if((v7 & 0x1C00000) == 0) {
            v10 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v9 & 0x100) != 0) {
            v10 |= 0x6000000;
        }
        else if((v7 & 0xE000000) == 0) {
            v10 |= (composer1.changed(textDecoration0) ? 0x4000000 : 0x2000000);
        }
        if((v9 & 0x200) != 0) {
            v10 |= 0x30000000;
        }
        else if((v7 & 0x70000000) == 0) {
            v10 |= (composer1.changed(textAlign0) ? 0x20000000 : 0x10000000);
        }
        if((v9 & 0x400) == 0) {
            v13 = (v8 & 14) == 0 ? v8 | (composer1.changed(v3) ? 4 : 2) : v8;
        }
        else {
            v13 = v8 | 6;
        }
        if((v9 & 0x800) != 0) {
            v13 |= 0x30;
        }
        else if((v8 & 0x70) == 0) {
            v13 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        int v14 = v13;
        if((v9 & 0x1000) != 0) {
            v14 |= 0x180;
        }
        else if((v8 & 0x380) == 0) {
            v14 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v9 & 0x2000) != 0) {
            v14 |= 0xC00;
        }
        else if((v8 & 0x1C00) == 0) {
            if(composer1.changed(z1)) {
                v11 = 0x800;
            }
            v14 |= v11;
        }
        if((v9 & 0x4000) != 0) {
            v14 |= 0x6000;
            v15 = v9 & 0x4000;
        }
        else if((v8 & 0xE000) == 0) {
            v15 = v9 & 0x4000;
            if(composer1.changed(v5)) {
                v12 = 0x4000;
            }
            v14 |= v12;
        }
        else {
            v15 = v9 & 0x4000;
        }
        if((v9 & 0x8000) != 0) {
            v14 |= 0x30000;
        }
        else if((v8 & 0x70000) == 0) {
            v14 |= (composer1.changed(v6) ? 0x20000 : 0x10000);
        }
        if((v9 & 0x10000) != 0) {
            v14 |= 0x180000;
        }
        else if((v8 & 0x380000) == 0) {
            v14 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((v8 & 0x1C00000) == 0) {
            v14 |= ((v9 & 0x20000) != 0 || !composer1.changed(textStyle0) ? 0x400000 : 0x800000);
        }
        if((v10 & 0x5B6DB6DB) != 306783378 || (0x16DB6DB & v14) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v7 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v9 & 2) == 0 ? modifier0 : Modifier.Companion;
                TextAlign textAlign3 = null;
                fontStyle2 = (v9 & 16) == 0 ? fontStyle0 : null;
                if((v9 & 0x200) == 0) {
                    textAlign3 = textAlign0;
                }
                Function1 function13 = (v9 & 0x10000) == 0 ? function10 : r.a;
                if((v9 & 0x20000) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    v14 &= 0xFE3FFFFF;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                }
                v24 = (v9 & 0x400) == 0 ? v3 : 0x7FC00000L;
                z4 = (v9 & 0x1000) == 0 ? z : true;
                v28 = v14;
                v25 = (v9 & 0x800) == 0 ? v4 : 1;
                z5 = (v9 & 0x2000) == 0 ? z1 : true;
                v27 = (v9 & 0x8000) == 0 ? v6 : 1;
                v29 = (v9 & 8) == 0 ? v1 : 0x7FC00000L;
                v26 = v15 == 0 ? v5 : 0x7FFFFFFF;
                function12 = function13;
                fontWeight2 = (v9 & 0x20) == 0 ? fontWeight0 : null;
                v16 = (v9 & 4) == 0 ? v : 0L;
                fontFamily2 = (v9 & 0x40) == 0 ? fontFamily0 : null;
                textDecoration1 = (v9 & 0x100) == 0 ? textDecoration0 : null;
                textAlign2 = textAlign3;
                v23 = (v9 & 0x80) == 0 ? v2 : 0x7FC00000L;
            }
            else {
                composer1.skipToGroupEnd();
                if((v9 & 0x20000) != 0) {
                    v14 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                v16 = v;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                v23 = v2;
                textDecoration1 = textDecoration0;
                textAlign2 = textAlign0;
                v24 = v3;
                v25 = v4;
                z4 = z;
                z5 = z1;
                v26 = v5;
                v27 = v6;
                function12 = function10;
                textStyle2 = textStyle0;
                v28 = v14;
                v29 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x13EA60ED, v10, v28, "com.kakao.tistory.presentation.widget.Text (ExcludeFontPaddingText.kt:86)");
            }
            ExcludeFontPaddingTextKt.Text-edWjEy0(new AnnotatedString(s, null, null, 6, null), modifier2, v16, v29, fontStyle2, fontWeight2, fontFamily2, v23, textDecoration1, textAlign2, v24, v25, z4, z5, v26, v27, x.emptyMap(), function12, textStyle2, composer1, v10 & 0x7FFFFFF0, v28 & 14 | 0x180000 | v28 & 0x70 | v28 & 0x380 | v28 & 0x1C00 | v28 & 0xE000 | v28 & 0x70000 | v28 << 3 & 0x1C00000 | v28 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v17 = v29;
            fontStyle1 = fontStyle2;
            textAlign1 = textAlign2;
            v19 = v24;
            v20 = v25;
            z2 = z4;
            z3 = z5;
            v21 = v26;
            v22 = v27;
            function11 = function12;
            textStyle1 = textStyle2;
            v18 = v23;
            fontFamily1 = fontFamily2;
            fontWeight1 = fontWeight2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v16 = v;
            v17 = v1;
            fontStyle1 = fontStyle0;
            fontWeight1 = fontWeight0;
            fontFamily1 = fontFamily0;
            v18 = v2;
            textDecoration1 = textDecoration0;
            textAlign1 = textAlign0;
            v19 = v3;
            v20 = v4;
            z2 = z;
            z3 = z1;
            v21 = v5;
            v22 = v6;
            function11 = function10;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(s, modifier1, v16, v17, fontStyle1, fontWeight1, fontFamily1, v18, textDecoration1, textAlign1, v19, v20, z2, z3, v21, v22, function11, textStyle1, v7, v8, v9));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Text-edWjEy0(@NotNull AnnotatedString annotatedString0, @Nullable Modifier modifier0, long v, long v1, @Nullable FontStyle fontStyle0, @Nullable FontWeight fontWeight0, @Nullable FontFamily fontFamily0, long v2, @Nullable TextDecoration textDecoration0, @Nullable TextAlign textAlign0, long v3, int v4, boolean z, boolean z1, int v5, int v6, @Nullable Map map0, @Nullable Function1 function10, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v7, int v8, int v9) {
        long v23;
        TextStyle textStyle1;
        Function1 function11;
        Map map1;
        int v22;
        int v21;
        boolean z3;
        boolean z2;
        int v20;
        long v19;
        TextAlign textAlign1;
        TextDecoration textDecoration1;
        FontFamily fontFamily1;
        FontWeight fontWeight1;
        FontStyle fontStyle1;
        long v18;
        long v17;
        Modifier modifier1;
        TextStyle textStyle2;
        Function1 function12;
        Map map2;
        int v30;
        int v29;
        boolean z5;
        boolean z4;
        int v28;
        long v27;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long v26;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long v25;
        long v24;
        Modifier modifier2;
        int v16;
        int v15;
        int v13;
        int v10;
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        Composer composer1 = composer0.startRestartGroup(0xE3EA91BB);
        if((v9 & 1) == 0) {
            v10 = (v7 & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v7 : v7;
        }
        else {
            v10 = v7 | 6;
        }
        if((v9 & 2) != 0) {
            v10 |= 0x30;
        }
        else if((v7 & 0x70) == 0) {
            v10 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v9 & 4) != 0) {
            v10 |= 0x180;
        }
        else if((v7 & 0x380) == 0) {
            v10 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        int v11 = 0x400;
        if((v9 & 8) != 0) {
            v10 |= 0xC00;
        }
        else if((v7 & 0x1C00) == 0) {
            v10 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        int v12 = 0x2000;
        if((v9 & 16) != 0) {
            v10 |= 0x6000;
        }
        else if((v7 & 0xE000) == 0) {
            v10 |= (composer1.changed(fontStyle0) ? 0x4000 : 0x2000);
        }
        if((v9 & 0x20) != 0) {
            v10 |= 0x30000;
        }
        else if((v7 & 0x70000) == 0) {
            v10 |= (composer1.changed(fontWeight0) ? 0x20000 : 0x10000);
        }
        if((v9 & 0x40) != 0) {
            v10 |= 0x180000;
        }
        else if((v7 & 0x380000) == 0) {
            v10 |= (composer1.changed(fontFamily0) ? 0x100000 : 0x80000);
        }
        if((v9 & 0x80) != 0) {
            v10 |= 0xC00000;
        }
        else if((v7 & 0x1C00000) == 0) {
            v10 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v9 & 0x100) != 0) {
            v10 |= 0x6000000;
        }
        else if((0xE000000 & v7) == 0) {
            v10 |= (composer1.changed(textDecoration0) ? 0x4000000 : 0x2000000);
        }
        if((v9 & 0x200) != 0) {
            v10 |= 0x30000000;
        }
        else if((v7 & 0x70000000) == 0) {
            v10 |= (composer1.changed(textAlign0) ? 0x20000000 : 0x10000000);
        }
        if((v9 & 0x400) == 0) {
            v13 = (v8 & 14) == 0 ? v8 | (composer1.changed(v3) ? 4 : 2) : v8;
        }
        else {
            v13 = v8 | 6;
        }
        if((v9 & 0x800) != 0) {
            v13 |= 0x30;
        }
        else if((v8 & 0x70) == 0) {
            v13 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        int v14 = v13;
        if((v9 & 0x1000) != 0) {
            v14 |= 0x180;
        }
        else if((v8 & 0x380) == 0) {
            v14 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v9 & 0x2000) != 0) {
            v14 |= 0xC00;
        }
        else if((v8 & 0x1C00) == 0) {
            if(composer1.changed(z1)) {
                v11 = 0x800;
            }
            v14 |= v11;
        }
        if((v9 & 0x4000) != 0) {
            v14 |= 0x6000;
            v15 = v9 & 0x4000;
        }
        else if((v8 & 0xE000) == 0) {
            v15 = v9 & 0x4000;
            if(composer1.changed(v5)) {
                v12 = 0x4000;
            }
            v14 |= v12;
        }
        else {
            v15 = v9 & 0x4000;
        }
        if((v9 & 0x8000) != 0) {
            v14 |= 0x30000;
        }
        else if((v8 & 0x70000) == 0) {
            v14 |= (composer1.changed(v6) ? 0x20000 : 0x10000);
        }
        if((v9 & 0x10000) != 0) {
            v14 |= 0x80000;
        }
        if((v9 & 0x20000) != 0) {
            v14 |= 0xC00000;
            v16 = v9 & 0x2000;
        }
        else if((v8 & 0x1C00000) == 0) {
            v16 = v9 & 0x2000;
            v14 |= (composer1.changedInstance(function10) ? 0x800000 : 0x400000);
        }
        else {
            v16 = v9 & 0x2000;
        }
        if((v8 & 0xE000000) == 0) {
            v14 |= ((v9 & 0x40000) != 0 || !composer1.changed(textStyle0) ? 0x2000000 : 0x4000000);
        }
        if((v9 & 0x10000) != 0x10000 || (0x5B6DB6DB & v10) != 306783378 || (0xB6DB6DB & v14) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v7 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v9 & 2) == 0 ? modifier0 : Modifier.Companion;
                v24 = (v9 & 4) == 0 ? v : 0L;
                v25 = (v9 & 8) == 0 ? v1 : 0x7FC00000L;
                FontWeight fontWeight3 = (v9 & 0x20) == 0 ? fontWeight0 : null;
                TextDecoration textDecoration3 = (v9 & 0x100) == 0 ? textDecoration0 : null;
                TextAlign textAlign3 = (v9 & 0x200) == 0 ? textAlign0 : null;
                int v31 = (v9 & 0x800) == 0 ? v4 : 1;
                int v32 = 1;
                boolean z6 = (v9 & 0x1000) == 0 ? z : true;
                if((v9 & 0x8000) == 0) {
                    v32 = v6;
                }
                Map map3 = (v9 & 0x10000) == 0 ? map0 : x.emptyMap();
                Function1 function13 = (v9 & 0x20000) == 0 ? function10 : p.a;
                if((v9 & 0x40000) == 0) {
                    textStyle2 = textStyle0;
                    textDecoration2 = textDecoration3;
                    textAlign2 = textAlign3;
                    v28 = v31;
                    v30 = v32;
                    z4 = z6;
                    fontWeight2 = fontWeight3;
                }
                else {
                    v14 &= 0xF1FFFFFF;
                    textDecoration2 = textDecoration3;
                    textAlign2 = textAlign3;
                    v28 = v31;
                    v30 = v32;
                    z4 = z6;
                    fontWeight2 = fontWeight3;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                }
                map2 = map3;
                v29 = v15 == 0 ? v5 : 0x7FFFFFFF;
                fontFamily2 = (v9 & 0x40) == 0 ? fontFamily0 : null;
                function12 = function13;
                v26 = (v9 & 0x80) == 0 ? v2 : 0x7FC00000L;
                v27 = (v9 & 0x400) == 0 ? v3 : 0x7FC00000L;
                modifier2 = modifier3;
                fontStyle2 = (v9 & 16) == 0 ? fontStyle0 : null;
                z5 = v16 == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v9 & 0x40000) != 0) {
                    v14 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                v24 = v;
                v25 = v1;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                v26 = v2;
                textDecoration2 = textDecoration0;
                textAlign2 = textAlign0;
                v27 = v3;
                v28 = v4;
                z4 = z;
                z5 = z1;
                v29 = v5;
                v30 = v6;
                map2 = map0;
                function12 = function10;
                textStyle2 = textStyle0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE3EA91BB, v10, v14, "com.kakao.tistory.presentation.widget.Text (ExcludeFontPaddingText.kt:41)");
            }
            composer1.startReplaceGroup(0xA610308B);
            if(composer1.rememberedValue() == Composer.Companion.getEmpty()) {
                composer1.updateRememberedValue(SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
            }
            composer1.endReplaceGroup();
            TextKt.Text-IbK3jfQ(annotatedString0, modifier2, v24, v25, fontStyle2, fontWeight2, fontFamily2, v26, textDecoration2, textAlign2, v27, v28, z4, v29, v30, map2, function12, TextStyle.copy-p1EtxEg$default(textStyle2, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(z5), null, 0, 0, null, 0xF7FFFF, null), composer1, v10 & 0x7FFFFFFE, v14 & 14 | 0x40000 | v14 & 0x70 | v14 & 0x380 | v14 >> 3 & 0x1C00 | v14 >> 3 & 0xE000 | v14 >> 3 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            fontStyle1 = fontStyle2;
            fontWeight1 = fontWeight2;
            z3 = z5;
            fontFamily1 = fontFamily2;
            v17 = v24;
            v18 = v25;
            v23 = v26;
            textDecoration1 = textDecoration2;
            textAlign1 = textAlign2;
            v19 = v27;
            v20 = v28;
            z2 = z4;
            v21 = v29;
            v22 = v30;
            map1 = map2;
            function11 = function12;
            textStyle1 = textStyle2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v17 = v;
            v18 = v1;
            fontStyle1 = fontStyle0;
            fontWeight1 = fontWeight0;
            fontFamily1 = fontFamily0;
            textDecoration1 = textDecoration0;
            textAlign1 = textAlign0;
            v19 = v3;
            v20 = v4;
            z2 = z;
            z3 = z1;
            v21 = v5;
            v22 = v6;
            map1 = map0;
            function11 = function10;
            textStyle1 = textStyle0;
            v23 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(annotatedString0, modifier1, v17, v18, fontStyle1, fontWeight1, fontFamily1, v23, textDecoration1, textAlign1, v19, v20, z2, z3, v21, v22, map1, function11, textStyle1, v7, v8, v9));
        }
    }
}

