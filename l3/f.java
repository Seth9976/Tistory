package l3;

import android.icu.util.Calendar;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Locale.Category;
import java.util.Locale;

public abstract class f {
    @DoNotInline
    public static String a(@NonNull Locale locale0) {
        return Calendar.getInstance(locale0).getType();
    }

    @DoNotInline
    public static Locale b() {
        return Locale.getDefault(Locale.Category.FORMAT);
    }
}

