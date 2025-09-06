package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.animator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import java.util.HashMap;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap w;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public FabTransformationSpec onCreateMotionSpec(Context context0, boolean z) {
        int v = z ? animator.mtrl_fab_transformation_sheet_expand_spec : animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationSpec fabTransformationBehavior$FabTransformationSpec0 = new FabTransformationSpec();
        fabTransformationBehavior$FabTransformationSpec0.timings = MotionSpec.createFromResource(context0, v);
        fabTransformationBehavior$FabTransformationSpec0.positioning = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationBehavior$FabTransformationSpec0;
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @CallSuper
    public boolean onExpandedStateChange(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        ViewParent viewParent0 = view1.getParent();
        if(viewParent0 instanceof CoordinatorLayout) {
            int v = ((CoordinatorLayout)viewParent0).getChildCount();
            if(z) {
                this.w = new HashMap(v);
            }
            for(int v1 = 0; v1 < v; ++v1) {
                View view2 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
                if(view2 != view1 && (!(view2.getLayoutParams() instanceof LayoutParams) || !(((LayoutParams)view2.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior))) {
                    if(z) {
                        this.w.put(view2, view2.getImportantForAccessibility());
                        ViewCompat.setImportantForAccessibility(view2, 4);
                    }
                    else if(this.w != null && this.w.containsKey(view2)) {
                        ViewCompat.setImportantForAccessibility(view2, ((int)(((Integer)this.w.get(view2)))));
                    }
                }
            }
            if(!z) {
                this.w = null;
            }
        }
        return super.onExpandedStateChange(view0, view1, z, z1);
    }
}

