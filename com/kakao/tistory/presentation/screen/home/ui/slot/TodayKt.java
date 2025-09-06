package com.kakao.tistory.presentation.screen.home.ui.slot;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.tooling.preview.Preview.Container;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.room.a;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommonCompositionLocalKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Today;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.TodayEntry;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.TodayEvent;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.TodayNotification;
import com.kakao.tistory.presentation.screen.home.ui.HomeSlotListKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotBlogInfoKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import d;
import e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "TodayPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today;", "uiState", "Today", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Today;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToday.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Today.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/TodayKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n77#2:328\n77#2:356\n77#2:363\n1223#3,6:329\n1223#3,6:335\n1223#3,3:346\n1226#3,3:352\n1223#3,6:357\n488#4:341\n487#4,4:342\n491#4,2:349\n495#4:355\n487#5:351\n148#6:364\n148#6:365\n148#6:366\n148#6:367\n148#6:368\n148#6:369\n148#6:406\n148#6:407\n148#6:452\n148#6:453\n148#6:454\n148#6:455\n148#6:456\n148#6,11:457\n71#7:370\n68#7,6:371\n74#7:405\n78#7:450\n78#8,6:377\n85#8,4:392\n89#8,2:402\n78#8,6:414\n85#8,4:429\n89#8,2:439\n93#8:445\n93#8:449\n368#9,9:383\n377#9:404\n368#9,9:420\n377#9:441\n378#9,2:443\n378#9,2:447\n4032#10,6:396\n4032#10,6:433\n85#11:408\n83#11,5:409\n88#11:442\n92#11:446\n1#12:451\n*S KotlinDebug\n*F\n+ 1 Today.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/TodayKt\n*L\n120#1:328\n171#1:356\n178#1:363\n121#1:329,6\n134#1:335,6\n138#1:346,3\n138#1:352,3\n172#1:357,6\n138#1:341\n138#1:342,4\n138#1:349,2\n138#1:355\n138#1:351\n182#1:364\n183#1:365\n184#1:366\n185#1:367\n213#1:368\n215#1:369\n230#1:406\n232#1:407\n288#1:452\n289#1:453\n316#1:454\n318#1:455\n320#1:456\n324#1:457,11\n208#1:370\n208#1:371,6\n208#1:405\n208#1:450\n208#1:377,6\n208#1:392,4\n208#1:402,2\n227#1:414,6\n227#1:429,4\n227#1:439,2\n227#1:445\n208#1:449\n208#1:383,9\n208#1:404\n227#1:420,9\n227#1:441\n227#1:443,2\n208#1:447,2\n208#1:396,6\n227#1:433,6\n227#1:408\n227#1:409,5\n227#1:442\n227#1:446\n*E\n"})
public final class TodayKt {
    public static final Today a;

    static {
        TodayNotification homeSlotUiStateContent$TodayNotification0;
        ArrayList arrayList0 = new ArrayList(6);
        for(int v = 0; v < 6; ++v) {
            switch(v) {
                case 0: {
                    homeSlotUiStateContent$TodayNotification0 = new TodayNotification("", 0, "1", null, m3.a, false, "스토리 크리에이터 제도를 소개합니다. 스토리 크리에이터 제도를 소개합니다.스토리 크리에이터 제도를 소개합니다.", "스토리에서 특정 분야에 전문성 있는 창작자를 지원해 드려요.스토리에서 특정 분야에 전문성 있는 창작자를 지원해 드려요.", 10, null);
                    break;
                }
                case 1: {
                    ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toBlogThumbnailItem("1");
                    homeSlotUiStateContent$TodayNotification0 = new TodayEntry("", 0, "1", null, "새로운 시작, 미니멀리즘으로 정리하는 삶의 기술", false, k3.a, thumbnailUiState0, "청량리프", l3.a, null, 0L, 0xC2A, null);
                    break;
                }
                case 2: {
                    homeSlotUiStateContent$TodayNotification0 = new TodayNotification("", 0, "1", null, n3.a, true, null, null, 10, null);
                    break;
                }
                case 3: {
                    homeSlotUiStateContent$TodayNotification0 = new TodayNotification("", 0, "1", "11", o3.a, true, "title " + 3, "subTitle " + 3, 2, null);
                    break;
                }
                case 4: {
                    homeSlotUiStateContent$TodayNotification0 = new TodayEvent("", 0, "1", null, p3.a, true, null, null, 202, null);
                    break;
                }
                default: {
                    homeSlotUiStateContent$TodayNotification0 = new TodayEvent("", 0, "1", null, q3.a, false, null, null, 202, null);
                }
            }
            arrayList0.add(homeSlotUiStateContent$TodayNotification0);
        }
        TodayKt.a = new Today(null, null, arrayList0, 3, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Today(@NotNull Today homeSlotUiState$Today0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Today0, "uiState");
        Composer composer1 = composer0.startRestartGroup(-1403155644);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1403155644, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Today (Today.kt:118)");
        }
        Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer1.startReplaceGroup(0xC5134C11);
        AccessibilityManager accessibilityManager0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(accessibilityManager0 == composer$Companion0.getEmpty()) {
            Object object0 = context0.getSystemService("accessibility");
            accessibilityManager0 = object0 instanceof AccessibilityManager ? ((AccessibilityManager)object0) : null;
            composer1.updateRememberedValue(accessibilityManager0);
        }
        composer1.endReplaceGroup();
        boolean z = accessibilityManager0 != null && accessibilityManager0.isEnabled();
        int v1 = homeSlotUiState$Today0.getContents().size();
        int v2 = 0x3FFFFFFF - 0x3FFFFFFF % v1;
        composer1.startReplaceGroup(-988576707);
        d3 d30 = composer1.rememberedValue();
        if(d30 == composer$Companion0.getEmpty()) {
            d30 = new d3();
            composer1.updateRememberedValue(d30);
        }
        composer1.endReplaceGroup();
        PagerState pagerState0 = PagerStateKt.rememberPagerState(v2, 0.0f, d30, composer1, 0x180, 2);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        w2 w20 = new w2(pagerState0, coroutineScope0, null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, w20, composer1, 70);
        EffectsKt.LaunchedEffect(pagerState0.getCurrentPage(), ((long)(z ? 15000L : 4000L)), new y2((z ? 15000L : 4000L), coroutineScope0, pagerState0, v2, null), composer1, 0x200);
        Boolean boolean0 = (Boolean)composer1.consume(CommonCompositionLocalKt.getLocalRefreshingState());
        boolean z1 = boolean0.booleanValue();
        composer1.startReplaceGroup(0xC5141894);
        boolean z2 = composer1.changed(z1);
        boolean z3 = composer1.changed(pagerState0);
        boolean z4 = composer1.changed(v2);
        z2 z20 = composer1.rememberedValue();
        if((z2 | z3 | z4) != 0 || z20 == composer$Companion0.getEmpty()) {
            z20 = new z2(z1, pagerState0, v2, null);
            composer1.updateRememberedValue(z20);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolean0, z20, composer1, 0x40);
        boolean z5 = ((Boolean)composer1.consume(HomeSlotListKt.getHomeListSingleLane())).booleanValue();
        SlotContainerKt.SlotContainer(null, false, PaddingKt.PaddingValues-a9UjIt4(20.0f, (z5 ? 4.0f : 20.0f), 20.0f, (z5 ? 0.0f : 10.0f)), ComposableLambdaKt.rememberComposableLambda(0x4F7BB289, true, new b3(pagerState0, v1, homeSlotUiState$Today0), composer1, 54), composer1, 0xC00, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c3(homeSlotUiState$Today0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Container({@Preview(showBackground = true, widthDp = 375), @Preview(showBackground = true, widthDp = 675), @Preview(showBackground = true, widthDp = 275)})
    public static final void TodayPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2ED4BF4B);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2ED4BF4B, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TodayPreview (Today.kt:111)");
            }
            TodayKt.Today(TodayKt.a, composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f3(v));
        }
    }

    public static final void a(BoxScope boxScope0, String s, boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x32D0E470);
        int v1 = (v & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x32D0E470, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TypeBubble (Today.kt:308)");
            }
            TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(PaddingKt.padding-VpY3zN4(ModifierKt.shape-8ww4TTg$default(PaddingKt.padding-qDBjuR0$default(boxScope0.align(Modifier.Companion, Alignment.Companion.getTopEnd()), 0.0f, 16.0f, 16.0f, 0.0f, 9, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), 0L, BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, Color.copy-wmQWz5c$default(0L, (z ? 0.08f : 0.2f), 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, 10, null), 8.0f, 4.5f), false, i3.a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize11Weight400(), composer1, v1 >> 3 & 14, 0x180000, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j3(boxScope0, s, z, v));
        }
    }

    public static final void a(ColumnScope columnScope0, TodayEntry homeSlotUiStateContent$TodayEntry0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x27CE694C);
        int v1 = (v & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(homeSlotUiStateContent$TodayEntry0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x27CE694C, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.EntryContent (Today.kt:281)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_quotes, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_entry, composer1, 0), SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 2.0f, 0.0f, 0.0f, 0.0f, 14, null), 20.0f), 0L, composer1, 0xD88, 0);
            TextKt.Text--4IGK_g(homeSlotUiStateContent$TodayEntry0.getTitle(), columnScope0.weight(SemanticsModifierKt.semantics$default(Modifier.Companion, false, r2.a, 1, null), 1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, TTextStyle.INSTANCE.getSize22Weight700(), composer1, 0x180, 0x180C30, 0xD7F8);
            SlotBlogInfoKt.SlotBlogInfoOnImage(homeSlotUiStateContent$TodayEntry0, null, composer1, v1 >> 3 & 14, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s2(columnScope0, homeSlotUiStateContent$TodayEntry0, v));
        }
    }

    public static final void a(ColumnScope columnScope0, boolean z, String s, String s1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-690854227);
        int v1 = (v & 0x70) == 0 ? (composer1.changed(z) ? 0x20 : 16) | v : v;
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(s1) ? 0x800 : 0x400);
        }
        if((v1 & 5841) != 0x490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690854227, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TodayTitle (Today.kt:257)");
            }
            String s2 = null;
            String s3 = s == null || p.isBlank(s) ? null : s;
            composer1.startReplaceGroup(0xFB1FBD7B);
            if(s3 != null) {
                TextKt.Text-IbK3jfQ(StringUtils.INSTANCE.toAnnotatedStringFromHtmlText(s3, composer1, 0x40), SemanticsModifierKt.semantics$default(Modifier.Companion, false, g3.a, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, TTextStyle.INSTANCE.getSize22Weight500(), composer1, 0, 0xC00030, 0x1F7F8);
            }
            composer1.endReplaceGroup();
            if(s1 != null && !p.isBlank(s1)) {
                s2 = s1;
            }
            if(s2 != null) {
                TextKt.Text--4IGK_g(StringUtils.INSTANCE.removeHtmlTag(s2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0, 0x180030, 0xF7FA);
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
            scopeUpdateScope0.updateScope(new h3(columnScope0, z, s, s1, v));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCED9780B);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCED9780B, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TodayDim (Today.kt:244)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.copy-wmQWz5c$default(TColor.INSTANCE.getBlack-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e3(v));
        }
    }

    public static final void access$PageContent(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Today homeSlotUiStateContent$Today0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(880973677);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Today0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(880973677, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.PageContent (Today.kt:206)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 1.5f, false, 2, null);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
            boolean z = !homeSlotUiStateContent$Today0.isLight();
            Modifier modifier1 = ModifierKt.shape-8ww4TTg$default(modifier0, roundedCornerShape0, 0L, BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, 8, null);
            Function0 function00 = homeSlotUiStateContent$Today0.getOnClick();
            Modifier modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier1, false, StringResources_androidKt.stringResource(string.content_desc_move, composer1, 0), null, function00, 5, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            String s = homeSlotUiStateContent$Today0.getImage();
            Modifier modifier4 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            CommonImageKt.CommonImage(s, null, modifier4, null, null, null, composer1, 0x1B0, 56);
            composer1.startReplaceGroup(0xA48C256C);
            if(homeSlotUiStateContent$Today0 instanceof TodayEntry) {
                TodayKt.a(composer1, 0);
            }
            composer1.endReplaceGroup();
            String s1 = homeSlotUiStateContent$Today0.getBoxTitle();
            composer1.startReplaceGroup(0xA48C3352);
            if(s1 == null) {
                s1 = StringResources_androidKt.stringResource(homeSlotUiStateContent$Today0.getTypeLabel(), composer1, 0);
            }
            composer1.endReplaceGroup();
            TodayKt.a(boxScopeInstance0, s1, homeSlotUiStateContent$Today0.isLight(), composer1, 6);
            Modifier modifier5 = SemanticsModifierKt.semantics$default(PaddingKt.padding-qDBjuR0(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 42.0f, 54.0f, 20.0f), false, t2.a, 1, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-D5KLDUw(8.0f, alignment$Companion0.getBottom()), alignment$Companion0.getStart(), composer1, 6);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            if(homeSlotUiStateContent$Today0 instanceof TodayNotification) {
                composer1.startReplaceGroup(0x6843BDD3);
                TodayKt.a(columnScopeInstance0, homeSlotUiStateContent$Today0.isLight(), homeSlotUiStateContent$Today0.getTitle(), homeSlotUiStateContent$Today0.getSubTitle(), composer1, 6);
            }
            else if(homeSlotUiStateContent$Today0 instanceof TodayEvent) {
                composer1.startReplaceGroup(0x6843CC73);
                TodayKt.a(columnScopeInstance0, homeSlotUiStateContent$Today0.isLight(), homeSlotUiStateContent$Today0.getTitle(), homeSlotUiStateContent$Today0.getSubTitle(), composer1, 6);
            }
            else if(homeSlotUiStateContent$Today0 instanceof TodayEntry) {
                composer1.startReplaceGroup(1749277420);
                TodayKt.a(columnScopeInstance0, ((TodayEntry)homeSlotUiStateContent$Today0), composer1, 6);
            }
            else {
                composer1.startReplaceGroup(0xA0383289);
            }
            composer1.endReplaceGroup();
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u2(homeSlotUiStateContent$Today0, v));
        }
    }
}

