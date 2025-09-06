package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @BindingMethod(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @BindingMethod(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
public class AbsListViewBindingAdapter {
    public interface OnScroll {
        void onScroll(AbsListView arg1, int arg2, int arg3, int arg4);
    }

    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView arg1, int arg2);
    }

    @BindingAdapter(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(AbsListView absListView0, OnScroll absListViewBindingAdapter$OnScroll0, OnScrollStateChanged absListViewBindingAdapter$OnScrollStateChanged0) {
        absListView0.setOnScrollListener(new a(absListViewBindingAdapter$OnScrollStateChanged0, absListViewBindingAdapter$OnScroll0));
    }
}

