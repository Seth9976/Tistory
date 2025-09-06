package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "", "scaleX", "skewX", "<init>", "(FF)V", "copy", "(FF)Landroidx/compose/ui/text/style/TextGeometricTransform;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getScaleX", "()F", "b", "getSkewX", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextGeometricTransform {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "None", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text_release", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text_release$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.c;
        }

        @Stable
        public static void getNone$ui_text_release$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final float b;
    public static final TextGeometricTransform c;

    static {
        TextGeometricTransform.Companion = new Companion(null);
        TextGeometricTransform.c = new TextGeometricTransform(1.0f, 0.0f);
    }

    public TextGeometricTransform() {
        this(0.0f, 0.0f, 3, null);
    }

    public TextGeometricTransform(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public TextGeometricTransform(float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        this(f, f1);
    }

    @NotNull
    public final TextGeometricTransform copy(float f, float f1) {
        return new TextGeometricTransform(f, f1);
    }

    public static TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = textGeometricTransform0.a;
        }
        if((v & 2) != 0) {
            f1 = textGeometricTransform0.b;
        }
        return textGeometricTransform0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextGeometricTransform ? this.a == ((TextGeometricTransform)object0).a && this.b == ((TextGeometricTransform)object0).b : false;
    }

    public final float getScaleX() {
        return this.a;
    }

    public final float getSkewX() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TextGeometricTransform(scaleX=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", skewX=");
        return a.n(stringBuilder0, this.b, ')');
    }
}

