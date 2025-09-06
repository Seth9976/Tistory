package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\'\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A=\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00002\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000E"}, d2 = {"", "likeCount", "commentCount", "viewCount", "", "EntryListItemInfo", "(IIILandroidx/compose/runtime/Composer;I)V", "", "publishedDate", "", "scheduled", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "visibility", "(ILjava/lang/Integer;Ljava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryListItemInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryListItemInfo.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListItemInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,300:1\n148#2:301\n148#2:339\n148#2:386\n148#2:428\n148#2:470\n85#3:302\n81#3,7:303\n88#3:338\n92#3:385\n85#3:387\n81#3,7:388\n88#3:423\n92#3:427\n78#4,6:310\n85#4,4:325\n89#4,2:335\n78#4,6:348\n85#4,4:363\n89#4,2:373\n93#4:379\n93#4:384\n78#4,6:395\n85#4,4:410\n89#4,2:420\n93#4:426\n78#4,6:437\n85#4,4:452\n89#4,2:462\n93#4:468\n368#5,9:316\n377#5:337\n368#5,9:354\n377#5:375\n378#5,2:377\n378#5,2:382\n368#5,9:401\n377#5:422\n378#5,2:424\n368#5,9:443\n377#5:464\n378#5,2:466\n4032#6,6:329\n4032#6,6:367\n4032#6,6:414\n4032#6,6:456\n1855#7:340\n1856#7:381\n71#8:341\n68#8,6:342\n74#8:376\n78#8:380\n98#9:429\n94#9,7:430\n101#9:465\n105#9:469\n*S KotlinDebug\n*F\n+ 1 EntryListItemInfo.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListItemInfoKt\n*L\n32#1:301\n34#1:339\n56#1:386\n262#1:428\n283#1:470\n31#1:302\n31#1:303,7\n31#1:338\n31#1:385\n55#1:387\n55#1:388,7\n55#1:423\n55#1:427\n31#1:310,6\n31#1:325,4\n31#1:335,2\n35#1:348,6\n35#1:363,4\n35#1:373,2\n35#1:379\n31#1:384\n55#1:395,6\n55#1:410,4\n55#1:420,2\n55#1:426\n260#1:437,6\n260#1:452,4\n260#1:462,2\n260#1:468\n31#1:316,9\n31#1:337\n35#1:354,9\n35#1:375\n35#1:377,2\n31#1:382,2\n55#1:401,9\n55#1:422\n55#1:424,2\n260#1:443,9\n260#1:464\n260#1:466,2\n31#1:329,6\n35#1:367,6\n55#1:414,6\n260#1:456,6\n34#1:340\n34#1:381\n35#1:341\n35#1:342,6\n35#1:376\n35#1:380\n260#1:429\n260#1:430,7\n260#1:465\n260#1:469\n*E\n"})
public final class EntryListItemInfoKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryListItemInfo(int v, int v1, int v2, @Nullable Composer composer0, int v3) {
        Composer composer1 = composer0.startRestartGroup(0x5A00DA0B);
        int v4 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        if((v3 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            v4 |= (composer1.changed(v2) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A00DA0B, v4, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo (EntryListItemInfo.kt:95)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(0L)), ComposableLambdaKt.rememberComposableLambda(0xC765BD4B, true, new z(TTextStyle.INSTANCE.getSize12Weight400(), v, v1, v2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(v, v1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryListItemInfo(int v, @Nullable Integer integer0, @NotNull String s, boolean z, @Nullable Visibility entryListUiState$Visibility0, @Nullable Composer composer0, int v1, int v2) {
        boolean z1;
        Visibility entryListUiState$Visibility1;
        int v3;
        Intrinsics.checkNotNullParameter(s, "publishedDate");
        Composer composer1 = composer0.startRestartGroup(-1633798103);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            entryListUiState$Visibility1 = entryListUiState$Visibility0;
        }
        else if((0xE000 & v1) == 0) {
            entryListUiState$Visibility1 = entryListUiState$Visibility0;
            v3 |= (composer1.changed(entryListUiState$Visibility1) ? 0x4000 : 0x2000);
        }
        else {
            entryListUiState$Visibility1 = entryListUiState$Visibility0;
        }
        if((0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            boolean z2 = (v2 & 8) == 0 ? z : false;
            Visibility entryListUiState$Visibility2 = (v2 & 16) == 0 ? entryListUiState$Visibility1 : Visibility.NORMAL;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633798103, v3, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo (EntryListItemInfo.kt:143)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(0L)), ComposableLambdaKt.rememberComposableLambda(0xB04D2B69, true, new c0(TTextStyle.INSTANCE.getSize12Weight400(), z2, entryListUiState$Visibility2, v, integer0, s), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            entryListUiState$Visibility1 = entryListUiState$Visibility2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(v, integer0, s, z1, entryListUiState$Visibility1, v1, v2));
        }
    }

    public static final String a(int v, int v1) {
        switch(v1) {
            case 0: 
            case 1: {
                return String.valueOf(v);
            }
            case 2: {
                if(v > 99) {
                    v = 99;
                }
                return String.valueOf(v);
            }
            default: {
                int v2 = ((int)Math.pow(10.0, v1 - 1)) - 1;
                return v <= v2 ? String.valueOf(v) : v2 + "+";
            }
        }
    }

    public static final void a(int v, String s, int v1, int v2, TextStyle textStyle0, Composer composer0, int v3, int v4) {
        int v7;
        int v6;
        Composer composer1 = composer0.startRestartGroup(-373208060);
        int v5 = 4;
        if((v4 & 1) == 0) {
            v6 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v6 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v6 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            v6 |= (composer1.changed(v2) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v6 |= 0x6000;
        }
        else if((0xE000 & v3) == 0) {
            v6 |= (composer1.changed(textStyle0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v6) != 9362 || !composer1.getSkipping()) {
            if((v4 & 8) == 0) {
                v5 = v2;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373208060, v6, -1, "com.kakao.tistory.presentation.design.ui.list.EntryInfoCount (EntryListItemInfo.kt:241)");
            }
            EntryListItemInfoKt.a(ComposableLambdaKt.rememberComposableLambda(0xECD46C48, true, new u(v, s), composer1, 54), v1, v5, textStyle0, composer1, v6 >> 3 & 0x70 | 6 | v6 >> 3 & 0x380 | v6 >> 3 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v7 = v5;
        }
        else {
            composer1.skipToGroupEnd();
            v7 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(v, s, v1, v7, textStyle0, v3, v4));
        }
    }

    public static final void a(Function2 function20, int v, int v1, TextStyle textStyle0, Composer composer0, int v2, int v3) {
        int v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x3F3250B0);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            int v6 = (v3 & 4) == 0 ? v1 : 4;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3F3250B0, v4, -1, "com.kakao.tistory.presentation.design.ui.list.EntryInfoCount (EntryListItemInfo.kt:258)");
            }
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(3.0f);
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, Alignment.Companion.getCenterVertically(), composer1, 54);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                d.a(v7, composer1, v7, function21);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v4 & 14)));
            v5 = v6;
            TextKt.Text--4IGK_g(EntryListItemInfoKt.a(v, v6), SemanticKt.contentDescription(modifier$Companion0, new String[]{StringResources_androidKt.stringResource(string.content_desc_count, new Object[]{v}, composer1, 0x40)}, composer1, 6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, textStyle0, composer1, 0, v4 << 9 & 0x380000 | 0xC00, 0xDFFC);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            v5 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(function20, v, v5, textStyle0, v2, v3));
        }
    }

    public static final void access$CommentCount(int v, int v1, TextStyle textStyle0, Composer composer0, int v2, int v3) {
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x1761971B);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v3 & 2) != 0) {
                v1 = 4;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1761971B, v4, -1, "com.kakao.tistory.presentation.design.ui.list.CommentCount (EntryListItemInfo.kt:203)");
            }
            EntryListItemInfoKt.a(drawable.ico_list_comment, StringResources_androidKt.stringResource(string.content_desc_comment, composer1, 0), v, v1, textStyle0, composer1, v4 << 6 & 0xFF80, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(v, v1, textStyle0, v2, v3));
        }
    }

    public static final void access$EntryInfoCount(String s, int v, int v1, TextStyle textStyle0, Composer composer0, int v2, int v3) {
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xBF3C9821);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v3 & 4) != 0) {
                v1 = 4;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBF3C9821, v4, -1, "com.kakao.tistory.presentation.design.ui.list.EntryInfoCount (EntryListItemInfo.kt:219)");
            }
            EntryListItemInfoKt.a(ComposableLambdaKt.rememberComposableLambda(0xE0527A65, true, new s(s, textStyle0), composer1, 54), v, v1, textStyle0, composer1, v4 & 0x70 | 6 | v4 & 0x380 | v4 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(s, v, v1, textStyle0, v2, v3));
        }
    }

    public static final void access$EntryInfoIcon(int v, String s, Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x8A9A1610);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            if((v2 & 2) != 0) {
                s = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8A9A1610, v3, -1, "com.kakao.tistory.presentation.design.ui.list.EntryInfoIcon (EntryListItemInfo.kt:278)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(v, composer1, v3 & 14), s, SizeKt.size-3ABfNKs(Modifier.Companion, 16.0f), 0L, composer1, v3 & 0x70 | 392, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(v, s, v1, v2));
        }
    }

    public static final void access$LikeCount(int v, int v1, TextStyle textStyle0, Composer composer0, int v2, int v3) {
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x6BD15A6F);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v3 & 2) != 0) {
                v1 = 4;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6BD15A6F, v4, -1, "com.kakao.tistory.presentation.design.ui.list.LikeCount (EntryListItemInfo.kt:192)");
            }
            EntryListItemInfoKt.a(drawable.ico_list_like, StringResources_androidKt.stringResource(string.content_desc_like, composer1, 0), v, v1, textStyle0, composer1, v4 << 6 & 0xFF80, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(v, v1, textStyle0, v2, v3));
        }
    }

    public static final void access$ListItemPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x907EAD9C);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x907EAD9C, v, -1, "com.kakao.tistory.presentation.design.ui.list.ListItemPreview (EntryListItemInfo.kt:53)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(10.0f), Alignment.Companion.getStart(), composer1, 6);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            EntryListItemInfoKt.EntryListItemInfo(320, r0.a.l(composeUiNode$Companion0, composer1, modifier0, 0x73), "1분 전", false, null, composer1, 438, 24);
            EntryListItemInfoKt.EntryListItemInfo(320, null, "1시간 전", true, Visibility.PROTECTED, composer1, 28086, 0);
            EntryListItemInfoKt.EntryListItemInfo(0xCA4, 0x536, "1시간전", true, Visibility.PRIVATE, composer1, 28086, 0);
            EntryListItemInfoKt.EntryListItemInfo(0xF423F, 0xF423F, "2024.12.12", true, Visibility.PROTECTED, composer1, 28086, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(v));
        }
    }

    public static final void access$ListItemViewCountPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCB2785F0);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCB2785F0, v, -1, "com.kakao.tistory.presentation.design.ui.list.ListItemViewCountPreview (EntryListItemInfo.kt:29)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(10.0f), Alignment.Companion.getStart(), composer1, 6);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, -2015120579);
            for(Object object0: CollectionsKt__CollectionsKt.listOf(new Dp[]{Dp.box-impl(100.0f), Dp.box-impl(148.0f), Dp.box-impl(149.0f), Dp.box-impl(170.0f), Dp.box-impl(171.0f), Dp.box-impl(172.0f)})) {
                Modifier modifier1 = BackgroundKt.background-bw27NRU$default(SizeKt.width-3ABfNKs(Modifier.Companion, ((Dp)object0).unbox-impl()), Color.copy-wmQWz5c$default(Color.Companion.getBlack-0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion1.getConstructor();
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
                Function2 function21 = a.a(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                    d.a(v2, composer1, v2, function21);
                }
                Updater.set-impl(composer1, modifier2, composeUiNode$Companion1.getSetModifier());
                EntryListItemInfoKt.EntryListItemInfo(15000, 0xF423F, 0x1869F, composer1, 438);
                composer1.endNode();
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(v));
        }
    }
}

