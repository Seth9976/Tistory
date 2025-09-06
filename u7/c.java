package u7;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public final class c implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final ChipGroup b;

    public c(ChipGroup chipGroup0) {
        this.b = chipGroup0;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewAdded(View view0, View view1) {
        ChipGroup chipGroup0 = this.b;
        if(view0 == chipGroup0 && view1 instanceof Chip) {
            if(view1.getId() == -1) {
                view1.setId(ViewCompat.generateViewId());
            }
            chipGroup0.h.addCheckable(((Chip)view1));
        }
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewRemoved(View view0, View view1) {
        ChipGroup chipGroup0 = this.b;
        if(view0 == chipGroup0 && view1 instanceof Chip) {
            chipGroup0.h.removeCheckable(((Chip)view1));
        }
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
        }
    }
}

