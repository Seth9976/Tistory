package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder.WaitForFramesAfterTrimMemory;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.List;

public class RequestManagerRetriever implements Handler.Callback {
    public interface RequestManagerFactory {
        @NonNull
        RequestManager build(@NonNull Glide arg1, @NonNull Lifecycle arg2, @NonNull RequestManagerTreeNode arg3, @NonNull Context arg4);
    }

    public volatile RequestManager a;
    public final HashMap b;
    public final HashMap c;
    public final Handler d;
    public final RequestManagerFactory e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final FrameWaiter h;
    public final g i;
    public static final i j;

    static {
        RequestManagerRetriever.j = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public RequestManagerRetriever(@Nullable RequestManagerFactory requestManagerRetriever$RequestManagerFactory0, GlideExperiments glideExperiments0) {
        c c0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        new Bundle();
        if(requestManagerRetriever$RequestManagerFactory0 == null) {
            requestManagerRetriever$RequestManagerFactory0 = RequestManagerRetriever.j;
        }
        this.e = requestManagerRetriever$RequestManagerFactory0;
        this.d = new Handler(Looper.getMainLooper(), this);
        this.i = new g(requestManagerRetriever$RequestManagerFactory0);
        if(!HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED || !HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) {
            c0 = new c(0);
        }
        else if(glideExperiments0.isEnabled(WaitForFramesAfterTrimMemory.class)) {
            c0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else {
            c0 = new c(1);
        }
        this.h = c0;
    }

    public static Activity a(Context context0) {
        if(context0 instanceof Activity) {
            return (Activity)context0;
        }
        return context0 instanceof ContextWrapper ? RequestManagerRetriever.a(((ContextWrapper)context0).getBaseContext()) : null;
    }

    public static void b(FragmentManager fragmentManager0, ArrayMap arrayMap0) {
        for(Object object0: fragmentManager0.getFragments()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0.getView() != null) {
                arrayMap0.put(fragment0.getView(), fragment0);
                RequestManagerRetriever.b(fragment0.getChildFragmentManager(), arrayMap0);
            }
        }
    }

    public static void c(List list0, ArrayMap arrayMap0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            androidx.fragment.app.Fragment fragment0 = (androidx.fragment.app.Fragment)object0;
            if(fragment0 != null && fragment0.getView() != null) {
                arrayMap0.put(fragment0.getView(), fragment0);
                RequestManagerRetriever.c(fragment0.getChildFragmentManager().getFragments(), arrayMap0);
            }
        }
    }

    public final RequestManager d(Activity activity0, FragmentManager fragmentManager0, Fragment fragment0, boolean z) {
        RequestManagerFragment requestManagerFragment0 = this.e(fragmentManager0, fragment0);
        RequestManager requestManager0 = requestManagerFragment0.getRequestManager();
        if(requestManager0 == null) {
            Glide glide0 = Glide.get(activity0);
            requestManager0 = this.e.build(glide0, requestManagerFragment0.a, requestManagerFragment0.getRequestManagerTreeNode(), activity0);
            if(z) {
                requestManager0.onStart();
            }
            requestManagerFragment0.setRequestManager(requestManager0);
        }
        return requestManager0;
    }

    public final RequestManagerFragment e(FragmentManager fragmentManager0, Fragment fragment0) {
        HashMap hashMap0 = this.b;
        RequestManagerFragment requestManagerFragment0 = (RequestManagerFragment)hashMap0.get(fragmentManager0);
        if(requestManagerFragment0 == null) {
            RequestManagerFragment requestManagerFragment1 = (RequestManagerFragment)fragmentManager0.findFragmentByTag("com.bumptech.glide.manager");
            if(requestManagerFragment1 == null) {
                requestManagerFragment1 = new RequestManagerFragment();
                requestManagerFragment1.f = fragment0;
                if(fragment0 != null && fragment0.getActivity() != null) {
                    requestManagerFragment1.b(fragment0.getActivity());
                }
                hashMap0.put(fragmentManager0, requestManagerFragment1);
                fragmentManager0.beginTransaction().add(requestManagerFragment1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.d.obtainMessage(1, fragmentManager0).sendToTarget();
            }
            return requestManagerFragment1;
        }
        return requestManagerFragment0;
    }

    @NonNull
    @Deprecated
    public RequestManager get(@NonNull Activity activity0) {
        if(Util.isOnBackgroundThread()) {
            return this.get(activity0.getApplicationContext());
        }
        if(activity0 instanceof FragmentActivity) {
            return this.get(((FragmentActivity)activity0));
        }
        if(activity0.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.h.registerSelf(activity0);
        FragmentManager fragmentManager0 = activity0.getFragmentManager();
        Activity activity1 = RequestManagerRetriever.a(activity0);
        return activity1 == null || !activity1.isFinishing() ? this.d(activity0, fragmentManager0, null, true) : this.d(activity0, fragmentManager0, null, false);
    }

    @TargetApi(17)
    @NonNull
    @Deprecated
    public RequestManager get(@NonNull Fragment fragment0) {
        if(fragment0.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if(!Util.isOnBackgroundThread()) {
            if(fragment0.getActivity() != null) {
                Activity activity0 = fragment0.getActivity();
                this.h.registerSelf(activity0);
            }
            FragmentManager fragmentManager0 = fragment0.getChildFragmentManager();
            return this.d(fragment0.getActivity(), fragmentManager0, fragment0, fragment0.isVisible());
        }
        return this.get(fragment0.getActivity().getApplicationContext());
    }

    @NonNull
    public RequestManager get(@NonNull Context context0) {
        if(context0 == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if(Util.isOnMainThread() && !(context0 instanceof Application)) {
            if(context0 instanceof FragmentActivity) {
                return this.get(((FragmentActivity)context0));
            }
            if(context0 instanceof Activity) {
                return this.get(((Activity)context0));
            }
            if(context0 instanceof ContextWrapper && ((ContextWrapper)context0).getBaseContext().getApplicationContext() != null) {
                return this.get(((ContextWrapper)context0).getBaseContext());
            }
        }
        if(this.a == null) {
            synchronized(this) {
                if(this.a == null) {
                    Glide glide0 = Glide.get(context0.getApplicationContext());
                    c c0 = new c(2);
                    c c1 = new c(3);
                    Context context1 = context0.getApplicationContext();
                    this.a = this.e.build(glide0, c0, c1, context1);
                }
            }
        }
        return this.a;
    }

    @NonNull
    public RequestManager get(@NonNull View view0) {
        if(Util.isOnBackgroundThread()) {
            return this.get(view0.getContext().getApplicationContext());
        }
        androidx.fragment.app.Fragment fragment0 = null;
        Preconditions.checkNotNull(view0);
        Preconditions.checkNotNull(view0.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activity0 = RequestManagerRetriever.a(view0.getContext());
        if(activity0 == null) {
            return this.get(view0.getContext().getApplicationContext());
        }
        if(activity0 instanceof FragmentActivity) {
            ArrayMap arrayMap0 = this.f;
            arrayMap0.clear();
            RequestManagerRetriever.c(((FragmentActivity)activity0).getSupportFragmentManager().getFragments(), arrayMap0);
            View view1 = ((FragmentActivity)activity0).findViewById(0x1020002);
            while(!view0.equals(view1)) {
                fragment0 = (androidx.fragment.app.Fragment)arrayMap0.get(view0);
                if(fragment0 != null || !(view0.getParent() instanceof View)) {
                    break;
                }
                view0 = (View)view0.getParent();
            }
            arrayMap0.clear();
            return fragment0 == null ? this.get(((FragmentActivity)activity0)) : this.get(fragment0);
        }
        ArrayMap arrayMap1 = this.g;
        arrayMap1.clear();
        RequestManagerRetriever.b(activity0.getFragmentManager(), arrayMap1);
        View view2 = activity0.findViewById(0x1020002);
        while(!view0.equals(view2)) {
            fragment0 = (Fragment)arrayMap1.get(view0);
            if(fragment0 != null || !(view0.getParent() instanceof View)) {
                break;
            }
            view0 = (View)view0.getParent();
        }
        arrayMap1.clear();
        return fragment0 == null ? this.get(activity0) : this.get(((Fragment)fragment0));
    }

    @NonNull
    public RequestManager get(@NonNull androidx.fragment.app.Fragment fragment0) {
        Preconditions.checkNotNull(fragment0.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if(Util.isOnBackgroundThread()) {
            return this.get(fragment0.getContext().getApplicationContext());
        }
        if(fragment0.getActivity() != null) {
            FragmentActivity fragmentActivity0 = fragment0.getActivity();
            this.h.registerSelf(fragmentActivity0);
        }
        androidx.fragment.app.FragmentManager fragmentManager0 = fragment0.getChildFragmentManager();
        Context context0 = fragment0.getContext();
        Glide glide0 = Glide.get(context0.getApplicationContext());
        boolean z = fragment0.isVisible();
        return this.i.a(context0, glide0, fragment0.getLifecycle(), fragmentManager0, z);
    }

    @NonNull
    public RequestManager get(@NonNull FragmentActivity fragmentActivity0) {
        if(Util.isOnBackgroundThread()) {
            return this.get(fragmentActivity0.getApplicationContext());
        }
        if(fragmentActivity0.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.h.registerSelf(fragmentActivity0);
        Activity activity0 = RequestManagerRetriever.a(fragmentActivity0);
        boolean z = activity0 == null || !activity0.isFinishing();
        Glide glide0 = Glide.get(fragmentActivity0.getApplicationContext());
        androidx.lifecycle.Lifecycle lifecycle0 = fragmentActivity0.getLifecycle();
        androidx.fragment.app.FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        return this.i.a(fragmentActivity0, glide0, lifecycle0, fragmentManager0, z);
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message message0) {
        Object object0;
        FragmentManager fragmentManager0;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = message0.arg1 == 1;
        Handler handler0 = this.d;
        switch(message0.what) {
            case 1: {
                fragmentManager0 = (FragmentManager)message0.obj;
                HashMap hashMap0 = this.b;
                RequestManagerFragment requestManagerFragment0 = (RequestManagerFragment)hashMap0.get(fragmentManager0);
                RequestManagerFragment requestManagerFragment1 = (RequestManagerFragment)fragmentManager0.findFragmentByTag("com.bumptech.glide.manager");
                if(requestManagerFragment1 == requestManagerFragment0) {
                    object0 = hashMap0.remove(fragmentManager0);
                    z1 = true;
                }
                else {
                    if(requestManagerFragment1 != null && requestManagerFragment1.getRequestManager() != null) {
                        throw new IllegalStateException("We\'ve added two fragments with requests! Old: " + requestManagerFragment1 + " New: " + requestManagerFragment0);
                    }
                    if(z2 || fragmentManager0.isDestroyed()) {
                        if(Log.isLoggable("RMRetriever", 5)) {
                            if(fragmentManager0.isDestroyed()) {
                                Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                            }
                            else {
                                Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                            }
                        }
                        requestManagerFragment0.a.a();
                        object0 = hashMap0.remove(fragmentManager0);
                        z1 = true;
                    }
                    else {
                        FragmentTransaction fragmentTransaction0 = fragmentManager0.beginTransaction().add(requestManagerFragment0, "com.bumptech.glide.manager");
                        if(requestManagerFragment1 != null) {
                            fragmentTransaction0.remove(requestManagerFragment1);
                        }
                        fragmentTransaction0.commitAllowingStateLoss();
                        handler0.obtainMessage(1, 1, 0, fragmentManager0).sendToTarget();
                        if(Log.isLoggable("RMRetriever", 3)) {
                            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                        }
                        goto label_52;
                    }
                }
                break;
            }
            case 2: {
                fragmentManager0 = (androidx.fragment.app.FragmentManager)message0.obj;
                HashMap hashMap1 = this.c;
                Object object1 = hashMap1.get(fragmentManager0);
                androidx.fragment.app.Fragment fragment0 = ((androidx.fragment.app.FragmentManager)fragmentManager0).findFragmentByTag("com.bumptech.glide.manager");
                if(((SupportRequestManagerFragment)fragment0) == ((SupportRequestManagerFragment)object1)) {
                    object0 = hashMap1.remove(fragmentManager0);
                    z1 = true;
                }
                else {
                    if(((SupportRequestManagerFragment)fragment0) != null && ((SupportRequestManagerFragment)fragment0).getRequestManager() != null) {
                        throw new IllegalStateException("We\'ve added two fragments with requests! Old: " + ((SupportRequestManagerFragment)fragment0) + " New: " + ((SupportRequestManagerFragment)object1));
                    }
                    if(z2 || ((androidx.fragment.app.FragmentManager)fragmentManager0).isDestroyed()) {
                        if(!((androidx.fragment.app.FragmentManager)fragmentManager0).isDestroyed()) {
                            if(Log.isLoggable("RMRetriever", 6)) {
                                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you\'re starting loads in a unit test with an Activity that you haven\'t created and never create. If you\'re using Robolectric, create the Activity as part of your test setup");
                            }
                        }
                        else if(Log.isLoggable("RMRetriever", 5)) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                        }
                        ((SupportRequestManagerFragment)object1).z.a();
                        object0 = hashMap1.remove(fragmentManager0);
                        z1 = true;
                    }
                    else {
                        androidx.fragment.app.FragmentTransaction fragmentTransaction1 = ((androidx.fragment.app.FragmentManager)fragmentManager0).beginTransaction().add(((SupportRequestManagerFragment)object1), "com.bumptech.glide.manager");
                        if(((SupportRequestManagerFragment)fragment0) != null) {
                            fragmentTransaction1.remove(((SupportRequestManagerFragment)fragment0));
                        }
                        fragmentTransaction1.commitNowAllowingStateLoss();
                        handler0.obtainMessage(2, 1, 0, fragmentManager0).sendToTarget();
                        if(Log.isLoggable("RMRetriever", 3)) {
                            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                        }
                    label_52:
                        fragmentManager0 = null;
                        object0 = null;
                        z1 = true;
                        z = false;
                    }
                }
                break;
            }
            default: {
                z = false;
                fragmentManager0 = null;
                object0 = null;
            }
        }
        if(Log.isLoggable("RMRetriever", 5) && z && object0 == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + fragmentManager0);
        }
        return z1;
    }
}

