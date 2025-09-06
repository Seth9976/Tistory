package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0003\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJD\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u0019R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R \u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001E\u001A\u0004\b%\u0010\u0019R\u0017\u0010\t\u001A\u00020\b8\u0007¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R&\u0010\u000B\u001A\u00020\n8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010\u001E\u0012\u0004\b,\u0010-\u001A\u0004\b+\u0010\u0019\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getResId", "b", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "c", "getStyle-_-LCdwA", "d", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "e", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ResourceFont implements Font {
    public static final int $stable;
    public final int a;
    public final FontWeight b;
    public final int c;
    public final Settings d;
    public final int e;

    public ResourceFont(int v, FontWeight fontWeight0, int v1, Settings fontVariation$Settings0, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.INSTANCE.Settings-6EWAqTQ(fontWeight0, v1, new Setting[0]);
        }
        if((v3 & 16) != 0) {
            v2 = 2;
        }
        this(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    public ResourceFont(int v, FontWeight fontWeight0, int v1, @ExperimentalTextApi Settings fontVariation$Settings0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = fontWeight0;
        this.c = v1;
        this.d = fontVariation$Settings0;
        this.e = v2;
    }

    @ExperimentalTextApi
    @NotNull
    public final ResourceFont copy-F3nL8kk(int v, @NotNull FontWeight fontWeight0, int v1, int v2, @NotNull Settings fontVariation$Settings0) {
        return new ResourceFont(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    public static ResourceFont copy-F3nL8kk$default(ResourceFont resourceFont0, int v, FontWeight fontWeight0, int v1, int v2, Settings fontVariation$Settings0, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = resourceFont0.a;
        }
        if((v3 & 2) != 0) {
            fontWeight0 = resourceFont0.getWeight();
        }
        if((v3 & 4) != 0) {
            v1 = resourceFont0.getStyle-_-LCdwA();
        }
        if((v3 & 8) != 0) {
            v2 = resourceFont0.getLoadingStrategy-PKNRLFQ();
        }
        if((v3 & 16) != 0) {
            fontVariation$Settings0 = resourceFont0.d;
        }
        return resourceFont0.copy-F3nL8kk(v, fontWeight0, v1, v2, fontVariation$Settings0);
    }

    @NotNull
    public final ResourceFont copy-RetOiIg(int v, @NotNull FontWeight fontWeight0, int v1) {
        return ResourceFont.copy-F3nL8kk$default(this, v, fontWeight0, v1, this.getLoadingStrategy-PKNRLFQ(), null, 16, null);
    }

    public static ResourceFont copy-RetOiIg$default(ResourceFont resourceFont0, int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = resourceFont0.a;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = resourceFont0.getWeight();
        }
        if((v2 & 4) != 0) {
            v1 = resourceFont0.getStyle-_-LCdwA();
        }
        return resourceFont0.copy-RetOiIg(v, fontWeight0, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ResourceFont)) {
            return false;
        }
        if(this.a != ((ResourceFont)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getWeight(), ((ResourceFont)object0).getWeight())) {
            return false;
        }
        if(!FontStyle.equals-impl0(this.getStyle-_-LCdwA(), ((ResourceFont)object0).getStyle-_-LCdwA())) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((ResourceFont)object0).d) ? FontLoadingStrategy.equals-impl0(this.getLoadingStrategy-PKNRLFQ(), ((ResourceFont)object0).getLoadingStrategy-PKNRLFQ()) : false;
    }

    @Override  // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    public int getLoadingStrategy-PKNRLFQ() {
        return this.e;
    }

    @ExperimentalTextApi
    public static void getLoadingStrategy-PKNRLFQ$annotations() {
    }

    public final int getResId() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public int getStyle-_-LCdwA() {
        return this.c;
    }

    @ExperimentalTextApi
    @NotNull
    public final Settings getVariationSettings() {
        return this.d;
    }

    @Override  // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + (FontLoadingStrategy.hashCode-impl(this.getLoadingStrategy-PKNRLFQ()) + (FontStyle.hashCode-impl(this.getStyle-_-LCdwA()) + (this.getWeight().hashCode() + this.a * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.getWeight() + ", style=" + FontStyle.toString-impl(this.getStyle-_-LCdwA()) + ", loadingStrategy=" + FontLoadingStrategy.toString-impl(this.getLoadingStrategy-PKNRLFQ()) + ')';
    }
}

