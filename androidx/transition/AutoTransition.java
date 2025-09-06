package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        this.l();
    }

    public AutoTransition(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.l();
    }

    public final void l() {
        this.setOrdering(1);
        this.addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1));
    }
}

