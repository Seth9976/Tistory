package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import org.jetbrains.annotations.NotNull;

public final class q0 implements CalculateMatrixToWindow {
    public final Matrix a;
    public final int[] b;

    public q0() {
        this.a = new Matrix();
        this.b = new int[2];
    }

    @Override  // androidx.compose.ui.platform.CalculateMatrixToWindow
    @DoNotInline
    public void calculateMatrixToWindow-EL8BTi8(@NotNull View view0, @NotNull float[] arr_f) {
        Matrix matrix0 = this.a;
        matrix0.reset();
        view0.transformMatrixToGlobal(matrix0);
        for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        view0.getLocationOnScreen(this.b);
        int v = this.b[0];
        int v1 = this.b[1];
        view0.getLocationInWindow(this.b);
        matrix0.postTranslate(((float)(this.b[0] - v)), ((float)(this.b[1] - v1)));
        AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
    }
}

