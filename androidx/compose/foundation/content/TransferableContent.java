package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001CB-\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0007\u001A\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent;", "", "Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata", "Landroidx/compose/foundation/content/TransferableContent$Source;", "source", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "platformTransferableContent", "<init>", "(Landroidx/compose/ui/platform/ClipEntry;Landroidx/compose/ui/platform/ClipMetadata;ILandroidx/compose/foundation/content/PlatformTransferableContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "()Landroidx/compose/ui/platform/ClipEntry;", "b", "Landroidx/compose/ui/platform/ClipMetadata;", "getClipMetadata", "()Landroidx/compose/ui/platform/ClipMetadata;", "c", "I", "getSource-kB6V9T0", "()I", "d", "Landroidx/compose/foundation/content/PlatformTransferableContent;", "getPlatformTransferableContent", "()Landroidx/compose/foundation/content/PlatformTransferableContent;", "Source", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransferableContent {
    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Source {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/content/TransferableContent$Source$Companion;", "", "Landroidx/compose/foundation/content/TransferableContent$Source;", "Keyboard", "I", "getKeyboard-kB6V9T0", "()I", "DragAndDrop", "getDragAndDrop-kB6V9T0", "Clipboard", "getClipboard-kB6V9T0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getClipboard-kB6V9T0() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getDragAndDrop-kB6V9T0() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getKeyboard-kB6V9T0() [...] // 潜在的解密器
        }

        @NotNull
        public static final Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;

        static {
            Source.Companion = new Companion(null);
            Source.b = 0;
            Source.c = 1;
            Source.d = 2;
        }

        public Source(int v) {
            this.a = v;
        }

        public static final int access$getClipboard$cp() [...] // 潜在的解密器

        public static final int access$getDragAndDrop$cp() [...] // 潜在的解密器

        public static final int access$getKeyboard$cp() [...] // 潜在的解密器

        public static final Source box-impl(int v) {
            return new Source(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Source.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof Source ? v == ((Source)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return Source.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return Source.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(Source.equals-impl0(v, Source.b)) {
                return "Source.Keyboard";
            }
            if(Source.equals-impl0(v, Source.c)) {
                return "Source.DragAndDrop";
            }
            return Source.equals-impl0(v, Source.d) ? "Source.Clipboard" : "Invalid (" + v + ')';
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    public static final int $stable = 8;
    public final ClipEntry a;
    public final ClipMetadata b;
    public final int c;
    public final PlatformTransferableContent d;

    public TransferableContent(ClipEntry clipEntry0, ClipMetadata clipMetadata0, int v, PlatformTransferableContent platformTransferableContent0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 8) != 0) {
            platformTransferableContent0 = null;
        }
        this(clipEntry0, clipMetadata0, v, platformTransferableContent0, null);
    }

    public TransferableContent(ClipEntry clipEntry0, ClipMetadata clipMetadata0, int v, PlatformTransferableContent platformTransferableContent0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = clipEntry0;
        this.b = clipMetadata0;
        this.c = v;
        this.d = platformTransferableContent0;
    }

    @NotNull
    public final ClipEntry getClipEntry() {
        return this.a;
    }

    @NotNull
    public final ClipMetadata getClipMetadata() {
        return this.b;
    }

    @Nullable
    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.d;
    }

    public final int getSource-kB6V9T0() {
        return this.c;
    }
}

