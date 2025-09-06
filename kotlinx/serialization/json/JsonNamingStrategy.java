package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0003H&¨\u0006\n"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public interface JsonNamingStrategy {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0003\u0018\u00002\u00020\u0001R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001A\u0004\b\u000B\u0010\u0006¨\u0006\u000E"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "Lkotlinx/serialization/json/JsonNamingStrategy;", "b", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "()V", "SnakeCase", "c", "getKebabCase", "getKebabCase$annotations", "KebabCase", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1174#2:179\n1175#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    @ExperimentalSerializationApi
    public static final class Builtins {
        public static final Builtins a;
        public static final JsonNamingStrategy.Builtins.SnakeCase.1 b;
        public static final JsonNamingStrategy.Builtins.KebabCase.1 c;

        static {
            Builtins.a = new Builtins();  // 初始化器: Ljava/lang/Object;-><init>()V
            Builtins.b = new JsonNamingStrategy.Builtins.SnakeCase.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Builtins.c = new JsonNamingStrategy.Builtins.KebabCase.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public static final String access$convertCamelCase(Builtins jsonNamingStrategy$Builtins0, String s, char c) {
            jsonNamingStrategy$Builtins0.getClass();
            StringBuilder stringBuilder0 = new StringBuilder(s.length() * 2);
            Character character0 = null;
            int v1 = 0;
            for(int v = 0; v < s.length(); ++v) {
                int v2 = s.charAt(v);
                if(Character.isUpperCase(((char)v2))) {
                    if(v1 == 0 && stringBuilder0.length() > 0 && StringsKt___StringsKt.last(stringBuilder0) != c) {
                        stringBuilder0.append(c);
                    }
                    if(character0 != null) {
                        stringBuilder0.append(character0.charValue());
                    }
                    ++v1;
                    character0 = Character.valueOf(Character.toLowerCase(((char)v2)));
                }
                else {
                    if(character0 != null) {
                        if(v1 > 1 && Character.isLetter(((char)v2))) {
                            stringBuilder0.append(c);
                        }
                        stringBuilder0.append(character0);
                        character0 = null;
                        v1 = 0;
                    }
                    stringBuilder0.append(((char)v2));
                }
            }
            if(character0 != null) {
                stringBuilder0.append(character0);
            }
            String s1 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
            return s1;
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return Builtins.c;
        }

        @ExperimentalSerializationApi
        public static void getKebabCase$annotations() {
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return Builtins.b;
        }

        @ExperimentalSerializationApi
        public static void getSnakeCase$annotations() {
        }
    }

    @NotNull
    public static final Builtins Builtins;

    static {
        JsonNamingStrategy.Builtins = Builtins.a;
    }

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor arg1, int arg2, @NotNull String arg3);
}

