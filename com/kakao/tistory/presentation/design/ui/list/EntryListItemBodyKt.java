package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A#\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A5\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "title", "summary", "", "EntryTitleAndSummary", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/runtime/Composer;II)V", "", "maxLines", "placeholderLines", "Landroidx/compose/ui/text/TextStyle;", "style", "EntryTitle", "(Landroidx/compose/ui/text/AnnotatedString;IILandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryListItemBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryListItemBody.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListItemBodyKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,130:1\n148#2:131\n148#2:132\n148#2:172\n148#2:176\n85#3:133\n83#3,5:134\n88#3:167\n92#3:171\n85#3:177\n82#3,6:178\n88#3:212\n92#3:216\n78#4,6:139\n85#4,4:154\n89#4,2:164\n93#4:170\n78#4,6:184\n85#4,4:199\n89#4,2:209\n93#4:215\n368#5,9:145\n377#5:166\n378#5,2:168\n368#5,9:190\n377#5:211\n378#5,2:213\n4032#6,6:158\n4032#6,6:203\n86#7:173\n86#7:174\n50#7:175\n*S KotlinDebug\n*F\n+ 1 EntryListItemBody.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListItemBodyKt\n*L\n26#1:131\n27#1:132\n63#1:172\n69#1:176\n25#1:133\n25#1:134,5\n25#1:167\n25#1:171\n71#1:177\n71#1:178,6\n71#1:212\n71#1:216\n25#1:139,6\n25#1:154,4\n25#1:164,2\n25#1:170\n71#1:184,6\n71#1:199,4\n71#1:209,2\n71#1:215\n25#1:145,9\n25#1:166\n25#1:168,2\n71#1:190,9\n71#1:211\n71#1:213,2\n25#1:158,6\n71#1:203,6\n66#1:173\n67#1:174\n69#1:175\n*E\n"})
public final class EntryListItemBodyKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryTitle(@NotNull AnnotatedString annotatedString0, int v, int v1, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v2, int v3) {
        TextStyle textStyle1;
        int v9;
        int v8;
        TextStyle textStyle2;
        int v12;
        int v11;
        int v10;
        int v7;
        int v6;
        int v5;
        Intrinsics.checkNotNullParameter(annotatedString0, "title");
        Composer composer1 = composer0.startRestartGroup(0xF5300934);
        int v4 = 2;
        if((v3 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v6 = v1;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v1;
                v7 = 0x80;
            }
            v5 |= v7;
        }
        else {
            v6 = v1;
        }
        if((v3 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v5 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) == 0) {
                    v4 = v;
                }
                if((v3 & 4) != 0) {
                    v5 &= -897;
                    v6 = v4;
                }
                if((v3 & 8) == 0) {
                    v10 = v5;
                    v11 = v4;
                    v12 = v6;
                    textStyle2 = textStyle0;
                }
                else {
                    v10 = v5;
                    v11 = v4;
                    textStyle2 = EntryStyle.INSTANCE.getTitleTextStyle();
                    v12 = v6;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v5 &= -897;
                }
                v10 = v5;
                v11 = v;
                v12 = v6;
                textStyle2 = textStyle0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF5300934, v10, -1, "com.kakao.tistory.presentation.design.ui.list.EntryTitle (EntryListItemBody.kt:94)");
            }
            TextKt.Text-IbK3jfQ(annotatedString0, SemanticKt.contentDescription(PlaceHolderKt.placeholder-942rkJo(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), textStyle2, 0.0f, v12, composer1, v10 >> 6 & 0x70 | 6 | v10 << 3 & 0x1C00, 2), new String[]{StringResources_androidKt.stringResource(string.content_desc_entry, composer1, 0), annotatedString0.getText()}, composer1, 0), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, v11, 0, null, null, textStyle2, composer1, v10 & 14, v10 << 6 & 0x1C00 | 0x30 | v10 << 12 & 0x1C00000, 0x1D7FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8 = v11;
            v9 = v12;
            textStyle1 = textStyle2;
        }
        else {
            composer1.skipToGroupEnd();
            v8 = v;
            v9 = v6;
            textStyle1 = textStyle0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(annotatedString0, v8, v9, textStyle1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryTitleAndSummary(@NotNull AnnotatedString annotatedString0, @Nullable AnnotatedString annotatedString1, @Nullable Composer composer0, int v, int v1) {
        AnnotatedString annotatedString2;
        int v2;
        Intrinsics.checkNotNullParameter(annotatedString0, "title");
        Composer composer1 = composer0.startRestartGroup(0x755214C6);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(annotatedString1) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            annotatedString2 = (v1 & 2) == 0 ? annotatedString1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x755214C6, v2, -1, "com.kakao.tistory.presentation.design.ui.list.EntryTitleAndSummary (EntryListItemBody.kt:61)");
            }
            float f = Dp.constructor-impl(ScaleUtilsKt.lineHeightToDp(EntryStyle.INSTANCE.getTitleTextStyle(), composer1, 6) * 2.0f);
            float f1 = Dp.constructor-impl(ScaleUtilsKt.lineHeightToDp(EntryStyle.INSTANCE.getSummaryTextStyle(), composer1, 6) * 2.0f);
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.textWrapperHeight-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), f + (annotatedString2 == null ? 0.0f : f1 + 4.0f));
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            EntryListItemBodyKt.EntryTitle(annotatedString0, 0, (annotatedString2 == null ? 2 : 1), null, composer1, v2 & 14, 10);
            composer1.startReplaceGroup(0xF456642D);
            if(annotatedString2 != null) {
                SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
                EntryListItemBodyKt.a(annotatedString2, composer1, v2 >> 3 & 14);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            annotatedString2 = annotatedString1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(annotatedString0, annotatedString2, v, v1));
        }
    }

    public static final void a(AnnotatedString annotatedString0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(86530724);
        int v1 = (v & 14) == 0 ? (composer1.changed(annotatedString0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(86530724, v1, -1, "com.kakao.tistory.presentation.design.ui.list.EntrySummary (EntryListItemBody.kt:110)");
            }
            TextStyle textStyle0 = EntryStyle.INSTANCE.getSummaryTextStyle();
            TextKt.Text-IbK3jfQ(annotatedString0, SemanticKt.contentDescription(PlaceHolderKt.placeholder-942rkJo(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), textStyle0, 0.0f, 2, composer1, 0xC36, 2), new String[]{StringsKt___StringsKt.take(annotatedString0.getText(), 60)}, composer1, 0), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, textStyle0, composer1, v1 & 14, 0xC00C30, 0x1D7FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(annotatedString0, v));
        }
    }

    public static final void access$EntryTitleAndSummaryPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC2DE3704);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC2DE3704, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryTitleAndSummaryPreview (EntryListItemBody.kt:23)");
            }
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(Modifier.Companion, 20.0f);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Alignment.Companion.getStart(), composer1, 6);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 KFC 한정판매 핫크리스피치킨과 핫윙 바로 먹어보기! 호주 kfc 치킨 메뉴와 가격", null, null, 6, null), new AnnotatedString("KFC우연히 운동 중에 호주치킨맛집인 KFC에 핫크리스피치킨을 한정판매한다는 광고를 보고 다음날 바로 핫윙까지 너무나 맛있어어", null, null, 6, null), composer1, 54, 0);
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 ", null, null, 6, null), new AnnotatedString("KFC우연히 운동 중에 호주치킨맛집인 KFC에 핫크리스피치킨을 한정판매한다는 광고를 보고 다음날 바로 핫윙까지 너무나 맛있어어", null, null, 6, null), composer1, 54, 0);
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 KFC 한정판매 핫크리스피치킨과 핫윙 바로 먹어보기! 호주 kfc 치킨 메뉴와 가격", null, null, 6, null), new AnnotatedString("KFC우연히 ", null, null, 6, null), composer1, 54, 0);
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 ", null, null, 6, null), new AnnotatedString("KFC우연히 ", null, null, 6, null), composer1, 54, 0);
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 KFC 한정판매 핫크리스피치킨과 핫윙 바로 먹어보기! 호주 kfc 치킨 메뉴와 가격", null, null, 6, null), null, composer1, 54, 0);
            EntryListItemBodyKt.EntryTitleAndSummary(new AnnotatedString("드디어 돌아온 ", null, null, 6, null), null, composer1, 54, 0);
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
            scopeUpdateScope0.updateScope(new q(v));
        }
    }
}

