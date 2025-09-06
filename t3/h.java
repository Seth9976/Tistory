package t3;

import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.RatingBar;
import androidx.databinding.InverseBindingListener;

public final class h implements RatingBar.OnRatingBarChangeListener {
    public final RatingBar.OnRatingBarChangeListener a;
    public final InverseBindingListener b;

    public h(RatingBar.OnRatingBarChangeListener ratingBar$OnRatingBarChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = ratingBar$OnRatingBarChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.RatingBar$OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar0, float f, boolean z) {
        RatingBar.OnRatingBarChangeListener ratingBar$OnRatingBarChangeListener0 = this.a;
        if(ratingBar$OnRatingBarChangeListener0 != null) {
            ratingBar$OnRatingBarChangeListener0.onRatingChanged(ratingBar0, f, z);
        }
        this.b.onChange();
    }
}

