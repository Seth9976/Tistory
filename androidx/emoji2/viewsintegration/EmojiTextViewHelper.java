package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import d4.f;
import d4.g;
import g.b;

public final class EmojiTextViewHelper {
    public final b a;

    public EmojiTextViewHelper(@NonNull TextView textView0) {
        this(textView0, true);
    }

    public EmojiTextViewHelper(@NonNull TextView textView0, boolean z) {
        Preconditions.checkNotNull(textView0, "textView cannot be null");
        if(!z) {
            this.a = new g(textView0);
            return;
        }
        this.a = new f(textView0);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] arr_inputFilter) {
        return this.a.o(arr_inputFilter);
    }

    public boolean isEnabled() {
        return this.a.r();
    }

    public void setAllCaps(boolean z) {
        this.a.C(z);
    }

    public void setEnabled(boolean z) {
        this.a.D(z);
    }

    public void updateTransformationMethod() {
        this.a.K();
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod0) {
        return this.a.L(transformationMethod0);
    }
}

