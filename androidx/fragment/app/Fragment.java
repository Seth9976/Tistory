package androidx.fragment.app;

import a5.b;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ActivityResultCaller, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String s, @Nullable Exception exception0) {
            super(s, exception0);
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        @NonNull
        public static final Parcelable.Creator CREATOR;
        public final Bundle a;

        static {
            SavedState.CREATOR = new b0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Bundle bundle0) {
            this.a = bundle0;
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            Bundle bundle0 = parcel0.readBundle();
            this.a = bundle0;
            if(classLoader0 != null && bundle0 != null) {
                bundle0.setClassLoader(classLoader0);
            }
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            parcel0.writeBundle(this.a);
        }
    }

    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    z mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @LayoutRes
    private int mContentLayoutId;
    Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final a0 mSavedStateAttachListener;
    SavedStateRegistryController mSavedStateRegistryController;
    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @Nullable
    w1 mViewLifecycleOwner;
    MutableLiveData mViewLifecycleOwnerLiveData;
    @NonNull
    String mWho;

    static {
        Fragment.USE_DEFAULT_TRANSITION = new Object();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = "bd686094-189a-49f9-be1d-41b7afcef126";
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new d1();  // 初始化器: Landroidx/fragment/app/FragmentManager;-><init>()V
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new t(this, 0);
        this.mMaxState = State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new u(this);
        this.f();
    }

    @ContentView
    public Fragment(@LayoutRes int v) {
        this.mContentLayoutId = v;
    }

    public final z c() {
        if(this.mAnimationInfo == null) {
            z z0 = new z();  // 初始化器: Ljava/lang/Object;-><init>()V
            z0.i = null;
            z0.j = Fragment.USE_DEFAULT_TRANSITION;
            z0.k = null;
            z0.l = Fragment.USE_DEFAULT_TRANSITION;
            z0.m = null;
            z0.n = Fragment.USE_DEFAULT_TRANSITION;
            z0.q = null;
            z0.r = null;
            z0.s = 1.0f;
            z0.t = null;
            this.mAnimationInfo = z0;
        }
        return this.mAnimationInfo;
    }

    public void callStartTransitionListener(boolean z) {
        z z1 = this.mAnimationInfo;
        if(z1 != null) {
            z1.u = false;
        }
        if(this.mView != null) {
            ViewGroup viewGroup0 = this.mContainer;
            if(viewGroup0 != null) {
                FragmentManager fragmentManager0 = this.mFragmentManager;
                if(fragmentManager0 != null) {
                    SpecialEffectsController specialEffectsController0 = SpecialEffectsController.getOrCreateController(viewGroup0, fragmentManager0);
                    specialEffectsController0.markPostponedState();
                    if(z) {
                        this.mHost.getHandler().post(new m(specialEffectsController0, 1));
                    }
                    else {
                        specialEffectsController0.executePendingOperations();
                    }
                    Handler handler0 = this.mPostponedHandler;
                    if(handler0 != null) {
                        handler0.removeCallbacks(this.mPostponedDurationRunnable);
                        this.mPostponedHandler = null;
                    }
                }
            }
        }
    }

    public FragmentContainer createFragmentContainer() {
        return new v(this);
    }

    public final int d() {
        return this.mMaxState == State.INITIALIZED || this.mParentFragment == null ? this.mMaxState.ordinal() : Math.min(this.mMaxState.ordinal(), this.mParentFragment.d());
    }

    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.mFragmentId));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.mContainerId));
        printWriter0.print(" mTag=");
        printWriter0.println(this.mTag);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.mState);
        printWriter0.print(" mWho=");
        printWriter0.print(this.mWho);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.mBackStackNesting);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.mAdded);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.mRemoving);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.mFromLayout);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.mInLayout);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.mHidden);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.mDetached);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.mMenuVisible);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.mHasMenu);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.mRetainInstance);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.mUserVisibleHint);
        if(this.mFragmentManager != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.mFragmentManager);
        }
        if(this.mHost != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.mHost);
        }
        if(this.mParentFragment != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.mParentFragment);
        }
        if(this.mArguments != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.mArguments);
        }
        if(this.mSavedFragmentState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.mSavedFragmentState);
        }
        if(this.mSavedViewState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.mSavedViewState);
        }
        if(this.mSavedViewRegistryState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewRegistryState=");
            printWriter0.println(this.mSavedViewRegistryState);
        }
        Fragment fragment0 = this.e(false);
        if(fragment0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(fragment0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.mTargetRequestCode);
        }
        printWriter0.print(s);
        printWriter0.print("mPopDirection=");
        printWriter0.println(this.getPopDirection());
        if(this.getEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getEnterAnim=");
            printWriter0.println(this.getEnterAnim());
        }
        if(this.getExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getExitAnim=");
            printWriter0.println(this.getExitAnim());
        }
        if(this.getPopEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopEnterAnim=");
            printWriter0.println(this.getPopEnterAnim());
        }
        if(this.getPopExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopExitAnim=");
            printWriter0.println(this.getPopExitAnim());
        }
        if(this.mContainer != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.mContainer);
        }
        if(this.mView != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.mView);
        }
        if(this.getAnimatingAway() != null) {
            printWriter0.print(s);
            printWriter0.print("mAnimatingAway=");
            printWriter0.println(this.getAnimatingAway());
        }
        if(this.getContext() != null) {
            LoaderManager.getInstance(this).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
        printWriter0.print(s);
        printWriter0.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    public final Fragment e(boolean z) {
        if(z) {
            FragmentStrictMode.onGetTargetFragmentUsage(this);
        }
        Fragment fragment0 = this.mTarget;
        if(fragment0 != null) {
            return fragment0;
        }
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            return this.mTargetWho == null ? null : fragmentManager0.c.b(this.mTargetWho);
        }
        return null;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        return super.equals(object0);
    }

    public final void f() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.create(this);
        this.mDefaultFactory = null;
        if(!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            a0 a00 = this.mSavedStateAttachListener;
            if(this.mState >= 0) {
                a00.a();
                return;
            }
            this.mOnPreAttachedListeners.add(a00);
        }
    }

    // 去混淆评级： 低(20)
    @Nullable
    public Fragment findFragmentByWho(@NonNull String s) {
        return s.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(s);
    }

    public final s g(ActivityResultContract activityResultContract0, Function function0, ActivityResultCallback activityResultCallback0) {
        if(this.mState > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference0 = new AtomicReference();
        y y0 = new y(this, function0, atomicReference0, activityResultContract0, activityResultCallback0);
        if(this.mState >= 0) {
            y0.a();
            return new s(atomicReference0, activityResultContract0);
        }
        this.mOnPreAttachedListeners.add(y0);
        return new s(atomicReference0, activityResultContract0);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        return this.mHost == null ? null : ((FragmentActivity)this.mHost.a);
    }

    public boolean getAllowEnterTransitionOverlap() {
        z z0 = this.mAnimationInfo;
        if(z0 != null) {
            return z0.p == null ? true : z0.p.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        z z0 = this.mAnimationInfo;
        if(z0 != null) {
            return z0.o == null ? true : z0.o.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        z z0 = this.mAnimationInfo;
        if(z0 == null) {
            return null;
        }
        z0.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    @Nullable
    public Context getContext() {
        return this.mHost == null ? null : this.mHost.b;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application0;
        for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                break;
            }
        }
        if(application0 == null && FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        CreationExtras creationExtras0 = new MutableCreationExtras();
        if(application0 != null) {
            ((MutableCreationExtras)creationExtras0).set(AndroidViewModelFactory.APPLICATION_KEY, application0);
        }
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if(this.getArguments() != null) {
            ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.getArguments());
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public Factory getDefaultViewModelProviderFactory() {
        Application application0;
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.mDefaultFactory == null) {
            for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Application) {
                    application0 = (Application)context0;
                    break;
                }
            }
            if(application0 == null && FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application0, this, this.getArguments());
        }
        return this.mDefaultFactory;
    }

    @AnimRes
    public int getEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.b;
    }

    @Nullable
    public Object getEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.i;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.q;
    }

    @AnimRes
    public int getExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.c;
    }

    @Nullable
    public Object getExitTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.k;
    }

    public SharedElementCallback getExitTransitionCallback() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.r;
    }

    public View getFocusedView() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.t;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.onGetHost();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        return this.mLayoutInflater == null ? this.performGetLayoutInflater(null) : this.mLayoutInflater;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = fragmentHostCallback0.onGetLayoutInflater();
        LayoutInflaterCompat.setFactory2(layoutInflater0, this.mChildFragmentManager.f);
        return layoutInflater0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    public int getNextTransition() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 == null) {
            throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
        }
        return fragmentManager0;
    }

    public boolean getPopDirection() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.a;
    }

    @AnimRes
    public int getPopEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.d;
    }

    @AnimRes
    public int getPopExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.e;
    }

    public float getPostOnViewCreatedAlpha() {
        return this.mAnimationInfo == null ? 1.0f : this.mAnimationInfo.s;
    }

    @Nullable
    public Object getReenterTransition() {
        z z0 = this.mAnimationInfo;
        if(z0 == null) {
            return null;
        }
        return z0.l == Fragment.USE_DEFAULT_TRANSITION ? this.getExitTransition() : z0.l;
    }

    @NonNull
    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.onGetRetainInstanceUsage(this);
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        z z0 = this.mAnimationInfo;
        if(z0 == null) {
            return null;
        }
        return z0.j == Fragment.USE_DEFAULT_TRANSITION ? this.getEnterTransition() : z0.j;
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        z z0 = this.mAnimationInfo;
        if(z0 == null) {
            return null;
        }
        return z0.n == Fragment.USE_DEFAULT_TRANSITION ? this.getSharedElementEnterTransition() : z0.n;
    }

    @NonNull
    public ArrayList getSharedElementSourceNames() {
        z z0 = this.mAnimationInfo;
        if(z0 != null) {
            ArrayList arrayList0 = z0.g;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    @NonNull
    public ArrayList getSharedElementTargetNames() {
        z z0 = this.mAnimationInfo;
        if(z0 != null) {
            ArrayList arrayList0 = z0.h;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    @NonNull
    public final String getString(@StringRes int v) {
        return this.getResources().getString(v);
    }

    @NonNull
    public final String getString(@StringRes int v, @Nullable Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return this.e(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.onGetTargetFragmentRequestCodeUsage(this);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @MainThread
    @NonNull
    public LifecycleOwner getViewLifecycleOwner() {
        LifecycleOwner lifecycleOwner0 = this.mViewLifecycleOwner;
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        return lifecycleOwner0;
    }

    @NonNull
    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.d() == State.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap0 = this.mFragmentManager.O.J0;
        ViewModelStore viewModelStore0 = (ViewModelStore)hashMap0.get(this.mWho);
        if(viewModelStore0 == null) {
            viewModelStore0 = new ViewModelStore();
            hashMap0.put(this.mWho, viewModelStore0);
        }
        return viewModelStore0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        this.f();
        this.mPreviousWho = this.mWho;
        this.mWho = "f123276b-8718-4f73-9114-a09dddf77019";
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new d1();  // 初始化器: Landroidx/fragment/app/FragmentManager;-><init>()V
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context0, @NonNull String s) {
        return Fragment.instantiate(context0, s, null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context0, @NonNull String s, @Nullable Bundle bundle0) {
        try {
            Fragment fragment0 = (Fragment)FragmentFactory.loadFragmentClass(context0.getClassLoader(), s).getConstructor(null).newInstance(null);
            if(bundle0 != null) {
                bundle0.setClassLoader(fragment0.getClass().getClassLoader());
                fragment0.setArguments(bundle0);
                return fragment0;
            }
            return fragment0;
        }
        catch(java.lang.InstantiationException instantiationException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InstantiationException("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if(!this.mHidden) {
            FragmentManager fragmentManager0 = this.mFragmentManager;
            if(fragmentManager0 != null) {
                Fragment fragment0 = this.mParentFragment;
                fragmentManager0.getClass();
                return fragment0 == null ? false : fragment0.isHidden();
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        if(this.mMenuVisible) {
            if(this.mFragmentManager != null) {
                return this.mParentFragment == null ? true : this.mParentFragment.isMenuVisible();
            }
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        return this.mFragmentManager == null ? false : this.mFragmentManager.isStateSaved();
    }

    // 去混淆评级： 低(20)
    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.I();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + v + " resultCode: " + v1 + " data: " + intent0);
        }
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity0) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.a;
        if(activity0 != null) {
            this.mCalled = false;
            this.onAttach(activity0);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment0) {
    }

    @Override  // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration0) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem0) [...] // Inlined contents

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle0) {
        this.mCalled = true;
        this.restoreChildFragmentState();
        FragmentManager fragmentManager0 = this.mChildFragmentManager;
        if(fragmentManager0.u < 1) {
            fragmentManager0.H = false;
            fragmentManager0.I = false;
            fragmentManager0.O.N0 = false;
            fragmentManager0.t(1);
        }
    }

    @MainThread
    @Nullable
    public Animation onCreateAnimation(int v, boolean z, int v1) [...] // Inlined contents

    @MainThread
    @Nullable
    public Animator onCreateAnimator(int v, boolean z, int v1) [...] // Inlined contents

    @Override  // android.view.View$OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu0, @NonNull View view0, @Nullable ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
    }

    @MainThread
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        return this.mContentLayoutId == 0 ? null : layoutInflater0.inflate(this.mContentLayoutId, viewGroup0, false);
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity0, @NonNull AttributeSet attributeSet0, @Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context0, @NonNull AttributeSet attributeSet0, @Nullable Bundle bundle0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.a;
        if(activity0 != null) {
            this.mCalled = false;
            this.onInflate(activity0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem0) [...] // Inlined contents

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu0) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu0) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int v, @NonNull String[] arr_s, @NonNull int[] arr_v) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle0) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle0) {
        this.mChildFragmentManager.I();
        this.mState = 3;
        this.mCalled = false;
        this.onActivityCreated(bundle0);
        throw new d2("Fragment " + this + " did not call through to super.onActivityCreated()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    public void performAttach() {
        for(Object object0: this.mOnPreAttachedListeners) {
            ((a0)object0).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, this.createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        this.onAttach(this.mHost.b);
        if(!this.mCalled) {
            throw new d2("Fragment " + this + " did not call through to super.onAttach()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
        }
        FragmentManager fragmentManager0 = this.mFragmentManager;
        for(Object object1: fragmentManager0.o) {
            ((FragmentOnAttachListener)object1).onAttachFragment(fragmentManager0, this);
        }
        this.mChildFragmentManager.H = false;
        this.mChildFragmentManager.I = false;
        this.mChildFragmentManager.O.N0 = false;
        this.mChildFragmentManager.t(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration0) {
        this.onConfigurationChanged(configuration0);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem0) {
        return this.mHidden ? false : this.mChildFragmentManager.i(menuItem0);
    }

    public void performCreate(Bundle bundle0) {
        this.mChildFragmentManager.I();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new w(this));
        this.onCreate(bundle0);
        this.mIsCreated = true;
        throw new d2("Fragment " + this + " did not call through to super.onCreate()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.j(menu0, menuInflater0);
        }
        return false;
    }

    public void performCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.mChildFragmentManager.I();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new w1(this, this.getViewModelStore(), new r(this, 0));
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.mView = view0;
        if(view0 != null) {
            this.mViewLifecycleOwner.b();
            if(FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.set(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if(this.mViewLifecycleOwner.e != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        throw new d2("Fragment " + this + " did not call through to super.onDestroy()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if(this.mView != null) {
            w1 w10 = this.mViewLifecycleOwner;
            w10.b();
            if(w10.e.getCurrentState().isAtLeast(State.CREATED)) {
                this.mViewLifecycleOwner.a(Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if(!this.mCalled) {
            throw new d2("Fragment " + this + " did not call through to super.onDestroyView()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
        }
        LoaderManager.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        throw new d2("Fragment " + this + " did not call through to super.onDetach()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle0) {
        LayoutInflater layoutInflater0 = this.onGetLayoutInflater(bundle0);
        this.mLayoutInflater = layoutInflater0;
        return layoutInflater0;
    }

    public void performLowMemory() {
        this.onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem0) {
        return this.mHidden ? false : this.mChildFragmentManager.o(menuItem0);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu0) {
        if(!this.mHidden) {
            this.mChildFragmentManager.p(menu0);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        this.onPause();
        if(!this.mCalled) {
            throw new d2("Fragment " + this + " did not call through to super.onPause()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.s(menu0);
        }
        return false;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean z = FragmentManager.G(this);
        if(this.mIsPrimaryNavigationFragment == null || this.mIsPrimaryNavigationFragment.booleanValue() != z) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(z);
            FragmentManager fragmentManager0 = this.mChildFragmentManager;
            fragmentManager0.Y();
            fragmentManager0.q(fragmentManager0.y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.I();
        this.mChildFragmentManager.w(true);
        this.mState = 7;
        this.mCalled = false;
        this.onResume();
        throw new d2("Fragment " + this + " did not call through to super.onResume()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    public void performSaveInstanceState(Bundle bundle0) {
        this.onSaveInstanceState(bundle0);
    }

    public void performStart() {
        this.mChildFragmentManager.I();
        this.mChildFragmentManager.w(true);
        this.mState = 5;
        this.mCalled = false;
        this.onStart();
        throw new d2("Fragment " + this + " did not call through to super.onStart()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
    }

    public void performStop() {
        this.mChildFragmentManager.I = true;
        this.mChildFragmentManager.O.N0 = true;
        this.mChildFragmentManager.t(4);
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        this.onStop();
        if(!this.mCalled) {
            throw new d2("Fragment " + this + " did not call through to super.onStop()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
        }
    }

    public void performViewCreated() {
        Bundle bundle0 = this.mSavedFragmentState == null ? null : this.mSavedFragmentState.getBundle("savedInstanceState");
        this.onViewCreated(this.mView, bundle0);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        this.c().u = true;
    }

    public final void postponeEnterTransition(long v, @NonNull TimeUnit timeUnit0) {
        this.c().u = true;
        Handler handler0 = this.mPostponedHandler;
        if(handler0 != null) {
            handler0.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager0 = this.mFragmentManager;
        this.mPostponedHandler = fragmentManager0 == null ? new Handler(Looper.getMainLooper()) : fragmentManager0.getHost().getHandler();
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit0.toMillis(v));
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @MainThread
    @NonNull
    public final ActivityResultLauncher registerForActivityResult(@NonNull ActivityResultContract activityResultContract0, @NonNull ActivityResultCallback activityResultCallback0) {
        return this.g(activityResultContract0, new x(this, 0), activityResultCallback0);
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @MainThread
    @NonNull
    public final ActivityResultLauncher registerForActivityResult(@NonNull ActivityResultContract activityResultContract0, @NonNull ActivityResultRegistry activityResultRegistry0, @NonNull ActivityResultCallback activityResultCallback0) {
        return this.g(activityResultContract0, new x(activityResultRegistry0, 1), activityResultCallback0);
    }

    public void registerForContextMenu(@NonNull View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] arr_s, int v) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        FragmentManager fragmentManager0 = this.getParentFragmentManager();
        if(fragmentManager0.E != null) {
            y0 y00 = new y0(this.mWho, v);
            fragmentManager0.F.addLast(y00);
            fragmentManager0.E.launch(arr_s);
            return;
        }
        fragmentManager0.v.onRequestPermissionsFromFragment(this, arr_s, v);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
        }
        return fragmentActivity0;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        return bundle0;
    }

    @NonNull
    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new IllegalStateException(b.l("Fragment ", this, " not attached to a context."));
        }
        return context0;
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a host.");
        }
        return object0;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment fragment0 = this.getParentFragment();
        if(fragment0 == null) {
            throw this.getContext() == null ? new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host") : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return fragment0;
    }

    @NonNull
    public final View requireView() {
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
        return view0;
    }

    public void restoreChildFragmentState() {
        Bundle bundle0 = this.mSavedFragmentState;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("childFragmentManager");
            if(bundle1 != null) {
                this.mChildFragmentManager.P(bundle1);
                this.mChildFragmentManager.H = false;
                this.mChildFragmentManager.I = false;
                this.mChildFragmentManager.O.N0 = false;
                this.mChildFragmentManager.t(1);
            }
        }
    }

    public final void restoreViewState(Bundle bundle0) {
        SparseArray sparseArray0 = this.mSavedViewState;
        if(sparseArray0 != null) {
            this.mView.restoreHierarchyState(sparseArray0);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle0);
        if(!this.mCalled) {
            throw new d2("Fragment " + this + " did not call through to super.onViewStateRestored()");  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.c().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.c().o = Boolean.valueOf(z);
    }

    public void setAnimations(@AnimRes int v, @AnimRes int v1, @AnimRes int v2, @AnimRes int v3) {
        if(this.mAnimationInfo == null && v == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
            return;
        }
        this.c().b = v;
        this.c().c = v1;
        this.c().d = v2;
        this.c().e = v3;
    }

    public void setArguments(@Nullable Bundle bundle0) {
        if(this.mFragmentManager != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle0;
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        this.c().q = sharedElementCallback0;
    }

    public void setEnterTransition(@Nullable Object object0) {
        this.c().i = object0;
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback0) {
        this.c().r = sharedElementCallback0;
    }

    public void setExitTransition(@Nullable Object object0) {
        this.c().k = object0;
    }

    public void setFocusedView(View view0) {
        this.c().t = view0;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if(this.mHasMenu != z) {
            this.mHasMenu = z;
            if(this.isAdded() && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setInitialSavedState(@Nullable SavedState fragment$SavedState0) {
        Bundle bundle0;
        if(this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if(fragment$SavedState0 == null) {
            bundle0 = null;
        }
        else {
            bundle0 = fragment$SavedState0.a;
            if(bundle0 == null) {
                bundle0 = null;
            }
        }
        this.mSavedFragmentState = bundle0;
    }

    public void setMenuVisibility(boolean z) {
        if(this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if(this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int v) {
        if(this.mAnimationInfo == null && v == 0) {
            return;
        }
        this.c();
        this.mAnimationInfo.f = v;
    }

    public void setPopDirection(boolean z) {
        if(this.mAnimationInfo == null) {
            return;
        }
        this.c().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        this.c().s = f;
    }

    public void setReenterTransition(@Nullable Object object0) {
        this.c().l = object0;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.onSetRetainInstanceUsage(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            if(z) {
                fragmentManager0.O.a(this);
                return;
            }
            fragmentManager0.O.f(this);
            return;
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(@Nullable Object object0) {
        this.c().j = object0;
    }

    public void setSharedElementEnterTransition(@Nullable Object object0) {
        this.c().m = object0;
    }

    public void setSharedElementNames(@Nullable ArrayList arrayList0, @Nullable ArrayList arrayList1) {
        this.c();
        this.mAnimationInfo.g = arrayList0;
        this.mAnimationInfo.h = arrayList1;
    }

    public void setSharedElementReturnTransition(@Nullable Object object0) {
        this.c().n = object0;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment0, int v) {
        if(fragment0 != null) {
            FragmentStrictMode.onSetTargetFragmentUsage(this, fragment0, v);
        }
        FragmentManager fragmentManager0 = fragment0 == null ? null : fragment0.mFragmentManager;
        if(this.mFragmentManager != null && fragmentManager0 != null && this.mFragmentManager != fragmentManager0) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " must share the same FragmentManager to be set as a target fragment");
        }
        for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.e(false)) {
            if(fragment1.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if(fragment0 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        }
        else if(this.mFragmentManager == null || fragment0.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment0;
        }
        else {
            this.mTargetWho = fragment0.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.onSetUserVisibleHint(this, z);
        boolean z1 = false;
        if(!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager0 = this.mFragmentManager;
            k1 k10 = fragmentManager0.f(this);
            Fragment fragment0 = k10.c;
            if(fragment0.mDeferStart) {
                if(fragmentManager0.b) {
                    fragmentManager0.K = true;
                }
                else {
                    fragment0.mDeferStart = false;
                    k10.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if(this.mState < 5 && !z) {
            z1 = true;
        }
        this.mDeferStart = z1;
        if(this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String s) {
        return this.mHost == null ? false : this.mHost.onShouldShowRequestPermissionRationale(s);
    }

    public void startActivity(@NonNull Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(@NonNull Intent intent0, @Nullable Bundle bundle0) {
        FragmentHostCallback fragmentHostCallback0 = this.mHost;
        if(fragmentHostCallback0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        fragmentHostCallback0.onStartActivityFromFragment(this, intent0, -1, bundle0);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent0, int v, @Nullable Bundle bundle0) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        FragmentManager fragmentManager0 = this.getParentFragmentManager();
        if(fragmentManager0.C != null) {
            y0 y00 = new y0(this.mWho, v);
            fragmentManager0.F.addLast(y00);
            if(bundle0 != null) {
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            fragmentManager0.C.launch(intent0);
            return;
        }
        fragmentManager0.v.onStartActivityFromFragment(this, intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        Intent intent1 = intent0;
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + v + " IntentSender: " + intentSender0 + " fillInIntent: " + intent0 + " options: " + bundle0);
        }
        FragmentManager fragmentManager0 = this.getParentFragmentManager();
        if(fragmentManager0.D != null) {
            if(bundle0 != null) {
                if(intent1 == null) {
                    intent1 = new Intent();
                    intent1.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle0 + " were added to fillInIntent " + intent1 + " for fragment " + this);
                }
                intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            IntentSenderRequest intentSenderRequest0 = new Builder(intentSender0).setFillInIntent(intent1).setFlags(v2, v1).build();
            y0 y00 = new y0(this.mWho, v);
            fragmentManager0.F.addLast(y00);
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
            }
            fragmentManager0.D.launch(intentSenderRequest0);
            return;
        }
        fragmentManager0.v.onStartIntentSenderFromFragment(this, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public void startPostponedEnterTransition() {
        if(this.mAnimationInfo != null && this.c().u) {
            if(this.mHost == null) {
                this.c().u = false;
                return;
            }
            if(Looper.myLooper() != this.mHost.getHandler().getLooper()) {
                this.mHost.getHandler().postAtFrontOfQueue(new t(this, 1));
                return;
            }
            this.callStartTransitionListener(true);
        }
    }

    @Override
    @NonNull
    public String toString() [...] // 潜在的解密器

    public void unregisterForContextMenu(@NonNull View view0) {
        view0.setOnCreateContextMenuListener(null);
    }
}

