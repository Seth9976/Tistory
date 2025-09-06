package f;

import android.content.ContentResolver;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.OutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public final ContentResolver a;
    public final Uri b;
    public final Bitmap c;
    public final Bitmap.CompressFormat d;

    public a(ContentResolver contentResolver0, Bitmap.CompressFormat bitmap$CompressFormat0, Bitmap bitmap0, Uri uri0, Continuation continuation0) {
        this.a = contentResolver0;
        this.b = uri0;
        this.c = bitmap0;
        this.d = bitmap$CompressFormat0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.a, this.d, this.c, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Boolean boolean0;
        ResultKt.throwOnFailure(object0);
        OutputStream outputStream0 = this.a.openOutputStream(this.b);
        if(outputStream0 != null) {
            try {
                boolean0 = Boxing.boxBoolean(this.c.compress(this.d, 100, outputStream0));
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(outputStream0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(outputStream0, null);
            return boolean0;
        }
        return null;
    }
}

