package y2;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d extends ViewOscillator {
    public boolean g;

    @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
    public final void setProperty(View view0, float f) {
        Method method0;
        if(view0 instanceof MotionLayout) {
            ((MotionLayout)view0).setProgress(this.get(f));
            return;
        }
        if(this.g) {
            return;
        }
        try {
            method0 = view0.getClass().getMethod("setProgress", Float.TYPE);
        }
        catch(NoSuchMethodException unused_ex) {
            this.g = true;
            method0 = null;
        }
        if(method0 != null) {
            try {
                method0.invoke(view0, this.get(f));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("ViewOscillator", "unable to setProgress", illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("ViewOscillator", "unable to setProgress", invocationTargetException0);
            }
        }
    }
}

