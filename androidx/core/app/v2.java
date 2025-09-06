package androidx.core.app;

import android.app.Person.Builder;
import androidx.annotation.DoNotInline;
import androidx.core.graphics.drawable.IconCompat;

public abstract class v2 {
    @DoNotInline
    public static Person a(android.app.Person person0) {
        Builder person$Builder0 = new Builder().setName(person0.getName());
        return person0.getIcon() == null ? person$Builder0.setIcon(null).setUri(person0.getUri()).setKey(person0.getKey()).setBot(person0.isBot()).setImportant(person0.isImportant()).build() : person$Builder0.setIcon(IconCompat.createFromIcon(person0.getIcon())).setUri(person0.getUri()).setKey(person0.getKey()).setBot(person0.isBot()).setImportant(person0.isImportant()).build();
    }

    @DoNotInline
    public static android.app.Person b(Person person0) {
        Person.Builder person$Builder0 = new Person.Builder().setName(person0.getName());
        return person0.getIcon() == null ? person$Builder0.setIcon(null).setUri(person0.getUri()).setKey(person0.getKey()).setBot(person0.isBot()).setImportant(person0.isImportant()).build() : person$Builder0.setIcon(person0.getIcon().toIcon()).setUri(person0.getUri()).setKey(person0.getKey()).setBot(person0.isBot()).setImportant(person0.isImportant()).build();
    }
}

