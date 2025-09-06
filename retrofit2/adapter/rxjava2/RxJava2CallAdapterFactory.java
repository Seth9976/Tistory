package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter.Factory;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJava2CallAdapterFactory extends Factory {
    public final Scheduler a;
    public final boolean b;

    public RxJava2CallAdapterFactory(Scheduler scheduler0, boolean z) {
        this.a = scheduler0;
        this.b = z;
    }

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(Scheduler scheduler0) {
        if(scheduler0 == null) {
            throw new NullPointerException("scheduler == null");
        }
        return new RxJava2CallAdapterFactory(scheduler0, false);
    }

    @Override  // retrofit2.CallAdapter$Factory
    @Nullable
    public CallAdapter get(Type type0, Annotation[] arr_annotation, Retrofit retrofit0) {
        String s;
        Class class0 = Factory.getRawType(type0);
        if(class0 == Completable.class) {
            return new f(Void.class, this.a, this.b, false, true, false, false, false, true);
        }
        boolean z = class0 == Flowable.class;
        boolean z1 = class0 == Single.class;
        boolean z2 = class0 == Maybe.class;
        if(class0 != Observable.class && !z && !z1 && !z2) {
            return null;
        }
        if(!(type0 instanceof ParameterizedType)) {
            if(z) {
                s = "Flowable";
            }
            else if(z1) {
                s = "Single";
            }
            else if(z2) {
                s = "Maybe";
            }
            else {
                s = "Observable";
            }
            throw new IllegalStateException(s + " return type must be parameterized as " + s + "<Foo> or " + s + "<? extends Foo>");
        }
        Type type1 = Factory.getParameterUpperBound(0, ((ParameterizedType)type0));
        Class class1 = Factory.getRawType(type1);
        if(class1 == Response.class) {
            if(!(type1 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            return new f(Factory.getParameterUpperBound(0, ((ParameterizedType)type1)), this.a, this.b, false, false, z, z1, z2, false);
        }
        if(class1 == Result.class) {
            if(!(type1 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            return new f(Factory.getParameterUpperBound(0, ((ParameterizedType)type1)), this.a, this.b, true, false, z, z1, z2, false);
        }
        return new f(type1, this.a, this.b, false, true, z, z1, z2, false);
    }
}

