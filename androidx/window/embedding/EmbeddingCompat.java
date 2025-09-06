package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import j5.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001D\u0010\r\u001A\u00020\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;)V", "()V", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "", "setSplitRules", "(Ljava/util/Set;)V", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;)V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "", "getExtensionApiLevel", "()Ljava/lang/Integer;", "", "isEmbeddingAvailable", "()Z", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingComponent", "()Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ActivityEmbeddingComponent embeddingComponent() {
            if(this.isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent0 = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                return activityEmbeddingComponent0 == null ? new d() : activityEmbeddingComponent0;
            }
            return new d();
        }

        @Nullable
        public final Integer getExtensionApiLevel() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
            }
            catch(NoClassDefFoundError unused_ex) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
                return null;
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.d("EmbeddingCompat", "Stub Extension");
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                if(WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                    return true;
                }
            }
            catch(NoClassDefFoundError unused_ex) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
            }
            catch(UnsupportedOperationException unused_ex) {
                Log.d("EmbeddingCompat", "Stub Extension");
            }
            return false;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final boolean DEBUG = true;
    public final ActivityEmbeddingComponent a;
    public final EmbeddingAdapter b;

    static {
        EmbeddingCompat.Companion = new Companion(null);
    }

    public EmbeddingCompat() {
        this(EmbeddingCompat.Companion.embeddingComponent(), new EmbeddingAdapter());
    }

    public EmbeddingCompat(@NotNull ActivityEmbeddingComponent activityEmbeddingComponent0, @NotNull EmbeddingAdapter embeddingAdapter0) {
        Intrinsics.checkNotNullParameter(activityEmbeddingComponent0, "embeddingExtension");
        Intrinsics.checkNotNullParameter(embeddingAdapter0, "adapter");
        super();
        this.a = activityEmbeddingComponent0;
        this.b = embeddingAdapter0;
    }

    @Override  // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(@NotNull EmbeddingCallbackInterface embeddingInterfaceCompat$EmbeddingCallbackInterface0) {
        Intrinsics.checkNotNullParameter(embeddingInterfaceCompat$EmbeddingCallbackInterface0, "embeddingCallback");
        EmbeddingTranslatingCallback embeddingTranslatingCallback0 = new EmbeddingTranslatingCallback(embeddingInterfaceCompat$EmbeddingCallbackInterface0, this.b);
        this.a.setSplitInfoCallback(embeddingTranslatingCallback0);
    }

    @Override  // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitRules(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "rules");
        Set set1 = this.b.translate(set0);
        this.a.setEmbeddingRules(set1);
    }
}

