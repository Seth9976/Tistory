package androidx.compose.ui.text.font;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "fontWeightAdjustment", "<init>", "(I)V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "interceptFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;", "copy", "(I)Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable;
    public final int a;

    public AndroidFontResolveInterceptor(int v) {
        this.a = v;
    }

    @NotNull
    public final AndroidFontResolveInterceptor copy(int v) {
        return new AndroidFontResolveInterceptor(v);
    }

    public static AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = androidFontResolveInterceptor0.a;
        }
        return androidFontResolveInterceptor0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AndroidFontResolveInterceptor ? this.a == ((AndroidFontResolveInterceptor)object0).a : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.font.PlatformResolveInterceptor
    @NotNull
    public FontWeight interceptFontWeight(@NotNull FontWeight fontWeight0) {
        return this.a == 0 || this.a == 0x7FFFFFFF ? fontWeight0 : new FontWeight(c.coerceIn(fontWeight0.getWeight() + this.a, 1, 1000));
    }

    @Override
    @NotNull
    public String toString() {
        return b.p(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.a, ')');
    }
}

