package m;

import android.view.Menu;
import android.view.Window.Callback;
import androidx.annotation.DoNotInline;
import java.util.List;

public abstract class e {
    @DoNotInline
    public static void a(Window.Callback window$Callback0, List list0, Menu menu0, int v) {
        window$Callback0.onProvideKeyboardShortcuts(list0, menu0, v);
    }
}

