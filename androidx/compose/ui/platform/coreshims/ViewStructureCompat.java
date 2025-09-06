package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import d2.g;

@RestrictTo({Scope.LIBRARY})
public class ViewStructureCompat {
    public final ViewStructure a;

    public ViewStructureCompat(ViewStructure viewStructure0) {
        this.a = viewStructure0;
    }

    @Nullable
    public Bundle getExtras() {
        return g.a(this.a);
    }

    public void setClassName(@NonNull String s) {
        g.b(this.a, s);
    }

    public void setContentDescription(@NonNull CharSequence charSequence0) {
        g.c(this.a, charSequence0);
    }

    public void setDimens(int v, int v1, int v2, int v3, int v4, int v5) {
        g.d(this.a, v, v1, v2, v3, v4, v5);
    }

    public void setId(int v, @Nullable String s, @Nullable String s1, @Nullable String s2) {
        this.a.setId(v, s, s1, s2);
    }

    public void setText(@NonNull CharSequence charSequence0) {
        g.e(this.a, charSequence0);
    }

    public void setTextStyle(float f, int v, int v1, int v2) {
        g.f(this.a, f, v, v1, v2);
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

