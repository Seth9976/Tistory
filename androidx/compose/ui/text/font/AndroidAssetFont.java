package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u0013\u001A\u0004\u0018\u00010\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0015R\u001A\u0010\'\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001A\u0004\b&\u0010\u0015¨\u0006("}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "h", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "i", "Ljava/lang/String;", "getPath", "j", "getCacheKey", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable;
    public final AssetManager h;
    public final String i;
    public final String j;

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(assetManager0, s, fontWeight0, v, fontVariation$Settings0, null);
    }

    public AndroidAssetFont(AssetManager assetManager0, String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(fontWeight0, v, fontVariation$Settings0, null);
        this.h = assetManager0;
        this.i = s;
        this.setTypeface$ui_text_release(this.doLoad$ui_text_release(null));
        this.j = "asset:" + s;
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public Typeface doLoad$ui_text_release(@Nullable Context context0) {
        return k.a.a(this.h, this.i, context0, this.getVariationSettings());
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AndroidAssetFont)) {
            return false;
        }
        return Intrinsics.areEqual(this.i, ((AndroidAssetFont)object0).i) ? Intrinsics.areEqual(this.getVariationSettings(), ((AndroidAssetFont)object0).getVariationSettings()) : false;
    }

    @NotNull
    public final AssetManager getAssetManager() {
        return this.h;
    }

    @Override  // androidx.compose.ui.text.font.AndroidPreloadedFont
    @NotNull
    public String getCacheKey() {
        return this.j;
    }

    @NotNull
    public final String getPath() {
        return this.i;
    }

    @Override
    public int hashCode() {
        return this.getVariationSettings().hashCode() + this.i.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Font(assetManager, path=" + this.i + ", weight=" + this.getWeight() + ", style=" + FontStyle.toString-impl(this.getStyle-_-LCdwA()) + ')';
    }
}

