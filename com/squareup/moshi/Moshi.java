package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public final class Moshi {
    public static final class Builder {
        public final ArrayList a;
        public int b;

        public Builder() {
            this.a = new ArrayList();
            this.b = 0;
        }

        public Builder add(Factory jsonAdapter$Factory0) {
            if(jsonAdapter$Factory0 == null) {
                throw new IllegalArgumentException("factory == null");
            }
            int v = this.b;
            this.b = v + 1;
            this.a.add(v, jsonAdapter$Factory0);
            return this;
        }

        public Builder add(Object object0) {
            if(object0 == null) {
                throw new IllegalArgumentException("adapter == null");
            }
            return this.add(f.b(object0));
        }

        public Builder add(Type type0, JsonAdapter jsonAdapter0) {
            if(type0 == null) {
                throw new IllegalArgumentException("type == null");
            }
            if(jsonAdapter0 == null) {
                throw new IllegalArgumentException("jsonAdapter == null");
            }
            return this.add(new j0(type0, jsonAdapter0));
        }

        public Builder add(Type type0, Class class0, JsonAdapter jsonAdapter0) {
            return this.add(Moshi.a(type0, class0, jsonAdapter0));
        }

        public Builder addLast(Factory jsonAdapter$Factory0) {
            if(jsonAdapter$Factory0 == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.a.add(jsonAdapter$Factory0);
            return this;
        }

        public Builder addLast(Object object0) {
            if(object0 == null) {
                throw new IllegalArgumentException("adapter == null");
            }
            return this.addLast(f.b(object0));
        }

        public Builder addLast(Type type0, JsonAdapter jsonAdapter0) {
            if(type0 == null) {
                throw new IllegalArgumentException("type == null");
            }
            if(jsonAdapter0 == null) {
                throw new IllegalArgumentException("jsonAdapter == null");
            }
            return this.addLast(new j0(type0, jsonAdapter0));
        }

        public Builder addLast(Type type0, Class class0, JsonAdapter jsonAdapter0) {
            return this.addLast(Moshi.a(type0, class0, jsonAdapter0));
        }

        @CheckReturnValue
        public Moshi build() {
            return new Moshi(this);
        }
    }

    public final List a;
    public final int b;
    public final ThreadLocal c;
    public final LinkedHashMap d;
    public static final ArrayList e;

    static {
        ArrayList arrayList0 = new ArrayList(5);
        Moshi.e = arrayList0;
        arrayList0.add(s0.a);
        arrayList0.add(q.b);
        arrayList0.add(i0.c);
        arrayList0.add(h.c);
        arrayList0.add(n.d);
    }

    public Moshi(Builder moshi$Builder0) {
        this.c = new ThreadLocal();
        this.d = new LinkedHashMap();
        ArrayList arrayList0 = new ArrayList(Moshi.e.size() + moshi$Builder0.a.size());
        arrayList0.addAll(moshi$Builder0.a);
        arrayList0.addAll(Moshi.e);
        this.a = Collections.unmodifiableList(arrayList0);
        this.b = moshi$Builder0.b;
    }

    public static k0 a(Type type0, Class class0, JsonAdapter jsonAdapter0) {
        if(type0 == null) {
            throw new IllegalArgumentException("type == null");
        }
        if(class0 == null) {
            throw new IllegalArgumentException("annotation == null");
        }
        if(jsonAdapter0 == null) {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
        if(!class0.isAnnotationPresent(JsonQualifier.class)) {
            throw new IllegalArgumentException(class0 + " does not have @JsonQualifier");
        }
        if(class0.getDeclaredMethods().length > 0) {
            throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
        }
        return new k0(type0, class0, jsonAdapter0);
    }

    @CheckReturnValue
    public JsonAdapter adapter(Class class0) {
        return this.adapter(class0, Util.NO_ANNOTATIONS);
    }

    @CheckReturnValue
    public JsonAdapter adapter(Type type0) {
        return this.adapter(type0, Util.NO_ANNOTATIONS);
    }

    @CheckReturnValue
    public JsonAdapter adapter(Type type0, Class class0) {
        if(class0 == null) {
            throw new NullPointerException("annotationType == null");
        }
        return this.adapter(type0, Collections.singleton(Types.a(class0)));
    }

    @CheckReturnValue
    public JsonAdapter adapter(Type type0, Set set0) {
        return this.adapter(type0, set0, null);
    }

    @CheckReturnValue
    public JsonAdapter adapter(Type type0, Set set0, @Nullable String s) {
        JsonAdapter jsonAdapter3;
        JsonAdapter jsonAdapter1;
        if(type0 == null) {
            throw new NullPointerException("type == null");
        }
        if(set0 == null) {
            throw new NullPointerException("annotations == null");
        }
        Type type1 = Util.removeSubtypeWildcard(Util.canonicalize(type0));
        Type type2 = set0.isEmpty() ? type1 : Arrays.asList(new Object[]{type1, set0});
        synchronized(this.d) {
            JsonAdapter jsonAdapter0 = (JsonAdapter)this.d.get(type2);
            if(jsonAdapter0 != null) {
                return jsonAdapter0;
            }
        }
        m0 m00 = (m0)this.c.get();
        if(m00 == null) {
            m00 = new m0(this);
            this.c.set(m00);
        }
        ArrayList arrayList0 = m00.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; true; ++v2) {
            ArrayDeque arrayDeque0 = m00.b;
            if(v2 >= v1) {
                l0 l00 = new l0(type1, s, type2);
                arrayList0.add(l00);
                arrayDeque0.add(l00);
                jsonAdapter1 = null;
                break;
            }
            jsonAdapter1 = (l0)arrayList0.get(v2);
            if(jsonAdapter1.c.equals(type2)) {
                arrayDeque0.add(jsonAdapter1);
                JsonAdapter jsonAdapter2 = jsonAdapter1.d;
                if(jsonAdapter2 == null) {
                    break;
                }
                jsonAdapter1 = jsonAdapter2;
                break;
            }
        }
        if(jsonAdapter1 != null) {
            m00.b(false);
            return jsonAdapter1;
        }
        try {
            try {
                int v3 = this.a.size();
                for(int v4 = 0; true; ++v4) {
                    if(v4 >= v3) {
                        throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(type1, set0));
                    }
                    jsonAdapter3 = ((Factory)this.a.get(v4)).create(type1, set0, this);
                    if(jsonAdapter3 != null) {
                        break;
                    }
                }
                ((l0)m00.b.getLast()).d = jsonAdapter3;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw m00.a(illegalArgumentException0);
            }
        }
        catch(Throwable throwable0) {
            m00.b(false);
            throw throwable0;
        }
        m00.b(true);
        return jsonAdapter3;
    }

    @CheckReturnValue
    public JsonAdapter adapter(Type type0, Class[] arr_class) {
        if(arr_class.length == 1) {
            return this.adapter(type0, arr_class[0]);
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet(arr_class.length);
        for(int v = 0; v < arr_class.length; ++v) {
            linkedHashSet0.add(Types.a(arr_class[v]));
        }
        return this.adapter(type0, Collections.unmodifiableSet(linkedHashSet0));
    }

    @CheckReturnValue
    public Builder newBuilder() {
        int v1;
        List list0;
        Builder moshi$Builder0 = new Builder();
        for(int v = 0; true; ++v) {
            list0 = this.a;
            v1 = this.b;
            if(v >= v1) {
                break;
            }
            moshi$Builder0.add(((Factory)list0.get(v)));
        }
        int v2 = list0.size();
        int v3 = Moshi.e.size();
        while(v1 < v2 - v3) {
            moshi$Builder0.addLast(((Factory)list0.get(v1)));
            ++v1;
        }
        return moshi$Builder0;
    }

    @CheckReturnValue
    public JsonAdapter nextAdapter(Factory jsonAdapter$Factory0, Type type0, Set set0) {
        if(set0 == null) {
            throw new NullPointerException("annotations == null");
        }
        Type type1 = Util.removeSubtypeWildcard(Util.canonicalize(type0));
        List list0 = this.a;
        int v = list0.indexOf(jsonAdapter$Factory0);
        if(v == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + jsonAdapter$Factory0);
        }
        int v1 = v + 1;
        int v2 = list0.size();
        while(v1 < v2) {
            JsonAdapter jsonAdapter0 = ((Factory)list0.get(v1)).create(type1, set0, this);
            if(jsonAdapter0 != null) {
                return jsonAdapter0;
            }
            ++v1;
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + Util.typeAnnotatedWithAnnotations(type1, set0));
    }
}

