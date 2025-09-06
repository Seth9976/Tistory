package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;

public class DialogCompat {
    @NonNull
    public static View requireViewById(@NonNull Dialog dialog0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return (View)w.a(dialog0, v);
        }
        View view0 = dialog0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
        }
        return view0;
    }
}

