package com.kakao.tistory.presentation.view.setting;

import a;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.AppInfoViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.ListTitleHeaderKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "앱정보")
@TiaraSection(section = "설정")
@AndroidEntryPoint
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000F\u0010\u000EJ!\u0010\u0014\u001A\u00020\u00062\b\b\u0001\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u001A\u0010\u0003R\u001A\u0010\u001B\u001A\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006#²\u0006\u0014\u0010 \u001A\n \u001F*\u0004\u0018\u00010\u00120\u00128\nX\u008A\u0084\u0002²\u0006\u0014\u0010!\u001A\n \u001F*\u0004\u0018\u00010\u00120\u00128\nX\u008A\u0084\u0002²\u0006\f\u0010\"\u001A\u00020\u00168\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingAppInfoActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "AppInfoUI", "(Landroidx/compose/runtime/Composer;I)V", "AppVersionContainer", "", "versionStringRes", "", "version", "AppVersionText", "(ILjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "isLatestVersion", "AppUpdateButton", "(ZLandroidx/compose/runtime/Composer;I)V", "initAppBar", "profileEnabled", "Z", "getProfileEnabled", "()Z", "kotlin.jvm.PlatformType", "nowVersion", "latestVersion", "pressedState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingAppInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingAppInfoActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingAppInfoActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 12 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,202:1\n10#2,2:203\n1#3:205\n75#4,13:206\n85#5:219\n82#5,6:220\n88#5:254\n92#5:265\n78#6,6:226\n85#6,4:241\n89#6,2:251\n93#6:264\n78#6,6:274\n85#6,4:289\n89#6,2:299\n93#6:305\n368#7,9:232\n377#7:253\n378#7,2:262\n368#7,9:280\n377#7:301\n378#7,2:303\n4032#8,6:245\n4032#8,6:293\n148#9:255\n148#9:256\n148#9:257\n148#9:258\n148#9:259\n148#9:260\n148#9:261\n148#9:266\n158#9:267\n148#9:315\n148#9:316\n148#9:317\n158#9:318\n148#9:319\n148#9:320\n98#10:268\n96#10,5:269\n101#10:302\n105#10:306\n95#11,2:307\n1223#12,6:309\n81#13:321\n81#13:322\n81#13:323\n*S KotlinDebug\n*F\n+ 1 SettingAppInfoActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingAppInfoActivity\n*L\n48#1:203,2\n48#1:205\n48#1:206,13\n66#1:219\n66#1:220,6\n66#1:254\n66#1:265\n66#1:226,6\n66#1:241,4\n66#1:251,2\n66#1:264\n116#1:274,6\n116#1:289,4\n116#1:299,2\n116#1:305\n66#1:232,9\n66#1:253\n66#1:262,2\n116#1:280,9\n116#1:301\n116#1:303,2\n66#1:245,6\n116#1:293,6\n72#1:255\n77#1:256\n78#1:257\n81#1:258\n89#1:259\n90#1:260\n101#1:261\n117#1:266\n118#1:267\n169#1:315\n170#1:316\n172#1:317\n173#1:318\n175#1:319\n176#1:320\n116#1:268\n116#1:269,5\n116#1:302\n116#1:306\n141#1:307,2\n148#1:309,6\n111#1:321\n112#1:322\n149#1:323\n*E\n"})
public final class SettingAppInfoActivity extends Hilt_SettingAppInfoActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;

    public SettingAppInfoActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(AppInfoViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void AppInfoUI(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4CD2FFAA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4CD2FFAA, v, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.AppInfoUI (SettingAppInfoActivity.kt:64)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer1, 0x30);
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
        ListTitleHeaderKt.ListTitleHeader(string.label_setting_app_info, PaddingKt.PaddingValues-a9UjIt4$default(20.0f, 18.0f, 20.0f, 0.0f, 8, null), composer1, 0, 0);
        Modifier modifier2 = ModifierKt.roundedBackground-oZzcvok$default(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 28.0f, 0.0f, 0.0f, 13, null), 100.0f), 0, color.color_d0d0d0, 0.0f, 18.0f, 5, null);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_applogo_appinfo, composer1, 0), null, modifier2, null, null, 0.0f, null, composer1, 56, 120);
        Modifier modifier3 = SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 26.0f, 0.0f, 0.0f, 13, null), 59.0f, 16.0f);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_wordmark_appinfo, composer1, 0), null, modifier3, null, null, 0.0f, null, composer1, 440, 120);
        this.AppVersionContainer(composer1, 8);
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        Modifier modifier4 = SizeKt.wrapContentSize$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 30.0f, 7, null), null, false, 3, null);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_copyright, composer1, 0), null, modifier4, null, null, 0.0f, null, composer1, 440, 120);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void AppUpdateButton(boolean z, @Nullable Composer composer0, int v) {
        long v2;
        long v1;
        String s;
        Composer composer1 = composer0.startRestartGroup(0x44A80EEF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x44A80EEF, v, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.AppUpdateButton (SettingAppInfoActivity.kt:146)");
        }
        composer1.startReplaceGroup(0x2F29787C);
        MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
        if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            composer1.updateRememberedValue(mutableInteractionSource0);
        }
        composer1.endReplaceGroup();
        State state0 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource0, composer1, 6);
        if(z) {
            composer1.startReplaceGroup(0x2F298C86);
            s = StringResources_androidKt.stringResource(string.label_setting_app_info_latest, composer1, 0);
        }
        else {
            composer1.startReplaceGroup(0x2F299750);
            s = StringResources_androidKt.stringResource(string.label_setting_app_info_update, composer1, 0);
        }
        composer1.endReplaceGroup();
        if(z) {
            composer1.startReplaceGroup(0x2F29A7FA);
            composer1.endReplaceGroup();
            v1 = Color.Companion.getWhite-0d7_KjU();
        }
        else {
            if(((Boolean)state0.getValue()).booleanValue()) {
                composer1.startReplaceGroup(0x2F29AC56);
                v1 = ColorResources_androidKt.colorResource(color.gray5, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0x2F29B316);
                v1 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
            }
            composer1.endReplaceGroup();
        }
        if(z) {
            composer1.startReplaceGroup(0x2F29C0B6);
            v2 = ColorResources_androidKt.colorResource(color.gray8, composer1, 0);
        }
        else if(((Boolean)state0.getValue()).booleanValue()) {
            composer1.startReplaceGroup(0x2F29C876);
            v2 = ColorResources_androidKt.colorResource(color.gray5, composer1, 0);
        }
        else {
            composer1.startReplaceGroup(0x2F29CF36);
            v2 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 35.0f, 0.0f, 0.0f, 13, null), 320.0f, 44.0f);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f);
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, v2);
        ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(v1, 0L, 0L, composer1, ButtonDefaults.$stable << 9, 6);
        ButtonElevation buttonElevation0 = ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, ButtonDefaults.$stable << 15 | 54, 28);
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
        ButtonKt.Button(new h(this), modifier0, !z, mutableInteractionSource0, buttonElevation0, roundedCornerShape0, borderStroke0, buttonColors0, paddingValues0, ComposableLambdaKt.rememberComposableLambda(0x9C54E0FF, true, new i(z, s), composer1, 54), composer1, 0x36000C30, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(this, z, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void AppVersionContainer(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFDBFC2F1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFDBFC2F1, v, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.AppVersionContainer (SettingAppInfoActivity.kt:109)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((AppInfoViewModel)this.s.getValue()).getNowVersion(), "", composer1, 56);
        State state1 = LiveDataAdapterKt.observeAsState(((AppInfoViewModel)this.s.getValue()).getLatestVersion(), "", composer1, 56);
        String s = (String)state0.getValue();
        String s1 = (String)state1.getValue();
        Intrinsics.checkNotNullExpressionValue(s1, "AppVersionContainer$lambda$2(...)");
        boolean z = s.compareTo(s1) >= 0;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 11.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.5f), Alignment.Companion.getTop(), composer1, 6);
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
        int v2 = string.label_setting_app_info_now_version;
        String s2 = (String)state0.getValue();
        Intrinsics.checkNotNullExpressionValue(s2, "AppVersionContainer$lambda$1(...)");
        this.AppVersionText(v2, s2, composer1, 0x200);
        composer1.startReplaceGroup(-894950619);
        if(!z) {
            int v3 = string.label_setting_app_info_latest_version;
            String s3 = (String)state1.getValue();
            Intrinsics.checkNotNullExpressionValue(s3, "AppVersionContainer$lambda$2(...)");
            this.AppVersionText(v3, s3, composer1, 0x200);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        this.AppUpdateButton(z, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void AppVersionText(@StringRes int v, @NotNull String s, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(s, "version");
        Composer composer1 = composer0.startRestartGroup(0x6C30DC19);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6C30DC19, v2, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.AppVersionText (SettingAppInfoActivity.kt:133)");
            }
            String s1 = StringResources_androidKt.stringResource(v, new Object[]{s}, composer1, v2 & 14 | 0x40);
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, null, ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0x1BDCCCCCDL, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DF12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(this, v, s, v1));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(444303561);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(444303561, v, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.Content (SettingAppInfoActivity.kt:59)");
        }
        this.AppInfoUI(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, modifier0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.setTitle(this.getString(string.label_setting_app_info));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.initAppBar();
        ((AppInfoViewModel)this.s.getValue()).getVersion();
    }
}

