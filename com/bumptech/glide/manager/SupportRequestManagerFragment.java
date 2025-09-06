package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SupportRequestManagerFragment extends Fragment {
    public final f A;
    public final HashSet B;
    public SupportRequestManagerFragment C;
    public RequestManager D;
    public final a z;

    public SupportRequestManagerFragment() {
        this(new a());
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public SupportRequestManagerFragment(@NonNull a a0) {
        this.A = new f(this, 9);
        this.B = new HashSet();
        this.z = a0;
    }

    @Nullable
    public RequestManager getRequestManager() {
        return this.D;
    }

    @NonNull
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return this.A;
    }

    public final Set h() {
        SupportRequestManagerFragment supportRequestManagerFragment0 = this.C;
        if(supportRequestManagerFragment0 == null) {
            return Collections.emptySet();
        }
        if(this.equals(supportRequestManagerFragment0)) {
            return Collections.unmodifiableSet(this.B);
        }
        HashSet hashSet0 = new HashSet();
        Iterator iterator0 = this.C.h().iterator();
    label_7:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            SupportRequestManagerFragment supportRequestManagerFragment1 = (SupportRequestManagerFragment)object0;
            Fragment fragment0 = supportRequestManagerFragment1.getParentFragment();
            Fragment fragment1 = null;
            if(fragment0 == null) {
                fragment0 = null;
            }
            Fragment fragment2 = this.getParentFragment();
            if(fragment2 != null) {
                fragment1 = fragment2;
            }
            while(true) {
                Fragment fragment3 = fragment0.getParentFragment();
                if(fragment3 == null) {
                    continue label_7;
                }
                if(fragment3.equals(fragment1)) {
                    break;
                }
                fragment0 = fragment0.getParentFragment();
            }
            hashSet0.add(supportRequestManagerFragment1);
        }
        return Collections.unmodifiableSet(hashSet0);
    }

    public final void i(Context context0, FragmentManager fragmentManager0) {
        SupportRequestManagerFragment supportRequestManagerFragment0 = this.C;
        if(supportRequestManagerFragment0 != null) {
            supportRequestManagerFragment0.B.remove(this);
            this.C = null;
        }
        RequestManagerRetriever requestManagerRetriever0 = Glide.get(context0).getRequestManagerRetriever();
        HashMap hashMap0 = requestManagerRetriever0.c;
        SupportRequestManagerFragment supportRequestManagerFragment1 = (SupportRequestManagerFragment)hashMap0.get(fragmentManager0);
        if(supportRequestManagerFragment1 == null) {
            SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment)fragmentManager0.findFragmentByTag("com.bumptech.glide.manager");
            if(supportRequestManagerFragment2 == null) {
                supportRequestManagerFragment2 = new SupportRequestManagerFragment();
                hashMap0.put(fragmentManager0, supportRequestManagerFragment2);
                fragmentManager0.beginTransaction().add(supportRequestManagerFragment2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                requestManagerRetriever0.d.obtainMessage(2, fragmentManager0).sendToTarget();
            }
            supportRequestManagerFragment1 = supportRequestManagerFragment2;
        }
        this.C = supportRequestManagerFragment1;
        if(!this.equals(supportRequestManagerFragment1)) {
            this.C.B.add(this);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onAttach(Context context0) {
        super.onAttach(context0);
        Fragment fragment0;
        for(fragment0 = this; fragment0.getParentFragment() != null; fragment0 = fragment0.getParentFragment()) {
        }
        FragmentManager fragmentManager0 = fragment0.getFragmentManager();
        if(fragmentManager0 == null) {
            if(Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            this.i(this.getContext(), fragmentManager0);
        }
        catch(IllegalStateException illegalStateException0) {
            if(Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", illegalStateException0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.z.a();
        SupportRequestManagerFragment supportRequestManagerFragment0 = this.C;
        if(supportRequestManagerFragment0 != null) {
            supportRequestManagerFragment0.B.remove(this);
            this.C = null;
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        SupportRequestManagerFragment supportRequestManagerFragment0 = this.C;
        if(supportRequestManagerFragment0 != null) {
            supportRequestManagerFragment0.B.remove(this);
            this.C = null;
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.z.b = true;
        for(Object object0: Util.getSnapshot(this.z.a)) {
            ((LifecycleListener)object0).onStart();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.z.b = false;
        for(Object object0: Util.getSnapshot(this.z.a)) {
            ((LifecycleListener)object0).onStop();
        }
    }

    public void setRequestManager(@Nullable RequestManager requestManager0) {
        this.D = requestManager0;
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.fragment.app.Fragment
    public String toString() {
        return "Fragment{676ae2d5} (3758505d-75d7-4db2-a6ec-2b3acf24819c){parent=" + (this.getParentFragment() == null ? null : this.getParentFragment()) + "}";
    }
}

