package com.kakao.tistory.presentation.view.accountMigration;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "전환불가")
@TiaraSection(section = "전환하기")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "UsedAccountScreen", "PreviousScreenButton", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUsedAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsedAccountFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,90:1\n21#2,4:91\n1#3:95\n172#4,9:96\n148#5:105\n148#5:142\n148#5:147\n148#5:148\n148#5:149\n85#6:106\n82#6,6:107\n88#6:141\n92#6:146\n78#7,6:113\n85#7,4:128\n89#7,2:138\n93#7:145\n78#7,6:156\n85#7,4:171\n89#7,2:181\n93#7:187\n368#8,9:119\n377#8:140\n378#8,2:143\n368#8,9:162\n377#8:183\n378#8,2:185\n4032#9,6:132\n4032#9,6:175\n71#10:150\n69#10,5:151\n74#10:184\n78#10:188\n*S KotlinDebug\n*F\n+ 1 UsedAccountFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment\n*L\n33#1:91,4\n33#1:95\n33#1:96,9\n47#1:105\n49#1:142\n75#1:147\n76#1:148\n77#1:149\n47#1:106\n47#1:107,6\n47#1:141\n47#1:146\n47#1:113,6\n47#1:128,4\n47#1:138,2\n47#1:145\n72#1:156,6\n72#1:171,4\n72#1:181,2\n72#1:187\n47#1:119,9\n47#1:140\n47#1:143,2\n72#1:162,9\n72#1:183\n72#1:185,2\n47#1:132,6\n72#1:175,6\n72#1:150\n72#1:151,5\n72#1:184\n72#1:188\n*E\n"})
public final class UsedAccountFragment extends Hilt_UsedAccountFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/accountMigration/UsedAccountFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final UsedAccountFragment newInstance() {
            return new UsedAccountFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;

    static {
        UsedAccountFragment.Companion = new Companion(null);
        UsedAccountFragment.$stable = 8;
    }

    public UsedAccountFragment() {
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MigrationViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA05CF399);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA05CF399, v, -1, "com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment.Content (UsedAccountFragment.kt:40)");
        }
        this.UsedAccountScreen(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void PreviousScreenButton(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD2DF81A1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2DF81A1, v, -1, "com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment.PreviousScreenButton (UsedAccountFragment.kt:70)");
        }
        Modifier modifier0 = ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 20.0f, 1, null), 44.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null, 2, null), new g0(((MigrationViewModel)this.k.getValue())));
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_go_previous_page, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), ColorResources_androidKt.colorResource(color.white, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0, 0, 0x1FFFE);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void UsedAccountScreen(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9053236);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9053236, v, -1, "com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment.UsedAccountScreen (UsedAccountFragment.kt:45)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
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
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 13.0f, 0.0f, 0.0f, 13, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_kakao_migration_already_used_description, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0x30, 0, 0x1FFFC);
        String s = StringResources_androidKt.stringResource(string.label_kakao_migration_link, composer1, 0);
        TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        TextDecoration textDecoration0 = TextDecoration.Companion.getUnderline();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, ModifierKt.noRippleClickable(modifier$Companion0, new i0(((MigrationViewModel)this.k.getValue()))), 0L, 0L, null, null, null, 0L, textDecoration0, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x6000000, 0, 0x1FEFC);
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        this.PreviousScreenButton(composer1, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(this, v));
        }
    }
}

