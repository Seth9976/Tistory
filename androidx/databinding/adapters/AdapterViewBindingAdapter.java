package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @BindingMethod(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:selectedItemPosition", type = AdapterView.class), @InverseBindingMethod(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
public class AdapterViewBindingAdapter {
    public interface OnItemSelected {
        void onItemSelected(AdapterView arg1, View arg2, int arg3, long arg4);
    }

    public static class OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {
        public final OnItemSelected a;
        public final OnNothingSelected b;
        public final InverseBindingListener c;

        public OnItemSelectedComponentListener(OnItemSelected adapterViewBindingAdapter$OnItemSelected0, OnNothingSelected adapterViewBindingAdapter$OnNothingSelected0, InverseBindingListener inverseBindingListener0) {
            this.a = adapterViewBindingAdapter$OnItemSelected0;
            this.b = adapterViewBindingAdapter$OnNothingSelected0;
            this.c = inverseBindingListener0;
        }

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
            OnItemSelected adapterViewBindingAdapter$OnItemSelected0 = this.a;
            if(adapterViewBindingAdapter$OnItemSelected0 != null) {
                adapterViewBindingAdapter$OnItemSelected0.onItemSelected(adapterView0, view0, v, v1);
            }
            InverseBindingListener inverseBindingListener0 = this.c;
            if(inverseBindingListener0 != null) {
                inverseBindingListener0.onChange();
            }
        }

        @Override  // android.widget.AdapterView$OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView0) {
            OnNothingSelected adapterViewBindingAdapter$OnNothingSelected0 = this.b;
            if(adapterViewBindingAdapter$OnNothingSelected0 != null) {
                adapterViewBindingAdapter$OnNothingSelected0.onNothingSelected(adapterView0);
            }
            InverseBindingListener inverseBindingListener0 = this.c;
            if(inverseBindingListener0 != null) {
                inverseBindingListener0.onChange();
            }
        }
    }

    public interface OnNothingSelected {
        void onNothingSelected(AdapterView arg1);
    }

    @BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void setOnItemSelectedListener(AdapterView adapterView0, OnItemSelected adapterViewBindingAdapter$OnItemSelected0, OnNothingSelected adapterViewBindingAdapter$OnNothingSelected0, InverseBindingListener inverseBindingListener0) {
        if(adapterViewBindingAdapter$OnItemSelected0 == null && adapterViewBindingAdapter$OnNothingSelected0 == null && inverseBindingListener0 == null) {
            adapterView0.setOnItemSelectedListener(null);
            return;
        }
        adapterView0.setOnItemSelectedListener(new OnItemSelectedComponentListener(adapterViewBindingAdapter$OnItemSelected0, adapterViewBindingAdapter$OnNothingSelected0, inverseBindingListener0));
    }

    @BindingAdapter({"android:selectedItemPosition"})
    public static void setSelectedItemPosition(AdapterView adapterView0, int v) {
        if(adapterView0.getSelectedItemPosition() != v) {
            adapterView0.setSelection(v);
        }
    }

    @BindingAdapter({"android:selectedItemPosition", "android:adapter"})
    public static void setSelectedItemPosition(AdapterView adapterView0, int v, Adapter adapter0) {
        if(adapter0 != adapterView0.getAdapter()) {
            adapterView0.setAdapter(adapter0);
            adapterView0.setSelection(v);
            return;
        }
        if(adapterView0.getSelectedItemPosition() != v) {
            adapterView0.setSelection(v);
        }
    }

    @BindingAdapter({"android:selection"})
    public static void setSelection(AdapterView adapterView0, int v) {
        AdapterViewBindingAdapter.setSelectedItemPosition(adapterView0, v);
    }

    @BindingAdapter({"android:selection", "android:adapter"})
    public static void setSelection(AdapterView adapterView0, int v, Adapter adapter0) {
        AdapterViewBindingAdapter.setSelectedItemPosition(adapterView0, v, adapter0);
    }
}

