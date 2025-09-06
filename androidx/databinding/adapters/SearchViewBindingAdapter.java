package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @BindingMethod(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @BindingMethod(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
public class SearchViewBindingAdapter {
    @TargetApi(11)
    public interface OnQueryTextChange {
        boolean onQueryTextChange(String arg1);
    }

    @TargetApi(11)
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String arg1);
    }

    @TargetApi(11)
    public interface OnSuggestionClick {
        boolean onSuggestionClick(int arg1);
    }

    @TargetApi(11)
    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int arg1);
    }

    @BindingAdapter(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void setOnQueryTextListener(SearchView searchView0, OnQueryTextSubmit searchViewBindingAdapter$OnQueryTextSubmit0, OnQueryTextChange searchViewBindingAdapter$OnQueryTextChange0) {
        if(searchViewBindingAdapter$OnQueryTextSubmit0 == null && searchViewBindingAdapter$OnQueryTextChange0 == null) {
            searchView0.setOnQueryTextListener(null);
            return;
        }
        searchView0.setOnQueryTextListener(new c(searchViewBindingAdapter$OnQueryTextSubmit0, searchViewBindingAdapter$OnQueryTextChange0));
    }

    @BindingAdapter(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void setOnSuggestListener(SearchView searchView0, OnSuggestionSelect searchViewBindingAdapter$OnSuggestionSelect0, OnSuggestionClick searchViewBindingAdapter$OnSuggestionClick0) {
        if(searchViewBindingAdapter$OnSuggestionSelect0 == null && searchViewBindingAdapter$OnSuggestionClick0 == null) {
            searchView0.setOnSuggestionListener(null);
            return;
        }
        searchView0.setOnSuggestionListener(new d(searchViewBindingAdapter$OnSuggestionSelect0, searchViewBindingAdapter$OnSuggestionClick0));
    }
}

