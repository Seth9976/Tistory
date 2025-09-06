package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UnknownNullness"})
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class FragmentTransitionImpl {
    public abstract void addTarget(@NonNull Object arg1, @NonNull View arg2);

    public abstract void addTargets(@NonNull Object arg1, @NonNull ArrayList arg2);

    public abstract void beginDelayedTransition(@NonNull ViewGroup arg1, @Nullable Object arg2);

    public static void bfsAddViewChildren(List list0, View view0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(list0.get(v1) == view0) {
                return;
            }
        }
        if(ViewCompat.getTransitionName(view0) != null) {
            list0.add(view0);
        }
        int v2 = v;
        while(v2 < list0.size()) {
            View view1 = (View)list0.get(v2);
            if(view1 instanceof ViewGroup) {
                ViewGroup viewGroup0 = (ViewGroup)view1;
                int v3 = viewGroup0.getChildCount();
                int v4 = 0;
                while(v4 < v3) {
                    View view2 = viewGroup0.getChildAt(v4);
                    int v5 = 0;
                    while(true) {
                        if(v5 < v) {
                            if(list0.get(v5) == view2) {
                                break;
                            }
                            else {
                                ++v5;
                                continue;
                            }
                        }
                        if(ViewCompat.getTransitionName(view2) == null) {
                            break;
                        }
                        list0.add(view2);
                        break;
                    }
                    ++v4;
                }
            }
            ++v2;
        }
    }

    public abstract boolean canHandle(@NonNull Object arg1);

    public abstract Object cloneTransition(@Nullable Object arg1);

    public void getBoundsOnScreen(View view0, Rect rect0) {
        if(!ViewCompat.isAttachedToWindow(view0)) {
            return;
        }
        RectF rectF0 = new RectF();
        rectF0.set(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
        view0.getMatrix().mapRect(rectF0);
        rectF0.offset(((float)view0.getLeft()), ((float)view0.getTop()));
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = ((View)viewParent0).getParent()) {
            rectF0.offset(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
            ((View)viewParent0).getMatrix().mapRect(rectF0);
            rectF0.offset(((float)((View)viewParent0).getLeft()), ((float)((View)viewParent0).getTop()));
        }
        int[] arr_v = new int[2];
        view0.getRootView().getLocationOnScreen(arr_v);
        rectF0.offset(((float)arr_v[0]), ((float)arr_v[1]));
        rect0.set(Math.round(rectF0.left), Math.round(rectF0.top), Math.round(rectF0.right), Math.round(rectF0.bottom));
    }

    public static boolean isNullOrEmpty(List list0) {
        return list0 == null || list0.isEmpty();
    }

    public abstract Object mergeTransitionsInSequence(@Nullable Object arg1, @Nullable Object arg2, @Nullable Object arg3);

    public abstract Object mergeTransitionsTogether(@Nullable Object arg1, @Nullable Object arg2, @Nullable Object arg3);

    public abstract void removeTarget(@NonNull Object arg1, @NonNull View arg2);

    public abstract void replaceTargets(@NonNull Object arg1, @SuppressLint({"UnknownNullness"}) ArrayList arg2, @SuppressLint({"UnknownNullness"}) ArrayList arg3);

    public abstract void scheduleHideFragmentView(@NonNull Object arg1, @NonNull View arg2, @NonNull ArrayList arg3);

    public abstract void scheduleRemoveTargets(@NonNull Object arg1, @Nullable Object arg2, @Nullable ArrayList arg3, @Nullable Object arg4, @Nullable ArrayList arg5, @Nullable Object arg6, @Nullable ArrayList arg7);

    public abstract void setEpicenter(@NonNull Object arg1, @NonNull Rect arg2);

    public abstract void setEpicenter(@NonNull Object arg1, @Nullable View arg2);

    public void setListenerForTransitionEnd(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @NonNull Runnable runnable0) {
        runnable0.run();
    }

    public abstract void setSharedElementTargets(@NonNull Object arg1, @NonNull View arg2, @NonNull ArrayList arg3);

    public abstract void swapSharedElementTargets(@Nullable Object arg1, @Nullable ArrayList arg2, @Nullable ArrayList arg3);

    public abstract Object wrapTransitionInSet(@Nullable Object arg1);
}

