package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

public interface Operation {
    public static abstract class State {
        public static final class FAILURE extends State {
            public final Throwable a;

            public FAILURE(@NonNull Throwable throwable0) {
                this.a = throwable0;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.a;
            }

            @Override
            @NonNull
            public String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class IN_PROGRESS extends State {
            @Override
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            @Override
            @NonNull
            public String toString() {
                return "SUCCESS";
            }
        }

    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final IN_PROGRESS IN_PROGRESS;
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final SUCCESS SUCCESS;

    static {
        Operation.SUCCESS = new SUCCESS();  // 初始化器: Ljava/lang/Object;-><init>()V
        Operation.IN_PROGRESS = new IN_PROGRESS();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NonNull
    ListenableFuture getResult();

    @NonNull
    LiveData getState();
}

