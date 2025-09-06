package androidx.core.app;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public class Person {
    public static class Builder {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;

        @NonNull
        public Person build() {
            Person person0 = new Person();  // 初始化器: Ljava/lang/Object;-><init>()V
            person0.a = this.a;
            person0.b = this.b;
            person0.c = this.c;
            person0.d = this.d;
            person0.e = this.e;
            person0.f = this.f;
            return person0;
        }

        @NonNull
        public Builder setBot(boolean z) {
            this.e = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable IconCompat iconCompat0) {
            this.b = iconCompat0;
            return this;
        }

        @NonNull
        public Builder setImportant(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        public Builder setKey(@Nullable String s) {
            this.d = s;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence0) {
            this.a = charSequence0;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String s) {
            this.c = s;
            return this;
        }
    }

    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    @Override
    public boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof Person)) {
            return false;
        }
        String s = this.getKey();
        String s1 = ((Person)object0).getKey();
        return s != null || s1 != null ? Objects.equals(s, s1) : Objects.equals(Objects.toString(this.getName()), Objects.toString(((Person)object0).getName())) && Objects.equals(this.getUri(), ((Person)object0).getUri()) && Boolean.valueOf(this.isBot()).equals(Boolean.valueOf(((Person)object0).isBot())) && Boolean.valueOf(this.isImportant()).equals(Boolean.valueOf(((Person)object0).isImportant()));
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromAndroidPerson(@NonNull android.app.Person person0) {
        return v2.a(person0);
    }

    @NonNull
    public static Person fromBundle(@NonNull Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle("icon");
        Builder person$Builder0 = new Builder().setName(bundle0.getCharSequence("name"));
        return bundle1 == null ? person$Builder0.setIcon(null).setUri(bundle0.getString("uri")).setKey(bundle0.getString("key")).setBot(bundle0.getBoolean("isBot")).setImportant(bundle0.getBoolean("isImportant")).build() : person$Builder0.setIcon(IconCompat.createFromBundle(bundle1)).setUri(bundle0.getString("uri")).setKey(bundle0.getString("key")).setBot(bundle0.getBoolean("isBot")).setImportant(bundle0.getBoolean("isImportant")).build();
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Person fromPersistableBundle(@NonNull PersistableBundle persistableBundle0) {
        return u2.a(persistableBundle0);
    }

    @Nullable
    public IconCompat getIcon() {
        return this.b;
    }

    @Nullable
    public String getKey() {
        return this.d;
    }

    @Nullable
    public CharSequence getName() {
        return this.a;
    }

    @Nullable
    public String getUri() {
        return this.c;
    }

    @Override
    public int hashCode() {
        String s = this.getKey();
        return s == null ? Objects.hash(new Object[]{this.getName(), this.getUri(), Boolean.valueOf(this.isBot()), Boolean.valueOf(this.isImportant())}) : s.hashCode();
    }

    public boolean isBot() {
        return this.e;
    }

    public boolean isImportant() {
        return this.f;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public String resolveToLegacyUri() {
        String s = this.c;
        if(s != null) {
            return s;
        }
        return this.a == null ? "" : "name:" + this.a;
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
        return v2.b(this);
    }

    @NonNull
    public Builder toBuilder() {
        Builder person$Builder0 = new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        person$Builder0.a = this.a;
        person$Builder0.b = this.b;
        person$Builder0.c = this.c;
        person$Builder0.d = this.d;
        person$Builder0.e = this.e;
        person$Builder0.f = this.f;
        return person$Builder0;
    }

    @NonNull
    public Bundle toBundle() {
        Bundle bundle0 = new Bundle();
        bundle0.putCharSequence("name", this.a);
        bundle0.putBundle("icon", (this.b == null ? null : this.b.toBundle()));
        bundle0.putString("uri", this.c);
        bundle0.putString("key", this.d);
        bundle0.putBoolean("isBot", this.e);
        bundle0.putBoolean("isImportant", this.f);
        return bundle0;
    }

    @NonNull
    @RequiresApi(22)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle toPersistableBundle() {
        return u2.b(this);
    }
}

