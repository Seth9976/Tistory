package androidx.compose.material3;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Window;
import androidx.activity.n;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class hd extends AbstractComposeView implements DialogWindowProvider {
    public final Window E;
    public final boolean F;
    public final Function0 G;
    public final Animatable H;
    public final CoroutineScope I;
    public final MutableState J;
    public Object K;
    public boolean L;

    public hd(Context context0, Window window0, boolean z, Function0 function00, Animatable animatable0, CoroutineScope coroutineScope0) {
        super(context0, null, 0, 6, null);
        this.E = window0;
        this.F = z;
        this.G = function00;
        this.H = animatable0;
        this.I = coroutineScope0;
        this.J = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.ModalBottomSheet_androidKt.INSTANCE.getLambda-2$material3_release(), null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x225FDEDF);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x225FDEDF, v1, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            ((Function2)this.J.getValue()).invoke(composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 0));
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    @Override  // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.E;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.F) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 33) {
                if(this.K == null) {
                    this.K = v < 34 ? cd.a(this.G) : n.l(ModalBottomSheetDialogLayout.Api34Impl.a(this.G, this.H, this.I));
                }
                cd.b(this, this.K);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(Build.VERSION.SDK_INT >= 33) {
            cd.c(this, this.K);
        }
        this.K = null;
    }
}

