package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Deprecated
public class RequestManagerFragment extends Fragment {
    public final a a;
    public final f b;
    public final HashSet c;
    public RequestManager d;
    public RequestManagerFragment e;
    public Fragment f;

    public RequestManagerFragment() {
        a a0 = new a();
        super();
        this.b = new f(this, 8);
        this.c = new HashSet();
        this.a = a0;
    }

    public final Set a() {
        if(this.equals(this.e)) {
            return Collections.unmodifiableSet(this.c);
        }
        if(this.e != null) {
            HashSet hashSet0 = new HashSet();
            Iterator iterator0 = this.e.a().iterator();
        label_5:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                RequestManagerFragment requestManagerFragment0 = (RequestManagerFragment)object0;
                Fragment fragment0 = requestManagerFragment0.getParentFragment();
                Fragment fragment1 = this.getParentFragment();
                while(true) {
                    Fragment fragment2 = fragment0.getParentFragment();
                    if(fragment2 == null) {
                        continue label_5;
                    }
                    if(fragment2.equals(fragment1)) {
                        break;
                    }
                    fragment0 = fragment0.getParentFragment();
                }
                hashSet0.add(requestManagerFragment0);
            }
            return Collections.unmodifiableSet(hashSet0);
        }
        return Collections.emptySet();
    }

    public final void b(Activity activity0) {
        RequestManagerFragment requestManagerFragment0 = this.e;
        if(requestManagerFragment0 != null) {
            requestManagerFragment0.c.remove(this);
            this.e = null;
        }
        RequestManagerRetriever requestManagerRetriever0 = Glide.get(activity0).getRequestManagerRetriever();
        requestManagerRetriever0.getClass();
        RequestManagerFragment requestManagerFragment1 = requestManagerRetriever0.e(activity0.getFragmentManager(), null);
        this.e = requestManagerFragment1;
        if(!this.equals(requestManagerFragment1)) {
            this.e.c.add(this);
        }
    }

    @Nullable
    public RequestManager getRequestManager() {
        return this.d;
    }

    @NonNull
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return this.b;
    }

    @Override  // android.app.Fragment
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        try {
            this.b(activity0);
        }
        catch(IllegalStateException illegalStateException0) {
            if(Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", illegalStateException0);
            }
        }
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.a();
        RequestManagerFragment requestManagerFragment0 = this.e;
        if(requestManagerFragment0 != null) {
            requestManagerFragment0.c.remove(this);
            this.e = null;
        }
    }

    @Override  // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        RequestManagerFragment requestManagerFragment0 = this.e;
        if(requestManagerFragment0 != null) {
            requestManagerFragment0.c.remove(this);
            this.e = null;
        }
    }

    @Override  // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.b = true;
        for(Object object0: Util.getSnapshot(this.a.a)) {
            ((LifecycleListener)object0).onStart();
        }
    }

    @Override  // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.b = false;
        for(Object object0: Util.getSnapshot(this.a.a)) {
            ((LifecycleListener)object0).onStop();
        }
    }

    public void setRequestManager(@Nullable RequestManager requestManager0) {
        this.d = requestManager0;
    }

    @Override  // android.app.Fragment
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("{parent=");
        Fragment fragment0 = this.getParentFragment();
        if(fragment0 == null) {
            fragment0 = this.f;
        }
        stringBuilder0.append(fragment0);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

