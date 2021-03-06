package com.thoughtworks.corejava.numbers;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.ByteBuffer;

/**
 *
 * Create hexadecimal numbers from long types
 */
public class CreateHexadecimalNumbers {

    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }

    public static String createHexNum(long sequenceNumber){
        String hexString = Hex.encodeHexString(longToBytes(sequenceNumber));
        //Removing leading zeros
        return hexString.substring(0,16);
    }

    public static long decodeHexNum(String hexString) throws DecoderException{
        byte[] bytes = Hex.decodeHex(hexString.toCharArray());
        return bytesToLong(bytes);
    }

    public static long bytesToLong(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.put(bytes);
        buffer.flip();//need flip
        return buffer.getLong();
    }


    public static void main(String[] args) throws DecoderException{
        //Checking for boundary conditions
        long LONG_MAX = Long.MAX_VALUE;
        System.out.println("Input Number :: " + LONG_MAX);
        System.out.println("HexString : "+createHexNum(LONG_MAX) + " :: HexNum : " +decodeHexNum(createHexNum(LONG_MAX)));
        //Checking for numbers from 0 to 15
        for(int i =0 ;i <17;i++){
            System.out.println("HexString : "+createHexNum(i) + " :: HexNum : " +decodeHexNum(createHexNum(i)));
        }
    }
}
