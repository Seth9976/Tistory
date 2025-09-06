package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class Logger {
    public static class LogcatLogger extends Logger {
        public final int c;

        public LogcatLogger(int v) {
            super(v);
            this.c = v;
        }

        @Override  // androidx.work.Logger
        public void debug(@NonNull String s, @NonNull String s1) {
            if(this.c <= 3) {
                Log.d(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void debug(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.c <= 3) {
                Log.d(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void error(@NonNull String s, @NonNull String s1) {
            if(this.c <= 6) {
                Log.e(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void error(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.c <= 6) {
                Log.e(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void info(@NonNull String s, @NonNull String s1) {
            if(this.c <= 4) {
                Log.i(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void info(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.c <= 4) {
                Log.i(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void verbose(@NonNull String s, @NonNull String s1) {
            if(this.c <= 2) {
                Log.v(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void verbose(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.c <= 2) {
                Log.v(s, s1, throwable0);
            }
        }

        @Override  // androidx.work.Logger
        public void warning(@NonNull String s, @NonNull String s1) {
            if(this.c <= 5) {
                Log.w(s, s1);
            }
        }

        @Override  // androidx.work.Logger
        public void warning(@NonNull String s, @NonNull String s1, @NonNull Throwable throwable0) {
            if(this.c <= 5) {
                Log.w(s, s1, throwable0);
            }
        }
    }

    public static final Object a;
    public static volatile Logger b;

    static {
        Logger.a = new Object();
    }

    public Logger(int v) {
    }

    public abstract void debug(@NonNull String arg1, @NonNull String arg2);

    public abstract void debug(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public abstract void error(@NonNull String arg1, @NonNull String arg2);

    public abstract void error(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    @NonNull
    public static Logger get() {
        synchronized(Logger.a) {
            if(Logger.b == null) {
                Logger.b = new LogcatLogger(3);
            }
            return Logger.b;
        }
    }

    public abstract void info(@NonNull String arg1, @NonNull String arg2);

    public abstract void info(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public static void setLogger(@NonNull Logger logger0) {
        synchronized(Logger.a) {
            Logger.b = logger0;
        }
    }

    @NonNull
    public static String tagWithPrefix(@NonNull String s) [...] // 潜在的解密器

    public abstract void verbose(@NonNull String arg1, @NonNull String arg2);

    public abstract void verbose(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);

    public abstract void warning(@NonNull String arg1, @NonNull String arg2);

    public abstract void warning(@NonNull String arg1, @NonNull String arg2, @NonNull Throwable arg3);
}

