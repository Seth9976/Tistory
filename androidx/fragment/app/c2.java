package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

public final class c2 extends Operation {
    public final k1 h;

    public c2(State specialEffectsController$Operation$State0, LifecycleImpact specialEffectsController$Operation$LifecycleImpact0, k1 k10, CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation$State0, "finalState");
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation$LifecycleImpact0, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(k10, "fragmentStateManager");
        Intrinsics.checkNotNullParameter(cancellationSignal0, "cancellationSignal");
        Intrinsics.checkNotNullExpressionValue(k10.c, "fragmentStateManager.fragment");
        super(specialEffectsController$Operation$State0, specialEffectsController$Operation$LifecycleImpact0, k10.c, cancellationSignal0);
        this.h = k10;
    }

    @Override  // androidx.fragment.app.SpecialEffectsController$Operation
    public final void complete() {
        super.complete();
        this.h.k();
    }

    @Override  // androidx.fragment.app.SpecialEffectsController$Operation
    public final void onStart() {
        k1 k10 = this.h;
        if(this.getLifecycleImpact() == LifecycleImpact.ADDING) {
            Fragment fragment0 = k10.c;
            Intrinsics.checkNotNullExpressionValue(fragment0, "fragmentStateManager.fragment");
            View view0 = fragment0.mView.findFocus();
            if(view0 != null) {
                fragment0.setFocusedView(view0);
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + view0 + " for Fragment " + fragment0);
                }
            }
            View view1 = this.getFragment().requireView();
            Intrinsics.checkNotNullExpressionValue(view1, "this.fragment.requireView()");
            if(view1.getParent() == null) {
                k10.b();
                view1.setAlpha(0.0f);
            }
            if(view1.getAlpha() == 0.0f && view1.getVisibility() == 0) {
                view1.setVisibility(4);
            }
            view1.setAlpha(fragment0.getPostOnViewCreatedAlpha());
            return;
        }
        if(this.getLifecycleImpact() == LifecycleImpact.REMOVING) {
            Fragment fragment1 = k10.c;
            Intrinsics.checkNotNullExpressionValue(fragment1, "fragmentStateManager.fragment");
            View view2 = fragment1.requireView();
            Intrinsics.checkNotNullExpressionValue(view2, "fragment.requireView()");
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Clearing focus " + view2.findFocus() + " on view " + view2 + " for Fragment " + fragment1);
            }
            view2.clearFocus();
        }
    }
}

