package variables;

public class JavaVariables {
    public static void main(String[] args) {
        /*
        * byte  - 1byte  - whole numbers-128 to 127
        * short - 2bytes - whole numbers -32,768 to 32,767
        * int   - 3bytes - whole numbers -2,147,483,648 to 2,147,483,647
        * long  - 4bytes - whole numbers -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        *
        * float  - 4bytes - fractional numbers 6 to 7 decimal digits
        * double - 8bytes - fractional numbers 15 decimal digits
        *
        * boolean - 1bit   - stores 1 or 0 binary
        * char    - 2bytes - stores a unique character from 1bytes to 2bytes
        *
        * */

        byte  myByte  = 127;
        short myShort = 32767;
        int   myInt   = 2147483647;
        long  myLong  = 9223372036854775807L;

        float myFloat = 0.0000001f;
        double myDouble = 0.000000000000001;

        boolean myBool = false;
        char myChar = 'a'; // 1 byte
        char myChar2 = 'á'; // 2 byte
    }
}
