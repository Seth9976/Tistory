package com.kakao.tistory.presentation.view.setting;

import a;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.PushSetting;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.PushViewModel;
import com.kakao.tistory.presentation.widget.ListTitleHeaderKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "알림설정")
@TiaraSection(section = "설정")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000E\u0010\u0003R\u001A\u0010\u0010\u001A\u00020\u000F8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u001B²\u0006\u0014\u0010\u0016\u001A\n \u0015*\u0004\u0018\u00010\u00140\u00148\nX\u008A\u0084\u0002²\u0006\f\u0010\u0017\u001A\u00020\u000F8\nX\u008A\u0084\u0002²\u0006\u001E\u0010\u001A\u001A\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00060\u00188\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingPushActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "initAppBar", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Lcom/kakao/tistory/domain/entity/PushSetting;", "kotlin.jvm.PlatformType", "pushSetting", "isShowDisturbTime", "Lkotlin/Function2;", "Lcom/kakao/tistory/presentation/view/setting/SettingPushItem;", "onClick", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingPushActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingPushActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingPushActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,337:1\n10#2,2:338\n1#3:340\n75#4,13:341\n81#5:354\n107#5,2:355\n81#5:528\n81#5:529\n81#5:530\n85#6:357\n82#6,6:358\n88#6:392\n92#6:397\n85#6:434\n82#6,6:435\n88#6:469\n92#6:515\n78#7,6:364\n85#7,4:379\n89#7,2:389\n93#7:396\n78#7,6:405\n85#7,4:420\n89#7,2:430\n78#7,6:441\n85#7,4:456\n89#7,2:466\n78#7,6:479\n85#7,4:494\n89#7,2:504\n93#7:510\n93#7:514\n93#7:519\n368#8,9:370\n377#8:391\n378#8,2:394\n368#8,9:411\n377#8:432\n368#8,9:447\n377#8:468\n368#8,9:485\n377#8:506\n378#8,2:508\n378#8,2:512\n378#8,2:517\n4032#9,6:383\n4032#9,6:424\n4032#9,6:460\n4032#9,6:498\n148#10:393\n148#10:470\n148#10:471\n158#10:516\n148#10:527\n71#11:398\n68#11,6:399\n74#11:433\n78#11:520\n98#12:472\n95#12,6:473\n101#12:507\n105#12:511\n1223#13,6:521\n*S KotlinDebug\n*F\n+ 1 SettingPushActivity.kt\ncom/kakao/tistory/presentation/view/setting/SettingPushActivity\n*L\n94#1:338,2\n94#1:340\n94#1:341,13\n108#1:354\n108#1:355,2\n136#1:528\n137#1:529\n204#1:530\n126#1:357\n126#1:358,6\n126#1:392\n126#1:397\n170#1:434\n170#1:435,6\n170#1:469\n170#1:515\n126#1:364,6\n126#1:379,4\n126#1:389,2\n126#1:396\n169#1:405,6\n169#1:420,4\n169#1:430,2\n170#1:441,6\n170#1:456,4\n170#1:466,2\n175#1:479,6\n175#1:494,4\n175#1:504,2\n175#1:510\n170#1:514\n169#1:519\n126#1:370,9\n126#1:391\n126#1:394,2\n169#1:411,9\n169#1:432\n170#1:447,9\n170#1:468\n175#1:485,9\n175#1:506\n175#1:508,2\n170#1:512,2\n169#1:517,2\n126#1:383,6\n169#1:424,6\n170#1:460,6\n175#1:498,6\n133#1:393\n178#1:470\n179#1:471\n187#1:516\n261#1:527\n169#1:398\n169#1:399,6\n169#1:433\n169#1:520\n175#1:472\n175#1:473,6\n175#1:507\n175#1:511\n212#1:521,6\n*E\n"})
public final class SettingPushActivity extends Hilt_SettingPushActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;
    public final ActivityResultLauncher t;
    public final ActivityResultLauncher u;
    public final MutableState v;

    public SettingPushActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(PushViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.t = this.registerForActivityResult(new RequestPermission(), new w1(this));
        this.u = this.registerForActivityResult(new RequestNotificationPermissionBySettings(), new x1(this));
        this.v = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(-110664205);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-110664205, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.Content (SettingPushActivity.kt:124)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        boolean z = false;
        Modifier modifier1 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.gray6, composer1, 0), null, 2, null);
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
        ListTitleHeaderKt.ListTitleHeader(string.label_setting_push, PaddingKt.PaddingValues-a9UjIt4(20.0f, 15.0f, 20.0f, 19.0f), composer1, 0, 0);
        State state0 = LiveDataAdapterKt.observeAsState(((PushViewModel)this.s.getValue()).getPushSetting(), new PushSetting(false, null, null, null, null, null, null, 0x7F, null), composer1, 72);
        State state1 = LiveDataAdapterKt.observeAsState(((PushViewModel)this.s.getValue()).isDoNotDisturb(), Boolean.FALSE, composer1, 56);
        SettingPushItem settingPushItem0 = SettingPushItem.PUSH_NOTIFICATION;
        if(((PushSetting)state0.getValue()).getEnable() && ((Boolean)this.v.getValue()).booleanValue()) {
            z = true;
        }
        this.a(settingPushItem0, z, composer1, 0x206, 0);
        composer1.startReplaceGroup(163345019);
        if(((PushSetting)state0.getValue()).getEnable() && ((Boolean)this.v.getValue()).booleanValue()) {
            this.a(composer1, 8);
            boolean z1 = ((PushSetting)state0.getValue()).getComment().getValue();
            this.a(SettingPushItem.COMMENT_AND_REPLY, z1, composer1, 0x206, 0);
            boolean z2 = ((PushSetting)state0.getValue()).getInvite().getValue();
            this.a(SettingPushItem.INVITE_AND_ACCEPT, z2, composer1, 0x206, 0);
            boolean z3 = ((PushSetting)state0.getValue()).getSubscription().getValue();
            this.a(SettingPushItem.SUBSCRIBE, z3, composer1, 0x206, 0);
            boolean z4 = ((PushSetting)state0.getValue()).getNewEntry().getValue();
            this.a(SettingPushItem.NEW_ENTRY, z4, composer1, 0x206, 0);
            boolean z5 = ((PushSetting)state0.getValue()).getChallenge().getValue();
            this.a(SettingPushItem.CHALLENGE, z5, composer1, 0x206, 0);
            this.a(composer1, 8);
            boolean z6 = ((PushSetting)state0.getValue()).getEtiquette().getEnable();
            this.a(SettingPushItem.DO_NOT_DISTURB, z6, composer1, 0x206, 0);
            if(((Boolean)state1.getValue()).booleanValue()) {
                this.a(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, new f1(this), 7, null), ((PushViewModel)this.s.getValue()).getEtiquetteTime(), composer1, 0x200, 0);
            }
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(this, modifier0, v));
        }
    }

    public final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1970190224);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970190224, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.PushDivider (SettingPushActivity.kt:257)");
            }
            DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.gray6, composer1, 0), 10.0f, 0.0f, composer1, 0x180, 9);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h1(this, v));
        }
    }

    public final void a(Modifier modifier0, String s, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-2007303973);
        if((v1 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v1 & 2) != 0) {
            s = "";
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2007303973, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.TimeItem (SettingPushActivity.kt:244)");
        }
        this.a(modifier0, ComposableLambdaKt.rememberComposableLambda(0xEA18109B, true, new q1(s), composer1, 54), composer1, v & 14 | 560, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r1(this, modifier0, s, v, v1));
        }
    }

    public final void a(Modifier modifier0, Function3 function30, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF173F1C1);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changed(modifier0) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF173F1C1, v2, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.PushItemContainer (SettingPushActivity.kt:167)");
            }
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier3 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            Modifier modifier5 = PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 52.0f), 20.0f, 0.0f, 18.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            function30.invoke(RowScopeInstance.INSTANCE, composer1, ((int)(v2 & 0x70 | 6)));
            composer1.endNode();
            composer1.endNode();
            DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(SizeKt.height-3ABfNKs(modifier$Companion0, 0.5f), alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.0f, 0.0f, composer1, 0, 12);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p1(this, modifier1, function30, v, v1));
        }
    }

    public final void a(SettingPushItem settingPushItem0, boolean z, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x97BB779B);
        int v2 = 0;
        if((v1 & 2) != 0) {
            z = false;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x97BB779B, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.PushItem (SettingPushActivity.kt:197)");
        }
        String s = StringResources_androidKt.stringResource((z ? string.semantic_label_alarm_off : string.semantic_label_alarm_on), composer1, 0);
        State state0 = SnapshotStateKt.rememberUpdatedState(new o1(this), composer1, 0);
        Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(0x8FC099E2);
        boolean z1 = composer1.changed(s);
        boolean z2 = composer1.changed(state0);
        int v3 = ((v & 14 ^ 6) <= 4 || !composer1.changed(settingPushItem0)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer1.changed(z) || (v & 0x30) == 0x20) {
            v2 = 1;
        }
        j1 j10 = composer1.rememberedValue();
        if((v2 | (z1 | z2 | v3)) != 0 || j10 == Composer.Companion.getEmpty()) {
            j10 = new j1(s, settingPushItem0, z, state0);
            composer1.updateRememberedValue(j10);
        }
        composer1.endReplaceGroup();
        this.a(SemanticsModifierKt.semantics(modifier$Companion0, true, j10), ComposableLambdaKt.rememberComposableLambda(1170526043, true, new m1(settingPushItem0, z, state0), composer1, 54), composer1, 560, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n1(this, settingPushItem0, z, v, v1));
        }
    }

    public static final Function2 access$PushItem$lambda$6(State state0) {
        return (Function2)state0.getValue();
    }

    public static final PushViewModel access$getPushViewModel(SettingPushActivity settingPushActivity0) {
        return (PushViewModel)settingPushActivity0.s.getValue();
    }

    public static final boolean access$isDevicePushEnabled(SettingPushActivity settingPushActivity0) {
        return ((Boolean)settingPushActivity0.v.getValue()).booleanValue();
    }

    public static final void access$onNotificationPermissionResult(SettingPushActivity settingPushActivity0, boolean z) {
        if(z) {
            ((PushViewModel)settingPushActivity0.s.getValue()).onClickPushSetting(SettingPushItem.PUSH_NOTIFICATION, true);
            return;
        }
        settingPushActivity0.getClass();
    }

    public static final void access$requestNotificationPermission(SettingPushActivity settingPushActivity0) {
        settingPushActivity0.getClass();
        if(Build.VERSION.SDK_INT >= 33 && ActivityCompat.shouldShowRequestPermissionRationale(settingPushActivity0, "android.permission.POST_NOTIFICATIONS")) {
            settingPushActivity0.t.launch("android.permission.POST_NOTIFICATIONS");
            return;
        }
        String s = settingPushActivity0.getString(string.label_setting_push_request_notification_permission_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        a2 a20 = new a2(settingPushActivity0);
        TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, settingPushActivity0, s, null, a20, 4, null);
    }

    public static final void access$showDialog(SettingPushActivity settingPushActivity0, String s, String s1) {
        settingPushActivity0.getClass();
        z1 z10 = new z1(settingPushActivity0);
        TistoryDialog.INSTANCE.showStartEndTimePickerDialog(settingPushActivity0, s, s1, z10);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.setTitle(this.getString(string.label_setting_push));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.initAppBar();
        PushViewModel pushViewModel0 = (PushViewModel)this.s.getValue();
        pushViewModel0.getPushSetting().observe(this, new y1(new s1(this)));
        LiveDataExtensionKt.observeEvent(pushViewModel0.getShowTimePicker(), this, new t1(this));
        LiveDataExtensionKt.observeEvent(pushViewModel0.getShowErrorDialog(), this, new v1(this));
        ((PushViewModel)this.s.getValue()).getPushSetting();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        Boolean boolean0 = Boolean.valueOf(NotificationManagerCompat.from(this).areNotificationsEnabled());
        this.v.setValue(boolean0);
    }
}

