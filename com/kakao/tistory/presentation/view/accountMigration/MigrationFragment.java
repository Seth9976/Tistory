package com.kakao.tistory.presentation.view.accountMigration;

import a;
import androidx.annotation.StringRes;
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
import androidx.compose.material.DividerKt;
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
@TiaraPage(page = "최종확인")
@TiaraSection(section = "전환하기")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000F\u0010\t\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000F\u0010\n\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001A\u00020\u00042\b\b\u0001\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006R\"\u0010\u001C\u001A\u00020\u000F8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/MigrationFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "MigrationScreen", "DetailViewText", "MigrationInfoText", "MigrationDivider", "", "titleRes", "MigrationTitleText", "(ILandroidx/compose/runtime/Composer;I)V", "", "email", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "MigrationEmailText", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)V", "TransformButton", "l", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMigrationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MigrationFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/MigrationFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,166:1\n21#2,4:167\n1#3:171\n172#4,9:172\n148#5:181\n148#5:218\n148#5:223\n148#5:224\n158#5:225\n148#5:226\n148#5:227\n148#5:228\n148#5:229\n148#5:230\n148#5:231\n85#6:182\n82#6,6:183\n88#6:217\n92#6:222\n78#7,6:189\n85#7,4:204\n89#7,2:214\n93#7:221\n78#7,6:238\n85#7,4:253\n89#7,2:263\n93#7:269\n368#8,9:195\n377#8:216\n378#8,2:219\n368#8,9:244\n377#8:265\n378#8,2:267\n4032#9,6:208\n4032#9,6:257\n71#10:232\n69#10,5:233\n74#10:266\n78#10:270\n*S KotlinDebug\n*F\n+ 1 MigrationFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/MigrationFragment\n*L\n37#1:167,4\n37#1:171\n37#1:172,9\n55#1:181\n70#1:218\n102#1:223\n112#1:224\n120#1:225\n121#1:226\n130#1:227\n140#1:228\n150#1:229\n152#1:230\n153#1:231\n53#1:182\n53#1:183,6\n53#1:217\n53#1:222\n53#1:189,6\n53#1:204,4\n53#1:214,2\n53#1:221\n148#1:238,6\n148#1:253,4\n148#1:263,2\n148#1:269\n53#1:195,9\n53#1:216\n53#1:219,2\n148#1:244,9\n148#1:265\n148#1:267,2\n53#1:208,6\n148#1:257,6\n148#1:232\n148#1:233,5\n148#1:266\n148#1:270\n*E\n"})
public final class MigrationFragment extends Hilt_MigrationFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/MigrationFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/accountMigration/MigrationFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/accountMigration/MigrationFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MigrationFragment newInstance() {
            return new MigrationFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public String l;

    static {
        MigrationFragment.Companion = new Companion(null);
        MigrationFragment.$stable = 8;
    }

    public MigrationFragment() {
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MigrationViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.l = "전환최종확인_보기";
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6C188F5D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6C188F5D, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.Content (MigrationFragment.kt:46)");
        }
        this.MigrationScreen(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DetailViewText(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDA077F17);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA077F17, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.DetailViewText (MigrationFragment.kt:93)");
        }
        String s = StringResources_androidKt.stringResource(string.label_kakao_migration_link, composer1, 0);
        TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        TextDecoration textDecoration0 = TextDecoration.Companion.getUnderline();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, ModifierKt.noRippleClickable(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 0.0f, 0.0f, 0.0f, 14, null), new w(((MigrationViewModel)this.k.getValue()))), 0L, 0L, null, null, null, 0L, textDecoration0, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x6000000, 0, 0x1FEFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void MigrationDivider(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCC08A50F);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCC08A50F, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.MigrationDivider (MigrationFragment.kt:116)");
            }
            long v1 = ColorResources_androidKt.colorResource(color.gray3, composer1, 0);
            DividerKt.Divider-oMI9zvI(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 13.0f, 0.0f, 0.0f, 13, null), v1, 0.5f, 0.0f, composer1, 390, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void MigrationEmailText(@NotNull String s, @NotNull TextStyle textStyle0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "email");
        Intrinsics.checkNotNullParameter(textStyle0, "textStyle");
        Composer composer1 = composer0.startRestartGroup(0xC476EFE8);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC476EFE8, v1, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.MigrationEmailText (MigrationFragment.kt:136)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 4.0f, 20.0f, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, v1 & 14 | 0x30, v1 << 18 & 0x1C00000 | 0xC00, 0x1DFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(this, s, textStyle0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void MigrationInfoText(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7113EF6D);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7113EF6D, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.MigrationInfoText (MigrationFragment.kt:107)");
            }
            String s = StringResources_androidKt.stringResource(string.label_kakao_migration_description, composer1, 0);
            TextStyle textStyle0 = TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 12.0f, 20.0f, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0x1FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void MigrationScreen(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDEA8821C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDEA8821C, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.MigrationScreen (MigrationFragment.kt:51)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 30.0f, 0.0f, 0.0f, 13, null), 0.0f, 1, null);
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
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        this.MigrationTitleText(string.label_kakao_migration_before, composer1, 0x40);
        int v2 = string.label_kakao_migration_tistory_account;
        String s = (String)((MigrationViewModel)this.k.getValue()).getTistoryEmail().getValue();
        String s1 = "";
        if(s == null) {
            s = "";
        }
        this.MigrationEmailText(StringResources_androidKt.stringResource(v2, new Object[]{s}, composer1, 0x40), TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH4(), ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x200);
        this.MigrationDivider(composer1, 8);
        int v3 = MaterialTheme.$stable;
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        SpacerKt.Spacer(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), composer1, 6);
        this.MigrationTitleText(string.label_kakao_migration_after, composer1, 0x40);
        int v4 = string.label_kakao_migration_kakao_account;
        String s2 = (String)((MigrationViewModel)this.k.getValue()).getKakaoEmail().getValue();
        if(s2 != null) {
            s1 = s2;
        }
        this.MigrationEmailText(StringResources_androidKt.stringResource(v4, new Object[]{s1}, composer1, 0x40), TextStyle.copy-p1EtxEg$default(materialTheme0.getTypography(composer1, v3).getH2(), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x200);
        this.MigrationDivider(composer1, 8);
        this.MigrationInfoText(composer1, 8);
        this.DetailViewText(composer1, 8);
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        this.TransformButton(composer1, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void MigrationTitleText(@StringRes int v, @Nullable Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x5DBF8AC);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5DBF8AC, v2, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.MigrationTitleText (MigrationFragment.kt:125)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(v, composer1, v2 & 14), PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0x30, 0xC00, 0x1DFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(this, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void TransformButton(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-202537288);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202537288, v, -1, "com.kakao.tistory.presentation.view.accountMigration.MigrationFragment.TransformButton (MigrationFragment.kt:146)");
        }
        Modifier modifier0 = ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-3ABfNKs(Modifier.Companion, 20.0f), 0.0f, 1, null), 44.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null, 2, null), new d0(((MigrationViewModel)this.k.getValue())));
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
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_guide_apply_kakao_account, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), ColorResources_androidKt.colorResource(color.white, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0, 0, 0x1FFFE);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @NotNull
    public String getAction() {
        return this.l;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.l = s;
    }
}

