package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.ap;
import androidx.compose.material3.cp;
import androidx.compose.material3.vo;
import androidx.compose.material3.wo;
import androidx.compose.material3.yo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.o2;
import p0.wb;
import p0.xb;
import p0.yb;
import p0.zb;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u00D2\u0001\u0010#\u001A\u00020\u001D2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\u0016\b\u0002\u0010\u001E\u001A\u0010\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001B2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u001A\u00C6\u0001\u0010#\u001A\u00020\u001D2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D0\u001B2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\u001A\u00E6\u0001\u0010#\u001A\u00020\u001D2\u0006\u0010\u0001\u001A\u00020&2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\u0014\b\u0002\u0010)\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0\'2\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D0\u001B2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001A\u00DC\u0001\u0010#\u001A\u00020\u001D2\u0006\u0010\u0001\u001A\u00020&2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\u0014\b\u0002\u0010)\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0\'2\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001D0\u001B2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010,\u001A*\u00101\u001A\u00020\u001D2\u0006\u0010-\u001A\u00020\u001F2\u0011\u00100\u001A\r\u0012\u0004\u0012\u00020\u001D0.\u00A2\u0006\u0002\b/H\u0007\u00A2\u0006\u0004\b1\u00102\"\u001D\u00108\u001A\b\u0012\u0004\u0012\u00020\u001F038\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00069"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/TextStyle;", "style", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "ProvideTextStyle", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextStyle", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n74#2:399\n74#2:400\n74#2:401\n74#2:410\n74#2:411\n74#2:412\n74#2:413\n74#2:422\n74#2:423\n646#3:402\n646#3:403\n646#3:414\n646#3:415\n1116#4,6:404\n1116#4,6:416\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n*L\n110#1:399\n129#1:400\n130#1:401\n182#1:410\n278#1:411\n297#1:412\n298#1:413\n352#1:422\n395#1:423\n131#1:402\n133#1:403\n299#1:414\n301#1:415\n157#1:404,6\n326#1:416,6\n*E\n"})
public final class TextKt {
    public static final ProvidableCompositionLocal a;

    static {
        TextKt.a = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), o2.E);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@NotNull TextStyle textStyle0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x69A2BC9C);
        int v1 = (v & 14) == 0 ? (composer1.changed(textStyle0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x69A2BC9C, v1, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
            }
            TextStyle textStyle1 = ((TextStyle)composer1.consume(TextKt.a)).merge(textStyle0);
            CompositionLocalKt.CompositionLocalProvider(TextKt.a.provides(textStyle1), function20, composer1, v1 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vo(textStyle0, function20, v, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void Text--4IGK_g(AnnotatedString annotatedString0, Modifier modifier0, long v, long v1, FontStyle fontStyle0, FontWeight fontWeight0, FontFamily fontFamily0, long v2, TextDecoration textDecoration0, TextAlign textAlign0, long v3, int v4, boolean z, int v5, Map map0, Function1 function10, TextStyle textStyle0, Composer composer0, int v6, int v7, int v8) {
        TextStyle textStyle1;
        Function1 function11;
        Map map1;
        int v19;
        boolean z1;
        int v18;
        long v17;
        TextAlign textAlign1;
        TextDecoration textDecoration1;
        long v16;
        FontFamily fontFamily1;
        FontWeight fontWeight1;
        FontStyle fontStyle1;
        long v15;
        long v14;
        Modifier modifier1;
        long v26;
        int v25;
        TextStyle textStyle2;
        Function1 function12;
        Map map2;
        int v24;
        boolean z2;
        int v23;
        long v22;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long v21;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long v20;
        Modifier modifier2;
        int v13;
        int v11;
        int v9;
        Composer composer1 = composer0.startRestartGroup(0xE6D2CA6E);
        if((v8 & 1) == 0) {
            v9 = (v6 & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v6 : v6;
        }
        else {
            v9 = v6 | 6;
        }
        if((v8 & 2) != 0) {
            v9 |= 0x30;
        }
        else if((v6 & 0x70) == 0) {
            v9 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v8 & 4) != 0) {
            v9 |= 0x180;
        }
        else if((v6 & 0x380) == 0) {
            v9 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        int v10 = 0x400;
        if((v8 & 8) != 0) {
            v9 |= 0xC00;
        }
        else if((v6 & 0x1C00) == 0) {
            v9 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v8 & 16) != 0) {
            v9 |= 0x6000;
        }
        else if((v6 & 0xE000) == 0) {
            v9 |= (composer1.changed(fontStyle0) ? 0x4000 : 0x2000);
        }
        if((v8 & 0x20) != 0) {
            v9 |= 0x30000;
        }
        else if((v6 & 0x70000) == 0) {
            v9 |= (composer1.changed(fontWeight0) ? 0x20000 : 0x10000);
        }
        if((v8 & 0x40) != 0) {
            v9 |= 0x180000;
        }
        else if((v6 & 0x380000) == 0) {
            v9 |= (composer1.changed(fontFamily0) ? 0x100000 : 0x80000);
        }
        if((v8 & 0x80) != 0) {
            v9 |= 0xC00000;
        }
        else if((v6 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v8 & 0x100) != 0) {
            v9 |= 0x6000000;
        }
        else if((0xE000000 & v6) == 0) {
            v9 |= (composer1.changed(textDecoration0) ? 0x4000000 : 0x2000000);
        }
        if((v8 & 0x200) != 0) {
            v9 |= 0x30000000;
        }
        else if((v6 & 0x70000000) == 0) {
            v9 |= (composer1.changed(textAlign0) ? 0x20000000 : 0x10000000);
        }
        if((v8 & 0x400) == 0) {
            v11 = (v7 & 14) == 0 ? v7 | (composer1.changed(v3) ? 4 : 2) : v7;
        }
        else {
            v11 = v7 | 6;
        }
        if((v8 & 0x800) != 0) {
            v11 |= 0x30;
        }
        else if((v7 & 0x70) == 0) {
            v11 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        int v12 = v11;
        if((v8 & 0x1000) != 0) {
            v12 |= 0x180;
        }
        else if((v7 & 0x380) == 0) {
            v12 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v8 & 0x2000) != 0) {
            v12 |= 0xC00;
        }
        else if((v7 & 0x1C00) == 0) {
            if(composer1.changed(v5)) {
                v10 = 0x800;
            }
            v12 |= v10;
        }
        if((v8 & 0x4000) != 0) {
            v12 |= 0x2000;
        }
        if((v8 & 0x8000) != 0) {
            v12 |= 0x30000;
            v13 = v8 & 0x2000;
        }
        else if((v7 & 0x70000) == 0) {
            v13 = v8 & 0x2000;
            v12 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        else {
            v13 = v8 & 0x2000;
        }
        if((v7 & 0x380000) == 0) {
            v12 |= ((v8 & 0x10000) != 0 || !composer1.changed(textStyle0) ? 0x80000 : 0x100000);
        }
        if((v8 & 0x4000) != 0x4000 || (0x5B6DB6DB & v9) != 306783378 || (0x2DB6DB & v12) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v6 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v8 & 2) == 0 ? modifier0 : Modifier.Companion;
                TextAlign textAlign3 = null;
                fontStyle2 = (v8 & 16) == 0 ? fontStyle0 : null;
                fontWeight2 = (v8 & 0x20) == 0 ? fontWeight0 : null;
                if((v8 & 0x200) == 0) {
                    textAlign3 = textAlign0;
                }
                Map map3 = (v8 & 0x4000) == 0 ? map0 : x.emptyMap();
                Function1 function13 = (v8 & 0x8000) == 0 ? function10 : zb.w;
                if((v8 & 0x10000) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    v12 &= 0xFFC7FFFF;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.a);
                }
                v22 = (v8 & 0x400) == 0 ? v3 : 0x7FC00000L;
                v23 = (v8 & 0x800) == 0 ? v4 : 1;
                z2 = (v8 & 0x1000) == 0 ? z : true;
                v25 = v12;
                v24 = v13 == 0 ? v5 : 0x7FFFFFFF;
                map2 = map3;
                function12 = function13;
                fontFamily2 = (v8 & 0x40) == 0 ? fontFamily0 : null;
                v20 = (v8 & 4) == 0 ? v : 0L;
                v26 = (v8 & 8) == 0 ? v1 : 0x7FC00000L;
                textDecoration2 = (v8 & 0x100) == 0 ? textDecoration0 : null;
                textAlign2 = textAlign3;
                v21 = (v8 & 0x80) == 0 ? v2 : 0x7FC00000L;
            }
            else {
                composer1.skipToGroupEnd();
                if((v8 & 0x10000) != 0) {
                    v12 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                v20 = v;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                v21 = v2;
                textDecoration2 = textDecoration0;
                textAlign2 = textAlign0;
                v22 = v3;
                v23 = v4;
                z2 = z;
                v24 = v5;
                map2 = map0;
                function12 = function10;
                textStyle2 = textStyle0;
                v25 = v12;
                v26 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE6D2CA6E, v9, v25, "androidx.compose.material.Text (Text.kt:352)");
            }
            TextKt.Text-IbK3jfQ(annotatedString0, modifier2, v20, v26, fontStyle2, fontWeight2, fontFamily2, v21, textDecoration2, textAlign2, v22, v23, z2, v24, 1, map2, function12, textStyle2, composer1, v9 & 0x7FFFFFFE, 0x46000 | v25 & 14 | v25 & 0x70 | v25 & 0x380 | v25 & 0x1C00 | v25 << 3 & 0x380000 | v25 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textAlign1 = textAlign2;
            v18 = v23;
            z1 = z2;
            v19 = v24;
            map1 = map2;
            function11 = function12;
            textStyle1 = textStyle2;
            v16 = v21;
            fontFamily1 = fontFamily2;
            textDecoration1 = textDecoration2;
            v14 = v20;
            modifier1 = modifier2;
            v15 = v26;
            fontStyle1 = fontStyle2;
            fontWeight1 = fontWeight2;
            v17 = v22;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v14 = v;
            v15 = v1;
            fontStyle1 = fontStyle0;
            fontWeight1 = fontWeight0;
            fontFamily1 = fontFamily0;
            v16 = v2;
            textDecoration1 = textDecoration0;
            textAlign1 = textAlign0;
            v17 = v3;
            v18 = v4;
            z1 = z;
            v19 = v5;
            map1 = map0;
            function11 = function10;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cp(annotatedString0, modifier1, v14, v15, fontStyle1, fontWeight1, fontFamily1, v16, textDecoration1, textAlign1, v17, v18, z1, v19, map1, function11, textStyle1, v6, v7, v8, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Text--4IGK_g(@NotNull String s, @Nullable Modifier modifier0, long v, long v1, @Nullable FontStyle fontStyle0, @Nullable FontWeight fontWeight0, @Nullable FontFamily fontFamily0, long v2, @Nullable TextDecoration textDecoration0, @Nullable TextAlign textAlign0, long v3, int v4, boolean z, int v5, int v6, @Nullable Function1 function10, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v7, int v8, int v9) {
        TextStyle textStyle1;
        Function1 function11;
        int v22;
        int v21;
        boolean z1;
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
        long v33;
        int v31;
        TextStyle textStyle2;
        int v30;
        Function1 function12;
        int v29;
        int v28;
        boolean z2;
        int v27;
        long v26;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long v25;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long v24;
        long v23;
        Modifier modifier2;
        int v15;
        int v13;
        int v10;
        Composer composer1 = composer0.startRestartGroup(1028090691);
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
            if(composer1.changed(v5)) {
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
            if(composer1.changed(v6)) {
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
            v14 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v8 & 0x380000) == 0) {
            v14 |= ((v9 & 0x10000) != 0 || !composer1.changed(textStyle0) ? 0x80000 : 0x100000);
        }
        if((v10 & 0x5B6DB6DB) != 306783378 || (0x2DB6DB & v14) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v7 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v9 & 2) == 0 ? modifier0 : Modifier.Companion;
                v23 = (v9 & 4) == 0 ? v : 0L;
                v24 = (v9 & 8) == 0 ? v1 : 0x7FC00000L;
                function12 = null;
                fontStyle2 = (v9 & 16) == 0 ? fontStyle0 : null;
                fontWeight2 = (v9 & 0x20) == 0 ? fontWeight0 : null;
                fontFamily2 = (v9 & 0x40) == 0 ? fontFamily0 : null;
                v25 = (v9 & 0x80) == 0 ? v2 : 0x7FC00000L;
                textDecoration2 = (v9 & 0x100) == 0 ? textDecoration0 : null;
                textAlign2 = (v9 & 0x200) == 0 ? textAlign0 : null;
                v26 = (v9 & 0x400) == 0 ? v3 : 0x7FC00000L;
                v27 = (v9 & 0x800) == 0 ? v4 : 1;
                v29 = 1;
                z2 = (v9 & 0x1000) == 0 ? z : true;
                v28 = (v9 & 0x2000) == 0 ? v5 : 0x7FFFFFFF;
                if(v15 == 0) {
                    v29 = v6;
                }
                if((v9 & 0x8000) == 0) {
                    function12 = function10;
                }
                if((v9 & 0x10000) == 0) {
                    v30 = v14;
                    textStyle2 = textStyle0;
                }
                else {
                    v30 = v14 & 0xFFC7FFFF;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.a);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v9 & 0x10000) != 0) {
                    v14 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                v23 = v;
                v24 = v1;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                v25 = v2;
                textDecoration2 = textDecoration0;
                textAlign2 = textAlign0;
                v26 = v3;
                v27 = v4;
                z2 = z;
                v28 = v5;
                v29 = v6;
                function12 = function10;
                v30 = v14;
                textStyle2 = textStyle0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v31 = v28;
                ComposerKt.traceEventStart(1028090691, v10, v30, "androidx.compose.material.Text (Text.kt:110)");
            }
            else {
                v31 = v28;
            }
            long v32 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
            float f = ((Number)composer1.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            if(v23 == 0L) {
                v33 = 0L;
                v23 = textStyle2.getColor-0d7_KjU() == 0L ? Color.copy-wmQWz5c$default(v32, f, 0.0f, 0.0f, 0.0f, 14, null) : textStyle2.getColor-0d7_KjU();
            }
            else {
                v33 = v23;
            }
            TextStyle textStyle3 = TextStyle.merge-dA7vx0o$default(textStyle2, 0L, v24, fontWeight2, fontStyle2, null, fontFamily2, null, v25, null, null, null, 0L, textDecoration2, null, null, (textAlign2 == null ? 0x80000000 : textAlign2.unbox-impl()), 0, v26, null, null, 0, 0, null, null, 0xFD6F51, null);
            composer1.startReplaceableGroup(-1505838219);
            boolean z3 = composer1.changed(v23);
            wb wb0 = composer1.rememberedValue();
            if(z3 || wb0 == Composer.Companion.getEmpty()) {
                wb0 = new wb(v23, 0);
                composer1.updateRememberedValue(wb0);
            }
            composer1.endReplaceableGroup();
            BasicTextKt.BasicText-VhcvRP8(s, modifier2, textStyle3, function12, v27, z2, v31, v29, wb0, composer1, v10 & 0x70 | (0x8000000 | v10 & 14) | v30 >> 6 & 0x1C00 | v30 << 9 & 0xE000 | v30 << 9 & 0x70000 | v30 << 9 & 0x380000 | v30 << 9 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v21 = v31;
            textDecoration1 = textDecoration2;
            textAlign1 = textAlign2;
            modifier1 = modifier2;
            v20 = v27;
            fontStyle1 = fontStyle2;
            v17 = v24;
            v18 = v25;
            v22 = v29;
            z1 = z2;
            function11 = function12;
            fontFamily1 = fontFamily2;
            v19 = v26;
            v16 = v33;
            textStyle1 = textStyle2;
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
            z1 = z;
            v21 = v5;
            v22 = v6;
            function11 = function10;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wo(s, modifier1, v16, v17, fontStyle1, fontWeight1, fontFamily1, v18, textDecoration1, textAlign1, v19, v20, z1, v21, v22, function11, textStyle1, v7, v8, v9, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Text-IbK3jfQ(@NotNull AnnotatedString annotatedString0, @Nullable Modifier modifier0, long v, long v1, @Nullable FontStyle fontStyle0, @Nullable FontWeight fontWeight0, @Nullable FontFamily fontFamily0, long v2, @Nullable TextDecoration textDecoration0, @Nullable TextAlign textAlign0, long v3, int v4, boolean z, int v5, int v6, @Nullable Map map0, @Nullable Function1 function10, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v7, int v8, int v9) {
        TextStyle textStyle1;
        Function1 function11;
        Map map1;
        int v23;
        int v22;
        boolean z1;
        int v21;
        long v20;
        TextAlign textAlign1;
        TextDecoration textDecoration1;
        long v19;
        FontFamily fontFamily1;
        FontWeight fontWeight1;
        FontStyle fontStyle1;
        long v18;
        long v17;
        Modifier modifier1;
        long v34;
        int v33;
        Modifier modifier3;
        Map map3;
        TextStyle textStyle2;
        int v31;
        Function1 function12;
        Map map2;
        int v30;
        int v29;
        boolean z2;
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
        Composer composer1 = composer0.startRestartGroup(0x2C5A8491);
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
            if(composer1.changed(v5)) {
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
            if(composer1.changed(v6)) {
                v12 = 0x4000;
            }
            v14 |= v12;
        }
        else {
            v15 = v9 & 0x4000;
        }
        if((v9 & 0x8000) != 0) {
            v14 |= 0x10000;
        }
        if((v9 & 0x10000) != 0) {
            v14 |= 0x180000;
            v16 = v9 & 0x2000;
        }
        else if((v8 & 0x380000) == 0) {
            v16 = v9 & 0x2000;
            v14 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        else {
            v16 = v9 & 0x2000;
        }
        if((v8 & 0x1C00000) == 0) {
            v14 |= ((v9 & 0x20000) != 0 || !composer1.changed(textStyle0) ? 0x400000 : 0x800000);
        }
        if((v9 & 0x8000) != 0x8000 || (0x5B6DB6DB & v10) != 306783378 || (0x16DB6DB & v14) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v7 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v9 & 2) == 0 ? modifier0 : Modifier.Companion;
                v24 = (v9 & 4) == 0 ? v : 0L;
                v25 = (v9 & 8) == 0 ? v1 : 0x7FC00000L;
                textAlign2 = null;
                fontStyle2 = (v9 & 16) == 0 ? fontStyle0 : null;
                fontWeight2 = (v9 & 0x20) == 0 ? fontWeight0 : null;
                fontFamily2 = (v9 & 0x40) == 0 ? fontFamily0 : null;
                v26 = (v9 & 0x80) == 0 ? v2 : 0x7FC00000L;
                textDecoration2 = (v9 & 0x100) == 0 ? textDecoration0 : null;
                if((v9 & 0x200) == 0) {
                    textAlign2 = textAlign0;
                }
                v27 = (v9 & 0x400) == 0 ? v3 : 0x7FC00000L;
                v28 = (v9 & 0x800) == 0 ? v4 : 1;
                v30 = 1;
                z2 = (v9 & 0x1000) == 0 ? z : true;
                v29 = v16 == 0 ? v5 : 0x7FFFFFFF;
                if(v15 == 0) {
                    v30 = v6;
                }
                map2 = (v9 & 0x8000) == 0 ? map0 : x.emptyMap();
                function12 = (v9 & 0x10000) == 0 ? function10 : yb.w;
                if((v9 & 0x20000) == 0) {
                    v31 = v14;
                    textStyle2 = textStyle0;
                }
                else {
                    v31 = v14 & 0xFE3FFFFF;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.a);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v9 & 0x20000) != 0) {
                    v14 &= 0xFE3FFFFF;
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
                z2 = z;
                v29 = v5;
                v30 = v6;
                map2 = map0;
                function12 = function10;
                v31 = v14;
                textStyle2 = textStyle0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                map3 = map2;
                ComposerKt.traceEventStart(0x2C5A8491, v10, v31, "androidx.compose.material.Text (Text.kt:278)");
            }
            else {
                map3 = map2;
            }
            long v32 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
            float f = ((Number)composer1.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            if(v24 == 0L) {
                modifier3 = modifier2;
                v33 = v30;
                v34 = textStyle2.getColor-0d7_KjU() == 0L ? Color.copy-wmQWz5c$default(v32, f, 0.0f, 0.0f, 0.0f, 14, null) : textStyle2.getColor-0d7_KjU();
            }
            else {
                modifier3 = modifier2;
                v33 = v30;
                v34 = v24;
            }
            TextStyle textStyle3 = TextStyle.merge-dA7vx0o$default(textStyle2, 0L, v25, fontWeight2, fontStyle2, null, fontFamily2, null, v26, null, null, null, 0L, textDecoration2, null, null, (textAlign2 == null ? 0x80000000 : textAlign2.unbox-impl()), 0, v27, null, null, 0, 0, null, null, 0xFD6F51, null);
            composer1.startReplaceableGroup(-1505830585);
            boolean z3 = composer1.changed(v34);
            wb wb0 = composer1.rememberedValue();
            if(z3 || wb0 == Composer.Companion.getEmpty()) {
                wb0 = new wb(v34, 1);
                composer1.updateRememberedValue(wb0);
            }
            composer1.endReplaceableGroup();
            BasicTextKt.BasicText-RWo7tUw(annotatedString0, modifier3, textStyle3, function12, v28, z2, v29, v33, map3, wb0, composer1, v10 & 0x70 | (0x48000000 | v10 & 14) | v31 >> 9 & 0x1C00 | v31 << 9 & 0xE000 | 0x70000 & v31 << 9 | v31 << 9 & 0x380000 | v31 << 9 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            textAlign1 = textAlign2;
            fontStyle1 = fontStyle2;
            fontWeight1 = fontWeight2;
            v22 = v29;
            v18 = v25;
            v19 = v26;
            v23 = v33;
            textDecoration1 = textDecoration2;
            v20 = v27;
            modifier1 = modifier3;
            map1 = map3;
            function11 = function12;
            v21 = v28;
            v17 = v24;
            z1 = z2;
            fontFamily1 = fontFamily2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v17 = v;
            v18 = v1;
            fontStyle1 = fontStyle0;
            fontWeight1 = fontWeight0;
            fontFamily1 = fontFamily0;
            v19 = v2;
            textDecoration1 = textDecoration0;
            textAlign1 = textAlign0;
            v20 = v3;
            v21 = v4;
            z1 = z;
            v22 = v5;
            v23 = v6;
            map1 = map0;
            function11 = function10;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ap(annotatedString0, modifier1, v17, v18, fontStyle1, fontWeight1, fontFamily1, v19, textDecoration1, textAlign1, v20, v21, z1, v22, v23, map1, function11, textStyle1, v7, v8, v9, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void Text-fLXpl1I(String s, Modifier modifier0, long v, long v1, FontStyle fontStyle0, FontWeight fontWeight0, FontFamily fontFamily0, long v2, TextDecoration textDecoration0, TextAlign textAlign0, long v3, int v4, boolean z, int v5, Function1 function10, TextStyle textStyle0, Composer composer0, int v6, int v7, int v8) {
        TextStyle textStyle1;
        Function1 function11;
        int v20;
        boolean z1;
        int v19;
        long v18;
        TextAlign textAlign1;
        TextDecoration textDecoration1;
        long v17;
        FontFamily fontFamily1;
        FontWeight fontWeight1;
        FontStyle fontStyle1;
        long v16;
        long v15;
        Modifier modifier1;
        long v27;
        int v26;
        TextStyle textStyle2;
        Function1 function12;
        int v25;
        boolean z2;
        int v24;
        long v23;
        TextAlign textAlign2;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long v22;
        long v21;
        Modifier modifier2;
        int v14;
        int v12;
        int v9;
        Composer composer1 = composer0.startRestartGroup(0xEA2D58A0);
        if((v8 & 1) == 0) {
            v9 = (v6 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v6 : v6;
        }
        else {
            v9 = v6 | 6;
        }
        if((v8 & 2) != 0) {
            v9 |= 0x30;
        }
        else if((v6 & 0x70) == 0) {
            v9 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v8 & 4) != 0) {
            v9 |= 0x180;
        }
        else if((v6 & 0x380) == 0) {
            v9 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        int v10 = 0x400;
        if((v8 & 8) != 0) {
            v9 |= 0xC00;
        }
        else if((v6 & 0x1C00) == 0) {
            v9 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        int v11 = 0x2000;
        if((v8 & 16) != 0) {
            v9 |= 0x6000;
        }
        else if((v6 & 0xE000) == 0) {
            v9 |= (composer1.changed(fontStyle0) ? 0x4000 : 0x2000);
        }
        if((v8 & 0x20) != 0) {
            v9 |= 0x30000;
        }
        else if((v6 & 0x70000) == 0) {
            v9 |= (composer1.changed(fontWeight0) ? 0x20000 : 0x10000);
        }
        if((v8 & 0x40) != 0) {
            v9 |= 0x180000;
        }
        else if((v6 & 0x380000) == 0) {
            v9 |= (composer1.changed(fontFamily0) ? 0x100000 : 0x80000);
        }
        if((v8 & 0x80) != 0) {
            v9 |= 0xC00000;
        }
        else if((v6 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v8 & 0x100) != 0) {
            v9 |= 0x6000000;
        }
        else if((0xE000000 & v6) == 0) {
            v9 |= (composer1.changed(textDecoration0) ? 0x4000000 : 0x2000000);
        }
        if((v8 & 0x200) != 0) {
            v9 |= 0x30000000;
        }
        else if((v6 & 0x70000000) == 0) {
            v9 |= (composer1.changed(textAlign0) ? 0x20000000 : 0x10000000);
        }
        if((v8 & 0x400) == 0) {
            v12 = (v7 & 14) == 0 ? v7 | (composer1.changed(v3) ? 4 : 2) : v7;
        }
        else {
            v12 = v7 | 6;
        }
        if((v8 & 0x800) != 0) {
            v12 |= 0x30;
        }
        else if((v7 & 0x70) == 0) {
            v12 |= (composer1.changed(v4) ? 0x20 : 16);
        }
        int v13 = v12;
        if((v8 & 0x1000) != 0) {
            v13 |= 0x180;
        }
        else if((v7 & 0x380) == 0) {
            v13 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v8 & 0x2000) != 0) {
            v13 |= 0xC00;
        }
        else if((v7 & 0x1C00) == 0) {
            if(composer1.changed(v5)) {
                v10 = 0x800;
            }
            v13 |= v10;
        }
        if((v8 & 0x4000) != 0) {
            v13 |= 0x6000;
            v14 = v8 & 0x4000;
        }
        else if((v7 & 0xE000) == 0) {
            v14 = v8 & 0x4000;
            if(composer1.changedInstance(function10)) {
                v11 = 0x4000;
            }
            v13 |= v11;
        }
        else {
            v14 = v8 & 0x4000;
        }
        if((v7 & 0x70000) == 0) {
            v13 |= ((v8 & 0x8000) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v9 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v13) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v6 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v8 & 2) == 0 ? modifier0 : Modifier.Companion;
                v21 = (v8 & 4) == 0 ? v : 0L;
                textAlign2 = (v8 & 0x200) == 0 ? textAlign0 : null;
                Function1 function13 = v14 == 0 ? function10 : xb.w;
                if((v8 & 0x8000) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    v13 &= 0xFFF8FFFF;
                    textStyle2 = (TextStyle)composer1.consume(TextKt.a);
                }
                v23 = (v8 & 0x400) == 0 ? v3 : 0x7FC00000L;
                v24 = (v8 & 0x800) == 0 ? v4 : 1;
                z2 = (v8 & 0x1000) == 0 ? z : true;
                v26 = v13;
                v25 = (v8 & 0x2000) == 0 ? v5 : 0x7FFFFFFF;
                function12 = function13;
                v22 = (v8 & 8) == 0 ? v1 : 0x7FC00000L;
                fontStyle2 = (v8 & 16) == 0 ? fontStyle0 : null;
                fontWeight2 = (v8 & 0x20) == 0 ? fontWeight0 : null;
                fontFamily2 = (v8 & 0x40) == 0 ? fontFamily0 : null;
                v27 = (v8 & 0x80) == 0 ? v2 : 0x7FC00000L;
                textDecoration1 = (v8 & 0x100) == 0 ? textDecoration0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v8 & 0x8000) != 0) {
                    v13 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                v21 = v;
                v22 = v1;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                textDecoration1 = textDecoration0;
                textAlign2 = textAlign0;
                v23 = v3;
                v24 = v4;
                z2 = z;
                v25 = v5;
                function12 = function10;
                textStyle2 = textStyle0;
                v26 = v13;
                v27 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEA2D58A0, v9, v26, "androidx.compose.material.Text (Text.kt:182)");
            }
            TextKt.Text--4IGK_g(s, modifier2, v21, v22, fontStyle2, fontWeight2, fontFamily2, v27, textDecoration1, textAlign2, v23, v24, z2, v25, 1, function12, textStyle2, composer1, v9 & 0x7FFFFFFE, v26 & 14 | 0x6000 | v26 & 0x70 | v26 & 0x380 | v26 & 0x1C00 | v26 << 3 & 0x70000 | v26 << 3 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textAlign1 = textAlign2;
            v18 = v23;
            v19 = v24;
            z1 = z2;
            v20 = v25;
            function11 = function12;
            textStyle1 = textStyle2;
            fontStyle1 = fontStyle2;
            fontWeight1 = fontWeight2;
            fontFamily1 = fontFamily2;
            modifier1 = modifier2;
            v16 = v22;
            v15 = v21;
            v17 = v27;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v15 = v;
            v16 = v1;
            fontStyle1 = fontStyle0;
            fontWeight1 = fontWeight0;
            fontFamily1 = fontFamily0;
            v17 = v2;
            textDecoration1 = textDecoration0;
            textAlign1 = textAlign0;
            v18 = v3;
            v19 = v4;
            z1 = z;
            v20 = v5;
            function11 = function10;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new yo(s, modifier1, v15, v16, fontStyle1, fontWeight1, fontFamily1, v17, textDecoration1, textAlign1, v18, v19, z1, v20, function11, textStyle1, v6, v7, v8, 1));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTextStyle() {
        return TextKt.a;
    }
}

