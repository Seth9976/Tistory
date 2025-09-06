package androidx.compose.ui.platform;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000E\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001A\u00020\u000B2\b\u0010\u0016\u001A\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001C\u001A\u00060\u0002j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "setText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "hasText", "()Z", "Landroidx/compose/ui/platform/ClipEntry;", "getClip", "()Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "setClip", "(Landroidx/compose/ui/platform/ClipEntry;)V", "Landroidx/compose/ui/platform/NativeClipboard;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,609:1\n1#2:610\n*E\n"})
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    public final android.content.ClipboardManager a;

    public AndroidClipboardManager(@NotNull android.content.ClipboardManager clipboardManager0) {
        this.a = clipboardManager0;
    }

    public AndroidClipboardManager(@NotNull Context context0) {
        Object object0 = context0.getSystemService("clipboard");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
        this(((android.content.ClipboardManager)object0));
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    @Nullable
    public ClipEntry getClip() {
        ClipData clipData0 = this.a.getPrimaryClip();
        return clipData0 == null ? null : new ClipEntry(clipData0);
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    @NotNull
    public android.content.ClipboardManager getNativeClipboard() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    @Nullable
    public AnnotatedString getText() {
        ClipData clipData0 = this.a.getPrimaryClip();
        AnnotatedString annotatedString0 = null;
        if(clipData0 != null && clipData0.getItemCount() > 0) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(0);
            if(clipData$Item0 != null) {
                annotatedString0 = clipData$Item0.getText();
            }
            return AndroidClipboardManager_androidKt.convertToAnnotatedString(annotatedString0);
        }
        return null;
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription clipDescription0 = this.a.getPrimaryClipDescription();
        return clipDescription0 == null ? false : clipDescription0.hasMimeType("text/*");
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public void setClip(@Nullable ClipEntry clipEntry0) {
        android.content.ClipboardManager clipboardManager0 = this.a;
        if(clipEntry0 == null) {
            if(Build.VERSION.SDK_INT >= 28) {
                o0.a(clipboardManager0);
                return;
            }
            clipboardManager0.setPrimaryClip(ClipData.newPlainText("", ""));
            return;
        }
        clipboardManager0.setPrimaryClip(clipEntry0.getClipData());
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public void setText(@NotNull AnnotatedString annotatedString0) {
        ClipData clipData0 = ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString0));
        this.a.setPrimaryClip(clipData0);
    }
}

