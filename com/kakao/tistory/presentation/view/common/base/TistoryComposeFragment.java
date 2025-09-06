package com.kakao.tistory.presentation.view.common.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.network.NetworkCheckImpl;
import com.kakao.android.base.network.NetworkCheckInterface;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.ui.LayoutLessBaseFragment;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\n\u0010\tJ@\u0010\u0012\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00070\u000F2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00070\u000FH\u0096\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u0019\u001A\u00020\u00182\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ!\u0010 \u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u001C2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0016\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u0007H\'\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010*\u001A\u00020\u00072\u0006\u0010)\u001A\u00020(H\u0007\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b,\u0010\u0005J\r\u0010-\u001A\u00020\u0007\u00A2\u0006\u0004\b-\u0010\u0005J\u0017\u0010.\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$H\u0004\u00A2\u0006\u0004\b.\u0010/J\u000F\u00100\u001A\u00020\u0007H\u0004\u00A2\u0006\u0004\b0\u0010\u0005R\"\u00108\u001A\u0002018\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R\u001C\u0010>\u001A\u0002098\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001E\u0010D\u001A\u0004\u0018\u00010?8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001C\u0010G\u001A\u0002098\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\bE\u0010;\"\u0004\bF\u0010=R\u001E\u0010J\u001A\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\bH\u0010;\"\u0004\bI\u0010=R\u001A\u0010L\u001A\b\u0012\u0004\u0012\u0002010K8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bL\u0010M\u00A8\u0006P\u00B2\u0006\u000E\u0010N\u001A\u0004\u0018\u00010$8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010O\u001A\u0002018\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "Lcom/kakao/android/base/ui/LayoutLessBaseFragment;", "Lcom/kakao/android/base/tiara/TiaraListener;", "Lcom/kakao/android/base/network/NetworkCheckInterface;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function0;", "onConnected", "onUnconnected", "initNetworkCheck", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "CommonExceptionView", "(Lcom/kakao/android/base/model/ErrorModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "ToolbarVisibilityHandler", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "refresh", "refreshToolbar", "showExceptionView", "(Lcom/kakao/android/base/model/ErrorModel;)V", "hideExceptionView", "", "e", "Z", "getEnableTopPaddingInExceptionView", "()Z", "setEnableTopPaddingInExceptionView", "(Z)V", "enableTopPaddingInExceptionView", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Landroidx/lifecycle/LiveData;", "isNetworkConnected", "()Landroidx/lifecycle/LiveData;", "exception", "isVisibleToolbar", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryComposeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryComposeFragment.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,117:1\n81#2:118\n107#2,2:119\n81#2:127\n1223#3,6:121\n*S KotlinDebug\n*F\n+ 1 TistoryComposeFragment.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment\n*L\n32#1:118\n32#1:119,2\n91#1:127\n91#1:121,6\n*E\n"})
public abstract class TistoryComposeFragment extends LayoutLessBaseFragment implements NetworkCheckInterface, TiaraListener {
    public static final int $stable = 8;
    public final TiaraDelegator a;
    public final NetworkCheckImpl b;
    public final MutableState c;
    public final MutableLiveData d;
    public boolean e;

    public TistoryComposeFragment() {
        this.a = new TiaraDelegator();
        this.b = new NetworkCheckImpl();
        this.c = SnapshotStateKt.mutableStateOf$default(System.currentTimeMillis(), null, 2, null);
        this.d = new MutableLiveData();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void CommonExceptionView(@NotNull ErrorModel errorModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        Composer composer1 = composer0.startRestartGroup(927041987);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(927041987, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment.CommonExceptionView (TistoryComposeFragment.kt:78)");
        }
        String s = StringResources_androidKt.stringResource(string.web_link_faq, composer1, 0);
        CommonExceptionViewKt.CommonExceptionView(errorModel0, this.e, new k(this, s), false, new l(this), composer1, 8, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, errorModel0, v));
        }
    }

    @Composable
    public abstract void Content(@Nullable Composer arg1, int arg2);

    @Composable
    public final void ToolbarVisibilityHandler(@NotNull LazyListState lazyListState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "state");
        Composer composer1 = composer0.startRestartGroup(-347830161);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-347830161, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment.ToolbarVisibilityHandler (TistoryComposeFragment.kt:89)");
        }
        composer1.startReplaceGroup(0x2050EFE4);
        State state0 = composer1.rememberedValue();
        if(state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new o(lazyListState0));
            composer1.updateRememberedValue(state0);
        }
        composer1.endReplaceGroup();
        FragmentActivity fragmentActivity0 = this.getActivity();
        TistoryToolbarActivity tistoryToolbarActivity0 = fragmentActivity0 instanceof TistoryToolbarActivity ? ((TistoryToolbarActivity)fragmentActivity0) : null;
        if(tistoryToolbarActivity0 != null) {
            tistoryToolbarActivity0.updateToolbarVisibility(((Boolean)state0.getValue()).booleanValue(), ((Number)this.c.getValue()).longValue() != 0L);
        }
        this.c.setValue(0L);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(this, lazyListState0, v));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getAction() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public ActionKind getActionKind() {
        return this.a.getActionKind();
    }

    public final boolean getEnableTopPaddingInExceptionView() {
        return this.e;
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public String getSection() {
        return this.a.getSection();
    }

    public final void hideExceptionView() {
        this.d.postValue(null);
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    public void initNetworkCheck(@NotNull Context context0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(function00, "onConnected");
        Intrinsics.checkNotNullParameter(function01, "onUnconnected");
        this.b.initNetworkCheck(context0, lifecycleOwner0, function00, function01);
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    @NotNull
    public LiveData isNetworkConnected() {
        return this.b.isNetworkConnected();
    }

    @Override  // com.kakao.android.base.ui.LayoutLessBaseFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.updatePageInfo(this);
        this.trackPage(this);
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        this.initNetworkCheck(context0, this, new p(this), new q(this));
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        Context context0 = layoutInflater0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return new ComposeView(context0, null, 0, 6, null);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        ComposeView composeView0 = view0 instanceof ComposeView ? ((ComposeView)view0) : null;
        if(composeView0 != null) {
            composeView0.setContent(ComposableLambdaKt.composableLambdaInstance(0x52FDBEB5, true, new s(this)));
        }
    }

    public void refresh() {
    }

    public final void refreshToolbar() {
        this.c.setValue(System.currentTimeMillis());
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a.setAction(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setActionKind(@Nullable ActionKind actionKind0) {
        this.a.setActionKind(actionKind0);
    }

    public final void setEnableTopPaddingInExceptionView(boolean z) {
        this.e = z;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a.setPage(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.a.setSection(s);
    }

    public final void showExceptionView(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        this.d.postValue(errorModel0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.a.trackPage(tiaraListener0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.a.updatePageInfo(tiaraListener0);
    }
}

