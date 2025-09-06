package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public class NestedScrollingParentHelper {
    public int a;
    public int b;

    public NestedScrollingParentHelper(@NonNull ViewGroup viewGroup0) {
    }

    public int getNestedScrollAxes() {
        return this.a | this.b;
    }

    public void onNestedScrollAccepted(@NonNull View view0, @NonNull View view1, int v) {
        this.onNestedScrollAccepted(view0, view1, v, 0);
    }

    public void onNestedScrollAccepted(@NonNull View view0, @NonNull View view1, int v, int v1) {
        if(v1 == 1) {
            this.b = v;
            return;
        }
        this.a = v;
    }

    public void onStopNestedScroll(@NonNull View view0) {
        this.onStopNestedScroll(view0, 0);
    }

    public void onStopNestedScroll(@NonNull View view0, int v) {
        if(v == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }
}

