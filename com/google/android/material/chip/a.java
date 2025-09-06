package com.google.android.material.chip;

import com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener;
import java.util.Set;

public final class a implements OnCheckedStateChangeListener {
    public final ChipGroup a;

    public a(ChipGroup chipGroup0) {
        this.a = chipGroup0;
    }

    @Override  // com.google.android.material.internal.CheckableGroup$OnCheckedStateChangeListener
    public final void onCheckedStateChanged(Set set0) {
        ChipGroup chipGroup0 = this.a;
        com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener chipGroup$OnCheckedStateChangeListener0 = chipGroup0.g;
        if(chipGroup$OnCheckedStateChangeListener0 != null) {
            chipGroup$OnCheckedStateChangeListener0.onCheckedChanged(chipGroup0, chipGroup0.h.getCheckedIdsSortedByChildOrder(chipGroup0));
        }
    }
}

