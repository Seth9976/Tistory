package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

public final class p implements Observer {
    public final DialogFragment a;

    public p(DialogFragment dialogFragment0) {
        this.a = dialogFragment0;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(((LifecycleOwner)object0) != null) {
            DialogFragment dialogFragment0 = this.a;
            if(dialogFragment0.mShowsDialog) {
                View view0 = dialogFragment0.requireView();
                if(view0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if(dialogFragment0.mDialog != null) {
                    if(FragmentManager.isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment0.mDialog);
                    }
                    dialogFragment0.mDialog.setContentView(view0);
                }
            }
        }
    }
}

