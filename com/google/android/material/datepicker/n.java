package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;

public final class n implements OnDayClickListener {
    public final MaterialCalendar a;

    public n(MaterialCalendar materialCalendar0) {
        this.a = materialCalendar0;
    }

    @Override  // com.google.android.material.datepicker.MaterialCalendar$OnDayClickListener
    public final void onDayClick(long v) {
        MaterialCalendar materialCalendar0 = this.a;
        if(materialCalendar0.B.getDateValidator().isValid(v)) {
            materialCalendar0.A.select(v);
            for(Object object0: materialCalendar0.onSelectionChangedListeners) {
                ((OnSelectionChangedListener)object0).onSelectionChanged(materialCalendar0.A.getSelection());
            }
            materialCalendar0.H.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView0 = materialCalendar0.G;
            if(recyclerView0 != null) {
                recyclerView0.getAdapter().notifyDataSetChanged();
            }
        }
    }
}

