package okhttp3;

import a5.b;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.l;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.p;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u001F\n\u0002\u0010\"\n\u0002\b\u0017\u0018\u0000 _2\u00020\u0001:\u0002`_Bc\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000B\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0012\u001A\u00020\u0010H\u0007\u00A2\u0006\u0004\b\r\u0010\u0011J\u000F\u0010\u0016\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0017\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\u001F\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u001C\u001A\u00020\u0007\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\r\u0010 \u001A\u00020\u0002\u00A2\u0006\u0004\b \u0010!J\u0017\u0010#\u001A\u0004\u0018\u00010\u00002\u0006\u0010\"\u001A\u00020\u0002\u00A2\u0006\u0004\b#\u0010$J\r\u0010&\u001A\u00020%\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010&\u001A\u0004\u0018\u00010%2\u0006\u0010\"\u001A\u00020\u0002\u00A2\u0006\u0004\b&\u0010(J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010-\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b-\u0010.J\u000F\u0010/\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b/\u0010!J\u000F\u00100\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b0\u0010!J\u000F\u0010\r\u001A\u00020\u0010H\u0007\u00A2\u0006\u0004\b1\u0010\u0011J\u000F\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b2\u0010\u0015J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b3\u0010!J\u000F\u00105\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b4\u0010!J\u000F\u0010\u0004\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b6\u0010!J\u000F\u00108\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b7\u0010!J\u000F\u0010\u0005\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b9\u0010!J\u000F\u0010\u0006\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b:\u0010!J\u000F\u0010\b\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\b;\u0010.J\u000F\u0010=\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\b<\u0010.J\u000F\u0010?\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b>\u0010!J\u0015\u0010B\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0007\u00A2\u0006\u0004\b@\u0010AJ\u0015\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0007\u00A2\u0006\u0004\bC\u0010AJ\u0011\u0010E\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\bD\u0010!J\u0011\u0010G\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\bF\u0010!J\u000F\u0010I\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\bH\u0010.J\u0015\u0010M\u001A\b\u0012\u0004\u0012\u00020\u00020JH\u0007\u00A2\u0006\u0004\bK\u0010LJ\u0011\u0010O\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\bN\u0010!J\u0011\u0010\f\u001A\u0004\u0018\u00010\u0002H\u0007\u00A2\u0006\u0004\bP\u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\b\u0003\u0010!R\u0017\u0010\u0004\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\bS\u0010R\u001A\u0004\b\u0004\u0010!R\u0017\u0010\u0005\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\bT\u0010R\u001A\u0004\b\u0005\u0010!R\u0017\u0010\u0006\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\bU\u0010R\u001A\u0004\b\u0006\u0010!R\u0017\u0010\b\u001A\u00020\u00078\u0007\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\b\b\u0010.R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\t8\u0007\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\b\n\u0010AR\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0007\u00A2\u0006\f\n\u0004\bZ\u0010R\u001A\u0004\b\f\u0010!R\u0017\u0010]\u001A\u00020*8\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R\u0011\u00105\u001A\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b5\u0010!R\u0011\u00108\u001A\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b8\u0010!R\u0011\u0010=\u001A\u00020\u00078G\u00A2\u0006\u0006\u001A\u0004\b=\u0010.R\u0011\u0010?\u001A\u00020\u00028G\u00A2\u0006\u0006\u001A\u0004\b?\u0010!R\u0017\u0010B\u001A\b\u0012\u0004\u0012\u00020\u00020\t8G\u00A2\u0006\u0006\u001A\u0004\bB\u0010AR\u0013\u0010E\u001A\u0004\u0018\u00010\u00028G\u00A2\u0006\u0006\u001A\u0004\bE\u0010!R\u0013\u0010G\u001A\u0004\u0018\u00010\u00028G\u00A2\u0006\u0006\u001A\u0004\bG\u0010!R\u0011\u0010I\u001A\u00020\u00078G\u00A2\u0006\u0006\u001A\u0004\bI\u0010.R\u0017\u0010M\u001A\b\u0012\u0004\u0012\u00020\u00020J8G\u00A2\u0006\u0006\u001A\u0004\bM\u0010LR\u0013\u0010O\u001A\u0004\u0018\u00010\u00028G\u00A2\u0006\u0006\u001A\u0004\bO\u0010!\u00A8\u0006a"}, d2 = {"Lokhttp3/HttpUrl;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "toUri", "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", "index", "queryParameterName", "(I)Ljava/lang/String;", "queryParameterValue", "redact", "()Ljava/lang/String;", "link", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", "query", "-deprecated_querySize", "querySize", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "a", "Ljava/lang/String;", "b", "c", "d", "e", "I", "f", "Ljava/util/List;", "h", "j", "Z", "isHttps", "()Z", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HttpUrl {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010!\n\u0002\b\u000E\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\u000B\u0010\u0006J\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0016\u0010\u0006J\u001D\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0015\u0010\u001B\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\f\u00A2\u0006\u0004\b\u001B\u0010\u000EJ\u0015\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001C\u0010\u0006J\u0017\u0010\u001D\u001A\u00020\u00002\b\u0010\u001D\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\u001D\u0010\u0006J\u0017\u0010\u001E\u001A\u00020\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\u001E\u0010\u0006J\u001F\u0010!\u001A\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u00042\b\u0010 \u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b!\u0010\"J\u001F\u0010%\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u00042\b\u0010$\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b%\u0010\"J\u001F\u0010&\u001A\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u00042\b\u0010 \u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b&\u0010\"J\u001F\u0010\'\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u00042\b\u0010$\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\'\u0010\"J\u0015\u0010(\u001A\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u0004\u00A2\u0006\u0004\b(\u0010\u0006J\u0015\u0010)\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u0004\u00A2\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001A\u00020\u00002\b\u0010*\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001A\u00020\u00002\b\u0010+\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b+\u0010\u0006J\u000F\u0010.\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b,\u0010-J\r\u00100\u001A\u00020/\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b2\u00103J!\u00108\u001A\u00020\u00002\b\u00104\u001A\u0004\u0018\u00010/2\u0006\u00105\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b6\u00107R$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u00103\"\u0004\b<\u0010=R\"\u0010\b\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010:\u001A\u0004\b?\u00103\"\u0004\b@\u0010=R\"\u0010\n\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010:\u001A\u0004\bB\u00103\"\u0004\bC\u0010=R$\u0010\u000B\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010:\u001A\u0004\bE\u00103\"\u0004\bF\u0010=R\"\u0010\r\u001A\u00020\f8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00040M8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR,\u0010V\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010M8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010O\u001A\u0004\bS\u0010Q\"\u0004\bT\u0010UR$\u0010+\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010:\u001A\u0004\bX\u00103\"\u0004\bY\u0010=\u00A8\u0006["}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "", "port", "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "a", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "(Ljava/lang/String;)V", "b", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "c", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "d", "getHost$okhttp", "setHost$okhttp", "e", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "f", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "g", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "h", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class Builder {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public static final int access$parsePort(Companion httpUrl$Builder$Companion0, String s, int v, int v1) {
                httpUrl$Builder$Companion0.getClass();
                try {
                    int v2 = Integer.parseInt(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v, v1, "", false, false, false, false, null, 0xF8, null));
                    if(1 <= v2 && v2 < 0x10000) {
                        return v2;
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
                return -1;
            }

            public static final int access$portColonOffset(Companion httpUrl$Builder$Companion0, String s, int v, int v1) {
                httpUrl$Builder$Companion0.getClass();
                while(v < v1) {
                    int v2 = s.charAt(v);
                    if(v2 == 91) {
                        do {
                            ++v;
                        }
                        while(v < v1 && s.charAt(v) != 93);
                    }
                    else if(v2 == 58) {
                        return v;
                    }
                    ++v;
                }
                return v1;
            }

            public static final int access$schemeDelimiterOffset(Companion httpUrl$Builder$Companion0, String s, int v, int v1) {
                httpUrl$Builder$Companion0.getClass();
                if(v1 - v >= 2) {
                    int v2 = s.charAt(v);
                    if(Intrinsics.compare(v2, 97) >= 0 && Intrinsics.compare(v2, 0x7A) <= 0 || Intrinsics.compare(v2, 65) >= 0 && Intrinsics.compare(v2, 90) <= 0) {
                        while(true) {
                            ++v;
                            if(v >= v1) {
                                break;
                            }
                            int v3 = s.charAt(v);
                            if((97 > v3 || v3 >= 0x7B) && (65 > v3 || v3 >= 91) && (0x30 > v3 || v3 >= 58)) {
                                switch(v3) {
                                    case 43: 
                                    case 45: 
                                    case 46: {
                                        break;
                                    }
                                    case 58: {
                                        return v;
                                    }
                                    default: {
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            public static final int access$slashCount(Companion httpUrl$Builder$Companion0, String s, int v, int v1) {
                httpUrl$Builder$Companion0.getClass();
                int v2 = 0;
                while(v < v1) {
                    switch(s.charAt(v)) {
                        case 0x2F: 
                        case 92: {
                            ++v2;
                            ++v;
                            continue;
                        }
                        default: {
                            return v2;
                        }
                    }
                }
                return v2;
            }
        }

        @NotNull
        public static final Companion Companion = null;
        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";
        public String a;
        public String b;
        public String c;
        public String d;
        public int e;
        public final ArrayList f;
        public List g;
        public String h;

        static {
            Builder.Companion = new Companion(null);
        }

        public Builder() {
            this.b = "";
            this.c = "";
            this.e = -1;
            ArrayList arrayList0 = new ArrayList();
            this.f = arrayList0;
            arrayList0.add("");
        }

        public final void a(String s, boolean z) {
            int v = 0;
            do {
                int v1 = Util.delimiterOffset(s, "/\\", v, s.length());
                this.d(s, v, v1, v1 < s.length(), z);
                v = v1 + 1;
            }
            while(v <= s.length());
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedPathSegment");
            this.d(s, 0, s.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedPathSegments");
            this.a(s, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "encodedName");
            if(this.g == null) {
                this.g = new ArrayList();
            }
            List list0 = this.g;
            Intrinsics.checkNotNull(list0);
            list0.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null));
            List list1 = this.g;
            Intrinsics.checkNotNull(list1);
            list1.add((s1 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null)));
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "pathSegment");
            this.d(s, 0, s.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "pathSegments");
            this.a(s, false);
            return this;
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            if(this.g == null) {
                this.g = new ArrayList();
            }
            List list0 = this.g;
            Intrinsics.checkNotNull(list0);
            list0.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null));
            List list1 = this.g;
            Intrinsics.checkNotNull(list1);
            list1.add((s1 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s1, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null)));
            return this;
        }

        // 去混淆评级： 低(20)
        public static boolean b(String s) {
            return Intrinsics.areEqual(s, ".") || p.equals(s, "%2e", true);
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList1;
            int v1;
            String s = this.a;
            if(s == null) {
                throw new IllegalStateException("scheme == null");
            }
            okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
            String s1 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(httpUrl$Companion0, this.b, 0, 0, false, 7, null);
            String s2 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(httpUrl$Companion0, this.c, 0, 0, false, 7, null);
            String s3 = this.d;
            if(s3 == null) {
                throw new IllegalStateException("host == null");
            }
            int v = this.e;
            if(v == -1) {
                String s4 = this.a;
                Intrinsics.checkNotNull(s4);
                v1 = httpUrl$Companion0.defaultPort(s4);
            }
            else {
                v1 = v;
            }
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.f, 10));
            for(Object object0: this.f) {
                arrayList0.add(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, ((String)object0), 0, 0, false, 7, null));
            }
            List list0 = this.g;
            if(list0 == null) {
                arrayList1 = null;
            }
            else {
                arrayList1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object1: list0) {
                    String s5 = (String)object1;
                    arrayList1.add((s5 == null ? null : okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s5, 0, 0, true, 3, null)));
                }
            }
            String s6 = this.h;
            return s6 == null ? new HttpUrl(s, s1, s2, s3, v1, arrayList0, arrayList1, null, "///") : new HttpUrl(s, s1, s2, s3, v1, arrayList0, arrayList1, okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s6, 0, 0, false, 7, null), "///");
        }

        // 去混淆评级： 低(40)
        public static boolean c(String s) {
            return Intrinsics.areEqual(s, "..") || p.equals(s, "%2e.", true) || p.equals(s, ".%2e", true) || p.equals(s, "%2e%2e", true);
        }

        public final void d(String s, int v, int v1, boolean z, boolean z1) {
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v, v1, " \"<>^`{}|/\\?#", z1, false, false, false, null, 0xF0, null);
            if(Builder.b(s1)) {
                return;
            }
            boolean z2 = Builder.c(s1);
            ArrayList arrayList0 = this.f;
            if(z2) {
                if(((String)arrayList0.remove(arrayList0.size() - 1)).length() == 0 && !arrayList0.isEmpty()) {
                    arrayList0.set(arrayList0.size() - 1, "");
                    return;
                }
                arrayList0.add("");
                return;
            }
            if(((CharSequence)arrayList0.get(arrayList0.size() - 1)).length() == 0) {
                arrayList0.set(arrayList0.size() - 1, s1);
            }
            else {
                arrayList0.add(s1);
            }
            if(z) {
                arrayList0.add("");
            }
        }

        public final void e(String s) {
            List list0 = this.g;
            Intrinsics.checkNotNull(list0);
            int v = list0.size() - 2;
            int v1 = ProgressionUtilKt.getProgressionLastElement(v, 0, -2);
            if(v1 <= v) {
                while(true) {
                    List list1 = this.g;
                    Intrinsics.checkNotNull(list1);
                    if(Intrinsics.areEqual(s, list1.get(v))) {
                        List list2 = this.g;
                        Intrinsics.checkNotNull(list2);
                        list2.remove(v + 1);
                        List list3 = this.g;
                        Intrinsics.checkNotNull(list3);
                        list3.remove(v);
                        List list4 = this.g;
                        Intrinsics.checkNotNull(list4);
                        if(list4.isEmpty()) {
                            this.g = null;
                            return;
                        }
                    }
                    if(v == v1) {
                        break;
                    }
                    v -= 2;
                }
            }
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String s) {
            this.h = s == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, "", true, false, false, true, null, 0xB3, null);
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedPassword");
            this.c = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedPath");
            if(!p.startsWith$default(s, "/", false, 2, null)) {
                throw new IllegalArgumentException(("unexpected encodedPath: " + s).toString());
            }
            this.f(0, s.length(), s);
            return this;
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String s) {
            List list0;
            if(s == null) {
                list0 = null;
            }
            else {
                okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, 0, 0, " \"\'<>#", true, false, true, false, null, 0xD3, null);
                list0 = s1 == null ? null : httpUrl$Companion0.toQueryNamesAndValues$okhttp(s1);
            }
            this.g = list0;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedUsername");
            this.b = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            return this;
        }

        public final void f(int v, int v1, String s) {
            if(v == v1) {
                return;
            }
            ArrayList arrayList0 = this.f;
            switch(s.charAt(v)) {
                case 0x2F: 
                case 92: {
                    arrayList0.clear();
                    arrayList0.add("");
                    ++v;
                    break;
                }
                default: {
                    arrayList0.set(arrayList0.size() - 1, "");
                }
            }
        alab1:
            while(true) {
                for(int v2 = v; true; v2 = v + 1) {
                    if(v2 >= v1) {
                        break alab1;
                    }
                    v = Util.delimiterOffset(s, "/\\", v2, v1);
                    boolean z = v < v1;
                    this.d(s, v2, v, z, true);
                    if(!z) {
                        break;
                    }
                }
            }
        }

        @NotNull
        public final Builder fragment(@Nullable String s) {
            this.h = s == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, "", false, false, false, true, null, 0xBB, null);
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.h;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.c;
        }

        @NotNull
        public final List getEncodedPathSegments$okhttp() {
            return this.f;
        }

        @Nullable
        public final List getEncodedQueryNamesAndValues$okhttp() {
            return this.g;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.b;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.d;
        }

        public final int getPort$okhttp() {
            return this.e;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.a;
        }

        @NotNull
        public final Builder host(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "host");
            String s1 = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, 0, 0, false, 7, null));
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected host: " + s);
            }
            this.d = s1;
            return this;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl0, @NotNull String s) {
            int v12;
            int v11;
            int v10;
            int v7;
            int v4;
            String s1 = s;
            Intrinsics.checkNotNullParameter(s1, "input");
            int v = Util.indexOfFirstNonAsciiWhitespace$default(s1, 0, 0, 3, null);
            int v1 = Util.indexOfLastNonAsciiWhitespace$default(s1, v, 0, 2, null);
            Companion httpUrl$Builder$Companion0 = Builder.Companion;
            int v2 = Companion.access$schemeDelimiterOffset(httpUrl$Builder$Companion0, s1, v, v1);
            if(v2 != -1) {
                if(p.startsWith(s1, "https:", v, true)) {
                    this.a = "https";
                    v += 6;
                    goto label_20;
                }
                if(p.startsWith(s1, "http:", v, true)) {
                    this.a = "http";
                    v += 5;
                    goto label_20;
                }
                String s2 = s1.substring(0, v2);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but was \'" + s2 + '\'');
            }
            if(httpUrl0 != null) {
                this.a = httpUrl0.scheme();
            label_20:
                int v3 = Companion.access$slashCount(httpUrl$Builder$Companion0, s1, v, v1);
                if(v3 < 2 && httpUrl0 != null && Intrinsics.areEqual(httpUrl0.scheme(), this.a)) {
                    this.b = httpUrl0.encodedUsername();
                    this.c = httpUrl0.encodedPassword();
                    this.d = httpUrl0.host();
                    this.e = httpUrl0.port();
                    this.f.clear();
                    Collection collection0 = httpUrl0.encodedPathSegments();
                    this.f.addAll(collection0);
                    if(v == v1 || s1.charAt(v) == 35) {
                        this.encodedQuery(httpUrl0.encodedQuery());
                    }
                    v4 = v1;
                    goto label_81;
                }
                int v5 = 0;
                boolean z = false;
                int v6 = v + v3;
                while(true) {
                    v7 = Util.delimiterOffset(s1, "@/\\?#", v6, v1);
                    int v8 = v7 == v1 ? -1 : s1.charAt(v7);
                    if(v8 == -1 || v8 == 35 || v8 == 0x2F || (v8 == 0x3F || v8 == 92)) {
                        break;
                    }
                    if(v8 == 0x40) {
                        if(v5 == 0) {
                            int v9 = Util.delimiterOffset(s1, ':', v6, v7);
                            okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                            String s3 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, v6, v9, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                            if(z) {
                                s3 = b.q(new StringBuilder(), this.b, "%40", s3);
                            }
                            this.b = s3;
                            if(v9 == v7) {
                                v10 = v7;
                                v11 = 0;
                            }
                            else {
                                v10 = v7;
                                this.c = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, v9 + 1, v7, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                                v11 = 1;
                            }
                            v5 = v11;
                            v12 = v1;
                            z = true;
                        }
                        else {
                            v10 = v7;
                            v12 = v1;
                            this.c = this.c + "%40" + okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v6, v10, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 0xF0, null);
                        }
                        v6 = v10 + 1;
                        v1 = v12;
                    }
                }
                v4 = v1;
                Companion httpUrl$Builder$Companion1 = Builder.Companion;
                int v13 = Companion.access$portColonOffset(httpUrl$Builder$Companion1, s1, v6, v7);
                if(v13 + 1 < v7) {
                    this.d = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, v6, v13, false, 4, null));
                    int v14 = Companion.access$parsePort(httpUrl$Builder$Companion1, s1, v13 + 1, v7);
                    this.e = v14;
                    if(v14 == -1) {
                        String s4 = s1.substring(v13 + 1, v7);
                        Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String…ing(startIndex, endIndex)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + s4 + '\"').toString());
                    }
                }
                else {
                    this.d = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, s, v6, v13, false, 4, null));
                    String s5 = this.a;
                    Intrinsics.checkNotNull(s5);
                    this.e = HttpUrl.Companion.defaultPort(s5);
                }
                if(this.d != null) {
                    v = v7;
                label_81:
                    int v15 = Util.delimiterOffset(s1, "?#", v, v4);
                    this.f(v, v15, s1);
                    if(v15 < v4 && s1.charAt(v15) == 0x3F) {
                        int v16 = Util.delimiterOffset(s1, '#', v15, v4);
                        String s6 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v15 + 1, v16, " \"\'<>#", true, false, true, false, null, 0xD0, null);
                        this.g = HttpUrl.Companion.toQueryNamesAndValues$okhttp(s6);
                        v15 = v16;
                    }
                    if(v15 < v4 && s1.charAt(v15) == 35) {
                        this.h = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, v15 + 1, v4, "", true, false, false, true, null, 0xB0, null);
                    }
                    return this;
                }
                String s7 = s1.substring(v6, v13);
                Intrinsics.checkNotNullExpressionValue(s7, "this as java.lang.String…ing(startIndex, endIndex)");
                throw new IllegalArgumentException(("Invalid URL host: \"" + s7 + '\"').toString());
            }
            if(s.length() > 6) {
                s1 = StringsKt___StringsKt.take(s1, 6) + "...";
            }
            throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but no scheme was found for " + s1);
        }

        @NotNull
        public final Builder password(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "password");
            this.c = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            return this;
        }

        @NotNull
        public final Builder port(int v) {
            if(1 > v || v >= 0x10000) {
                throw new IllegalArgumentException(("unexpected port: " + v).toString());
            }
            this.e = v;
            return this;
        }

        @NotNull
        public final Builder query(@Nullable String s) {
            List list0;
            if(s == null) {
                list0 = null;
            }
            else {
                okhttp3.HttpUrl.Companion httpUrl$Companion0 = HttpUrl.Companion;
                String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(httpUrl$Companion0, s, 0, 0, " \"\'<>#", false, false, true, false, null, 0xDB, null);
                list0 = s1 == null ? null : httpUrl$Companion0.toQueryNamesAndValues$okhttp(s1);
            }
            this.g = list0;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String s = this.d;
            String s1 = null;
            this.d = s == null ? null : new Regex("[\"<>^`{|}]").replace(s, "");
            ArrayList arrayList0 = this.f;
            int v = arrayList0.size();
            for(int v2 = 0; v2 < v; ++v2) {
                String s2 = (String)arrayList0.get(v2);
                arrayList0.set(v2, okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s2, 0, 0, "[]", true, true, false, false, null, 0xE3, null));
            }
            List list0 = this.g;
            if(list0 != null) {
                int v3 = list0.size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    String s3 = (String)list0.get(v1);
                    list0.set(v1, (s3 == null ? null : okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s3, 0, 0, "\\^`{|}", true, true, true, false, null, 0xC3, null)));
                }
            }
            String s4 = this.h;
            if(s4 != null) {
                s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 0xA3, null);
            }
            this.h = s1;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedName");
            if(this.g == null) {
                return this;
            }
            this.e(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\'<>#&=", true, false, true, false, null, 0xD3, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            if(this.g == null) {
                return this;
            }
            this.e(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 0xDB, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int v) {
            ArrayList arrayList0 = this.f;
            arrayList0.remove(v);
            if(arrayList0.isEmpty()) {
                arrayList0.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "scheme");
            if(p.equals(s, "http", true)) {
                this.a = "http";
                return this;
            }
            if(!p.equals(s, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: " + s);
            }
            this.a = "https";
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String s) {
            this.h = s;
        }

        public final void setEncodedPassword$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.c = s;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int v, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "encodedPathSegment");
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 0xF3, null);
            this.f.set(v, s1);
            if(Builder.b(s1) || Builder.c(s1)) {
                throw new IllegalArgumentException(("unexpected path segment: " + s).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List list0) {
            this.g = list0;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "encodedName");
            this.removeAllEncodedQueryParameters(s);
            this.addEncodedQueryParameter(s, s1);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.b = s;
        }

        public final void setHost$okhttp(@Nullable String s) {
            this.d = s;
        }

        @NotNull
        public final Builder setPathSegment(int v, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "pathSegment");
            String s1 = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            if(Builder.b(s1) || Builder.c(s1)) {
                throw new IllegalArgumentException(("unexpected path segment: " + s).toString());
            }
            this.f.set(v, s1);
            return this;
        }

        public final void setPort$okhttp(int v) {
            this.e = v;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            this.removeAllQueryParameters(s);
            this.addQueryParameter(s, s1);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String s) {
            this.a = s;
        }

        @Override
        @NotNull
        public String toString() [...] // 潜在的解密器

        @NotNull
        public final Builder username(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "username");
            this.b = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, s, 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 0xFB, null);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000E\u001A\u00020\u000B*\b\u0012\u0004\u0012\u00020\u00020\u00072\n\u0010\n\u001A\u00060\bj\u0002`\tH\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\'\u0010\u0010\u001A\u00020\u000B*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\n\u0010\n\u001A\u00060\bj\u0002`\tH\u0000\u00A2\u0006\u0004\b\u000F\u0010\rJ\u001B\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011*\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0018\u001A\u00020\u0015*\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001A\u001A\u0004\u0018\u00010\u0015*\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001A\u001A\u0004\u0018\u00010\u0015*\u00020\u001BH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u001CJ\u0015\u0010\u001A\u001A\u0004\u0018\u00010\u0015*\u00020\u001DH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u001EJ\u0017\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u001F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b \u0010\u0017J\u0019\u0010\u0019\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u001F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b!\u0010\u0017J\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u001F\u001A\u00020\u001BH\u0007\u00A2\u0006\u0004\b \u0010\u001CJ\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0006\u0010\"\u001A\u00020\u001DH\u0007\u00A2\u0006\u0004\b \u0010\u001EJ1\u0010)\u001A\u00020\u0002*\u00020\u00022\b\b\u0002\u0010#\u001A\u00020\u00042\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010&\u001A\u00020%H\u0000\u00A2\u0006\u0004\b\'\u0010(Jc\u00102\u001A\u00020\u0002*\u00020\u00022\b\b\u0002\u0010#\u001A\u00020\u00042\b\b\u0002\u0010$\u001A\u00020\u00042\u0006\u0010*\u001A\u00020\u00022\b\b\u0002\u0010+\u001A\u00020%2\b\b\u0002\u0010,\u001A\u00020%2\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010-\u001A\u00020%2\n\b\u0002\u0010/\u001A\u0004\u0018\u00010.H\u0000\u00A2\u0006\u0004\b0\u00101R\u0014\u00103\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b6\u00104R\u0014\u00108\u001A\u0002078\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b:\u00104R\u0014\u0010;\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b;\u00104R\u0014\u0010<\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b<\u00104R\u0014\u0010=\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b=\u00104R\u0014\u0010>\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b>\u00104R\u0014\u0010?\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b?\u00104R\u0014\u0010@\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b@\u00104R\u0014\u0010A\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bA\u00104\u00A8\u0006B"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "", "scheme", "", "defaultPort", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "pos", "limit", "", "plusIsSpace", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class okhttp3.HttpUrl.Companion {
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        public final HttpUrl -deprecated_get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return this.get(s);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        public final HttpUrl -deprecated_get(@NotNull URI uRI0) {
            Intrinsics.checkNotNullParameter(uRI0, "uri");
            return this.get(uRI0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        public final HttpUrl -deprecated_get(@NotNull URL uRL0) {
            Intrinsics.checkNotNullParameter(uRL0, "url");
            return this.get(uRL0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_parse")
        @Nullable
        public final HttpUrl -deprecated_parse(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return this.parse(s);
        }

        public okhttp3.HttpUrl.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static boolean a(int v, int v1, String s) {
            return v + 2 < v1 && s.charAt(v) == 37 && Util.parseHexDigit(s.charAt(v + 1)) != -1 && Util.parseHexDigit(s.charAt(v + 2)) != -1;
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String s, int v, int v1, @NotNull String s1, boolean z, boolean z1, boolean z2, boolean z3, @Nullable Charset charset0) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            Intrinsics.checkNotNullParameter(s1, "encodeSet");
            int v2 = v;
            while(v2 < v1) {
                int v3 = s.codePointAt(v2);
                if(v3 >= 0x20 && v3 != 0x7F && (v3 < 0x80 || z3) && !StringsKt__StringsKt.contains$default(s1, ((char)v3), false, 2, null) && (v3 != 37 || z && (!z1 || okhttp3.HttpUrl.Companion.a(v2, v1, s))) && (v3 != 43 || !z2)) {
                    v2 += Character.charCount(v3);
                    continue;
                }
                Buffer buffer0 = new Buffer();
                buffer0.writeUtf8(s, v, v2);
                Buffer buffer1 = null;
                while(v2 < v1) {
                    int v4 = s.codePointAt(v2);
                    if(!z || v4 != 9 && v4 != 10 && v4 != 12 && v4 != 13) {
                        if(v4 == 43 && z2) {
                            buffer0.writeUtf8((z ? "+" : "%2B"));
                        }
                        else if(v4 < 0x20 || v4 == 0x7F || v4 >= 0x80 && !z3 || StringsKt__StringsKt.contains$default(s1, ((char)v4), false, 2, null) || v4 == 37 && (!z || z1 && !okhttp3.HttpUrl.Companion.a(v2, v1, s))) {
                            if(buffer1 == null) {
                                buffer1 = new Buffer();
                            }
                            if(charset0 == null || Intrinsics.areEqual(charset0, StandardCharsets.UTF_8)) {
                                buffer1.writeUtf8CodePoint(v4);
                            }
                            else {
                                buffer1.writeString(s, v2, Character.charCount(v4) + v2, charset0);
                            }
                            while(!buffer1.exhausted()) {
                                int v5 = buffer1.readByte();
                                buffer0.writeByte(37);
                                buffer0.writeByte(((int)HttpUrl.k[(v5 & 0xFF) >> 4 & 15]));
                                buffer0.writeByte(((int)HttpUrl.k[v5 & 15]));
                            }
                        }
                        else {
                            buffer0.writeUtf8CodePoint(v4);
                        }
                    }
                    v2 += Character.charCount(v4);
                }
                return "";
            }
            String s2 = s.substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
            return s2;
        }

        public static String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion httpUrl$Companion0, String s, int v, int v1, String s1, boolean z, boolean z1, boolean z2, boolean z3, Charset charset0, int v2, Object object0) {
            int v3 = (v2 & 1) == 0 ? v : 0;
            int v4 = (v2 & 2) == 0 ? v1 : s.length();
            boolean z4 = (v2 & 8) == 0 ? z : false;
            boolean z5 = (v2 & 16) == 0 ? z1 : false;
            boolean z6 = (v2 & 0x20) == 0 ? z2 : false;
            boolean z7 = (v2 & 0x40) == 0 ? z3 : false;
            return (v2 & 0x80) == 0 ? httpUrl$Companion0.canonicalize$okhttp(s, v3, v4, s1, z4, z5, z6, z7, charset0) : httpUrl$Companion0.canonicalize$okhttp(s, v3, v4, s1, z4, z5, z6, z7, null);
        }

        @JvmStatic
        public final int defaultPort(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "scheme");
            if(Intrinsics.areEqual(s, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(s, "https") ? 443 : -1;
        }

        @JvmName(name = "get")
        @JvmStatic
        @NotNull
        public final HttpUrl get(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            return new Builder().parse$okhttp(null, s).build();
        }

        @JvmName(name = "get")
        @JvmStatic
        @Nullable
        public final HttpUrl get(@NotNull URI uRI0) {
            Intrinsics.checkNotNullParameter(uRI0, "<this>");
            String s = uRI0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString()");
            return this.parse(s);
        }

        @JvmName(name = "get")
        @JvmStatic
        @Nullable
        public final HttpUrl get(@NotNull URL uRL0) {
            Intrinsics.checkNotNullParameter(uRL0, "<this>");
            String s = uRL0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString()");
            return this.parse(s);
        }

        @JvmName(name = "parse")
        @JvmStatic
        @Nullable
        public final HttpUrl parse(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            try {
                return this.get(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String s, int v, int v1, boolean z) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            int v2 = v;
            while(v2 < v1) {
                int v3 = s.charAt(v2);
                if(v3 != 37 && (v3 != 43 || !z)) {
                    ++v2;
                    continue;
                }
                Buffer buffer0 = new Buffer();
                buffer0.writeUtf8(s, v, v2);
                while(v2 < v1) {
                    int v4 = s.codePointAt(v2);
                    if(v4 == 37 && v2 + 2 < v1) {
                        int v5 = Util.parseHexDigit(s.charAt(v2 + 1));
                        int v6 = Util.parseHexDigit(s.charAt(v2 + 2));
                        if(v5 != -1 && v6 != -1) {
                            buffer0.writeByte((v5 << 4) + v6);
                            v2 += 3;
                            continue;
                        }
                    }
                    else if(v4 == 43 && z) {
                        buffer0.writeByte(0x20);
                        ++v2;
                        continue;
                    }
                    buffer0.writeUtf8CodePoint(v4);
                    v2 += Character.charCount(v4);
                }
                return "";
            }
            String s1 = s.substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            return s1;
        }

        public static String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion httpUrl$Companion0, String s, int v, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = 0;
            }
            if((v2 & 2) != 0) {
                v1 = s.length();
            }
            if((v2 & 4) != 0) {
                z = false;
            }
            return httpUrl$Companion0.percentDecode$okhttp(s, v, v1, z);
        }

        public final void toPathString$okhttp(@NotNull List list0, @NotNull StringBuilder stringBuilder0) {
            Intrinsics.checkNotNullParameter(list0, "<this>");
            Intrinsics.checkNotNullParameter(stringBuilder0, "out");
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append('/');
                stringBuilder0.append(((String)list0.get(v1)));
            }
        }

        @NotNull
        public final List toQueryNamesAndValues$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            List list0 = new ArrayList();
            for(int v = 0; v <= s.length(); v = v1 + 1) {
                int v1 = StringsKt__StringsKt.indexOf$default(s, '&', v, false, 4, null);
                if(v1 == -1) {
                    v1 = s.length();
                }
                int v2 = StringsKt__StringsKt.indexOf$default(s, '=', v, false, 4, null);
                if(v2 == -1 || v2 > v1) {
                    String s3 = s.substring(v, v1);
                    Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s3);
                    list0.add(null);
                }
                else {
                    String s1 = s.substring(v, v2);
                    Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s1);
                    String s2 = s.substring(v2 + 1, v1);
                    Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                    list0.add(s2);
                }
            }
            return list0;
        }

        public final void toQueryString$okhttp(@NotNull List list0, @NotNull StringBuilder stringBuilder0) {
            Intrinsics.checkNotNullParameter(list0, "<this>");
            Intrinsics.checkNotNullParameter(stringBuilder0, "out");
            IntProgression intProgression0 = c.step(c.until(0, list0.size()), 2);
            int v = intProgression0.getFirst();
            int v1 = intProgression0.getLast();
            int v2 = intProgression0.getStep();
            if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
                while(true) {
                    String s = (String)list0.get(v);
                    String s1 = (String)list0.get(v + 1);
                    if(v > 0) {
                        stringBuilder0.append('&');
                    }
                    stringBuilder0.append(s);
                    if(s1 != null) {
                        stringBuilder0.append('=');
                        stringBuilder0.append(s1);
                    }
                    if(v == v1) {
                        break;
                    }
                    v += v2;
                }
            }
        }
    }

    @NotNull
    public static final okhttp3.HttpUrl.Companion Companion = null;
    @NotNull
    public static final String FORM_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#&!$(),~";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";
    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&\'(),/:;<=>?@[]\\^`{|}~";
    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"\'<>#&=";
    @NotNull
    public static final String QUERY_ENCODE_SET = " \"\'<>#";
    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"\':;<=>@[]^`{}|/\\?#";
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;
    public static final char[] k;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @JvmName(name = "-deprecated_encodedFragment")
    @Nullable
    public final String -deprecated_encodedFragment() {
        return this.encodedFragment();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @JvmName(name = "-deprecated_encodedPassword")
    @NotNull
    public final String -deprecated_encodedPassword() {
        return this.encodedPassword();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @JvmName(name = "-deprecated_encodedPath")
    @NotNull
    public final String -deprecated_encodedPath() {
        return this.encodedPath();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @JvmName(name = "-deprecated_encodedPathSegments")
    @NotNull
    public final List -deprecated_encodedPathSegments() {
        return this.encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @JvmName(name = "-deprecated_encodedQuery")
    @Nullable
    public final String -deprecated_encodedQuery() {
        return this.encodedQuery();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @JvmName(name = "-deprecated_encodedUsername")
    @NotNull
    public final String -deprecated_encodedUsername() {
        return this.encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @JvmName(name = "-deprecated_fragment")
    @Nullable
    public final String -deprecated_fragment() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @JvmName(name = "-deprecated_host")
    @NotNull
    public final String -deprecated_host() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @JvmName(name = "-deprecated_password")
    @NotNull
    public final String -deprecated_password() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @JvmName(name = "-deprecated_pathSegments")
    @NotNull
    public final List -deprecated_pathSegments() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @JvmName(name = "-deprecated_pathSize")
    public final int -deprecated_pathSize() {
        return this.pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    @JvmName(name = "-deprecated_port")
    public final int -deprecated_port() {
        return this.e;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}))
    @JvmName(name = "-deprecated_query")
    @Nullable
    public final String -deprecated_query() {
        return this.query();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @JvmName(name = "-deprecated_queryParameterNames")
    @NotNull
    public final Set -deprecated_queryParameterNames() {
        return this.queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @JvmName(name = "-deprecated_querySize")
    public final int -deprecated_querySize() {
        return this.querySize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    @NotNull
    public final String -deprecated_scheme() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @JvmName(name = "-deprecated_uri")
    @NotNull
    public final URI -deprecated_uri() {
        return this.uri();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    public final URL -deprecated_url() {
        return this.url();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "username", imports = {}))
    @JvmName(name = "-deprecated_username")
    @NotNull
    public final String -deprecated_username() {
        return this.b;
    }

    static {
        HttpUrl.Companion = new okhttp3.HttpUrl.Companion(null);
        HttpUrl.k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public HttpUrl(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, int v, @NotNull List list0, @Nullable List list1, @Nullable String s4, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "scheme");
        Intrinsics.checkNotNullParameter(s1, "username");
        Intrinsics.checkNotNullParameter(s2, "password");
        Intrinsics.checkNotNullParameter(s3, "host");
        Intrinsics.checkNotNullParameter(list0, "pathSegments");
        Intrinsics.checkNotNullParameter(s5, "url");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
        this.f = list0;
        this.g = list1;
        this.h = s4;
        this.i = s5;
        this.j = Intrinsics.areEqual(s, "https");
    }

    @JvmStatic
    public static final int defaultPort(@NotNull String s) {
        return HttpUrl.Companion.defaultPort(s);
    }

    @JvmName(name = "encodedFragment")
    @Nullable
    public final String encodedFragment() {
        if(this.h == null) {
            return null;
        }
        int v = StringsKt__StringsKt.indexOf$default(this.i, '#', 0, false, 6, null);
        String s = this.i.substring(v + 1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String).substring(startIndex)");
        return s;
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String encodedPassword() {
        if(this.c.length() == 0) {
            return "";
        }
        int v = StringsKt__StringsKt.indexOf$default(this.i, ':', this.a.length() + 3, false, 4, null);
        int v1 = StringsKt__StringsKt.indexOf$default(this.i, '@', 0, false, 6, null);
        String s = this.i.substring(v + 1, v1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String encodedPath() {
        int v = StringsKt__StringsKt.indexOf$default(this.i, '/', this.a.length() + 3, false, 4, null);
        int v1 = Util.delimiterOffset(this.i, "?#", v, this.i.length());
        String s = this.i.substring(v, v1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final List encodedPathSegments() {
        int v = StringsKt__StringsKt.indexOf$default(this.i, '/', this.a.length() + 3, false, 4, null);
        String s = this.i;
        int v1 = Util.delimiterOffset(s, "?#", v, s.length());
        List list0 = new ArrayList();
        while(v < v1) {
            int v2 = Util.delimiterOffset(s, '/', v + 1, v1);
            String s1 = s.substring(v + 1, v2);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            list0.add(s1);
            v = v2;
        }
        return list0;
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String encodedQuery() {
        if(this.g == null) {
            return null;
        }
        int v = StringsKt__StringsKt.indexOf$default(this.i, '?', 0, false, 6, null);
        int v1 = Util.delimiterOffset(this.i, '#', v + 1, this.i.length());
        String s = this.i.substring(v + 1, v1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String encodedUsername() {
        if(this.b.length() == 0) {
            return "";
        }
        int v = this.a.length();
        int v1 = Util.delimiterOffset(this.i, ":@", v + 3, this.i.length());
        String s = this.i.substring(v + 3, v1);
        Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
        return s;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof HttpUrl && Intrinsics.areEqual(((HttpUrl)object0).i, this.i);
    }

    @JvmName(name = "fragment")
    @Nullable
    public final String fragment() {
        return this.h;
    }

    @JvmName(name = "get")
    @JvmStatic
    @NotNull
    public static final HttpUrl get(@NotNull String s) {
        return HttpUrl.Companion.get(s);
    }

    @JvmName(name = "get")
    @JvmStatic
    @Nullable
    public static final HttpUrl get(@NotNull URI uRI0) {
        return HttpUrl.Companion.get(uRI0);
    }

    @JvmName(name = "get")
    @JvmStatic
    @Nullable
    public static final HttpUrl get(@NotNull URL uRL0) {
        return HttpUrl.Companion.get(uRL0);
    }

    @Override
    public int hashCode() {
        return this.i.hashCode();
    }

    @JvmName(name = "host")
    @NotNull
    public final String host() {
        return this.d;
    }

    public final boolean isHttps() {
        return this.j;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder httpUrl$Builder0 = new Builder();
        httpUrl$Builder0.setScheme$okhttp(this.a);
        httpUrl$Builder0.setEncodedUsername$okhttp(this.encodedUsername());
        httpUrl$Builder0.setEncodedPassword$okhttp(this.encodedPassword());
        httpUrl$Builder0.setHost$okhttp(this.d);
        int v = HttpUrl.Companion.defaultPort(this.a);
        httpUrl$Builder0.setPort$okhttp((this.e == v ? -1 : this.e));
        httpUrl$Builder0.getEncodedPathSegments$okhttp().clear();
        httpUrl$Builder0.getEncodedPathSegments$okhttp().addAll(this.encodedPathSegments());
        httpUrl$Builder0.encodedQuery(this.encodedQuery());
        httpUrl$Builder0.setEncodedFragment$okhttp(this.encodedFragment());
        return httpUrl$Builder0;
    }

    @Nullable
    public final Builder newBuilder(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        try {
            return new Builder().parse$okhttp(this, s);
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    @JvmName(name = "parse")
    @JvmStatic
    @Nullable
    public static final HttpUrl parse(@NotNull String s) {
        return HttpUrl.Companion.parse(s);
    }

    @JvmName(name = "password")
    @NotNull
    public final String password() {
        return this.c;
    }

    @JvmName(name = "pathSegments")
    @NotNull
    public final List pathSegments() {
        return this.f;
    }

    @JvmName(name = "pathSize")
    public final int pathSize() {
        return this.f.size();
    }

    @JvmName(name = "port")
    public final int port() {
        return this.e;
    }

    @JvmName(name = "query")
    @Nullable
    public final String query() {
        List list0 = this.g;
        if(list0 == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        HttpUrl.Companion.toQueryString$okhttp(list0, stringBuilder0);
        return stringBuilder0.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        List list0 = this.g;
        if(list0 == null) {
            return null;
        }
        IntProgression intProgression0 = c.step(c.until(0, list0.size()), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(s, list0.get(v))) {
                    return (String)list0.get(v + 1);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int v) {
        List list0 = this.g;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        Object object0 = list0.get(v * 2);
        Intrinsics.checkNotNull(object0);
        return (String)object0;
    }

    @JvmName(name = "queryParameterNames")
    @NotNull
    public final Set queryParameterNames() {
        List list0 = this.g;
        if(list0 == null) {
            return f0.emptySet();
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        IntProgression intProgression0 = c.step(c.until(0, list0.size()), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                Object object0 = list0.get(v);
                Intrinsics.checkNotNull(object0);
                linkedHashSet0.add(object0);
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        Set set0 = Collections.unmodifiableSet(linkedHashSet0);
        Intrinsics.checkNotNullExpressionValue(set0, "unmodifiableSet(result)");
        return set0;
    }

    @Nullable
    public final String queryParameterValue(int v) {
        List list0 = this.g;
        if(list0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return (String)list0.get(v * 2 + 1);
    }

    @NotNull
    public final List queryParameterValues(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        List list0 = this.g;
        if(list0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        IntProgression intProgression0 = c.step(c.until(0, list0.size()), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(s, list0.get(v))) {
                    arrayList0.add(list0.get(v + 1));
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        List list1 = Collections.unmodifiableList(arrayList0);
        Intrinsics.checkNotNullExpressionValue(list1, "unmodifiableList(result)");
        return list1;
    }

    @JvmName(name = "querySize")
    public final int querySize() {
        return this.g == null ? 0 : this.g.size() / 2;
    }

    @NotNull
    public final String redact() {
        Builder httpUrl$Builder0 = this.newBuilder("/...");
        Intrinsics.checkNotNull(httpUrl$Builder0);
        return httpUrl$Builder0.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        Builder httpUrl$Builder0 = this.newBuilder(s);
        return httpUrl$Builder0 == null ? null : httpUrl$Builder0.build();
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return this.i;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final String topPrivateDomain() {
        return Util.canParseAsIpAddress(this.d) ? null : PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.d);
    }

    @JvmName(name = "uri")
    @NotNull
    public final URI uri() {
        URI uRI0;
        try {
            return new URI("///");
        }
        catch(URISyntaxException uRISyntaxException0) {
            try {
                uRI0 = URI.create("///");
            }
            catch(Exception unused_ex) {
                throw new RuntimeException(uRISyntaxException0);
            }
            Intrinsics.checkNotNullExpressionValue(uRI0, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
            return uRI0;
        }
    }

    @JvmName(name = "url")
    @NotNull
    public final URL url() {
        try {
            return new URL(this.i);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new RuntimeException(malformedURLException0);
        }
    }

    @JvmName(name = "username")
    @NotNull
    public final String username() {
        return this.b;
    }
}

