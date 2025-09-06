package androidx.work;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/OneTimeWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/OneTimeWorkRequest$Builder;", "(Landroidx/work/OneTimeWorkRequest$Builder;)V", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OneTimeWorkRequest extends WorkRequest {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\n\u001A\u00020\u0002H\u0010¢\u0006\u0002\b\u000BJ\u0016\u0010\f\u001A\u00020\u00002\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000E0\u0004R\u0014\u0010\u0007\u001A\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000F"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/OneTimeWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "(Ljava/lang/Class;)V", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/OneTimeWorkRequest$Builder;", "buildInternal", "buildInternal$work_runtime_release", "setInputMerger", "inputMerger", "Landroidx/work/InputMerger;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder extends androidx.work.WorkRequest.Builder {
        public Builder(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            super(class0);
        }

        @NotNull
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if(this.getBackoffCriteriaSet$work_runtime_release() && this.getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }

        @Override  // androidx.work.WorkRequest$Builder
        public WorkRequest buildInternal$work_runtime_release() {
            return this.buildInternal$work_runtime_release();
        }

        @NotNull
        public Builder getThisObject$work_runtime_release() [...] // Inlined contents

        @Override  // androidx.work.WorkRequest$Builder
        public androidx.work.WorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setInputMerger(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "inputMerger");
            String s = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s, "inputMerger.name");
            this.getWorkSpec$work_runtime_release().inputMergerClassName = s;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00052\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\b2\u0014\u0010\t\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/work/OneTimeWorkRequest$Companion;", "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "Landroidx/work/OneTimeWorkRequest;", "from", "(Ljava/lang/Class;)Landroidx/work/OneTimeWorkRequest;", "", "workerClasses", "(Ljava/util/List;)Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOneTimeWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1549#2:110\n1620#2,3:111\n*S KotlinDebug\n*F\n+ 1 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequest$Companion\n*L\n91#1:110\n91#1:111,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final OneTimeWorkRequest from(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            return (OneTimeWorkRequest)new Builder(class0).build();
        }

        @JvmStatic
        @NotNull
        public final List from(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "workerClasses");
            List list1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                list1.add(((OneTimeWorkRequest)new Builder(((Class)object0)).build()));
            }
            return list1;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        OneTimeWorkRequest.Companion = new Companion(null);
    }

    public OneTimeWorkRequest(@NotNull Builder oneTimeWorkRequest$Builder0) {
        Intrinsics.checkNotNullParameter(oneTimeWorkRequest$Builder0, "builder");
        super(oneTimeWorkRequest$Builder0.getId$work_runtime_release(), oneTimeWorkRequest$Builder0.getWorkSpec$work_runtime_release(), oneTimeWorkRequest$Builder0.getTags$work_runtime_release());
    }

    @JvmStatic
    @NotNull
    public static final OneTimeWorkRequest from(@NotNull Class class0) {
        return OneTimeWorkRequest.Companion.from(class0);
    }

    @JvmStatic
    @NotNull
    public static final List from(@NotNull List list0) {
        return OneTimeWorkRequest.Companion.from(list0);
    }
}

