package m3;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import androidx.core.util.SizeFCompat;

public abstract class e {
    @DoNotInline
    @NonNull
    public static SizeF a(@NonNull SizeFCompat sizeFCompat0) {
        Preconditions.checkNotNull(sizeFCompat0);
        return new SizeF(sizeFCompat0.getWidth(), sizeFCompat0.getHeight());
    }

    @DoNotInline
    @NonNull
    public static SizeFCompat b(@NonNull SizeF sizeF0) {
        Preconditions.checkNotNull(sizeF0);
        return new SizeFCompat(sizeF0.getWidth(), sizeF0.getHeight());
    }
}

