package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u00A3\u0004\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012%\b\u0002\u0010\u0015\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\u0012\u0012\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012K\u0010\u001C\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\r0\u0017\u0012K\u0010\u001F\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u0017\u0012K\u0010 \u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u0017\u00126\u0010\"\u001A2\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\r0!\u0012`\u0010&\u001A\\\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\r0#\u00A2\u0006\u0004\b\'\u0010(J\u0012\u0010)\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0012\u0010+\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u001E\u0010-\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u0012\u0010/\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u0016\u00101\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b1\u00102J\u0012\u00103\u001A\u0004\u0018\u00010\u000FH\u00C6\u0003\u00A2\u0006\u0004\b3\u00104J\u0016\u00105\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b5\u00102J-\u00106\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b8\u00102JU\u00109\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\r0\u0017H\u00C6\u0003\u00A2\u0006\u0004\b9\u0010:JU\u0010;\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u0017H\u00C6\u0003\u00A2\u0006\u0004\b;\u0010:JU\u0010<\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u0017H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010:J@\u0010=\u001A2\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\r0!H\u00C6\u0003\u00A2\u0006\u0004\b=\u0010>Jj\u0010?\u001A\\\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\r0#H\u00C6\u0003\u00A2\u0006\u0004\b?\u0010@J\u00BA\u0004\u0010A\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f2%\b\u0002\u0010\u0015\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\u00122\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\r0\f2M\b\u0002\u0010\u001C\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\r0\u00172M\b\u0002\u0010\u001F\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u00172M\b\u0002\u0010 \u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u001728\b\u0002\u0010\"\u001A2\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\r0!2b\b\u0002\u0010&\u001A\\\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\r0#H\u00C6\u0001\u00A2\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001A\u00020EH\u00D6\u0001\u00A2\u0006\u0004\bF\u0010GJ\u001A\u0010I\u001A\u00020\u001D2\b\u0010H\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bI\u0010JR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010*R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010,R%\u0010\t\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010.R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u00100R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u00102R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u00104R\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\b]\u0010X\u001A\u0004\b^\u00102R4\u0010\u0015\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\u00128\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00107R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\bb\u0010X\u001A\u0004\bc\u00102R\\\u0010\u001C\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\r0\u00178\u0006\u00A2\u0006\f\n\u0004\bd\u0010e\u001A\u0004\bf\u0010:R\\\u0010\u001F\u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u00178\u0006\u00A2\u0006\f\n\u0004\bg\u0010e\u001A\u0004\bh\u0010:R\\\u0010 \u001AG\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0004\u0012\u00020\r0\u00178\u0006\u00A2\u0006\f\n\u0004\bi\u0010e\u001A\u0004\bj\u0010:RG\u0010\"\u001A2\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\r0!8\u0006\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010>Rq\u0010&\u001A\\\u0012\u0013\u0012\u00110\u0018\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\r0#8\u0006\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010@R\u0019\u0010\u0019\u001A\u0004\u0018\u00010\u00188\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010DR\u0017\u0010v\u001A\u00020\u001D8\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010w\u00A8\u0006x"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;", "", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blogInfo", "", "currentUserId", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "noticeList", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "bottomSheet", "Lkotlin/Function0;", "", "onDismissBottomSheet", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "dialog", "onDismissDialog", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "changeBlogInfo", "refresh", "Lkotlin/Function3;", "", "blogName", "id", "title", "goStatistics", "", "modifiable", "modifyNotice", "onClickNoticeDelete", "Lkotlin/Function2;", "deleteNotice", "Lkotlin/Function4;", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibilityType", "changeVisibility", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Ljava/lang/Long;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "component2", "()Ljava/lang/Long;", "component3", "()Lkotlinx/coroutines/flow/Flow;", "component4", "()Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "component7", "component8", "()Lkotlin/jvm/functions/Function1;", "component9", "component10", "()Lkotlin/jvm/functions/Function3;", "component11", "component12", "component13", "()Lkotlin/jvm/functions/Function2;", "component14", "()Lkotlin/jvm/functions/Function4;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Ljava/lang/Long;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListUiState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlogInfo", "b", "Ljava/lang/Long;", "getCurrentUserId", "c", "Lkotlinx/coroutines/flow/Flow;", "getNoticeList", "d", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "getBottomSheet", "e", "Lkotlin/jvm/functions/Function0;", "getOnDismissBottomSheet", "f", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "getDialog", "g", "getOnDismissDialog", "h", "Lkotlin/jvm/functions/Function1;", "getChangeBlogInfo", "i", "getRefresh", "j", "Lkotlin/jvm/functions/Function3;", "getGoStatistics", "k", "getModifyNotice", "l", "getOnClickNoticeDelete", "m", "Lkotlin/jvm/functions/Function2;", "getDeleteNotice", "n", "Lkotlin/jvm/functions/Function4;", "getChangeVisibility", "o", "Ljava/lang/String;", "getBlogName", "p", "Z", "isMine", "()Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogNoticeListUiState {
    public static final int $stable;
    public final BlogInfo a;
    public final Long b;
    public final Flow c;
    public final NoticeBottomSheet d;
    public final Function0 e;
    public final DialogType f;
    public final Function0 g;
    public final Function1 h;
    public final Function0 i;
    public final Function3 j;
    public final Function3 k;
    public final Function3 l;
    public final Function2 m;
    public final Function4 n;
    public final String o;
    public final boolean p;

    public BlogNoticeListUiState(@Nullable BlogInfo blogInfo0, @Nullable Long long0, @Nullable Flow flow0, @Nullable NoticeBottomSheet noticeBottomSheet0, @NotNull Function0 function00, @Nullable DialogType dialogType0, @NotNull Function0 function01, @NotNull Function1 function10, @NotNull Function0 function02, @NotNull Function3 function30, @NotNull Function3 function31, @NotNull Function3 function32, @NotNull Function2 function20, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(function00, "onDismissBottomSheet");
        boolean z;
        Intrinsics.checkNotNullParameter(function01, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function02, "refresh");
        Intrinsics.checkNotNullParameter(function30, "goStatistics");
        Intrinsics.checkNotNullParameter(function31, "modifyNotice");
        Intrinsics.checkNotNullParameter(function32, "onClickNoticeDelete");
        Intrinsics.checkNotNullParameter(function20, "deleteNotice");
        Intrinsics.checkNotNullParameter(function40, "changeVisibility");
        super();
        this.a = blogInfo0;
        this.b = long0;
        this.c = flow0;
        this.d = noticeBottomSheet0;
        this.e = function00;
        this.f = dialogType0;
        this.g = function01;
        this.h = function10;
        this.i = function02;
        this.j = function30;
        this.k = function31;
        this.l = function32;
        this.m = function20;
        this.n = function40;
        this.o = blogInfo0 == null ? null : blogInfo0.getName();
        if(blogInfo0 == null) {
            z = false;
        }
        else {
            BlogRoleType blogRoleType0 = blogInfo0.getRole();
            z = blogRoleType0 == null ? false : blogRoleType0.getHasBlogRole();
        }
        this.p = z;
    }

    public BlogNoticeListUiState(BlogInfo blogInfo0, Long long0, Flow flow0, NoticeBottomSheet noticeBottomSheet0, Function0 function00, DialogType dialogType0, Function0 function01, Function1 function10, Function0 function02, Function3 function30, Function3 function31, Function3 function32, Function2 function20, Function4 function40, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Function1 function11 = (v & 0x80) == 0 ? function10 : c.a;
        Function0 function03 = (v & 0x100) == 0 ? function02 : d.a;
        this(((v & 1) == 0 ? blogInfo0 : null), ((v & 2) == 0 ? long0 : null), ((v & 4) == 0 ? flow0 : null), ((v & 8) == 0 ? noticeBottomSheet0 : null), function00, ((v & 0x20) == 0 ? dialogType0 : null), function01, function11, function03, function30, function31, function32, function20, function40);
    }

    @Nullable
    public final BlogInfo component1() {
        return this.a;
    }

    @NotNull
    public final Function3 component10() {
        return this.j;
    }

    @NotNull
    public final Function3 component11() {
        return this.k;
    }

    @NotNull
    public final Function3 component12() {
        return this.l;
    }

    @NotNull
    public final Function2 component13() {
        return this.m;
    }

    @NotNull
    public final Function4 component14() {
        return this.n;
    }

    @Nullable
    public final Long component2() {
        return this.b;
    }

    @Nullable
    public final Flow component3() {
        return this.c;
    }

    @Nullable
    public final NoticeBottomSheet component4() {
        return this.d;
    }

    @NotNull
    public final Function0 component5() {
        return this.e;
    }

    @Nullable
    public final DialogType component6() {
        return this.f;
    }

    @NotNull
    public final Function0 component7() {
        return this.g;
    }

    @NotNull
    public final Function1 component8() {
        return this.h;
    }

    @NotNull
    public final Function0 component9() {
        return this.i;
    }

    @NotNull
    public final BlogNoticeListUiState copy(@Nullable BlogInfo blogInfo0, @Nullable Long long0, @Nullable Flow flow0, @Nullable NoticeBottomSheet noticeBottomSheet0, @NotNull Function0 function00, @Nullable DialogType dialogType0, @NotNull Function0 function01, @NotNull Function1 function10, @NotNull Function0 function02, @NotNull Function3 function30, @NotNull Function3 function31, @NotNull Function3 function32, @NotNull Function2 function20, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(function00, "onDismissBottomSheet");
        Intrinsics.checkNotNullParameter(function01, "onDismissDialog");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function02, "refresh");
        Intrinsics.checkNotNullParameter(function30, "goStatistics");
        Intrinsics.checkNotNullParameter(function31, "modifyNotice");
        Intrinsics.checkNotNullParameter(function32, "onClickNoticeDelete");
        Intrinsics.checkNotNullParameter(function20, "deleteNotice");
        Intrinsics.checkNotNullParameter(function40, "changeVisibility");
        return new BlogNoticeListUiState(blogInfo0, long0, flow0, noticeBottomSheet0, function00, dialogType0, function01, function10, function02, function30, function31, function32, function20, function40);
    }

    public static BlogNoticeListUiState copy$default(BlogNoticeListUiState blogNoticeListUiState0, BlogInfo blogInfo0, Long long0, Flow flow0, NoticeBottomSheet noticeBottomSheet0, Function0 function00, DialogType dialogType0, Function0 function01, Function1 function10, Function0 function02, Function3 function30, Function3 function31, Function3 function32, Function2 function20, Function4 function40, int v, Object object0) {
        BlogInfo blogInfo1 = (v & 1) == 0 ? blogInfo0 : blogNoticeListUiState0.a;
        Long long1 = (v & 2) == 0 ? long0 : blogNoticeListUiState0.b;
        Flow flow1 = (v & 4) == 0 ? flow0 : blogNoticeListUiState0.c;
        NoticeBottomSheet noticeBottomSheet1 = (v & 8) == 0 ? noticeBottomSheet0 : blogNoticeListUiState0.d;
        Function0 function03 = (v & 16) == 0 ? function00 : blogNoticeListUiState0.e;
        DialogType dialogType1 = (v & 0x20) == 0 ? dialogType0 : blogNoticeListUiState0.f;
        Function0 function04 = (v & 0x40) == 0 ? function01 : blogNoticeListUiState0.g;
        Function1 function11 = (v & 0x80) == 0 ? function10 : blogNoticeListUiState0.h;
        Function0 function05 = (v & 0x100) == 0 ? function02 : blogNoticeListUiState0.i;
        Function3 function33 = (v & 0x200) == 0 ? function30 : blogNoticeListUiState0.j;
        Function3 function34 = (v & 0x400) == 0 ? function31 : blogNoticeListUiState0.k;
        Function3 function35 = (v & 0x800) == 0 ? function32 : blogNoticeListUiState0.l;
        Function2 function21 = (v & 0x1000) == 0 ? function20 : blogNoticeListUiState0.m;
        return (v & 0x2000) == 0 ? blogNoticeListUiState0.copy(blogInfo1, long1, flow1, noticeBottomSheet1, function03, dialogType1, function04, function11, function05, function33, function34, function35, function21, function40) : blogNoticeListUiState0.copy(blogInfo1, long1, flow1, noticeBottomSheet1, function03, dialogType1, function04, function11, function05, function33, function34, function35, function21, blogNoticeListUiState0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogNoticeListUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogNoticeListUiState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogNoticeListUiState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogNoticeListUiState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((BlogNoticeListUiState)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((BlogNoticeListUiState)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((BlogNoticeListUiState)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((BlogNoticeListUiState)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((BlogNoticeListUiState)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((BlogNoticeListUiState)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((BlogNoticeListUiState)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((BlogNoticeListUiState)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((BlogNoticeListUiState)object0).l)) {
            return false;
        }
        return Intrinsics.areEqual(this.m, ((BlogNoticeListUiState)object0).m) ? Intrinsics.areEqual(this.n, ((BlogNoticeListUiState)object0).n) : false;
    }

    @Nullable
    public final BlogInfo getBlogInfo() {
        return this.a;
    }

    @Nullable
    public final String getBlogName() {
        return this.o;
    }

    @Nullable
    public final NoticeBottomSheet getBottomSheet() {
        return this.d;
    }

    @NotNull
    public final Function1 getChangeBlogInfo() {
        return this.h;
    }

    @NotNull
    public final Function4 getChangeVisibility() {
        return this.n;
    }

    @Nullable
    public final Long getCurrentUserId() {
        return this.b;
    }

    @NotNull
    public final Function2 getDeleteNotice() {
        return this.m;
    }

    @Nullable
    public final DialogType getDialog() {
        return this.f;
    }

    @NotNull
    public final Function3 getGoStatistics() {
        return this.j;
    }

    @NotNull
    public final Function3 getModifyNotice() {
        return this.k;
    }

    @Nullable
    public final Flow getNoticeList() {
        return this.c;
    }

    @NotNull
    public final Function3 getOnClickNoticeDelete() {
        return this.l;
    }

    @NotNull
    public final Function0 getOnDismissBottomSheet() {
        return this.e;
    }

    @NotNull
    public final Function0 getOnDismissDialog() {
        return this.g;
    }

    @NotNull
    public final Function0 getRefresh() {
        return this.i;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.e, ((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F);
        DialogType dialogType0 = this.f;
        if(dialogType0 != null) {
            v = dialogType0.hashCode();
        }
        return this.n.hashCode() + (this.m.hashCode() + (this.l.hashCode() + (this.k.hashCode() + (this.j.hashCode() + a.a(this.i, b.a(this.h, a.a(this.g, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    public final boolean isMine() {
        return this.p;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogNoticeListUiState(blogInfo=" + this.a + ", currentUserId=" + this.b + ", noticeList=" + this.c + ", bottomSheet=" + this.d + ", onDismissBottomSheet=" + this.e + ", dialog=" + this.f + ", onDismissDialog=" + this.g + ", changeBlogInfo=" + this.h + ", refresh=" + this.i + ", goStatistics=" + this.j + ", modifyNotice=" + this.k + ", onClickNoticeDelete=" + this.l + ", deleteNotice=" + this.m + ", changeVisibility=" + this.n + ")";
    }
}

