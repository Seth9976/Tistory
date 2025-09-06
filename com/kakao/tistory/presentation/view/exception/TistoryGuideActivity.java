package com.kakao.tistory.presentation.view.exception;

import a;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideType;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel;
import com.kakao.tistory.presentation.widget.common.CommonEmptyViewKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000EH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u001A\u001A\u00020\u00062\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0007¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001D\u001A\u00020\u001C8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006#²\u0006\u000E\u0010\"\u001A\u0004\u0018\u00010\u00128\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0015\u001A\u0004\u0018\u00010\u00148\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0017\u001A\u0004\u0018\u00010\u00168\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/exception/TistoryGuideActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "updatePageInfo", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "initAppBar", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "title", "", "charSeqMessage", "", "buttonTextRes", "Lkotlin/Function0;", "buttonClick", "GuideBody", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "profileEnabled", "Z", "getProfileEnabled", "()Z", "Companion", "titleText", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryGuideActivity.kt\ncom/kakao/tistory/presentation/view/exception/TistoryGuideActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n10#2,2:145\n1#3:147\n1#3:161\n75#4,13:148\n85#5:162\n82#5,6:163\n88#5:197\n92#5:207\n78#6,6:169\n85#6,4:184\n89#6,2:194\n93#6:206\n368#7,9:175\n377#7:196\n378#7,2:204\n4032#8,6:188\n148#9:198\n148#9:199\n148#9:200\n148#9:201\n148#9:202\n148#9:203\n81#10:208\n81#10:209\n81#10:210\n*S KotlinDebug\n*F\n+ 1 TistoryGuideActivity.kt\ncom/kakao/tistory/presentation/view/exception/TistoryGuideActivity\n*L\n44#1:145,2\n44#1:147\n44#1:148,13\n107#1:162\n107#1:163,6\n107#1:197\n107#1:207\n107#1:169,6\n107#1:184,4\n107#1:194,2\n107#1:206\n107#1:175,9\n107#1:196\n107#1:204,2\n107#1:188,6\n116#1:198\n123#1:199\n128#1:200\n130#1:201\n131#1:202\n132#1:203\n93#1:208\n94#1:209\n95#1:210\n*E\n"})
public final class TistoryGuideActivity extends Hilt_TistoryGuideActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/exception/TistoryGuideActivity$Companion;", "", "", "BUNDLE_GUIDE_TYPE", "Ljava/lang/String;", "BUNDLE_REDIRECT_URL", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final String BUNDLE_GUIDE_TYPE = "BUNDLE_GUIDE_TYPE";
    @NotNull
    public static final String BUNDLE_REDIRECT_URL = "BUNDLE_REDIRECT_URL";
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy s;

    static {
        TistoryGuideActivity.Companion = new Companion(null);
        TistoryGuideActivity.$stable = 8;
    }

    public TistoryGuideActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.s = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(TistoryGuideViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x90CC68B0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90CC68B0, v, -1, "com.kakao.tistory.presentation.view.exception.TistoryGuideActivity.Content (TistoryGuideActivity.kt:91)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((TistoryGuideViewModel)this.s.getValue()).getTitle(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(((TistoryGuideViewModel)this.s.getValue()).getMessage(), composer1, 8);
        State state2 = LiveDataAdapterKt.observeAsState(((TistoryGuideViewModel)this.s.getValue()).getButton(), composer1, 8);
        d d0 = new d(((TistoryGuideViewModel)this.s.getValue()));
        this.GuideBody(((String)state0.getValue()), ((CharSequence)state1.getValue()), ((Integer)state2.getValue()), d0, composer1, 0x8040);
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
    public final void GuideBody(@Nullable String s, @Nullable CharSequence charSequence0, @Nullable Integer integer0, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "buttonClick");
        Composer composer1 = composer0.startRestartGroup(0x1CEDAC7B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1CEDAC7B, v, -1, "com.kakao.tistory.presentation.view.exception.TistoryGuideActivity.GuideBody (TistoryGuideActivity.kt:105)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        TextStyle textStyle0 = TypeKt.getGuideTitle(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
        TextKt.Text--4IGK_g((s == null ? "" : s), PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 7.0f, 50.0f, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0xFFFC);
        CharSequence charSequence1 = charSequence0 == null ? "" : charSequence0;
        CommonEmptyViewKt.CommonEmptyView(charSequence1, composer1, 8);
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        ButtonElevation buttonElevation0 = ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, ButtonDefaults.$stable << 15 | 6, 30);
        long v2 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
        ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(v2, 0L, 0L, 0L, composer1, ButtonDefaults.$stable << 12, 14);
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
        ButtonKt.Button(function00, SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(PaddingKt.padding-3ABfNKs(ClipKt.clip(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), 20.0f), 44.0f), 0.0f, 1, null), false, null, buttonElevation0, null, null, buttonColors0, paddingValues0, ComposableLambdaKt.rememberComposableLambda(-407579947, true, new e(integer0), composer1, 54), composer1, v >> 9 & 14 | 0x36000000, 108);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(this, s, charSequence0, integer0, function00, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public boolean getProfileEnabled() {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void initAppBar() {
        this.initAppBarHomeAsUp(BackBlack.INSTANCE);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.initAppBar();
        LiveDataExtensionKt.observeEvent(((TistoryGuideViewModel)this.s.getValue()).getGuideNavigator(), this, new g(this));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        super.updatePageInfo(tiaraListener0);
        Intent intent0 = this.getIntent();
        String s = null;
        if(intent0 != null) {
            Serializable serializable0 = intent0.getSerializableExtra("BUNDLE_GUIDE_TYPE");
            if(serializable0 != null) {
                if(!(serializable0 instanceof GuideType)) {
                    serializable0 = null;
                }
                if(serializable0 != null) {
                    TistoryGuideViewModel tistoryGuideViewModel0 = (TistoryGuideViewModel)this.s.getValue();
                    Intent intent1 = this.getIntent();
                    if(intent1 != null) {
                        s = intent1.getStringExtra("BUNDLE_REDIRECT_URL");
                    }
                    tistoryGuideViewModel0.init(((GuideType)serializable0), s);
                    this.setSection(((GuideType)serializable0).getTiaraSection());
                    this.setPage(((GuideType)serializable0).getTiaraPage());
                    s = Unit.INSTANCE;
                }
            }
        }
        if(s == null) {
            this.finish();
        }
    }
}

