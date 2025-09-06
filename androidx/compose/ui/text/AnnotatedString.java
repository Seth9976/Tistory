package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@Immutable
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001E\b\u0007\u0018\u0000 I2\u00020\u0001:\u0003JIKB[\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000B\u001A\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004\u00A2\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004\u00A2\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0011H\u0096\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0018\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0000H\u0087\u0002\u00A2\u0006\u0004\b\u001F\u0010 J1\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010!\u001A\u00020\u00022\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b$\u0010%J%\u0010\'\u001A\u00020&2\u0006\u0010!\u001A\u00020\u00022\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b\'\u0010(J)\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b$\u0010)J)\u0010+\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b+\u0010)J+\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b-\u0010)J)\u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b/\u0010)J\u001D\u00100\u001A\u00020&2\u0006\u0010\"\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\u0011\u00A2\u0006\u0004\b0\u00101J\u001A\u00102\u001A\u00020&2\b\u0010\u001E\u001A\u0004\u0018\u00010\nH\u0096\u0002\u00A2\u0006\u0004\b2\u00103J\u000F\u00104\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b4\u00105J\u000F\u00106\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b6\u00107J\u0015\u00108\u001A\u00020&2\u0006\u0010\u001E\u001A\u00020\u0000\u00A2\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u00107R(\u0010\u0007\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R(\u0010\t\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bA\u0010>\u001A\u0004\bB\u0010@R*\u0010\u000B\u001A\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bC\u0010>\u001A\u0004\bD\u0010@R\u001D\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F\u00A2\u0006\u0006\u001A\u0004\bE\u0010@R\u001D\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F\u00A2\u0006\u0006\u001A\u0004\bF\u0010@R\u0014\u0010H\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u00105\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "text", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStylesOrNull", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "", "hasStringAnnotations", "(Ljava/lang/String;II)Z", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "getLinkAnnotations", "hasLinkAnnotations", "(II)Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hasEqualAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "a", "Ljava/lang/String;", "getText", "b", "Ljava/util/List;", "getSpanStylesOrNull$ui_text_release", "()Ljava/util/List;", "c", "getParagraphStylesOrNull$ui_text_release", "d", "getAnnotations$ui_text_release", "getSpanStyles", "getParagraphStyles", "getLength", "length", "Companion", "Builder", "Range", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n1045#2:1270\n33#3,6:1271\n235#3,3:1278\n33#3,4:1281\n238#3,2:1285\n38#3:1287\n240#3:1288\n101#3,2:1289\n33#3,6:1291\n103#3:1297\n235#3,3:1298\n33#3,4:1301\n238#3,2:1305\n38#3:1307\n240#3:1308\n235#3,3:1309\n33#3,4:1312\n238#3,2:1316\n38#3:1318\n240#3:1319\n235#3,3:1320\n33#3,4:1323\n238#3,2:1327\n38#3:1329\n240#3:1330\n235#3,3:1331\n33#3,4:1334\n238#3,2:1338\n38#3:1340\n240#3:1341\n101#3,2:1342\n33#3,6:1344\n103#3:1350\n1#4:1277\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n87#1:1270\n87#1:1271,6\n160#1:1278,3\n160#1:1281,4\n160#1:1285,2\n160#1:1287\n160#1:1288\n168#1:1289,2\n168#1:1291,6\n168#1:1297\n183#1:1298,3\n183#1:1301,4\n183#1:1305,2\n183#1:1307\n183#1:1308\n198#1:1309,3\n198#1:1312,4\n198#1:1316,2\n198#1:1318\n198#1:1319\n215#1:1320,3\n215#1:1323,4\n215#1:1327,2\n215#1:1329\n215#1:1330\n230#1:1331,3\n230#1:1334,4\n230#1:1338,2\n230#1:1340\n230#1:1341\n238#1:1342,2\n238#1:1344,6\n238#1:1350\n*E\n"})
public final class AnnotatedString implements CharSequence {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001GB\u0011\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\n\u00A2\u0006\u0004\b\u0005\u0010\u000BJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0011\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\r\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u0012H\u0016\u00A2\u0006\u0004\b\r\u0010\u0013J)\u0010\r\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\r\u0010\u0017J\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000BJ%\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b\r\u0010\u0018J%\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u001D2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001EJ-\u0010!\u001A\u00020\f2\u0006\u0010\u001F\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u00072\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b!\u0010\"J\'\u0010%\u001A\u00020\f2\u0006\u0010$\u001A\u00020#2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003H\u0007\u00A2\u0006\u0004\b%\u0010&J\'\u0010)\u001A\u00020\f2\u0006\u0010(\u001A\u00020\'2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003H\u0007\u00A2\u0006\u0004\b)\u0010*J%\u0010-\u001A\u00020\f2\u0006\u0010,\u001A\u00020+2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b-\u0010.J%\u0010-\u001A\u00020\f2\u0006\u00100\u001A\u00020/2\u0006\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u0003\u00A2\u0006\u0004\b-\u00101J\u0015\u00102\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b2\u00103J\u0015\u00102\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u001D\u00A2\u0006\u0004\b2\u00104J\u001D\u00105\u001A\u00020\u00032\u0006\u0010\u001F\u001A\u00020\u00072\u0006\u0010 \u001A\u00020\u0007\u00A2\u0006\u0004\b5\u00106J\u0015\u00107\u001A\u00020\u00032\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b7\u00108J\u0017\u00109\u001A\u00020\u00032\u0006\u0010(\u001A\u00020\'H\u0007\u00A2\u0006\u0004\b9\u0010:J\u0015\u0010=\u001A\u00020\u00032\u0006\u0010<\u001A\u00020;\u00A2\u0006\u0004\b=\u0010>J\r\u0010?\u001A\u00020\f\u00A2\u0006\u0004\b?\u0010@J\u0015\u0010?\u001A\u00020\f2\u0006\u0010A\u001A\u00020\u0003\u00A2\u0006\u0004\b?\u0010\u0006J\r\u0010B\u001A\u00020\n\u00A2\u0006\u0004\bB\u0010CR\u0011\u0010F\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\bD\u0010E\u00A8\u0006H"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", "text", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "append", "", "char", "(C)V", "deprecated_append_returning_void", "", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", "start", "end", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "tag", "annotation", "addStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "addTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;II)V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "addUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "url", "addLink", "(Landroidx/compose/ui/text/LinkAnnotation$Url;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "clickable", "(Landroidx/compose/ui/text/LinkAnnotation$Clickable;II)V", "pushStyle", "(Landroidx/compose/ui/text/SpanStyle;)I", "(Landroidx/compose/ui/text/ParagraphStyle;)I", "pushStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;)I", "pushTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;)I", "pushUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;)I", "Landroidx/compose/ui/text/LinkAnnotation;", "link", "pushLink", "(Landroidx/compose/ui/text/LinkAnnotation;)I", "pop", "()V", "index", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getLength", "()I", "length", "androidx/compose/ui/text/a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n33#2,6:1270\n33#2,6:1276\n33#2,6:1282\n33#2,6:1288\n33#2,6:1294\n33#2,6:1300\n151#2,3:1307\n33#2,4:1310\n154#2,2:1314\n38#2:1316\n156#2:1317\n151#2,3:1318\n33#2,4:1321\n154#2,2:1325\n38#2:1327\n156#2:1328\n151#2,3:1329\n33#2,4:1332\n154#2,2:1336\n38#2:1338\n156#2:1339\n1#3:1306\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n435#1:1270,6\n438#1:1276,6\n442#1:1282,6\n462#1:1288,6\n465#1:1294,6\n469#1:1300,6\n741#1:1307,3\n741#1:1310,4\n741#1:1314,2\n741#1:1316\n741#1:1317\n744#1:1318,3\n744#1:1321,4\n744#1:1325,2\n744#1:1327\n744#1:1328\n747#1:1329,3\n747#1:1332,4\n747#1:1336,2\n747#1:1338\n747#1:1339\n*E\n"})
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public Builder() {
            this(0, 1, null);
        }

        public Builder(int v) {
            this.a = new StringBuilder(v);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public Builder(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 16;
            }
            this(v);
        }

        public Builder(@NotNull AnnotatedString annotatedString0) {
            this(0, 1, null);
            this.append(annotatedString0);
        }

        public Builder(@NotNull String s) {
            this(0, 1, null);
            this.append(s);
        }

        public final void addLink(@NotNull Clickable linkAnnotation$Clickable0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, linkAnnotation$Clickable0);
            this.d.add(a0);
        }

        public final void addLink(@NotNull Url linkAnnotation$Url0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, linkAnnotation$Url0);
            this.d.add(a0);
        }

        public final void addStringAnnotation(@NotNull String s, @NotNull String s1, int v, int v1) {
            a a0 = new a(s1, v, v1, s);
            this.d.add(a0);
        }

        public final void addStyle(@NotNull ParagraphStyle paragraphStyle0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, paragraphStyle0);
            this.c.add(a0);
        }

        public final void addStyle(@NotNull SpanStyle spanStyle0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, spanStyle0);
            this.b.add(a0);
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, ttsAnnotation0);
            this.d.add(a0);
        }

        @ExperimentalTextApi
        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        public final void addUrlAnnotation(@NotNull UrlAnnotation urlAnnotation0, int v, int v1) {
            a a0 = new a(null, v, v1, 8, urlAnnotation0);
            this.d.add(a0);
        }

        @NotNull
        public Builder append(char c) {
            this.a.append(c);
            return this;
        }

        @NotNull
        public Builder append(@Nullable CharSequence charSequence0) {
            if(charSequence0 instanceof AnnotatedString) {
                this.append(((AnnotatedString)charSequence0));
                return this;
            }
            this.a.append(charSequence0);
            return this;
        }

        @NotNull
        public Builder append(@Nullable CharSequence charSequence0, int v, int v1) {
            if(charSequence0 instanceof AnnotatedString) {
                this.append(((AnnotatedString)charSequence0), v, v1);
                return this;
            }
            this.a.append(charSequence0, v, v1);
            return this;
        }

        @Override
        public Appendable append(char c) {
            return this.append(c);
        }

        @Override
        public Appendable append(CharSequence charSequence0) {
            return this.append(charSequence0);
        }

        @Override
        public Appendable append(CharSequence charSequence0, int v, int v1) {
            return this.append(charSequence0, v, v1);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by the append(Char) method that returns an Appendable. This method must be kept around for binary compatibility.")
        @JvmName(name = "append")
        public final void append(char c) {
            this.append(c);
        }

        public final void append(@NotNull AnnotatedString annotatedString0) {
            int v = this.a.length();
            this.a.append(annotatedString0.getText());
            List list0 = annotatedString0.getSpanStylesOrNull$ui_text_release();
            if(list0 != null) {
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Range annotatedString$Range0 = (Range)list0.get(v3);
                    this.addStyle(((SpanStyle)annotatedString$Range0.getItem()), annotatedString$Range0.getStart() + v, annotatedString$Range0.getEnd() + v);
                }
            }
            List list1 = annotatedString0.getParagraphStylesOrNull$ui_text_release();
            if(list1 != null) {
                int v4 = list1.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Range annotatedString$Range1 = (Range)list1.get(v5);
                    this.addStyle(((ParagraphStyle)annotatedString$Range1.getItem()), annotatedString$Range1.getStart() + v, annotatedString$Range1.getEnd() + v);
                }
            }
            List list2 = annotatedString0.getAnnotations$ui_text_release();
            if(list2 != null) {
                int v6 = list2.size();
                for(int v1 = 0; v1 < v6; ++v1) {
                    Range annotatedString$Range2 = (Range)list2.get(v1);
                    a a0 = new a(annotatedString$Range2.getItem(), annotatedString$Range2.getStart() + v, annotatedString$Range2.getEnd() + v, annotatedString$Range2.getTag());
                    this.d.add(a0);
                }
            }
        }

        public final void append(@NotNull AnnotatedString annotatedString0, int v, int v1) {
            int v2 = this.a.length();
            this.a.append(annotatedString0.getText(), v, v1);
            List list0 = AnnotatedStringKt.a(annotatedString0, v, v1);
            if(list0 != null) {
                int v4 = list0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Range annotatedString$Range0 = (Range)list0.get(v5);
                    this.addStyle(((SpanStyle)annotatedString$Range0.getItem()), annotatedString$Range0.getStart() + v2, annotatedString$Range0.getEnd() + v2);
                }
            }
            List list1 = AnnotatedStringKt.access$getLocalParagraphStyles(annotatedString0, v, v1);
            if(list1 != null) {
                int v6 = list1.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    Range annotatedString$Range1 = (Range)list1.get(v7);
                    this.addStyle(((ParagraphStyle)annotatedString$Range1.getItem()), annotatedString$Range1.getStart() + v2, annotatedString$Range1.getEnd() + v2);
                }
            }
            List list2 = AnnotatedStringKt.access$getLocalAnnotations(annotatedString0, v, v1);
            if(list2 != null) {
                int v8 = list2.size();
                for(int v3 = 0; v3 < v8; ++v3) {
                    Range annotatedString$Range2 = (Range)list2.get(v3);
                    a a0 = new a(annotatedString$Range2.getItem(), annotatedString$Range2.getStart() + v2, annotatedString$Range2.getEnd() + v2, annotatedString$Range2.getTag());
                    this.d.add(a0);
                }
            }
        }

        public final void append(@NotNull String s) {
            this.a.append(s);
        }

        public final int getLength() {
            return this.a.length();
        }

        public final void pop() {
            ArrayList arrayList0 = this.e;
            if(arrayList0.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            a a0 = (a)arrayList0.remove(arrayList0.size() - 1);
            a0.c = this.a.length();
        }

        public final void pop(int v) {
            ArrayList arrayList0 = this.e;
            if(v >= arrayList0.size()) {
                throw new IllegalStateException((v + " should be less than " + arrayList0.size()).toString());
            }
            while(arrayList0.size() - 1 >= v) {
                this.pop();
            }
        }

        public final int pushLink(@NotNull LinkAnnotation linkAnnotation0) {
            a a0 = new a(null, this.a.length(), 0, 12, linkAnnotation0);
            this.e.add(a0);
            this.d.add(a0);
            return this.e.size() - 1;
        }

        public final int pushStringAnnotation(@NotNull String s, @NotNull String s1) {
            a a0 = new a(s, this.a.length(), 0, 4, s1);
            this.e.add(a0);
            this.d.add(a0);
            return this.e.size() - 1;
        }

        public final int pushStyle(@NotNull ParagraphStyle paragraphStyle0) {
            a a0 = new a(null, this.a.length(), 0, 12, paragraphStyle0);
            this.e.add(a0);
            this.c.add(a0);
            return this.e.size() - 1;
        }

        public final int pushStyle(@NotNull SpanStyle spanStyle0) {
            a a0 = new a(null, this.a.length(), 0, 12, spanStyle0);
            this.e.add(a0);
            this.b.add(a0);
            return this.e.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation0) {
            a a0 = new a(null, this.a.length(), 0, 12, ttsAnnotation0);
            this.e.add(a0);
            this.d.add(a0);
            return this.e.size() - 1;
        }

        @ExperimentalTextApi
        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        public final int pushUrlAnnotation(@NotNull UrlAnnotation urlAnnotation0) {
            a a0 = new a(null, this.a.length(), 0, 12, urlAnnotation0);
            this.e.add(a0);
            this.d.add(a0);
            return this.e.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            ArrayList arrayList2;
            StringBuilder stringBuilder0 = this.a;
            String s = stringBuilder0.toString();
            ArrayList arrayList0 = this.b;
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            int v = arrayList0.size();
            for(int v2 = 0; true; ++v2) {
                arrayList2 = null;
                if(v2 >= v) {
                    break;
                }
                arrayList1.add(((a)arrayList0.get(v2)).a(stringBuilder0.length()));
            }
            if(arrayList1.isEmpty()) {
                arrayList1 = null;
            }
            ArrayList arrayList3 = this.c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int v3 = arrayList3.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList4.add(((a)arrayList3.get(v4)).a(stringBuilder0.length()));
            }
            if(arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int v5 = arrayList5.size();
            for(int v1 = 0; v1 < v5; ++v1) {
                arrayList6.add(((a)arrayList5.get(v1)).a(stringBuilder0.length()));
            }
            if(!arrayList6.isEmpty()) {
                arrayList2 = arrayList6;
            }
            return new AnnotatedString(s, arrayList1, arrayList4, arrayList2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\u0004\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return AnnotatedString.e;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u000BJ\u0010\u0010\f\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000FJ\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000FR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "b", "I", "getStart", "c", "getEnd", "d", "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n1#2:1270\n*E\n"})
    public static final class Range {
        public static final int $stable;
        public final Object a;
        public final int b;
        public final int c;
        public final String d;

        public Range(Object object0, int v, int v1) {
            this(object0, v, v1, "");
        }

        public Range(Object object0, int v, int v1, @NotNull String s) {
            this.a = object0;
            this.b = v;
            this.c = v1;
            this.d = s;
            if(v > v1) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        @NotNull
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final Range copy(Object object0, int v, int v1, @NotNull String s) {
            return new Range(object0, v, v1, s);
        }

        public static Range copy$default(Range annotatedString$Range0, Object object0, int v, int v1, String s, int v2, Object object1) {
            if((v2 & 1) != 0) {
                object0 = annotatedString$Range0.a;
            }
            if((v2 & 2) != 0) {
                v = annotatedString$Range0.b;
            }
            if((v2 & 4) != 0) {
                v1 = annotatedString$Range0.c;
            }
            if((v2 & 8) != 0) {
                s = annotatedString$Range0.d;
            }
            return annotatedString$Range0.copy(object0, v, v1, s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Range)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Range)object0).a)) {
                return false;
            }
            if(this.b != ((Range)object0).b) {
                return false;
            }
            return this.c == ((Range)object0).c ? Intrinsics.areEqual(this.d, ((Range)object0).d) : false;
        }

        public final int getEnd() {
            return this.c;
        }

        public final Object getItem() {
            return this.a;
        }

        public final int getStart() {
            return this.b;
        }

        @NotNull
        public final String getTag() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return this.a == null ? this.d.hashCode() + r0.a.c(this.c, r0.a.c(this.b, 0, 0x1F), 0x1F) : this.d.hashCode() + r0.a.c(this.c, r0.a.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Range(item=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", start=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", end=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", tag=");
            return wb.a.b(')', this.d, stringBuilder0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public static final Saver e;

    static {
        AnnotatedString.Companion = new Companion(null);
        AnnotatedString.e = SaversKt.getAnnotatedStringSaver();
    }

    public AnnotatedString(@NotNull String s, @NotNull List list0, @NotNull List list1) {
        Collection collection0 = list0;
        if(collection0.isEmpty()) {
            collection0 = null;
        }
        Collection collection1 = list1;
        if(collection1.isEmpty()) {
            collection1 = null;
        }
        this(s, ((List)collection0), ((List)collection1), null);
    }

    public AnnotatedString(String s, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(s, list0, list1);
    }

    public AnnotatedString(@NotNull String s, @Nullable List list0, @Nullable List list1, @Nullable List list2) {
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = list2;
        if(list1 != null) {
            List list3 = CollectionsKt___CollectionsKt.sortedWith(list1, new androidx.compose.ui.text.AnnotatedString.special..inlined.sortedBy.1());
            if(list3 != null) {
                int v = list3.size();
                int v1 = -1;
                for(int v2 = 0; v2 < v; ++v2) {
                    Range annotatedString$Range0 = (Range)list3.get(v2);
                    if(annotatedString$Range0.getStart() < v1) {
                        throw new IllegalArgumentException("ParagraphStyle should not overlap");
                    }
                    if(annotatedString$Range0.getEnd() > this.a.length()) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + annotatedString$Range0.getStart() + ", " + annotatedString$Range0.getEnd() + ") is out of boundary").toString());
                    }
                    v1 = annotatedString$Range0.getEnd();
                }
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n87#2:329\n*E\n"})
        public final class androidx.compose.ui.text.AnnotatedString.special..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return c.compareValues(((Range)object0).getStart(), ((Range)object1).getStart());
            }
        }

    }

    public AnnotatedString(String s, List list0, List list1, List list2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = null;
        }
        if((v & 4) != 0) {
            list1 = null;
        }
        if((v & 8) != 0) {
            list2 = null;
        }
        this(s, list0, list1, list2);
    }

    @Override
    public final char charAt(int v) {
        return this.get(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AnnotatedString)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((AnnotatedString)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((AnnotatedString)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((AnnotatedString)object0).c) ? Intrinsics.areEqual(this.d, ((AnnotatedString)object0).d) : false;
    }

    public char get(int v) {
        return this.a.charAt(v);
    }

    @Nullable
    public final List getAnnotations$ui_text_release() {
        return this.d;
    }

    public int getLength() {
        return this.a.length();
    }

    @NotNull
    public final List getLinkAnnotations(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof LinkAnnotation && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    list1.add(object0);
                }
            }
        }
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return list1;
    }

    @NotNull
    public final List getParagraphStyles() {
        return this.c == null ? CollectionsKt__CollectionsKt.emptyList() : this.c;
    }

    @Nullable
    public final List getParagraphStylesOrNull$ui_text_release() {
        return this.c;
    }

    @NotNull
    public final List getSpanStyles() {
        return this.b == null ? CollectionsKt__CollectionsKt.emptyList() : this.b;
    }

    @Nullable
    public final List getSpanStylesOrNull$ui_text_release() {
        return this.b;
    }

    @NotNull
    public final List getStringAnnotations(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof String && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    list1.add(object0);
                }
            }
        }
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list1;
    }

    @NotNull
    public final List getStringAnnotations(@NotNull String s, int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof String && Intrinsics.areEqual(s, annotatedString$Range0.getTag()) && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    list1.add(object0);
                }
            }
        }
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list1;
    }

    @NotNull
    public final String getText() {
        return this.a;
    }

    @NotNull
    public final List getTtsAnnotations(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof TtsAnnotation && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    list1.add(object0);
                }
            }
        }
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list1;
    }

    @ExperimentalTextApi
    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    @NotNull
    public final List getUrlAnnotations(int v, int v1) {
        List list1;
        List list0 = this.d;
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = list0.get(v3);
                Range annotatedString$Range0 = (Range)object0;
                if(annotatedString$Range0.getItem() instanceof UrlAnnotation && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    list1.add(object0);
                }
            }
        }
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list1;
    }

    public final boolean hasEqualAnnotations(@NotNull AnnotatedString annotatedString0) {
        return Intrinsics.areEqual(this.d, annotatedString0.d);
    }

    public final boolean hasLinkAnnotations(int v, int v1) {
        List list0 = this.d;
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                if(annotatedString$Range0.getItem() instanceof LinkAnnotation && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(@NotNull String s, int v, int v1) {
        List list0 = this.d;
        if(list0 != null) {
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                if(annotatedString$Range0.getItem() instanceof String && Intrinsics.areEqual(s, annotatedString$Range0.getTag()) && AnnotatedStringKt.intersect(v, v1, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        List list0 = this.d;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final int length() {
        return this.getLength();
    }

    @Stable
    @NotNull
    public final AnnotatedString plus(@NotNull AnnotatedString annotatedString0) {
        Builder annotatedString$Builder0 = new Builder(this);
        annotatedString$Builder0.append(annotatedString0);
        return annotatedString$Builder0.toAnnotatedString();
    }

    @NotNull
    public AnnotatedString subSequence(int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less or equal to end (" + v1 + ')').toString());
        }
        String s = this.a;
        if(v == 0 && v1 == s.length()) {
            return this;
        }
        String s1 = s.substring(v, v1);
        Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AnnotatedString(s1, AnnotatedStringKt.access$filterRanges(this.b, v, v1), AnnotatedStringKt.access$filterRanges(this.c, v, v1), AnnotatedStringKt.access$filterRanges(this.d, v, v1));
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.subSequence(v, v1);
    }

    @NotNull
    public final AnnotatedString subSequence-5zc-tL8(long v) {
        return this.subSequence(TextRange.getMin-impl(v), TextRange.getMax-impl(v));
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

