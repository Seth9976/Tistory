package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.activity.e;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuHostHelper {
    public final Runnable a;
    public final CopyOnWriteArrayList b;
    public final HashMap c;

    public MenuHostHelper(@NonNull Runnable runnable0) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable0;
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.b.add(menuProvider0);
        this.a.run();
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0) {
        this.addMenuProvider(menuProvider0);
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        HashMap hashMap0 = this.c;
        s s0 = (s)hashMap0.remove(menuProvider0);
        if(s0 != null) {
            s0.a.removeObserver(s0.b);
            s0.b = null;
        }
        hashMap0.put(menuProvider0, new s(lifecycle0, new e(1, this, menuProvider0)));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0, @NonNull State lifecycle$State0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        HashMap hashMap0 = this.c;
        s s0 = (s)hashMap0.remove(menuProvider0);
        if(s0 != null) {
            s0.a.removeObserver(s0.b);
            s0.b = null;
        }
        hashMap0.put(menuProvider0, new s(lifecycle0, new r(this, lifecycle$State0, menuProvider0, 0)));
    }

    public void onCreateMenu(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).onCreateMenu(menu0, menuInflater0);
        }
    }

    public void onMenuClosed(@NonNull Menu menu0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).onMenuClosed(menu0);
        }
    }

    public boolean onMenuItemSelected(@NonNull MenuItem menuItem0) {
        for(Object object0: this.b) {
            if(((MenuProvider)object0).onMenuItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public void onPrepareMenu(@NonNull Menu menu0) {
        for(Object object0: this.b) {
            ((MenuProvider)object0).onPrepareMenu(menu0);
        }
    }

    public void removeMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.b.remove(menuProvider0);
        s s0 = (s)this.c.remove(menuProvider0);
        if(s0 != null) {
            s0.a.removeObserver(s0.b);
            s0.b = null;
        }
        this.a.run();
    }
}

