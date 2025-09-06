package d4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

public final class j implements TransformationMethod {
    public final TransformationMethod a;

    public j(TransformationMethod transformationMethod0) {
        this.a = transformationMethod0;
    }

    @Override  // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence0, View view0) {
        if(view0.isInEditMode()) {
            return charSequence0;
        }
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            charSequence0 = transformationMethod0.getTransformation(charSequence0, view0);
        }
        return charSequence0 == null || EmojiCompat.get().getLoadState() != 1 ? charSequence0 : EmojiCompat.get().process(charSequence0);
    }

    @Override  // android.text.method.TransformationMethod
    public final void onFocusChanged(View view0, CharSequence charSequence0, boolean z, int v, Rect rect0) {
        TransformationMethod transformationMethod0 = this.a;
        if(transformationMethod0 != null) {
            transformationMethod0.onFocusChanged(view0, charSequence0, z, v, rect0);
        }
    }
}

