package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "", "ESCAPE_2_CHAR", "[C", "", "CHAR_TO_TOKEN", "[B", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CharMappings {
    @JvmField
    @NotNull
    public static final byte[] CHAR_TO_TOKEN;
    @JvmField
    @NotNull
    public static final char[] ESCAPE_2_CHAR;
    @NotNull
    public static final CharMappings INSTANCE;

    static {
        CharMappings.INSTANCE = new CharMappings();  // 初始化器: Ljava/lang/Object;-><init>()V
        CharMappings.ESCAPE_2_CHAR = new char[0x75];
        CharMappings.CHAR_TO_TOKEN = new byte[0x7E];
        for(int v1 = 0; v1 < 0x20; ++v1) {
        }
        CharMappings.a('b', 8);
        CharMappings.a('t', 9);
        CharMappings.a('n', 10);
        CharMappings.a('f', 12);
        CharMappings.a('r', 13);
        CharMappings.a('/', 0x2F);
        CharMappings.a('\"', 34);
        CharMappings.a('\\', 92);
        CharMappings.INSTANCE.getClass();
        for(int v = 0; v < 33; ++v) {
            CharMappings.CHAR_TO_TOKEN[v] = 0x7F;
        }
        CharMappings.CHAR_TO_TOKEN[9] = 3;
        CharMappings.CHAR_TO_TOKEN[10] = 3;
        CharMappings.CHAR_TO_TOKEN[13] = 3;
        CharMappings.CHAR_TO_TOKEN[0x20] = 3;
        CharMappings.CHAR_TO_TOKEN[44] = 4;
        CharMappings.CHAR_TO_TOKEN[58] = 5;
        CharMappings.CHAR_TO_TOKEN[0x7B] = 6;
        CharMappings.CHAR_TO_TOKEN[0x7D] = 7;
        CharMappings.CHAR_TO_TOKEN[91] = 8;
        CharMappings.CHAR_TO_TOKEN[93] = 9;
        CharMappings.CHAR_TO_TOKEN[34] = 1;
        CharMappings.CHAR_TO_TOKEN[92] = 2;
    }

    public static void a(char c, int v) {
        if(c != 0x75) {
            CharMappings.ESCAPE_2_CHAR[c] = (char)v;
        }
    }
}

