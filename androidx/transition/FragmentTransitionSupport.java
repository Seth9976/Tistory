package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    // 去混淆评级： 低(30)
    public static boolean a(Transition transition0) {
        return !FragmentTransitionImpl.isNullOrEmpty(transition0.getTargetIds()) || !FragmentTransitionImpl.isNullOrEmpty(transition0.getTargetNames()) || !FragmentTransitionImpl.isNullOrEmpty(transition0.getTargetTypes());
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(Object object0, View view0) {
        if(object0 != null) {
            ((Transition)object0).addTarget(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(Object object0, ArrayList arrayList0) {
        int v = 0;
        if(((Transition)object0) == null) {
            return;
        }
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).getTransitionCount();
            while(v < v1) {
                this.addTargets(((TransitionSet)(((Transition)object0))).getTransitionAt(v), arrayList0);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionSupport.a(((Transition)object0)) && FragmentTransitionImpl.isNullOrEmpty(((Transition)object0).getTargets())) {
            int v2 = arrayList0.size();
            while(v < v2) {
                ((Transition)object0).addTarget(((View)arrayList0.get(v)));
                ++v;
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(ViewGroup viewGroup0, Object object0) {
        TransitionManager.beginDelayedTransition(viewGroup0, ((Transition)object0));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(Object object0) {
        return object0 instanceof Transition;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object cloneTransition(Object object0) {
        return object0 != null ? ((Transition)object0).clone() : null;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsInSequence(Object object0, Object object1, Object object2) {
        Transition transition0 = (Transition)object0;
        if(transition0 != null && ((Transition)object1) != null) {
            transition0 = new TransitionSet().addTransition(transition0).addTransition(((Transition)object1)).setOrdering(1);
        }
        else if(transition0 == null) {
            transition0 = ((Transition)object1) == null ? null : ((Transition)object1);
        }
        if(((Transition)object2) != null) {
            TransitionSet transitionSet0 = new TransitionSet();
            if(transition0 != null) {
                transitionSet0.addTransition(transition0);
            }
            transitionSet0.addTransition(((Transition)object2));
            return transitionSet0;
        }
        return transition0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsTogether(Object object0, Object object1, Object object2) {
        TransitionSet transitionSet0 = new TransitionSet();
        if(object0 != null) {
            transitionSet0.addTransition(((Transition)object0));
        }
        if(object1 != null) {
            transitionSet0.addTransition(((Transition)object1));
        }
        if(object2 != null) {
            transitionSet0.addTransition(((Transition)object2));
        }
        return transitionSet0;
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(Object object0, View view0) {
        if(object0 != null) {
            ((Transition)object0).removeTarget(view0);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        int v = 0;
        if(((Transition)object0) instanceof TransitionSet) {
            int v1 = ((TransitionSet)(((Transition)object0))).getTransitionCount();
            while(v < v1) {
                this.replaceTargets(((TransitionSet)(((Transition)object0))).getTransitionAt(v), arrayList0, arrayList1);
                ++v;
            }
            return;
        }
        if(!FragmentTransitionSupport.a(((Transition)object0))) {
            List list0 = ((Transition)object0).getTargets();
            if(list0.size() == arrayList0.size() && list0.containsAll(arrayList0)) {
                int v2 = arrayList1 == null ? 0 : arrayList1.size();
                while(v < v2) {
                    ((Transition)object0).addTarget(((View)arrayList1.get(v)));
                    ++v;
                }
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((Transition)object0).removeTarget(((View)arrayList0.get(v3)));
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(Object object0, View view0, ArrayList arrayList0) {
        ((Transition)object0).addListener(new p(view0, arrayList0));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(Object object0, Object object1, ArrayList arrayList0, Object object2, ArrayList arrayList1, Object object3, ArrayList arrayList2) {
        ((Transition)object0).addListener(new q(this, object1, arrayList0, object2, arrayList1, object3, arrayList2));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object object0, Rect rect0) {
        if(object0 != null) {
            ((Transition)object0).setEpicenterCallback(new u(rect0));
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object object0, View view0) {
        if(view0 != null) {
            Rect rect0 = new Rect();
            this.getBoundsOnScreen(view0, rect0);
            ((Transition)object0).setEpicenterCallback(new o(rect0));
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment0, @NonNull Object object0, @NonNull CancellationSignal cancellationSignal0, @NonNull Runnable runnable0) {
        cancellationSignal0.setOnCancelListener(new s(((Transition)object0)));
        ((Transition)object0).addListener(new t(runnable0));
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(Object object0, View view0, ArrayList arrayList0) {
        List list0 = ((TransitionSet)object0).getTargets();
        list0.clear();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            FragmentTransitionImpl.bfsAddViewChildren(list0, ((View)arrayList0.get(v1)));
        }
        list0.add(view0);
        arrayList0.add(view0);
        this.addTargets(((TransitionSet)object0), arrayList0);
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(Object object0, ArrayList arrayList0, ArrayList arrayList1) {
        if(((TransitionSet)object0) != null) {
            ((TransitionSet)object0).getTargets().clear();
            ((TransitionSet)object0).getTargets().addAll(arrayList1);
            this.replaceTargets(((TransitionSet)object0), arrayList0, arrayList1);
        }
    }

    @Override  // androidx.fragment.app.FragmentTransitionImpl
    public Object wrapTransitionInSet(Object object0) {
        if(object0 == null) {
            return null;
        }
        TransitionSet transitionSet0 = new TransitionSet();
        transitionSet0.addTransition(((Transition)object0));
        return transitionSet0;
    }
}

