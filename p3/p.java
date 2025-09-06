package p3;

import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

public abstract class p {
    @DoNotInline
    public static void a(@NonNull TextView textView0, int v, @FloatRange(from = 0.0) float f) {
        textView0.setLineHeight(v, f);
    }
}

