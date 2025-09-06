package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import y2.b;
import y2.c;
import y2.d;

public abstract class ViewOscillator extends KeyCycleOscillator {
    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view0, float f, double f1, double f2) {
            view0.setRotation(this.get(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view0, float f) {
        }
    }

    public static ViewOscillator makeSpline(String s) {
        if(s.startsWith("CUSTOM")) {
            return new c();
        }
        switch(s) {
            case "alpha": {
                return new b(0);
            }
            case "elevation": {
                return new b(1);
            }
            case "progress": {
                ViewOscillator viewOscillator0 = new d();  // 初始化器: Landroidx/constraintlayout/motion/utils/ViewOscillator;-><init>()V
                viewOscillator0.g = false;
                return viewOscillator0;
            }
            case "rotation": {
                return new b(2);
            }
            case "rotationX": {
                return new b(3);
            }
            case "rotationY": {
                return new b(4);
            }
            case "scaleX": {
                return new b(5);
            }
            case "scaleY": {
                return new b(6);
            }
            case "transitionPathRotate": {
                return new PathRotateSet();
            }
            case "translationX": {
                return new b(7);
            }
            case "translationY": {
                return new b(8);
            }
            case "translationZ": {
                return new b(9);
            }
            case "waveOffset": {
                return new b(0);
            }
            case "waveVariesBy": {
                return new b(0);
            }
            default: {
                return null;
            }
        }
    }

    public abstract void setProperty(View arg1, float arg2);
}

