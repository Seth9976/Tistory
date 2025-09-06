package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.material3.gf;
import androidx.compose.material3.yk;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import j0.d2;
import j0.k0;
import j0.l0;
import j0.m0;
import j0.n0;
import j0.o0;
import j0.o;
import j0.p0;
import j0.q0;
import j0.r0;
import j0.s0;
import j0.t0;
import j0.u0;
import j0.v0;
import j0.w0;
import j0.x0;
import j0.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000B\u001Az\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\u0090\u0001\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001Ad\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001Az\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001An\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010 \u001A\u0084\u0001\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010!\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#\u00B2\u0006\u000E\u0010\"\u001A\u00020\u00168\n@\nX\u008A\u008E\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "BasicText-VhcvRP8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "displayedText", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,606:1\n77#2:607\n77#2:608\n77#2:621\n77#2:622\n77#2:653\n77#2:654\n77#2:667\n77#2:704\n1223#3,6:609\n1223#3,6:615\n1223#3,6:655\n1223#3,6:661\n1223#3,6:698\n1223#3,6:705\n1223#3,6:723\n1223#3,6:729\n1223#3,6:735\n1223#3,6:741\n1223#3,6:747\n1223#3,6:753\n1223#3,6:759\n1223#3,6:765\n1223#3,6:771\n124#4,6:623\n131#4,5:638\n136#4:649\n138#4:652\n124#4,6:668\n131#4,5:683\n136#4:694\n138#4:697\n78#4,6:777\n85#4,4:792\n89#4,2:802\n93#4:807\n289#5,9:629\n298#5,2:650\n289#5,9:674\n298#5,2:695\n368#5,9:783\n377#5,3:804\n4032#6,6:643\n4032#6,6:688\n4032#6,6:796\n298#7,3:711\n69#7,4:714\n301#7:718\n302#7:720\n74#7:721\n303#7:722\n1#8:719\n81#9:808\n107#9,2:809\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n102#1:607\n104#1:608\n131#1:621\n144#1:622\n197#1:653\n199#1:654\n230#1:667\n255#1:704\n106#1:609,6\n109#1:615,6\n201#1:655,6\n204#1:661,6\n242#1:698,6\n258#1:705,6\n540#1:723,6\n546#1:729,6\n549#1:735,6\n559#1:741,6\n563#1:747,6\n579#1:753,6\n596#1:759,6\n600#1:765,6\n601#1:771,6\n152#1:623,6\n152#1:638,5\n152#1:649\n152#1:652\n218#1:668,6\n218#1:683,5\n218#1:694\n218#1:697\n566#1:777,6\n566#1:792,4\n566#1:802,2\n566#1:807\n152#1:629,9\n152#1:650,2\n218#1:674,9\n218#1:695,2\n566#1:783,9\n566#1:804,3\n152#1:643,6\n218#1:688,6\n566#1:796,6\n449#1:711,3\n449#1:714,4\n449#1:718\n449#1:720\n449#1:721\n449#1:722\n449#1:719\n242#1:808\n242#1:809,2\n*E\n"})
public final class BasicTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void BasicText-4YKlhWE(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, Map map0, Composer composer0, int v2, int v3) {
        int v6;
        boolean z1;
        int v5;
        Function1 function11;
        TextStyle textStyle2;
        Map map1;
        Modifier modifier1;
        TextStyle textStyle1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xD9570F18);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            textStyle1 = textStyle0;
        }
        else if((v2 & 0x180) == 0) {
            textStyle1 = textStyle0;
            v4 |= (composer1.changed(textStyle1) ? 0x100 : 0x80);
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v4 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(map0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            modifier1 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
            if((v3 & 4) != 0) {
                textStyle1 = TextStyle.Companion.getDefault();
            }
            function11 = (v3 & 8) == 0 ? function10 : null;
            v5 = (v3 & 16) == 0 ? v : 1;
            z1 = (v3 & 0x20) == 0 ? z : true;
            int v7 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            Map map2 = (v3 & 0x80) == 0 ? map0 : x.emptyMap();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD9570F18, v4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:302)");
            }
            BasicTextKt.BasicText-RWo7tUw(annotatedString0, modifier1, textStyle1, function11, v5, z1, v7, 1, map2, null, composer1, v4 & 14 | 0xC00000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | 0x70000 & v4 | 0x380000 & v4 | v4 << 3 & 0xE000000, 0x200);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle1;
            v6 = v7;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            map1 = map0;
            textStyle2 = textStyle1;
            function11 = function10;
            v5 = v;
            z1 = z;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(annotatedString0, modifier1, textStyle2, function11, v5, z1, v6, map1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public static final void BasicText-4YKlhWE(String s, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, Composer composer0, int v3, int v4) {
        int v8;
        boolean z1;
        int v7;
        Function1 function11;
        TextStyle textStyle2;
        int v6;
        Modifier modifier1;
        TextStyle textStyle1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x5BF3FBC9);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            textStyle1 = textStyle0;
        }
        else if((v3 & 0x180) == 0) {
            textStyle1 = textStyle0;
            v5 |= (composer1.changed(textStyle1) ? 0x100 : 0x80);
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
            if((v4 & 4) != 0) {
                textStyle1 = TextStyle.Companion.getDefault();
            }
            function11 = (v4 & 8) == 0 ? function10 : null;
            v7 = (v4 & 16) == 0 ? v : 1;
            int v9 = 1;
            boolean z2 = (v4 & 0x20) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            if((v4 & 0x80) == 0) {
                v9 = v2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5BF3FBC9, v5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:327)");
            }
            BasicTextKt.BasicText-VhcvRP8(s, modifier1, textStyle1, function11, v7, z2, v10, v9, null, composer1, v5 & 0x1FFFFFE, 0x100);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle1;
            v8 = v10;
            v6 = v9;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v2;
            textStyle2 = textStyle1;
            function11 = function10;
            v7 = v;
            z1 = z;
            v8 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p0(s, modifier1, textStyle2, function11, v7, z1, v8, v6, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void BasicText-BpD7jsM(String s, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, Composer composer0, int v2, int v3) {
        int v6;
        boolean z1;
        int v5;
        Function1 function11;
        TextStyle textStyle2;
        Modifier modifier1;
        TextStyle textStyle1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x3CF10926);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            textStyle1 = textStyle0;
        }
        else if((v2 & 0x180) == 0) {
            textStyle1 = textStyle0;
            v4 |= (composer1.changed(textStyle1) ? 0x100 : 0x80);
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v4 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
            if((v3 & 4) != 0) {
                textStyle1 = TextStyle.Companion.getDefault();
            }
            Function1 function12 = (v3 & 8) == 0 ? function10 : null;
            int v7 = (v3 & 16) == 0 ? v : 1;
            boolean z2 = (v3 & 0x20) == 0 ? z : true;
            int v8 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CF10926, v4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:278)");
            }
            BasicTextKt.BasicText-VhcvRP8(s, modifier2, textStyle1, function12, v7, z2, v8, 1, null, composer1, v4 & 14 | 0xC00000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | 0x70000 & v4 | v4 & 0x380000, 0x100);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle1;
            v6 = v8;
            z1 = z2;
            v5 = v7;
            function11 = function12;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle2 = textStyle1;
            function11 = function10;
            v5 = v;
            z1 = z;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(s, modifier1, textStyle2, function11, v5, z1, v6, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BasicText-RWo7tUw(@NotNull AnnotatedString annotatedString0, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, @Nullable Function1 function10, int v, boolean z, int v1, int v2, @Nullable Map map0, @Nullable ColorProducer colorProducer0, @Nullable Composer composer0, int v3, int v4) {
        Map map1;
        int v8;
        Function1 function11;
        ColorProducer colorProducer1;
        int v7;
        int v6;
        boolean z1;
        TextStyle textStyle1;
        Modifier modifier1;
        int v15;
        int v14;
        SelectionController selectionController1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xC08FFDC4);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v5 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(map0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v5 |= (composer1.changedInstance(colorProducer0) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 306783379) != 306783378 || !composer1.getSkipping()) {
            modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
            TextStyle textStyle2 = (v4 & 4) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            Function1 function12 = (v4 & 8) == 0 ? function10 : null;
            int v9 = (v4 & 16) == 0 ? v : 1;
            boolean z2 = true;
            boolean z3 = (v4 & 0x20) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            int v11 = (v4 & 0x80) == 0 ? v2 : 1;
            Map map2 = (v4 & 0x100) == 0 ? map0 : x.emptyMap();
            ColorProducer colorProducer2 = (v4 & 0x200) == 0 ? colorProducer0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC08FFDC4, v5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(v11, v10);
            SelectionRegistrar selectionRegistrar0 = (SelectionRegistrar)composer1.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
            if(selectionRegistrar0 == null) {
                composer1.startReplaceGroup(0xA18EF1BA);
                composer1.endReplaceGroup();
                selectionController1 = null;
            }
            else {
                composer1.startReplaceGroup(0xA187127C);
                long v12 = ((TextSelectionColors)composer1.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU();
                Object[] arr_object = {selectionRegistrar0};
                Saver saver0 = SaverKt.Saver(new b1(selectionRegistrar0, 11), o.z);
                boolean z4 = composer1.changedInstance(selectionRegistrar0);
                q0 q00 = composer1.rememberedValue();
                if(z4 || q00 == Composer.Companion.getEmpty()) {
                    q00 = new q0(selectionRegistrar0, 1);
                    composer1.updateRememberedValue(q00);
                }
                long v13 = ((Number)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, q00, composer1, 0, 4)).longValue();
                boolean z5 = composer1.changed(v13);
                boolean z6 = composer1.changed(selectionRegistrar0);
                boolean z7 = composer1.changed(v12);
                SelectionController selectionController0 = composer1.rememberedValue();
                if((z5 | z6 | z7) != 0 || selectionController0 == Composer.Companion.getEmpty()) {
                    selectionController0 = new SelectionController(v13, selectionRegistrar0, v12, null, 8, null);
                    composer1.updateRememberedValue(selectionController0);
                }
                composer1.endReplaceGroup();
                selectionController1 = selectionController0;
            }
            boolean z8 = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString0);
            if(z8 || TextAnnotatedStringNodeKt.hasLinks(annotatedString0)) {
                v14 = v11;
                v15 = v10;
                composer1.startReplaceGroup(0xA19F5B70);
                if((v5 & 14) != 4) {
                    z2 = false;
                }
                MutableState mutableState0 = composer1.rememberedValue();
                if(z2 || mutableState0 == Composer.Companion.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(annotatedString0, null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                Object object0 = mutableState0.getValue();
                Object object1 = composer1.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                boolean z9 = composer1.changed(mutableState0);
                l0 l00 = composer1.rememberedValue();
                if(z9 || l00 == Composer.Companion.getEmpty()) {
                    l00 = new l0(mutableState0);
                    composer1.updateRememberedValue(l00);
                }
                BasicTextKt.a(modifier1, ((AnnotatedString)object0), function12, z8, map2, textStyle2, v9, z3, v15, v14, ((Resolver)object1), selectionController1, colorProducer2, l00, composer1, v5 >> 3 & 910 | v5 >> 12 & 0xE000 | v5 << 9 & 0x70000 | 0x380000 & v5 << 6 | 0x1C00000 & v5 << 6 | 0xE000000 & v5 << 6 | v5 << 6 & 0x70000000, v5 >> 21 & 0x380, 0);
            }
            else {
                composer1.startReplaceGroup(0xA19195CB);
                v14 = v11;
                v15 = v10;
                Modifier modifier2 = BasicTextKt.b(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFF, null), annotatedString0, textStyle2, function12, v9, z3, v10, v11, ((Resolver)composer1.consume(CompositionLocalsKt.getLocalFontFamilyResolver())), null, null, selectionController1, colorProducer2, null);
                d2 d20 = (d2 this, /* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, d2.b, 4, null);
                int v16 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function00);
                }
                else {
                    composer1.useNode();
                }
                Updater.set-impl(composer1, d20, composeUiNode$Companion0.getSetMeasurePolicy());
                Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
                Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v16)) {
                    a.t(v16, composer1, v16, function20);
                }
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v7 = v14;
            v6 = v15;
            textStyle1 = textStyle2;
            function11 = function12;
            v8 = v9;
            z1 = z3;
            map1 = map2;
            colorProducer1 = colorProducer2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            z1 = z;
            v6 = v1;
            v7 = v2;
            colorProducer1 = colorProducer0;
            function11 = function10;
            v8 = v;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(annotatedString0, modifier1, textStyle1, function11, v8, z1, v6, v7, map1, colorProducer1, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public static final void BasicText-VhcvRP8(AnnotatedString annotatedString0, Modifier modifier0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, Map map0, Composer composer0, int v3, int v4) {
        Map map1;
        boolean z1;
        int v8;
        Function1 function11;
        int v7;
        int v6;
        TextStyle textStyle1;
        Modifier modifier1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x32BF773B);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(map0) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
            TextStyle textStyle2 = (v4 & 4) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            Function1 function12 = (v4 & 8) == 0 ? function10 : null;
            int v9 = (v4 & 16) == 0 ? v : 1;
            v7 = 1;
            boolean z2 = (v4 & 0x20) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            if((v4 & 0x80) == 0) {
                v7 = v2;
            }
            Map map2 = (v4 & 0x100) == 0 ? map0 : x.emptyMap();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x32BF773B, v5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:341)");
            }
            BasicTextKt.BasicText-RWo7tUw(annotatedString0, modifier2, textStyle2, function12, v9, z2, v10, v7, map2, null, composer1, v5 & 0xFFFFFFE, 0x200);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            function11 = function12;
            v8 = v9;
            z1 = z2;
            v6 = v10;
            map1 = map2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            v6 = v1;
            v7 = v2;
            function11 = function10;
            v8 = v;
            z1 = z;
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(annotatedString0, modifier1, textStyle1, function11, v8, z1, v6, v7, map1, v3, v4, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BasicText-VhcvRP8(@NotNull String s, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, @Nullable Function1 function10, int v, boolean z, int v1, int v2, @Nullable ColorProducer colorProducer0, @Nullable Composer composer0, int v3, int v4) {
        ColorProducer colorProducer1;
        boolean z1;
        int v8;
        Function1 function12;
        int v7;
        int v6;
        TextStyle textStyle1;
        Modifier modifier1;
        Modifier modifier3;
        int v13;
        Function1 function11;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xB94271D2);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            function11 = function10;
        }
        else if((v3 & 0xC00) == 0) {
            function11 = function10;
            v5 |= (composer1.changedInstance(function11) ? 0x800 : 0x400);
        }
        else {
            function11 = function10;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x30000 & v3) == 0) {
            v5 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(colorProducer0) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
            TextStyle textStyle2 = (v4 & 4) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            SelectionController selectionController0 = null;
            if((v4 & 8) != 0) {
                function11 = null;
            }
            int v9 = (v4 & 16) == 0 ? v : 1;
            v7 = 1;
            boolean z2 = (v4 & 0x20) == 0 ? z : true;
            int v10 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            if((v4 & 0x80) == 0) {
                v7 = v2;
            }
            ColorProducer colorProducer2 = (v4 & 0x100) == 0 ? colorProducer0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB94271D2, v5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(v7, v10);
            SelectionRegistrar selectionRegistrar0 = (SelectionRegistrar)composer1.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
            if(selectionRegistrar0 == null) {
                composer1.startReplaceGroup(-1588686502);
            }
            else {
                composer1.startReplaceGroup(-1589202404);
                long v11 = ((TextSelectionColors)composer1.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU();
                Object[] arr_object = {selectionRegistrar0};
                Saver saver0 = SaverKt.Saver(new b1(selectionRegistrar0, 11), o.z);
                boolean z3 = composer1.changedInstance(selectionRegistrar0);
                q0 q00 = composer1.rememberedValue();
                if(z3 || q00 == Composer.Companion.getEmpty()) {
                    q00 = new q0(selectionRegistrar0, 0);
                    composer1.updateRememberedValue(q00);
                }
                long v12 = ((Number)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, q00, composer1, 0, 4)).longValue();
                boolean z4 = composer1.changed(v12);
                boolean z5 = composer1.changed(selectionRegistrar0);
                boolean z6 = composer1.changed(v11);
                SelectionController selectionController1 = composer1.rememberedValue();
                if((z4 | z5 | z6) != 0 || selectionController1 == Composer.Companion.getEmpty()) {
                    selectionController1 = new SelectionController(v12, selectionRegistrar0, v11, null, 8, null);
                    composer1.updateRememberedValue(selectionController1);
                }
                selectionController0 = selectionController1;
            }
            composer1.endReplaceGroup();
            if(selectionController0 == null && function11 == null) {
                composer1.startReplaceGroup(0xA15B1521);
                v13 = v10;
                modifier3 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFF, null).then(new TextStringSimpleElement(s, textStyle2, ((Resolver)composer1.consume(CompositionLocalsKt.getLocalFontFamilyResolver())), v9, z2, v13, v7, colorProducer2, null));
            }
            else {
                v13 = v10;
                composer1.startReplaceGroup(0xA1506FAC);
                modifier3 = BasicTextKt.b(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFF, null), new AnnotatedString(s, null, null, 6, null), textStyle2, function11, v9, z2, v13, v7, ((Resolver)composer1.consume(CompositionLocalsKt.getLocalFontFamilyResolver())), null, null, selectionController0, colorProducer2, null);
            }
            composer1.endReplaceGroup();
            d2 d20 = (d2 this, /* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> MeasureScope.layout$default(measureScope0, Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), null, d2.b, 4, null);
            int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, d20, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                a.t(v14, composer1, v14, function20);
            }
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            textStyle1 = textStyle2;
            v8 = v9;
            function12 = function11;
            v6 = v13;
            z1 = z2;
            colorProducer1 = colorProducer2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            v6 = v1;
            v7 = v2;
            function12 = function11;
            v8 = v;
            z1 = z;
            colorProducer1 = colorProducer0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(s, modifier1, textStyle1, function12, v8, z1, v6, v7, colorProducer1, v3, v4, 0));
        }
    }

    public static final void a(Modifier modifier0, AnnotatedString annotatedString0, Function1 function10, boolean z, Map map0, TextStyle textStyle0, int v, boolean z1, int v1, int v2, Resolver fontFamily$Resolver0, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function11, Composer composer0, int v3, int v4, int v5) {
        Map map1;
        yk yk0;
        Function1 function12;
        Map map3;
        Function0 function00;
        TextLinkScope textLinkScope1;
        int v8;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0x2673E498);
        if((v5 & 1) == 0) {
            v6 = (v3 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v6 |= (composer1.changed(annotatedString0) ? 0x20 : 16);
        }
        if((v5 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v6 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v6 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v5 & 16) != 0) {
            v6 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v6 |= (composer1.changedInstance(map0) ? 0x4000 : 0x2000);
        }
        if((v5 & 0x20) != 0) {
            v6 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v6 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x40) != 0) {
            v6 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v6 |= (composer1.changed(v) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v6 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x100) != 0) {
            v6 |= 0x6000000;
        }
        else if((0x6000000 & v3) == 0) {
            v6 |= (composer1.changed(v1) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((0x30000000 & v3) == 0) {
            v6 |= (composer1.changed(v2) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x400) == 0) {
            v8 = (v4 & 6) == 0 ? v4 | (composer1.changedInstance(fontFamily$Resolver0) ? 4 : 2) : v4;
        }
        else {
            v8 = v4 | 6;
        }
        if((v5 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v8 |= (composer1.changedInstance(selectionController0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v5 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            v9 |= (composer1.changedInstance(colorProducer0) ? 0x100 : 0x80);
        }
        if((v5 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            if(composer1.changedInstance(function11)) {
                v7 = 0x800;
            }
            v9 |= v7;
        }
        if((v6 & 306783379) != 306783378 || (v9 & 0x493) != 1170 || !composer1.getSkipping()) {
            Map map2 = (v5 & 16) == 0 ? map0 : x.emptyMap();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2673E498, v6, v9, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)");
            }
            MutableState mutableState0 = null;
            if(TextAnnotatedStringNodeKt.hasLinks(annotatedString0)) {
                composer1.startReplaceGroup(0xDB15E0E1);
                TextLinkScope textLinkScope0 = composer1.rememberedValue();
                if((v6 & 0x70) == 0x20 || textLinkScope0 == Composer.Companion.getEmpty()) {
                    textLinkScope0 = new TextLinkScope(annotatedString0);
                    composer1.updateRememberedValue(textLinkScope0);
                }
                textLinkScope1 = textLinkScope0;
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(0xDB16C352);
                composer1.endReplaceGroup();
                textLinkScope1 = null;
            }
            if(TextAnnotatedStringNodeKt.hasLinks(annotatedString0)) {
                composer1.startReplaceGroup(0xDB19AC0D);
                boolean z2 = composer1.changed(textLinkScope1);
                x0 x00 = composer1.rememberedValue();
                if((v6 & 0x70) == 0x20 || z2 || x00 == Composer.Companion.getEmpty()) {
                    x00 = new x0(textLinkScope1, annotatedString0);
                    composer1.updateRememberedValue(x00);
                }
                function00 = x00;
            }
            else {
                composer1.startReplaceGroup(0xDB1B52AB);
                y0 y00 = composer1.rememberedValue();
                if((v6 & 0x70) == 0x20 || y00 == Composer.Companion.getEmpty()) {
                    y00 = new y0(annotatedString0);
                    composer1.updateRememberedValue(y00);
                }
                function00 = y00;
            }
            composer1.endReplaceGroup();
            Pair pair0 = z ? AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString0, map2) : new Pair(null, null);
            Object object0 = pair0.component1();
            List list0 = (List)pair0.component2();
            if(z) {
                composer1.startReplaceGroup(0xDB1FD1AA);
                MutableState mutableState1 = composer1.rememberedValue();
                map3 = map2;
                if(mutableState1 == Composer.Companion.getEmpty()) {
                    function12 = null;
                    mutableState1 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer1.updateRememberedValue(mutableState1);
                }
                else {
                    function12 = null;
                }
                mutableState0 = mutableState1;
            }
            else {
                map3 = map2;
                function12 = null;
                composer1.startReplaceGroup(0xDB210A72);
            }
            composer1.endReplaceGroup();
            if(z) {
                composer1.startReplaceGroup(-618506565);
                boolean z3 = composer1.changed(mutableState0);
                w0 w00 = composer1.rememberedValue();
                if(z3 || w00 == Composer.Companion.getEmpty()) {
                    w00 = new w0(mutableState0);
                    composer1.updateRememberedValue(w00);
                }
                function12 = w00;
            }
            else {
                composer1.startReplaceGroup(0xDB234FB2);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFF, null);
            Object object1 = function00.invoke();
            boolean z4 = composer1.changedInstance(textLinkScope1);
            r0 r00 = composer1.rememberedValue();
            if(z4 || (v6 & 0x380) == 0x100 || r00 == Composer.Companion.getEmpty()) {
                r00 = new r0(textLinkScope1, function10);
                composer1.updateRememberedValue(r00);
            }
            Modifier modifier2 = BasicTextKt.b(modifier1, ((AnnotatedString)object1), textStyle0, r00, v, z1, v1, v2, fontFamily$Resolver0, ((List)object0), function12, selectionController0, colorProducer0, function11);
            if(z) {
                composer1.startReplaceGroup(-617202116);
                boolean z6 = composer1.changedInstance(textLinkScope1);
                t0 t00 = composer1.rememberedValue();
                if(z6 || t00 == Composer.Companion.getEmpty()) {
                    t00 = new t0(textLinkScope1);
                    composer1.updateRememberedValue(t00);
                }
                boolean z7 = composer1.changed(mutableState0);
                u0 u00 = composer1.rememberedValue();
                if(z7 || u00 == Composer.Companion.getEmpty()) {
                    u00 = new u0(mutableState0);
                    composer1.updateRememberedValue(u00);
                }
                yk0 = new gf(1, t00, u00);
            }
            else {
                composer1.startReplaceGroup(0xDB33CA5D);
                boolean z5 = composer1.changedInstance(textLinkScope1);
                s0 s00 = composer1.rememberedValue();
                if(z5 || s00 == Composer.Companion.getEmpty()) {
                    s00 = new s0(textLinkScope1);
                    composer1.updateRememberedValue(s00);
                }
                yk0 = new yk(s00, 2);
            }
            composer1.endReplaceGroup();
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, yk0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                a.t(v10, composer1, v10, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            if(textLinkScope1 == null) {
                composer1.startReplaceGroup(-515480539);
            }
            else {
                composer1.startReplaceGroup(0x200A875C);
                textLinkScope1.LinksComposables(composer1, 0);
            }
            composer1.endReplaceGroup();
            if(list0 == null) {
                composer1.startReplaceGroup(0xE1472DE3);
            }
            else {
                composer1.startReplaceGroup(0xE1472DE4);
                AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString0, list0, composer1, v6 >> 3 & 14);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            map1 = map3;
        }
        else {
            composer1.skipToGroupEnd();
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(modifier0, annotatedString0, function10, z, map1, textStyle0, v, z1, v1, v2, fontFamily$Resolver0, selectionController0, colorProducer0, function11, v3, v4, v5));
        }
    }

    public static final void access$BasicText_RWo7tUw$lambda$6(MutableState mutableState0, AnnotatedString annotatedString0) {
        mutableState0.setValue(annotatedString0);
    }

    public static final List access$measureWithTextRangeMeasureConstraints(List list0, Function0 function00) {
        if(((Boolean)function00.invoke()).booleanValue()) {
            TextRangeLayoutMeasureScope textRangeLayoutMeasureScope0 = new TextRangeLayoutMeasureScope();
            List list1 = new ArrayList(list0.size());
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Measurable measurable0 = (Measurable)list0.get(v1);
                Object object0 = measurable0.getParentData();
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                TextRangeLayoutMeasureResult textRangeLayoutMeasureResult0 = ((TextRangeLayoutModifier)object0).getMeasurePolicy().measure(textRangeLayoutMeasureScope0);
                ((ArrayList)list1).add(new Pair(measurable0.measure-BRTryo0(Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(textRangeLayoutMeasureResult0.getWidth(), textRangeLayoutMeasureResult0.getWidth(), textRangeLayoutMeasureResult0.getHeight(), textRangeLayoutMeasureResult0.getHeight())), textRangeLayoutMeasureResult0.getPlace()));
            }
            return list1;
        }
        return null;
    }

    public static final Modifier b(Modifier modifier0, AnnotatedString annotatedString0, TextStyle textStyle0, Function1 function10, int v, boolean z, int v1, int v2, Resolver fontFamily$Resolver0, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12) {
        if(selectionController0 == null) {
            TextAnnotatedStringElement textAnnotatedStringElement0 = new TextAnnotatedStringElement(annotatedString0, textStyle0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, null, colorProducer0, function12, null);
            return modifier0.then(Modifier.Companion).then(textAnnotatedStringElement0);
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement0 = new SelectableTextAnnotatedStringElement(annotatedString0, textStyle0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, selectionController0, colorProducer0, null);
        return modifier0.then(selectionController0.getModifier()).then(selectableTextAnnotatedStringElement0);
    }
}

