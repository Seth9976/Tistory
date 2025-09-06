package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public e(DefaultSpecialEffectsController defaultSpecialEffectsController0, View view0, i i0) {
        this.a = 2;
        super();
        this.d = defaultSpecialEffectsController0;
        this.b = view0;
        this.c = i0;
    }

    public e(Object object0, Object object1, int v, Object object2) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = object2;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b;
        Object object1 = this.c;
        Object object2 = this.d;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((List)object0), "$awaitingContainerChanges");
                Intrinsics.checkNotNullParameter(((Operation)object1), "$operation");
                Intrinsics.checkNotNullParameter(((DefaultSpecialEffectsController)object2), "this$0");
                if(((List)object0).contains(((Operation)object1))) {
                    ((List)object0).remove(((Operation)object1));
                    ((DefaultSpecialEffectsController)object2).getClass();
                    View view0 = ((Operation)object1).getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view0, "view");
                    ((Operation)object1).getFinalState().applyState(view0);
                }
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((FragmentTransitionImpl)object0), "$impl");
                Intrinsics.checkNotNullParameter(((Rect)object2), "$lastInEpicenterRect");
                ((FragmentTransitionImpl)object0).getBoundsOnScreen(((View)object1), ((Rect)object2));
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((DefaultSpecialEffectsController)object2), "this$0");
                Intrinsics.checkNotNullParameter(((i)object1), "$animationInfo");
                ((DefaultSpecialEffectsController)object2).getContainer().endViewTransition(((View)object0));
                ((i)object1).a();
            }
        }
    }
}

