package org.whispersystems.curve25519;

public class j {
    public static void a(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        int i10 = iArr2[9];
        int i11 = i * 2;
        int i12 = i2 * 2;
        int i13 = i3 * 2;
        int i14 = i4 * 2;
        int i15 = i5 * 2;
        int i16 = i6 * 2;
        int i17 = i8 * 2;
        int i18 = i7 * 19;
        int i19 = i8 * 38;
        int i20 = i9 * 19;
        int i21 = i10 * 38;
        long j = ((long) i) * ((long) i);
        long j2 = ((long) i11) * ((long) i2);
        long j3 = ((long) i11) * ((long) i3);
        long j4 = ((long) i11) * ((long) i4);
        long j5 = ((long) i11) * ((long) i5);
        long j6 = ((long) i11) * ((long) i6);
        long j7 = ((long) i11) * ((long) i7);
        long j8 = ((long) i11) * ((long) i8);
        long j9 = ((long) i11) * ((long) i9);
        long j10 = ((long) i11) * ((long) i10);
        long j11 = (long) i2;
        j11 *= (long) i12;
        long j12 = ((long) i12) * ((long) i3);
        long j13 = ((long) i12) * ((long) i14);
        long j14 = ((long) i12) * ((long) i5);
        long j15 = ((long) i12) * ((long) i16);
        long j16 = ((long) i12) * ((long) i7);
        long j17 = ((long) i12) * ((long) i17);
        long j18 = ((long) i12) * ((long) i9);
        long j19 = ((long) i12) * ((long) i21);
        long j20 = ((long) i3) * ((long) i3);
        long j21 = ((long) i13) * ((long) i4);
        long j22 = ((long) i13) * ((long) i5);
        long j23 = ((long) i13) * ((long) i6);
        long j24 = ((long) i13) * ((long) i7);
        long j25 = ((long) i13) * ((long) i8);
        long j26 = ((long) i13) * ((long) i20);
        long j27 = ((long) i3) * ((long) i21);
        long j28 = (long) i4;
        j28 *= (long) i14;
        long j29 = ((long) i14) * ((long) i5);
        long j30 = ((long) i14) * ((long) i16);
        long j31 = ((long) i14) * ((long) i7);
        long j32 = ((long) i14) * ((long) i19);
        long j33 = ((long) i14) * ((long) i20);
        long j34 = ((long) i14) * ((long) i21);
        long j35 = ((long) i5) * ((long) i5);
        long j36 = ((long) i15) * ((long) i6);
        long j37 = ((long) i15) * ((long) i18);
        long j38 = ((long) i5) * ((long) i19);
        long j39 = ((long) i15) * ((long) i20);
        long j40 = ((long) i5) * ((long) i21);
        long j41 = ((long) i6) * ((long) (i6 * 38));
        long j42 = ((long) i16) * ((long) i18);
        long j43 = ((long) i16) * ((long) i19);
        long j44 = ((long) i16) * ((long) i20);
        long j45 = ((long) i16) * ((long) i21);
        long j46 = (long) i18;
        j46 = r0 * ((long) i7);
        long j47 = ((long) i7) * ((long) i19);
        long j48 = ((long) i8) * ((long) i19);
        long j49 = ((long) i17) * ((long) i20);
        long j50 = (long) i20;
        j50 = r0 * ((long) i9);
        long j51 = (long) i9;
        long j52 = (long) i21;
        j41 += (((j19 + j) + j26) + j32) + j37;
        j48 += (j45 + ((j5 + j13) + j20)) + (((long) (i7 * 2)) * ((long) i20));
        j28 = ((j28 + ((j7 + j15) + j22)) + (((long) i17) * ((long) i21))) + j50;
        j50 = (33554432 + j41) >> 26;
        j19 = ((((j2 + j27) + j33) + j38) + j42) + j50;
        j41 -= j50 << 26;
        j50 = (33554432 + j48) >> 26;
        j45 = ((((j6 + j14) + j21) + (((long) i7) * ((long) i21))) + j49) + j50;
        j48 -= j50 << 26;
        j50 = (16777216 + j19) >> 25;
        j11 = (((((j11 + j3) + j34) + j39) + j43) + j46) + j50;
        j19 -= j50 << 25;
        j50 = (16777216 + j45) >> 25;
        j28 += j50;
        j45 -= j50 << 25;
        j50 = (33554432 + j11) >> 26;
        j34 = ((((j4 + j12) + j40) + j44) + j47) + j50;
        j11 -= j50 << 26;
        j50 = (33554432 + j28) >> 26;
        long j53 = ((((j8 + j16) + j23) + j29) + (r0 * r0)) + j50;
        j28 -= j50 << 26;
        j50 = (16777216 + j34) >> 25;
        j48 += j50;
        j34 -= j50 << 25;
        j50 = (16777216 + j53) >> 25;
        long j54 = ((((long) i10) * ((long) i21)) + ((((j9 + j17) + j24) + j30) + j35)) + j50;
        j53 -= j50 << 25;
        j50 = (33554432 + j48) >> 26;
        j45 += j50;
        j48 -= j50 << 26;
        j50 = (33554432 + j54) >> 26;
        j46 = ((((j10 + j18) + j25) + j31) + j36) + j50;
        j54 -= j50 << 26;
        j50 = (16777216 + j46) >> 25;
        j41 += 19 * j50;
        j46 -= j50 << 25;
        j50 = (33554432 + j41) >> 26;
        j19 += j50;
        iArr[0] = (int) (j41 - (j50 << 26));
        iArr[1] = (int) j19;
        iArr[2] = (int) j11;
        iArr[3] = (int) j34;
        iArr[4] = (int) j48;
        iArr[5] = (int) j45;
        iArr[6] = (int) j28;
        iArr[7] = (int) j53;
        iArr[8] = (int) j54;
        iArr[9] = (int) j46;
    }
}