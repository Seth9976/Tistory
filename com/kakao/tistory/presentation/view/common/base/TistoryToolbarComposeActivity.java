package com.kakao.tistory.presentation.view.common.base;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.databinding.ActivityTistoryToolbarBinding;
import com.kakao.tistory.presentation.view.common.AppBarTitleVisibleViewBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000EH\'¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0017\u001A\u00020\u00128WX\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u001A²\u0006\f\u0010\u0019\u001A\u00020\u00188\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "initAppBar", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "ToolbarVisibilityHandler", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "o", "I", "getContentLayoutResourceId", "()I", "contentLayoutResourceId", "", "isVisibleToolbar", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryToolbarComposeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryToolbarComposeActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,52:1\n1223#2,6:53\n81#3:59\n*S KotlinDebug\n*F\n+ 1 TistoryToolbarComposeActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryToolbarComposeActivity\n*L\n41#1:53,6\n41#1:59\n*E\n"})
public abstract class TistoryToolbarComposeActivity extends TistoryToolbarActivity {
    public static final int $stable;
    public final int o;

    public TistoryToolbarComposeActivity() {
        this.o = layout.compose_container;
    }

    @Composable
    public abstract void Content(@NotNull Modifier arg1, @Nullable Composer arg2, int arg3);

    @Composable
    public final void ToolbarVisibilityHandler(@NotNull LazyListState lazyListState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyListState0, "state");
        Composer composer1 = composer0.startRestartGroup(-1023880279);
        int v1 = (v & 14) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1023880279, v1, -1, "com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity.ToolbarVisibilityHandler (TistoryToolbarComposeActivity.kt:39)");
            }
            composer1.startReplaceGroup(0x7070A4AA);
            State state0 = composer1.rememberedValue();
            if(state0 == Composer.Companion.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new k0(lazyListState0));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            TistoryToolbarActivity.updateToolbarVisibility$default(this, ((Boolean)state0.getValue()).booleanValue(), false, 2, null);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(this, lazyListState0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    @LayoutRes
    public int getContentLayoutResourceId() {
        return this.o;
    }

    public void initAppBar() {
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((ComposeView)this.findViewById(id.compose_container)).setContent(ComposableLambdaKt.composableLambdaInstance(0xFAE24F86, true, new m0(this)));
        this.initAppBar();
        AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior0 = this.getAppBarTitleVisibleViewBehavior();
        CoordinatorLayout coordinatorLayout0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonContainer;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout0, "commonContainer");
        appBarTitleVisibleViewBehavior0.setupView(coordinatorLayout0);
    }
}

