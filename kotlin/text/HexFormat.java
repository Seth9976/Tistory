package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalStdlibApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0004\u001A\u001B\u0019\u001CB!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001D"}, d2 = {"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "getUpperCase", "()Z", "b", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "c", "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "Companion", "Builder", "BytesHexFormat", "NumberHexFormat", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
public final class HexFormat {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000E\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001A\u00020\u000F8F¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "build", "()Lkotlin/text/HexFormat;", "", "a", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "number", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Builder {
        public boolean a;
        public kotlin.text.HexFormat.BytesHexFormat.Builder b;
        public kotlin.text.HexFormat.NumberHexFormat.Builder c;

        @PublishedApi
        public Builder() {
            this.a = HexFormat.Companion.getDefault().getUpperCase();
        }

        @PublishedApi
        @NotNull
        public final HexFormat build() {
            BytesHexFormat hexFormat$BytesHexFormat0;
            boolean z = this.a;
            kotlin.text.HexFormat.BytesHexFormat.Builder hexFormat$BytesHexFormat$Builder0 = this.b;
            if(hexFormat$BytesHexFormat$Builder0 == null) {
                hexFormat$BytesHexFormat0 = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            else {
                hexFormat$BytesHexFormat0 = hexFormat$BytesHexFormat$Builder0.build$kotlin_stdlib();
                if(hexFormat$BytesHexFormat0 == null) {
                    hexFormat$BytesHexFormat0 = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
                }
            }
            kotlin.text.HexFormat.NumberHexFormat.Builder hexFormat$NumberHexFormat$Builder0 = this.c;
            if(hexFormat$NumberHexFormat$Builder0 != null) {
                NumberHexFormat hexFormat$NumberHexFormat0 = hexFormat$NumberHexFormat$Builder0.build$kotlin_stdlib();
                return hexFormat$NumberHexFormat0 == null ? new HexFormat(z, hexFormat$BytesHexFormat0, NumberHexFormat.Companion.getDefault$kotlin_stdlib()) : new HexFormat(z, hexFormat$BytesHexFormat0, hexFormat$NumberHexFormat0);
            }
            return new HexFormat(z, hexFormat$BytesHexFormat0, NumberHexFormat.Companion.getDefault$kotlin_stdlib());
        }

        @NotNull
        public final kotlin.text.HexFormat.BytesHexFormat.Builder getBytes() {
            if(this.b == null) {
                this.b = new kotlin.text.HexFormat.BytesHexFormat.Builder();
            }
            kotlin.text.HexFormat.BytesHexFormat.Builder hexFormat$BytesHexFormat$Builder0 = this.b;
            Intrinsics.checkNotNull(hexFormat$BytesHexFormat$Builder0);
            return hexFormat$BytesHexFormat$Builder0;
        }

        @NotNull
        public final kotlin.text.HexFormat.NumberHexFormat.Builder getNumber() {
            if(this.c == null) {
                this.c = new kotlin.text.HexFormat.NumberHexFormat.Builder();
            }
            kotlin.text.HexFormat.NumberHexFormat.Builder hexFormat$NumberHexFormat$Builder0 = this.c;
            Intrinsics.checkNotNull(hexFormat$NumberHexFormat$Builder0);
            return hexFormat$NumberHexFormat$Builder0;
        }

        public final boolean getUpperCase() {
            return this.a;
        }

        public final void setUpperCase(boolean z) {
            this.a = z;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 $2\u00020\u0001:\u0002%$B9\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\'\u0010\u0014\u001A\u00060\u000Ej\u0002`\u000F2\n\u0010\u0010\u001A\u00060\u000Ej\u0002`\u000F2\u0006\u0010\u0011\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001A\u0004\b\u001A\u0010\u0018R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\rR\u0017\u0010\b\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\rR\u0017\u0010\t\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001C\u001A\u0004\b#\u0010\r¨\u0006&"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "a", "I", "getBytesPerLine", "()I", "b", "getBytesPerGroup", "c", "Ljava/lang/String;", "getGroupSeparator", "d", "getByteSeparator", "e", "getBytePrefix", "f", "getByteSuffix", "Companion", "Builder", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BytesHexFormat {
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0007\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR*\u0010\u0014\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u001A\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000FR\"\u0010\u001C\u001A\u00020\u00158\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR*\u0010 \u001A\u00020\u00152\u0006\u0010\t\u001A\u00020\u00158\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u0019\"\u0004\b\u001F\u0010\u001BR*\u0010$\u001A\u00020\u00152\u0006\u0010\t\u001A\u00020\u00158\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001A\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001BR*\u0010(\u001A\u00020\u00152\u0006\u0010\t\u001A\u00020\u00158\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001A\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001B¨\u0006)"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "build", "", "value", "a", "I", "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerLine", "b", "getBytesPerGroup", "setBytesPerGroup", "bytesPerGroup", "", "c", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "groupSeparator", "d", "getByteSeparator", "setByteSeparator", "byteSeparator", "e", "getBytePrefix", "setBytePrefix", "bytePrefix", "f", "getByteSuffix", "setByteSuffix", "byteSuffix", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class kotlin.text.HexFormat.BytesHexFormat.Builder {
            public int a;
            public int b;
            public String c;
            public String d;
            public String e;
            public String f;

            public kotlin.text.HexFormat.BytesHexFormat.Builder() {
                this.a = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerLine();
                this.b = BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerGroup();
                this.c = "  ";
                this.d = "";
                this.e = "";
                this.f = "";
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @NotNull
            public final String getBytePrefix() {
                return this.e;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.d;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.f;
            }

            public final int getBytesPerGroup() {
                return this.b;
            }

            public final int getBytesPerLine() {
                return this.a;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.c;
            }

            public final void setBytePrefix(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "value");
                if(StringsKt__StringsKt.contains$default(s, '\n', false, 2, null) || StringsKt__StringsKt.contains$default(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + s);
                }
                this.e = s;
            }

            public final void setByteSeparator(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "value");
                if(StringsKt__StringsKt.contains$default(s, '\n', false, 2, null) || StringsKt__StringsKt.contains$default(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + s);
                }
                this.d = s;
            }

            public final void setByteSuffix(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "value");
                if(StringsKt__StringsKt.contains$default(s, '\n', false, 2, null) || StringsKt__StringsKt.contains$default(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + s);
                }
                this.f = s;
            }

            public final void setBytesPerGroup(int v) {
                if(v <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + v);
                }
                this.b = v;
            }

            public final void setBytesPerLine(int v) {
                if(v <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + v);
                }
                this.a = v;
            }

            public final void setGroupSeparator(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "<set-?>");
                this.c = s;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "Lkotlin/text/HexFormat$BytesHexFormat;", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.g;
            }
        }

        @NotNull
        public static final Companion Companion;
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public static final BytesHexFormat g;

        static {
            BytesHexFormat.Companion = new Companion(null);
            BytesHexFormat.g = new BytesHexFormat(0x7FFFFFFF, 0x7FFFFFFF, "  ", "", "", "");
        }

        public BytesHexFormat(int v, int v1, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "groupSeparator");
            Intrinsics.checkNotNullParameter(s1, "byteSeparator");
            Intrinsics.checkNotNullParameter(s2, "bytePrefix");
            Intrinsics.checkNotNullParameter(s3, "byteSuffix");
            super();
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
            this.e = s2;
            this.f = s3;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder stringBuilder0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(stringBuilder0, "sb");
            Intrinsics.checkNotNullParameter(s, "indent");
            stringBuilder0.append(s);
            stringBuilder0.append("bytesPerLine = ");
            stringBuilder0.append(this.a);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("bytesPerGroup = ");
            stringBuilder0.append(this.b);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("groupSeparator = \"");
            stringBuilder0.append(this.c);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("byteSeparator = \"");
            stringBuilder0.append(this.d);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("bytePrefix = \"");
            stringBuilder0.append(this.e);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("byteSuffix = \"");
            stringBuilder0.append(this.f);
            stringBuilder0.append("\"");
            return stringBuilder0;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.e;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.d;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.f;
        }

        public final int getBytesPerGroup() {
            return this.b;
        }

        public final int getBytesPerLine() {
            return this.a;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.c;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            StringBuilder stringBuilder1 = this.appendOptionsTo$kotlin_stdlib(stringBuilder0, "    ");
            stringBuilder1.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(...)");
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            return s;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "Lkotlin/text/HexFormat;", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class kotlin.text.HexFormat.Companion {
        public kotlin.text.HexFormat.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final HexFormat getDefault() {
            return HexFormat.d;
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return HexFormat.e;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001B2\u00020\u0001:\u0002\u001C\u001BB!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\'\u0010\u0011\u001A\u00060\u000Bj\u0002`\f2\n\u0010\r\u001A\u00060\u000Bj\u0002`\f2\u0006\u0010\u000E\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001A\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001D"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "a", "Ljava/lang/String;", "getPrefix", "b", "getSuffix", "c", "Z", "getRemoveLeadingZeros", "()Z", "Companion", "Builder", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NumberHexFormat {
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0007\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR*\u0010\u0014\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b8\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u000B\u001A\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000FR\"\u0010\u001C\u001A\u00020\u00158\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "build", "", "value", "a", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "prefix", "b", "getSuffix", "setSuffix", "suffix", "", "c", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "removeLeadingZeros", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class kotlin.text.HexFormat.NumberHexFormat.Builder {
            public String a;
            public String b;
            public boolean c;

            public kotlin.text.HexFormat.NumberHexFormat.Builder() {
                this.a = "";
                this.b = "";
                this.c = NumberHexFormat.Companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.a, this.b, this.c);
            }

            @NotNull
            public final String getPrefix() {
                return this.a;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.c;
            }

            @NotNull
            public final String getSuffix() {
                return this.b;
            }

            public final void setPrefix(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "value");
                if(StringsKt__StringsKt.contains$default(s, '\n', false, 2, null) || StringsKt__StringsKt.contains$default(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + s);
                }
                this.a = s;
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.c = z;
            }

            public final void setSuffix(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "value");
                if(StringsKt__StringsKt.contains$default(s, '\n', false, 2, null) || StringsKt__StringsKt.contains$default(s, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + s);
                }
                this.b = s;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "Lkotlin/text/HexFormat$NumberHexFormat;", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class kotlin.text.HexFormat.NumberHexFormat.Companion {
            public kotlin.text.HexFormat.NumberHexFormat.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.d;
            }
        }

        @NotNull
        public static final kotlin.text.HexFormat.NumberHexFormat.Companion Companion;
        public final String a;
        public final String b;
        public final boolean c;
        public static final NumberHexFormat d;

        static {
            NumberHexFormat.Companion = new kotlin.text.HexFormat.NumberHexFormat.Companion(null);
            NumberHexFormat.d = new NumberHexFormat("", "", false);
        }

        public NumberHexFormat(@NotNull String s, @NotNull String s1, boolean z) {
            Intrinsics.checkNotNullParameter(s, "prefix");
            Intrinsics.checkNotNullParameter(s1, "suffix");
            super();
            this.a = s;
            this.b = s1;
            this.c = z;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder stringBuilder0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(stringBuilder0, "sb");
            Intrinsics.checkNotNullParameter(s, "indent");
            stringBuilder0.append(s);
            stringBuilder0.append("prefix = \"");
            stringBuilder0.append(this.a);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("suffix = \"");
            stringBuilder0.append(this.b);
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append(s);
            stringBuilder0.append("removeLeadingZeros = ");
            stringBuilder0.append(this.c);
            return stringBuilder0;
        }

        @NotNull
        public final String getPrefix() {
            return this.a;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.c;
        }

        @NotNull
        public final String getSuffix() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            stringBuilder0.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
            StringBuilder stringBuilder1 = this.appendOptionsTo$kotlin_stdlib(stringBuilder0, "    ");
            stringBuilder1.append('\n');
            Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(...)");
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            return s;
        }
    }

    @NotNull
    public static final kotlin.text.HexFormat.Companion Companion;
    public final boolean a;
    public final BytesHexFormat b;
    public final NumberHexFormat c;
    public static final HexFormat d;
    public static final HexFormat e;

    static {
        HexFormat.Companion = new kotlin.text.HexFormat.Companion(null);
        HexFormat.d = new HexFormat(false, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
        HexFormat.e = new HexFormat(true, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
    }

    public HexFormat(boolean z, @NotNull BytesHexFormat hexFormat$BytesHexFormat0, @NotNull NumberHexFormat hexFormat$NumberHexFormat0) {
        Intrinsics.checkNotNullParameter(hexFormat$BytesHexFormat0, "bytes");
        Intrinsics.checkNotNullParameter(hexFormat$NumberHexFormat0, "number");
        super();
        this.a = z;
        this.b = hexFormat$BytesHexFormat0;
        this.c = hexFormat$NumberHexFormat0;
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.b;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.c;
    }

    public final boolean getUpperCase() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append("    upperCase = ");
        stringBuilder0.append(this.a);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append(",");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        StringBuilder stringBuilder1 = this.b.appendOptionsTo$kotlin_stdlib(stringBuilder0, "        ");
        stringBuilder1.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder1, "append(...)");
        stringBuilder0.append("    ),");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        StringBuilder stringBuilder2 = this.c.appendOptionsTo$kotlin_stdlib(stringBuilder0, "        ");
        stringBuilder2.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        stringBuilder0.append("    )");
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        stringBuilder0.append(")");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }
}

