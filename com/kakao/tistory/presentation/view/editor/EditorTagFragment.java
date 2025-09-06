package com.kakao.tistory.presentation.view.editor;

import a;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b;
import com.google.accompanist.flowlayout.FlowKt;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.EditorTagViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u001D²\u0006 \u0010\u0015\u001A\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00128\nX\u008A\u0084\u0002²\u0006\f\u0010\u0017\u001A\u00020\u00168\nX\u008A\u0084\u0002²\u0006 \u0010\u0018\u001A\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00128\nX\u008A\u0084\u0002²\u0006\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u00138\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001A\u001A\u00020\u00138\n@\nX\u008A\u008E\u0002²\u0006\u0012\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00060\u001B8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorTagFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "", "", "kotlin.jvm.PlatformType", "tagList", "", "enableEditField", "recentTagList", "selectedTag", "tag", "Lkotlin/Function0;", "addTag", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorTagFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorTagFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorTagFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,382:1\n21#2,4:383\n14#2,4:397\n1#3:387\n1#3:401\n172#4,9:388\n106#4,15:402\n1223#5,6:417\n1223#5,6:423\n1223#5,6:475\n1223#5,6:481\n1223#5,6:488\n1223#5,6:494\n1223#5,6:537\n1223#5,6:543\n1223#5,6:549\n1223#5,6:560\n1223#5,6:566\n1223#5,6:574\n1223#5,6:580\n148#6:429\n148#6:430\n148#6:431\n148#6:468\n148#6:469\n148#6:470\n148#6:500\n148#6:559\n148#6:572\n148#6:573\n85#7:432\n82#7,6:433\n88#7:467\n92#7:474\n78#8,6:439\n85#8,4:454\n89#8,2:464\n93#8:473\n78#8,6:508\n85#8,4:523\n89#8,2:533\n93#8:557\n368#9,9:445\n377#9:466\n378#9,2:471\n368#9,9:514\n377#9:535\n378#9,2:555\n4032#10,6:458\n4032#10,6:527\n77#11:487\n98#12:501\n95#12,6:502\n101#12:536\n105#12:558\n81#13:586\n107#13,2:587\n81#13:589\n107#13,2:590\n81#13:592\n*S KotlinDebug\n*F\n+ 1 EditorTagFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorTagFragment\n*L\n74#1:383,4\n75#1:397,4\n74#1:387\n75#1:401\n74#1:388,9\n75#1:402,15\n139#1:417,6\n141#1:423,6\n229#1:475,6\n233#1:481,6\n236#1:488,6\n241#1:494,6\n270#1:537,6\n287#1:543,6\n261#1:549,6\n314#1:560,6\n315#1:566,6\n343#1:574,6\n344#1:580,6\n150#1:429\n151#1:430\n201#1:431\n203#1:468\n210#1:469\n211#1:470\n248#1:500\n313#1:559\n318#1:572\n320#1:573\n201#1:432\n201#1:433,6\n201#1:467\n201#1:474\n201#1:439,6\n201#1:454,4\n201#1:464,2\n201#1:473\n247#1:508,6\n247#1:523,4\n247#1:533,2\n247#1:557\n201#1:445,9\n201#1:466\n201#1:471,2\n247#1:514,9\n247#1:535\n247#1:555,2\n201#1:458,6\n247#1:527,6\n234#1:487\n247#1:501\n247#1:502,6\n247#1:536\n247#1:558\n139#1:586\n139#1:587,2\n227#1:589\n227#1:590,2\n229#1:592\n*E\n"})
public final class EditorTagFragment extends Hilt_EditorTagFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorTagFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/editor/EditorTagFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/editor/EditorTagFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final EditorTagFragment newInstance() {
            return new EditorTagFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public final BaseViewModelLazy l;

    static {
        EditorTagFragment.Companion = new Companion(null);
        EditorTagFragment.$stable = 8;
    }

    public EditorTagFragment() {
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditorViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.l = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditorTagViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA6B4152B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA6B4152B, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.Content (EditorTagFragment.kt:90)");
        }
        this.a(((EditorTagViewModel)this.l.getValue()), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t4(this, v));
        }
    }

    public final void a(EditorTagViewModel editorTagViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-897056043);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-897056043, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagScreen (EditorTagFragment.kt:95)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0x6AFBC59E, true, new x5(editorTagViewModel0, this), composer1, 54), composer1, 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y5(this, editorTagViewModel0, v));
        }
    }

    public final void a(String s, Function1 function10, Function1 function11, Composer composer0, int v) {
        String s1;
        Composer composer1 = composer0.startRestartGroup(-2007833680);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2007833680, v1, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.RecentTag (EditorTagFragment.kt:335)");
            }
            if(((Boolean)function11.invoke(s)).booleanValue()) {
                composer1.startReplaceGroup(742751200);
                s1 = StringResources_androidKt.stringResource(string.content_desc_disabled, new Object[]{s}, composer1, 0x40);
            }
            else {
                composer1.startReplaceGroup(0x2C4584A2);
                s1 = StringResources_androidKt.stringResource(string.content_desc_insert_tag, new Object[]{s}, composer1, 0x40);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0x2C4598A3);
            boolean z = composer1.changed(s1);
            u4 u40 = composer1.rememberedValue();
            if(z || u40 == Composer.Companion.getEmpty()) {
                u40 = new u4(s1);
                composer1.updateRememberedValue(u40);
            }
            composer1.endReplaceGroup();
            int v2 = 1;
            Modifier modifier0 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, u40, 1, null);
            composer1.startReplaceGroup(0x2C459F77);
            if((v1 & 14) != 4) {
                v2 = 0;
            }
            v4 v40 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | v2) != 0 || v40 == Composer.Companion.getEmpty()) {
                v40 = new v4(function10, s);
                composer1.updateRememberedValue(v40);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(("#" + s), ClickableKt.clickable-XHw0xAI$default(modifier0, false, null, null, v40, 7, null), ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0x141700000L, null, FontWeight.Companion.getLight(), TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 1, 0, null, null, composer1, 0x1B0C00, 0x6C30, 0x39790);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w4(this, s, function10, function11, v));
        }
    }

    public final void a(String s, boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2022006852);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2022006852, v1, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.Tag (EditorTagFragment.kt:307)");
            }
            composer1.startReplaceGroup(0xB480931A);
            String s1 = z ? StringResources_androidKt.stringResource(string.content_desc_select_already, new Object[]{s}, composer1, 0x40) : s;
            composer1.endReplaceGroup();
            int v2 = 1;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, 5.0f, 1, null);
            composer1.startReplaceGroup(0xB480AC46);
            boolean z1 = composer1.changed(s1);
            z4 z40 = composer1.rememberedValue();
            if(z1 || z40 == Composer.Companion.getEmpty()) {
                z40 = new z4(s1);
                composer1.updateRememberedValue(z40);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, z40, 1, null);
            composer1.startReplaceGroup(0xB480B41A);
            if((v1 & 0x70) != 0x20) {
                v2 = 0;
            }
            a5 a50 = composer1.rememberedValue();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | v2) != 0 || a50 == Composer.Companion.getEmpty()) {
                a50 = new a5(function10, z);
                composer1.updateRememberedValue(a50);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = PaddingKt.padding-VpY3zN4(BackgroundKt.background-bw27NRU(ClickableKt.clickable-XHw0xAI$default(modifier1, false, null, null, a50, 7, null), ColorResources_androidKt.colorResource((z ? color.gray1 : color.color_f5f5f5), composer1, 0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), 12.0f, 5.0f);
            TextStyle textStyle0 = new TextStyle(ColorResources_androidKt.colorResource((z ? color.white : color.gray1), composer1, 0), 0x141700000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(("#" + s), modifier2, 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(5), 0L, 2, false, false, 1, 0, null, textStyle0, composer1, 0, 0x6C30, 0x195FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b5(this, s, z, function10, v));
        }
    }

    public static final void access$RecentTagList(EditorTagFragment editorTagFragment0, List list0, Function1 function10, Function1 function11, Composer composer0, int v) {
        editorTagFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(930903999);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(930903999, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.RecentTagList (EditorTagFragment.kt:199)");
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
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 14.0f, 0.0f, 0.0f, 13, null);
        FontWeight fontWeight0 = FontWeight.Companion.getNormal();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ("최근 사용한 태그", modifier2, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C36, 0, 0x3FF90);
        b.a(3.0f, modifier$Companion0, composer1, 6);
        FlowKt.FlowRow-07r0xoM(null, null, null, 10.0f, null, 4.0f, null, ComposableLambdaKt.rememberComposableLambda(-1403243569, true, new x4(list0, editorTagFragment0, function10, function11), composer1, 54), composer1, 0xC30C00, 87);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y4(editorTagFragment0, list0, function10, function11, v));
        }
    }

    public static final void access$TagInput(EditorTagFragment editorTagFragment0, Modifier modifier0, String s, Function1 function10, Function0 function00, Composer composer0, int v, int v1) {
        Modifier modifier1;
        Modifier modifier5;
        int v2;
        editorTagFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xFE1136E3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFE1136E3, v2, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagInput (EditorTagFragment.kt:225)");
            }
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, l5.a, composer1, 3080, 6);
            composer1.startReplaceGroup(0x3C4DE58);
            boolean z = composer1.changed(((MutableState)object0));
            k5 k50 = composer1.rememberedValue();
            if((v2 & 0x380) == 0x100 || z || k50 == Composer.Companion.getEmpty()) {
                k50 = new k5(function10, ((MutableState)object0));
                composer1.updateRememberedValue(k50);
            }
            composer1.endReplaceGroup();
            State state0 = SnapshotStateKt.rememberUpdatedState(k50, composer1, 0);
            composer1.startReplaceGroup(0x3C4E864);
            FocusRequester focusRequester0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            composer1.endReplaceGroup();
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Unit unit0 = Unit.INSTANCE;
            composer1.startReplaceGroup(0x3C4F943);
            boolean z1 = composer1.changed(softwareKeyboardController0);
            c5 c50 = composer1.rememberedValue();
            if(z1 || c50 == composer$Companion0.getEmpty()) {
                c50 = new c5(focusRequester0, softwareKeyboardController0, null);
                composer1.updateRememberedValue(c50);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit0, c50, composer1, 70);
            composer1.startReplaceGroup(0x3C50992);
            boolean z2 = composer1.changed(softwareKeyboardController0);
            d5 d50 = composer1.rememberedValue();
            if((v2 & 0x70) == 0x20 || z2 || d50 == composer$Companion0.getEmpty()) {
                d50 = new d5(s, softwareKeyboardController0, null);
                composer1.updateRememberedValue(d50);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(s, d50, composer1, v2 >> 3 & 14 | 0x40);
            Modifier modifier3 = SizeKt.height-3ABfNKs(modifier2, 42.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                modifier5 = modifier2;
                d.a(v3, composer1, v3, function20);
            }
            else {
                modifier5 = modifier2;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    d.a(v3, composer1, v3, function20);
                }
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            int v4 = ((String)((MutableState)object0).getValue()).length() == 0 ? color.gray9 : color.gray1;
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ("#", SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, e5.a), ColorResources_androidKt.colorResource(v4, composer1, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1(), 0L, 0x141700000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFD, null), composer1, 6, 0, 0x1FFF8);
            String s1 = (String)((MutableState)object0).getValue();
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1();
            boolean z3 = false;
            PlatformTextStyle platformTextStyle0 = new PlatformTextStyle(false);
            TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(textStyle0, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x141700000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, platformTextStyle0, null, 0, 0, null, 0xF7FFFC, null);
            KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 0, 6, null, null, null, 0x77, null);
            composer1.startReplaceGroup(1995360018);
            boolean z4 = composer1.changed(state0);
            f5 f50 = composer1.rememberedValue();
            if(z4 || f50 == composer$Companion0.getEmpty()) {
                f50 = new f5(state0);
                composer1.updateRememberedValue(f50);
            }
            composer1.endReplaceGroup();
            KeyboardActions keyboardActions0 = new KeyboardActions(null, null, f50, null, null, null, 59, null);
            Modifier modifier6 = FocusRequesterModifierKt.focusRequester(modifier$Companion0, focusRequester0);
            composer1.startReplaceGroup(0x76EF29D0);
            if((v2 & 0x1C00) == 0x800) {
                z3 = true;
            }
            boolean z5 = composer1.changed(state0);
            g5 g50 = composer1.rememberedValue();
            if(z3 || z5 || g50 == composer$Companion0.getEmpty()) {
                g50 = new g5(function00, state0);
                composer1.updateRememberedValue(g50);
            }
            composer1.endReplaceGroup();
            Modifier modifier7 = KeyInputModifierKt.onKeyEvent(modifier6, g50);
            composer1.startReplaceGroup(1995344260);
            boolean z6 = composer1.changed(((MutableState)object0));
            h5 h50 = composer1.rememberedValue();
            if(z6 || h50 == composer$Companion0.getEmpty()) {
                h50 = new h5(((MutableState)object0));
                composer1.updateRememberedValue(h50);
            }
            composer1.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(s1, h50, modifier7, false, false, textStyle1, keyboardOptions0, keyboardActions0, true, 0, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xE0A732B5, true, new i5(((MutableState)object0)), composer1, 54), composer1, 0x6180000, 0x30000, 32280);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j5(editorTagFragment0, modifier1, s, function10, function00, v, v1));
        }
    }

    public static final String access$TagInput$lambda$5(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final void access$TagInput$lambda$6(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final Function0 access$TagInput$lambda$8(State state0) {
        return (Function0)state0.getValue();
    }

    public static final void access$TagList(EditorTagFragment editorTagFragment0, List list0, boolean z, Function1 function10, Function1 function11, Composer composer0, int v) {
        editorTagFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(1000518496);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1000518496, v, -1, "com.kakao.tistory.presentation.view.editor.EditorTagFragment.TagList (EditorTagFragment.kt:137)");
        }
        composer1.startReplaceGroup(0x99A02F8B);
        MutableState mutableState0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x99A03A58);
        boolean z1 = (v & 0x1C00 ^ 0xC00) > 0x800 && composer1.changed(function11) || (v & 0xC00) == 0x800;
        s5 s50 = composer1.rememberedValue();
        if(z1 || s50 == composer$Companion0.getEmpty()) {
            s50 = new s5(mutableState0, function11);
            composer1.updateRememberedValue(s50);
        }
        composer1.endReplaceGroup();
        FlowKt.FlowRow-07r0xoM(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), null, null, 8.0f, null, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1433623770, true, new q5(list0, z, editorTagFragment0, function10, s50, mutableState0), composer1, 54), composer1, 0xC00C06, 0x76);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r5(editorTagFragment0, list0, z, function10, function11, v));
        }
    }

    public static final String access$TagList$lambda$1(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final void access$TagList$lambda$2(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final EditorTagViewModel access$getEditorTagViewModel(EditorTagFragment editorTagFragment0) {
        return (EditorTagViewModel)editorTagFragment0.l.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        EditorViewModel editorViewModel0 = (EditorViewModel)this.k.getValue();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getTrackPageViewTag(), lifecycleOwner0, new z5(this));
        editorViewModel0.getTagList().observe(this.getViewLifecycleOwner(), new f6(new a6(this)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d6(this, editorViewModel0, null), 3, null);
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getCompleteEditTag(), lifecycleOwner1, new e6(editorViewModel0, this));
        EditorTagTiara.INSTANCE.trackPage();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

