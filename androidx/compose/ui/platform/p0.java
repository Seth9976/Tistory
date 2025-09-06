package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;

public final class p0 implements CalculateMatrixToWindow {
    public final float[] a;
    public final int[] b;

    public p0(float[] arr_f) {
        this.a = arr_f;
        this.b = new int[2];
    }

    public final void a(View view0, float[] arr_f) {
        ViewParent viewParent0 = view0.getParent();
        float[] arr_f1 = this.a;
        if(viewParent0 instanceof View) {
            this.a(((View)viewParent0), arr_f);
            AndroidComposeView_androidKt.access$preTranslate-cG2Xzmc(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()), arr_f1);
            AndroidComposeView_androidKt.access$preTranslate-cG2Xzmc(arr_f, ((float)view0.getLeft()), ((float)view0.getTop()), arr_f1);
        }
        else {
            view0.getLocationInWindow(this.b);
            AndroidComposeView_androidKt.access$preTranslate-cG2Xzmc(arr_f, -((float)view0.getScrollX()), -((float)view0.getScrollY()), arr_f1);
            AndroidComposeView_androidKt.access$preTranslate-cG2Xzmc(arr_f, ((float)this.b[0]), ((float)this.b[1]), arr_f1);
        }
        Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f1, matrix0);
            AndroidComposeView_androidKt.b(arr_f, arr_f1);
        }
    }

    @Override  // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void calculateMatrixToWindow-EL8BTi8(View view0, float[] arr_f) {
        androidx.compose.ui.graphics.Matrix.reset-impl(arr_f);
        this.a(view0, arr_f);
    }
}

