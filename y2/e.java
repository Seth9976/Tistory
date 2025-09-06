package y2;

import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;

public final class e extends ViewSpline {
    public final int c;

    public e(int v) {
        this.c = v;
        super();
    }

    @Override  // androidx.constraintlayout.motion.utils.ViewSpline
    public final void setProperty(View view0, float f) {
        switch(this.c) {
            case 0: {
                view0.setAlpha(this.get(f));
                return;
            }
            case 1: {
                view0.setElevation(this.get(f));
                return;
            }
            case 2: {
                view0.setPivotX(this.get(f));
                return;
            }
            case 3: {
                view0.setPivotY(this.get(f));
                return;
            }
            case 4: {
                view0.setRotation(this.get(f));
                return;
            }
            case 5: {
                view0.setRotationX(this.get(f));
                return;
            }
            case 6: {
                view0.setRotationY(this.get(f));
                return;
            }
            case 7: {
                view0.setScaleX(this.get(f));
                return;
            }
            case 8: {
                view0.setScaleY(this.get(f));
                return;
            }
            case 9: {
                view0.setTranslationX(this.get(f));
                return;
            }
            case 10: {
                view0.setTranslationY(this.get(f));
                return;
            }
            default: {
                view0.setTranslationZ(this.get(f));
            }
        }
    }
}

