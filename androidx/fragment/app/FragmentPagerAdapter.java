package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT;
    public final FragmentManager c;
    public final int d;
    public FragmentTransaction e;
    public Fragment f;
    public boolean g;

    @Deprecated
    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager0) {
        this(fragmentManager0, 0);
    }

    public FragmentPagerAdapter(@NonNull FragmentManager fragmentManager0, int v) {
        this.e = null;
        this.f = null;
        this.c = fragmentManager0;
        this.d = v;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        if(this.e == null) {
            this.e = this.c.beginTransaction();
        }
        this.e.detach(((Fragment)object0));
        if(((Fragment)object0).equals(this.f)) {
            this.f = null;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(@NonNull ViewGroup viewGroup0) {
        FragmentTransaction fragmentTransaction0 = this.e;
        if(fragmentTransaction0 != null) {
            if(!this.g) {
                try {
                    this.g = true;
                    fragmentTransaction0.commitNowAllowingStateLoss();
                    this.g = false;
                }
                catch(Throwable throwable0) {
                    this.g = false;
                    throw throwable0;
                }
            }
            this.e = null;
        }
    }

    @NonNull
    public abstract Fragment getItem(int arg1);

    public long getItemId(int v) [...] // Inlined contents

    @Override  // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup0, int v) {
        FragmentManager fragmentManager0 = this.c;
        if(this.e == null) {
            this.e = fragmentManager0.beginTransaction();
        }
        Fragment fragment0 = fragmentManager0.findFragmentByTag("android:switcher:" + viewGroup0.getId() + ":" + ((long)v));
        if(fragment0 == null) {
            fragment0 = this.getItem(v);
            this.e.add(viewGroup0.getId(), fragment0, "android:switcher:" + viewGroup0.getId() + ":" + ((long)v));
        }
        else {
            this.e.attach(fragment0);
        }
        if(fragment0 != this.f) {
            fragment0.setMenuVisibility(false);
            if(this.d == 1) {
                this.e.setMaxLifecycle(fragment0, State.STARTED);
                return fragment0;
            }
            fragment0.setUserVisibleHint(false);
        }
        return fragment0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view0, @NonNull Object object0) {
        return ((Fragment)object0).getView() == view0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void restoreState(@Nullable Parcelable parcelable0, @Nullable ClassLoader classLoader0) {
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        Fragment fragment0 = this.f;
        if(((Fragment)object0) != fragment0) {
            FragmentManager fragmentManager0 = this.c;
            int v1 = this.d;
            if(fragment0 != null) {
                fragment0.setMenuVisibility(false);
                if(v1 == 1) {
                    if(this.e == null) {
                        this.e = fragmentManager0.beginTransaction();
                    }
                    this.e.setMaxLifecycle(this.f, State.STARTED);
                }
                else {
                    this.f.setUserVisibleHint(false);
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
            this.f = (Fragment)object0;
        }
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(@NonNull ViewGroup viewGroup0) {
        if(viewGroup0.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}

