package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u0017\u0010\n\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\n\u0010\u000B\"\u0014\u0010\f\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000E\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\r\"\u0014\u0010\u000F\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u000F\u0010\r\"\u0014\u0010\u0010\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0010\u0010\r\"\u0014\u0010\u0011\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0014\u0010\u0012\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\r\"\u0014\u0010\u0013\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001A\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0014\"\u0014\u0010\u001B\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0014\"\u0014\u0010\u001C\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0014\"\u0014\u0010\u001D\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0014\"\u0014\u0010\u001E\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u001F\"\u0014\u0010 \u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b \u0010\u001F\"\u0014\u0010!\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b!\u0010\u001F\"\u0014\u0010\"\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u001F\"\u0014\u0010#\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b#\u0010\u001F\"\u0014\u0010$\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b$\u0010\u001F\"\u0014\u0010%\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b%\u0010\u001F\"\u0014\u0010&\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b&\u0010\u001F\"\u0014\u0010\'\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b\'\u0010\u001F\"\u0014\u0010(\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b(\u0010\u001F\"\u0014\u0010)\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b)\u0010\u001F\"\u0014\u0010*\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b*\u0010\u001F\"\u0014\u0010+\u001A\u00020\t8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b+\u0010,\u00A8\u0006-"}, d2 = {"", "token", "", "tokenDescription", "(B)Ljava/lang/String;", "", "c", "charToTokenClass", "(C)B", "", "escapeToChar", "(I)C", "lenientHint", "Ljava/lang/String;", "coerceInputValuesHint", "specialFlowingValuesHint", "ignoreUnknownKeysHint", "allowStructuredMapKeysHint", "NULL", "COMMA", "C", "COLON", "BEGIN_OBJ", "END_OBJ", "BEGIN_LIST", "END_LIST", "STRING", "STRING_ESC", "INVALID", "UNICODE_ESC", "TC_OTHER", "B", "TC_STRING", "TC_STRING_ESC", "TC_WHITESPACE", "TC_COMMA", "TC_COLON", "TC_BEGIN_OBJ", "TC_END_OBJ", "TC_BEGIN_LIST", "TC_END_LIST", "TC_EOF", "TC_INVALID", "asciiCaseMask", "I", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class AbstractJsonLexerKt {
    public static final char BEGIN_LIST = '[';
    public static final char BEGIN_OBJ = '{';
    public static final char COLON = ':';
    public static final char COMMA = ',';
    public static final char END_LIST = ']';
    public static final char END_OBJ = '}';
    public static final char INVALID = '\u0000';
    @NotNull
    public static final String NULL = "null";
    public static final char STRING = '\"';
    public static final char STRING_ESC = '\\';
    public static final byte TC_BEGIN_LIST = 8;
    public static final byte TC_BEGIN_OBJ = 6;
    public static final byte TC_COLON = 5;
    public static final byte TC_COMMA = 4;
    public static final byte TC_END_LIST = 9;
    public static final byte TC_END_OBJ = 7;
    public static final byte TC_EOF = 10;
    public static final byte TC_INVALID = 0x7F;
    public static final byte TC_OTHER = 0;
    public static final byte TC_STRING = 1;
    public static final byte TC_STRING_ESC = 2;
    public static final byte TC_WHITESPACE = 3;
    public static final char UNICODE_ESC = 'u';
    @NotNull
    public static final String allowStructuredMapKeysHint = "Use \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    public static final int asciiCaseMask = 0x20;
    @NotNull
    public static final String coerceInputValuesHint = "Use \'coerceInputValues = true\' in \'Json {}\' builder to coerce nulls if property has a default value.";
    @NotNull
    public static final String ignoreUnknownKeysHint = "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.";
    @NotNull
    public static final String lenientHint = "Use \'isLenient = true\' in \'Json {}\' builder to accept non-compliant JSON.";
    @NotNull
    public static final String specialFlowingValuesHint = "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'";

    public static final byte charToTokenClass(char c) {
        return c >= 0x7E ? 0 : CharMappings.CHAR_TO_TOKEN[c];
    }

    public static final char escapeToChar(int v) {
        return v >= 0x75 ? '\u0000' : CharMappings.ESCAPE_2_CHAR[v];
    }

    @NotNull
    public static final String tokenDescription(byte b) {
        switch(b) {
            case 1: {
                return "quotation mark \'\"\'";
            }
            case 2: {
                return "string escape sequence \'\\\'";
            }
            case 4: {
                return "comma \',\'";
            }
            case 5: {
                return "colon \':\'";
            }
            case 6: {
                return "start of the object \'{\'";
            }
            case 7: {
                return "end of the object \'}\'";
            }
            case 8: {
                return "start of the array \'[\'";
            }
            case 9: {
                return "end of the array \']\'";
            }
            case 10: {
                return "end of the input";
            }
            case 0x7F: {
                return "invalid token";
            }
            default: {
                return "valid token";
            }
        }
    }
}

