package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

public abstract class c0 extends Fragment {
    protected final LinkedHashSet onSelectionChangedListeners;

    public c0() {
        this.onSelectionChangedListeners = new LinkedHashSet();
    }

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener0) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener0);
    }
}

