package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component {
    public static class Builder {
        public String a;
        public final HashSet b;
        public final HashSet c;
        public int d;
        public int e;
        public ComponentFactory f;
        public final HashSet g;

        public Builder(Class class0, Class[] arr_class) {
            this.a = null;
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            Preconditions.checkNotNull(class0, "Null interface");
            hashSet0.add(class0);
            for(int v = 0; v < arr_class.length; ++v) {
                Preconditions.checkNotNull(arr_class[v], "Null interface");
            }
            Collections.addAll(this.b, arr_class);
        }

        @CanIgnoreReturnValue
        public Builder add(Dependency dependency0) {
            Preconditions.checkNotNull(dependency0, "Null dependency");
            Preconditions.checkArgument(!this.b.contains(dependency0.getInterface()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.c.add(dependency0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder alwaysEager() {
            Preconditions.checkState(this.d == 0, "Instantiation type has already been set.");
            this.d = 1;
            return this;
        }

        public Component build() {
            Preconditions.checkState(this.f != null, "Missing required property: factory.");
            return new Component(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        @CanIgnoreReturnValue
        public Builder eagerInDefaultApp() {
            Preconditions.checkState(this.d == 0, "Instantiation type has already been set.");
            this.d = 2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder factory(ComponentFactory componentFactory0) {
            this.f = (ComponentFactory)Preconditions.checkNotNull(componentFactory0, "Null factory");
            return this;
        }

        public Builder name(@NonNull String s) {
            this.a = s;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder publishes(Class class0) {
            this.g.add(class0);
            return this;
        }
    }

    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ComponentFactory f;
    public final Set g;

    public Component(String s, Set set0, Set set1, int v, int v1, ComponentFactory componentFactory0, Set set2) {
        this.a = s;
        this.b = Collections.unmodifiableSet(set0);
        this.c = Collections.unmodifiableSet(set1);
        this.d = v;
        this.e = v1;
        this.f = componentFactory0;
        this.g = Collections.unmodifiableSet(set2);
    }

    public static Builder builder(Class class0) {
        return new Builder(class0, new Class[0]);
    }

    @SafeVarargs
    public static Builder builder(Class class0, Class[] arr_class) {
        return new Builder(class0, arr_class);
    }

    public Set getDependencies() {
        return this.c;
    }

    public ComponentFactory getFactory() {
        return this.f;
    }

    @Nullable
    public String getName() {
        return this.a;
    }

    public Set getProvidedInterfaces() {
        return this.b;
    }

    public Set getPublishedEvents() {
        return this.g;
    }

    public static Component intoSet(Object object0, Class class0) {
        return Component.intoSetBuilder(class0).factory(new a(object0, 0)).build();
    }

    public static Builder intoSetBuilder(Class class0) {
        Builder component$Builder0 = Component.builder(class0);
        component$Builder0.e = 1;
        return component$Builder0;
    }

    public boolean isAlwaysEager() {
        return this.d == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.d == 2;
    }

    public boolean isLazy() {
        return this.d == 0;
    }

    public boolean isValue() {
        return this.e == 0;
    }

    @Deprecated
    public static Component of(Class class0, Object object0) {
        return Component.builder(class0).factory(new a(object0, 0)).build();
    }

    @SafeVarargs
    public static Component of(Object object0, Class class0, Class[] arr_class) {
        return Component.builder(class0, arr_class).factory(new a(object0, 0)).build();
    }

    @Override
    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    public Component withFactory(ComponentFactory componentFactory0) {
        return new Component(this.a, this.b, this.c, this.d, this.e, componentFactory0, this.g);
    }
}

