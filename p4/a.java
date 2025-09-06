package p4;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.Intrinsics;

public final class a extends OnBackPressedCallback implements PanelSlideListener {
    public final SlidingPaneLayout a;

    public a(SlidingPaneLayout slidingPaneLayout0) {
        Intrinsics.checkNotNullParameter(slidingPaneLayout0, "slidingPaneLayout");
        super(true);
        this.a = slidingPaneLayout0;
        slidingPaneLayout0.addPanelSlideListener(this);
    }

    @Override  // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.a.closePane();
    }

    @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
    public final void onPanelClosed(View view0) {
        Intrinsics.checkNotNullParameter(view0, "panel");
        this.setEnabled(false);
    }

    @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
    public final void onPanelOpened(View view0) {
        Intrinsics.checkNotNullParameter(view0, "panel");
        this.setEnabled(true);
    }

    @Override  // androidx.slidingpanelayout.widget.SlidingPaneLayout$PanelSlideListener
    public final void onPanelSlide(View view0, float f) {
        Intrinsics.checkNotNullParameter(view0, "panel");
    }
}

