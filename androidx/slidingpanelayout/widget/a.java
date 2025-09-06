package androidx.slidingpanelayout.widget;

import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;

public final class a implements OnFoldingFeatureChangeListener {
    public final SlidingPaneLayout a;

    public a(SlidingPaneLayout slidingPaneLayout0) {
        this.a = slidingPaneLayout0;
    }

    @Override  // androidx.slidingpanelayout.widget.FoldingFeatureObserver$OnFoldingFeatureChangeListener
    public final void onFoldingFeatureChange(FoldingFeature foldingFeature0) {
        this.a.v = foldingFeature0;
        ChangeBounds changeBounds0 = new ChangeBounds();
        changeBounds0.setDuration(300L);
        changeBounds0.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
        TransitionManager.beginDelayedTransition(this.a, changeBounds0);
        this.a.requestLayout();
    }
}

