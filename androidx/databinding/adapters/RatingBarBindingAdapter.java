package androidx.databinding.adapters;

import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.RatingBar;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import t3.h;

@RestrictTo({Scope.LIBRARY})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:rating", type = RatingBar.class)})
public class RatingBarBindingAdapter {
    @BindingAdapter(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void setListeners(RatingBar ratingBar0, RatingBar.OnRatingBarChangeListener ratingBar$OnRatingBarChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            ratingBar0.setOnRatingBarChangeListener(ratingBar$OnRatingBarChangeListener0);
            return;
        }
        ratingBar0.setOnRatingBarChangeListener(new h(ratingBar$OnRatingBarChangeListener0, inverseBindingListener0));
    }

    @BindingAdapter({"android:rating"})
    public static void setRating(RatingBar ratingBar0, float f) {
        if(ratingBar0.getRating() != f) {
            ratingBar0.setRating(f);
        }
    }
}

