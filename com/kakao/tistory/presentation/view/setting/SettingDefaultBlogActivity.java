package com.kakao.tistory.presentation.view.setting;

import a;
import android.os.Bundle;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.lifecycle.ViewModelLazy;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.dialog.BlogDialogKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "대표블로그설정")
@TiaraSection(section = "설정")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0019\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00102\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u001D\u001A\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006#²\u0006\u000E\u0010!\u001A\u0004\u0018\u00010\u00148\nX\u008A\u0084\u0002²\u0006\u000E\u0010\"\u001A\u0004\u0018\u00010\u00148\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingDefaultBlogActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "initAppBar", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "title", "", "hasDivider", "TitleItem", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "isDefault", "Lkotlin/Function1;", "onClick", "BlogItem", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/domain/entity/Blog;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DefaultBlogDialogHandler", "(Landroidx/compose/runtime/Composer;I)V", "profileEnabled", "Z", "getProfileEnabled", "()Z", "defaultBlog", "selectedBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingDefaultBlogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingDefaultBlogActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingDefaultBlogActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,263:1\n10#2,2:264\n1#3:266\n75#4,13:267\n85#5:280\n81#5,7:281\n88#5:316\n92#5:323\n85#5:324\n82#5,6:325\n88#5:359\n85#5:400\n82#5,6:401\n88#5:435\n92#5:441\n92#5:452\n78#6,6:288\n85#6,4:303\n89#6,2:313\n93#6:322\n78#6,6:331\n85#6,4:346\n89#6,2:356\n78#6,6:369\n85#6,4:384\n89#6,2:394\n78#6,6:407\n85#6,4:422\n89#6,2:432\n93#6:440\n93#6:446\n93#6:451\n368#7,9:294\n377#7:315\n378#7,2:320\n368#7,9:337\n377#7:358\n368#7,9:375\n377#7:396\n368#7,9:413\n377#7:434\n378#7,2:438\n378#7,2:444\n378#7,2:449\n4032#8,6:307\n4032#8,6:350\n4032#8,6:388\n4032#8,6:426\n148#9:317\n148#9:318\n148#9:319\n148#9:360\n148#9:361\n148#9:398\n148#9:399\n148#9:436\n148#9:437\n148#9:442\n148#9:443\n158#9:448\n98#10:362\n95#10,6:363\n101#10:397\n105#10:447\n81#11:453\n81#11:454\n*S KotlinDebug\n*F\n+ 1 SettingDefaultBlogActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingDefaultBlogActivity\n*L\n60#1:264,2\n60#1:266\n60#1:267,13\n152#1:280\n152#1:281,7\n152#1:316\n152#1:323\n175#1:324\n175#1:325,6\n175#1:359\n187#1:400\n187#1:401,6\n187#1:435\n187#1:441\n175#1:452\n152#1:288,6\n152#1:303,4\n152#1:313,2\n152#1:322\n175#1:331,6\n175#1:346,4\n175#1:356,2\n176#1:369,6\n176#1:384,4\n176#1:394,2\n187#1:407,6\n187#1:422,4\n187#1:432,2\n187#1:440\n176#1:446\n175#1:451\n152#1:294,9\n152#1:315\n152#1:320,2\n175#1:337,9\n175#1:358\n176#1:375,9\n176#1:396\n187#1:413,9\n187#1:434\n187#1:438,2\n176#1:444,2\n175#1:449,2\n152#1:307,6\n175#1:350,6\n176#1:388,6\n187#1:426,6\n154#1:317\n156#1:318\n160#1:319\n178#1:360\n179#1:361\n184#1:398\n185#1:399\n189#1:436\n198#1:437\n213#1:442\n214#1:443\n222#1:448\n176#1:362\n176#1:363,6\n176#1:397\n176#1:447\n76#1:453\n228#1:454\n*E\n"})
public final class SettingDefaultBlogActivity extends Hilt_SettingDefaultBlogActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;

    public SettingDefaultBlogActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(DefaultBlogViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void BlogItem(@Nullable Modifier modifier0, @NotNull Blog blog0, boolean z, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(1011532698);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1011532698, v, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.BlogItem (SettingDefaultBlogActivity.kt:173)");
        }
        Modifier modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier1, false, null, null, new n(function10, blog0), 7, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
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
        Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(modifier$Companion0, 80.0f), 20.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        String s = blog0.getLogoImageUrl();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s)), 48.0f, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 15.0f, 0.0f, 11, null), false, null, composer1, 0x1B0, 24);
        Modifier modifier6 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
        Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function22);
        }
        Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
        ExcludeFontPaddingTextKt.Text-IbK3jfQ((blog0.getTitle() == null ? "" : blog0.getTitle()), PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 5.0f, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), composer1, 0x30, 0x6C30, 0x197FC);
        Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 2.0f, 7, null);
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        FontWeight fontWeight0 = fontWeight$Companion0.getLight();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ((blog0.getDefaultDomain() == null ? "" : blog0.getDefaultDomain()), modifier8, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0x13DCCCCCDL, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, 0xDB0C30, 0x6C30, 0x39710);
        composer1.endNode();
        composer1.startReplaceGroup(-1084011780);
        if(z) {
            Modifier modifier9 = PaddingKt.padding-qDBjuR0(ModifierKt.roundedBackground-oZzcvok$default(modifier$Companion0, color.gray4, null, 0.0f, 13.0f, 6, null), 8.0f, 6.0f, 9.0f, 5.0f);
            FontWeight fontWeight1 = fontWeight$Companion0.getSemiBold();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_blog_representative, composer1, 0), modifier9, 0L, 0x141400000L, null, fontWeight1, TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0D80, 0, 0x3FF90);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 9);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(this, modifier1, blog0, z, function10, v, v1));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(831416097);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831416097, v, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.Content (SettingDefaultBlogActivity.kt:73)");
        }
        SwipeRefreshState swipeRefreshState0 = SwipeRefreshKt.rememberSwipeRefreshState(false, composer1, 6);
        State state0 = LiveDataAdapterKt.observeAsState(((DefaultBlogViewModel)this.s.getValue()).getDefaultBlog(), composer1, 8);
        SnapshotStateList snapshotStateList0 = ((DefaultBlogViewModel)this.s.getValue()).getOwnerBlogs();
        SnapshotStateList snapshotStateList1 = ((DefaultBlogViewModel)this.s.getValue()).getJoinedBlogs();
        SwipeRefreshKt.SwipeRefresh-Fsagccs(swipeRefreshState0, new p(this), null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-934947208, true, new x(snapshotStateList0, snapshotStateList1, this, state0), composer1, 54), composer1, 0x30000000, 508);
        this.DefaultBlogDialogHandler(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DefaultBlogDialogHandler(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1578704250);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1578704250, v, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.DefaultBlogDialogHandler (SettingDefaultBlogActivity.kt:226)");
        }
        Object object0 = LiveDataAdapterKt.observeAsState(((DefaultBlogViewModel)this.s.getValue()).getSelectedBlog(), null, composer1, 56).getValue();
        if(((Blog)object0) != null) {
            BlogDialogKt.DefaultBlogDialog(((Blog)object0), new z(this), new a0(this), new b0(this, ((Blog)object0)), composer1, 8);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void TitleItem(@NotNull String s, boolean z, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(140288413);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(140288413, v1, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.TitleItem (SettingDefaultBlogActivity.kt:150)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, -1975909301);
            if(z) {
                DividerKt.Divider-oMI9zvI(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 8.0f, 7, null), ColorResources_androidKt.colorResource(color.gray6, composer1, 0), 10.0f, 0.0f, composer1, 390, 8);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, 12.0f, 20.0f, 3.0f), 0L, 0x141400000L, null, FontWeight.Companion.getSemiBold(), TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, v1 & 14 | 0x1B0D80, 0x6C30, 0x39790);
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
            scopeUpdateScope0.updateScope(new d0(this, s, z, v));
        }
    }

    public static final Blog access$Content$lambda$0(State state0) {
        return (Blog)state0.getValue();
    }

    public static final DefaultBlogViewModel access$getDefaultBlogViewModel(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
        return (DefaultBlogViewModel)settingDefaultBlogActivity0.s.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.setTitle(this.getString(string.label_setting_default_blog));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        DefaultBlogViewModel defaultBlogViewModel0 = (DefaultBlogViewModel)this.s.getValue();
        LiveDataExtensionKt.observeEvent(defaultBlogViewModel0.getGoToSettingListActivity(), this, new e0(this));
        LiveDataExtensionKt.observeEvent(defaultBlogViewModel0.getShowErrorDialog(), this, new g0(this));
        defaultBlogViewModel0.getBlogs();
    }
}

