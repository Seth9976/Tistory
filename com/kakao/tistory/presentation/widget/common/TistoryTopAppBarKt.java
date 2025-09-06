package com.kakao.tistory.presentation.widget.common;

import a5.b;
import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.kakao.tistory.presentation.common.TistoryWindowInsets;
import com.kakao.tistory.presentation.common.TistoryWindowInsetsKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\u001A\u009B\u0001\u0010\u0013\u001A\u00020\u00062\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u001E\b\u0002\u0010\t\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\u0019\b\u0002\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u00072$\b\u0002\u0010\r\u001A\u001E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\f\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u00C9\u0001\u0010\u001B\u001A\u00020\u00062\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\"\u0010\r\u001A\u001E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\f\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\u001E\b\u0002\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u001E\b\u0002\u0010\t\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\u0013\b\u0002\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\u00060\u0015\u00A2\u0006\u0002\b\u00072\u001E\b\u0002\u0010\u0016\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u001F\u0010\u001D\u001A\u00020\u00062\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u001F\u0010 \u001A\u00020\u00062\u000E\b\u0002\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0007\u00A2\u0006\u0004\b \u0010\u001E\u001A\u0017\u0010\"\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020!H\u0007\u00A2\u0006\u0004\b\"\u0010#\u001A!\u0010&\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020!2\b\b\u0002\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010\'\u001A\u0019\u0010)\u001A\u00020\u00062\b\u0010(\u001A\u0004\u0018\u00010!H\u0007\u00A2\u0006\u0004\b)\u0010#\u001A\u009B\u0001\u00101\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\n2\u001C\u0010\t\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\u00060\u0015\u00A2\u0006\u0002\b\u00072\u001C\u0010\r\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0002\b\u0007\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010+\u001A\u00020\u00172\b\b\u0002\u0010,\u001A\u00020\n2\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010-\u001A\u00020\u000E2\b\b\u0002\u0010.\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00062"}, d2 = {"Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "", "showOnlyNavigation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "navigationIcon", "", "actions", "Lkotlin/Function2;", "title", "Landroidx/compose/ui/unit/Dp;", "pinnedHeight", "maxHeight", "TistoryTopAppBar-nbWgWpA", "(Landroidx/compose/material3/TopAppBarScrollBehavior;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;FFLandroidx/compose/runtime/Composer;II)V", "TistoryTopAppBar", "titleInfo", "Lkotlin/Function0;", "expandAreaActions", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "TistoryCollapsingTopAppBar-88mDfTA", "(Landroidx/compose/material3/TopAppBarScrollBehavior;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JLandroidx/compose/runtime/Composer;II)V", "TistoryCollapsingTopAppBar", "onClickClose", "TistoryOnlyCloseAppBar", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onClickBack", "TistoryOnlyBackAppBar", "", "TistoryTopAppBarTitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "TistoryTopAppBarCenterTitle", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "info", "TistoryTopAppBarTitleInfo", "fraction", "backgroundColor", "backgroundAlpha", "dividerThickness", "dividerAlpha", "TistoryTopAppBarLayout-ygeTB3I", "(FLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JFJFFLandroidx/compose/runtime/Composer;II)V", "TistoryTopAppBarLayout", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryTopAppBar.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,495:1\n148#2:496\n71#3:497\n68#3,6:498\n74#3:532\n78#3:536\n71#3:537\n68#3,6:538\n74#3:572\n78#3:576\n71#3:577\n68#3,6:578\n74#3:612\n78#3:616\n71#3:686\n68#3,6:687\n74#3:721\n78#3:725\n71#3:890\n68#3,6:891\n74#3:925\n78#3:929\n78#4,6:504\n85#4,4:519\n89#4,2:529\n93#4:535\n78#4,6:544\n85#4,4:559\n89#4,2:569\n93#4:575\n78#4,6:584\n85#4,4:599\n89#4,2:609\n93#4:615\n78#4,6:617\n85#4,4:632\n89#4,2:642\n78#4,6:653\n85#4,4:668\n89#4,2:678\n93#4:684\n78#4,6:693\n85#4,4:708\n89#4,2:718\n93#4:724\n78#4,6:733\n85#4,4:748\n89#4,2:758\n93#4:764\n93#4:774\n78#4,6:781\n85#4,4:796\n89#4,2:806\n78#4,6:816\n85#4,4:831\n89#4,2:841\n93#4:847\n78#4,6:857\n85#4,4:872\n89#4,2:882\n93#4:888\n78#4,6:897\n85#4,4:912\n89#4,2:922\n93#4:928\n78#4,6:937\n85#4,4:952\n89#4,2:962\n93#4:968\n78#4,6:977\n85#4,4:992\n89#4,2:1002\n93#4:1008\n93#4:1012\n368#5,9:510\n377#5:531\n378#5,2:533\n368#5,9:550\n377#5:571\n378#5,2:573\n368#5,9:590\n377#5:611\n378#5,2:613\n368#5,9:623\n377#5:644\n368#5,9:659\n377#5:680\n378#5,2:682\n368#5,9:699\n377#5:720\n378#5,2:722\n368#5,9:739\n377#5:760\n378#5,2:762\n378#5,2:772\n368#5,9:787\n377#5:808\n368#5,9:822\n377#5:843\n378#5,2:845\n368#5,9:863\n377#5:884\n378#5,2:886\n368#5,9:903\n377#5:924\n378#5,2:926\n368#5,9:943\n377#5:964\n378#5,2:966\n368#5,9:983\n377#5:1004\n378#5,2:1006\n378#5,2:1010\n4032#6,6:523\n4032#6,6:563\n4032#6,6:603\n4032#6,6:636\n4032#6,6:672\n4032#6,6:712\n4032#6,6:752\n4032#6,6:800\n4032#6,6:835\n4032#6,6:876\n4032#6,6:916\n4032#6,6:956\n4032#6,6:996\n50#7:645\n50#7:849\n98#8:646\n95#8,6:647\n101#8:681\n105#8:685\n98#8:726\n95#8,6:727\n101#8:761\n105#8:765\n98#8:809\n95#8,6:810\n101#8:844\n105#8:848\n98#8:850\n95#8,6:851\n101#8:885\n105#8:889\n98#8:930\n95#8,6:931\n101#8:965\n105#8:969\n98#8:970\n95#8,6:971\n101#8:1005\n105#8:1009\n1223#9,6:766\n1223#9,6:775\n*S KotlinDebug\n*F\n+ 1 TistoryTopAppBar.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarKt\n*L\n38#1:496\n53#1:497\n53#1:498,6\n53#1:532\n53#1:536\n92#1:537\n92#1:538,6\n92#1:572\n92#1:576\n129#1:577\n129#1:578,6\n129#1:612\n129#1:616\n212#1:686\n212#1:687,6\n212#1:721\n212#1:725\n343#1:890\n343#1:891,6\n343#1:925\n343#1:929\n53#1:504,6\n53#1:519,4\n53#1:529,2\n53#1:535\n92#1:544,6\n92#1:559,4\n92#1:569,2\n92#1:575\n129#1:584,6\n129#1:599,4\n129#1:609,2\n129#1:615\n189#1:617,6\n189#1:632,4\n189#1:642,2\n205#1:653,6\n205#1:668,4\n205#1:678,2\n205#1:684\n212#1:693,6\n212#1:708,4\n212#1:718,2\n212#1:724\n220#1:733,6\n220#1:748,4\n220#1:758,2\n220#1:764\n189#1:774\n310#1:781,6\n310#1:796,4\n310#1:806,2\n315#1:816,6\n315#1:831,4\n315#1:841,2\n315#1:847\n336#1:857,6\n336#1:872,4\n336#1:882,2\n336#1:888\n343#1:897,6\n343#1:912,4\n343#1:922,2\n343#1:928\n351#1:937,6\n351#1:952,4\n351#1:962,2\n351#1:968\n358#1:977,6\n358#1:992,4\n358#1:1002,2\n358#1:1008\n310#1:1012\n53#1:510,9\n53#1:531\n53#1:533,2\n92#1:550,9\n92#1:571\n92#1:573,2\n129#1:590,9\n129#1:611\n129#1:613,2\n189#1:623,9\n189#1:644\n205#1:659,9\n205#1:680\n205#1:682,2\n212#1:699,9\n212#1:720\n212#1:722,2\n220#1:739,9\n220#1:760\n220#1:762,2\n189#1:772,2\n310#1:787,9\n310#1:808\n315#1:822,9\n315#1:843\n315#1:845,2\n336#1:863,9\n336#1:884\n336#1:886,2\n343#1:903,9\n343#1:924\n343#1:926,2\n351#1:943,9\n351#1:964\n351#1:966,2\n358#1:983,9\n358#1:1004\n358#1:1006,2\n310#1:1010,2\n53#1:523,6\n92#1:563,6\n129#1:603,6\n189#1:636,6\n205#1:672,6\n212#1:712,6\n220#1:752,6\n310#1:800,6\n315#1:835,6\n336#1:876,6\n343#1:916,6\n351#1:956,6\n358#1:996,6\n200#1:645\n332#1:849\n205#1:646\n205#1:647,6\n205#1:681\n205#1:685\n220#1:726\n220#1:727,6\n220#1:761\n220#1:765\n315#1:809\n315#1:810,6\n315#1:844\n315#1:848\n336#1:850\n336#1:851,6\n336#1:885\n336#1:889\n351#1:930\n351#1:931,6\n351#1:965\n351#1:969\n358#1:970\n358#1:971,6\n358#1:1005\n358#1:1009\n235#1:766,6\n373#1:775,6\n*E\n"})
public final class TistoryTopAppBarKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TistoryCollapsingTopAppBar-88mDfTA(@Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, @NotNull Function4 function40, @Nullable Function3 function30, boolean z, @Nullable Function3 function31, @Nullable Function2 function20, @Nullable Function3 function32, long v, @Nullable Composer composer0, int v1, int v2) {
        Function2 function21;
        Function3 function35;
        Function3 function34;
        Function3 function33;
        long v4;
        boolean z1;
        int v3;
        Intrinsics.checkNotNullParameter(function40, "title");
        Composer composer1 = composer0.startRestartGroup(-833305);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(topAppBarScrollBehavior0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function40) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0x1C00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function32) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) == 0) {
            v4 = v;
            if((v1 & 0x1C00000) == 0) {
                v3 |= (composer1.changed(v4) ? 0x800000 : 0x400000);
            }
        }
        else {
            v3 |= 0xC00000;
            v4 = v;
        }
        if((v3 & 0x16DB6DB) != 4793490 || !composer1.getSkipping()) {
            Function3 function36 = (v2 & 4) == 0 ? function30 : ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-4$presentation_prodRelease();
            if((v2 & 8) != 0) {
                z1 = false;
            }
            Function3 function37 = (v2 & 16) == 0 ? function31 : ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-5$presentation_prodRelease();
            Function2 function22 = (v2 & 0x20) == 0 ? function20 : ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-6$presentation_prodRelease();
            Function3 function38 = (v2 & 0x40) == 0 ? function32 : ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-7$presentation_prodRelease();
            if((v2 & 0x80) != 0) {
                v4 = 0L;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833305, v3, -1, "com.kakao.tistory.presentation.widget.common.TistoryCollapsingTopAppBar (TistoryTopAppBar.kt:73)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xF3AF2531, true, new x3(function37, function22, function38, function36, v4, function40), composer1, 54);
            if(z1) {
                composer1.startReplaceGroup(0xDC64F92F);
                TistoryTopAppBarKt.a(function37, composer1, v3 >> 12 & 14, 0);
            }
            else if(topAppBarScrollBehavior0 == null) {
                composer1.startReplaceGroup(0xDC66B11E);
                Modifier modifier0 = TistoryWindowInsetsKt.topInsetsHeight-3ABfNKs(Modifier.Companion, 124.0f);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
                Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function23);
                }
                Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
                composableLambda0.invoke(0.0f, composer1, 54);
                composer1.endNode();
            }
            else {
                composer1.startReplaceGroup(0xDC684D52);
                TopAppBarKt.TopAppBar-if577FI(56.0f, 124.0f, topAppBarScrollBehavior0, composableLambda0, composer1, v3 << 6 & 0x380 | 0xC36);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function33 = function36;
            function35 = function37;
            function21 = function22;
            function34 = function38;
        }
        else {
            composer1.skipToGroupEnd();
            function33 = function30;
            function34 = function32;
            function35 = function31;
            function21 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v3(topAppBarScrollBehavior0, function40, function33, z1, function35, function21, function34, v4, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryOnlyBackAppBar(@Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEDE1B07D);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function00 = d4.a;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEDE1B07D, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryOnlyBackAppBar (TistoryTopAppBar.kt:116)");
            }
            TistoryTopAppBarKt.a(ComposableLambdaKt.rememberComposableLambda(1545102817, true, new e4(function00), composer1, 54), composer1, 6, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f4(function00, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryOnlyCloseAppBar(@Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(-413420728);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function00 = g4.a;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-413420728, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryOnlyCloseAppBar (TistoryTopAppBar.kt:105)");
            }
            TistoryTopAppBarKt.a(ComposableLambdaKt.rememberComposableLambda(0x3FFBAA64, true, new h4(function00), composer1, 54), composer1, 6, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i4(function00, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TistoryTopAppBar-nbWgWpA(@Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, boolean z, @Nullable Function3 function30, @Nullable Function3 function31, @Nullable Function4 function40, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        float f4;
        float f3;
        Function4 function42;
        Function3 function34;
        boolean z1;
        float f2;
        Function4 function41;
        Function3 function33;
        Function3 function32;
        int v2;
        Composer composer1 = composer0.startRestartGroup(56023053);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(topAppBarScrollBehavior0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function32 = function30;
        }
        else if((v & 0x380) == 0) {
            function32 = function30;
            v2 |= (composer1.changedInstance(function32) ? 0x100 : 0x80);
        }
        else {
            function32 = function30;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function33 = function31;
        }
        else if((v & 0x1C00) == 0) {
            function33 = function31;
            v2 |= (composer1.changedInstance(function33) ? 0x800 : 0x400);
        }
        else {
            function33 = function31;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function41 = function40;
        }
        else if((0xE000 & v) == 0) {
            function41 = function40;
            v2 |= (composer1.changedInstance(function41) ? 0x4000 : 0x2000);
        }
        else {
            function41 = function40;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            f2 = f;
        }
        else if((0x70000 & v) == 0) {
            f2 = f;
            v2 |= (composer1.changed(f2) ? 0x20000 : 0x10000);
        }
        else {
            f2 = f;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            z1 = (v1 & 2) == 0 ? z : false;
            if((v1 & 4) != 0) {
                function32 = ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-1$presentation_prodRelease();
            }
            if((v1 & 8) != 0) {
                function33 = ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-2$presentation_prodRelease();
            }
            if((v1 & 16) != 0) {
                function41 = ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-3$presentation_prodRelease();
            }
            if((v1 & 0x20) != 0) {
                f2 = 0.0f;
            }
            float f5 = (v1 & 0x40) == 0 ? f1 : 56.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56023053, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBar (TistoryTopAppBar.kt:39)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xF7F671D7, true, new m4(function32, function33, function41), composer1, 54);
            if(z1) {
                composer1.startReplaceGroup(0xE551A2C5);
                TistoryTopAppBarKt.a(function32, composer1, v2 >> 6 & 14, 0);
            }
            else if(topAppBarScrollBehavior0 == null) {
                composer1.startReplaceGroup(0xE55357AD);
                Modifier modifier0 = TistoryWindowInsetsKt.topInsetsHeight-3ABfNKs(Modifier.Companion, f5);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
                Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    d.a(v3, composer1, v3, function20);
                }
                Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
                composableLambda0.invoke(0.0f, composer1, 54);
                composer1.endNode();
            }
            else {
                composer1.startReplaceGroup(0xE5548FFA);
                TopAppBarKt.TopAppBar-if577FI(f2, f5, topAppBarScrollBehavior0, composableLambda0, composer1, v2 >> 15 & 0x70 | (v2 >> 15 & 14 | 0xC00) | v2 << 6 & 0x380);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function34 = function32;
            f3 = f2;
            f4 = f5;
            function42 = function41;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
            function34 = function32;
            function42 = function41;
            f3 = f2;
            f4 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j4(topAppBarScrollBehavior0, z1, function34, function33, function42, f3, f4, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryTopAppBarCenterTitle(@NotNull String s, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(-980348308);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-980348308, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBarCenterTitle (TistoryTopAppBar.kt:150)");
            }
            TextKt.Text--4IGK_g(s, modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TistoryTopAppBarDefaults.INSTANCE.getTitleTextStyle(), composer1, v2 & 0x7E, 0x180C00, 0xDFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n4(s, modifier1, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TistoryTopAppBarLayout-ygeTB3I(float f, @NotNull Function3 function30, @NotNull Function2 function20, @NotNull Function3 function31, long v, float f1, long v1, float f2, float f3, @Nullable Composer composer0, int v2, int v3) {
        float f7;
        float f6;
        float f5;
        long v6;
        boolean z;
        float f11;
        long v7;
        float f9;
        float f8;
        long v5;
        float f4;
        int v4;
        Intrinsics.checkNotNullParameter(function30, "navigationIcon");
        Intrinsics.checkNotNullParameter(function20, "actions");
        Intrinsics.checkNotNullParameter(function31, "title");
        Composer composer1 = composer0.startRestartGroup(0xD09A0CF3);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            f4 = f1;
        }
        else if((0x70000 & v2) == 0) {
            f4 = f1;
            v4 |= (composer1.changed(f4) ? 0x20000 : 0x10000);
        }
        else {
            f4 = f1;
        }
        if((v3 & 0x40) == 0) {
            v5 = v1;
            if((0x380000 & v2) == 0) {
                v4 |= (composer1.changed(v5) ? 0x100000 : 0x80000);
            }
        }
        else {
            v4 |= 0x180000;
            v5 = v1;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(f3) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                v6 = (v3 & 16) == 0 ? v : 0L;
                if((v3 & 0x20) != 0) {
                    f4 = 1.0f;
                }
                v7 = (v3 & 0x40) == 0 ? v5 : 0L;
                f8 = (v3 & 0x80) == 0 ? f2 : 0.0f;
                if((v3 & 0x100) == 0) {
                    f9 = f3;
                }
                else {
                    v4 &= 0xF1FFFFFF;
                    f9 = f;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                v6 = v;
                f8 = f2;
                f9 = f3;
                v7 = v5;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD09A0CF3, v4, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBarLayout (TistoryTopAppBar.kt:184)");
            }
            float f10 = WindowInsetsKt.asPaddingValues(TistoryWindowInsets.INSTANCE.getTop(composer1, 6), composer1, 0).calculateTopPadding-D9Ej5fM();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SemanticsModifierKt.semantics$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), false, o4.a, 1, null);
            q4 q40 = q4.a;
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Updater.set-impl(composer1, q40, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function21 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                d.a(v8, composer1, v8, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(LayoutIdKt.layoutId(modifier$Companion0, j1.a), 0.0f, 1, null), f10 + 56.0f), 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFB, null), v6, null, 2, null), composer1, 0);
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.b), 20.0f, f10, 0.0f, 0.0f, 12, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                d.a(v9, composer1, v9, function22);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            function30.invoke(rowScopeInstance0, composer1, ((int)((v4 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.e), 0.0f, f10, 20.0f, 0.0f, 9, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                d.a(v10, composer1, v10, function23);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            b.y(composer1, v4 >> 6 & 14, function20);
            Modifier modifier6 = PaddingKt.padding-qDBjuR0(LayoutIdKt.layoutId(modifier$Companion0, j1.c), 20.0f, f10, 20.0f, 4.0f);
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                d.a(v11, composer1, v11, function24);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            function31.invoke(rowScopeInstance0, composer1, ((int)(6 | (v4 & 0x1C00) >> 6 & 0x70)));
            composer1.endNode();
            Modifier modifier8 = LayoutIdKt.layoutId(modifier$Companion0, j1.g);
            composer1.startReplaceGroup(0x8EAAD4F);
            if((v4 & 0xE000000 ^ 0x6000000) > 0x4000000) {
                f11 = f9;
                z = composer1.changed(f11) ? true : (0x6000000 & v4) == 0x4000000;
            }
            else {
                f11 = f9;
                z = (0x6000000 & v4) == 0x4000000;
            }
            r4 r40 = composer1.rememberedValue();
            if(z || r40 == Composer.Companion.getEmpty()) {
                r40 = new r4(f11);
                composer1.updateRememberedValue(r40);
            }
            composer1.endReplaceGroup();
            DividerKt.HorizontalDivider-9IZ8Weo(GraphicsLayerModifierKt.graphicsLayer(modifier8, r40), f8, v7, composer1, v4 >> 12 & 0x380 | v4 >> 18 & 0x70, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f7 = f11;
            f6 = f4;
            v5 = v7;
            f5 = f8;
        }
        else {
            composer1.skipToGroupEnd();
            v6 = v;
            f5 = f2;
            f6 = f4;
            f7 = f3;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s4(f, function30, function20, function31, v6, f6, v5, f5, f7, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryTopAppBarTitle(@NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(1420568590);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1420568590, v1, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBarTitle (TistoryTopAppBar.kt:141)");
            }
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TistoryTopAppBarDefaults.INSTANCE.getTitleTextStyle(), composer1, v1 & 14, 0x180C00, 0xDFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u4(s, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryTopAppBarTitleInfo(@Nullable String s, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD7D708DC);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD7D708DC, v1, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBarTitleInfo (TistoryTopAppBar.kt:160)");
            }
            if(s != null && !p.isBlank(s) == 1) {
                TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TistoryTopAppBarDefaults.INSTANCE.getInfoTextStyle(), composer1, v1 & 14, 0x180000, 0xFFFE);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v4(s, v));
        }
    }

    public static final void a(Function3 function30, Composer composer0, int v, int v1) {
        Function3 function31;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x64F17F9E);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            function31 = function30;
        }
        else if((v & 14) == 0) {
            function31 = function30;
            v2 = (composer1.changedInstance(function31) ? 4 : 2) | v;
        }
        else {
            function31 = function30;
            v2 = v;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Function3 function32 = (v1 & 1) == 0 ? function31 : ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-8$presentation_prodRelease();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x64F17F9E, v2, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBarOnlyNavigation (TistoryTopAppBar.kt:127)");
            }
            Modifier modifier0 = SizeKt.height-3ABfNKs(Modifier.Companion, 56.0f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TistoryTopAppBarKt.TistoryTopAppBarLayout-ygeTB3I(0.0f, function32, ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-9$presentation_prodRelease(), ComposableSingletons.TistoryTopAppBarKt.INSTANCE.getLambda-10$presentation_prodRelease(), 0L, 0.0f, 0L, 0.0f, 0.0f, composer1, v2 << 3 & 0x70 | 0x6030D86, 0xD0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t4(function31, v, v1));
        }
    }

    public static final void access$TistoryCollapsingTopAppBarLayout-8L-wENs(Function3 function30, Function2 function20, Function3 function31, Function3 function32, Function3 function33, long v, long v1, float f, float f1, Composer composer0, int v2, int v3) {
        float f2;
        long v7;
        long v6;
        int v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x90D9A4E3);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function31) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changedInstance(function32) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function33) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x70000 & v2) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) == 0) {
            v5 = (0x380000 & v2) == 0 ? v4 | (composer1.changed(v1) ? 0x100000 : 0x80000) : v4;
        }
        else {
            v5 = v4 | 0x180000;
        }
        if((v3 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(f1) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            long v8 = (v3 & 0x20) == 0 ? v : 0L;
            long v9 = (v3 & 0x40) == 0 ? v1 : 0L;
            float f3 = (v3 & 0x80) == 0 ? f : 0.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x90D9A4E3, v5, -1, "com.kakao.tistory.presentation.widget.common.TistoryCollapsingTopAppBarLayout (TistoryTopAppBar.kt:305)");
            }
            float f4 = WindowInsetsKt.asPaddingValues(TistoryWindowInsets.INSTANCE.getTop(composer1, 6), composer1, 0).calculateTopPadding-D9Ej5fM();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), v8, null, 2, null);
            composer1.startReplaceGroup(-481200501);
            b4 b40 = composer1.rememberedValue();
            if((v5 & 0xE000000) == 0x4000000 || b40 == Composer.Companion.getEmpty()) {
                b40 = new b4(f1);
                composer1.updateRememberedValue(b40);
            }
            composer1.endReplaceGroup();
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, b40, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                d.a(v10, composer1, v10, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(PaddingKt.padding-qDBjuR0(LayoutIdKt.layoutId(modifier$Companion0, j1.f), 20.0f, f4, 20.0f, 4.0f), 0.0f, 0.0f, 1.0f - f1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFB, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                d.a(v11, composer1, v11, function22);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            function31.invoke(rowScopeInstance0, composer1, ((int)((v5 << 3 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(LayoutIdKt.layoutId(modifier$Companion0, j1.a), 0.0f, 1, null), f4 + 56.0f), v8, null, 2, null), composer1, 0);
            Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.b), 20.0f, f4, 0.0f, 0.0f, 12, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                d.a(v12, composer1, v12, function23);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function30.invoke(rowScopeInstance0, composer1, ((int)((v5 << 9 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier6 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.e), 0.0f, f4, 20.0f, 0.0f, 9, null);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v13 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v13)) {
                d.a(v13, composer1, v13, function24);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            b.y(composer1, v5 >> 3 & 14, function20);
            Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.c), 0.0f, f4, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap4 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier8);
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function04);
            }
            else {
                composer1.useNode();
            }
            Function2 function25 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap4);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                d.a(v14, composer1, v14, function25);
            }
            Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
            function32.invoke(rowScopeInstance0, composer1, ((int)((v5 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier10 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, j1.d), 0.0f, f4, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy4 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v15 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap5 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier11 = ComposedModifierKt.materializeModifier(composer1, modifier10);
            Function0 function05 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function05);
            }
            else {
                composer1.useNode();
            }
            Function2 function26 = a.a(composeUiNode$Companion0, composer1, measurePolicy4, composer1, compositionLocalMap5);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v15)) {
                d.a(v15, composer1, v15, function26);
            }
            Updater.set-impl(composer1, modifier11, composeUiNode$Companion0.getSetModifier());
            function33.invoke(rowScopeInstance0, composer1, ((int)((v5 >> 3 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            DividerKt.HorizontalDivider-9IZ8Weo(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(LayoutIdKt.layoutId(modifier$Companion0, j1.g), 0.0f, 0.0f, f1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFB, null), f3, v9, composer1, v5 >> 18 & 0x70 | v5 >> 12 & 0x380, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v7 = v8;
            v6 = v9;
            f2 = f3;
        }
        else {
            composer1.skipToGroupEnd();
            v6 = v1;
            v7 = v;
            f2 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c4(function30, function20, function31, function32, function33, v7, v6, f2, f1, v2, v3));
        }
    }
}

