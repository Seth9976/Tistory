package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0003ONPB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000B\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0017\u0010\u000E\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\f\u0010\b\u001A\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001A\u001A\u00020\u00158\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010&\u001A\u00020!8\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001F\u0010-\u001A\n\u0012\u0004\u0012\u00020(\u0018\u00010\'8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001F\u00100\u001A\n\u0012\u0004\u0012\u00020(\u0018\u00010\'8\u0006\u00A2\u0006\f\n\u0004\b.\u0010*\u001A\u0004\b/\u0010,R\u0019\u00106\u001A\u0004\u0018\u0001018\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u0017\u0010<\u001A\u0002078G\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u0017\u0010?\u001A\u0002078\u0006\u00A2\u0006\f\n\u0004\b=\u00109\u001A\u0004\b>\u0010;R\u0017\u0010B\u001A\u0002078\u0006\u00A2\u0006\f\n\u0004\b@\u00109\u001A\u0004\bA\u0010;R\u0017\u0010E\u001A\u0002078\u0006\u00A2\u0006\f\n\u0004\bC\u00109\u001A\u0004\bD\u0010;R\u0017\u0010H\u001A\u0002078G\u00A2\u0006\f\n\u0004\bF\u00109\u001A\u0004\bG\u0010;R\u0017\u0010L\u001A\u00020I8G\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\u00A8\u0006Q"}, d2 = {"Landroidx/work/Configuration;", "", "Landroidx/work/Configuration$Builder;", "builder", "<init>", "(Landroidx/work/Configuration$Builder;)V", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "b", "getTaskExecutor", "taskExecutor", "Landroidx/work/Clock;", "c", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "clock", "Landroidx/work/WorkerFactory;", "d", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "workerFactory", "Landroidx/work/InputMergerFactory;", "e", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "inputMergerFactory", "Landroidx/work/RunnableScheduler;", "f", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/core/util/Consumer;", "", "g", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "initializationExceptionHandler", "h", "getSchedulingExceptionHandler", "schedulingExceptionHandler", "", "i", "Ljava/lang/String;", "getDefaultProcessName", "()Ljava/lang/String;", "defaultProcessName", "", "j", "I", "getMinimumLoggingLevel", "()I", "minimumLoggingLevel", "k", "getMinJobSchedulerId", "minJobSchedulerId", "l", "getMaxJobSchedulerId", "maxJobSchedulerId", "m", "getContentUriTriggerWorkersLimit", "contentUriTriggerWorkersLimit", "n", "getMaxSchedulerLimit", "maxSchedulerLimit", "", "o", "Z", "isUsingDefaultTaskExecutor", "()Z", "Companion", "Builder", "Provider", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Configuration {
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\bJ\u0018\u00002\u00020\u0001B\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\u00020\u00002\u0006\u0010!\u001A\u00020\u0019\u00A2\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u0019\u00A2\u0006\u0004\b$\u0010 J\u0015\u0010\'\u001A\u00020\u00002\u0006\u0010&\u001A\u00020%\u00A2\u0006\u0004\b\'\u0010(J\u001B\u0010,\u001A\u00020\u00002\f\u0010+\u001A\b\u0012\u0004\u0012\u00020*0)\u00A2\u0006\u0004\b,\u0010-J\u001B\u0010/\u001A\u00020\u00002\f\u0010.\u001A\b\u0012\u0004\u0012\u00020*0)\u00A2\u0006\u0004\b/\u0010-J\u0015\u00102\u001A\u00020\u00002\u0006\u00101\u001A\u000200\u00A2\u0006\u0004\b2\u00103J\r\u00104\u001A\u00020\u0004\u00A2\u0006\u0004\b4\u00105R$\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0013\u001A\u0004\u0018\u00010\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bH\u00107\u001A\u0004\bI\u00109\"\u0004\bJ\u0010;R$\u0010\u0016\u001A\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010&\u001A\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010]\u001A\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010.\u001A\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b^\u0010X\u001A\u0004\b_\u0010Z\"\u0004\b`\u0010\\R$\u0010g\u001A\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010#\u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bh\u0010i\u001A\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010\u001A\u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bn\u0010i\u001A\u0004\bo\u0010k\"\u0004\bp\u0010mR\"\u0010\u001B\u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bq\u0010i\u001A\u0004\br\u0010k\"\u0004\bs\u0010mR\"\u0010\u001E\u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bt\u0010i\u001A\u0004\bu\u0010k\"\u0004\bv\u0010mR\"\u0010!\u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bw\u0010i\u001A\u0004\bx\u0010k\"\u0004\by\u0010m\u00A8\u0006z"}, d2 = {"Landroidx/work/Configuration$Builder;", "", "<init>", "()V", "Landroidx/work/Configuration;", "configuration", "(Landroidx/work/Configuration;)V", "Landroidx/work/WorkerFactory;", "workerFactory", "setWorkerFactory", "(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "setInputMergerFactory", "(Landroidx/work/InputMergerFactory;)Landroidx/work/Configuration$Builder;", "Ljava/util/concurrent/Executor;", "executor", "setExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/work/Configuration$Builder;", "taskExecutor", "setTaskExecutor", "Landroidx/work/Clock;", "clock", "setClock", "(Landroidx/work/Clock;)Landroidx/work/Configuration$Builder;", "", "minJobSchedulerId", "maxJobSchedulerId", "setJobSchedulerJobIdRange", "(II)Landroidx/work/Configuration$Builder;", "maxSchedulerLimit", "setMaxSchedulerLimit", "(I)Landroidx/work/Configuration$Builder;", "contentUriTriggerWorkersLimit", "setContentUriTriggerWorkersLimit", "loggingLevel", "setMinimumLoggingLevel", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "setRunnableScheduler", "(Landroidx/work/RunnableScheduler;)Landroidx/work/Configuration$Builder;", "Landroidx/core/util/Consumer;", "", "exceptionHandler", "setInitializationExceptionHandler", "(Landroidx/core/util/Consumer;)Landroidx/work/Configuration$Builder;", "schedulingExceptionHandler", "setSchedulingExceptionHandler", "", "processName", "setDefaultProcessName", "(Ljava/lang/String;)Landroidx/work/Configuration$Builder;", "build", "()Landroidx/work/Configuration;", "a", "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", "b", "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", "c", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "d", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "e", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", "f", "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", "g", "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "initializationExceptionHandler", "h", "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "i", "Ljava/lang/String;", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", "j", "I", "getLoggingLevel$work_runtime_release", "()I", "setLoggingLevel$work_runtime_release", "(I)V", "k", "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", "l", "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", "m", "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", "n", "getContentUriTriggerWorkersLimit$work_runtime_release", "setContentUriTriggerWorkersLimit$work_runtime_release", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public Executor a;
        public WorkerFactory b;
        public InputMergerFactory c;
        public Executor d;
        public Clock e;
        public RunnableScheduler f;
        public Consumer g;
        public Consumer h;
        public String i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        public Builder() {
            this.j = 4;
            this.l = 0x7FFFFFFF;
            this.m = 20;
            this.n = 8;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public Builder(@NotNull Configuration configuration0) {
            Intrinsics.checkNotNullParameter(configuration0, "configuration");
            super();
            this.j = 4;
            this.l = 0x7FFFFFFF;
            this.m = 20;
            this.n = 8;
            this.a = configuration0.getExecutor();
            this.b = configuration0.getWorkerFactory();
            this.c = configuration0.getInputMergerFactory();
            this.d = configuration0.getTaskExecutor();
            this.e = configuration0.getClock();
            this.j = configuration0.getMinimumLoggingLevel();
            this.k = configuration0.getMinJobSchedulerId();
            this.l = configuration0.getMaxJobSchedulerId();
            this.m = configuration0.getMaxSchedulerLimit();
            this.f = configuration0.getRunnableScheduler();
            this.g = configuration0.getInitializationExceptionHandler();
            this.h = configuration0.getSchedulingExceptionHandler();
            this.i = configuration0.getDefaultProcessName();
        }

        @NotNull
        public final Configuration build() {
            return new Configuration(this);
        }

        @Nullable
        public final Clock getClock$work_runtime_release() {
            return this.e;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.n;
        }

        @Nullable
        public final String getDefaultProcessName$work_runtime_release() {
            return this.i;
        }

        @Nullable
        public final Executor getExecutor$work_runtime_release() {
            return this.a;
        }

        @Nullable
        public final Consumer getInitializationExceptionHandler$work_runtime_release() {
            return this.g;
        }

        @Nullable
        public final InputMergerFactory getInputMergerFactory$work_runtime_release() {
            return this.c;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.j;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.l;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.m;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.k;
        }

        @Nullable
        public final RunnableScheduler getRunnableScheduler$work_runtime_release() {
            return this.f;
        }

        @Nullable
        public final Consumer getSchedulingExceptionHandler$work_runtime_release() {
            return this.h;
        }

        @Nullable
        public final Executor getTaskExecutor$work_runtime_release() {
            return this.d;
        }

        @Nullable
        public final WorkerFactory getWorkerFactory$work_runtime_release() {
            return this.b;
        }

        @NotNull
        public final Builder setClock(@NotNull Clock clock0) {
            Intrinsics.checkNotNullParameter(clock0, "clock");
            this.e = clock0;
            return this;
        }

        public final void setClock$work_runtime_release(@Nullable Clock clock0) {
            this.e = clock0;
        }

        @NotNull
        public final Builder setContentUriTriggerWorkersLimit(int v) {
            this.n = Math.max(v, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int v) {
            this.n = v;
        }

        @NotNull
        public final Builder setDefaultProcessName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "processName");
            this.i = s;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(@Nullable String s) {
            this.i = s;
        }

        @NotNull
        public final Builder setExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "executor");
            this.a = executor0;
            return this;
        }

        public final void setExecutor$work_runtime_release(@Nullable Executor executor0) {
            this.a = executor0;
        }

        @NotNull
        public final Builder setInitializationExceptionHandler(@NotNull Consumer consumer0) {
            Intrinsics.checkNotNullParameter(consumer0, "exceptionHandler");
            this.g = consumer0;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(@Nullable Consumer consumer0) {
            this.g = consumer0;
        }

        @NotNull
        public final Builder setInputMergerFactory(@NotNull InputMergerFactory inputMergerFactory0) {
            Intrinsics.checkNotNullParameter(inputMergerFactory0, "inputMergerFactory");
            this.c = inputMergerFactory0;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(@Nullable InputMergerFactory inputMergerFactory0) {
            this.c = inputMergerFactory0;
        }

        @NotNull
        public final Builder setJobSchedulerJobIdRange(int v, int v1) {
            if(v1 - v < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.k = v;
            this.l = v1;
            return this;
        }

        public final void setLoggingLevel$work_runtime_release(int v) {
            this.j = v;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int v) {
            this.l = v;
        }

        @NotNull
        public final Builder setMaxSchedulerLimit(int v) {
            if(v < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.m = Math.min(v, 50);
            return this;
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int v) {
            this.m = v;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int v) {
            this.k = v;
        }

        @NotNull
        public final Builder setMinimumLoggingLevel(int v) {
            this.j = v;
            return this;
        }

        @NotNull
        public final Builder setRunnableScheduler(@NotNull RunnableScheduler runnableScheduler0) {
            Intrinsics.checkNotNullParameter(runnableScheduler0, "runnableScheduler");
            this.f = runnableScheduler0;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(@Nullable RunnableScheduler runnableScheduler0) {
            this.f = runnableScheduler0;
        }

        @NotNull
        public final Builder setSchedulingExceptionHandler(@NotNull Consumer consumer0) {
            Intrinsics.checkNotNullParameter(consumer0, "schedulingExceptionHandler");
            this.h = consumer0;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(@Nullable Consumer consumer0) {
            this.h = consumer0;
        }

        @NotNull
        public final Builder setTaskExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "taskExecutor");
            this.d = executor0;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(@Nullable Executor executor0) {
            this.d = executor0;
        }

        @NotNull
        public final Builder setWorkerFactory(@NotNull WorkerFactory workerFactory0) {
            Intrinsics.checkNotNullParameter(workerFactory0, "workerFactory");
            this.b = workerFactory0;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(@Nullable WorkerFactory workerFactory0) {
            this.b = workerFactory0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Configuration$Companion;", "", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/work/Configuration$Provider;", "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Provider {
        @NotNull
        Configuration getWorkManagerConfiguration();
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int MIN_SCHEDULER_LIMIT = 20;
    public final Executor a;
    public final Executor b;
    public final Clock c;
    public final WorkerFactory d;
    public final InputMergerFactory e;
    public final RunnableScheduler f;
    public final Consumer g;
    public final Consumer h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;

    static {
        Configuration.Companion = new Companion(null);
    }

    public Configuration(@NotNull Builder configuration$Builder0) {
        Intrinsics.checkNotNullParameter(configuration$Builder0, "builder");
        super();
        Executor executor0 = configuration$Builder0.getExecutor$work_runtime_release();
        boolean z = false;
        if(executor0 == null) {
            executor0 = ConfigurationKt.access$createDefaultExecutor(false);
        }
        this.a = executor0;
        if(configuration$Builder0.getTaskExecutor$work_runtime_release() == null) {
            z = true;
        }
        this.o = z;
        this.b = configuration$Builder0.getTaskExecutor$work_runtime_release() == null ? ConfigurationKt.access$createDefaultExecutor(true) : configuration$Builder0.getTaskExecutor$work_runtime_release();
        Clock clock0 = configuration$Builder0.getClock$work_runtime_release();
        if(clock0 == null) {
            clock0 = new SystemClock();
        }
        this.c = clock0;
        WorkerFactory workerFactory0 = configuration$Builder0.getWorkerFactory$work_runtime_release();
        if(workerFactory0 == null) {
            workerFactory0 = WorkerFactory.getDefaultWorkerFactory();
            Intrinsics.checkNotNullExpressionValue(workerFactory0, "getDefaultWorkerFactory()");
        }
        this.d = workerFactory0;
        InputMergerFactory inputMergerFactory0 = configuration$Builder0.getInputMergerFactory$work_runtime_release();
        if(inputMergerFactory0 == null) {
            inputMergerFactory0 = NoOpInputMergerFactory.INSTANCE;
        }
        this.e = inputMergerFactory0;
        RunnableScheduler runnableScheduler0 = configuration$Builder0.getRunnableScheduler$work_runtime_release();
        if(runnableScheduler0 == null) {
            runnableScheduler0 = new DefaultRunnableScheduler();
        }
        this.f = runnableScheduler0;
        this.j = configuration$Builder0.getLoggingLevel$work_runtime_release();
        this.k = configuration$Builder0.getMinJobSchedulerId$work_runtime_release();
        this.l = configuration$Builder0.getMaxJobSchedulerId$work_runtime_release();
        this.n = configuration$Builder0.getMaxSchedulerLimit$work_runtime_release();
        this.g = configuration$Builder0.getInitializationExceptionHandler$work_runtime_release();
        this.h = configuration$Builder0.getSchedulingExceptionHandler$work_runtime_release();
        this.i = configuration$Builder0.getDefaultProcessName$work_runtime_release();
        this.m = configuration$Builder0.getContentUriTriggerWorkersLimit$work_runtime_release();
    }

    @NotNull
    public final Clock getClock() {
        return this.c;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.m;
    }

    @Nullable
    public final String getDefaultProcessName() {
        return this.i;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.a;
    }

    @Nullable
    public final Consumer getInitializationExceptionHandler() {
        return this.g;
    }

    @NotNull
    public final InputMergerFactory getInputMergerFactory() {
        return this.e;
    }

    public final int getMaxJobSchedulerId() {
        return this.l;
    }

    @IntRange(from = 20L, to = 50L)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.n;
    }

    public final int getMinJobSchedulerId() {
        return this.k;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.j;
    }

    @NotNull
    public final RunnableScheduler getRunnableScheduler() {
        return this.f;
    }

    @Nullable
    public final Consumer getSchedulingExceptionHandler() {
        return this.h;
    }

    @NotNull
    public final Executor getTaskExecutor() {
        return this.b;
    }

    @NotNull
    public final WorkerFactory getWorkerFactory() {
        return this.d;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isUsingDefaultTaskExecutor() {
        return this.o;
    }
}

