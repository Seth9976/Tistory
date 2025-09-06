package com.kakao.tistory.presentation.view.home;

import a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.text.font.FontWeight;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.CloseBlack;
import com.kakao.tistory.presentation.viewmodel.RefererKeywordViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001A\u0010\u000F\u001A\u00020\u000E8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u0014\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/RefererKeywordListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "initAppBar", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "keywords", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRefererKeywordListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefererKeywordListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererKeywordListActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,132:1\n10#2,2:133\n1#3:135\n75#4,13:136\n148#5:149\n148#5,11:150\n158#5:197\n148#5:198\n148#5:199\n148#5,11:200\n71#6:161\n68#6,6:162\n74#6:196\n78#6:254\n78#7,6:168\n85#7,4:183\n89#7,2:193\n78#7,6:218\n85#7,4:233\n89#7,2:243\n93#7:249\n93#7:253\n368#8,9:174\n377#8:195\n368#8,9:224\n377#8:245\n378#8,2:247\n378#8,2:251\n4032#9,6:187\n4032#9,6:237\n98#10:211\n95#10,6:212\n101#10:246\n105#10:250\n81#11:255\n*S KotlinDebug\n*F\n+ 1 RefererKeywordListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererKeywordListActivity\n*L\n46#1:133,2\n46#1:135\n46#1:136,13\n91#1:149\n92#1:150,11\n98#1:197\n99#1:198\n101#1:199\n102#1:200,11\n89#1:161\n89#1:162,6\n89#1:196\n89#1:254\n89#1:168,6\n89#1:183,4\n89#1:193,2\n94#1:218,6\n94#1:233,4\n94#1:243,2\n94#1:249\n89#1:253\n89#1:174,9\n89#1:195\n94#1:224,9\n94#1:245\n94#1:247,2\n89#1:251,2\n89#1:187,6\n94#1:237,6\n94#1:211\n94#1:212,6\n94#1:246\n94#1:250\n69#1:255\n*E\n"})
public final class RefererKeywordListActivity extends Hilt_RefererKeywordListActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/home/RefererKeywordListActivity$Companion;", "", "", "EXTRA_REFERER_KEYWORD_LIST", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_REFERER_KEYWORD_LIST = "EXTRA_REFERER_KEYWORD_LIST";
    public final BaseViewModelLazy s;

    static {
        RefererKeywordListActivity.Companion = new Companion(null);
        RefererKeywordListActivity.$stable = 8;
    }

    public RefererKeywordListActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(RefererKeywordViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(875060054);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875060054, v, -1, "com.kakao.tistory.presentation.view.home.RefererKeywordListActivity.Content (RefererKeywordListActivity.kt:67)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((RefererKeywordViewModel)this.s.getValue()).getRefererKeyword(), composer1, 8);
        LazyDslKt.LazyColumn(null, LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3), null, false, null, null, null, false, new f(state0, this), composer1, 0, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(this, modifier0, v));
        }
    }

    public static final List access$Content$lambda$1(State state0) {
        return (List)state0.getValue();
    }

    public static final void access$KeywordItem(RefererKeywordListActivity refererKeywordListActivity0, RefererKeywordItem statisticsItem$RefererKeywordItem0, Composer composer0, int v) {
        refererKeywordListActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(362990507);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(362990507, v, -1, "com.kakao.tistory.presentation.view.home.RefererKeywordListActivity.KeywordItem (RefererKeywordListActivity.kt:87)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f), 20.0f, 0.0f, 34.5f, 0.0f, 10, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
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
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(ModifierKt.roundedBackground-oZzcvok$default(modifier$Companion0, 0, color.gray3, 0.5f, 18.0f, 1, null), 36.0f), 15.0f, 0.0f, 15.0f, 1.5f, 2, null);
        Modifier modifier3 = BoxScopeInstance.INSTANCE.align(modifier2, alignment$Companion0.getCenterStart());
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
        ExcludeFontPaddingTextKt.Text-IbK3jfQ("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1(), composer1, 0, 0x6C30, 0x197FE);
        String s = StringUtils.INSTANCE.getNumberFormat(statisticsItem$RefererKeywordItem0.getCount());
        FontWeight fontWeight0 = FontWeight.Companion.getLight();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141500000L, null, fontWeight0, TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, 0x1B0C00, 0x6030, 243602);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(refererKeywordListActivity0, statisticsItem$RefererKeywordItem0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.initAppBarHomeAsUp(CloseBlack.INSTANCE);
        this.setTitle(string.label_home_statistics_referer_keyword);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        List list0;
        super.onCreate(bundle0);
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "통계", "유입키워드", null, null, null, null, null, 0x7C, null);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                ArrayList arrayList0 = bundle1.getParcelableArrayList("EXTRA_REFERER_KEYWORD_LIST");
                RefererKeywordViewModel refererKeywordViewModel0 = (RefererKeywordViewModel)this.s.getValue();
                if(arrayList0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    list0 = CollectionsKt___CollectionsKt.toList(arrayList0);
                    if(list0 == null) {
                        list0 = CollectionsKt__CollectionsKt.emptyList();
                    }
                }
                refererKeywordViewModel0.setRefKeywordList(list0);
            }
        }
    }
}

