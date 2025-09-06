package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.coroutines.Continuation;
import okhttp3.Call.Factory;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody.Part;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

public abstract class k0 {
    public static m a(Retrofit retrofit0, Class class0, Method method0) {
        Factory call$Factory0;
        Converter converter3;
        CallAdapter callAdapter0;
        int v14;
        boolean z7;
        int v15;
        Type type13;
        Method method3;
        p0[] arr_p02;
        int v13;
        int v12;
        Annotation[][] arr2_annotation1;
        Converter converter2;
        Method method2;
        int v10;
        int v9;
        p0[] arr_p01;
        t t0;
        p0 p00;
        Method method1;
        h0 h00 = new h0(retrofit0, class0, method0);
        Annotation[] arr_annotation = h00.d;
        for(int v = 0; true; ++v) {
            method1 = h00.c;
            if(v >= arr_annotation.length) {
                break;
            }
            Annotation annotation0 = arr_annotation[v];
            if(annotation0 instanceof DELETE) {
                h00.b("DELETE", ((DELETE)annotation0).value(), false);
            }
            else if(annotation0 instanceof GET) {
                h00.b("GET", ((GET)annotation0).value(), false);
            }
            else if(annotation0 instanceof HEAD) {
                h00.b("HEAD", ((HEAD)annotation0).value(), false);
            }
            else if(annotation0 instanceof PATCH) {
                h00.b("PATCH", ((PATCH)annotation0).value(), true);
            }
            else if(annotation0 instanceof POST) {
                h00.b("POST", ((POST)annotation0).value(), true);
            }
            else if(annotation0 instanceof PUT) {
                h00.b("PUT", ((PUT)annotation0).value(), true);
            }
            else if(annotation0 instanceof OPTIONS) {
                h00.b("OPTIONS", ((OPTIONS)annotation0).value(), false);
            }
            else if(annotation0 instanceof HTTP) {
                h00.b(((HTTP)annotation0).method(), ((HTTP)annotation0).path(), ((HTTP)annotation0).hasBody());
            }
            else if(annotation0 instanceof Headers) {
                String[] arr_s = ((Headers)annotation0).value();
                if(arr_s.length == 0) {
                    throw p0.l(method1, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean z = ((Headers)annotation0).allowUnsafeNonAsciiValues();
                Builder headers$Builder0 = new Builder();
                int v1 = arr_s.length;
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s = arr_s[v2];
                    int v3 = s.indexOf(58);
                    if(v3 == -1 || v3 == 0 || v3 == s.length() - 1) {
                        throw p0.l(method1, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[]{s});
                    }
                    String s1 = s.substring(0, v3);
                    String s2 = s.substring(v3 + 1).trim();
                    if("Content-Type".equalsIgnoreCase(s1)) {
                        try {
                            h00.u = MediaType.get(s2);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            throw p0.l(method1, illegalArgumentException0, "Malformed content type: %s", new Object[]{s2});
                        }
                    }
                    else if(z) {
                        headers$Builder0.addUnsafeNonAscii(s1, s2);
                    }
                    else {
                        headers$Builder0.add(s1, s2);
                    }
                }
                h00.t = headers$Builder0.build();
            }
            else if(annotation0 instanceof Multipart) {
                if(h00.q) {
                    throw p0.l(method1, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                h00.r = true;
            }
            else if(annotation0 instanceof FormUrlEncoded) {
                if(h00.r) {
                    throw p0.l(method1, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                h00.q = true;
            }
        }
        if(h00.o == null) {
            throw p0.l(method1, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if(!h00.p) {
            if(h00.r) {
                throw p0.l(method1, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            if(h00.q) {
                throw p0.l(method1, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
        }
        Annotation[][] arr2_annotation = h00.e;
        int v4 = arr2_annotation.length;
        h00.w = new p0[v4];
        int v5 = v4 - 1;
        int v6 = 0;
        while(v6 < v4) {
            p0[] arr_p0 = h00.w;
            Type type0 = h00.f[v6];
            Annotation[] arr_annotation1 = arr2_annotation[v6];
            if(arr_annotation1 == null) {
                arr2_annotation1 = arr2_annotation;
                v12 = v4;
                v13 = v5;
                arr_p02 = arr_p0;
                method3 = method1;
                p00 = null;
            }
            else {
                int v7 = arr_annotation1.length;
                int v8 = 0;
                p00 = null;
                while(v8 < v7) {
                    Annotation annotation1 = arr_annotation1[v8];
                    Class class1 = String.class;
                    if(annotation1 instanceof Url) {
                        h00.c(v6, type0);
                        if(h00.n) {
                            throw p0.m(method1, v6, "Multiple @Url method annotations found.", new Object[0]);
                        }
                        if(h00.j) {
                            throw p0.m(method1, v6, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        if(h00.k) {
                            throw p0.m(method1, v6, "A @Url parameter must not come after a @Query.", new Object[0]);
                        }
                        if(h00.l) {
                            throw p0.m(method1, v6, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        if(h00.m) {
                            throw p0.m(method1, v6, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                        }
                        if(h00.s != null) {
                            throw p0.m(method1, v6, "@Url cannot be used with @%s URL", new Object[]{h00.o});
                        }
                        h00.n = true;
                        if(type0 != HttpUrl.class && type0 != class1 && type0 != URI.class && (!(type0 instanceof Class) || !"android.net.Uri".equals(((Class)type0).getName()))) {
                            throw p0.m(method1, v6, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                        }
                        t0 = new x(method1, v6, 1);
                        arr_p01 = arr_p0;
                        v9 = v8;
                        v10 = v7;
                        method2 = method1;
                    }
                    else {
                        Retrofit retrofit1 = h00.a;
                        if(annotation1 instanceof Path) {
                            h00.c(v6, type0);
                            if(h00.k) {
                                throw p0.m(method1, v6, "A @Path parameter must not come after a @Query.", new Object[0]);
                            }
                            if(h00.l) {
                                throw p0.m(method1, v6, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if(h00.m) {
                                throw p0.m(method1, v6, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            if(h00.n) {
                                throw p0.m(method1, v6, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if(h00.s == null) {
                                throw p0.m(method1, v6, "@Path can only be used with relative url on @%s", new Object[]{h00.o});
                            }
                            h00.j = true;
                            String s3 = ((Path)annotation1).value();
                            if(!h0.z.matcher(s3).matches()) {
                                throw p0.m(method1, v6, "@Path parameter name must match %s. Found: %s", new Object[]{"\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}", s3});
                            }
                            if(!h00.v.contains(s3)) {
                                throw p0.m(method1, v6, "URL \"%s\" does not contain \"{%s}\".", new Object[]{h00.s, s3});
                            }
                            Converter converter0 = retrofit1.stringConverter(type0, arr_annotation1);
                            boolean z1 = ((Path)annotation1).encoded();
                            t0 = new z(h00.c, v6, s3, converter0, z1);
                            v10 = v7;
                            method2 = method1;
                            v9 = v8;
                            goto label_243;
                        }
                        else {
                            Class class2 = Iterable.class;
                            if(annotation1 instanceof Query) {
                                h00.c(v6, type0);
                                String s4 = ((Query)annotation1).value();
                                boolean z2 = ((Query)annotation1).encoded();
                                Class class3 = p0.f(type0);
                                h00.k = true;
                                if(class2.isAssignableFrom(class3)) {
                                    if(!(type0 instanceof ParameterizedType)) {
                                        throw p0.m(method1, v6, class3.getSimpleName() + " must include generic type (e.g., " + class3.getSimpleName() + "<String>)", new Object[0]);
                                    }
                                    t0 = new t(new v(s4, retrofit1.stringConverter(p0.e(0, ((ParameterizedType)type0)), arr_annotation1), z2, 2), 0);
                                }
                                else if(class3.isArray()) {
                                    t0 = new t(new v(s4, retrofit1.stringConverter(h0.a(class3.getComponentType()), arr_annotation1), z2, 2), 1);
                                }
                                else {
                                    t0 = new v(s4, retrofit1.stringConverter(type0, arr_annotation1), z2, 2);
                                }
                                method2 = method1;
                                v9 = v8;
                                v10 = v7;
                                goto label_243;
                            }
                            else if(annotation1 instanceof QueryName) {
                                h00.c(v6, type0);
                                boolean z3 = ((QueryName)annotation1).encoded();
                                Class class4 = p0.f(type0);
                                h00.l = true;
                                if(class2.isAssignableFrom(class4)) {
                                    if(!(type0 instanceof ParameterizedType)) {
                                        throw p0.m(method1, v6, class4.getSimpleName() + " must include generic type (e.g., " + class4.getSimpleName() + "<String>)", new Object[0]);
                                    }
                                    t0 = new t(new a0(retrofit1.stringConverter(p0.e(0, ((ParameterizedType)type0)), arr_annotation1), z3), 0);
                                }
                                else if(class4.isArray()) {
                                    t0 = new t(new a0(retrofit1.stringConverter(h0.a(class4.getComponentType()), arr_annotation1), z3), 1);
                                }
                                else {
                                    t0 = new a0(retrofit1.stringConverter(type0, arr_annotation1), z3);
                                }
                                method2 = method1;
                                v9 = v8;
                                v10 = v7;
                                goto label_243;
                            }
                            else {
                                Class class5 = Map.class;
                                if(annotation1 instanceof QueryMap) {
                                    h00.c(v6, type0);
                                    Class class6 = p0.f(type0);
                                    h00.m = true;
                                    if(!class5.isAssignableFrom(class6)) {
                                        throw p0.m(method1, v6, "@QueryMap parameter type must be Map.", new Object[0]);
                                    }
                                    Type type1 = p0.g(type0, class6);
                                    if(!(type1 instanceof ParameterizedType)) {
                                        throw p0.m(method1, v6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                    }
                                    Type type2 = p0.e(0, ((ParameterizedType)type1));
                                    if(class1 != type2) {
                                        throw p0.m(method1, v6, "@QueryMap keys must be of type String: " + type2, new Object[0]);
                                    }
                                    v9 = v8;
                                    v10 = v7;
                                    t0 = new w(method1, v6, retrofit1.stringConverter(p0.e(1, ((ParameterizedType)type1)), arr_annotation1), ((QueryMap)annotation1).encoded(), 2);
                                    method2 = method1;
                                    goto label_243;
                                }
                                else {
                                    method2 = method1;
                                    v9 = v8;
                                    v10 = v7;
                                    if(annotation1 instanceof Header) {
                                        h00.c(v6, type0);
                                        String s5 = ((Header)annotation1).value();
                                        Class class7 = p0.f(type0);
                                        if(class2.isAssignableFrom(class7)) {
                                            if(!(type0 instanceof ParameterizedType)) {
                                                throw p0.m(method2, v6, class7.getSimpleName() + " must include generic type (e.g., " + class7.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            t0 = new t(new v(s5, retrofit1.stringConverter(p0.e(0, ((ParameterizedType)type0)), arr_annotation1), ((Header)annotation1).allowUnsafeNonAsciiValues(), 1), 0);
                                        }
                                        else if(class7.isArray()) {
                                            t0 = new t(new v(s5, retrofit1.stringConverter(h0.a(class7.getComponentType()), arr_annotation1), ((Header)annotation1).allowUnsafeNonAsciiValues(), 1), 1);
                                        }
                                        else {
                                            t0 = new v(s5, retrofit1.stringConverter(type0, arr_annotation1), ((Header)annotation1).allowUnsafeNonAsciiValues(), 1);
                                        }
                                        goto label_243;
                                    }
                                    else if(annotation1 instanceof HeaderMap) {
                                        if(type0 == okhttp3.Headers.class) {
                                            t0 = new x(method2, v6, 0);
                                        }
                                        else {
                                            h00.c(v6, type0);
                                            Class class8 = p0.f(type0);
                                            if(!class5.isAssignableFrom(class8)) {
                                                throw p0.m(method2, v6, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                            }
                                            Type type3 = p0.g(type0, class8);
                                            if(!(type3 instanceof ParameterizedType)) {
                                                throw p0.m(method2, v6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            Type type4 = p0.e(0, ((ParameterizedType)type3));
                                            if(class1 != type4) {
                                                throw p0.m(method2, v6, "@HeaderMap keys must be of type String: " + type4, new Object[0]);
                                            }
                                            t0 = new w(method2, v6, retrofit1.stringConverter(p0.e(1, ((ParameterizedType)type3)), arr_annotation1), ((HeaderMap)annotation1).allowUnsafeNonAsciiValues(), 1);
                                        }
                                        goto label_243;
                                    }
                                    else if(annotation1 instanceof Field) {
                                        h00.c(v6, type0);
                                        if(!h00.q) {
                                            throw p0.m(method2, v6, "@Field parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        String s6 = ((Field)annotation1).value();
                                        boolean z4 = ((Field)annotation1).encoded();
                                        h00.g = true;
                                        Class class9 = p0.f(type0);
                                        if(class2.isAssignableFrom(class9)) {
                                            if(!(type0 instanceof ParameterizedType)) {
                                                throw p0.m(method2, v6, class9.getSimpleName() + " must include generic type (e.g., " + class9.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            t0 = new t(new v(s6, retrofit1.stringConverter(p0.e(0, ((ParameterizedType)type0)), arr_annotation1), z4, 0), 0);
                                        }
                                        else if(class9.isArray()) {
                                            t0 = new t(new v(s6, retrofit1.stringConverter(h0.a(class9.getComponentType()), arr_annotation1), z4, 0), 1);
                                        }
                                        else {
                                            t0 = new v(s6, retrofit1.stringConverter(type0, arr_annotation1), z4, 0);
                                        }
                                    label_243:
                                        arr_p01 = arr_p0;
                                    }
                                    else if(annotation1 instanceof FieldMap) {
                                        h00.c(v6, type0);
                                        if(!h00.q) {
                                            throw p0.m(method2, v6, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        Class class10 = p0.f(type0);
                                        if(!class5.isAssignableFrom(class10)) {
                                            throw p0.m(method2, v6, "@FieldMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type type5 = p0.g(type0, class10);
                                        if(!(type5 instanceof ParameterizedType)) {
                                            throw p0.m(method2, v6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        Type type6 = p0.e(0, ((ParameterizedType)type5));
                                        if(class1 != type6) {
                                            throw p0.m(method2, v6, "@FieldMap keys must be of type String: " + type6, new Object[0]);
                                        }
                                        Converter converter1 = retrofit1.stringConverter(p0.e(1, ((ParameterizedType)type5)), arr_annotation1);
                                        h00.g = true;
                                        t0 = new w(method2, v6, converter1, ((FieldMap)annotation1).encoded(), 0);
                                        arr_p01 = arr_p0;
                                    }
                                    else {
                                        arr_p01 = arr_p0;
                                        Class class11 = Part.class;
                                        if(annotation1 instanceof retrofit2.http.Part) {
                                            h00.c(v6, type0);
                                            if(h00.r) {
                                                h00.h = true;
                                                String s7 = ((retrofit2.http.Part)annotation1).value();
                                                Class class12 = p0.f(type0);
                                                if(s7.isEmpty()) {
                                                    b0 b00 = b0.d;
                                                    if(class2.isAssignableFrom(class12)) {
                                                        if(!(type0 instanceof ParameterizedType)) {
                                                            throw p0.m(method2, v6, class12.getSimpleName() + " must include generic type (e.g., " + class12.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if(!class11.isAssignableFrom(p0.f(p0.e(0, ((ParameterizedType)type0))))) {
                                                            throw p0.m(method2, v6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        t0 = new t(b00, 0);
                                                    }
                                                    else if(class12.isArray()) {
                                                        if(!class11.isAssignableFrom(class12.getComponentType())) {
                                                            throw p0.m(method2, v6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        t0 = new t(b00, 1);
                                                    }
                                                    else {
                                                        if(!class11.isAssignableFrom(class12)) {
                                                            throw p0.m(method2, v6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        t0 = b00;
                                                    }
                                                    goto label_355;
                                                }
                                                else {
                                                    okhttp3.Headers headers0 = okhttp3.Headers.of(new String[]{"Content-Disposition", "form-data; name=\"" + s7 + "\"", "Content-Transfer-Encoding", ((retrofit2.http.Part)annotation1).encoding()});
                                                    if(class2.isAssignableFrom(class12)) {
                                                        if(!(type0 instanceof ParameterizedType)) {
                                                            throw p0.m(method2, v6, class12.getSimpleName() + " must include generic type (e.g., " + class12.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type type7 = p0.e(0, ((ParameterizedType)type0));
                                                        if(class11.isAssignableFrom(p0.f(type7))) {
                                                            throw p0.m(method2, v6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        t0 = new t(new y(method2, v6, headers0, retrofit1.requestBodyConverter(type7, arr_annotation1, arr_annotation)), 0);
                                                        goto label_355;
                                                    }
                                                    else {
                                                        if(class12.isArray()) {
                                                            Class class13 = h0.a(class12.getComponentType());
                                                            if(!class11.isAssignableFrom(class13)) {
                                                                t0 = new t(new y(method2, v6, headers0, retrofit1.requestBodyConverter(class13, arr_annotation1, arr_annotation)), 1);
                                                                goto label_355;
                                                            }
                                                        }
                                                        else if(!class11.isAssignableFrom(class12)) {
                                                            t0 = new y(method2, v6, headers0, retrofit1.requestBodyConverter(type0, arr_annotation1, arr_annotation));
                                                            goto label_355;
                                                        }
                                                        throw p0.m(method2, v6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                }
                                            }
                                            throw p0.m(method2, v6, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        else if(annotation1 instanceof PartMap) {
                                            h00.c(v6, type0);
                                            if(!h00.r) {
                                                throw p0.m(method2, v6, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            h00.h = true;
                                            Class class14 = p0.f(type0);
                                            if(!class5.isAssignableFrom(class14)) {
                                                throw p0.m(method2, v6, "@PartMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type type8 = p0.g(type0, class14);
                                            if(!(type8 instanceof ParameterizedType)) {
                                                throw p0.m(method2, v6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            Type type9 = p0.e(0, ((ParameterizedType)type8));
                                            if(class1 != type9) {
                                                throw p0.m(method2, v6, "@PartMap keys must be of type String: " + type9, new Object[0]);
                                            }
                                            Type type10 = p0.e(1, ((ParameterizedType)type8));
                                            if(class11.isAssignableFrom(p0.f(type10))) {
                                                throw p0.m(method2, v6, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                            }
                                            t0 = new y(method2, v6, retrofit1.requestBodyConverter(type10, arr_annotation1, arr_annotation), ((PartMap)annotation1).encoding());
                                        }
                                        else if(annotation1 instanceof Body) {
                                            h00.c(v6, type0);
                                            if(h00.q || h00.r) {
                                                throw p0.m(method2, v6, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                            }
                                            if(h00.i) {
                                                throw p0.m(method2, v6, "Multiple @Body method annotations found.", new Object[0]);
                                            }
                                            try {
                                                converter2 = retrofit1.requestBodyConverter(type0, arr_annotation1, arr_annotation);
                                            }
                                            catch(RuntimeException runtimeException0) {
                                                throw p0.n(method2, runtimeException0, v6, "Unable to create @Body converter for %s", new Object[]{type0});
                                            }
                                            h00.i = true;
                                            t0 = new u(method2, v6, converter2);
                                        }
                                        else if(annotation1 instanceof Tag) {
                                            h00.c(v6, type0);
                                            Class class15 = p0.f(type0);
                                            for(int v11 = v6 - 1; v11 >= 0; --v11) {
                                                p0 p01 = h00.w[v11];
                                                if(p01 instanceof c0 && ((c0)p01).d.equals(class15)) {
                                                    throw p0.m(method2, v6, "@Tag type " + class15.getName() + " is duplicate of " + d0.b.a(method2, v11) + " and would always overwrite its value.", new Object[0]);
                                                }
                                            }
                                            t0 = new c0(class15);
                                        }
                                        else {
                                            t0 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                label_355:
                    if(t0 != null) {
                        if(p00 != null) {
                            throw p0.m(method2, v6, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        p00 = t0;
                    }
                    v8 = v9 + 1;
                    method1 = method2;
                    arr_p0 = arr_p01;
                    v7 = v10;
                }
                arr2_annotation1 = arr2_annotation;
                v12 = v4;
                v13 = v5;
                arr_p02 = arr_p0;
                method3 = method1;
            }
            if(p00 == null) {
                if(v6 == v5) {
                    try {
                        if(p0.f(type0) == Continuation.class) {
                            h00.x = true;
                            p00 = null;
                            goto label_384;
                        }
                    }
                    catch(NoClassDefFoundError unused_ex) {
                    }
                }
                throw p0.m(method3, v6, "No Retrofit annotation found.", new Object[0]);
            }
        label_384:
            arr_p02[v6] = p00;
            ++v6;
            method1 = method3;
            arr2_annotation = arr2_annotation1;
            v4 = v12;
            v5 = v13;
        }
        if(h00.s == null && !h00.n) {
            throw p0.l(method1, null, "Missing either @%s URL or @Url parameter.", new Object[]{h00.o});
        }
        boolean z5 = h00.q;
        if(!z5 && !h00.r && !h00.p && h00.i) {
            throw p0.l(method1, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
        }
        if(z5 && !h00.g) {
            throw p0.l(method1, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if(h00.r && !h00.h) {
            throw p0.l(method1, null, "Multipart method must contain at least one @Part.", new Object[0]);
        }
        i0 i00 = new i0(h00);
        Type type11 = method0.getGenericReturnType();
        if(p0.h(type11)) {
            throw p0.l(method0, null, "Method return type must not include a type variable or wildcard: %s", new Object[]{type11});
        }
        if(type11 == Void.TYPE) {
            throw p0.l(method0, null, "Service methods cannot return void.", new Object[0]);
        }
        Annotation[] arr_annotation2 = method0.getAnnotations();
        boolean z6 = i00.l;
        Class class16 = Response.class;
        if(z6) {
            Type[] arr_type = method0.getGenericParameterTypes();
            Type type12 = ((ParameterizedType)arr_type[arr_type.length - 1]).getActualTypeArguments()[0];
            if(type12 instanceof WildcardType) {
                type12 = ((WildcardType)type12).getLowerBounds()[0];
            }
            Class class17 = p0.f(type12);
            Class class18 = Call.class;
            if(class17 != class16 || !(type12 instanceof ParameterizedType)) {
                if(p0.f(type12) == class18) {
                    throw p0.l(method0, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", new Object[]{p0.e(0, ((ParameterizedType)type12))});
                }
                z7 = p0.k(type12);
                v14 = 0;
            label_422:
                type13 = new n0(null, class18, new Type[]{type12});
                if(!p0.j(arr_annotation2, SkipCallbackExecutor.class)) {
                    Annotation[] arr_annotation3 = new Annotation[arr_annotation2.length + 1];
                    arr_annotation3[0] = () -> SkipCallbackExecutor.class;
                    System.arraycopy(arr_annotation2, 0, arr_annotation3, 1, arr_annotation2.length);
                    arr_annotation2 = arr_annotation3;
                }
                v15 = v14;
            }
            else {
                type12 = p0.e(0, ((ParameterizedType)type12));
                z7 = false;
                v14 = 1;
                goto label_422;
            }
        }
        else {
            type13 = method0.getGenericReturnType();
            v15 = 0;
            z7 = false;
        }
        try {
            callAdapter0 = retrofit0.callAdapter(type13, arr_annotation2);
        }
        catch(RuntimeException runtimeException1) {
            throw p0.l(method0, runtimeException1, "Unable to create call adapter for %s", new Object[]{type13});
        }
        Type type14 = callAdapter0.responseType();
        if(type14 == okhttp3.Response.class) {
            throw p0.l(method0, null, "\'" + p0.f(type14).getName() + "\' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if(type14 == class16) {
            throw p0.l(method0, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if(i00.d.equals("HEAD") && !Void.class.equals(type14) && !p0.k(type14)) {
            throw p0.l(method0, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        Annotation[] arr_annotation4 = method0.getAnnotations();
        try {
            converter3 = retrofit0.responseBodyConverter(type14, arr_annotation4);
            call$Factory0 = retrofit0.b;
        }
        catch(RuntimeException runtimeException2) {
            throw p0.l(method0, runtimeException2, "Unable to create converter for %s", new Object[]{type14});
        }
        if(!z6) {
            return new j(i00, call$Factory0, converter3, callAdapter0);
        }
        return v15 != 0 ? new l(i00, call$Factory0, converter3, callAdapter0) : new k(i00, call$Factory0, converter3, callAdapter0, z7);
    }
}

