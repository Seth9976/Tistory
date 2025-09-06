package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public final ArrayList a;
    public FrameLayout b;
    public Context c;
    public FragmentManager d;
    public int e;
    public TabHost.OnTabChangeListener f;
    public o1 g;
    public boolean h;

    @Deprecated
    public FragmentTabHost(@NonNull Context context0) {
        super(context0, null);
        this.a = new ArrayList();
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, new int[]{0x10100F3}, 0, 0);
        this.e = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ArrayList();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100F3}, 0, 0);
        this.e = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        super.setOnTabChangedListener(this);
    }

    public final FragmentTransaction a(FragmentTransaction fragmentTransaction0, String s) {
        o1 o10;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            o10 = null;
            if(v1 >= v) {
                break;
            }
            o1 o11 = (o1)arrayList0.get(v1);
            if(o11.a.equals(s)) {
                o10 = o11;
                break;
            }
        }
        if(this.g != o10) {
            if(fragmentTransaction0 == null) {
                fragmentTransaction0 = this.d.beginTransaction();
            }
            o1 o12 = this.g;
            if(o12 != null) {
                Fragment fragment0 = o12.d;
                if(fragment0 != null) {
                    fragmentTransaction0.detach(fragment0);
                }
            }
            if(o10 != null) {
                Fragment fragment1 = o10.d;
                if(fragment1 == null) {
                    Fragment fragment2 = this.d.getFragmentFactory().instantiate(this.c.getClassLoader(), o10.b.getName());
                    o10.d = fragment2;
                    fragment2.setArguments(o10.c);
                    fragmentTransaction0.add(this.e, o10.d, o10.a);
                }
                else {
                    fragmentTransaction0.attach(fragment1);
                }
            }
            this.g = o10;
        }
        return fragmentTransaction0;
    }

    @Deprecated
    public void addTab(@NonNull TabHost.TabSpec tabHost$TabSpec0, @NonNull Class class0, @Nullable Bundle bundle0) {
        tabHost$TabSpec0.setContent(new m1(this.c));
        String s = tabHost$TabSpec0.getTag();
        o1 o10 = new o1(bundle0, s, class0);
        if(this.h) {
            Fragment fragment0 = this.d.findFragmentByTag(s);
            o10.d = fragment0;
            if(fragment0 != null && !fragment0.isDetached()) {
                FragmentTransaction fragmentTransaction0 = this.d.beginTransaction();
                fragmentTransaction0.detach(o10.d);
                fragmentTransaction0.commit();
            }
        }
        this.a.add(o10);
        this.addTab(tabHost$TabSpec0);
    }

    public final void b() {
        if(this.b == null) {
            FrameLayout frameLayout0 = (FrameLayout)this.findViewById(this.e);
            this.b = frameLayout0;
            if(frameLayout0 == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.e);
            }
        }
    }

    public final void c(Context context0) {
        if(this.findViewById(0x1020013) == null) {
            LinearLayout linearLayout0 = new LinearLayout(context0);
            linearLayout0.setOrientation(1);
            this.addView(linearLayout0, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget0 = new TabWidget(context0);
            tabWidget0.setId(0x1020013);
            tabWidget0.setOrientation(0);
            linearLayout0.addView(tabWidget0, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout0 = new FrameLayout(context0);
            frameLayout0.setId(0x1020011);
            linearLayout0.addView(frameLayout0, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout1 = new FrameLayout(context0);
            this.b = frameLayout1;
            frameLayout1.setId(this.e);
            linearLayout0.addView(frameLayout1, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.getCurrentTabTag();
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        FragmentTransaction fragmentTransaction0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            o1 o10 = (o1)arrayList0.get(v1);
            Fragment fragment0 = this.d.findFragmentByTag(o10.a);
            o10.d = fragment0;
            if(fragment0 != null && !fragment0.isDetached()) {
                if(o10.a.equals(s)) {
                    this.g = o10;
                }
                else {
                    if(fragmentTransaction0 == null) {
                        fragmentTransaction0 = this.d.beginTransaction();
                    }
                    fragmentTransaction0.detach(o10.d);
                }
            }
        }
        this.h = true;
        FragmentTransaction fragmentTransaction1 = this.a(fragmentTransaction0, s);
        if(fragmentTransaction1 != null) {
            fragmentTransaction1.commit();
            this.d.executePendingTransactions();
        }
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = false;
    }

    @Override  // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable0) {
        if(!(parcelable0 instanceof n1)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((n1)parcelable0).getSuperState());
        this.setCurrentTabByTag(((n1)parcelable0).a);
    }

    @Override  // android.view.View
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new n1(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.getCurrentTabTag();
        return parcelable0;
    }

    @Override  // android.widget.TabHost$OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String s) {
        if(this.h) {
            FragmentTransaction fragmentTransaction0 = this.a(null, s);
            if(fragmentTransaction0 != null) {
                fragmentTransaction0.commit();
            }
        }
        TabHost.OnTabChangeListener tabHost$OnTabChangeListener0 = this.f;
        if(tabHost$OnTabChangeListener0 != null) {
            tabHost$OnTabChangeListener0.onTabChanged(s);
        }
    }

    @Override  // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener tabHost$OnTabChangeListener0) {
        this.f = tabHost$OnTabChangeListener0;
    }

    @Override  // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@NonNull Context context0, @NonNull FragmentManager fragmentManager0) {
        this.c(context0);
        super.setup();
        this.c = context0;
        this.d = fragmentManager0;
        this.b();
    }

    @Deprecated
    public void setup(@NonNull Context context0, @NonNull FragmentManager fragmentManager0, int v) {
        this.c(context0);
        super.setup();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = v;
        this.b();
        this.b.setId(v);
        if(this.getId() == -1) {
            this.setId(0x1020012);
        }
    }
}

