package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CJ\u0013\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\fJ1\u0010\u0015\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0012\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\u00072\u0012\u0010\u0014\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "()Ljava/util/Set;", "rule", "", "registerRule", "(Landroidx/window/embedding/EmbeddingRule;)V", "unregisterRule", "clearRegisteredRules", "()V", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "removeSplitListener", "(Landroidx/core/util/Consumer;)V", "", "isSplitSupported", "()Z", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitController {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000BR\u0018\u0010\f\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000F\u001A\u00020\u000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0012\u001A\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "getInstance", "()Landroidx/window/embedding/SplitController;", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "", "initialize", "(Landroid/content/Context;I)V", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SplitController getInstance() {
            if(SplitController.c == null) {
                ReentrantLock reentrantLock0 = SplitController.d;
                reentrantLock0.lock();
                try {
                    if(SplitController.c == null) {
                        SplitController.c = new SplitController(null);
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            SplitController splitController0 = SplitController.c;
            Intrinsics.checkNotNull(splitController0);
            return splitController0;
        }

        @JvmStatic
        public final void initialize(@NotNull Context context0, int v) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Set set0 = new SplitRuleParser().parseSplitRules$window_release(context0, v);
            SplitController splitController0 = this.getInstance();
            if(set0 == null) {
                set0 = f0.emptySet();
            }
            SplitController.access$setStaticSplitRules(splitController0, set0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public final ExtensionEmbeddingBackend a;
    public Set b;
    public static volatile SplitController c = null;
    public static final ReentrantLock d = null;
    public static final boolean sDebug = false;

    static {
        SplitController.Companion = new Companion(null);
        SplitController.d = new ReentrantLock();
    }

    public SplitController(DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = ExtensionEmbeddingBackend.Companion.getInstance();
        this.b = f0.emptySet();
    }

    public static final void access$setStaticSplitRules(SplitController splitController0, Set set0) {
        splitController0.b = set0;
        splitController0.a.setSplitRules(set0);
    }

    public final void addSplitListener(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(consumer0, "consumer");
        this.a.registerSplitListenerForActivity(activity0, executor0, consumer0);
    }

    public final void clearRegisteredRules() {
        this.a.setSplitRules(this.b);
    }

    @JvmStatic
    @NotNull
    public static final SplitController getInstance() {
        return SplitController.Companion.getInstance();
    }

    @NotNull
    public final Set getSplitRules() {
        return CollectionsKt___CollectionsKt.toSet(this.a.getSplitRules());
    }

    @JvmStatic
    public static final void initialize(@NotNull Context context0, int v) {
        SplitController.Companion.initialize(context0, v);
    }

    public final boolean isSplitSupported() {
        return this.a.isSplitSupported();
    }

    public final void registerRule(@NotNull EmbeddingRule embeddingRule0) {
        Intrinsics.checkNotNullParameter(embeddingRule0, "rule");
        this.a.registerRule(embeddingRule0);
    }

    public final void removeSplitListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "consumer");
        this.a.unregisterSplitListenerForActivity(consumer0);
    }

    public final void unregisterRule(@NotNull EmbeddingRule embeddingRule0) {
        Intrinsics.checkNotNullParameter(embeddingRule0, "rule");
        this.a.unregisterRule(embeddingRule0);
    }
}

