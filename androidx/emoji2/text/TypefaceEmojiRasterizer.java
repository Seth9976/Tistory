package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnyThread
@RequiresApi(19)
public class TypefaceEmojiRasterizer {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    public final int a;
    public final MetadataRepo b;
    public volatile int c;
    public static final ThreadLocal d;

    static {
        TypefaceEmojiRasterizer.d = new ThreadLocal();
    }

    public TypefaceEmojiRasterizer(MetadataRepo metadataRepo0, int v) {
        this.c = 0;
        this.b = metadataRepo0;
        this.a = v;
    }

    public final MetadataItem a() {
        ThreadLocal threadLocal0 = TypefaceEmojiRasterizer.d;
        MetadataItem metadataItem0 = (MetadataItem)threadLocal0.get();
        if(metadataItem0 == null) {
            metadataItem0 = new MetadataItem();
            threadLocal0.set(metadataItem0);
        }
        this.b.getMetadataList().list(metadataItem0, this.a);
        return metadataItem0;
    }

    public void draw(@NonNull Canvas canvas0, float f, float f1, @NonNull Paint paint0) {
        Typeface typeface0 = paint0.getTypeface();
        paint0.setTypeface(this.b.d);
        canvas0.drawText(this.b.getEmojiCharArray(), this.a * 2, 2, f, f1, paint0);
        paint0.setTypeface(typeface0);
    }

    public int getCodepointAt(int v) {
        return this.a().codepoints(v);
    }

    public int getCodepointsLength() {
        return this.a().codepointsLength();
    }

    @RestrictTo({Scope.LIBRARY})
    public short getCompatAdded() {
        return this.a().compatAdded();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.LIBRARY})
    public int getHasGlyph() {
        return this.c & 3;
    }

    public int getHeight() {
        return this.a().height();
    }

    @RestrictTo({Scope.LIBRARY})
    public int getId() {
        return this.a().id();
    }

    @RestrictTo({Scope.LIBRARY})
    public short getSdkAdded() {
        return this.a().sdkAdded();
    }

    @NonNull
    public Typeface getTypeface() {
        return this.b.d;
    }

    public int getWidth() {
        return this.a().width();
    }

    public boolean isDefaultEmoji() {
        return this.a().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        return (this.c & 4) > 0;
    }

    @RestrictTo({Scope.TESTS})
    public void resetHasGlyphCache() {
        if(this.isPreferredSystemRender()) {
            this.c = 4;
            return;
        }
        this.c = 0;
    }

    @RestrictTo({Scope.LIBRARY})
    public void setExclusion(boolean z) {
        int v = this.getHasGlyph();
        if(z) {
            this.c = v | 4;
            return;
        }
        this.c = v;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({Scope.LIBRARY})
    public void setHasGlyph(boolean z) {
        int v = this.c & 4;
        this.c = z ? v | 2 : v | 1;
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(", id:");
        stringBuilder0.append(Integer.toHexString(this.getId()));
        stringBuilder0.append(", codepoints:");
        int v = this.getCodepointsLength();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(Integer.toHexString(this.getCodepointAt(v1)));
            stringBuilder0.append(" ");
        }
        return stringBuilder0.toString();
    }
}

