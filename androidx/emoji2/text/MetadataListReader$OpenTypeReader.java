package androidx.emoji2.text;

import java.io.IOException;

interface MetadataListReader.OpenTypeReader {
    public static final int UINT16_BYTE_COUNT = 2;
    public static final int UINT32_BYTE_COUNT = 4;

    long getPosition();

    int readTag() throws IOException;

    long readUnsignedInt() throws IOException;

    int readUnsignedShort() throws IOException;

    void skip(int arg1) throws IOException;
}

