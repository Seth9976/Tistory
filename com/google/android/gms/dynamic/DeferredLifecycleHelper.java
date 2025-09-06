package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import java.util.LinkedList;

@KeepForSdk
public abstract class DeferredLifecycleHelper {
    public LifecycleDelegate a;
    public Bundle b;
    public LinkedList c;
    public final a d;

    @KeepForSdk
    public DeferredLifecycleHelper() {
        this.d = new a(this);
    }

    public final void a(int v) {
        while(!this.c.isEmpty() && ((zah)this.c.getLast()).zaa() >= v) {
            this.c.removeLast();
        }
    }

    public final void b(Bundle bundle0, zah zah0) {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            zah0.zab(lifecycleDelegate0);
            return;
        }
        if(this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(zah0);
        if(bundle0 != null) {
            Bundle bundle1 = this.b;
            if(bundle1 == null) {
                this.b = (Bundle)bundle0.clone();
            }
            else {
                bundle1.putAll(bundle0);
            }
        }
        this.createDelegate(this.d);
    }

    @KeepForSdk
    public abstract void createDelegate(@NonNull OnDelegateCreatedListener arg1);

    @NonNull
    @KeepForSdk
    public LifecycleDelegate getDelegate() {
        return this.a;
    }

    @KeepForSdk
    public void handleGooglePlayUnavailable(@NonNull FrameLayout frameLayout0) {
        DeferredLifecycleHelper.showGooglePlayUnavailableMessage(frameLayout0);
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle0) {
        this.b(bundle0, new c(this, bundle0));
    }

    @NonNull
    @KeepForSdk
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        View view0 = new FrameLayout(layoutInflater0.getContext());
        this.b(bundle0, new d(this, ((FrameLayout)view0), layoutInflater0, viewGroup0, bundle0));
        if(this.a == null) {
            this.handleGooglePlayUnavailable(((FrameLayout)view0));
        }
        return view0;
    }

    @KeepForSdk
    public void onDestroy() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onDestroy();
            return;
        }
        this.a(1);
    }

    @KeepForSdk
    public void onDestroyView() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onDestroyView();
            return;
        }
        this.a(2);
    }

    @KeepForSdk
    public void onInflate(@NonNull Activity activity0, @NonNull Bundle bundle0, @Nullable Bundle bundle1) {
        this.b(bundle1, new b(this, activity0, bundle0, bundle1));
    }

    @KeepForSdk
    public void onLowMemory() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onPause();
            return;
        }
        this.a(5);
    }

    @KeepForSdk
    public void onResume() {
        this.b(null, new f(this, 1));
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onSaveInstanceState(bundle0);
            return;
        }
        Bundle bundle1 = this.b;
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @KeepForSdk
    public void onStart() {
        this.b(null, new f(this, 0));
    }

    @KeepForSdk
    public void onStop() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onStop();
            return;
        }
        this.a(4);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@NonNull FrameLayout frameLayout0) {
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        Context context0 = frameLayout0.getContext();
        int v = googleApiAvailability0.isGooglePlayServicesAvailable(context0);
        String s = zac.zad(context0, v);
        String s1 = zac.zac(context0, v);
        LinearLayout linearLayout0 = new LinearLayout(frameLayout0.getContext());
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout0.addView(linearLayout0);
        TextView textView0 = new TextView(frameLayout0.getContext());
        textView0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView0.setText(s);
        linearLayout0.addView(textView0);
        Intent intent0 = googleApiAvailability0.getErrorResolutionIntent(context0, v, null);
        if(intent0 != null) {
            Button button0 = new Button(context0);
            button0.setId(0x1020019);
            button0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button0.setText(s1);
            linearLayout0.addView(button0);
            button0.setOnClickListener(new e(context0, intent0));
        }
    }
}

