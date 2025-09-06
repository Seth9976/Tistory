package retrofit2;

import java.lang.reflect.Method;
import jeb.synthetic.TWR;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;

public class a implements Converter {
    public final int a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;

    static {
        a.b = new a(0);
        a.c = new a(1);
        a.d = new a(2);
        a.e = new a(3);
        a.f = new a(4);
        a.g = new a(5);
    }

    public a(int v) {
        this.a = v;
        super();
    }

    public String a(Method method0, int v) {
        return "parameter #" + (v + 1);
    }

    public Object b(Method method0, Class class0, Object object0, Object[] arr_object) {
        throw new AssertionError();
    }

    public boolean c(Method method0) {
        return false;
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        switch(this.a) {
            case 0: {
                try {
                    TWR.declareResource(((ResponseBody)object0));
                    TWR.useResource$NT(((ResponseBody)object0));
                    Buffer buffer0 = new Buffer();
                    ((ResponseBody)object0).source().readAll(buffer0);
                    return ResponseBody.create(((ResponseBody)object0).contentType(), ((ResponseBody)object0).contentLength(), buffer0);
                }
                catch(Throwable throwable0) {
                    TWR.moot$NT();
                    throw throwable0;
                }
            }
            case 1: {
                return (RequestBody)object0;
            }
            case 2: {
                return (ResponseBody)object0;
            }
            case 3: {
                return object0.toString();
            }
            case 4: {
                ((ResponseBody)object0).close();
                return Unit.INSTANCE;
            }
            default: {
                ((ResponseBody)object0).close();
                return null;
            }
        }
    }
}

