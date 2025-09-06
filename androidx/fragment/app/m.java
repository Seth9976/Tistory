package androidx.fragment.app;

import android.widget.ListView;

public final class m implements Runnable {
    public final int a;
    public final Object b;

    public m(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ((DialogFragment)this.b).mOnDismissListener.onDismiss(((DialogFragment)this.b).mDialog);
                return;
            }
            case 1: {
                ((SpecialEffectsController)this.b).executePendingOperations();
                return;
            }
            case 2: {
                ((FragmentManager)this.b).w(true);
                return;
            }
            default: {
                ListView listView0 = ((ListFragment)this.b).D;
                listView0.focusableViewAvailable(listView0);
            }
        }
    }
}

