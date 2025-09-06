package u7;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class a extends TextAppearanceFontCallback {
    public final Chip a;

    public a(Chip chip0) {
        this.a = chip0;
        super();
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrievalFailed(int v) {
    }

    @Override  // com.google.android.material.resources.TextAppearanceFontCallback
    public final void onFontRetrieved(Typeface typeface0, boolean z) {
        ChipDrawable chipDrawable0 = this.a.e;
        CharSequence charSequence0 = chipDrawable0.E0 ? chipDrawable0.getText() : this.a.getText();
        this.a.setText(charSequence0);
        this.a.requestLayout();
        this.a.invalidate();
    }
}

