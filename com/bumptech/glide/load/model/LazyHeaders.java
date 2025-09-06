package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class LazyHeaders implements Headers {
    public static final class Builder {
        public boolean a;
        public Map b;
        public boolean c;
        public static final Map d;

        static {
            if(!TextUtils.isEmpty("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")) {
                StringBuilder stringBuilder0 = new StringBuilder(67);
                for(int v = 0; v < 67; ++v) {
                    int v1 = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)".charAt(v);
                    if(v1 <= 0x1F && v1 != 9 || v1 >= 0x7F) {
                        stringBuilder0.append('?');
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
            HashMap hashMap0 = new HashMap(2);
            if(!TextUtils.isEmpty("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")) {
                hashMap0.put("User-Agent", Collections.singletonList(new o("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)")));
            }
            Builder.d = Collections.unmodifiableMap(hashMap0);
        }

        public Builder() {
            this.a = true;
            this.b = Builder.d;
            this.c = true;
        }

        public final void a() {
            if(this.a) {
                this.a = false;
                HashMap hashMap0 = new HashMap(this.b.size());
                for(Object object0: this.b.entrySet()) {
                    ArrayList arrayList0 = new ArrayList(((Collection)((Map.Entry)object0).getValue()));
                    hashMap0.put(((Map.Entry)object0).getKey(), arrayList0);
                }
                this.b = hashMap0;
            }
        }

        public Builder addHeader(@NonNull String s, @NonNull LazyHeaderFactory lazyHeaderFactory0) {
            if(this.c && "User-Agent".equalsIgnoreCase(s)) {
                return this.setHeader(s, lazyHeaderFactory0);
            }
            this.a();
            List list0 = (List)this.b.get(s);
            if(list0 == null) {
                list0 = new ArrayList();
                this.b.put(s, list0);
            }
            list0.add(lazyHeaderFactory0);
            return this;
        }

        public Builder addHeader(@NonNull String s, @NonNull String s1) {
            return this.addHeader(s, new o(s1));
        }

        public LazyHeaders build() {
            this.a = true;
            return new LazyHeaders(this.b);
        }

        public Builder setHeader(@NonNull String s, @Nullable LazyHeaderFactory lazyHeaderFactory0) {
            this.a();
            if(lazyHeaderFactory0 == null) {
                this.b.remove(s);
            }
            else {
                List list0 = (List)this.b.get(s);
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.b.put(s, list0);
                }
                list0.clear();
                list0.add(lazyHeaderFactory0);
            }
            if(this.c && "User-Agent".equalsIgnoreCase(s)) {
                this.c = false;
            }
            return this;
        }

        public Builder setHeader(@NonNull String s, @Nullable String s1) {
            return s1 == null ? this.setHeader(s, null) : this.setHeader(s, new o(s1));
        }
    }

    public final Map a;
    public volatile Map b;

    public LazyHeaders(Map map0) {
        this.a = Collections.unmodifiableMap(map0);
    }

    public final HashMap a() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            List list0 = (List)map$Entry0.getValue();
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = ((LazyHeaderFactory)list0.get(v1)).buildHeader();
                if(!TextUtils.isEmpty(s)) {
                    stringBuilder0.append(s);
                    if(v1 != list0.size() - 1) {
                        stringBuilder0.append(',');
                    }
                }
            }
            String s1 = stringBuilder0.toString();
            if(!TextUtils.isEmpty(s1)) {
                hashMap0.put(map$Entry0.getKey(), s1);
            }
        }
        return hashMap0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof LazyHeaders ? this.a.equals(((LazyHeaders)object0).a) : false;
    }

    @Override  // com.bumptech.glide.load.model.Headers
    public Map getHeaders() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = Collections.unmodifiableMap(this.a());
                }
            }
        }
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return "LazyHeaders{headers=" + this.a + '}';
    }
}

