package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public class ViewStructureCompat {
    public final ViewStructure a;

    public ViewStructureCompat(ViewStructure viewStructure0) {
        this.a = viewStructure0;
    }

    public void setClassName(@NonNull String s) {
        c1.a(this.a, s);
    }

    public void setContentDescription(@NonNull CharSequence charSequence0) {
        c1.b(this.a, charSequence0);
    }

    public void setDimens(int v, int v1, int v2, int v3, int v4, int v5) {
        c1.c(this.a, v, v1, v2, v3, v4, v5);
    }

    public void setText(@NonNull CharSequence charSequence0) {
        c1.d(this.a, charSequence0);
    }

    @NonNull
    @RequiresApi(23)
    public ViewStructure toViewStructure() {
        return this.a;
    }

    @NonNull
    @RequiresApi(23)
    public static ViewStructureCompat toViewStructureCompat(@NonNull ViewStructure viewStructure0) {
        return new ViewStructureCompat(viewStructure0);
    }
}

