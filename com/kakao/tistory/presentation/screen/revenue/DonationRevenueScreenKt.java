package com.kakao.tistory.presentation.screen.revenue;

import a;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSupportUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.RevenueViewKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "revenueSupport", "", "DonationRevenueScreen", "(Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDonationRevenueScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonationRevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/DonationRevenueScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,136:1\n148#2:137\n148#2:174\n148#2:176\n148#2:181\n148#2:222\n148#2:223\n148#2:224\n148#2:225\n85#3:138\n82#3,6:139\n88#3:173\n92#3:180\n85#3:182\n82#3,6:183\n88#3:217\n92#3:221\n78#4,6:145\n85#4,4:160\n89#4,2:170\n93#4:179\n78#4,6:189\n85#4,4:204\n89#4,2:214\n93#4:220\n78#4,6:232\n85#4,4:247\n89#4,2:257\n93#4:263\n368#5,9:151\n377#5:172\n378#5,2:177\n368#5,9:195\n377#5:216\n378#5,2:218\n368#5,9:238\n377#5:259\n378#5,2:261\n4032#6,6:164\n4032#6,6:208\n4032#6,6:251\n77#7:175\n71#8:226\n69#8,5:227\n74#8:260\n78#8:264\n*S KotlinDebug\n*F\n+ 1 DonationRevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/DonationRevenueScreenKt\n*L\n35#1:137\n37#1:174\n76#1:176\n96#1:181\n124#1:222\n126#1:223\n128#1:224\n130#1:225\n32#1:138\n32#1:139,6\n32#1:173\n32#1:180\n96#1:182\n96#1:183,6\n96#1:217\n96#1:221\n32#1:145,6\n32#1:160,4\n32#1:170,2\n32#1:179\n96#1:189,6\n96#1:204,4\n96#1:214,2\n96#1:220\n122#1:232,6\n122#1:247,4\n122#1:257,2\n122#1:263\n32#1:151,9\n32#1:172\n32#1:177,2\n96#1:195,9\n96#1:216\n96#1:218,2\n122#1:238,9\n122#1:259\n122#1:261,2\n32#1:164,6\n96#1:208,6\n122#1:251,6\n71#1:175\n122#1:226\n122#1:227,5\n122#1:260\n122#1:264\n*E\n"})
public final class DonationRevenueScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DonationRevenueScreen(@NotNull RevenueSupportUiState revenueSupportUiState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(revenueSupportUiState0, "revenueSupport");
        Composer composer1 = composer0.startRestartGroup(0x22DBA39E);
        int v1 = (v & 14) == 0 ? (composer1.changed(revenueSupportUiState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x22DBA39E, v1, -1, "com.kakao.tistory.presentation.screen.revenue.DonationRevenueScreen (DonationRevenueScreen.kt:29)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 18.0f), composer1, 6);
            DonationRevenueScreenKt.a(ComposableLambdaKt.rememberComposableLambda(0x1E77311A, true, new i(revenueSupportUiState0.getSupportInfo()), composer1, 54), composer1, 6);
            DonationRevenueScreenKt.a(ComposableLambdaKt.rememberComposableLambda(0xAEB01D03, true, new j(revenueSupportUiState0), composer1, 54), composer1, 6);
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String s = StringResources_androidKt.stringResource(string.link_kakao_creatorfit_report, composer1, 0);
            Modifier modifier2 = ModifierKt.noRippleClickable(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 18.0f, 0.0f, 0.0f, 13, null), new k(context0, s));
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.revenue_donation_start_register_creator, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141500000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFEFD9, null), composer1, 0x180, 0, 0x1FFF8);
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
            scopeUpdateScope0.updateScope(new l(revenueSupportUiState0, v));
        }
    }

    public static final void a(Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x29D5AA09);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x29D5AA09, v1, -1, "com.kakao.tistory.presentation.screen.revenue.DonationRevenueShadowBox (DonationRevenueScreen.kt:119)");
            }
            Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 18.0f, 7, null), 0.0f, 1, null), 84.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), 0L, null, 14.0f, 4, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(14 & v1)));
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
            scopeUpdateScope0.updateScope(new m(function20, v));
        }
    }

    public static final void access$DonationRevenueInfo(Modifier modifier0, String s, String s1, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xFFB4ACD3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFFB4ACD3, v2, -1, "com.kakao.tistory.presentation.screen.revenue.DonationRevenueInfo (DonationRevenueScreen.kt:93)");
            }
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(modifier1, 24.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, v2 >> 3 & 14 | 0x180, 0, 0x1FFFA);
            RevenueViewKt.AutoSizeText(null, s1, new TextStyle(0L, 0x141A00000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, v2 >> 3 & 0x70, 1);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(modifier1, s, s1, v, v1));
        }
    }
}

