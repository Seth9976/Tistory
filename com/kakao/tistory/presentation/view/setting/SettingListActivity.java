package com.kakao.tistory.presentation.view.setting;

import a;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.ViewModelLazy;
import c;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.SettingViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "설정")
@TiaraSection(section = "설정")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0018\u001A\u00020\u00062!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0013H\u0007¢\u0006\u0004\b\u001A\u0010\u001BJ!\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00132\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0007¢\u0006\u0004\b\u001E\u0010\u001FJB\u0010\"\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00132\u0006\u0010!\u001A\u00020 2!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0007¢\u0006\u0004\b\"\u0010#R\u001A\u0010$\u001A\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'¨\u0006+²\u0006\f\u0010(\u001A\u00020 8\nX\u008A\u0084\u0002²\u0006\u000E\u0010*\u001A\u0004\u0018\u00010)8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001D\u001A\u0004\u0018\u00010\u001C8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingListActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "SettingListScreen", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/common/SettingItem;", "Lkotlin/ParameterName;", "name", "item", "onClickSettingItem", "SettingListItemLeave", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SettingListItemDivider", "(Lcom/kakao/tistory/presentation/common/SettingItem;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/domain/entity/Blog;", "defaultBlog", "SettingListItemDescription", "(Lcom/kakao/tistory/presentation/common/SettingItem;Lcom/kakao/tistory/domain/entity/Blog;Landroidx/compose/runtime/Composer;I)V", "", "isDevelop", "SettingListItem", "(Lcom/kakao/tistory/presentation/common/SettingItem;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "profileEnabled", "Z", "getProfileEnabled", "()Z", "pushEnabled", "", "appUpdateState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingListActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingListActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,328:1\n10#2,2:329\n1#3:331\n75#4,13:332\n81#5:345\n107#5,2:346\n81#5:454\n81#5:455\n81#5:456\n148#6:348\n148#6:349\n148#6:396\n158#6:397\n148#6:400\n148#6:407\n148#6:408\n148#6:447\n148#6:448\n148#6:449\n71#7:350\n68#7,6:351\n74#7:385\n78#7:395\n78#8,6:357\n85#8,4:372\n89#8,2:382\n93#8:394\n78#8,6:416\n85#8,4:431\n89#8,2:441\n93#8:452\n368#9,9:363\n377#9:384\n378#9,2:392\n368#9,9:422\n377#9:443\n378#9,2:450\n4032#10,6:376\n4032#10,6:435\n1223#11,6:386\n1223#11,6:401\n95#12,2:398\n95#12,2:445\n98#13:409\n95#13,6:410\n101#13:444\n105#13:453\n*S KotlinDebug\n*F\n+ 1 SettingListActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingListActivity\n*L\n62#1:329,2\n62#1:331\n62#1:332,13\n64#1:345\n64#1:346,2\n157#1:454\n158#1:455\n207#1:456\n125#1:348\n127#1:349\n143#1:396\n145#1:397\n192#1:400\n215#1:407\n216#1:408\n235#1:447\n238#1:448\n242#1:449\n122#1:350\n122#1:351,6\n122#1:385\n122#1:395\n122#1:357,6\n122#1:372,4\n122#1:382,2\n122#1:394\n209#1:416,6\n209#1:431,4\n209#1:441,2\n209#1:452\n122#1:363,9\n122#1:384\n122#1:392,2\n209#1:422,9\n209#1:443\n209#1:450,2\n122#1:376,6\n209#1:435,6\n130#1:386,6\n211#1:401,6\n185#1:398,2\n224#1:445,2\n209#1:409\n209#1:410,6\n209#1:444\n209#1:453\n*E\n"})
public final class SettingListActivity extends Hilt_SettingListActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;
    public final MutableState t;

    public SettingListActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.t = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x3F3C0173);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F3C0173, v, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.Content (SettingListActivity.kt:81)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        this.ToolbarVisibilityHandler(lazyListState0, composer1, 0x40);
        this.SettingListScreen(lazyListState0, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SettingListItem(@NotNull SettingItem settingItem0, boolean z, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        ThumbnailUiState thumbnailUiState0;
        Intrinsics.checkNotNullParameter(settingItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "onClickSettingItem");
        Composer composer1 = composer0.startRestartGroup(0xFDEFD010);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFDEFD010, v, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.SettingListItem (SettingListActivity.kt:200)");
        }
        if(settingItem0 == SettingItem.LEAVE) {
            composer1.startReplaceGroup(0x4FD0520B);
            this.SettingListItemLeave(function10, composer1, v >> 6 & 14 | 0x40);
        }
        else {
            composer1.startReplaceGroup(0x4FD2138B);
            if(settingItem0 == SettingItem.SECRET_LAB && !z) {
                composer1.endReplaceGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new i0(this, settingItem0, false, function10, v));
                }
                return;
            }
            State state0 = LiveDataAdapterKt.observeAsState(((SettingViewModel)this.s.getValue()).getDefaultBlog(), composer1, 8);
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xD948EF5F);
            int v1 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(function10)) && (v & 0x180) != 0x100 ? 0 : 1;
            int v2 = ((v & 14 ^ 6) <= 4 || !composer1.changed(settingItem0)) && (v & 6) != 4 ? 0 : 1;
            j0 j00 = composer1.rememberedValue();
            if((v1 | v2) != 0 || j00 == Composer.Companion.getEmpty()) {
                j00 = new j0(function10, settingItem0);
                composer1.updateRememberedValue(j00);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, j00, 7, null), 0.0f, 1, null), 52.0f), 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            String s = StringResources_androidKt.stringResource(settingItem0.getTitleStringId(), composer1, 0);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH3();
            TextUnitKt.checkArithmetic--R2X_6o(5303949066L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0x1BC23D70AL, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, 0, 0x6C30, 104318);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            this.SettingListItemDescription(settingItem0, ((Blog)state0.getValue()), composer1, v & 14 | 0x240);
            composer1.startReplaceGroup(0x7B408660);
            if(settingItem0 == SettingItem.DEFAULT_BLOG) {
                Blog blog0 = (Blog)state0.getValue();
                if(blog0 == null) {
                    thumbnailUiState0 = null;
                }
                else {
                    String s1 = blog0.getLogoImageUrl();
                    thumbnailUiState0 = s1 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s1);
                }
                BlogThumbnailKt.BlogThumbnail-EUb7tLY(thumbnailUiState0, 21.0f, null, false, null, composer1, 0x30, 28);
                c.a(6.0f, modifier$Companion0, composer1, 6);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier$Companion0, 15.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_arrow, composer1, 0), null, modifier2, null, null, 0.0f, null, composer1, 440, 120);
            composer1.endNode();
        }
        composer1.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new k0(this, settingItem0, z, function10, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SettingListItemDescription(@NotNull SettingItem settingItem0, @Nullable Blog blog0, @Nullable Composer composer0, int v) {
        String s1;
        Intrinsics.checkNotNullParameter(settingItem0, "item");
        Composer composer1 = composer0.startRestartGroup(1003249309);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1003249309, v, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.SettingListItemDescription (SettingListActivity.kt:154)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((SettingViewModel)this.s.getValue()).getPushEnabled(), Boolean.FALSE, composer1, 56);
        State state1 = LiveDataAdapterKt.observeAsState(((SettingViewModel)this.s.getValue()).getAppUpdateState(), composer1, 8);
        composer1.startReplaceGroup(-1807280356);
        if(settingItem0 != SettingItem.DEFAULT_BLOG) {
            if(settingItem0 != SettingItem.PUSH) {
                s1 = settingItem0 == SettingItem.APP_INFO ? ((String)state1.getValue()) : null;
            }
            else if(((Boolean)state0.getValue()).booleanValue() && ((Boolean)this.t.getValue()).booleanValue()) {
                composer1.startReplaceGroup(0xF49FBC62);
                s1 = StringResources_androidKt.stringResource(string.label_setting_push_on, composer1, 0);
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(0xF4A13461);
                s1 = StringResources_androidKt.stringResource(string.label_setting_push_off, composer1, 0);
                composer1.endReplaceGroup();
            }
        }
        else if(blog0 != null) {
            String s = blog0.getTitle();
            s1 = s == null ? null : StringUtils.INSTANCE.getEllipsisText(s, 8);
        }
        else {
            s1 = null;
        }
        composer1.endReplaceGroup();
        if(s1 != null && s1.length() != 0) {
            TextUnitKt.checkArithmetic--R2X_6o(5303949066L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, null, 0L, 0L, null, null, null, 0x1BC23D70AL, null, null, 0L, 0, false, false, 1, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null), composer1, 0, 0x6000, 0x1BF7E);
            c.a(8.0f, Modifier.Companion, composer1, 6);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(this, settingItem0, blog0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SettingListItemDivider(@NotNull SettingItem settingItem0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(settingItem0, "item");
        Composer composer1 = composer0.startRestartGroup(-164091706);
        int v1 = (v & 14) == 0 ? (composer1.changed(settingItem0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-164091706, v1, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.SettingListItemDivider (SettingListActivity.kt:140)");
            }
            Pair pair0 = settingItem0.getHasDivider() ? new Pair(color.gray6, Dp.box-impl(10.0f)) : new Pair(color.gray4, Dp.box-impl(0.5f));
            DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(((Number)pair0.component1()).intValue(), composer1, 0), ((Dp)pair0.component2()).unbox-impl(), 0.0f, composer1, 0, 9);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(this, settingItem0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SettingListItemLeave(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "onClickSettingItem");
        Composer composer1 = composer0.startRestartGroup(1063625106);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function10) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1063625106, v1, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.SettingListItemLeave (SettingListActivity.kt:120)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            boolean z = true;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 106.0f), ColorResources_androidKt.colorResource(color.gray6, composer1, 0), null, 2, null), 20.0f, 20.0f, 0.0f, 0.0f, 12, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xB98B0C0C);
            if((v1 & 14) != 4) {
                z = false;
            }
            n0 n00 = composer1.rememberedValue();
            if(z || n00 == Composer.Companion.getEmpty()) {
                n00 = new n0(function10);
                composer1.updateRememberedValue(n00);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = ModifierKt.noRippleClickable(modifier$Companion0, n00);
            String s = StringResources_androidKt.stringResource(string.label_setting_leave, composer1, 0);
            TextStyle textStyle0 = TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, 0L, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x6000000, 0, 0x1FEFC);
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
            scopeUpdateScope0.updateScope(new o0(this, function10, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SettingListScreen(@NotNull LazyListState lazyListState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Composer composer1 = composer0.startRestartGroup(1284214308);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1284214308, v, -1, "com.kakao.tistory.presentation.view.setting.SettingListActivity.SettingListScreen (SettingListActivity.kt:89)");
        }
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new q0(this), composer1, v << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r0(this, lazyListState0, v));
        }
    }

    public static final SettingViewModel access$getSettingViewModel(SettingListActivity settingListActivity0) {
        return (SettingViewModel)settingListActivity0.s.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        SettingViewModel settingViewModel0 = (SettingViewModel)this.s.getValue();
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToSettingDefaultBlogActivity(), this, new u0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getShowDefaultBlogDialog(), this, new w0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToWebViewWithAppBar(), this, new x0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToWebViewBottomBar(), this, new y0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToSettingPushActivity(), this, new z0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToNoticeListActivity(), this, new a1(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToSettingAppInfoActivity(), this, new b1(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getShowLogoutDialog(), this, new d1(this, settingViewModel0));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToSplashActivity(), this, new e1(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGoToLeaveActivity(), this, new s0(this));
        LiveDataExtensionKt.observeEvent(settingViewModel0.getGotoSecretLabActivity(), this, new t0(this));
        ((SettingViewModel)this.s.getValue()).initPushState();
        ((SettingViewModel)this.s.getValue()).initAppUpdateState();
        this.setTitle(this.getString(string.label_setting));
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        Boolean boolean0 = Boolean.valueOf(NotificationManagerCompat.from(this).areNotificationsEnabled());
        this.t.setValue(boolean0);
    }
}

