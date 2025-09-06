package androidx.core.app;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;

public abstract class u2 {
    @DoNotInline
    public static Person a(PersistableBundle persistableBundle0) {
        return new Builder().setName(persistableBundle0.getString("name")).setUri(persistableBundle0.getString("uri")).setKey(persistableBundle0.getString("key")).setBot(persistableBundle0.getBoolean("isBot")).setImportant(persistableBundle0.getBoolean("isImportant")).build();
    }

    @DoNotInline
    public static PersistableBundle b(Person person0) {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("name", (person0.a == null ? null : person0.a.toString()));
        persistableBundle0.putString("uri", person0.c);
        persistableBundle0.putString("key", person0.d);
        persistableBundle0.putBoolean("isBot", person0.e);
        persistableBundle0.putBoolean("isImportant", person0.f);
        return persistableBundle0;
    }
}

