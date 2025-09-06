package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleRegistry;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends ComponentActivity implements OnRequestPermissionsResultCallback, RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = FragmentController.createController(new f0(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        this.d();
    }

    @ContentView
    public FragmentActivity(@LayoutRes int v) {
        super(v);
        this.mFragments = FragmentController.createController(new f0(this));
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        this.d();
    }

    public final void d() {
        this.getSavedStateRegistry().registerSavedStateProvider("android:support:lifecycle", new c0(this, 0));
        this.addOnConfigurationChangedListener(new d0(this, 0));
        this.addOnNewIntentListener(new d0(this, 1));
        this.addOnContextAvailableListener(new e0(this));
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        return this.mFragments.onCreateView(view0, s, context0, attributeSet0);
    }

    @Override  // android.app.Activity
    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        if(!this.shouldDumpInternalState(arr_s)) {
            return;
        }
        printWriter0.print(s);
        printWriter0.print("Local FragmentActivity ");
        printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter0.println(" State:");
        printWriter0.print(s + "  ");
        printWriter0.print("mCreated=");
        printWriter0.print(this.mCreated);
        printWriter0.print(" mResumed=");
        printWriter0.print(this.mResumed);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.mStopped);
        if(this.getApplication() != null) {
            LoaderManager.getInstance(this).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
        this.mFragments.getSupportFragmentManager().dump(s, fileDescriptor0, printWriter0, arr_s);
    }

    public static boolean e(FragmentManager fragmentManager0, State lifecycle$State0) {
        boolean z = false;
        for(Object object0: fragmentManager0.getFragments()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                if(fragment0.getHost() != null) {
                    z |= FragmentActivity.e(fragment0.getChildFragmentManager(), lifecycle$State0);
                }
                w1 w10 = fragment0.mViewLifecycleOwner;
                if(w10 != null) {
                    w10.b();
                    if(w10.e.getCurrentState().isAtLeast(State.STARTED)) {
                        fragment0.mViewLifecycleOwner.e.setCurrentState(lifecycle$State0);
                        z = true;
                    }
                }
                if(fragment0.mLifecycleRegistry.getCurrentState().isAtLeast(State.STARTED)) {
                    fragment0.mLifecycleRegistry.setCurrentState(lifecycle$State0);
                    z = true;
                }
            }
        }
        return z;
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    public void markFragmentsCreated() {
        while(FragmentActivity.e(this.getSupportFragmentManager(), State.CREATED)) {
        }
    }

    @Override  // androidx.activity.ComponentActivity
    @CallSuper
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(v, v1, intent0);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment0) {
    }

    @Override  // androidx.activity.ComponentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override  // android.app.Activity
    @Nullable
    public View onCreateView(@Nullable View view0, @NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        View view1 = this.dispatchFragmentsOnCreateView(view0, s, context0, attributeSet0);
        return view1 == null ? super.onCreateView(view0, s, context0, attributeSet0) : view1;
    }

    @Override  // android.app.Activity
    @Nullable
    public View onCreateView(@NonNull String s, @NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        View view0 = this.dispatchFragmentsOnCreateView(null, s, context0, attributeSet0);
        return view0 == null ? super.onCreateView(s, context0, attributeSet0) : view0;
    }

    @Override  // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
    }

    @Override  // androidx.activity.ComponentActivity
    public boolean onMenuItemSelected(int v, @NonNull MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 6 ? this.mFragments.dispatchContextItemSelected(menuItem0) : false;
    }

    @Override  // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
    }

    @Override  // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }

    @Override  // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    @CallSuper
    public void onRequestPermissionsResult(int v, @NonNull String[] arr_s, @NonNull int[] arr_v) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(v, arr_s, arr_v);
    }

    @Override  // android.app.Activity
    public void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override  // android.app.Activity
    public void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if(!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override  // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override  // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback0);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback0);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment0, @NonNull Intent intent0, int v) {
        this.startActivityFromFragment(fragment0, intent0, v, null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment0, @NonNull Intent intent0, int v, @Nullable Bundle bundle0) {
        if(v == -1) {
            ActivityCompat.startActivityForResult(this, intent0, -1, bundle0);
            return;
        }
        fragment0.startActivityForResult(intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment0, @NonNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        if(v == -1) {
            ActivityCompat.startIntentSenderForResult(this, intentSender0, -1, intent0, v1, v2, v3, bundle0);
            return;
        }
        fragment0.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override  // androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int v) {
    }
}

