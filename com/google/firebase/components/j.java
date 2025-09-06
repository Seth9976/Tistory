package com.google.firebase.components;

import a7.b;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewParent;
import androidx.collection.ArrayMap;
import androidx.compose.ui.text.n0;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import n.a;

public final class j implements CriticalSection, Continuation, OnCompleteListener, OnNavigationItemSelectedListener, DeferredHandler {
    public final int a;
    public final Object b;
    public final Object c;

    public j(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        if(this.a != 5) {
            Uploader uploader0 = (Uploader)this.b;
            uploader0.getClass();
            for(Object object0: ((HashMap)this.c).entrySet()) {
                long v = (long)(((int)(((Integer)((Map.Entry)object0).getValue()))));
                String s = (String)((Map.Entry)object0).getKey();
                uploader0.i.recordLogEventDropped(v, Reason.INVALID_PAYLOD, s);
            }
            return null;
        }
        ((Uploader)this.b).c.recordSuccess(((Iterable)this.c));
        return null;
    }

    @Override  // com.google.firebase.inject.Deferred$DeferredHandler
    public void handle(Provider provider0) {
        ((DeferredHandler)this.b).handle(provider0);
        ((DeferredHandler)this.c).handle(provider0);
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task0) {
        ((EnhancedIntentService)this.b).a(((Intent)this.c));
    }

    @Override  // com.google.android.material.navigation.NavigationView$OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem0) {
        Intrinsics.checkNotNullParameter(((NavController)this.b), "$navController");
        NavigationView navigationView0 = (NavigationView)this.c;
        Intrinsics.checkNotNullParameter(navigationView0, "$navigationView");
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        boolean z = NavigationUI.onNavDestinationSelected(menuItem0, ((NavController)this.b));
        if(z) {
            ViewParent viewParent0 = navigationView0.getParent();
            if(viewParent0 instanceof Openable) {
                ((Openable)viewParent0).close();
                return true;
            }
            BottomSheetBehavior bottomSheetBehavior0 = NavigationUI.findBottomSheetBehavior(navigationView0);
            if(bottomSheetBehavior0 != null) {
                bottomSheetBehavior0.setState(5);
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.a != 2) {
            synchronized(((b)this.b)) {
                ((ArrayMap)((b)this.b).c).remove(((String)this.c));
                return task0;
            }
        }
        return ((int)(((Integer)task0.getResult()))) == 402 ? FcmBroadcastProcessor.a(((Context)this.b), ((Intent)this.c)).continueWith(new a(2), new n0(16)) : task0;
    }
}

