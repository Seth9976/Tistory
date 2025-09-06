package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import java.util.Calendar;

public final class b0 extends Adapter {
    public final CalendarConstraints g;
    public final DateSelector h;
    public final DayViewDecorator i;
    public final n j;
    public final int k;

    public b0(ContextThemeWrapper contextThemeWrapper0, DateSelector dateSelector0, CalendarConstraints calendarConstraints0, DayViewDecorator dayViewDecorator0, n n0) {
        y y0 = calendarConstraints0.d;
        if(calendarConstraints0.a.a(y0) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if(y0.a(calendarConstraints0.b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.k = contextThemeWrapper0.getResources().getDimensionPixelSize(dimen.mtrl_calendar_day_height) * z.g + (MaterialDatePicker.k(contextThemeWrapper0, 0x101020D) ? contextThemeWrapper0.getResources().getDimensionPixelSize(dimen.mtrl_calendar_day_height) : 0);
        this.g = calendarConstraints0;
        this.h = dateSelector0;
        this.i = dayViewDecorator0;
        this.j = n0;
        this.setHasStableIds(true);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int getItemCount() {
        return this.g.g;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long getItemId(int v) {
        Calendar calendar0 = i0.c(this.g.a.a);
        calendar0.add(2, v);
        calendar0.set(5, 1);
        Calendar calendar1 = i0.c(calendar0);
        calendar1.get(2);
        calendar1.get(1);
        calendar1.getMaximum(7);
        calendar1.getActualMaximum(5);
        calendar1.getTimeInMillis();
        return calendar1.getTimeInMillis();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        CalendarConstraints calendarConstraints0 = this.g;
        Calendar calendar0 = i0.c(calendarConstraints0.a.a);
        calendar0.add(2, v);
        y y0 = new y(calendar0);
        String s = y0.d();
        ((MonthsPagerAdapter.ViewHolder)recyclerView$ViewHolder0).c.setText(s);
        MaterialCalendarGridView materialCalendarGridView0 = (MaterialCalendarGridView)((MonthsPagerAdapter.ViewHolder)recyclerView$ViewHolder0).d.findViewById(id.month_grid);
        if(materialCalendarGridView0.a() == null || !y0.equals(materialCalendarGridView0.a().a)) {
            z z1 = new z(y0, this.h, calendarConstraints0, this.i);
            materialCalendarGridView0.setNumColumns(y0.d);
            materialCalendarGridView0.setAdapter(z1);
        }
        else {
            materialCalendarGridView0.invalidate();
            z z0 = materialCalendarGridView0.a();
            for(Object object0: z0.c) {
                z0.e(materialCalendarGridView0, ((long)(((Long)object0))));
            }
            DateSelector dateSelector0 = z0.b;
            if(dateSelector0 != null) {
                for(Object object1: dateSelector0.getSelectedDays()) {
                    z0.e(materialCalendarGridView0, ((long)(((Long)object1))));
                }
                z0.c = dateSelector0.getSelectedDays();
            }
        }
        materialCalendarGridView0.setOnItemClickListener(new a0(this, materialCalendarGridView0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(viewGroup0.getContext()).inflate(layout.mtrl_calendar_month_labeled, viewGroup0, false);
        if(MaterialDatePicker.k(viewGroup0.getContext(), 0x101020D)) {
            linearLayout0.setLayoutParams(new LayoutParams(-1, this.k));
            return new MonthsPagerAdapter.ViewHolder(linearLayout0, true);
        }
        return new MonthsPagerAdapter.ViewHolder(linearLayout0, false);
    }
}

