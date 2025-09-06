package u;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;

public final class w1 extends EdgeEffect {
    public final float a;
    public float b;

    public w1(Context context0) {
        super(context0);
        this.a = AndroidDensity_androidKt.Density(context0).toPx-0680j_4(1.0f);
    }

    @Override  // android.widget.EdgeEffect
    public final void onAbsorb(int v) {
        this.b = 0.0f;
        super.onAbsorb(v);
    }

    @Override  // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }

    @Override  // android.widget.EdgeEffect
    public final void onPull(float f, float f1) {
        this.b = 0.0f;
        super.onPull(f, f1);
    }

    @Override  // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }
}

