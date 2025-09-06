package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

@RestrictTo({Scope.LIBRARY})
public class TableLayoutBindingAdapter {
    public static final Pattern a;

    static {
        TableLayoutBindingAdapter.a = Pattern.compile("\\s*,\\s*");
    }

    public static SparseBooleanArray a(CharSequence charSequence0) {
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        if(charSequence0 == null) {
            return sparseBooleanArray0;
        }
        String[] arr_s = TableLayoutBindingAdapter.a.split(charSequence0);
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            try {
                int v1 = Integer.parseInt(s);
                if(v1 >= 0) {
                    sparseBooleanArray0.put(v1, true);
                }
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return sparseBooleanArray0;
    }

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout0, CharSequence charSequence0) {
        SparseBooleanArray sparseBooleanArray0 = TableLayoutBindingAdapter.a(charSequence0);
        for(int v = 0; v < 20; ++v) {
            boolean z = sparseBooleanArray0.get(v, false);
            if(z != tableLayout0.isColumnCollapsed(v)) {
                tableLayout0.setColumnCollapsed(v, z);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout0, CharSequence charSequence0) {
        if(charSequence0 != null && charSequence0.length() > 0 && charSequence0.charAt(0) == 42) {
            tableLayout0.setShrinkAllColumns(true);
            return;
        }
        tableLayout0.setShrinkAllColumns(false);
        SparseBooleanArray sparseBooleanArray0 = TableLayoutBindingAdapter.a(charSequence0);
        int v1 = sparseBooleanArray0.size();
        for(int v = 0; v < v1; ++v) {
            int v2 = sparseBooleanArray0.keyAt(v);
            if(sparseBooleanArray0.valueAt(v)) {
                tableLayout0.setColumnShrinkable(v2, true);
            }
        }
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout0, CharSequence charSequence0) {
        if(charSequence0 != null && charSequence0.length() > 0 && charSequence0.charAt(0) == 42) {
            tableLayout0.setStretchAllColumns(true);
            return;
        }
        tableLayout0.setStretchAllColumns(false);
        SparseBooleanArray sparseBooleanArray0 = TableLayoutBindingAdapter.a(charSequence0);
        int v1 = sparseBooleanArray0.size();
        for(int v = 0; v < v1; ++v) {
            int v2 = sparseBooleanArray0.keyAt(v);
            if(sparseBooleanArray0.valueAt(v)) {
                tableLayout0.setColumnStretchable(v2, true);
            }
        }
    }
}

