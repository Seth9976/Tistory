package b5;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName;
import kotlin.jvm.internal.Intrinsics;

public final class d extends RuntimeException {
    public final FrameworkSQLiteOpenHelper.OpenHelper.CallbackName a;
    public final Throwable b;

    public d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName0, Throwable throwable0) {
        Intrinsics.checkNotNullParameter(frameworkSQLiteOpenHelper$OpenHelper$CallbackName0, "callbackName");
        Intrinsics.checkNotNullParameter(throwable0, "cause");
        super(throwable0);
        this.a = frameworkSQLiteOpenHelper$OpenHelper$CallbackName0;
        this.b = throwable0;
    }

    @Override
    public final Throwable getCause() {
        return this.b;
    }
}

