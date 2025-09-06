package m;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window.Callback;
import androidx.annotation.DoNotInline;

public abstract class d {
    @DoNotInline
    public static boolean a(Window.Callback window$Callback0, SearchEvent searchEvent0) {
        return window$Callback0.onSearchRequested(searchEvent0);
    }

    @DoNotInline
    public static ActionMode b(Window.Callback window$Callback0, ActionMode.Callback actionMode$Callback0, int v) {
        return window$Callback0.onWindowStartingActionMode(actionMode$Callback0, v);
    }
}

