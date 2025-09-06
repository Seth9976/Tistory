package androidx.core.app;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class GrammaticalInflectionManagerCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }

    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED;

    @AnyThread
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static int getApplicationGrammaticalGender(@NonNull Context context0) {
        return Build.VERSION.SDK_INT < 34 ? 0 : z.a(context0);
    }

    @AnyThread
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static void setRequestedApplicationGrammaticalGender(@NonNull Context context0, int v) {
        if(Build.VERSION.SDK_INT >= 34) {
            z.b(context0, v);
        }
    }
}

