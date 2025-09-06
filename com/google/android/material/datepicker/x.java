package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;

public final class x extends OnSelectionChangedListener {
    public final int a;
    public final Fragment b;

    public x(Fragment fragment0, int v) {
        this.a = v;
        this.b = fragment0;
        super();
    }

    @Override  // com.google.android.material.datepicker.OnSelectionChangedListener
    public final void onIncompleteSelectionChanged() {
        if(this.a != 0) {
            ((MaterialDatePicker)this.b).Z.setEnabled(false);
            return;
        }
        for(Object object0: ((MaterialTextInputPicker)this.b).onSelectionChangedListeners) {
            ((OnSelectionChangedListener)object0).onIncompleteSelectionChanged();
        }
    }

    @Override  // com.google.android.material.datepicker.OnSelectionChangedListener
    public final void onSelectionChanged(Object object0) {
        if(this.a != 0) {
            String s = ((MaterialDatePicker)this.b).getHeaderText();
            ((MaterialDatePicker)this.b).W.setContentDescription(((MaterialDatePicker)this.b).i().getSelectionContentDescription(((MaterialDatePicker)this.b).requireContext()));
            ((MaterialDatePicker)this.b).W.setText(s);
            ((MaterialDatePicker)this.b).Z.setEnabled(((MaterialDatePicker)this.b).i().isSelectionComplete());
            return;
        }
        for(Object object1: ((MaterialTextInputPicker)this.b).onSelectionChangedListeners) {
            ((OnSelectionChangedListener)object1).onSelectionChanged(object0);
        }
    }
}

