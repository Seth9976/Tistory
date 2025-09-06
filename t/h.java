package t;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;

public final class h implements DecayAnimationSpec {
    public final FloatDecayAnimationSpec a;

    public h(FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        this.a = floatDecayAnimationSpec0;
    }

    @Override  // androidx.compose.animation.core.DecayAnimationSpec
    public final VectorizedDecayAnimationSpec vectorize(TwoWayConverter twoWayConverter0) {
        return new i0(this.a);
    }
}

