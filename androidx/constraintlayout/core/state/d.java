package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.Easing;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;

public final class d implements Interpolator, SuccessContinuation {
    public final int a;
    public final String b;

    public d(String s, int v) {
        this.a = v;
        this.b = s;
        super();
    }

    @Override  // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return (float)Easing.getInterpolator(this.b).get(((double)f));
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        String s = this.b;
        if(this.a != 1) {
            ((v)object0).getClass();
            Task task0 = ((v)object0).d(new s("U", s));
            ((v)object0).f();
            return task0;
        }
        ((v)object0).getClass();
        Task task1 = ((v)object0).d(new s("S", s));
        ((v)object0).f();
        return task1;
    }
}

