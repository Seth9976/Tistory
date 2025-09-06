package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

public final class h0 {
    public final Retrofit a;
    public final Class b;
    public final Method c;
    public final Annotation[] d;
    public final Annotation[][] e;
    public final Type[] f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public Headers t;
    public MediaType u;
    public LinkedHashSet v;
    public p0[] w;
    public boolean x;
    public static final Pattern y;
    public static final Pattern z;

    static {
        h0.y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        h0.z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    }

    public h0(Retrofit retrofit0, Class class0, Method method0) {
        this.a = retrofit0;
        this.b = class0;
        this.c = method0;
        this.d = method0.getAnnotations();
        this.f = method0.getGenericParameterTypes();
        this.e = method0.getParameterAnnotations();
    }

    public static Class a(Class class0) {
        if(Boolean.TYPE == class0) {
            return Boolean.class;
        }
        if(Byte.TYPE == class0) {
            return Byte.class;
        }
        if(Character.TYPE == class0) {
            return Character.class;
        }
        if(Double.TYPE == class0) {
            return Double.class;
        }
        if(Float.TYPE == class0) {
            return Float.class;
        }
        if(Integer.TYPE == class0) {
            return Integer.class;
        }
        if(Long.TYPE == class0) {
            return Long.class;
        }
        return Short.TYPE == class0 ? Short.class : class0;
    }

    public final void b(String s, String s1, boolean z) {
        String s2 = this.o;
        Method method0 = this.c;
        if(s2 != null) {
            throw p0.l(method0, null, "Only one HTTP method is allowed. Found: %s and %s.", new Object[]{s2, s});
        }
        this.o = s;
        this.p = z;
        if(s1.isEmpty()) {
            return;
        }
        int v = s1.indexOf(0x3F);
        Pattern pattern0 = h0.y;
        if(v != -1 && v < s1.length() - 1) {
            String s3 = s1.substring(v + 1);
            if(pattern0.matcher(s3).find()) {
                throw p0.l(method0, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", new Object[]{s3});
            }
        }
        this.s = s1;
        Matcher matcher0 = pattern0.matcher(s1);
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        while(matcher0.find()) {
            linkedHashSet0.add(matcher0.group(1));
        }
        this.v = linkedHashSet0;
    }

    public final void c(int v, Type type0) {
        if(p0.h(type0)) {
            throw p0.m(this.c, v, "Parameter type must not include a type variable or wildcard: %s", new Object[]{type0});
        }
    }
}

