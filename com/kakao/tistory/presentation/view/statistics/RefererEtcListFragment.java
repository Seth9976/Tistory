package com.kakao.tistory.presentation.view.statistics;

import a;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.data.model.RefererEtcItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.RefererEtcViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "기타유입자세히보기")
@TiaraSection(section = "통계")
@AndroidEntryPoint
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0015²\u0006 \u0010\u0014\u001A\u0016\u0012\u0004\u0012\u00020\r \u0013*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00120\u00128\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "referer", "Referer", "(Lcom/kakao/tistory/data/model/RefererEtcItem;Landroidx/compose/runtime/Composer;I)V", "Companion", "", "kotlin.jvm.PlatformType", "refererItems", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRefererEtcListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefererEtcListFragment.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n21#2,4:145\n1#3:149\n172#4,9:150\n148#5:159\n148#5:160\n148#5,11:197\n148#5:208\n98#6:161\n95#6,6:162\n101#6:196\n105#6:212\n78#7,6:168\n85#7,4:183\n89#7,2:193\n93#7:211\n368#8,9:174\n377#8:195\n378#8,2:209\n4032#9,6:187\n81#10:213\n*S KotlinDebug\n*F\n+ 1 RefererEtcListFragment.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment\n*L\n55#1:145,4\n55#1:149\n55#1:150,9\n91#1:159\n103#1:160\n117#1:197,11\n118#1:208\n89#1:161\n89#1:162,6\n89#1:196\n89#1:212\n89#1:168,6\n89#1:183,4\n89#1:193,2\n89#1:211\n89#1:174,9\n89#1:195\n89#1:209,2\n89#1:187,6\n65#1:213\n*E\n"})
public final class RefererEtcListFragment extends Hilt_RefererEtcListFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final RefererEtcListFragment newInstance() {
            return new RefererEtcListFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;

    static {
        RefererEtcListFragment.Companion = new Companion(null);
        RefererEtcListFragment.$stable = 8;
    }

    public RefererEtcListFragment() {
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RefererEtcViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1008295515);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1008295515, v, -1, "com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment.Content (RefererEtcListFragment.kt:63)");
        }
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new d(this, LiveDataAdapterKt.observeAsState(((RefererEtcViewModel)this.k.getValue()).getRefererEtcItems(), CollectionsKt__CollectionsKt.emptyList(), composer1, 56)), composer1, 0, 0xFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Referer(@NotNull RefererEtcItem refererEtcItem0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(refererEtcItem0, "referer");
        Composer composer1 = composer0.startRestartGroup(0x73793261);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x73793261, v, -1, "com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment.Referer (RefererEtcListFragment.kt:87)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f), false, null, null, new f(this, refererEtcItem0), 7, null), 20.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
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
        ExcludeFontPaddingTextKt.Text-IbK3jfQ("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), composer1, 0, 0x6C30, 0x197FE);
        SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        Modifier modifier2 = SizeKt.widthIn-VpY3zN4$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 7.0f, 2.5f, 0.0f, 0.0f, 12, null), 50.0f, 0.0f, 2, null);
        String s = StringUtils.INSTANCE.getNumberFormat(refererEtcItem0.getCount());
        FontWeight fontWeight0 = FontWeight.Companion.getLight();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0L, null, TextAlign.box-impl(6), 0L, 0, false, false, 1, 0, null, null, composer1, 0x1B0C30, 0x6C00, 0x39D90);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(this, refererEtcItem0, v));
        }
    }

    public static final List access$Content$lambda$0(State state0) {
        return (List)state0.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        RefererEtcViewModel refererEtcViewModel0 = (RefererEtcViewModel)this.k.getValue();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(refererEtcViewModel0.getShowErrorDialog(), lifecycleOwner0, new i(this));
        refererEtcViewModel0.getRefererEtc();
    }
}

