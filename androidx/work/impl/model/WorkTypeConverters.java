package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build.VERSION;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints.ContentUriTrigger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00162\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010 \u001A\u00020\u001F2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001CH\u0007¢\u0006\u0004\b \u0010!J\u001D\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C2\u0006\u0010\"\u001A\u00020\u001FH\u0007¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "Landroidx/work/WorkInfo$State;", "state", "", "stateToInt", "(Landroidx/work/WorkInfo$State;)I", "value", "intToState", "(I)Landroidx/work/WorkInfo$State;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffPolicyToInt", "(Landroidx/work/BackoffPolicy;)I", "intToBackoffPolicy", "(I)Landroidx/work/BackoffPolicy;", "Landroidx/work/NetworkType;", "networkType", "networkTypeToInt", "(Landroidx/work/NetworkType;)I", "intToNetworkType", "(I)Landroidx/work/NetworkType;", "Landroidx/work/OutOfQuotaPolicy;", "policy", "outOfQuotaPolicyToInt", "(Landroidx/work/OutOfQuotaPolicy;)I", "intToOutOfQuotaPolicy", "(I)Landroidx/work/OutOfQuotaPolicy;", "", "Landroidx/work/Constraints$ContentUriTrigger;", "triggers", "", "setOfTriggersToByteArray", "(Ljava/util/Set;)[B", "bytes", "byteArrayToSetOfTriggers", "([B)Ljava/util/Set;", "StateIds", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WorkTypeConverters {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "", "ENQUEUED", "I", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "", "COMPLETED_STATES", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        @NotNull
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        @NotNull
        public static final StateIds INSTANCE = null;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        static {
            StateIds.INSTANCE = new StateIds();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;
        public static final int[] $EnumSwitchMapping$3;

        static {
            int[] arr_v = new int[State.values().length];
            try {
                arr_v[State.ENQUEUED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.RUNNING.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.SUCCEEDED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.FAILED.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.BLOCKED.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[State.CANCELLED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[BackoffPolicy.values().length];
            try {
                arr_v1[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[BackoffPolicy.LINEAR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[NetworkType.values().length];
            try {
                arr_v2[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.CONNECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.UNMETERED.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.NOT_ROAMING.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[NetworkType.METERED.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
            int[] arr_v3 = new int[OutOfQuotaPolicy.values().length];
            try {
                arr_v3[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v3[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$3 = arr_v3;
        }
    }

    @NotNull
    public static final WorkTypeConverters INSTANCE;

    static {
        WorkTypeConverters.INSTANCE = new WorkTypeConverters();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @TypeConverter
    @JvmStatic
    public static final int backoffPolicyToInt(@NotNull BackoffPolicy backoffPolicy0) {
        Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
        switch(WhenMappings.$EnumSwitchMapping$1[backoffPolicy0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final Set byteArrayToSetOfTriggers(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        Set set0 = new LinkedHashSet();
        if(arr_b.length == 0) {
            return set0;
        }
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            try {
                ObjectInputStream objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
                try {
                    int v = objectInputStream0.readInt();
                    for(int v1 = 0; v1 < v; ++v1) {
                        Uri uri0 = Uri.parse(objectInputStream0.readUTF());
                        boolean z = objectInputStream0.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri0, "uri");
                        set0.add(new ContentUriTrigger(uri0, z));
                    }
                }
                catch(Throwable throwable1) {
                    CloseableKt.closeFinally(objectInputStream0, throwable1);
                    throw throwable1;
                }
                CloseableKt.closeFinally(objectInputStream0, null);
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(byteArrayInputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(byteArrayInputStream0, null);
        return set0;
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final BackoffPolicy intToBackoffPolicy(int v) {
        switch(v) {
            case 0: {
                return BackoffPolicy.EXPONENTIAL;
            }
            case 1: {
                return BackoffPolicy.LINEAR;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to BackoffPolicy");
            }
        }
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final NetworkType intToNetworkType(int v) {
        switch(v) {
            case 0: {
                return NetworkType.NOT_REQUIRED;
            }
            case 1: {
                return NetworkType.CONNECTED;
            }
            case 2: {
                return NetworkType.UNMETERED;
            }
            case 3: {
                return NetworkType.NOT_ROAMING;
            }
            case 4: {
                return NetworkType.METERED;
            }
            default: {
                if(Build.VERSION.SDK_INT < 30 || v != 5) {
                    throw new IllegalArgumentException("Could not convert " + v + " to NetworkType");
                }
                return NetworkType.TEMPORARILY_UNMETERED;
            }
        }
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int v) {
        switch(v) {
            case 0: {
                return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            }
            case 1: {
                return OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to OutOfQuotaPolicy");
            }
        }
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final State intToState(int v) {
        switch(v) {
            case 0: {
                return State.ENQUEUED;
            }
            case 1: {
                return State.RUNNING;
            }
            case 2: {
                return State.SUCCEEDED;
            }
            case 3: {
                return State.FAILED;
            }
            case 4: {
                return State.BLOCKED;
            }
            case 5: {
                return State.CANCELLED;
            }
            default: {
                throw new IllegalArgumentException("Could not convert " + v + " to State");
            }
        }
    }

    @TypeConverter
    @JvmStatic
    public static final int networkTypeToInt(@NotNull NetworkType networkType0) {
        int v = 2;
        Intrinsics.checkNotNullParameter(networkType0, "networkType");
        int v1 = WhenMappings.$EnumSwitchMapping$2[networkType0.ordinal()];
        int v2 = 1;
        switch(v1) {
            case 1: {
                return 0;
            label_7:
                if(v1 != 3) {
                    v = 4;
                    if(v1 == 4) {
                        return v2;
                    }
                    v2 = 5;
                    if(v1 != 5) {
                        if(Build.VERSION.SDK_INT < 30 || networkType0 != NetworkType.TEMPORARILY_UNMETERED) {
                            throw new IllegalArgumentException("Could not convert " + networkType0 + " to int");
                        }
                        return v2;
                    }
                }
                return v;
            }
            case 2: {
                return v2;
            }
            default: {
                goto label_7;
            }
        }
    }

    @TypeConverter
    @JvmStatic
    public static final int outOfQuotaPolicyToInt(@NotNull OutOfQuotaPolicy outOfQuotaPolicy0) {
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy0, "policy");
        switch(WhenMappings.$EnumSwitchMapping$3[outOfQuotaPolicy0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @TypeConverter
    @JvmStatic
    @NotNull
    public static final byte[] setOfTriggersToByteArray(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "triggers");
        if(set0.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
            try {
                objectOutputStream0.writeInt(set0.size());
                for(Object object0: set0) {
                    objectOutputStream0.writeUTF(((ContentUriTrigger)object0).getUri().toString());
                    objectOutputStream0.writeBoolean(((ContentUriTrigger)object0).isTriggeredForDescendants());
                }
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(objectOutputStream0, throwable1);
                throw throwable1;
            }
            CloseableKt.closeFinally(objectOutputStream0, null);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(byteArrayOutputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(byteArrayOutputStream0, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        Intrinsics.checkNotNullExpressionValue(arr_b, "outputStream.toByteArray()");
        return arr_b;
    }

    @TypeConverter
    @JvmStatic
    public static final int stateToInt(@NotNull State workInfo$State0) {
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        switch(WhenMappings.$EnumSwitchMapping$0[workInfo$State0.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 5;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

