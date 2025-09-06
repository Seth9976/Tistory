package y2;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class h extends ViewTimeCycle {
    public boolean a;

    @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
    public final boolean setProperty(View view0, float f, long v, KeyCache keyCache0) {
        Method method0;
        if(view0 instanceof MotionLayout) {
            ((MotionLayout)view0).setProgress(this.get(f, v, view0, keyCache0));
            return this.mContinue;
        }
        if(this.a) {
            return false;
        }
        try {
            method0 = view0.getClass().getMethod("setProgress", Float.TYPE);
        }
        catch(NoSuchMethodException unused_ex) {
            this.a = true;
            method0 = null;
        }
        if(method0 != null) {
            try {
                method0.invoke(view0, this.get(f, v, view0, keyCache0));
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("ViewTimeCycle", "unable to setProgress", illegalAccessException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("ViewTimeCycle", "unable to setProgress", invocationTargetException0);
            }
            return this.mContinue;
        }
        return this.mContinue;
    }
}

