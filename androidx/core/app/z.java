package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import androidx.annotation.DoNotInline;

public abstract class z {
    @DoNotInline
    public static int a(Context context0) {
        return ((GrammaticalInflectionManager)context0.getSystemService(GrammaticalInflectionManager.class)).getApplicationGrammaticalGender();
    }

    @DoNotInline
    public static void b(Context context0, int v) {
        ((GrammaticalInflectionManager)context0.getSystemService(GrammaticalInflectionManager.class)).setRequestedApplicationGrammaticalGender(v);
    }
}

