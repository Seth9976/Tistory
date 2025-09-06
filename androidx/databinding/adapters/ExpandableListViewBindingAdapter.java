package androidx.databinding.adapters;

import android.widget.ExpandableListView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:onChildClick", method = "setOnChildClickListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupClick", method = "setOnGroupClickListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupCollapse", method = "setOnGroupCollapseListener", type = ExpandableListView.class), @BindingMethod(attribute = "android:onGroupExpand", method = "setOnGroupExpandListener", type = ExpandableListView.class)})
public class ExpandableListViewBindingAdapter {
}

