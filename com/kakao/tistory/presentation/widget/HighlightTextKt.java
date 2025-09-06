package com.kakao.tistory.presentation.widget;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A¼\u0001\u0010 \u001A\u00020\u001D2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001F\"\u001F\u0010&\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "Landroidx/compose/ui/text/TextStyle;", "style", "highlightTargetQuery", "", "HighlightText-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILandroidx/compose/ui/text/TextStyle;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "HighlightText", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalHighlightTargetQuery", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalHighlightTargetQuery", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHighlightText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighlightText.kt\ncom/kakao/tistory/presentation/widget/HighlightTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n77#2:102\n77#2:103\n1240#3:104\n1039#3,6:107\n1864#4,2:105\n1866#4:113\n*S KotlinDebug\n*F\n+ 1 HighlightText.kt\ncom/kakao/tistory/presentation/widget/HighlightTextKt\n*L\n36#1:102\n37#1:103\n75#1:104\n79#1:107,6\n76#1:105,2\n76#1:113\n*E\n"})
public final class HighlightTextKt {
    public static final ProvidableCompositionLocal a;

    static {
        HighlightTextKt.a = CompositionLocalKt.compositionLocalOf$default(null, u.a, 1, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HighlightText-fLXpl1I(@NotNull String s, @Nullable Modifier modifier0, long v, long v1, @Nullable FontStyle fontStyle0, @Nullable FontWeight fontWeight0, @Nullable FontFamily fontFamily0, long v2, @Nullable TextDecoration textDecoration0, @Nullable TextAlign textAlign0, long v3, int v4, boolean z, int v5, @Nullable TextStyle textStyle0, @Nullable String s1, @Nullable Composer composer0, int v6, int v7, int v8) {
        Modifier modifier1;
        String s2;
        TextStyle textStyle1;
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
        AnnotatedString annotatedString0;
        FontWeight fontWeight3;
        TextAlign textAlign4;
        TextDecoration textDecoration2;
        int v25;
        String s3;
        TextStyle textStyle2;
        int v24;
        boolean z2;
        int v23;
        TextAlign textAlign2;
        long v22;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long v21;
        long v20;
        Modifier modifier2;
        TextStyle textStyle3;
        int v12;
        int v9;
        Intrinsics.checkNotNullParameter(s, "text");
        Composer composer1 = composer0.startRestartGroup(0x7EB381C2);
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
        if((v7 & 0xE000) == 0) {
            if((v8 & 0x4000) == 0 && composer1.changed(textStyle0)) {
                v11 = 0x4000;
            }
            v13 |= v11;
        }
        if((v7 & 0x70000) == 0) {
            v13 |= ((v8 & 0x8000) != 0 || !composer1.changed(s1) ? 0x10000 : 0x20000);
        }
        if((v9 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v13) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v6 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v8 & 2) == 0 ? modifier0 : Modifier.Companion;
                TextAlign textAlign3 = null;
                fontStyle2 = (v8 & 16) == 0 ? fontStyle0 : null;
                if((v8 & 0x200) == 0) {
                    textAlign3 = textAlign0;
                }
                if((v8 & 0x4000) == 0) {
                    textStyle3 = textStyle0;
                }
                else {
                    textStyle3 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v13 &= 0xFFFF1FFF;
                }
                if((v8 & 0x8000) == 0) {
                    s3 = s1;
                }
                else {
                    v13 &= 0xFFF8FFFF;
                    s3 = (String)composer1.consume(HighlightTextKt.a);
                }
                v17 = (v8 & 0x400) == 0 ? v3 : 0x7FC00000L;
                v23 = (v8 & 0x800) == 0 ? v4 : 1;
                z2 = (v8 & 0x1000) == 0 ? z : true;
                v25 = v13;
                v24 = (v8 & 0x2000) == 0 ? v5 : 0x7FFFFFFF;
                textStyle2 = textStyle3;
                v20 = (v8 & 4) == 0 ? v : 0L;
                fontWeight2 = (v8 & 0x20) == 0 ? fontWeight0 : null;
                fontFamily2 = (v8 & 0x40) == 0 ? fontFamily0 : null;
                v22 = (v8 & 0x80) == 0 ? v2 : 0x7FC00000L;
                textDecoration2 = (v8 & 0x100) == 0 ? textDecoration0 : null;
                textAlign2 = textAlign3;
                v21 = (v8 & 8) == 0 ? v1 : 0x7FC00000L;
            }
            else {
                composer1.skipToGroupEnd();
                if((v8 & 0x4000) != 0) {
                    v13 &= 0xFFFF1FFF;
                }
                if((v8 & 0x8000) != 0) {
                    v13 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                v20 = v;
                v21 = v1;
                fontStyle2 = fontStyle0;
                fontWeight2 = fontWeight0;
                fontFamily2 = fontFamily0;
                v22 = v2;
                textAlign2 = textAlign0;
                v17 = v3;
                v23 = v4;
                z2 = z;
                v24 = v5;
                textStyle2 = textStyle0;
                s3 = s1;
                v25 = v13;
                textDecoration2 = textDecoration0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                textAlign4 = textAlign2;
                ComposerKt.traceEventStart(0x7EB381C2, v9, v25, "com.kakao.tistory.presentation.widget.HighlightText (HighlightText.kt:37)");
            }
            else {
                textAlign4 = textAlign2;
            }
            if(s3 != null && !p.isBlank(s3)) {
                if(fontWeight2 == null) {
                    fontWeight3 = textStyle2.getFontWeight();
                    if(fontWeight3 == null) {
                        fontWeight3 = FontWeight.Companion.getNormal();
                    }
                }
                else {
                    fontWeight3 = fontWeight2;
                }
                annotatedString0 = HighlightTextKt.a(s3, s, fontWeight3);
            }
            else {
                annotatedString0 = new AnnotatedString(s, null, null, 6, null);
            }
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, modifier2, v20, v21, fontStyle2, fontWeight2, fontFamily2, v22, textDecoration2, textAlign4, v17, v23, z2, false, v24, 0, null, null, textStyle2, composer1, v9 & 0x7FFFFFF0, v25 & 14 | 0xC00 | v25 & 0x70 | v25 & 0x380 | v25 << 3 & 0xE000 | v25 << 12 & 0xE000000, 0x38000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v14 = v20;
            v15 = v21;
            fontStyle1 = fontStyle2;
            v16 = v22;
            s2 = s3;
            v18 = v23;
            z1 = z2;
            v19 = v24;
            textStyle1 = textStyle2;
            textAlign1 = textAlign4;
            textDecoration1 = textDecoration2;
            fontFamily1 = fontFamily2;
            fontWeight1 = fontWeight2;
        }
        else {
            composer1.skipToGroupEnd();
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
            textStyle1 = textStyle0;
            s2 = s1;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(s, modifier1, v14, v15, fontStyle1, fontWeight1, fontFamily1, v16, textDecoration1, textAlign1, v17, v18, z1, v19, textStyle1, s2, v6, v7, v8));
        }
    }

    public static final AnnotatedString a(String s, String s1, FontWeight fontWeight0) {
        FontWeight fontWeight1 = new FontWeight(fontWeight0.getWeight() + 300);
        Regex regex0 = new Regex("\\Q" + s + "\\E", RegexOption.IGNORE_CASE);
        int v = 0;
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = regex0.split(s1, 0).iterator();
        Iterator iterator1 = SequencesKt___SequencesKt.map(Regex.findAll$default(regex0, s1, 0, 2, null), v.a).iterator();
        while(iterator0.hasNext() || iterator1.hasNext()) {
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                arrayList0.add(object0);
            }
            if(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                arrayList0.add(object1);
            }
        }
        for(Object object2: arrayList0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(v % 2 == 0) {
                annotatedString$Builder0.append(((String)object2));
            }
            else {
                int v1 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, fontWeight1, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
                try {
                    annotatedString$Builder0.append(StringExtensionKt.getStringExcludeBold(((String)object2)));
                }
                finally {
                    annotatedString$Builder0.pop(v1);
                }
            }
            ++v;
        }
        return annotatedString$Builder0.toAnnotatedString();
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalHighlightTargetQuery() {
        return HighlightTextKt.a;
    }
}

