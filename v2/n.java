package v2;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.ComposableSingletons.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.jvm.functions.Function2;

public final class n extends AbstractComposeView implements DialogWindowProvider {
    public final Window E;
    public final MutableState F;
    public boolean G;
    public boolean H;

    public n(Context context0, Window window0) {
        super(context0, null, 0, 6, null);
        this.E = window0;
        this.F = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.AndroidDialog_androidKt.INSTANCE.getLambda-1$ui_release(), null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6770D814);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6770D814, v1, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            ((Function2)this.F.getValue()).invoke(composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 15));
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }

    @Override  // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.E;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        super.internalOnLayout$ui_release(z, v, v1, v2, v3);
        if(!this.G) {
            View view0 = this.getChildAt(0);
            if(view0 == null) {
                return;
            }
            int v4 = view0.getMeasuredWidth();
            int v5 = view0.getMeasuredHeight();
            this.E.setLayout(v4, v5);
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui_release(int v, int v1) {
        if(this.G) {
            super.internalOnMeasure$ui_release(v, v1);
            return;
        }
        float f = this.getContext().getResources().getDisplayMetrics().density;
        int v2 = View.MeasureSpec.makeMeasureSpec(Math.round(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f), 0x80000000);
        float f1 = this.getContext().getResources().getDisplayMetrics().density;
        super.internalOnMeasure$ui_release(v2, View.MeasureSpec.makeMeasureSpec(Math.round(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f1), 0x80000000));
    }
}

