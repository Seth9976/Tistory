package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Landroidx/room/OnConflictStrategy;", "", "Companion", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface OnConflictStrategy {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001A\u0010\u0006\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001A\u0010\n\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\u0004\u0012\u0004\b\u000B\u0010\bR\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Landroidx/room/OnConflictStrategy$Companion;", "", "", "NONE", "I", "REPLACE", "ROLLBACK", "getROLLBACK$annotations", "()V", "ABORT", "FAIL", "getFAIL$annotations", "IGNORE", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final int ABORT = 3;
        public static final int FAIL = 4;
        public static final int IGNORE = 5;
        public static final int NONE = 0;
        public static final int REPLACE = 1;
        public static final int ROLLBACK = 2;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Deprecated(message = "Use ABORT instead.")
        public static void getFAIL$annotations() {
        }

        @Deprecated(message = "Use ABORT instead.")
        public static void getROLLBACK$annotations() {
        }
    }

    public static final int ABORT = 3;
    @NotNull
    public static final Companion Companion = null;
    public static final int FAIL = 4;
    public static final int IGNORE = 5;
    public static final int NONE = 0;
    public static final int REPLACE = 1;
    public static final int ROLLBACK = 2;

    static {
        OnConflictStrategy.Companion = Companion.a;
    }
}

