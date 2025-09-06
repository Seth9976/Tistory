package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001A\u0095\u0001\u0010\u001A\u001A\u00020\u00162\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001A\u0089\u0001\u0010\u001E\u001A\u00020\u00162\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxLines", "", "text", "", "links", "Landroidx/compose/ui/graphics/Color;", "linkColor", "Landroidx/compose/ui/text/font/FontWeight;", "linkWeight", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "tag", "", "onClick", "MultiLinkableText-WxCAl_A", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILjava/lang/String;Ljava/util/Map;JLandroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MultiLinkableText", "link", "LinkableText-WxCAl_A", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILjava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinkableText", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLinkableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkableText.kt\ncom/kakao/tistory/presentation/widget/common/LinkableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n1223#2,6:120\n1223#2,6:129\n1240#3:126\n215#4,2:127\n*S KotlinDebug\n*F\n+ 1 LinkableText.kt\ncom/kakao/tistory/presentation/widget/common/LinkableTextKt\n*L\n29#1:120,6\n111#1:129,6\n66#1:126\n69#1:127,2\n*E\n"})
public final class LinkableTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LinkableText-WxCAl_A(@Nullable Modifier modifier0, @Nullable TextStyle textStyle0, boolean z, int v, int v1, @NotNull String s, @NotNull String s1, long v2, @Nullable FontWeight fontWeight0, @NotNull Function1 function10, @Nullable Composer composer0, int v3, int v4) {
        FontWeight fontWeight1;
        boolean z1;
        TextStyle textStyle1;
        int v7;
        int v6;
        Modifier modifier1;
        int v5;
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(s1, "link");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x241B0BBB);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v5 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            v5 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v5 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.changed(s1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((0x1C00000 & v3) == 0) {
            v5 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((0xE000000 & v3) == 0) {
            v5 |= (composer1.changed(fontWeight0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((0x70000000 & v3) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v5) != 306783378 || !composer1.getSkipping()) {
            Modifier modifier2 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
            TextStyle textStyle2 = (v4 & 2) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            boolean z2 = (v4 & 4) == 0 ? z : true;
            int v8 = (v4 & 8) == 0 ? v : 1;
            int v9 = (v4 & 16) == 0 ? v1 : 0x7FFFFFFF;
            FontWeight fontWeight2 = (v4 & 0x100) == 0 ? fontWeight0 : FontWeight.Companion.getNormal();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x241B0BBB, v5, -1, "com.kakao.tistory.presentation.widget.common.LinkableText (LinkableText.kt:44)");
            }
            LinkableTextKt.MultiLinkableText-WxCAl_A(modifier2, textStyle2, z2, v8, v9, s, w.mapOf(TuplesKt.to("link", s1)), v2, fontWeight2, function10, composer1, v5 & 0x7FC7FFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v7 = v9;
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            z1 = z2;
            v6 = v8;
            fontWeight1 = fontWeight2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v;
            v7 = v1;
            textStyle1 = textStyle0;
            z1 = z;
            fontWeight1 = fontWeight0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m1(modifier1, textStyle1, z1, v6, v7, s, s1, v2, fontWeight1, function10, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MultiLinkableText-WxCAl_A(@Nullable Modifier modifier0, @Nullable TextStyle textStyle0, boolean z, int v, int v1, @NotNull String s, @NotNull Map map0, long v2, @Nullable FontWeight fontWeight0, @NotNull Function1 function10, @Nullable Composer composer0, int v3, int v4) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(map0, "links");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x2D6F4537);
        Modifier modifier1 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
        TextStyle textStyle1 = (v4 & 2) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
        boolean z1 = (v4 & 4) == 0 ? z : true;
        int v5 = (v4 & 8) == 0 ? v : 1;
        int v6 = (v4 & 16) == 0 ? v1 : 0x7FFFFFFF;
        FontWeight fontWeight1 = (v4 & 0x100) == 0 ? fontWeight0 : FontWeight.Companion.getNormal();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2D6F4537, v3, -1, "com.kakao.tistory.presentation.widget.common.MultiLinkableText (LinkableText.kt:27)");
        }
        composer1.startReplaceGroup(0x3804927D);
        boolean z2 = (v3 & 0x70000 ^ 0x30000) > 0x20000 && composer1.changed(s) || (v3 & 0x30000) == 0x20000;
        boolean z3 = composer1.changed(map0);
        AnnotatedString annotatedString0 = composer1.rememberedValue();
        if(z2 || z3 || annotatedString0 == Composer.Companion.getEmpty()) {
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(s);
            for(Object object0: map0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                String s1 = (String)object2;
                String s2 = (String)object1;
                int v7 = StringsKt__StringsKt.indexOf$default(s, ((String)object2), 0, false, 6, null);
                if(v7 != -1) {
                    int v8 = s1.length() + v7;
                    annotatedString$Builder0.addStringAnnotation(s2, s1, v7, v8);
                    annotatedString$Builder0.addStyle(new SpanStyle(v2, 0L, fontWeight1, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFA, null), v7, v8);
                }
            }
            annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.updateRememberedValue(annotatedString0);
        }
        composer1.endReplaceGroup();
        LinkableTextKt.a(modifier1, annotatedString0, textStyle1, z1, v5, v6, function10, composer1, v3 & 14 | v3 << 3 & 0x380 | v3 << 3 & 0x1C00 | 0xE000 & v3 << 3 | v3 << 3 & 0x70000 | v3 >> 9 & 0x380000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n1(modifier1, textStyle1, z1, v5, v6, s, map0, v2, fontWeight1, function10, v3, v4));
        }
    }

    public static final void a(Modifier modifier0, AnnotatedString annotatedString0, TextStyle textStyle0, boolean z, int v, int v1, Function1 function10, Composer composer0, int v2, int v3) {
        int v7;
        int v6;
        boolean z1;
        TextStyle textStyle1;
        Modifier modifier1;
        int v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1523002004);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(annotatedString0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            v5 = v;
        }
        else if((v2 & 0xE000) == 0) {
            v5 = v;
            v4 |= (composer1.changed(v5) ? 0x4000 : 0x2000);
        }
        else {
            v5 = v;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            TextStyle textStyle2 = (v3 & 4) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            int v8 = 1;
            boolean z2 = (v3 & 8) == 0 ? z : true;
            if((v3 & 16) != 0) {
                v5 = 1;
            }
            int v9 = (v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1523002004, v4, -1, "com.kakao.tistory.presentation.widget.common.ClickableLinkText (LinkableText.kt:102)");
            }
            composer1.startReplaceGroup(0x9323C051);
            if((v4 & 0x380000) != 0x100000) {
                v8 = 0;
            }
            k1 k10 = composer1.rememberedValue();
            if((v8 | ((v4 & 0x70) == 0x20 ? 1 : 0)) != 0 || k10 == Composer.Companion.getEmpty()) {
                k10 = new k1(annotatedString0, function10);
                composer1.updateRememberedValue(k10);
            }
            composer1.endReplaceGroup();
            ClickableTextKt.ClickableText-4YKlhWE(annotatedString0, modifier2, textStyle2, z2, v5, v9, null, k10, composer1, v4 >> 3 & 14 | v4 << 3 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | v4 & 0x70000, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v7 = v5;
            v6 = v9;
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            z1 = z;
            v6 = v1;
            v7 = v5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(modifier1, annotatedString0, textStyle1, z1, v7, v6, function10, v2, v3));
        }
    }
}

