package com.google.android.material.chip;

import java.util.List;

public final class b implements OnCheckedStateChangeListener {
    public final OnCheckedChangeListener a;
    public final ChipGroup b;

    public b(ChipGroup chipGroup0, OnCheckedChangeListener chipGroup$OnCheckedChangeListener0) {
        this.b = chipGroup0;
        this.a = chipGroup$OnCheckedChangeListener0;
    }

    @Override  // com.google.android.material.chip.ChipGroup$OnCheckedStateChangeListener
    public final void onCheckedChanged(ChipGroup chipGroup0, List list0) {
        ChipGroup chipGroup1 = this.b;
        if(!chipGroup1.h.isSingleSelection()) {
            return;
        }
        int v = chipGroup1.getCheckedChipId();
        this.a.onCheckedChanged(chipGroup0, v);
    }
}

