package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import java.util.Calendar;
import java.util.Locale;

public final class k0 extends Adapter {
    public final MaterialCalendar g;

    public k0(MaterialCalendar materialCalendar0) {
        this.g = materialCalendar0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.g.B.f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = this.g.B.a.c + v;
        Locale locale0 = Locale.getDefault();
        ((YearGridAdapter.ViewHolder)recyclerView$ViewHolder0).c.setText(String.format(locale0, "%d", v1));
        TextView textView0 = ((YearGridAdapter.ViewHolder)recyclerView$ViewHolder0).c;
        Context context0 = textView0.getContext();
        textView0.setContentDescription((i0.f().get(1) == v1 ? String.format(context0.getString(string.mtrl_picker_navigate_to_current_year_description), v1) : String.format(context0.getString(string.mtrl_picker_navigate_to_year_description), v1)));
        c c0 = this.g.F;
        Calendar calendar0 = i0.f();
        b b0 = calendar0.get(1) == v1 ? c0.f : c0.d;
        for(Object object0: this.g.getDateSelector().getSelectedDays()) {
            calendar0.setTimeInMillis(((long)(((Long)object0))));
            if(calendar0.get(1) == v1) {
                b0 = c0.e;
            }
        }
        b0.b(textView0, null, null);
        textView0.setOnClickListener(new j0(this, v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return new YearGridAdapter.ViewHolder(((TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_year, viewGroup0, false)));
    }
}

