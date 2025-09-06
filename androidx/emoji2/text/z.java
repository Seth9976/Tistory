package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class z {
    public static y a(MetadataListReader.OpenTypeReader metadataListReader$OpenTypeReader0) {
        long v3;
        metadataListReader$OpenTypeReader0.skip(4);
        int v = metadataListReader$OpenTypeReader0.readUnsignedShort();
        if(v > 100) {
            throw new IOException("Cannot read metadata.");
        }
        metadataListReader$OpenTypeReader0.skip(6);
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = -1L;
            if(v2 >= v) {
                break;
            }
            int v4 = metadataListReader$OpenTypeReader0.readTag();
            metadataListReader$OpenTypeReader0.skip(4);
            v3 = metadataListReader$OpenTypeReader0.readUnsignedInt();
            metadataListReader$OpenTypeReader0.skip(4);
            if(0x6D657461 == v4) {
                break;
            }
        }
        if(v3 != -1L) {
            metadataListReader$OpenTypeReader0.skip(((int)(v3 - metadataListReader$OpenTypeReader0.getPosition())));
            metadataListReader$OpenTypeReader0.skip(12);
            long v5 = metadataListReader$OpenTypeReader0.readUnsignedInt();
            while(((long)v1) < v5) {
                int v6 = metadataListReader$OpenTypeReader0.readTag();
                long v7 = metadataListReader$OpenTypeReader0.readUnsignedInt();
                long v8 = metadataListReader$OpenTypeReader0.readUnsignedInt();
                if(0x456D6A69 != v6 && 1701669481 != v6) {
                    ++v1;
                    continue;
                }
                return new y(v7 + v3, v8);
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList b(InputStream inputStream0) {
        x x0 = new x(inputStream0);
        y y0 = z.a(x0);
        x0.skip(((int)(y0.a - x0.d)));
        long v = y0.b;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(((int)v));
        int v1 = inputStream0.read(byteBuffer0.array());
        if(((long)v1) != v) {
            throw new IOException("Needed " + v + " bytes, got " + v1);
        }
        return MetadataList.getRootAsMetadataList(byteBuffer0);
    }
}

