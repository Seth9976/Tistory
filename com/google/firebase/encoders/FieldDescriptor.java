package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class FieldDescriptor {
    public static final class Builder {
        public final String a;
        public HashMap b;

        public Builder(String s) {
            this.b = null;
            this.a = s;
        }

        @NonNull
        public FieldDescriptor build() {
            Map map0;
            if(this.b == null) {
                map0 = Collections.emptyMap();
                return new FieldDescriptor(this.a, map0);
            }
            map0 = Collections.unmodifiableMap(new HashMap(this.b));
            return new FieldDescriptor(this.a, map0);
        }

        @NonNull
        public Builder withProperty(@NonNull Annotation annotation0) {
            if(this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation0.annotationType(), annotation0);
            return this;
        }
    }

    public final String a;
    public final Map b;

    public FieldDescriptor(String s, Map map0) {
        this.a = s;
        this.b = map0;
    }

    @NonNull
    public static Builder builder(@NonNull String s) {
        return new Builder(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FieldDescriptor ? this.a.equals(((FieldDescriptor)object0).a) && this.b.equals(((FieldDescriptor)object0).b) : false;
    }

    @NonNull
    public String getName() {
        return this.a;
    }

    @Nullable
    public Annotation getProperty(@NonNull Class class0) {
        return (Annotation)this.b.get(class0);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @NonNull
    public static FieldDescriptor of(@NonNull String s) {
        return new FieldDescriptor(s, Collections.emptyMap());
    }

    @Override
    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}

