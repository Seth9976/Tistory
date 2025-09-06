package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    @Nullable
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private Observer mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public DialogFragment() {
        this.mDismissRunnable = new m(this, 0);
        this.mOnCancelListener = new n(this);
        this.mOnDismissListener = new o(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new p(this);
        this.mDialogCreated = false;
    }

    public DialogFragment(@LayoutRes int v) {
        super(v);
        this.mDismissRunnable = new m(this, 0);
        this.mOnCancelListener = new n(this);
        this.mOnDismissListener = new o(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new p(this);
        this.mDialogCreated = false;
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public FragmentContainer createFragmentContainer() {
        return new q(this, new v(this));
    }

    public void dismiss() {
        this.h(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        this.h(true, false, false);
    }

    @MainThread
    public void dismissNow() {
        this.h(false, false, true);
    }

    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public final void h(boolean z, boolean z1, boolean z2) {
        if(this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.setOnDismissListener(null);
            this.mDialog.dismiss();
            if(!z1) {
                if(Looper.myLooper() == this.mHandler.getLooper()) {
                    this.onDismiss(this.mDialog);
                }
                else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if(this.mBackStackId >= 0) {
            if(z2) {
                this.getParentFragmentManager().popBackStackImmediate(this.mBackStackId, 1);
            }
            else {
                this.getParentFragmentManager().J(this.mBackStackId, 1, z);
            }
            this.mBackStackId = -1;
            return;
        }
        FragmentTransaction fragmentTransaction0 = this.getParentFragmentManager().beginTransaction();
        fragmentTransaction0.setReorderingAllowed(true);
        fragmentTransaction0.remove(this);
        if(z2) {
            fragmentTransaction0.commitNow();
            return;
        }
        if(z) {
            fragmentTransaction0.commitAllowingStateLoss();
            return;
        }
        fragmentTransaction0.commit();
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onAttach(@NonNull Context context0) {
        super.onAttach(context0);
        this.getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if(!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface0) {
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if(bundle0 != null) {
            this.mStyle = bundle0.getInt("android:style", 0);
            this.mTheme = bundle0.getInt("android:theme", 0);
            this.mCancelable = bundle0.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle0.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle0.getInt("android:backStackId", -1);
        }
    }

    @MainThread
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle0) {
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ComponentDialog(this.requireContext(), this.getTheme());
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            this.mViewDestroyed = true;
            dialog0.setOnDismissListener(null);
            this.mDialog.dismiss();
            if(!this.mDismissed) {
                this.onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onDetach() {
        super.onDetach();
        if(!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        this.getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    @CallSuper
    public void onDismiss(@NonNull DialogInterface dialogInterface0) {
        if(!this.mViewDestroyed) {
            if(FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            this.h(true, true, false);
        }
    }

    @Nullable
    public View onFindViewById(int v) {
        return this.mDialog == null ? null : this.mDialog.findViewById(v);
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        if(this.mShowsDialog && !this.mCreatingDialog) {
            if(!this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialog0 = this.onCreateDialog(bundle0);
                    this.mDialog = dialog0;
                    if(this.mShowsDialog) {
                        this.setupDialog(dialog0, this.mStyle);
                        Context context0 = this.getContext();
                        if(context0 instanceof Activity) {
                            this.mDialog.setOwnerActivity(((Activity)context0));
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    }
                    else {
                        this.mDialog = null;
                    }
                }
                finally {
                    this.mCreatingDialog = false;
                }
            }
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            return this.mDialog == null ? layoutInflater0 : layoutInflater0.cloneInContext(this.mDialog.getContext());
        }
        if(FragmentManager.isLoggingEnabled(2)) {
            if(!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + ("getting layout inflater for DialogFragment " + this));
                return layoutInflater0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + ("getting layout inflater for DialogFragment " + this));
        }
        return layoutInflater0;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            Bundle bundle1 = dialog0.onSaveInstanceState();
            bundle1.putBoolean("android:dialogShowing", false);
            bundle0.putBundle("android:savedDialogState", bundle1);
        }
        int v = this.mStyle;
        if(v != 0) {
            bundle0.putInt("android:style", v);
        }
        int v1 = this.mTheme;
        if(v1 != 0) {
            bundle0.putInt("android:theme", v1);
        }
        if(!this.mCancelable) {
            bundle0.putBoolean("android:cancelable", false);
        }
        if(!this.mShowsDialog) {
            bundle0.putBoolean("android:showsDialog", false);
        }
        int v2 = this.mBackStackId;
        if(v2 != -1) {
            bundle0.putInt("android:backStackId", v2);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            this.mViewDestroyed = false;
            dialog0.show();
            View view0 = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.set(view0, this);
            ViewTreeViewModelStoreOwner.set(view0, this);
            ViewTreeSavedStateRegistryOwner.set(view0, this);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onStop() {
        super.onStop();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.hide();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(this.mDialog != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.mDialog.onRestoreInstanceState(bundle1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        super.performCreateView(layoutInflater0, viewGroup0, bundle0);
        if(this.mView == null && this.mDialog != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.mDialog.onRestoreInstanceState(bundle1);
            }
        }
    }

    @NonNull
    public final ComponentDialog requireComponentDialog() {
        Dialog dialog0 = this.requireDialog();
        if(!(dialog0 instanceof ComponentDialog)) {
            throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialog0);
        }
        return (ComponentDialog)dialog0;
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        return dialog0;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int v, @StyleRes int v1) {
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + v + ", " + v1);
        }
        this.mStyle = v;
        if(v == 2 || v == 3) {
            this.mTheme = 0x1030059;
        }
        if(v1 != 0) {
            this.mTheme = v1;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog0, int v) {
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                Window window0 = dialog0.getWindow();
                if(window0 != null) {
                    window0.addFlags(24);
                }
                break;
            }
            default: {
                return;
            }
        }
        dialog0.requestWindowFeature(1);
    }

    public int show(@NonNull FragmentTransaction fragmentTransaction0, @Nullable String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentTransaction0.add(this, s);
        this.mViewDestroyed = false;
        int v = fragmentTransaction0.commit();
        this.mBackStackId = v;
        return v;
    }

    public void show(@NonNull FragmentManager fragmentManager0, @Nullable String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction fragmentTransaction0 = fragmentManager0.beginTransaction();
        fragmentTransaction0.setReorderingAllowed(true);
        fragmentTransaction0.add(this, s);
        fragmentTransaction0.commit();
    }

    public void showNow(@NonNull FragmentManager fragmentManager0, @Nullable String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction fragmentTransaction0 = fragmentManager0.beginTransaction();
        fragmentTransaction0.setReorderingAllowed(true);
        fragmentTransaction0.add(this, s);
        fragmentTransaction0.commitNow();
    }
}

