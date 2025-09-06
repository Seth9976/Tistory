package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

public final class w0 extends TransitionListenerAdapter {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final Visibility d;

    public w0(Visibility visibility0, ViewGroup viewGroup0, View view0, View view1) {
        this.d = visibility0;
        this.a = viewGroup0;
        this.b = view0;
        this.c = view1;
        super();
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        this.c.setTag(id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        transition0.removeListener(this);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionPause(Transition transition0) {
        this.a.getOverlay().remove(this.b);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionResume(Transition transition0) {
        View view0 = this.b;
        if(view0.getParent() == null) {
            this.a.getOverlay().add(view0);
            return;
        }
        this.d.cancel();
    }
}

