package com.kakao.tistory.presentation.view.setting.secretLab;

import a;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.viewmodel.SecretLabViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00060\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0014\u001A\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001D²\u0006\u000E\u0010\u0019\u001A\u0004\u0018\u00010\u00188\nX\u008A\u0084\u0002²\u0006\u0012\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/secretLab/SecretLabActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "title", "Lkotlin/Function0;", "onclick", "CommonItem", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "", "Lcom/kakao/tistory/domain/entity/ServerHost;", "serverHostList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSecretLabActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretLabActivity.kt\ncom/kakao/tistory/presentation/view/setting/secretLab/SecretLabActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,195:1\n10#2,2:196\n1#3:198\n75#4,13:199\n158#5:212\n148#5:213\n148#5:214\n158#5:215\n148#5:218\n148#5:219\n148#5:256\n95#6,2:216\n98#7:220\n95#7,6:221\n101#7:255\n105#7:260\n78#8,6:227\n85#8,4:242\n89#8,2:252\n93#8:259\n368#9,9:233\n377#9:254\n378#9,2:257\n4032#10,6:246\n81#11:261\n*S KotlinDebug\n*F\n+ 1 SecretLabActivity.kt\ncom/kakao/tistory/presentation/view/setting/secretLab/SecretLabActivity\n*L\n50#1:196,2\n50#1:198\n50#1:199,13\n153#1:212\n154#1:213\n155#1:214\n156#1:215\n174#1:218\n176#1:219\n187#1:256\n161#1:216,2\n170#1:220\n170#1:221,6\n170#1:255\n170#1:260\n170#1:227,6\n170#1:242,4\n170#1:252,2\n170#1:259\n170#1:233,9\n170#1:254\n170#1:257,2\n170#1:246,6\n91#1:261\n*E\n"})
public final class SecretLabActivity extends Hilt_SecretLabActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;

    public SecretLabActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SecretLabViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void CommonItem(@NotNull String s, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(88402845);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changed(s) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Function0 function02 = (v1 & 2) == 0 ? function00 : d.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(88402845, v2, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.CommonItem (SecretLabActivity.kt:168)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, function02, 7, null), 0.0f, 1, null), 52.0f), 0L, null, 2, null), 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TTextStyle.INSTANCE.getSize16Weight400(), composer1, v2 & 14, 0xC00000, 0x1FFFE);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier$Companion0, 15.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_arrow, composer1, 0), null, modifier2, null, null, 0.0f, null, composer1, 440, 120);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(this, s, function01, v, v1));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        String s;
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0xEA9F07E2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEA9F07E2, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.Content (SecretLabActivity.kt:88)");
        }
        NavHostController navHostController0 = NavHostControllerKt.rememberNavController(new Navigator[0], composer1, 8);
        NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)NavHostControllerKt.currentBackStackEntryAsState(navHostController0, composer1, 8).getValue();
        if(navBackStackEntry0 == null) {
            s = null;
        }
        else {
            NavDestination navDestination0 = navBackStackEntry0.getDestination();
            s = navDestination0 == null ? null : navDestination0.getRoute();
        }
        ScaffoldKt.Scaffold-TvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(0xE261DBF1, true, new j(navHostController0, this), composer1, 54), composer1, 0x30000000, 0x1FF);
        EffectsKt.LaunchedEffect(s, new l(this, s, navHostController0, null), composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, modifier0, v));
        }
    }

    public static final void access$MainContent(SecretLabActivity secretLabActivity0, NavController navController0, Composer composer0, int v) {
        secretLabActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x39F3428D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x39F3428D, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.MainContent (SecretLabActivity.kt:124)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), lazyListState0, null, false, null, null, null, false, new q(secretLabActivity0, navController0), composer1, 6, 0xFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(secretLabActivity0, navController0, v));
        }
    }

    public static final void access$SecretLabHeader(SecretLabActivity secretLabActivity0, Composer composer0, int v) {
        secretLabActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(-85021206);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85021206, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.SecretLabHeader (SecretLabActivity.kt:145)");
            }
            Modifier modifier0 = PaddingKt.padding(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, null, 2, null), PaddingKt.PaddingValues-a9UjIt4(21.0f, 16.5f, 20.0f, 13.5f));
            String s = StringResources_androidKt.stringResource(string.label_setting_secret_lab, composer1, 0);
            TextUnitKt.checkArithmetic--R2X_6o(0x13F000000L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier0, 0L, 0L, null, null, null, 0x1BF000000L, null, null, 0L, 0, false, false, 0, 0, null, TTextStyle.INSTANCE.getSize22Weight700(), composer1, 0, 0xC00000, 0x1FF7C);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(secretLabActivity0, v));
        }
    }

    public static final SecretLabViewModel access$getSecretLabViewModel(SecretLabActivity secretLabActivity0) {
        return (SecretLabViewModel)secretLabActivity0.s.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTitle(this.getString(string.label_setting_secret_lab));
        SecretLabViewModel secretLabViewModel0 = (SecretLabViewModel)this.s.getValue();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v(secretLabViewModel0, this, null), 3, null);
        LiveDataExtensionKt.observeEvent(secretLabViewModel0.getShowErrorDialog(), this, new x(this));
    }
}

