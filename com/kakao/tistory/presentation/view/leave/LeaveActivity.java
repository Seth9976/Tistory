package com.kakao.tistory.presentation.view.leave;

import a;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.lifecycle.ViewModelLazy;
import b;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.LeaveViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
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
@AndroidEntryPoint
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000F\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0011\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000EJ\u0017\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000F\u0010\u0018\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000F\u0010\u0019\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u000ER\u001A\u0010\u001B\u001A\u00020\u001A8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006 ²\u0006\u000E\u0010\u001F\u001A\u0004\u0018\u00010\u001A8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001F\u001A\u0004\u0018\u00010\u001A8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/leave/LeaveActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "LeaveScreen", "(Landroidx/compose/runtime/Composer;I)V", "LeaveConfirmButton", "LeaveAgreeBox", "LeaveInfoBox", "", "title", "LeaveInfoTitle", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "description", "LeaveInfoDescription", "initAppBar", "LeaveDialogHandler", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "isDataRemoveAgree", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLeaveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeaveActivity.kt\ncom/kakao/tistory/presentation/view/leave/LeaveActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,256:1\n10#2,2:257\n1#3:259\n75#4,13:260\n85#5:273\n82#5,6:274\n88#5:308\n92#5:314\n85#5:316\n82#5,6:317\n88#5:351\n92#5:358\n85#5:479\n81#5,7:480\n88#5:515\n92#5:522\n78#6,6:280\n85#6,4:295\n89#6,2:305\n93#6:313\n78#6,6:323\n85#6,4:338\n89#6,2:348\n93#6:357\n78#6,6:367\n85#6,4:382\n89#6,2:392\n93#6:398\n78#6,6:407\n85#6,4:422\n89#6,2:432\n93#6:439\n78#6,6:450\n85#6,4:465\n89#6,2:475\n78#6,6:487\n85#6,4:502\n89#6,2:512\n93#6:521\n93#6:525\n368#7,9:286\n377#7:307\n378#7,2:311\n368#7,9:329\n377#7:350\n378#7,2:355\n368#7,9:373\n377#7:394\n378#7,2:396\n368#7,9:413\n377#7:434\n378#7,2:437\n368#7,9:456\n377#7:477\n368#7,9:493\n377#7:514\n378#7,2:519\n378#7,2:523\n4032#8,6:299\n4032#8,6:342\n4032#8,6:386\n4032#8,6:426\n4032#8,6:469\n4032#8,6:506\n158#9:309\n158#9:310\n148#9:315\n158#9:352\n148#9:353\n148#9:354\n148#9:359\n148#9:360\n148#9:436\n158#9:441\n148#9:442\n158#9:516\n148#9:517\n158#9:518\n71#10:361\n69#10,5:362\n74#10:395\n78#10:399\n71#10:443\n68#10,6:444\n74#10:478\n78#10:526\n98#11:400\n95#11,6:401\n101#11:435\n105#11:440\n81#12:527\n81#12:528\n*S KotlinDebug\n*F\n+ 1 LeaveActivity.kt\ncom/kakao/tistory/presentation/view/leave/LeaveActivity\n*L\n49#1:257,2\n49#1:259\n49#1:260,13\n63#1:273\n63#1:274,6\n63#1:308\n63#1:314\n78#1:316\n78#1:317,6\n78#1:351\n78#1:358\n179#1:479\n179#1:480,7\n179#1:515\n179#1:522\n63#1:280,6\n63#1:295,4\n63#1:305,2\n63#1:313\n78#1:323,6\n78#1:338,4\n78#1:348,2\n78#1:357\n122#1:367,6\n122#1:382,4\n122#1:392,2\n122#1:398\n148#1:407,6\n148#1:422,4\n148#1:432,2\n148#1:439\n172#1:450,6\n172#1:465,4\n172#1:475,2\n179#1:487,6\n179#1:502,4\n179#1:512,2\n179#1:521\n172#1:525\n63#1:286,9\n63#1:307\n63#1:311,2\n78#1:329,9\n78#1:350\n78#1:355,2\n122#1:373,9\n122#1:394\n122#1:396,2\n148#1:413,9\n148#1:434\n148#1:437,2\n172#1:456,9\n172#1:477\n179#1:493,9\n179#1:514\n179#1:519,2\n172#1:523,2\n63#1:299,6\n78#1:342,6\n122#1:386,6\n148#1:426,6\n172#1:469,6\n179#1:506,6\n66#1:309\n69#1:310\n80#1:315\n92#1:352\n103#1:353\n111#1:354\n125#1:359\n126#1:360\n159#1:436\n174#1:441\n177#1:442\n181#1:516\n184#1:517\n187#1:518\n122#1:361\n122#1:362,5\n122#1:395\n122#1:399\n172#1:443\n172#1:444,6\n172#1:478\n172#1:526\n148#1:400\n148#1:401,6\n148#1:435\n148#1:440\n120#1:527\n146#1:528\n*E\n"})
public final class LeaveActivity extends Hilt_LeaveActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy s;

    public LeaveActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(LeaveViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(-1200809542);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1200809542, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.Content (LeaveActivity.kt:61)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier1 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
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
        DividerKt.Divider-oMI9zvI(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), 0.5f, 0.0f, composer1, 390, 8);
        b.a(21.5f, modifier$Companion0, composer1, 6);
        this.LeaveScreen(composer1, 8);
        composer1.endNode();
        this.LeaveDialogHandler(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(this, modifier0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void LeaveAgreeBox(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(203702510);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(203702510, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveAgreeBox (LeaveActivity.kt:143)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((LeaveViewModel)this.s.getValue()).isDataRemoveAgree(), composer1, 8);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ModifierKt.noRippleClickable(modifier$Companion0, new com.kakao.tistory.presentation.view.leave.d(state0, this));
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
        ImageKt.Image(PainterResources_androidKt.painterResource((Intrinsics.areEqual(((Boolean)state0.getValue()), Boolean.TRUE) ? drawable.ic_leave_check : drawable.ic_leave_uncheck), composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
        c.a(7.0f, modifier$Companion0, composer1, 6);
        String s = StringResources_androidKt.stringResource(string.label_leave_screen_data_remove_agree, composer1, 0);
        TextStyle textStyle0 = TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
        FontWeight fontWeight0 = FontWeight.Companion.getNormal();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(textStyle0, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, fontWeight0, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, 0, 0, 0x1FFFE);
        composer1.endNode();
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
    public final void LeaveConfirmButton(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6260298F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6260298F, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveConfirmButton (LeaveActivity.kt:117)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((LeaveViewModel)this.s.getValue()).isDataRemoveAgree(), composer1, 8);
        Modifier modifier0 = ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 44.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), ColorResources_androidKt.colorResource((Intrinsics.areEqual(((Boolean)state0.getValue()), Boolean.TRUE) ? color.gray1 : color.color_bbbbbb), composer1, 0), null, 2, null), new f(this, state0));
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
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_setting_leave, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getButton(), ColorResources_androidKt.colorResource(color.white, composer1, 0), 0x141600000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFC, null), composer1, 0, 0, 0x1FFFE);
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
    public final void LeaveDialogHandler(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x638DE45F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x638DE45F, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveDialogHandler (LeaveActivity.kt:219)");
        }
        TistoryComposeDialogKt.DialogHandler(((LeaveViewModel)this.s.getValue()).getDialogEvent(), ComposableLambdaKt.rememberComposableLambda(1787489570, true, new i(this), composer1, 54), composer1, 56);
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
    public final void LeaveInfoBox(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2106714554);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2106714554, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveInfoBox (LeaveActivity.kt:170)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(SizeKt.fillMaxWidth$default(BackgroundKt.background-bw27NRU$default(BorderKt.border$default(modifier$Companion0, BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, ColorResources_androidKt.colorResource(color.gray3, composer1, 0)), null, 2, null), ColorResources_androidKt.colorResource(color.color_fafafa, composer1, 0), null, 2, null), 0.0f, 1, null), 20.0f, 20.0f, 20.0f, 22.0f);
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
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        this.LeaveInfoTitle(StringResources_androidKt.stringResource(string.label_leave_user_info_title, composer1, 0), composer1, 0x40);
        b.a(6.5f, modifier$Companion0, composer1, 6);
        this.LeaveInfoDescription(StringResources_androidKt.stringResource(string.label_leave_user_info_description, composer1, 0), composer1, 0x40);
        b.a(20.0f, modifier$Companion0, composer1, 6);
        this.LeaveInfoTitle(StringResources_androidKt.stringResource(string.label_leave_blog_info_title, composer1, 0), composer1, 0x40);
        b.a(6.5f, modifier$Companion0, composer1, 6);
        this.LeaveInfoDescription(StringResources_androidKt.stringResource(string.label_leave_blog_info_description, composer1, 0), composer1, 0x40);
        composer1.endNode();
        composer1.endNode();
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
    public final void LeaveInfoDescription(@NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "description");
        Composer composer1 = composer0.startRestartGroup(0x565806DA);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x565806DA, v1, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveInfoDescription (LeaveActivity.kt:203)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, v1 & 14, 0xC00, 0x1DFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(this, s, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void LeaveInfoTitle(@NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(0xAAAAA9F6);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAAAAA9F6, v1, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveInfoTitle (LeaveActivity.kt:193)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, v1 & 14, 0, 0x1FFFE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, s, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void LeaveScreen(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1910608037);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1910608037, v, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveScreen (LeaveActivity.kt:76)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(PaddingKt.padding-3ABfNKs(modifier$Companion0, 20.0f), 0.0f, 1, null);
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
        Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        String s = StringResources_androidKt.stringResource(string.label_leave_screen_title, composer1, 0);
        TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH1(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0x1FDFC);
        b.a(10.5f, modifier$Companion0, composer1, 6);
        Modifier modifier3 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        String s1 = StringResources_androidKt.stringResource(string.label_leave_screen_sub_title, composer1, 0);
        TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, modifier3, 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, textStyle1, composer1, 0x30, 0, 0x1FDFC);
        b.a(32.0f, modifier$Companion0, composer1, 6);
        this.LeaveInfoBox(composer1, 8);
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        this.LeaveAgreeBox(composer1, 8);
        b.a(48.0f, modifier$Companion0, composer1, 6);
        this.LeaveConfirmButton(composer1, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(this, v));
        }
    }

    public static final Boolean access$LeaveAgreeBox$lambda$4(State state0) {
        return (Boolean)state0.getValue();
    }

    public static final Boolean access$LeaveConfirmButton$lambda$2(State state0) {
        return (Boolean)state0.getValue();
    }

    public static final LeaveViewModel access$getLeaveViewModel(LeaveActivity leaveActivity0) {
        return (LeaveViewModel)leaveActivity0.s.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.setTitle(this.getString(string.label_setting_leave));
        this.updateAppbarTitleVisibility(0);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        LeaveTiara.INSTANCE.trackPage();
        this.initAppBar();
        LeaveViewModel leaveViewModel0 = (LeaveViewModel)this.s.getValue();
        LiveDataExtensionKt.observeEvent(leaveViewModel0.getGoToLeaveCompleteActivity(), this, new o(this));
        leaveViewModel0.isShowProgress().observe(this, new q(new p(this)));
    }
}

