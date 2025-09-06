package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.activity.m;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0001\u0018\u0000 02\u00020\u0001:\u0003012B\u0013\b\u0007\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J3\u0010\u001A\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0012\u0010\u0019\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ#\u0010\u001D\u001A\u00020\u000B2\u0012\u0010\u001C\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\u0005R&\u0010/\u001A\b\u0012\u0004\u0012\u00020(0\'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001A\u0004\b+\u0010,¨\u00063"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "()Ljava/util/Set;", "rules", "", "setSplitRules", "(Ljava/util/Set;)V", "rule", "registerRule", "(Landroidx/window/embedding/EmbeddingRule;)V", "unregisterRule", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "consumer", "unregisterSplitListenerForActivity", "(Landroidx/core/util/Consumer;)V", "", "isSplitSupported", "()Z", "a", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "splitChangeCallbacks", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0018\u0010\r\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u000F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "getInstance", "()Landroidx/window/embedding/ExtensionEmbeddingBackend;", "", "extensionVersion", "", "isExtensionVersionSupported", "(Ljava/lang/Integer;)Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            if(ExtensionEmbeddingBackend.e == null) {
                ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.f;
                reentrantLock0.lock();
                try {
                    if(ExtensionEmbeddingBackend.e == null) {
                        ExtensionEmbeddingBackend.Companion.getClass();
                        EmbeddingInterfaceCompat embeddingInterfaceCompat0 = null;
                        try {
                            if(ExtensionEmbeddingBackend.Companion.isExtensionVersionSupported(EmbeddingCompat.Companion.getExtensionApiLevel()) && EmbeddingCompat.Companion.isEmbeddingAvailable()) {
                                embeddingInterfaceCompat0 = new EmbeddingCompat();
                            }
                        }
                        catch(Throwable throwable0) {
                            Log.d("EmbeddingBackend", "Failed to load embedding extension: " + throwable0);
                        }
                        if(embeddingInterfaceCompat0 == null) {
                            Log.d("EmbeddingBackend", "No supported embedding extension found");
                        }
                        ExtensionEmbeddingBackend.e = new ExtensionEmbeddingBackend(embeddingInterfaceCompat0);
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend0 = ExtensionEmbeddingBackend.e;
            Intrinsics.checkNotNull(extensionEmbeddingBackend0);
            return extensionEmbeddingBackend0;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(@Nullable Integer integer0) {
            return integer0 == null ? false : ((int)integer0) >= 1;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR*\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\t¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "", "onSplitInfoChanged", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "lastInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public final class EmbeddingCallbackImpl implements EmbeddingCallbackInterface {
        public List a;
        public final ExtensionEmbeddingBackend b;

        public EmbeddingCallbackImpl() {
            Intrinsics.checkNotNullParameter(extensionEmbeddingBackend0, "this$0");
            this.b = extensionEmbeddingBackend0;
            super();
        }

        @Nullable
        public final List getLastInfo() {
            return this.a;
        }

        @Override  // androidx.window.embedding.EmbeddingInterfaceCompat$EmbeddingCallbackInterface
        public void onSplitInfoChanged(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "splitInfo");
            this.a = list0;
            for(Object object0: this.b.getSplitChangeCallbacks()) {
                ((SplitListenerWrapper)object0).accept(list0);
            }
        }

        public final void setLastInfo(@Nullable List list0) {
            this.a = list0;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u000E\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000E\u0010\u000FR#\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "splitInfoList", "", "accept", "(Ljava/util/List;)V", "c", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class SplitListenerWrapper {
        public final Activity a;
        public final Executor b;
        public final Consumer c;
        public ArrayList d;

        public SplitListenerWrapper(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(executor0, "executor");
            Intrinsics.checkNotNullParameter(consumer0, "callback");
            super();
            this.a = activity0;
            this.b = executor0;
            this.c = consumer0;
        }

        public final void accept(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "splitInfoList");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((SplitInfo)object0).contains(this.a)) {
                    arrayList0.add(object0);
                }
            }
            if(Intrinsics.areEqual(arrayList0, this.d)) {
                return;
            }
            this.d = arrayList0;
            m m0 = new m(25, this, arrayList0);
            this.b.execute(m0);
        }

        @NotNull
        public final Consumer getCallback() {
            return this.c;
        }
    }

    @NotNull
    public static final Companion Companion;
    public EmbeddingInterfaceCompat a;
    public final CopyOnWriteArrayList b;
    public final EmbeddingCallbackImpl c;
    public final CopyOnWriteArraySet d;
    public static volatile ExtensionEmbeddingBackend e;
    public static final ReentrantLock f;

    static {
        ExtensionEmbeddingBackend.Companion = new Companion(null);
        ExtensionEmbeddingBackend.f = new ReentrantLock();
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat0) {
        this.a = embeddingInterfaceCompat0;
        EmbeddingCallbackImpl extensionEmbeddingBackend$EmbeddingCallbackImpl0 = new EmbeddingCallbackImpl(this);
        this.c = extensionEmbeddingBackend$EmbeddingCallbackImpl0;
        this.b = new CopyOnWriteArrayList();
        EmbeddingInterfaceCompat embeddingInterfaceCompat1 = this.a;
        if(embeddingInterfaceCompat1 != null) {
            embeddingInterfaceCompat1.setEmbeddingCallback(extensionEmbeddingBackend$EmbeddingCallbackImpl0);
        }
        this.d = new CopyOnWriteArraySet();
    }

    @Nullable
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.a;
    }

    @NotNull
    public final CopyOnWriteArrayList getSplitChangeCallbacks() {
        return this.b;
    }

    @VisibleForTesting
    public static void getSplitChangeCallbacks$annotations() {
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    @NotNull
    public Set getSplitRules() {
        return this.d;
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.a != null;
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void registerRule(@NotNull EmbeddingRule embeddingRule0) {
        Intrinsics.checkNotNullParameter(embeddingRule0, "rule");
        CopyOnWriteArraySet copyOnWriteArraySet0 = this.d;
        if(!copyOnWriteArraySet0.contains(embeddingRule0)) {
            copyOnWriteArraySet0.add(embeddingRule0);
            EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
            if(embeddingInterfaceCompat0 != null) {
                embeddingInterfaceCompat0.setSplitRules(copyOnWriteArraySet0);
            }
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
        EmbeddingCallbackImpl extensionEmbeddingBackend$EmbeddingCallbackImpl0 = this.c;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(consumer0, "callback");
        ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.f;
        reentrantLock0.lock();
        try {
            if(this.getEmbeddingExtension() == null) {
                Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                consumer0.accept(CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0 = new SplitListenerWrapper(activity0, executor0, consumer0);
            this.getSplitChangeCallbacks().add(extensionEmbeddingBackend$SplitListenerWrapper0);
            if(extensionEmbeddingBackend$EmbeddingCallbackImpl0.getLastInfo() == null) {
                extensionEmbeddingBackend$SplitListenerWrapper0.accept(CollectionsKt__CollectionsKt.emptyList());
            }
            else {
                List list0 = extensionEmbeddingBackend$EmbeddingCallbackImpl0.getLastInfo();
                Intrinsics.checkNotNull(list0);
                extensionEmbeddingBackend$SplitListenerWrapper0.accept(list0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public final void setEmbeddingExtension(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat0) {
        this.a = embeddingInterfaceCompat0;
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "rules");
        CopyOnWriteArraySet copyOnWriteArraySet0 = this.d;
        copyOnWriteArraySet0.clear();
        copyOnWriteArraySet0.addAll(set0);
        EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
        if(embeddingInterfaceCompat0 != null) {
            embeddingInterfaceCompat0.setSplitRules(copyOnWriteArraySet0);
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(@NotNull EmbeddingRule embeddingRule0) {
        Intrinsics.checkNotNullParameter(embeddingRule0, "rule");
        CopyOnWriteArraySet copyOnWriteArraySet0 = this.d;
        if(copyOnWriteArraySet0.contains(embeddingRule0)) {
            copyOnWriteArraySet0.remove(embeddingRule0);
            EmbeddingInterfaceCompat embeddingInterfaceCompat0 = this.a;
            if(embeddingInterfaceCompat0 != null) {
                embeddingInterfaceCompat0.setSplitRules(copyOnWriteArraySet0);
            }
        }
    }

    @Override  // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "consumer");
        ReentrantLock reentrantLock0 = ExtensionEmbeddingBackend.f;
        reentrantLock0.lock();
        try {
            for(Object object0: this.getSplitChangeCallbacks()) {
                SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0 = (SplitListenerWrapper)object0;
                if(Intrinsics.areEqual(extensionEmbeddingBackend$SplitListenerWrapper0.getCallback(), consumer0)) {
                    this.getSplitChangeCallbacks().remove(extensionEmbeddingBackend$SplitListenerWrapper0);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

