package androidx.fragment.app;

import android.view.ViewGroup;

public final class t0 implements SpecialEffectsControllerFactory {
    @Override  // androidx.fragment.app.SpecialEffectsControllerFactory
    public final SpecialEffectsController createController(ViewGroup viewGroup0) {
        return new DefaultSpecialEffectsController(viewGroup0);
    }
}

