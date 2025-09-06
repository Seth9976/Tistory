package androidx.databinding.adapters;

import android.widget.CalendarView.OnDateChangeListener;
import android.widget.CalendarView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import t3.a;

@RestrictTo({Scope.LIBRARY})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:date", type = CalendarView.class)})
public class CalendarViewBindingAdapter {
    @BindingAdapter({"android:date"})
    public static void setDate(CalendarView calendarView0, long v) {
        if(calendarView0.getDate() != v) {
            calendarView0.setDate(v);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void setListeners(CalendarView calendarView0, CalendarView.OnDateChangeListener calendarView$OnDateChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            calendarView0.setOnDateChangeListener(calendarView$OnDateChangeListener0);
            return;
        }
        calendarView0.setOnDateChangeListener(new a(calendarView$OnDateChangeListener0, inverseBindingListener0));
    }
}

