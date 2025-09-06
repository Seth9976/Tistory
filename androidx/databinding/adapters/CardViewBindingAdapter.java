package androidx.databinding.adapters;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.cardview.widget.CardView;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @BindingMethod(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @BindingMethod(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @BindingMethod(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
public class CardViewBindingAdapter {
    @BindingAdapter({"contentPadding"})
    public static void setContentPadding(CardView cardView0, int v) {
        cardView0.setContentPadding(v, v, v, v);
    }

    @BindingAdapter({"contentPaddingBottom"})
    public static void setContentPaddingBottom(CardView cardView0, int v) {
        cardView0.setContentPadding(cardView0.getContentPaddingLeft(), cardView0.getContentPaddingTop(), cardView0.getContentPaddingRight(), v);
    }

    @BindingAdapter({"contentPaddingLeft"})
    public static void setContentPaddingLeft(CardView cardView0, int v) {
        cardView0.setContentPadding(v, cardView0.getContentPaddingTop(), cardView0.getContentPaddingRight(), cardView0.getContentPaddingBottom());
    }

    @BindingAdapter({"contentPaddingRight"})
    public static void setContentPaddingRight(CardView cardView0, int v) {
        cardView0.setContentPadding(cardView0.getContentPaddingLeft(), cardView0.getContentPaddingTop(), v, cardView0.getContentPaddingBottom());
    }

    @BindingAdapter({"contentPaddingTop"})
    public static void setContentPaddingTop(CardView cardView0, int v) {
        cardView0.setContentPadding(cardView0.getContentPaddingLeft(), v, cardView0.getContentPaddingRight(), cardView0.getContentPaddingBottom());
    }
}

