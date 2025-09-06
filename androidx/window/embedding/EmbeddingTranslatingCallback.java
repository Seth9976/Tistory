package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"NewApi"})
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "callback", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;Landroidx/window/embedding/EmbeddingAdapter;)V", "splitInfoList", "", "accept", "(Ljava/util/List;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class EmbeddingTranslatingCallback implements Consumer {
    public final EmbeddingCallbackInterface a;
    public final EmbeddingAdapter b;

    public EmbeddingTranslatingCallback(@NotNull EmbeddingCallbackInterface embeddingInterfaceCompat$EmbeddingCallbackInterface0, @NotNull EmbeddingAdapter embeddingAdapter0) {
        Intrinsics.checkNotNullParameter(embeddingInterfaceCompat$EmbeddingCallbackInterface0, "callback");
        Intrinsics.checkNotNullParameter(embeddingAdapter0, "adapter");
        super();
        this.a = embeddingInterfaceCompat$EmbeddingCallbackInterface0;
        this.b = embeddingAdapter0;
    }

    @Override
    public void accept(Object object0) {
        this.accept(((List)object0));
    }

    public void accept(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "splitInfoList");
        List list1 = this.b.translate(list0);
        this.a.onSplitInfoChanged(list1);
    }
}

