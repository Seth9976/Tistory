package androidx.transition;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TransitionManager {
    public final ArrayMap a;
    public final ArrayMap b;
    public static final AutoTransition c;
    public static final ThreadLocal d;
    public static final ArrayList e;

    static {
        TransitionManager.c = new AutoTransition();
        TransitionManager.d = new ThreadLocal();
        TransitionManager.e = new ArrayList();
    }

    public TransitionManager() {
        this.a = new ArrayMap();
        this.b = new ArrayMap();
    }

    public static void a(Scene scene0, Transition transition0) {
        ViewGroup viewGroup0 = scene0.getSceneRoot();
        ArrayList arrayList0 = TransitionManager.e;
        if(!arrayList0.contains(viewGroup0)) {
            Scene scene1 = Scene.getCurrentScene(viewGroup0);
            if(transition0 == null) {
                if(scene1 != null) {
                    scene1.exit();
                }
                scene0.enter();
                return;
            }
            arrayList0.add(viewGroup0);
            Transition transition1 = transition0.clone();
            if(scene1 != null && scene1.b > 0) {
                transition1.j();
            }
            TransitionManager.c(viewGroup0, transition1);
            scene0.enter();
            if(transition1 != null && viewGroup0 != null) {
                j0 j00 = new j0();  // 初始化器: Ljava/lang/Object;-><init>()V
                j00.a = transition1;
                j00.b = viewGroup0;
                viewGroup0.addOnAttachStateChangeListener(j00);
                viewGroup0.getViewTreeObserver().addOnPreDrawListener(j00);
            }
        }
    }

    public static ArrayMap b() {
        ThreadLocal threadLocal0 = TransitionManager.d;
        WeakReference weakReference0 = (WeakReference)threadLocal0.get();
        if(weakReference0 != null) {
            ArrayMap arrayMap0 = (ArrayMap)weakReference0.get();
            if(arrayMap0 != null) {
                return arrayMap0;
            }
        }
        ArrayMap arrayMap1 = new ArrayMap();
        threadLocal0.set(new WeakReference(arrayMap1));
        return arrayMap1;
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup0) {
        TransitionManager.beginDelayedTransition(viewGroup0, null);
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup0, @Nullable Transition transition0) {
        ArrayList arrayList0 = TransitionManager.e;
        if(!arrayList0.contains(viewGroup0) && ViewCompat.isLaidOut(viewGroup0)) {
            arrayList0.add(viewGroup0);
            if(transition0 == null) {
                transition0 = TransitionManager.c;
            }
            Transition transition1 = transition0.clone();
            TransitionManager.c(viewGroup0, transition1);
            viewGroup0.setTag(id.transition_current_scene, null);
            if(transition1 != null) {
                j0 j00 = new j0();  // 初始化器: Ljava/lang/Object;-><init>()V
                j00.a = transition1;
                j00.b = viewGroup0;
                viewGroup0.addOnAttachStateChangeListener(j00);
                viewGroup0.getViewTreeObserver().addOnPreDrawListener(j00);
            }
        }
    }

    public static void c(ViewGroup viewGroup0, Transition transition0) {
        ArrayList arrayList0 = (ArrayList)TransitionManager.b().get(viewGroup0);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                ((Transition)object0).pause(viewGroup0);
            }
        }
        if(transition0 != null) {
            transition0.d(viewGroup0, true);
        }
        Scene scene0 = Scene.getCurrentScene(viewGroup0);
        if(scene0 != null) {
            scene0.exit();
        }
    }

    public static void endTransitions(ViewGroup viewGroup0) {
        TransitionManager.e.remove(viewGroup0);
        ArrayList arrayList0 = (ArrayList)TransitionManager.b().get(viewGroup0);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList(arrayList0);
            for(int v = arrayList1.size() - 1; v >= 0; --v) {
                ((Transition)arrayList1.get(v)).f(viewGroup0);
            }
        }
    }

    public static void go(@NonNull Scene scene0) {
        TransitionManager.a(scene0, TransitionManager.c);
    }

    public static void go(@NonNull Scene scene0, @Nullable Transition transition0) {
        TransitionManager.a(scene0, transition0);
    }

    public void setTransition(@NonNull Scene scene0, @NonNull Scene scene1, @Nullable Transition transition0) {
        ArrayMap arrayMap0 = this.b;
        ArrayMap arrayMap1 = (ArrayMap)arrayMap0.get(scene1);
        if(arrayMap1 == null) {
            arrayMap1 = new ArrayMap();
            arrayMap0.put(scene1, arrayMap1);
        }
        arrayMap1.put(scene0, transition0);
    }

    public void setTransition(@NonNull Scene scene0, @Nullable Transition transition0) {
        this.a.put(scene0, transition0);
    }

    public void transitionTo(@NonNull Scene scene0) {
        Transition transition0;
        ViewGroup viewGroup0 = scene0.getSceneRoot();
        if(viewGroup0 == null) {
        label_8:
            transition0 = (Transition)this.a.get(scene0);
            if(transition0 == null) {
                transition0 = TransitionManager.c;
            }
        }
        else {
            Scene scene1 = Scene.getCurrentScene(viewGroup0);
            if(scene1 == null) {
                goto label_8;
            }
            else {
                ArrayMap arrayMap0 = (ArrayMap)this.b.get(scene0);
                if(arrayMap0 == null) {
                    goto label_8;
                }
                else {
                    transition0 = (Transition)arrayMap0.get(scene1);
                    if(transition0 == null) {
                        goto label_8;
                    }
                }
            }
        }
        TransitionManager.a(scene0, transition0);
    }
}

