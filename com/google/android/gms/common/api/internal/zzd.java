package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.provider.q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements LifecycleFragment {
    public int A;
    public Bundle B;
    public static final WeakHashMap C;
    public final Map z;

    static {
        zzd.C = new WeakHashMap();
    }

    public zzd() {
        this.z = Collections.synchronizedMap(new ArrayMap());
        this.A = 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String s, @NonNull LifecycleCallback lifecycleCallback0) {
        Map map0 = this.z;
        if(map0.containsKey(s)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + s + " already added to this fragment.");
        }
        map0.put(s, lifecycleCallback0);
        if(this.A > 0) {
            new zzi(Looper.getMainLooper()).post(new q(this, lifecycleCallback0, 3, s));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void dump(String s, @Nullable FileDescriptor fileDescriptor0, PrintWriter printWriter0, @Nullable String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    public final LifecycleCallback getCallbackOrNull(String s, Class class0) {
        return (LifecycleCallback)class0.cast(this.z.get(s));
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.A > 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.A >= 2;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).onActivityResult(v, v1, intent0);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.A = 1;
        this.B = bundle0;
        for(Object object0: this.z.entrySet()) {
            ((LifecycleCallback)((Map.Entry)object0).getValue()).onCreate((bundle0 == null ? null : bundle0.getBundle(((String)((Map.Entry)object0).getKey()))));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.A = 5;
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).onDestroy();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.A = 3;
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).onResume();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(bundle0 == null) {
            return;
        }
        for(Object object0: this.z.entrySet()) {
            Bundle bundle1 = new Bundle();
            ((LifecycleCallback)((Map.Entry)object0).getValue()).onSaveInstanceState(bundle1);
            bundle0.putBundle(((String)((Map.Entry)object0).getKey()), bundle1);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.A = 2;
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).onStart();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.A = 4;
        for(Object object0: this.z.values()) {
            ((LifecycleCallback)object0).onStop();
        }
    }

    public static zzd zzc(FragmentActivity fragmentActivity0) {
        zzd zzd1;
        WeakHashMap weakHashMap0 = zzd.C;
        WeakReference weakReference0 = (WeakReference)weakHashMap0.get(fragmentActivity0);
        if(weakReference0 != null) {
            zzd zzd0 = (zzd)weakReference0.get();
            if(zzd0 != null) {
                return zzd0;
            }
        }
        try {
            zzd1 = (zzd)fragmentActivity0.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException0);
        }
        if(zzd1 == null || zzd1.isRemoving()) {
            zzd1 = new zzd();
            fragmentActivity0.getSupportFragmentManager().beginTransaction().add(zzd1, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
        }
        weakHashMap0.put(fragmentActivity0, new WeakReference(zzd1));
        return zzd1;
    }
}

