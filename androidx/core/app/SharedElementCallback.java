package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback {
    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public Matrix a;

    public Parcelable onCaptureSharedElementSnapshot(View view0, Matrix matrix0, RectF rectF0) {
        Bitmap bitmap0;
        if(view0 instanceof ImageView) {
            Drawable drawable0 = ((ImageView)view0).getDrawable();
            if(drawable0 != null && ((ImageView)view0).getBackground() == null) {
                int v = drawable0.getIntrinsicWidth();
                int v1 = drawable0.getIntrinsicHeight();
                if(v <= 0 || v1 <= 0) {
                    bitmap0 = null;
                }
                else {
                    float f = Math.min(1.0f, 1048576.0f / ((float)(v * v1)));
                    if(!(drawable0 instanceof BitmapDrawable) || f != 1.0f) {
                        int v2 = (int)(((float)v) * f);
                        int v3 = (int)(((float)v1) * f);
                        Bitmap bitmap1 = Bitmap.createBitmap(v2, v3, Bitmap.Config.ARGB_8888);
                        Canvas canvas0 = new Canvas(bitmap1);
                        Rect rect0 = drawable0.getBounds();
                        int v4 = rect0.left;
                        int v5 = rect0.top;
                        int v6 = rect0.right;
                        int v7 = rect0.bottom;
                        drawable0.setBounds(0, 0, v2, v3);
                        drawable0.draw(canvas0);
                        drawable0.setBounds(v4, v5, v6, v7);
                        bitmap0 = bitmap1;
                    }
                    else {
                        bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                    }
                }
                if(bitmap0 != null) {
                    Parcelable parcelable0 = new Bundle();
                    ((Bundle)parcelable0).putParcelable("sharedElement:snapshot:bitmap", bitmap0);
                    ((BaseBundle)parcelable0).putString("sharedElement:snapshot:imageScaleType", ((ImageView)view0).getScaleType().toString());
                    if(((ImageView)view0).getScaleType() == ImageView.ScaleType.MATRIX) {
                        Matrix matrix1 = ((ImageView)view0).getImageMatrix();
                        float[] arr_f = new float[9];
                        matrix1.getValues(arr_f);
                        ((Bundle)parcelable0).putFloatArray("sharedElement:snapshot:imageMatrix", arr_f);
                    }
                    return parcelable0;
                }
            }
        }
        int v8 = Math.round(rectF0.width());
        int v9 = Math.round(rectF0.height());
        if(v8 > 0 && v9 > 0) {
            float f1 = Math.min(1.0f, 1048576.0f / ((float)(v8 * v9)));
            if(this.a == null) {
                this.a = new Matrix();
            }
            this.a.set(matrix0);
            this.a.postTranslate(-rectF0.left, -rectF0.top);
            this.a.postScale(f1, f1);
            Parcelable parcelable1 = Bitmap.createBitmap(((int)(((float)v8) * f1)), ((int)(((float)v9) * f1)), Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(((Bitmap)parcelable1));
            canvas1.concat(this.a);
            view0.draw(canvas1);
            return parcelable1;
        }
        return null;
    }

    public View onCreateSnapshotView(Context context0, Parcelable parcelable0) {
        View view0 = null;
        if(parcelable0 instanceof Bundle) {
            Bitmap bitmap0 = (Bitmap)((Bundle)parcelable0).getParcelable("sharedElement:snapshot:bitmap");
            if(bitmap0 == null) {
                return null;
            }
            view0 = new ImageView(context0);
            ((ImageView)view0).setImageBitmap(bitmap0);
            ((ImageView)view0).setScaleType(ImageView.ScaleType.valueOf(((Bundle)parcelable0).getString("sharedElement:snapshot:imageScaleType")));
            if(((ImageView)view0).getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] arr_f = ((Bundle)parcelable0).getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix0 = new Matrix();
                matrix0.setValues(arr_f);
                ((ImageView)view0).setImageMatrix(matrix0);
                return view0;
            }
        }
        else if(parcelable0 instanceof Bitmap) {
            view0 = new ImageView(context0);
            ((ImageView)view0).setImageBitmap(((Bitmap)parcelable0));
        }
        return view0;
    }

    public void onMapSharedElements(List list0, Map map0) {
    }

    public void onRejectSharedElements(List list0) {
    }

    public void onSharedElementEnd(List list0, List list1, List list2) {
    }

    public void onSharedElementStart(List list0, List list1, List list2) {
    }

    public void onSharedElementsArrived(List list0, List list1, OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener0) {
        sharedElementCallback$OnSharedElementsReadyListener0.onSharedElementsReady();
    }
}

