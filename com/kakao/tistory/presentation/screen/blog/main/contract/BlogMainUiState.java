package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.b;
import com.kakao.tistory.presentation.main.contract.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u00A8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0002\bG\n\u0002\u0010 \n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u00A0\u0005\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012#\u0010\f\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\r\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\r\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001D\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0018\u00010\u001A\u0012K\u0010\"\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000B0\u001E\u0012K\u0010&\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000B0\u001E\u00126\u0010(\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000B0\'\u0012K\u0010*\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000B0\u001E\u0012`\u0010/\u001A\\\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u000B0+\u0012!\u00101\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000B0\u0006\u0012\n\b\u0002\u00103\u001A\u0004\u0018\u000102\u0012\f\u00104\u001A\b\u0012\u0004\u0012\u00020\u000B0\r\u0012\n\b\u0002\u00106\u001A\u0004\u0018\u000105\u0012\f\u00107\u001A\b\u0012\u0004\u0012\u00020\u000B0\r\u0012\b\b\u0002\u00108\u001A\u00020$\u0012\f\u00109\u001A\b\u0012\u0004\u0012\u00020\u000B0\r\u00A2\u0006\u0004\b:\u0010;J\r\u0010<\u001A\u00020\u0000\u00A2\u0006\u0004\b<\u0010=J\u0015\u0010>\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b>\u0010?J\u0015\u0010@\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b@\u0010?J\u0010\u0010A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ-\u0010E\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0006H\u00C6\u0003\u00A2\u0006\u0004\bE\u0010FJ\u0016\u0010G\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0003\u00A2\u0006\u0004\bG\u0010HJ\u0016\u0010I\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0003\u00A2\u0006\u0004\bI\u0010HJ\u0012\u0010J\u001A\u0004\u0018\u00010\u0010H\u00C6\u0003\u00A2\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001A\u0004\u0018\u00010\u0012H\u00C6\u0003\u00A2\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001A\u0004\u0018\u00010\u0014H\u00C6\u0003\u00A2\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001A\u00020\u0016H\u00C6\u0003\u00A2\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001A\u0004\u0018\u00010\u0018H\u00C6\u0003\u00A2\u0006\u0004\bR\u0010SJ\u001E\u0010T\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0018\u00010\u001AH\u00C6\u0003\u00A2\u0006\u0004\bT\u0010UJU\u0010V\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000B0\u001EH\u00C6\u0003\u00A2\u0006\u0004\bV\u0010WJU\u0010X\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000B0\u001EH\u00C6\u0003\u00A2\u0006\u0004\bX\u0010WJ@\u0010Y\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000B0\'H\u00C6\u0003\u00A2\u0006\u0004\bY\u0010ZJU\u0010[\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000B0\u001EH\u00C6\u0003\u00A2\u0006\u0004\b[\u0010WJj\u0010\\\u001A\\\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u000B0+H\u00C6\u0003\u00A2\u0006\u0004\b\\\u0010]J+\u0010^\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000B0\u0006H\u00C6\u0003\u00A2\u0006\u0004\b^\u0010FJ\u0012\u0010_\u001A\u0004\u0018\u000102H\u00C6\u0003\u00A2\u0006\u0004\b_\u0010`J\u0016\u0010a\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0003\u00A2\u0006\u0004\ba\u0010HJ\u0012\u0010b\u001A\u0004\u0018\u000105H\u00C6\u0003\u00A2\u0006\u0004\bb\u0010cJ\u0016\u0010d\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0003\u00A2\u0006\u0004\bd\u0010HJ\u0010\u0010e\u001A\u00020$H\u00C6\u0003\u00A2\u0006\u0004\be\u0010fJ\u0016\u0010g\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0003\u00A2\u0006\u0004\bg\u0010HJ\u00C1\u0005\u0010h\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042%\b\u0002\u0010\f\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00062\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\r2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\r2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001D\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0018\u00010\u001A2M\b\u0002\u0010\"\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000B0\u001E2M\b\u0002\u0010&\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000B0\u001E28\b\u0002\u0010(\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000B0\'2M\b\u0002\u0010*\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000B0\u001E2b\b\u0002\u0010/\u001A\\\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u000B0+2#\b\u0002\u00101\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000B0\u00062\n\b\u0002\u00103\u001A\u0004\u0018\u0001022\u000E\b\u0002\u00104\u001A\b\u0012\u0004\u0012\u00020\u000B0\r2\n\b\u0002\u00106\u001A\u0004\u0018\u0001052\u000E\b\u0002\u00107\u001A\b\u0012\u0004\u0012\u00020\u000B0\r2\b\b\u0002\u00108\u001A\u00020$2\u000E\b\u0002\u00109\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u00C6\u0001\u00A2\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bj\u0010BJ\u0010\u0010l\u001A\u00020kH\u00D6\u0001\u00A2\u0006\u0004\bl\u0010mJ\u001A\u0010o\u001A\u00020$2\b\u0010n\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bo\u0010pR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010DR4\u0010\f\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010FR\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0006\u00A2\u0006\f\n\u0004\bz\u0010{\u001A\u0004\b|\u0010HR\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0006\u00A2\u0006\f\n\u0004\b}\u0010{\u001A\u0004\b~\u0010HR\u001B\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\u000E\n\u0005\b\u007F\u0010\u0080\u0001\u001A\u0005\b\u0081\u0001\u0010KR\u001C\u0010\u0013\u001A\u0004\u0018\u00010\u00128\u0006\u00A2\u0006\u000F\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001A\u0005\b\u0084\u0001\u0010MR\u001C\u0010\u0015\u001A\u0004\u0018\u00010\u00148\u0006\u00A2\u0006\u000F\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001A\u0005\b\u0087\u0001\u0010OR\u001A\u0010\u0017\u001A\u00020\u00168\u0006\u00A2\u0006\u000F\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001A\u0005\b\u008A\u0001\u0010QR\u001C\u0010\u0019\u001A\u0004\u0018\u00010\u00188\u0006\u00A2\u0006\u000F\n\u0006\b\u008B\u0001\u0010\u008C\u0001\u001A\u0005\b\u008D\u0001\u0010SR(\u0010\u001D\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0018\u00010\u001A8\u0006\u00A2\u0006\u000F\n\u0006\b\u008E\u0001\u0010\u008F\u0001\u001A\u0005\b\u0090\u0001\u0010UR_\u0010\"\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000B0\u001E8\u0006\u00A2\u0006\u000F\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001A\u0005\b\u0093\u0001\u0010WR_\u0010&\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000B0\u001E8\u0006\u00A2\u0006\u000F\n\u0006\b\u0094\u0001\u0010\u0092\u0001\u001A\u0005\b\u0095\u0001\u0010WRJ\u0010(\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000B0\'8\u0006\u00A2\u0006\u000F\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001A\u0005\b\u0098\u0001\u0010ZR_\u0010*\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000B0\u001E8\u0006\u00A2\u0006\u000F\n\u0006\b\u0099\u0001\u0010\u0092\u0001\u001A\u0005\b\u009A\u0001\u0010WRt\u0010/\u001A\\\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u001F\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u000B0+8\u0006\u00A2\u0006\u000F\n\u0006\b\u009B\u0001\u0010\u009C\u0001\u001A\u0005\b\u009D\u0001\u0010]R4\u00101\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\u000E\n\u0005\b\u009E\u0001\u0010x\u001A\u0005\b\u009F\u0001\u0010FR\u001C\u00103\u001A\u0004\u0018\u0001028\u0006\u00A2\u0006\u000F\n\u0006\b\u00A0\u0001\u0010\u00A1\u0001\u001A\u0005\b\u00A2\u0001\u0010`R\u001F\u00104\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u00A3\u0001\u0010{\u001A\u0005\b\u00A4\u0001\u0010HR\u001C\u00106\u001A\u0004\u0018\u0001058\u0006\u00A2\u0006\u000F\n\u0006\b\u00A5\u0001\u0010\u00A6\u0001\u001A\u0005\b\u00A7\u0001\u0010cR\u001F\u00107\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u00A8\u0001\u0010{\u001A\u0005\b\u00A9\u0001\u0010HR\u001A\u00108\u001A\u00020$8\u0006\u00A2\u0006\u000F\n\u0006\b\u00AA\u0001\u0010\u00AB\u0001\u001A\u0005\b\u00AC\u0001\u0010fR\u001F\u00109\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0006\u00A2\u0006\u000E\n\u0005\b\u00AD\u0001\u0010{\u001A\u0005\b\u00AE\u0001\u0010HR\u001B\u0010\u00B0\u0001\u001A\u00020$8\u0006\u00A2\u0006\u000F\n\u0006\b\u00AF\u0001\u0010\u00AB\u0001\u001A\u0005\b\u00B0\u0001\u0010fR\u001B\u0010\u00B2\u0001\u001A\u00020$8\u0006\u00A2\u0006\u000F\n\u0006\b\u00B1\u0001\u0010\u00AB\u0001\u001A\u0005\b\u00B2\u0001\u0010fR#\u0010\u00B8\u0001\u001A\t\u0012\u0004\u0012\u00020\u00010\u00B3\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00B4\u0001\u0010\u00B5\u0001\u001A\u0006\b\u00B6\u0001\u0010\u00B7\u0001R\u001B\u0010\u00BC\u0001\u001A\u00020k8\u0006\u00A2\u0006\u000F\n\u0006\b\u00B9\u0001\u0010\u00BA\u0001\u001A\u0005\b\u00BB\u0001\u0010mR\u001B\u0010\u00BF\u0001\u001A\u00020$8\u0006\u00A2\u0006\u000F\n\u0006\b\u00BD\u0001\u0010\u00AB\u0001\u001A\u0005\b\u00BE\u0001\u0010f\u00A8\u0006\u00C0\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "", "", "blogName", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "info", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "Lkotlin/ParameterName;", "name", "blogInfo", "", "changeBlogInfo", "Lkotlin/Function0;", "refresh", "refreshChallenge", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "statistics", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "challenge", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "topEntry", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "category", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "notice", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "entryList", "Lkotlin/Function3;", "", "id", "title", "goEntryStatistics", "entryId", "", "isDeletable", "onClickEntryDelete", "Lkotlin/Function2;", "deleteEntry", "isModifiable", "modifyEntry", "Lkotlin/Function4;", "isChangeable", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibilityType", "changeVisibility", "password", "onClickPassword", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "bottomSheet", "onDismissBottomSheet", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "dialog", "onDismissDialog", "needBlogGuide", "onDismissGuide", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V", "clear", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "updateInfo", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "changeInfo", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "component7", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "component8", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "component9", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "component10", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "component11", "()Lkotlinx/coroutines/flow/Flow;", "component12", "()Lkotlin/jvm/functions/Function3;", "component13", "component14", "()Lkotlin/jvm/functions/Function2;", "component15", "component16", "()Lkotlin/jvm/functions/Function4;", "component17", "component18", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "component19", "component20", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "component21", "component22", "()Z", "component23", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainUiState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "getInfo", "c", "Lkotlin/jvm/functions/Function1;", "getChangeBlogInfo", "d", "Lkotlin/jvm/functions/Function0;", "getRefresh", "e", "getRefreshChallenge", "f", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "getStatistics", "g", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "getChallenge", "h", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "getTopEntry", "i", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "getCategory", "j", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "getNotice", "k", "Lkotlinx/coroutines/flow/Flow;", "getEntryList", "l", "Lkotlin/jvm/functions/Function3;", "getGoEntryStatistics", "m", "getOnClickEntryDelete", "n", "Lkotlin/jvm/functions/Function2;", "getDeleteEntry", "o", "getModifyEntry", "p", "Lkotlin/jvm/functions/Function4;", "getChangeVisibility", "q", "getOnClickPassword", "r", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "getBottomSheet", "s", "getOnDismissBottomSheet", "t", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "getDialog", "u", "getOnDismissDialog", "v", "Z", "getNeedBlogGuide", "w", "getOnDismissGuide", "x", "isMine", "y", "isOwner", "", "z", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "contentList", "A", "I", "getCategoryItemIndex", "categoryItemIndex", "B", "getShowGuide", "showGuide", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainUiState {
    public static final int $stable;
    public final int A;
    public final boolean B;
    public final String a;
    public final BlogMainInfo b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;
    public final BlogMainStatistics f;
    public final BlogMainChallengeList g;
    public final BlogMainTopEntry h;
    public final BlogMainCategory i;
    public final BlogMainNotice j;
    public final Flow k;
    public final Function3 l;
    public final Function3 m;
    public final Function2 n;
    public final Function3 o;
    public final Function4 p;
    public final Function1 q;
    public final BottomSheetType r;
    public final Function0 s;
    public final DialogType t;
    public final Function0 u;
    public final boolean v;
    public final Function0 w;
    public final boolean x;
    public final boolean y;
    public final List z;

    public BlogMainUiState(@NotNull String s, @Nullable BlogMainInfo blogMainInfo0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable BlogMainStatistics blogMainStatistics0, @Nullable BlogMainChallengeList blogMainChallengeList0, @Nullable BlogMainTopEntry blogMainTopEntry0, @NotNull BlogMainCategory blogMainCategory0, @Nullable BlogMainNotice blogMainNotice0, @Nullable Flow flow0, @NotNull Function3 function30, @NotNull Function3 function31, @NotNull Function2 function20, @NotNull Function3 function32, @NotNull Function4 function40, @NotNull Function1 function11, @Nullable BottomSheetType bottomSheetType0, @NotNull Function0 function02, @Nullable DialogType dialogType0, @NotNull Function0 function03, boolean z, @NotNull Function0 function04) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        boolean z3;
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function01, "refreshChallenge");
        Intrinsics.checkNotNullParameter(blogMainCategory0, "category");
        Intrinsics.checkNotNullParameter(function30, "goEntryStatistics");
        Intrinsics.checkNotNullParameter(function31, "onClickEntryDelete");
        Intrinsics.checkNotNullParameter(function20, "deleteEntry");
        Intrinsics.checkNotNullParameter(function32, "modifyEntry");
        Intrinsics.checkNotNullParameter(function40, "changeVisibility");
        Intrinsics.checkNotNullParameter(function11, "onClickPassword");
        Intrinsics.checkNotNullParameter(function02, "onDismissBottomSheet");
        Intrinsics.checkNotNullParameter(function03, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function04, "onDismissGuide");
        super();
        this.a = s;
        this.b = blogMainInfo0;
        this.c = function10;
        this.d = function00;
        this.e = function01;
        this.f = blogMainStatistics0;
        this.g = blogMainChallengeList0;
        this.h = blogMainTopEntry0;
        this.i = blogMainCategory0;
        this.j = blogMainNotice0;
        this.k = flow0;
        this.l = function30;
        this.m = function31;
        this.n = function20;
        this.o = function32;
        this.p = function40;
        this.q = function11;
        this.r = bottomSheetType0;
        this.s = function02;
        this.t = dialogType0;
        this.u = function03;
        this.v = z;
        this.w = function04;
        boolean z1 = false;
        boolean z2 = blogMainInfo0 != null && blogMainInfo0.isMine();
        this.x = z2;
        if(blogMainInfo0 == null) {
            z3 = false;
        }
        else {
            BlogRoleType blogRoleType0 = blogMainInfo0.getRole();
            z3 = blogRoleType0 == null || !blogRoleType0.isMyOwnBlog() ? false : true;
        }
        this.y = z3;
        List list0 = CollectionsKt__CollectionsKt.listOfNotNull(new Object[]{blogMainInfo0, blogMainStatistics0, blogMainChallengeList0, blogMainTopEntry0, blogMainCategory0, blogMainNotice0});
        this.z = list0;
        this.A = list0.indexOf(blogMainCategory0);
        if(z2 && z) {
            z1 = true;
        }
        this.B = z1;
    }

    public BlogMainUiState(String s, BlogMainInfo blogMainInfo0, Function1 function10, Function0 function00, Function0 function01, BlogMainStatistics blogMainStatistics0, BlogMainChallengeList blogMainChallengeList0, BlogMainTopEntry blogMainTopEntry0, BlogMainCategory blogMainCategory0, BlogMainNotice blogMainNotice0, Flow flow0, Function3 function30, Function3 function31, Function2 function20, Function3 function32, Function4 function40, Function1 function11, BottomSheetType bottomSheetType0, Function0 function02, DialogType dialogType0, Function0 function03, boolean z, Function0 function04, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? blogMainInfo0 : null), function10, function00, function01, ((v & 0x20) == 0 ? blogMainStatistics0 : null), ((v & 0x40) == 0 ? blogMainChallengeList0 : null), ((v & 0x80) == 0 ? blogMainTopEntry0 : null), ((v & 0x100) == 0 ? blogMainCategory0 : new BlogMainCategory(null, null, null, 7, null)), ((v & 0x200) == 0 ? blogMainNotice0 : null), ((v & 0x400) == 0 ? flow0 : null), function30, function31, function20, function32, function40, function11, ((0x20000 & v) == 0 ? bottomSheetType0 : null), function02, ((0x80000 & v) == 0 ? dialogType0 : null), function03, ((v & 0x200000) == 0 ? z : false), function04);
    }

    @NotNull
    public final BlogMainUiState changeInfo(@NotNull BlogMainInfo blogMainInfo0) {
        Intrinsics.checkNotNullParameter(blogMainInfo0, "info");
        String s = blogMainInfo0.getName();
        return blogMainInfo0.isMine() ? BlogMainUiState.copy$default(this, s, blogMainInfo0, null, null, null, new BlogMainStatistics(null, null, null, null, 15, null), null, null, new BlogMainCategory(null, null, null, 7, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7DF81C, null) : BlogMainUiState.copy$default(this, s, blogMainInfo0, null, null, null, null, null, null, new BlogMainCategory(null, null, null, 7, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7DF81C, null);
    }

    @NotNull
    public final BlogMainUiState clear() {
        return BlogMainUiState.copy$default(this, "", null, null, null, null, null, null, null, new BlogMainCategory(null, null, null, 7, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7DF81C, null);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final BlogMainNotice component10() {
        return this.j;
    }

    @Nullable
    public final Flow component11() {
        return this.k;
    }

    @NotNull
    public final Function3 component12() {
        return this.l;
    }

    @NotNull
    public final Function3 component13() {
        return this.m;
    }

    @NotNull
    public final Function2 component14() {
        return this.n;
    }

    @NotNull
    public final Function3 component15() {
        return this.o;
    }

    @NotNull
    public final Function4 component16() {
        return this.p;
    }

    @NotNull
    public final Function1 component17() {
        return this.q;
    }

    @Nullable
    public final BottomSheetType component18() {
        return this.r;
    }

    @NotNull
    public final Function0 component19() {
        return this.s;
    }

    @Nullable
    public final BlogMainInfo component2() {
        return this.b;
    }

    @Nullable
    public final DialogType component20() {
        return this.t;
    }

    @NotNull
    public final Function0 component21() {
        return this.u;
    }

    public final boolean component22() {
        return this.v;
    }

    @NotNull
    public final Function0 component23() {
        return this.w;
    }

    @NotNull
    public final Function1 component3() {
        return this.c;
    }

    @NotNull
    public final Function0 component4() {
        return this.d;
    }

    @NotNull
    public final Function0 component5() {
        return this.e;
    }

    @Nullable
    public final BlogMainStatistics component6() {
        return this.f;
    }

    @Nullable
    public final BlogMainChallengeList component7() {
        return this.g;
    }

    @Nullable
    public final BlogMainTopEntry component8() {
        return this.h;
    }

    @NotNull
    public final BlogMainCategory component9() {
        return this.i;
    }

    @NotNull
    public final BlogMainUiState copy(@NotNull String s, @Nullable BlogMainInfo blogMainInfo0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable BlogMainStatistics blogMainStatistics0, @Nullable BlogMainChallengeList blogMainChallengeList0, @Nullable BlogMainTopEntry blogMainTopEntry0, @NotNull BlogMainCategory blogMainCategory0, @Nullable BlogMainNotice blogMainNotice0, @Nullable Flow flow0, @NotNull Function3 function30, @NotNull Function3 function31, @NotNull Function2 function20, @NotNull Function3 function32, @NotNull Function4 function40, @NotNull Function1 function11, @Nullable BottomSheetType bottomSheetType0, @NotNull Function0 function02, @Nullable DialogType dialogType0, @NotNull Function0 function03, boolean z, @NotNull Function0 function04) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function01, "refreshChallenge");
        Intrinsics.checkNotNullParameter(blogMainCategory0, "category");
        Intrinsics.checkNotNullParameter(function30, "goEntryStatistics");
        Intrinsics.checkNotNullParameter(function31, "onClickEntryDelete");
        Intrinsics.checkNotNullParameter(function20, "deleteEntry");
        Intrinsics.checkNotNullParameter(function32, "modifyEntry");
        Intrinsics.checkNotNullParameter(function40, "changeVisibility");
        Intrinsics.checkNotNullParameter(function11, "onClickPassword");
        Intrinsics.checkNotNullParameter(function02, "onDismissBottomSheet");
        Intrinsics.checkNotNullParameter(function03, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function04, "onDismissGuide");
        return new BlogMainUiState(s, blogMainInfo0, function10, function00, function01, blogMainStatistics0, blogMainChallengeList0, blogMainTopEntry0, blogMainCategory0, blogMainNotice0, flow0, function30, function31, function20, function32, function40, function11, bottomSheetType0, function02, dialogType0, function03, z, function04);
    }

    public static BlogMainUiState copy$default(BlogMainUiState blogMainUiState0, String s, BlogMainInfo blogMainInfo0, Function1 function10, Function0 function00, Function0 function01, BlogMainStatistics blogMainStatistics0, BlogMainChallengeList blogMainChallengeList0, BlogMainTopEntry blogMainTopEntry0, BlogMainCategory blogMainCategory0, BlogMainNotice blogMainNotice0, Flow flow0, Function3 function30, Function3 function31, Function2 function20, Function3 function32, Function4 function40, Function1 function11, BottomSheetType bottomSheetType0, Function0 function02, DialogType dialogType0, Function0 function03, boolean z, Function0 function04, int v, Object object0) {
        String s1 = (v & 1) == 0 ? s : blogMainUiState0.a;
        BlogMainInfo blogMainInfo1 = (v & 2) == 0 ? blogMainInfo0 : blogMainUiState0.b;
        Function1 function12 = (v & 4) == 0 ? function10 : blogMainUiState0.c;
        Function0 function05 = (v & 8) == 0 ? function00 : blogMainUiState0.d;
        Function0 function06 = (v & 16) == 0 ? function01 : blogMainUiState0.e;
        BlogMainStatistics blogMainStatistics1 = (v & 0x20) == 0 ? blogMainStatistics0 : blogMainUiState0.f;
        BlogMainChallengeList blogMainChallengeList1 = (v & 0x40) == 0 ? blogMainChallengeList0 : blogMainUiState0.g;
        BlogMainTopEntry blogMainTopEntry1 = (v & 0x80) == 0 ? blogMainTopEntry0 : blogMainUiState0.h;
        BlogMainCategory blogMainCategory1 = (v & 0x100) == 0 ? blogMainCategory0 : blogMainUiState0.i;
        BlogMainNotice blogMainNotice1 = (v & 0x200) == 0 ? blogMainNotice0 : blogMainUiState0.j;
        Flow flow1 = (v & 0x400) == 0 ? flow0 : blogMainUiState0.k;
        Function3 function33 = (v & 0x800) == 0 ? function30 : blogMainUiState0.l;
        Function3 function34 = (v & 0x1000) == 0 ? function31 : blogMainUiState0.m;
        Function2 function21 = (v & 0x2000) == 0 ? function20 : blogMainUiState0.n;
        Function3 function35 = (v & 0x4000) == 0 ? function32 : blogMainUiState0.o;
        Function4 function41 = (v & 0x8000) == 0 ? function40 : blogMainUiState0.p;
        Function1 function13 = (v & 0x10000) == 0 ? function11 : blogMainUiState0.q;
        BottomSheetType bottomSheetType1 = (v & 0x20000) == 0 ? bottomSheetType0 : blogMainUiState0.r;
        Function0 function07 = (v & 0x40000) == 0 ? function02 : blogMainUiState0.s;
        DialogType dialogType1 = (v & 0x80000) == 0 ? dialogType0 : blogMainUiState0.t;
        Function0 function08 = (v & 0x100000) == 0 ? function03 : blogMainUiState0.u;
        boolean z1 = (v & 0x200000) == 0 ? z : blogMainUiState0.v;
        return (v & 0x400000) == 0 ? blogMainUiState0.copy(s1, blogMainInfo1, function12, function05, function06, blogMainStatistics1, blogMainChallengeList1, blogMainTopEntry1, blogMainCategory1, blogMainNotice1, flow1, function33, function34, function21, function35, function41, function13, bottomSheetType1, function07, dialogType1, function08, z1, function04) : blogMainUiState0.copy(s1, blogMainInfo1, function12, function05, function06, blogMainStatistics1, blogMainChallengeList1, blogMainTopEntry1, blogMainCategory1, blogMainNotice1, flow1, function33, function34, function21, function35, function41, function13, bottomSheetType1, function07, dialogType1, function08, z1, blogMainUiState0.w);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainUiState)) {
            return false;
        }
        BlogMainUiState blogMainUiState0 = (BlogMainUiState)object0;
        if(!Intrinsics.areEqual(this.a, blogMainUiState0.a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, blogMainUiState0.b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, blogMainUiState0.c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, blogMainUiState0.d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, blogMainUiState0.e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, blogMainUiState0.f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, blogMainUiState0.g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, blogMainUiState0.h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, blogMainUiState0.i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, blogMainUiState0.j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, blogMainUiState0.k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, blogMainUiState0.l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, blogMainUiState0.m)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.n, blogMainUiState0.n)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, blogMainUiState0.o)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.p, blogMainUiState0.p)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.q, blogMainUiState0.q)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.r, blogMainUiState0.r)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, blogMainUiState0.s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, blogMainUiState0.t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, blogMainUiState0.u)) {
            return false;
        }
        return this.v == blogMainUiState0.v ? Intrinsics.areEqual(this.w, blogMainUiState0.w) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    @Nullable
    public final BottomSheetType getBottomSheet() {
        return this.r;
    }

    @NotNull
    public final BlogMainCategory getCategory() {
        return this.i;
    }

    public final int getCategoryItemIndex() {
        return this.A;
    }

    @Nullable
    public final BlogMainChallengeList getChallenge() {
        return this.g;
    }

    @NotNull
    public final Function1 getChangeBlogInfo() {
        return this.c;
    }

    @NotNull
    public final Function4 getChangeVisibility() {
        return this.p;
    }

    @NotNull
    public final List getContentList() {
        return this.z;
    }

    @NotNull
    public final Function2 getDeleteEntry() {
        return this.n;
    }

    @Nullable
    public final DialogType getDialog() {
        return this.t;
    }

    @Nullable
    public final Flow getEntryList() {
        return this.k;
    }

    @NotNull
    public final Function3 getGoEntryStatistics() {
        return this.l;
    }

    @Nullable
    public final BlogMainInfo getInfo() {
        return this.b;
    }

    @NotNull
    public final Function3 getModifyEntry() {
        return this.o;
    }

    public final boolean getNeedBlogGuide() {
        return this.v;
    }

    @Nullable
    public final BlogMainNotice getNotice() {
        return this.j;
    }

    @NotNull
    public final Function3 getOnClickEntryDelete() {
        return this.m;
    }

    @NotNull
    public final Function1 getOnClickPassword() {
        return this.q;
    }

    @NotNull
    public final Function0 getOnDismissBottomSheet() {
        return this.s;
    }

    @NotNull
    public final Function0 getOnDismissDialog() {
        return this.u;
    }

    @NotNull
    public final Function0 getOnDismissGuide() {
        return this.w;
    }

    @NotNull
    public final Function0 getRefresh() {
        return this.d;
    }

    @NotNull
    public final Function0 getRefreshChallenge() {
        return this.e;
    }

    public final boolean getShowGuide() {
        return this.B;
    }

    @Nullable
    public final BlogMainStatistics getStatistics() {
        return this.f;
    }

    @Nullable
    public final BlogMainTopEntry getTopEntry() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.s, (b.a(this.q, (this.p.hashCode() + (this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + (this.l.hashCode() + (((this.i.hashCode() + (((a.a(this.e, a.a(this.d, b.a(this.c, (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F) + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F) + (this.r == null ? 0 : this.r.hashCode())) * 0x1F, 0x1F);
        DialogType dialogType0 = this.t;
        if(dialogType0 != null) {
            v = dialogType0.hashCode();
        }
        return this.w.hashCode() + c.a(this.v, a.a(this.u, (v1 + v) * 0x1F, 0x1F), 0x1F);
    }

    public final boolean isMine() {
        return this.x;
    }

    public final boolean isOwner() {
        return this.y;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BlogMainUiState(blogName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", info=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", changeBlogInfo=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", refresh=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", refreshChallenge=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", statistics=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", challenge=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", topEntry=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", category=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", notice=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", entryList=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", goEntryStatistics=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", onClickEntryDelete=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", deleteEntry=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", modifyEntry=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", changeVisibility=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", onClickPassword=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", bottomSheet=");
        stringBuilder0.append(this.r);
        stringBuilder0.append(", onDismissBottomSheet=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", dialog=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", onDismissDialog=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", needBlogGuide=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", onDismissGuide=");
        return q.q(stringBuilder0, this.w, ")");
    }

    @NotNull
    public final BlogMainUiState updateInfo(@NotNull BlogMainInfo blogMainInfo0) {
        Intrinsics.checkNotNullParameter(blogMainInfo0, "info");
        BlogMainStatistics blogMainStatistics0 = blogMainInfo0.isMine() ? this.f : null;
        return blogMainInfo0.isMine() ? BlogMainUiState.copy$default(this, null, blogMainInfo0, null, null, null, blogMainStatistics0, this.g, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFF9D, null) : BlogMainUiState.copy$default(this, null, blogMainInfo0, null, null, null, blogMainStatistics0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 0x7FFF9D, null);
    }
}

