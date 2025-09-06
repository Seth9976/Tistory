package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn.Level;
import androidx.annotation.RequiresOptIn;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import f5.e;
import f5.f;
import f5.g;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.q;

public abstract class FragmentStateAdapter extends Adapter implements StatefulAdapter {
    @RequiresOptIn(level = Level.WARNING)
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public static abstract class FragmentTransactionCallback {
        public interface OnPostEventListener {
            void onPost();
        }

        public static final c a;

        static {
            FragmentTransactionCallback.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NonNull
        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreAdded(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        public OnPostEventListener onFragmentPreRemoved(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }

        @NonNull
        @ExperimentalFragmentStateAdapterApi
        public OnPostEventListener onFragmentPreSavedInstanceState(@NonNull Fragment fragment0) {
            return FragmentTransactionCallback.a;
        }
    }

    public final Lifecycle g;
    public final FragmentManager h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public final LongSparseArray k;
    public b l;
    public final a m;
    public boolean n;
    public boolean o;

    public FragmentStateAdapter(@NonNull Fragment fragment0) {
        this(fragment0.getChildFragmentManager(), fragment0.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity0) {
        this(fragmentActivity0.getSupportFragmentManager(), fragmentActivity0.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager0, @NonNull Lifecycle lifecycle0) {
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.k = new LongSparseArray();
        a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.a = new CopyOnWriteArrayList();
        this.m = a0;
        this.n = false;
        this.o = false;
        this.h = fragmentManager0;
        this.g = lifecycle0;
        super.setHasStableIds(true);
    }

    public static void a(View view0, FrameLayout frameLayout0) {
        if(frameLayout0.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if(view0.getParent() == frameLayout0) {
            return;
        }
        if(frameLayout0.getChildCount() > 0) {
            frameLayout0.removeAllViews();
        }
        if(view0.getParent() != null) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        frameLayout0.addView(view0);
    }

    public final void b() {
        LongSparseArray longSparseArray0;
        if(this.o && !this.h.isStateSaved()) {
            ArraySet arraySet0 = new ArraySet();
            for(int v1 = 0; true; ++v1) {
                longSparseArray0 = this.i;
                LongSparseArray longSparseArray1 = this.k;
                if(v1 >= longSparseArray0.size()) {
                    break;
                }
                long v2 = longSparseArray0.keyAt(v1);
                if(!this.containsItem(v2)) {
                    arraySet0.add(v2);
                    longSparseArray1.remove(v2);
                }
            }
            if(!this.n) {
                this.o = false;
                for(int v = 0; v < longSparseArray0.size(); ++v) {
                    long v3 = longSparseArray0.keyAt(v);
                    if(!longSparseArray1.containsKey(v3)) {
                        Fragment fragment0 = (Fragment)longSparseArray0.get(v3);
                        if(fragment0 == null) {
                            arraySet0.add(v3);
                        }
                        else {
                            View view0 = fragment0.getView();
                            if(view0 == null || view0.getParent() == null) {
                                arraySet0.add(v3);
                            }
                        }
                    }
                }
            }
            for(Object object0: arraySet0) {
                this.e(((long)(((Long)object0))));
            }
        }
    }

    public final Long c(int v) {
        Long long0 = null;
        for(int v1 = 0; true; ++v1) {
            LongSparseArray longSparseArray0 = this.k;
            if(v1 >= longSparseArray0.size()) {
                break;
            }
            if(((int)(((Integer)longSparseArray0.valueAt(v1)))) == v) {
                if(long0 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                long0 = longSparseArray0.keyAt(v1);
                continue;
            }
        }
        return long0;
    }

    public boolean containsItem(long v) {
        return v >= 0L && v < ((long)this.getItemCount());
    }

    @NonNull
    public abstract Fragment createFragment(int arg1);

    public final void d(FragmentViewHolder fragmentViewHolder0) {
        Fragment fragment0 = (Fragment)this.i.get(fragmentViewHolder0.getItemId());
        if(fragment0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout0 = (FrameLayout)fragmentViewHolder0.itemView;
        View view0 = fragment0.getView();
        if(!fragment0.isAdded() && view0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FragmentManager fragmentManager0 = this.h;
        if(fragment0.isAdded() && view0 == null) {
            fragmentManager0.registerFragmentLifecycleCallbacks(new f5.b(this, fragment0, frameLayout0), false);
            return;
        }
        if(fragment0.isAdded() && view0.getParent() != null) {
            if(view0.getParent() != frameLayout0) {
                FragmentStateAdapter.a(view0, frameLayout0);
            }
            return;
        }
        if(fragment0.isAdded()) {
            FragmentStateAdapter.a(view0, frameLayout0);
            return;
        }
        if(!fragmentManager0.isStateSaved()) {
            fragmentManager0.registerFragmentLifecycleCallbacks(new f5.b(this, fragment0, frameLayout0), false);
            this.m.getClass();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.m.a) {
                arrayList0.add(((FragmentTransactionCallback)object0).onFragmentPreAdded(fragment0));
            }
            try {
                fragment0.setMenuVisibility(false);
                fragmentManager0.beginTransaction().add(fragment0, "f" + fragmentViewHolder0.getItemId()).setMaxLifecycle(fragment0, State.STARTED).commitNow();
                this.l.b(false);
            }
            finally {
                a.b(arrayList0);
            }
            return;
        }
        if(fragmentManager0.isDestroyed()) {
            return;
        }
        f5.a a0 = new f5.a(this, fragmentViewHolder0);
        this.g.addObserver(a0);
    }

    public final void e(long v) {
        LongSparseArray longSparseArray0 = this.i;
        Fragment fragment0 = (Fragment)longSparseArray0.get(v);
        if(fragment0 == null) {
            return;
        }
        if(fragment0.getView() != null) {
            ViewParent viewParent0 = fragment0.getView().getParent();
            if(viewParent0 != null) {
                ((FrameLayout)viewParent0).removeAllViews();
            }
        }
        boolean z = this.containsItem(v);
        LongSparseArray longSparseArray1 = this.j;
        if(!z) {
            longSparseArray1.remove(v);
        }
        if(!fragment0.isAdded()) {
            longSparseArray0.remove(v);
            return;
        }
        FragmentManager fragmentManager0 = this.h;
        if(fragmentManager0.isStateSaved()) {
            this.o = true;
            return;
        }
        a a0 = this.m;
        if(fragment0.isAdded() && this.containsItem(v)) {
            a0.getClass();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: a0.a) {
                arrayList0.add(((FragmentTransactionCallback)object0).onFragmentPreSavedInstanceState(fragment0));
            }
            SavedState fragment$SavedState0 = fragmentManager0.saveFragmentInstanceState(fragment0);
            a.b(arrayList0);
            longSparseArray1.put(v, fragment$SavedState0);
        }
        a0.getClass();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: a0.a) {
            arrayList1.add(((FragmentTransactionCallback)object1).onFragmentPreRemoved(fragment0));
        }
        try {
            fragmentManager0.beginTransaction().remove(fragment0).commitNow();
            longSparseArray0.remove(v);
        }
        finally {
            a.b(arrayList1);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) [...] // Inlined contents

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        Preconditions.checkArgument(this.l == null);
        b b0 = new b(this);
        this.l = b0;
        b0.d = b.a(recyclerView0);
        e e0 = new e(b0);
        b0.a = e0;
        b0.d.registerOnPageChangeCallback(e0);
        f f0 = new f(b0);
        b0.b = f0;
        this.registerAdapterDataObserver(f0);
        g g0 = new g(b0);
        b0.c = g0;
        this.g.addObserver(g0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        this.onBindViewHolder(((FragmentViewHolder)recyclerView$ViewHolder0), v);
    }

    public final void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder0, int v) {
        long v1 = fragmentViewHolder0.getItemId();
        int v2 = ((FrameLayout)fragmentViewHolder0.itemView).getId();
        Long long0 = this.c(v2);
        LongSparseArray longSparseArray0 = this.k;
        if(long0 != null && ((long)long0) != v1) {
            this.e(((long)long0));
            longSparseArray0.remove(((long)long0));
        }
        longSparseArray0.put(v1, v2);
        LongSparseArray longSparseArray1 = this.i;
        if(!longSparseArray1.containsKey(((long)v))) {
            Fragment fragment0 = this.createFragment(v);
            fragment0.setInitialSavedState(((SavedState)this.j.get(((long)v))));
            longSparseArray1.put(((long)v), fragment0);
        }
        if(ViewCompat.isAttachedToWindow(((FrameLayout)fragmentViewHolder0.itemView))) {
            this.d(fragmentViewHolder0);
        }
        this.b();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        return this.onCreateViewHolder(viewGroup0, v);
    }

    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        FrameLayout frameLayout0 = new FrameLayout(viewGroup0.getContext());
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout0.setId(ViewCompat.generateViewId());
        frameLayout0.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout0);  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        b b0 = this.l;
        b0.getClass();
        b.a(recyclerView0).unregisterOnPageChangeCallback(b0.a);
        b0.f.unregisterAdapterDataObserver(b0.b);
        b0.f.g.removeObserver(b0.c);
        b0.d = null;
        this.l = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
        return this.onFailedToRecycleView(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder0) {
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.onViewAttachedToWindow(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder0) {
        this.d(fragmentViewHolder0);
        this.b();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.onViewRecycled(((FragmentViewHolder)recyclerView$ViewHolder0));
    }

    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder0) {
        Long long0 = this.c(((FrameLayout)fragmentViewHolder0.itemView).getId());
        if(long0 != null) {
            this.e(((long)long0));
            this.k.remove(((long)long0));
        }
    }

    public void registerFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
        this.m.a.add(fragmentStateAdapter$FragmentTransactionCallback0);
    }

    @Override  // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable0) {
        LongSparseArray longSparseArray0 = this.j;
        if(longSparseArray0.isEmpty()) {
            LongSparseArray longSparseArray1 = this.i;
            if(longSparseArray1.isEmpty()) {
                if(((Bundle)parcelable0).getClassLoader() == null) {
                    ((Bundle)parcelable0).setClassLoader(this.getClass().getClassLoader());
                }
                for(Object object0: ((Bundle)parcelable0).keySet()) {
                    String s = (String)object0;
                    if(s.startsWith("f#") && s.length() > 2) {
                        longSparseArray1.put(Long.parseLong(s.substring(2)), this.h.getFragment(((Bundle)parcelable0), s));
                    }
                    else {
                        if(!s.startsWith("s#") || s.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: " + s);
                        }
                        long v = Long.parseLong(s.substring(2));
                        SavedState fragment$SavedState0 = (SavedState)((Bundle)parcelable0).getParcelable(s);
                        if(this.containsItem(v)) {
                            longSparseArray0.put(v, fragment$SavedState0);
                        }
                    }
                }
                if(!longSparseArray1.isEmpty()) {
                    this.o = true;
                    this.n = true;
                    this.b();
                    Handler handler0 = new Handler(Looper.getMainLooper());
                    androidx.appcompat.widget.a a0 = new androidx.appcompat.widget.a(this, 14);
                    f5.c c0 = new f5.c(handler0, a0);
                    this.g.addObserver(c0);
                    handler0.postDelayed(a0, 10000L);
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be \'fresh\' while restoring state.");
    }

    @Override  // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        LongSparseArray longSparseArray0 = this.i;
        LongSparseArray longSparseArray1 = this.j;
        Parcelable parcelable0 = new Bundle(longSparseArray1.size() + longSparseArray0.size());
        for(int v1 = 0; v1 < longSparseArray0.size(); ++v1) {
            long v2 = longSparseArray0.keyAt(v1);
            Fragment fragment0 = (Fragment)longSparseArray0.get(v2);
            if(fragment0 != null && fragment0.isAdded()) {
                this.h.putFragment(((Bundle)parcelable0), q.n(v2, "f#"), fragment0);
            }
        }
        for(int v = 0; v < longSparseArray1.size(); ++v) {
            long v3 = longSparseArray1.keyAt(v);
            if(this.containsItem(v3)) {
                ((Bundle)parcelable0).putParcelable(q.n(v3, "s#"), ((Parcelable)longSparseArray1.get(v3)));
            }
        }
        return parcelable0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void unregisterFragmentTransactionCallback(@NonNull FragmentTransactionCallback fragmentStateAdapter$FragmentTransactionCallback0) {
        this.m.a.remove(fragmentStateAdapter$FragmentTransactionCallback0);
    }
}

