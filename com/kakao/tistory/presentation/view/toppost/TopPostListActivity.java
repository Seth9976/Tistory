package com.kakao.tistory.presentation.view.toppost;

import a;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import com.kakao.tistory.presentation.viewmodel.TopPostViewModel;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
@AndroidEntryPoint
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ=\u0010\u0016\u001A\u00020\u00062\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006!²\u0006\u000E\u0010\u001A\u001A\u0004\u0018\u00010\u00198\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001B\u001A\u0004\u0018\u00010\u00108\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\u001D\u0018\u00010\u001C8\nX\u008A\u0084\u0002²\u0006\u000E\u0010 \u001A\u0004\u0018\u00010\u001F8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001B\u001A\u0004\u0018\u00010\u00108\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/toppost/TopPostListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryAppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "initViewModel", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PreviewTopPostAppbar", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/viewmodel/TopEntriesSortType;", "currentType", "Lkotlin/Function1;", "onClickItem", "Lkotlin/Function0;", "onDismiss", "SortBottomSheet", "(Lcom/kakao/tistory/presentation/viewmodel/TopEntriesSortType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Companion", "", "titleInfo", "sortType", "", "Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel$TopEntryItem;", "topPostList", "", "showSortBottomSheet", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTopPostListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopPostListActivity.kt\ncom/kakao/tistory/presentation/view/toppost/TopPostListActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,222:1\n10#2,2:223\n1#3:225\n75#4,13:226\n85#5:239\n82#5,6:240\n88#5:274\n92#5:284\n85#5:285\n82#5,6:286\n88#5:320\n92#5:324\n78#6,6:246\n85#6,4:261\n89#6,2:271\n93#6:283\n78#6,6:292\n85#6,4:307\n89#6,2:317\n93#6:323\n368#7,9:252\n377#7:273\n378#7,2:281\n368#7,9:298\n377#7:319\n378#7,2:321\n4032#8,6:265\n4032#8,6:311\n1223#9,6:275\n81#10:325\n81#10:326\n81#10:327\n81#10:328\n81#10:329\n*S KotlinDebug\n*F\n+ 1 TopPostListActivity.kt\ncom/kakao/tistory/presentation/view/toppost/TopPostListActivity\n*L\n58#1:223,2\n58#1:225\n58#1:226,13\n111#1:239\n111#1:240,6\n111#1:274\n111#1:284\n188#1:285\n188#1:286,6\n188#1:320\n188#1:324\n111#1:246,6\n111#1:261,4\n111#1:271,2\n111#1:283\n188#1:292,6\n188#1:307,4\n188#1:317,2\n188#1:323\n111#1:252,9\n111#1:273\n111#1:281,2\n188#1:298,9\n188#1:319\n188#1:321,2\n111#1:265,6\n188#1:311,6\n128#1:275,6\n117#1:325\n118#1:326\n126#1:327\n145#1:328\n147#1:329\n*E\n"})
public final class TopPostListActivity extends Hilt_TopPostListActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/view/toppost/TopPostListActivity$Companion;", "", "", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_DATE", "EXTRA_GRANULARITY", "EXTRA_IS_MINE", "PERIOD", "RECENT_7", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_BLOG_NAME = "EXTRA_TOP_POST_BLOG_NAME";
    @NotNull
    public static final String EXTRA_DATE = "EXTRA_TOP_POST_DATE";
    @NotNull
    public static final String EXTRA_GRANULARITY = "EXTRA_TOP_POST_GRANULARITY";
    @NotNull
    public static final String EXTRA_IS_MINE = "EXTRA_IS_MINE";
    public String g;
    public String h;
    public String i;
    public boolean j;
    public final BaseViewModelLazy k;

    static {
        TopPostListActivity.Companion = new Companion(null);
        TopPostListActivity.$stable = 8;
    }

    public TopPostListActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopPostViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x8036778);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8036778, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.Content (TopPostListActivity.kt:107)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
        Modifier modifier1 = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(modifier0, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        State state0 = LiveDataAdapterKt.observeAsState(((TopPostViewModel)this.k.getValue()).getTitleInfo(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(((TopPostViewModel)this.k.getValue()).getSortType(), composer1, 8);
        this.a(topAppBarScrollBehavior0, ((String)state0.getValue()), ((TopEntriesSortType)state1.getValue()), new com.kakao.tistory.presentation.view.toppost.d(this), composer1, 0x8000, 0);
        State state2 = LiveDataAdapterKt.observeAsState(((TopPostViewModel)this.k.getValue()).getTopEntries(), composer1, 8);
        Modifier modifier3 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        composer1.startReplaceGroup(-691900347);
        boolean z = composer1.changed(state2);
        e e0 = composer1.rememberedValue();
        if(z || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(state2);
            composer1.updateRememberedValue(e0);
        }
        composer1.endReplaceGroup();
        LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, e0, composer1, 6, 0xFE);
        composer1.endNode();
        if(Intrinsics.areEqual(((Boolean)LiveDataAdapterKt.observeAsState(((TopPostViewModel)this.k.getValue()).getShowSortBottomSheet(), composer1, 8).getValue()), Boolean.TRUE)) {
            this.SortBottomSheet(((TopEntriesSortType)LiveDataAdapterKt.observeAsState(((TopPostViewModel)this.k.getValue()).getSortType(), composer1, 8).getValue()), new f(this), new g(this), composer1, 0x1000, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public final void PreviewTopPostAppbar(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFCAB9FD1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFCAB9FD1, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.PreviewTopPostAppbar (TopPostListActivity.kt:184)");
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, composer1, TopAppBarDefaults.$stable << 12, 15);
        Modifier modifier0 = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
        this.a(topAppBarScrollBehavior0, "최근 7일", TopEntriesSortType.LIKE, null, composer1, 33200, 8);
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, i.a, composer1, 0x6000000, 0xFF);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SortBottomSheet(@Nullable TopEntriesSortType topEntriesSortType0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function10, "onClickItem");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(-583300160);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(topEntriesSortType0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                topEntriesSortType0 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583300160, v2, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.SortBottomSheet (TopPostListActivity.kt:207)");
            }
            TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, function00, ComposableLambdaKt.rememberComposableLambda(-767347003, true, new l(topEntriesSortType0, function10), composer1, 54), composer1, v2 >> 3 & 0x70 | 0x180, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, topEntriesSortType0, function10, function00, v, v1));
        }
    }

    public final void a(TopAppBarScrollBehavior topAppBarScrollBehavior0, String s, TopEntriesSortType topEntriesSortType0, Function0 function00, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x1FAAF847);
        Function0 function01 = (v1 & 8) == 0 ? function00 : n.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1FAAF847, v, -1, "com.kakao.tistory.presentation.view.toppost.TopPostListActivity.TopPostAppbar (TopPostListActivity.kt:163)");
        }
        TistoryTopAppBarKt.TistoryCollapsingTopAppBar-88mDfTA(topAppBarScrollBehavior0, ComposableSingletons.TopPostListActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), ComposableLambdaKt.rememberComposableLambda(0x9C7DCC73, true, new o(s), composer1, 54), false, ComposableLambdaKt.rememberComposableLambda(0xE33DA2B1, true, new q(this), composer1, 54), null, ComposableLambdaKt.rememberComposableLambda(0x29FD78EF, true, new r(topEntriesSortType0, function01), composer1, 54), 0L, composer1, v & 14 | 0x1861B0, 0xA8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(this, topAppBarScrollBehavior0, s, topEntriesSortType0, function01, v, v1));
        }
    }

    public static final List access$Content$lambda$6$lambda$4(State state0) {
        return (List)state0.getValue();
    }

    public static final TopPostViewModel access$getTopPostViewModel(TopPostListActivity topPostListActivity0) {
        return (TopPostViewModel)topPostListActivity0.k.getValue();
    }

    public final void initViewModel() {
        TopPostViewModel topPostViewModel0 = (TopPostViewModel)this.k.getValue();
        LiveDataExtensionKt.observeEvent(topPostViewModel0.getGoToStatisticsActivity(), this, new t(this));
        LiveDataExtensionKt.observeEvent(topPostViewModel0.getGoToEntryActivity(), this, new u(this));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity
    public void onCreate(@Nullable Bundle bundle0) {
        boolean z;
        String s2;
        String s1;
        Unit unit0;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            unit0 = null;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 == null) {
                unit0 = null;
            }
            else {
                String s = bundle1.getString("EXTRA_TOP_POST_BLOG_NAME");
                if(s == null) {
                    unit0 = null;
                }
                else {
                    this.g = s;
                    unit0 = Unit.INSTANCE;
                }
            }
        }
        if(unit0 == null) {
            this.finish();
        }
        Intent intent1 = this.getIntent();
        if(intent1 == null) {
            s1 = null;
        }
        else {
            Bundle bundle2 = intent1.getExtras();
            s1 = bundle2 == null ? null : bundle2.getString("EXTRA_TOP_POST_DATE");
        }
        this.h = s1;
        Intent intent2 = this.getIntent();
        if(intent2 == null) {
            s2 = null;
        }
        else {
            Bundle bundle3 = intent2.getExtras();
            s2 = bundle3 == null ? null : bundle3.getString("EXTRA_TOP_POST_GRANULARITY");
        }
        this.i = s2;
        Intent intent3 = this.getIntent();
        if(intent3 == null) {
            z = false;
        }
        else {
            Bundle bundle4 = intent3.getExtras();
            z = bundle4 == null ? false : bundle4.getBoolean("EXTRA_IS_MINE");
        }
        this.j = z;
        ((TopPostViewModel)this.k.getValue()).init(this.j);
        TopPostViewModel topPostViewModel0 = (TopPostViewModel)this.k.getValue();
        String s3 = this.g;
        if(s3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogName");
            s3 = null;
        }
        topPostViewModel0.getTopPosts(s3, this.h, this.i);
        this.initViewModel();
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "통계", "인기글목록", null, null, null, null, null, 0x7C, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0x1B9C5FA6, true, new w(this)), 1, null);
    }
}

