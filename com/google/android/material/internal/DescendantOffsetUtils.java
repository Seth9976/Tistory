package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DescendantOffsetUtils {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
        DescendantOffsetUtils.a = new ThreadLocal();
        DescendantOffsetUtils.b = new ThreadLocal();
    }

    public static void a(ViewGroup viewGroup0, View view0, Matrix matrix0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof View && viewParent0 != viewGroup0) {
            DescendantOffsetUtils.a(viewGroup0, ((View)viewParent0), matrix0);
            matrix0.preTranslate(((float)(-((View)viewParent0).getScrollX())), ((float)(-((View)viewParent0).getScrollY())));
        }
        matrix0.preTranslate(((float)view0.getLeft()), ((float)view0.getTop()));
        if(!view0.getMatrix().isIdentity()) {
            matrix0.preConcat(view0.getMatrix());
        }
    }

    public static void getDescendantRect(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull Rect rect0) {
        rect0.set(0, 0, view0.getWidth(), view0.getHeight());
        DescendantOffsetUtils.offsetDescendantRect(viewGroup0, view0, rect0);
    }

    public static void offsetDescendantRect(@NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull Rect rect0) {
        ThreadLocal threadLocal0 = DescendantOffsetUtils.a;
        Matrix matrix0 = (Matrix)threadLocal0.get();
        if(matrix0 == null) {
            matrix0 = new Matrix();
            threadLocal0.set(matrix0);
        }
        else {
            matrix0.reset();
        }
        DescendantOffsetUtils.a(viewGroup0, view0, matrix0);
        ThreadLocal threadLocal1 = DescendantOffsetUtils.b;
        RectF rectF0 = (RectF)threadLocal1.get();
        if(rectF0 == null) {
            rectF0 = new RectF();
            threadLocal1.set(rectF0);
        }
        rectF0.set(rect0);
        matrix0.mapRect(rectF0);
        rect0.set(((int)(rectF0.left + 0.5f)), ((int)(rectF0.top + 0.5f)), ((int)(rectF0.right + 0.5f)), ((int)(rectF0.bottom + 0.5f)));
    }
}

