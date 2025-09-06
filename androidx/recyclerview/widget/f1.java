package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

public final class f1 implements Runnable {
    public final int a;
    public final Object b;

    public f1(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                if(((RecyclerView)object0).mFirstLayoutComplete && !((RecyclerView)object0).isLayoutRequested()) {
                    if(!((RecyclerView)object0).mIsAttached) {
                        ((RecyclerView)object0).requestLayout();
                        return;
                    }
                    if(((RecyclerView)object0).mLayoutSuppressed) {
                        ((RecyclerView)object0).mLayoutWasDefered = true;
                        return;
                    }
                    ((RecyclerView)object0).consumePendingUpdateOperations();
                }
                return;
            }
            case 1: {
                int v = ((b0)object0).M;
                ValueAnimator valueAnimator0 = ((b0)object0).L;
                if(v == 1) {
                    valueAnimator0.cancel();
                }
                else if(v != 2) {
                    return;
                }
                ((b0)object0).M = 3;
                valueAnimator0.setFloatValues(new float[]{((float)(((Float)valueAnimator0.getAnimatedValue()))), 0.0f});
                valueAnimator0.setDuration(500L);
                valueAnimator0.start();
                return;
            }
            default: {
                ((StaggeredGridLayoutManager)object0).e();
            }
        }
    }
}

