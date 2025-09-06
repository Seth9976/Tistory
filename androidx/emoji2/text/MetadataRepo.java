package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jeb.synthetic.TWR;

@AnyThread
@RequiresApi(19)
public final class MetadataRepo {
    public final MetadataList a;
    public final char[] b;
    public final a0 c;
    public final Typeface d;

    public MetadataRepo(Typeface typeface0, MetadataList metadataList0) {
        this.d = typeface0;
        this.a = metadataList0;
        this.c = new a0(0x400);
        this.b = new char[metadataList0.listLength() * 2];
        int v = metadataList0.listLength();
        for(int v1 = 0; v1 < v; ++v1) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = new TypefaceEmojiRasterizer(this, v1);
            typefaceEmojiRasterizer0.getId();
            Preconditions.checkNotNull(typefaceEmojiRasterizer0, "emoji metadata cannot be null");
            Preconditions.checkArgument(typefaceEmojiRasterizer0.getCodepointsLength() > 0, "invalid metadata codepoint length");
            int v2 = typefaceEmojiRasterizer0.getCodepointsLength();
            this.c.a(typefaceEmojiRasterizer0, 0, v2 - 1);
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull AssetManager assetManager0, @NonNull String s) throws IOException {
        MetadataList metadataList0;
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            Typeface typeface0 = Typeface.createFromAsset(assetManager0, s);
            InputStream inputStream0 = assetManager0.open(s);
            try {
                metadataList0 = z.b(inputStream0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            inputStream0.close();
            return new MetadataRepo(typeface0, metadataList0);
        }
        finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    @RestrictTo({Scope.TESTS})
    public static MetadataRepo create(@NonNull Typeface typeface0) {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface0, new MetadataList());
        }
        finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface0, @NonNull InputStream inputStream0) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface0, z.b(inputStream0));
        }
        finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface0, @NonNull ByteBuffer byteBuffer0) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.position(((int)z.a(new r(byteBuffer1)).a));
            return new MetadataRepo(typeface0, MetadataList.getRootAsMetadataList(byteBuffer1));
        }
        finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public char[] getEmojiCharArray() {
        return this.b;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public MetadataList getMetadataList() {
        return this.a;
    }
}

