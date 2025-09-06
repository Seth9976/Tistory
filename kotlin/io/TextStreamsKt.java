package kotlin.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import s4.u1;
import wd.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001A%\u0010\u0005\u001A\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001A7\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0018\u0010\f\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000B\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u0017\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B*\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0011\u0010\u0012\u001A\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A#\u0010\u0019\u001A\u00020\u0018*\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001A\u001A\u0011\u0010\u001D\u001A\u00020\u001C*\u00020\u001B¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001F"}, d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", "forEachLine", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V", "", "readLines", "(Ljava/io/Reader;)Ljava/util/List;", "T", "Lkotlin/sequences/Sequence;", "block", "useLines", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "lineSequence", "(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;", "readText", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "copyTo", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "Ljava/net/URL;", "", "readBytes", "(Ljava/net/URL;)[B", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "TextStreamsKt")
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
public final class TextStreamsKt {
    public static final long copyTo(@NotNull Reader reader0, @NotNull Writer writer0, int v) {
        Intrinsics.checkNotNullParameter(reader0, "<this>");
        Intrinsics.checkNotNullParameter(writer0, "out");
        char[] arr_c = new char[v];
        int v1 = reader0.read(arr_c);
        long v2 = 0L;
        while(v1 >= 0) {
            writer0.write(arr_c, 0, v1);
            v2 += (long)v1;
            v1 = reader0.read(arr_c);
        }
        return v2;
    }

    public static long copyTo$default(Reader reader0, Writer writer0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x2000;
        }
        return TextStreamsKt.copyTo(reader0, writer0, v);
    }

    public static final void forEachLine(@NotNull Reader reader0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(reader0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        BufferedReader bufferedReader0 = reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, 0x2000);
        try {
            for(Object object0: TextStreamsKt.lineSequence(bufferedReader0)) {
                function10.invoke(object0);
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
    }

    @NotNull
    public static final Sequence lineSequence(@NotNull BufferedReader bufferedReader0) {
        Intrinsics.checkNotNullParameter(bufferedReader0, "<this>");
        return SequencesKt__SequencesKt.constrainOnce(new m(bufferedReader0));
    }

    @NotNull
    public static final byte[] readBytes(@NotNull URL uRL0) {
        byte[] arr_b;
        Intrinsics.checkNotNullParameter(uRL0, "<this>");
        InputStream inputStream0 = uRL0.openStream();
        try {
            Intrinsics.checkNotNull(inputStream0);
            arr_b = ByteStreamsKt.readBytes(inputStream0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(inputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(inputStream0, null);
        return arr_b;
    }

    @NotNull
    public static final List readLines(@NotNull Reader reader0) {
        Intrinsics.checkNotNullParameter(reader0, "<this>");
        List list0 = new ArrayList();
        TextStreamsKt.forEachLine(reader0, new u1(((ArrayList)list0), 2));
        return list0;
    }

    @NotNull
    public static final String readText(@NotNull Reader reader0) {
        Intrinsics.checkNotNullParameter(reader0, "<this>");
        StringWriter stringWriter0 = new StringWriter();
        TextStreamsKt.copyTo$default(reader0, stringWriter0, 0, 2, null);
        String s = stringWriter0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static final Object useLines(@NotNull Reader reader0, @NotNull Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(reader0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        BufferedReader bufferedReader0 = reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, 0x2000);
        try {
            object0 = function10.invoke(TextStreamsKt.lineSequence(bufferedReader0));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
        return object0;
    }
}

