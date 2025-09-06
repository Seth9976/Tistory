package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

@Deprecated
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT;
    public final FragmentManager c;
    public final int d;
    public FragmentTransaction e;
    public final ArrayList f;
    public final ArrayList g;
    public Fragment h;
    public boolean i;

    @Deprecated
    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager0) {
        this(fragmentManager0, 0);
    }

    public FragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager0, int v) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = null;
        this.c = fragmentManager0;
        this.d = v;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        ArrayList arrayList0;
        FragmentManager fragmentManager0 = this.c;
        if(this.e == null) {
            this.e = fragmentManager0.beginTransaction();
        }
        while(true) {
            arrayList0 = this.f;
            if(arrayList0.size() > v) {
                break;
            }
            arrayList0.add(null);
        }
        arrayList0.set(v, (((Fragment)object0).isAdded() ? fragmentManager0.saveFragmentInstanceState(((Fragment)object0)) : null));
        this.g.set(v, null);
        this.e.remove(((Fragment)object0));
        if(((Fragment)object0).equals(this.h)) {
            this.h = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup0) {
        FragmentTransaction fragmentTransaction0 = this.e;
        if(fragmentTransaction0 != null) {
            if(!this.i) {
                try {
                    this.i = true;
                    fragmentTransaction0.commitNowAllowingStateLoss();
                    this.i = false;
                }
                catch(Throwable throwable0) {
                    this.i = false;
                    throw throwable0;
                }
            }
            this.e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int arg1);

    @Override  // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup0, int v) {
        ArrayList arrayList0 = this.g;
        if(arrayList0.size() > v) {
            Fragment fragment0 = (Fragment)arrayList0.get(v);
            if(fragment0 != null) {
                return fragment0;
            }
        }
        if(this.e == null) {
            this.e = this.c.beginTransaction();
        }
        Fragment fragment1 = this.getItem(v);
        ArrayList arrayList1 = this.f;
        if(arrayList1.size() > v) {
            SavedState fragment$SavedState0 = (SavedState)arrayList1.get(v);
            if(fragment$SavedState0 != null) {
                fragment1.setInitialSavedState(fragment$SavedState0);
            }
        }
        while(arrayList0.size() <= v) {
            arrayList0.add(null);
        }
        fragment1.setMenuVisibility(false);
        int v1 = this.d;
        if(v1 == 0) {
            fragment1.setUserVisibleHint(false);
        }
        arrayList0.set(v, fragment1);
        this.e.add(viewGroup0.getId(), fragment1);
        if(v1 == 1) {
            this.e.setMaxLifecycle(fragment1, State.STARTED);
        }
        return fragment1;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view0, @NonNull Object object0) {
        return ((Fragment)object0).getView() == view0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable0, @Nullable ClassLoader classLoader0) {
        if(parcelable0 != null) {
            ((Bundle)parcelable0).setClassLoader(classLoader0);
            Parcelable[] arr_parcelable = ((Bundle)parcelable0).getParcelableArray("states");
            ArrayList arrayList0 = this.f;
            arrayList0.clear();
            ArrayList arrayList1 = this.g;
            arrayList1.clear();
            if(arr_parcelable != null) {
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    arrayList0.add(((SavedState)arr_parcelable[v]));
                }
            }
            for(Object object0: ((Bundle)parcelable0).keySet()) {
                String s = (String)object0;
                if(s.startsWith("f")) {
                    int v1 = Integer.parseInt(s.substring(1));
                    Fragment fragment0 = this.c.getFragment(((Bundle)parcelable0), s);
                    if(fragment0 == null) {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + s);
                    }
                    else {
                        while(arrayList1.size() <= v1) {
                            arrayList1.add(null);
                        }
                        fragment0.setMenuVisibility(false);
                        arrayList1.set(v1, fragment0);
                    }
                }
            }
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        Parcelable parcelable0;
        ArrayList arrayList0 = this.f;
        if(arrayList0.size() > 0) {
            parcelable0 = new Bundle();
            SavedState[] arr_fragment$SavedState = new SavedState[arrayList0.size()];
            arrayList0.toArray(arr_fragment$SavedState);
            ((Bundle)parcelable0).putParcelableArray("states", arr_fragment$SavedState);
        }
        else {
            parcelable0 = null;
        }
        for(int v = 0; true; ++v) {
            ArrayList arrayList1 = this.g;
            if(v >= arrayList1.size()) {
                break;
            }
            Fragment fragment0 = (Fragment)arrayList1.get(v);
            if(fragment0 != null && fragment0.isAdded()) {
                if(parcelable0 == null) {
                    parcelable0 = new Bundle();
                }
                this.c.putFragment(((Bundle)parcelable0), "f" + v, fragment0);
            }
        }
        return parcelable0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        Fragment fragment0 = this.h;
        if(((Fragment)object0) != fragment0) {
            FragmentManager fragmentManager0 = this.c;
            int v1 = this.d;
            if(fragment0 != null) {
                fragment0.setMenuVisibility(false);
                if(v1 == 1) {
                    if(this.e == null) {
                        this.e = fragmentManager0.beginTransaction();
                    }
                    this.e.setMaxLifecycle(this.h, State.STARTED);
                }
                else {
                    this.h.setUserVisibleHint(false);
                }
            }
            ((Fragment)object0).setMenuVisibility(true);
            if(v1 == 1) {
                if(this.e == null) {
                    this.e = fragmentManager0.beginTransaction();
                }
                this.e.setMaxLifecycle(((Fragment)object0), State.RESUMED);
            }
            else {
                ((Fragment)object0).setUserVisibleHint(true);
            }
            this.h = (Fragment)object0;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup0) {
        if(viewGroup0.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}

