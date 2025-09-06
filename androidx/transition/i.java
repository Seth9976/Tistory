package androidx.transition;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i extends TransitionListenerAdapter {
    public View a;
    public GhostView b;

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionEnd(Transition transition0) {
        transition0.removeListener(this);
        View view0 = this.a;
        if(Build.VERSION.SDK_INT == 28) {
            if(!w.g) {
                try {
                    w.a();
                    Method method0 = w.b.getDeclaredMethod("removeGhost", View.class);
                    w.f = method0;
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", noSuchMethodException0);
                }
                w.g = true;
            }
            Method method1 = w.f;
            if(method1 != null) {
                try {
                    method1.invoke(null, view0);
                    goto label_24;
                }
                catch(IllegalAccessException invocationTargetException0) {
                }
                catch(InvocationTargetException unused_ex) {
                    goto label_24;
                }
                throw new RuntimeException(invocationTargetException0.getCause());
            }
        }
        else {
            y y0 = (y)view0.getTag(id.ghost_view);
            if(y0 != null) {
                int v = y0.d - 1;
                y0.d = v;
                if(v <= 0) {
                    ((v)y0.getParent()).removeView(y0);
                }
            }
        }
    label_24:
        view0.setTag(id.transition_transform, null);
        view0.setTag(id.parent_matrix, null);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionPause(Transition transition0) {
        this.b.setVisibility(4);
    }

    @Override  // androidx.transition.TransitionListenerAdapter
    public final void onTransitionResume(Transition transition0) {
        this.b.setVisibility(0);
    }
}

