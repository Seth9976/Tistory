package com.kakao.tistory.presentation.view.home;

import a5.b;
import a;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.q;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.data.model.StatisticsItem.RefererLog;
import com.kakao.tistory.data.model.StatisticsItem.RefererLogItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.coil.ImageModifiers;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.CloseBlack;
import com.kakao.tistory.presentation.viewmodel.RefererLogViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "유입로그")
@TiaraSection(section = "통계")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u000F\u0010\u0010JL\u0010\u001B\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132!\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00060\u0015H\u0007¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u001D\u0010\u0003R\u001A\u0010\u001E\u001A\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006%²\u0006\u000E\u0010$\u001A\u0004\u0018\u00010#8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/RefererLogListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "RefererLogList", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;", "item", "", "isShowTopReferer", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "onClick", "RefererLogItem", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/data/model/StatisticsItem$RefererLogItem;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "initAppBar", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "logList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRefererLogListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefererLogListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererLogListActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n10#2,2:215\n10#2,2:231\n1#3:217\n1#3:233\n75#4,13:218\n75#4,13:234\n148#5:247\n148#5:248\n148#5:285\n148#5:286\n98#6:249\n95#6,6:250\n101#6:284\n105#6:333\n78#7,6:256\n85#7,4:271\n89#7,2:281\n78#7,6:297\n85#7,4:312\n89#7,2:322\n93#7:328\n93#7:332\n368#8,9:262\n377#8:283\n368#8,9:303\n377#8:324\n378#8,2:326\n378#8,2:330\n4032#9,6:275\n4032#9,6:316\n95#10,2:287\n71#11:289\n67#11,7:290\n74#11:325\n78#11:329\n81#12:334\n*S KotlinDebug\n*F\n+ 1 RefererLogListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererLogListActivity\n*L\n59#1:215,2\n60#1:231,2\n59#1:217\n60#1:233\n59#1:218,13\n60#1:234,13\n119#1:247\n120#1:248\n126#1:285\n138#1:286\n115#1:249\n115#1:250,6\n115#1:284\n115#1:333\n115#1:256,6\n115#1:271,4\n115#1:281,2\n147#1:297,6\n147#1:312,4\n147#1:322,2\n147#1:328\n115#1:332\n115#1:262,9\n115#1:283\n147#1:303,9\n147#1:324\n147#1:326,2\n115#1:330,2\n115#1:275,6\n147#1:316,6\n141#1:287,2\n147#1:289\n147#1:290,7\n147#1:325\n147#1:329\n82#1:334\n*E\n"})
public final class RefererLogListActivity extends Hilt_RefererLogListActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/RefererLogListActivity$Companion;", "", "", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_BLOG_NAME";
    public final BaseViewModelLazy s;
    public final BaseViewModelLazy t;

    static {
        RefererLogListActivity.Companion = new Companion(null);
        RefererLogListActivity.$stable = 8;
    }

    public RefererLogListActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.t = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(RefererLogViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0xE93D276);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE93D276, v, -1, "com.kakao.tistory.presentation.view.home.RefererLogListActivity.Content (RefererLogListActivity.kt:72)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        this.ToolbarVisibilityHandler(lazyListState0, composer1, 0x40);
        this.RefererLogList(lazyListState0, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererLogItem(@Nullable Modifier modifier0, @NotNull RefererLogItem statisticsItem$RefererLogItem0, boolean z, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(statisticsItem$RefererLogItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xB1D961BA);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB1D961BA, v, -1, "com.kakao.tistory.presentation.view.home.RefererLogListActivity.RefererLogItem (RefererLogListActivity.kt:113)");
        }
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Modifier modifier2 = SizeKt.height-3ABfNKs(PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(modifier1, false, null, null, new j(statisticsItem$RefererLogItem0, function10), 7, null), 20.0f, 0.0f, 2, null), 52.0f);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        CommonImageKt.CommonImage(statisticsItem$RefererLogItem0.getServiceIcon(), null, SizeKt.size-3ABfNKs(modifier$Companion0, 14.0f).then(ImageModifiers.INSTANCE.getROUNDED_CORNER_3_NO_BORDER(composer1, 6)), null, null, null, composer1, 0x30, 56);
        composer1.startReplaceGroup(0xAFB9F8F);
        String s = TextUtils.isEmpty(statisticsItem$RefererLogItem0.getKeyword()) ? statisticsItem$RefererLogItem0.getRefUrl() : StringResources_androidKt.stringResource(string.label_home_statistics_referer_log_title, new Object[]{(statisticsItem$RefererLogItem0.getKeyword() == null ? "" : statisticsItem$RefererLogItem0.getKeyword()), (statisticsItem$RefererLogItem0.getRefUrl() == null ? "" : statisticsItem$RefererLogItem0.getRefUrl())}, composer1, 0x40);
        composer1.endReplaceGroup();
        Modifier modifier4 = RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 6.0f, 0.0f, 6.0f, 0.0f, 10, null), 1.0f, false, 2, null);
        if(s == null) {
            s = "";
        }
        TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier4, 0L, 0L, null, null, null, 0x1BDCCCCCDL, null, null, 0L, 2, false, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), composer1, 0, 0x6030, 112508);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        if(z) {
            composer1.startReplaceGroup(0x33795B63);
            Long long0 = statisticsItem$RefererLogItem0.getPv();
            String s1 = StringUtils.INSTANCE.getNumberFormat(Math.abs((long0 == null ? 0L : ((long)long0))));
            FontWeight fontWeight1 = FontWeight.Companion.getLight();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, null, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141400000L, null, fontWeight1, TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, 0x1B0C00, 0x6030, 243602);
        }
        else {
            composer1.startReplaceGroup(0x3372F7E5);
            FontWeight fontWeight0 = FontWeight.Companion.getLight();
            long v4 = ColorResources_androidKt.colorResource(color.gray2, composer1, 0);
            DateTimeTextKt.DateTimeText-Vc6wB30(statisticsItem$RefererLogItem0.getTimestamp(), DateTimeFormat.DATE_TIME_FORMAT_M_d_HH_mm, false, TypeKt.getTFont(), fontWeight0, 0x141400000L, v4, null, composer1, 0x36C30, 0x84);
        }
        composer1.endReplaceGroup();
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(this, modifier1, statisticsItem$RefererLogItem0, z, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererLogList(@NotNull LazyListState lazyListState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "state");
        Composer composer1 = composer0.startRestartGroup(0x4989D5BC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4989D5BC, v, -1, "com.kakao.tistory.presentation.view.home.RefererLogListActivity.RefererLogList (RefererLogListActivity.kt:80)");
        }
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new n(this, LiveDataAdapterKt.observeAsState(((RefererLogViewModel)this.t.getValue()).getRefererLog(), composer1, 8)), composer1, v << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(this, lazyListState0, v));
        }
    }

    public static final void a(RefererLogListActivity refererLogListActivity0, SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(refererLogListActivity0, "this$0");
        if(sortItem0 != null) {
            ((RefererLogViewModel)refererLogListActivity0.t.getValue()).updateReferLog(sortItem0);
        }
    }

    public static final void a(TopViewModel topViewModel0, RefererLogListActivity refererLogListActivity0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(topViewModel0, "$this_apply");
        Intrinsics.checkNotNullParameter(refererLogListActivity0, "this$0");
        if(!boolean0.booleanValue()) {
            return;
        }
        List list0 = (List)topViewModel0.getSortItems().getValue();
        if(list0 != null) {
            CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
            commonBottomDialogFragment0.setItems(list0);
            commonBottomDialogFragment0.setOnSelectedItem(new p(topViewModel0));
            commonBottomDialogFragment0.show(refererLogListActivity0.getSupportFragmentManager(), "CommonBottomDialogFragment");
        }
    }

    public final void a(String s) {
        TopViewModel topViewModel0 = (TopViewModel)this.s.getValue();
        String s1 = this.getString(string.label_home_statistics_referer_log);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        String s2 = this.getString(string.label_latest_days);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        TopViewModel.setTopView$default(topViewModel0, s1, b.f(1, s2, "format(...)", new Object[]{3}), ((RefererLogViewModel)this.t.getValue()).getSortItems(), null, 8, null);
        topViewModel0.getShowBottomSortDialog().observe(this, new gc.b(4, topViewModel0, this));
        topViewModel0.getSelectedSortItem().observe(this, new q(this, 9));
        RefererLogViewModel refererLogViewModel0 = (RefererLogViewModel)this.t.getValue();
        ((RefererLogViewModel)this.t.getValue()).init(s);
        LiveDataExtensionKt.observeEvent(refererLogViewModel0.getGoToWeb(), this, new com.kakao.tistory.presentation.view.home.q(this));
    }

    public static final RefererLog access$RefererLogList$lambda$0(State state0) {
        return (RefererLog)state0.getValue();
    }

    public static final RefererLogViewModel access$getRefererLogViewModel(RefererLogListActivity refererLogListActivity0) {
        return (RefererLogViewModel)refererLogListActivity0.t.getValue();
    }

    public static final TopViewModel access$getTopViewModel(RefererLogListActivity refererLogListActivity0) {
        return (TopViewModel)refererLogListActivity0.s.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.initAppBarHomeAsUp(CloseBlack.INSTANCE);
        this.setTitle(string.label_home_statistics_referer_log);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        String s;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            s = null;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            s = bundle1 == null ? null : bundle1.getString("EXTRA_BLOG_NAME");
        }
        this.initAppBar();
        this.a(s);
    }
}

