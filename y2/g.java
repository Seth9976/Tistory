package y2;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;

public final class g extends ViewTimeCycle {
    public final int a;

    public g(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
    public final boolean setProperty(View view0, float f, long v, KeyCache keyCache0) {
        switch(this.a) {
            case 0: {
                view0.setAlpha(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 1: {
                view0.setElevation(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 2: {
                view0.setRotation(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 3: {
                view0.setRotationX(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 4: {
                view0.setRotationY(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 5: {
                view0.setScaleX(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 6: {
                view0.setScaleY(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 7: {
                view0.setTranslationX(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            case 8: {
                view0.setTranslationY(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
            default: {
                view0.setTranslationZ(this.get(f, v, view0, keyCache0));
                return this.mContinue;
            }
        }
    }
}

