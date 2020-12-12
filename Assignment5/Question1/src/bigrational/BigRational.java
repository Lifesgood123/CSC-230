package bigrational;

import java.math.BigInteger;

/**
 * This class represents rational numbers. A rational number stores a numerator
 * and denominator, and we will use BigIntegers to represent the numerator and
 * denominator. Thus our class will be aptly named BigRational
 *
 * Following concepts haven used. public static final constants use of an
 * existing class, namely BigInteger (composition) multiple constructors
 * throwing exceptions implementing a set of accessors implementing equals and
 * toString
 */
public class BigRational implements Comparable<BigRational>{

    /**
     *
     */
    public static final BigRational ZERO = new BigRational();

    /**
     *
     */
    public static final BigRational ONE = new BigRational("1");

    private BigInteger num; // only this can be nagative
    private BigInteger den; // never negative

    /**
     *
     */
    public BigRational() {
        this(BigInteger.ZERO);
    }

    /**
     *
     * @param n
     */
    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    /**
     *
     * @param num
     * @param den
     */
    public BigRational(BigInteger num, BigInteger den) {
        this.num = num;
        this.den = den;
        fixSigns();
        reduce();
    }
    
    /**
     *
     * @param num
     * @param den
     */
    public BigRational(int num, int den){
        this(BigInteger.valueOf(num), BigInteger.valueOf(den));
    }

    /**
     *
     * @param str
     */
    public BigRational(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("empty string");
        }

        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {
            num = new BigInteger(str.trim());
            den = BigInteger.ONE; // den = 1
        } else {
            num = new BigInteger(str.substring(0, slashIndex).trim());
            den = new BigInteger(str.substring(slashIndex + 1).trim());
            fixSigns();
            reduce();
        }
    }

    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        if(num.compareTo(BigInteger.ZERO) == 0 && den.compareTo(BigInteger.ZERO) == 0){
            return;
        }
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);

    }

    /**
     *
     * @return absoluteValue
     */
    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }

    /**
     *
     * @return
     */
    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }

    /**
     *
     * @param other
     * @return
     */
    public BigRational add(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den).add(other.num.multiply(this.den));
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }

    /**
     *
     * @param other
     * @return
     */
    public BigRational subtract(BigRational other) {
        return add(other.negate());
    }
    
    /**
     *
     * @param exp
     * @return
     */
    public BigRational pow(int exp){
        return new BigRational(this.num.pow(exp), this.num.pow(exp));
    }
    
    /**
     *
     * @return
     */
    public BigRational reciprocal(){
        return new BigRational(this.den, this.num);
    }

    /**
     *
     * @param other
     * @return
     */
    public BigRational multiply(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.num);
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }
    
    /**
     *
     * @return
     */
    public BigInteger toBigInteger(){
        if(this.den != BigInteger.valueOf(1)){
            throw new ArithmeticException("Denominator is not 1");
        } else {
            return this.num;
        }
    }
    
    /**
     *
     * @return
     */
    public int toInteger(){
        return this.toBigInteger().intValue();
    }

    /**
     *
     * @param other
     * @return 
     */
    public BigRational divide(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den);
        BigInteger newDenominator = this.den.multiply(other.num);
        return new BigRational(newNumerator, newDenominator);
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof BigRational) {
            BigRational rhs = ((BigRational) other);
            return num.equals(rhs.num) && den.equals(((BigRational) other).den);
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (den.equals(BigInteger.ZERO)) {
            if(num.compareTo(BigInteger.ZERO) == 0) return "Indeterminate";
            if (num.compareTo(BigInteger.ZERO) < 0) {
                return "-Infinity";
            } else {
                return "Infinity";
            }
        }
        if (den.equals(BigInteger.ONE)) {
            return num.toString();
        } else {
            return num + " / " + den;
        }
    }

    /**
     *
     * @param br
     * @return
     */
    @Override
    public int compareTo(BigRational br){
        if(this.den.compareTo(br.den) == 0){
            return this.num.subtract(br.num).intValue();
        }
        return (this.num.multiply(br.den).subtract(br.num.multiply(this.den))).intValue();
    }
}
