package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import jeb.synthetic.FIN;
import okhttp3.Call.Factory;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

public final class Retrofit {
    public static final class Builder {
        public Factory a;
        public HttpUrl b;
        public final ArrayList c;
        public final ArrayList d;
        public Executor e;
        public boolean f;

        public Builder() {
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public Builder(Retrofit retrofit0) {
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.a = retrofit0.b;
            this.b = retrofit0.c;
            List list0 = retrofit0.d;
            int v = list0.size() - retrofit0.e;
            for(int v1 = 1; v1 < v; ++v1) {
                retrofit2.Converter.Factory converter$Factory0 = (retrofit2.Converter.Factory)list0.get(v1);
                this.c.add(converter$Factory0);
            }
            List list1 = retrofit0.f;
            int v2 = list1.size() - retrofit0.g;
            for(int v3 = 0; v3 < v2; ++v3) {
                retrofit2.CallAdapter.Factory callAdapter$Factory0 = (retrofit2.CallAdapter.Factory)list1.get(v3);
                this.d.add(callAdapter$Factory0);
            }
            this.e = retrofit0.h;
            this.f = retrofit0.i;
        }

        public Builder addCallAdapterFactory(retrofit2.CallAdapter.Factory callAdapter$Factory0) {
            Objects.requireNonNull(callAdapter$Factory0, "factory == null");
            this.d.add(callAdapter$Factory0);
            return this;
        }

        public Builder addConverterFactory(retrofit2.Converter.Factory converter$Factory0) {
            Objects.requireNonNull(converter$Factory0, "factory == null");
            this.c.add(converter$Factory0);
            return this;
        }

        public Builder baseUrl(String s) {
            Objects.requireNonNull(s, "baseUrl == null");
            return this.baseUrl(HttpUrl.get(s));
        }

        public Builder baseUrl(URL uRL0) {
            Objects.requireNonNull(uRL0, "baseUrl == null");
            return this.baseUrl(HttpUrl.get(uRL0.toString()));
        }

        public Builder baseUrl(HttpUrl httpUrl0) {
            Objects.requireNonNull(httpUrl0, "baseUrl == null");
            List list0 = httpUrl0.pathSegments();
            if(!"".equals(list0.get(list0.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl0);
            }
            this.b = httpUrl0;
            return this;
        }

        public Retrofit build() {
            if(this.b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Factory call$Factory0 = this.a;
            if(call$Factory0 == null) {
                call$Factory0 = new OkHttpClient();
            }
            Executor executor0 = this.e;
            if(executor0 == null) {
                executor0 = d0.a;
            }
            ArrayList arrayList0 = new ArrayList(this.d);
            List list0 = d0.c.a(executor0);
            arrayList0.addAll(list0);
            List list1 = d0.c.b();
            int v = list1.size();
            ArrayList arrayList1 = new ArrayList(this.c.size() + 1 + v);
            arrayList1.add(new b());  // 初始化器: Lretrofit2/Converter$Factory;-><init>()V
            arrayList1.addAll(this.c);
            arrayList1.addAll(list1);
            return new Retrofit(call$Factory0, this.b, Collections.unmodifiableList(arrayList1), v, Collections.unmodifiableList(arrayList0), list0.size(), executor0, this.f);
        }

        public List callAdapterFactories() {
            return this.d;
        }

        public Builder callFactory(Factory call$Factory0) {
            Objects.requireNonNull(call$Factory0, "factory == null");
            this.a = call$Factory0;
            return this;
        }

        public Builder callbackExecutor(Executor executor0) {
            Objects.requireNonNull(executor0, "executor == null");
            this.e = executor0;
            return this;
        }

        public Builder client(OkHttpClient okHttpClient0) {
            Objects.requireNonNull(okHttpClient0, "client == null");
            return this.callFactory(okHttpClient0);
        }

        public List converterFactories() {
            return this.c;
        }

        public Builder validateEagerly(boolean z) {
            this.f = z;
            return this;
        }
    }

    public final ConcurrentHashMap a;
    public final Factory b;
    public final HttpUrl c;
    public final List d;
    public final int e;
    public final List f;
    public final int g;
    public final Executor h;
    public final boolean i;

    public Retrofit(Factory call$Factory0, HttpUrl httpUrl0, List list0, int v, List list1, int v1, Executor executor0, boolean z) {
        this.a = new ConcurrentHashMap();
        this.b = call$Factory0;
        this.c = httpUrl0;
        this.d = list0;
        this.e = v;
        this.f = list1;
        this.g = v1;
        this.h = executor0;
        this.i = z;
    }

    public final k0 a(Class class0, Method method0) {
        Object object2;
        int v1;
        k0 k00;
        while(true) {
            Object object0 = this.a.get(method0);
            if(object0 instanceof k0) {
                return (k0)object0;
            }
            if(object0 == null) {
                Object object1 = new Object();
                synchronized(object1) {
                    object0 = this.a.putIfAbsent(method0, object1);
                    if(object0 == null) {
                        try {
                            k00 = k0.a(this, class0, method0);
                        }
                        catch(Throwable throwable0) {
                            this.a.remove(method0);
                            throw throwable0;
                        }
                        this.a.put(method0, k00);
                        return k00;
                    }
                }
            }
            synchronized(object0) {
                v1 = FIN.finallyOpen$NT();
                object2 = this.a.get(method0);
                if(object2 != null) {
                    break;
                }
                FIN.finallyCodeBegin$NT(v1);
            }
            FIN.finallyCodeEnd$NT(v1);
        }
        FIN.finallyExec$NT(v1);
        return (k0)object2;
    }

    public HttpUrl baseUrl() {
        return this.c;
    }

    public CallAdapter callAdapter(Type type0, Annotation[] arr_annotation) {
        return this.nextCallAdapter(null, type0, arr_annotation);
    }

    public List callAdapterFactories() {
        return this.f;
    }

    public Factory callFactory() {
        return this.b;
    }

    @Nullable
    public Executor callbackExecutor() {
        return this.h;
    }

    public List converterFactories() {
        return this.d;
    }

    public Object create(Class class0) {
        if(!class0.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque0 = new ArrayDeque(1);
        arrayDeque0.add(class0);
        while(!arrayDeque0.isEmpty()) {
            Class class1 = (Class)arrayDeque0.removeFirst();
            if(class1.getTypeParameters().length != 0) {
                StringBuilder stringBuilder0 = new StringBuilder("Type parameters are unsupported on ");
                stringBuilder0.append(class1.getName());
                if(class1 != class0) {
                    stringBuilder0.append(" which is an interface of ");
                    stringBuilder0.append(class0.getName());
                }
                throw new IllegalArgumentException(stringBuilder0.toString());
            }
            Collections.addAll(arrayDeque0, class1.getInterfaces());
        }
        if(this.i) {
            a a0 = d0.b;
            Method[] arr_method = class0.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(!a0.c(method0) && !Modifier.isStatic(method0.getModifiers()) && !method0.isSynthetic()) {
                    this.a(class0, method0);
                }
            }
        }
        j0 j00 = new j0(this, class0);
        return Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, j00);
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public CallAdapter nextCallAdapter(@Nullable retrofit2.CallAdapter.Factory callAdapter$Factory0, Type type0, Annotation[] arr_annotation) {
        Objects.requireNonNull(type0, "returnType == null");
        Objects.requireNonNull(arr_annotation, "annotations == null");
        List list0 = this.f;
        int v = list0.indexOf(callAdapter$Factory0) + 1;
        int v1 = list0.size();
        for(int v2 = v; v2 < v1; ++v2) {
            CallAdapter callAdapter0 = ((retrofit2.CallAdapter.Factory)list0.get(v2)).get(type0, arr_annotation, this);
            if(callAdapter0 != null) {
                return callAdapter0;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Could not locate call adapter for ");
        stringBuilder0.append(type0);
        stringBuilder0.append(".\n");
        if(callAdapter$Factory0 != null) {
            stringBuilder0.append("  Skipped:");
            for(int v3 = 0; v3 < v; ++v3) {
                stringBuilder0.append("\n   * ");
                stringBuilder0.append(((retrofit2.CallAdapter.Factory)list0.get(v3)).getClass().getName());
            }
            stringBuilder0.append('\n');
        }
        stringBuilder0.append("  Tried:");
        int v4 = list0.size();
        while(v < v4) {
            stringBuilder0.append("\n   * ");
            stringBuilder0.append(((retrofit2.CallAdapter.Factory)list0.get(v)).getClass().getName());
            ++v;
        }
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public Converter nextRequestBodyConverter(@Nullable retrofit2.Converter.Factory converter$Factory0, Type type0, Annotation[] arr_annotation, Annotation[] arr_annotation1) {
        Objects.requireNonNull(type0, "type == null");
        Objects.requireNonNull(arr_annotation, "parameterAnnotations == null");
        Objects.requireNonNull(arr_annotation1, "methodAnnotations == null");
        List list0 = this.d;
        int v = list0.indexOf(converter$Factory0) + 1;
        int v1 = list0.size();
        for(int v2 = v; v2 < v1; ++v2) {
            Converter converter0 = ((retrofit2.Converter.Factory)list0.get(v2)).requestBodyConverter(type0, arr_annotation, arr_annotation1, this);
            if(converter0 != null) {
                return converter0;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Could not locate RequestBody converter for ");
        stringBuilder0.append(type0);
        stringBuilder0.append(".\n");
        if(converter$Factory0 != null) {
            stringBuilder0.append("  Skipped:");
            for(int v3 = 0; v3 < v; ++v3) {
                stringBuilder0.append("\n   * ");
                stringBuilder0.append(((retrofit2.Converter.Factory)list0.get(v3)).getClass().getName());
            }
            stringBuilder0.append('\n');
        }
        stringBuilder0.append("  Tried:");
        int v4 = list0.size();
        while(v < v4) {
            stringBuilder0.append("\n   * ");
            stringBuilder0.append(((retrofit2.Converter.Factory)list0.get(v)).getClass().getName());
            ++v;
        }
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public Converter nextResponseBodyConverter(@Nullable retrofit2.Converter.Factory converter$Factory0, Type type0, Annotation[] arr_annotation) {
        Objects.requireNonNull(type0, "type == null");
        Objects.requireNonNull(arr_annotation, "annotations == null");
        List list0 = this.d;
        int v = list0.indexOf(converter$Factory0) + 1;
        int v1 = list0.size();
        for(int v2 = v; v2 < v1; ++v2) {
            Converter converter0 = ((retrofit2.Converter.Factory)list0.get(v2)).responseBodyConverter(type0, arr_annotation, this);
            if(converter0 != null) {
                return converter0;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Could not locate ResponseBody converter for ");
        stringBuilder0.append(type0);
        stringBuilder0.append(".\n");
        if(converter$Factory0 != null) {
            stringBuilder0.append("  Skipped:");
            for(int v3 = 0; v3 < v; ++v3) {
                stringBuilder0.append("\n   * ");
                stringBuilder0.append(((retrofit2.Converter.Factory)list0.get(v3)).getClass().getName());
            }
            stringBuilder0.append('\n');
        }
        stringBuilder0.append("  Tried:");
        int v4 = list0.size();
        while(v < v4) {
            stringBuilder0.append("\n   * ");
            stringBuilder0.append(((retrofit2.Converter.Factory)list0.get(v)).getClass().getName());
            ++v;
        }
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public Converter requestBodyConverter(Type type0, Annotation[] arr_annotation, Annotation[] arr_annotation1) {
        return this.nextRequestBodyConverter(null, type0, arr_annotation, arr_annotation1);
    }

    public Converter responseBodyConverter(Type type0, Annotation[] arr_annotation) {
        return this.nextResponseBodyConverter(null, type0, arr_annotation);
    }

    public Converter stringConverter(Type type0, Annotation[] arr_annotation) {
        Objects.requireNonNull(type0, "type == null");
        Objects.requireNonNull(arr_annotation, "annotations == null");
        List list0 = this.d;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Converter converter0 = ((retrofit2.Converter.Factory)list0.get(v1)).stringConverter(type0, arr_annotation, this);
            if(converter0 != null) {
                return converter0;
            }
        }
        return a.e;
    }
}

