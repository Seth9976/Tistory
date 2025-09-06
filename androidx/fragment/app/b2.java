package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class b2 implements Runnable {
    public final int a;
    public final Object b;
    public final Operation c;

    public b2(Object object0, Operation specialEffectsController$Operation0, int v) {
        this.a = v;
        this.b = object0;
        this.c = specialEffectsController$Operation0;
        super();
    }

    @Override
    public final void run() {
        Operation specialEffectsController$Operation0 = this.c;
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((SpecialEffectsController)object0), "this$0");
                Intrinsics.checkNotNullParameter(((c2)specialEffectsController$Operation0), "$operation");
                if(((SpecialEffectsController)object0).b.contains(((c2)specialEffectsController$Operation0))) {
                    View view0 = ((c2)specialEffectsController$Operation0).getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view0, "operation.fragment.mView");
                    ((c2)specialEffectsController$Operation0).getFinalState().applyState(view0);
                }
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((SpecialEffectsController)object0), "this$0");
                Intrinsics.checkNotNullParameter(((c2)specialEffectsController$Operation0), "$operation");
                ((SpecialEffectsController)object0).b.remove(((c2)specialEffectsController$Operation0));
                ((SpecialEffectsController)object0).c.remove(((c2)specialEffectsController$Operation0));
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((k)object0), "$transitionInfo");
                Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "$operation");
                ((k)object0).a();
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Transition for operation " + specialEffectsController$Operation0 + " has completed");
                }
            }
        }
    }
}

