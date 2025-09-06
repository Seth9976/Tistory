package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.R.id;

public class MonthsPagerAdapter.ViewHolder extends ViewHolder {
    public final TextView c;
    public final MaterialCalendarGridView d;

    public MonthsPagerAdapter.ViewHolder(LinearLayout linearLayout0, boolean z) {
        super(linearLayout0);
        TextView textView0 = (TextView)linearLayout0.findViewById(id.month_title);
        this.c = textView0;
        ViewCompat.setAccessibilityHeading(textView0, true);
        this.d = (MaterialCalendarGridView)linearLayout0.findViewById(id.month_grid);
        if(!z) {
            textView0.setVisibility(8);
        }
    }
}

