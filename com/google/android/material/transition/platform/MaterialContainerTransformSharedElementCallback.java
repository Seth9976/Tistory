package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R.id;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View arg1);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        // 去混淆评级： 低(20)
        @Override  // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view0) {
            return view0 instanceof Shapeable ? ((Shapeable)view0).getShapeAppearanceModel() : null;
        }
    }

    public boolean a;
    public boolean b;
    public boolean c;
    public Rect d;
    public ShapeProvider e;
    public static WeakReference f;

    public MaterialContainerTransformSharedElementCallback() {
        this.a = true;
        this.b = true;
        this.c = false;
        this.e = new ShapeableViewShapeProvider();
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.e;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.b;
    }

    @Override  // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view0, @NonNull Matrix matrix0, @NonNull RectF rectF0) {
        MaterialContainerTransformSharedElementCallback.f = new WeakReference(view0);
        return super.onCaptureSharedElementSnapshot(view0, matrix0, rectF0);
    }

    @Override  // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context0, @Nullable Parcelable parcelable0) {
        View view0 = super.onCreateSnapshotView(context0, parcelable0);
        if(view0 != null) {
            WeakReference weakReference0 = MaterialContainerTransformSharedElementCallback.f;
            if(weakReference0 != null && this.e != null) {
                View view1 = (View)weakReference0.get();
                if(view1 != null) {
                    ShapeAppearanceModel shapeAppearanceModel0 = this.e.provideShape(view1);
                    if(shapeAppearanceModel0 != null) {
                        view0.setTag(id.mtrl_motion_snapshot_view, shapeAppearanceModel0);
                    }
                }
            }
        }
        return view0;
    }

    @Override  // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List list0, @NonNull Map map0) {
        if(!list0.isEmpty() && !map0.isEmpty()) {
            View view0 = (View)map0.get(list0.get(0));
            if(view0 != null) {
                Activity activity0 = ContextUtils.getActivity(view0.getContext());
                if(activity0 != null) {
                    Window window0 = activity0.getWindow();
                    if(this.a) {
                        Transition transition0 = window0.getSharedElementEnterTransition();
                        if(transition0 instanceof MaterialContainerTransform) {
                            if(!this.c) {
                                window0.setSharedElementReenterTransition(null);
                            }
                            if(this.b) {
                                if(((MaterialContainerTransform)transition0).getDuration() >= 0L) {
                                    window0.setTransitionBackgroundFadeDuration(((MaterialContainerTransform)transition0).getDuration());
                                }
                                ((MaterialContainerTransform)transition0).addListener(new i(window0, 0));
                            }
                        }
                    }
                    else {
                        Transition transition1 = window0.getSharedElementReturnTransition();
                        if(transition1 instanceof MaterialContainerTransform) {
                            ((MaterialContainerTransform)transition1).setHoldAtEndEnabled(true);
                            ((MaterialContainerTransform)transition1).addListener(new i(activity0, 2));
                            if(this.b) {
                                if(((MaterialContainerTransform)transition1).getDuration() >= 0L) {
                                    window0.setTransitionBackgroundFadeDuration(((MaterialContainerTransform)transition1).getDuration());
                                }
                                ((MaterialContainerTransform)transition1).addListener(new i(window0, 1));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List list0, @NonNull List list1, @NonNull List list2) {
        if(!list1.isEmpty() && ((View)list1.get(0)).getTag(id.mtrl_motion_snapshot_view) instanceof View) {
            ((View)list1.get(0)).setTag(id.mtrl_motion_snapshot_view, null);
        }
        if(!this.a && !list1.isEmpty()) {
            View view0 = (View)list1.get(0);
            this.d = new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
        }
        this.a = false;
    }

    @Override  // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List list0, @NonNull List list1, @NonNull List list2) {
        if(!list1.isEmpty() && !list2.isEmpty()) {
            ((View)list1.get(0)).setTag(id.mtrl_motion_snapshot_view, list2.get(0));
        }
        if(!this.a && !list1.isEmpty() && this.d != null) {
            View view0 = (View)list1.get(0);
            view0.measure(View.MeasureSpec.makeMeasureSpec(this.d.width(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.d.height(), 0x40000000));
            view0.layout(this.d.left, this.d.top, this.d.right, this.d.bottom);
        }
    }

    public void setShapeProvider(@Nullable ShapeProvider materialContainerTransformSharedElementCallback$ShapeProvider0) {
        this.e = materialContainerTransformSharedElementCallback$ShapeProvider0;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.c = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.b = z;
    }
}

